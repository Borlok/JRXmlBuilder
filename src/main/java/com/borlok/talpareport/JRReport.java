package com.borlok.talpareport;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.swing.JRViewerToolbar;
import net.sf.jasperreports.view.JRSaveContributor;
import net.sf.jasperreports.view.save.JRPdfSaveContributor;

import javax.swing.*;


public class JRReport extends JRViewer {

    public JRReport(JasperPrint jrPrint) {
        super(jrPrint);
    }

    @Override
    protected JRViewerToolbar createToolbar() {
        JRViewerToolbar toolbar = super.createToolbar();
        toolbar.setSaveContributors(
                new JRSaveContributor[]{
                        new JRPdfSaveContributor(super.getLocale(), null),
                        new JRXlsSaveContributor(super.getLocale(), null)
                });
        return toolbar;
    }

    public void createReport() {
        JFrame frame = new JFrame("Jasper report");
        frame.add(this);
        frame.setSize(this.getMaximumSize());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
