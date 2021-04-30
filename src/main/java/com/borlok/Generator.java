package com.borlok;

import java.io.*;
import java.util.*;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRXmlWriteHelper;

import javax.swing.*;


public class Generator {

    String pathForPattern = "report.jrxml";
    String pathToPattern = "testReport.jrxml";
    String pathJasper = "testReport.jasper";

    public void create() throws JRException, ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, FileNotFoundException {
        File reportPattern = new File(pathForPattern);
        File to = new File(pathToPattern);
        File pathToJasper = new File(pathJasper);

        JRBeanCollectionDataSource beanColDataSource =
                new JRBeanCollectionDataSource(new DAOStub().getDataBeanList());

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("TITLE", "Java");
        parameters.put("NAME", "Имя");
        parameters.put("DISCIPLINE", "Предмет");
        parameters.put("ABSENCE", "Отсутствия");

        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        try {
        JRXmlWriteHelper helper = new JRXmlWriteHelper(new FileWriter(to));
            helper.writeCDATA("$P{NAME}");
            helper.getUnderlyingWriter().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        JRXmlBuilder.builder()
//                .setPathForJRXlmSave(pathToPattern)
//                .addHeaderBuilder().builder()
//                                    .addReportName("Talpa")
//                                    .addColumnCount(3)
//                                    .addLeftMargin(20)
//                                    .addRightMargin(10)
//                                    .addTopMargin(10)
//                                    .addBottomMargin(10)
//                                    .addColumnWidth(178)
//                                    .addColumnSpacing(5)
//                                    .build()
//                .addStyleBuilder().builder()
//                                    .addName("Default")
//                                    .addIsDefault(true)
//                                    .build()
//                .addParameter("NAME", String.class)
//                .addField("name", String.class)
//                .addTitleBuilder().builder()
//                                    .addBandBuilder().builder()
//                .build()
//                .build()
//                .build();


//        JasperDesign jasperDesign = JRXmlLoader.load(reportPattern);
//        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
//        JasperPrint jasperPrint =  JasperFillManager.fillReport(jasperReport,parameters,beanColDataSource);
//
//        JRReport jrReport = new JRReport(jasperPrint);
//        jrReport.createReport();

    }

    public static void main(String[] args) {
        System.out.println("Начало генерации отчёта");
        try {
            new Generator().create();
            System.out.println("Генерация отчёта завершена");
        } catch (Exception e) {
            System.out.println("Во время генерации возникла ошибка: " + e);
        }
    }
}
