package com.borlok;

import java.io.*;
import java.util.*;

import com.borlok.talpareport.JRXmlBuilder;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.type.HorizontalTextAlignEnum;
import net.sf.jasperreports.engine.type.ModeEnum;
import net.sf.jasperreports.engine.type.VerticalTextAlignEnum;

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

        JRXmlBuilder.builder()
                .setPathForJRXlmSave(pathToPattern)
                                .addHeaderBuilder().builder()
                                                .addReportName("Talpa")
                                                .addColumnCount(3)
                                                .addLeftMargin(20)
                                                .addRightMargin(10)
                                                .addTopMargin(10)
                                                .addBottomMargin(10)
                                                .addColumnWidth(178)
                                                .addColumnSpacing(5)
                                .build()
                                .addStyleBuilder().builder()
                                                .addName("Default")
                                                .addIsDefault(true)
                                .build()
                .addParameter("TITLE", String.class)
                .addParameter("NAME", String.class)
                .addParameter("DISCIPLINE", String.class)
                .addParameter("ABSENCE", Integer.class)
                .addField("name", String.class)
                .addField("discipline", String.class)
                .addField("absence", Integer.class)
                .addTitleBuilder().builder()
                                .addBandBuilder().builder()
                                                .addBandSettingBuilder().builder()
                                                .build()
                                                .addTextFieldBuilder().builder()
                                                                .addReportElementBuilder().builder()
                                                                                .addX(0).addY(0).addWidth(555).addHeight(20)
                                                                .build()
                                                                .addTextElementBuilder().builder()
                                                                                .addTextElementSettingBuilder().builder()
                                                                                .addTextAlignment(HorizontalTextAlignEnum.CENTER)
                                                                .build()
                                                .build()
                                                .addTextFieldExpressionBuilder().builder()
                                                                .addCDATAParameter("TITLE")
                                                .build()
                                .build()
               .build()
                .build()
                .addColumnHeaderBuilder().builder()
                .addBandBuilder().builder()
                .addBandSettingBuilder().builder()
                .addHeight(20)
                .build()
                .addTextFieldBuilder().builder()
                .addReportElementBuilder().builder().addX(0).addY(0).addMode(ModeEnum.OPAQUE).addWidth(183).addHeight(20)
                .addBackcolor("#f8f8f8").build()
                .addBoxBuilder().builder()
                .addBoxPenBuilder().builder()
                .addLineWidth(1).build().build()
                .addTextElementBuilder().builder()
                .addTextElementSettingBuilder().builder()
                .addTextAlignment(HorizontalTextAlignEnum.CENTER)
                .addVerticalAlignment(VerticalTextAlignEnum.MIDDLE).build()
                .addFontBuilder().builder()
                .addIsBold(true).build()
                .build()
                .addTextFieldExpressionBuilder().builder()
                .addCDATAParameter("NAME").build()
                .build()
                .build()
                .build()
                .build();

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
