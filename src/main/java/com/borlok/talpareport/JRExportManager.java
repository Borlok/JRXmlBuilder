package com.borlok.talpareport;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;

import java.io.ByteArrayOutputStream;

public class JRExportManager {

    public static byte[] exportReportToPdf(JasperPrint jasperPrint) {
        try {
            return JasperExportManager.exportReportToPdf(jasperPrint);
        } catch (JRException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }

    public static byte[] exportReportToXls(JasperPrint jasperPrint) {
        try {
            return createXls(jasperPrint);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new byte[0];
    }

    private static byte[] createXls(JasperPrint jasperPrint) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            JRXlsxExporter xlsExporter = new JRXlsxExporter();
            xlsExporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            xlsExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(byteArrayOutputStream));

            SimpleXlsxReportConfiguration configuration = new SimpleXlsxReportConfiguration();
            configuration.setOnePagePerSheet(true);
            configuration.setRemoveEmptySpaceBetweenRows(true);
            configuration.setRemoveEmptySpaceBetweenColumns(true);

            xlsExporter.setConfiguration(configuration);
            xlsExporter.exportReport();
            return byteArrayOutputStream.toByteArray();
        } catch (JRException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }
}
