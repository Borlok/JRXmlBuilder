package com.borlok.talpareport;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;
import net.sf.jasperreports.view.JRSaveContributor;

import javax.swing.*;
import java.io.File;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class JRXlsSaveContributor extends JRSaveContributor {


    public JRXlsSaveContributor(Locale locale, ResourceBundle resBundle) {
        super(locale, resBundle);
    }

    @Override
    public void save(JasperPrint jasperPrint, File file) throws JRException {
        if (!file.getName().toLowerCase().endsWith(".xls")) {
            file = new File(file.getAbsolutePath() + ".xls");
        }

        if (!file.exists() || 0 == JOptionPane.showConfirmDialog(null, MessageFormat.format(this.getBundleString("file.exists"), file.getName()), this.getBundleString("save"), JOptionPane.OK_CANCEL_OPTION)) {
            JRXlsxExporter xlsExporter = new JRXlsxExporter();
            xlsExporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            xlsExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(file));
            SimpleXlsxReportConfiguration configuration = new SimpleXlsxReportConfiguration();
            configuration.setOnePagePerSheet(true);
            configuration.setRemoveEmptySpaceBetweenRows(true);
            configuration.setRemoveEmptySpaceBetweenColumns(true);
            xlsExporter.setConfiguration(configuration);
            xlsExporter.exportReport();
        }
    }

    @Override
    public boolean accept(File file) {
        return file.isDirectory() || file.getName().toLowerCase().endsWith(".xls");
    }

    @Override
    public String getDescription() {
        return "Excel (*.xls)";
    }
}
