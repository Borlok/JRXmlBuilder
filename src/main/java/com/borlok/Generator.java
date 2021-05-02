package com.borlok;

import java.io.*;
import java.util.*;

import com.borlok.talpareport.JRXmlBuilder;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.type.HorizontalTextAlignEnum;
import net.sf.jasperreports.engine.type.ModeEnum;
import net.sf.jasperreports.engine.type.SplitTypeEnum;

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

        Map<String, Class<?>> parametersMap = new HashMap<>();
        parametersMap.put("TITLE", String.class);
        parametersMap.put("NAME", String.class);
        parametersMap.put("DISCIPLINE", String.class);
        parametersMap.put("ABSENCE", String.class);

        Map<String, Class<?>> fieldsMap = new HashMap<>();
        fieldsMap.put("name", String.class);
        fieldsMap.put("discipline", String.class);
        fieldsMap.put("absence", Integer.class);

        JRXmlBuilder.builder()
                .setPathForJRXlmSave(pathToPattern)
                .addHeader().builder()
                .addReportName("Talpa")
                .addColumnCount(3)
                .addLeftMargin(20)
                .addRightMargin(10)
                .addTopMargin(10)
                .addBottomMargin(10)
                .addColumnWidth(178)
                .addColumnSpacing(5)
                .build()
                .addStyle().builder()
                .addName("Default")
                .addIsDefault(true)
                .build()
                .addParameters(parametersMap)
                .addFields(fieldsMap)
                .addTitle().builder()
                    .addBand().builder()
                        .addBandSetting().builder().addHeight(20).build()
                        .addTextField().builder()
                            .addReportElement().builder().addX(0).addY(0).addWidth(555).addHeight(20)
                            .build()
                            .addTextElement().builder()
                                .addTextElementSetting().builder().addTextAlignment(HorizontalTextAlignEnum.CENTER).build()
                            .build()
                            .addTextFieldExpression().builder().addCDATAParameter("TITLE").build()
                        .build()
                    .build()
                .build()

                .addColumnHeader().builder()
                .addBand().builder().addBandSetting().builder().addHeight(20).build()

                .addTextField().builder()
                .addReportElement().builder().addMode(ModeEnum.OPAQUE).addBackcolor("#F8F8F8").addX(0).addY(0).addWidth(555).addHeight(20).build()
                .addTextElement().builder().addFont().builder().addIsBold(true).build().build()
                .addTextFieldExpression().builder().addCDATAParameter("NAME").build()
                .build()

                .addTextField().builder()
                .addReportElement().builder().addMode(ModeEnum.OPAQUE).addBackcolor("#F8F8F8").addX(183).addY(0).addWidth(555).addHeight(20).build()
                .addTextElement().builder().addFont().builder().addIsBold(true).build().build()
                .addTextFieldExpression().builder().addCDATAParameter("DISCIPLINE").build()
                .build()

                .addTextField().builder()
                .addReportElement().builder().addMode(ModeEnum.OPAQUE).addBackcolor("#F8F8F8").addX(366).addY(0).addWidth(555).addHeight(20).build()
                .addTextElement().builder().addFont().builder().addIsBold(true).build().build()
                .addTextFieldExpression().builder().addCDATAParameter("ABSENCE").build()
                .build()

                .build()
                .build()

                .addDetail().builder()
                .addBand().builder()
                .addBandSetting().builder().addHeight(20).addSplitType(SplitTypeEnum.STRETCH).build()
                .addTextField().builder()
                .addReportElement().builder().addX(183).addY(0).addWidth(183).addHeight(20).build()
                .addBox().builder()
                .addPen().builder().addLineWidth(1).build()
                .build()
                .addTextElement().builder().addTextElementSetting().builder().addTextAlignment(HorizontalTextAlignEnum.CENTER).build()
                .build()
                .addTextFieldExpression().builder().addCDATAField("discipline").build()
                .build()
                .addTextField().builder()
                .addReportElement().builder().addX(0).addY(0).addWidth(183).addHeight(20).build()
                .addBox().builder()
                .addPen().builder().addLineWidth(1.0).build()
                .build()
                .addTextElement().builder().addTextElementSetting().builder().addTextAlignment(HorizontalTextAlignEnum.CENTER).build()
                .build()
                .addTextFieldExpression().builder().addCDATAField("name").build()
                .build()
                .addTextField().builder()
                .addReportElement().builder().addX(366).addY(0).addWidth(183).addHeight(20).build()
                .addBox().builder()
                .addPen().builder().addLineWidth(1).build()
                .build()
                .addTextElement().builder().addTextElementSetting().builder().addTextAlignment(HorizontalTextAlignEnum.CENTER).build()
                .build()
                .addTextFieldExpression().builder().addCDATAField("absence").build()
                .build()
                .build()
                .build()

                .build();



//        JasperDesign jasperDesign = JRXmlLoader.load(to);
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
