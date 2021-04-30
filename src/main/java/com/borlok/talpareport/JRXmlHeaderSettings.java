package com.borlok.talpareport;

import net.sf.jasperreports.engine.type.OrientationEnum;
import net.sf.jasperreports.engine.type.PrintOrderEnum;
import net.sf.jasperreports.engine.type.WhenNoDataTypeEnum;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlHeaderSettings {
    private JRXml jrXml;

    public JRXmlHeaderSettings(JRXml jrXml) {
        this.jrXml = jrXml;
        try {
            jrXmlWriteHelper.writeProlog("UTF-8");
            jrXmlWriteHelper.startElement("jasperReport");
            jrXmlWriteHelper.addAttribute("xmlns", "http://jasperreports.sourceforge.net/jasperreports");
            jrXmlWriteHelper.addAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            jrXmlWriteHelper.addAttribute("xsi:schemaLocation", "http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd");
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
    }

    public JRXmlHeaderSettings addReportName(String reportName) {
        jrXmlWriteHelper.addAttribute("name", reportName);
        return this;
    }

    public JRXmlHeaderSettings addColumnCount(Integer columnCount) {
        jrXmlWriteHelper.addAttribute("columnCount", columnCount);
        return this;
    }

    public JRXmlHeaderSettings addPrintOrder(PrintOrderEnum printOrder) {
        jrXmlWriteHelper.addAttribute("printOrder", printOrder.getName());
        return this;
    }

    public JRXmlHeaderSettings addPageWidth(Integer pageWidth) {
        jrXmlWriteHelper.addAttribute("pageWidth", pageWidth);
        return this;
    }

    public JRXmlHeaderSettings addPageHeight(Integer pageHeight) {
        jrXmlWriteHelper.addAttribute("pageHeight", pageHeight);
        return this;
    }

    public JRXmlHeaderSettings addOrientation(OrientationEnum orientation) {
        jrXmlWriteHelper.addAttribute("orientation", orientation.getName());
        return this;
    }

    public JRXmlHeaderSettings addColumnWidth(Integer columnWidth) {
        jrXmlWriteHelper.addAttribute("columnWidth", columnWidth);
        return this;
    }

    public JRXmlHeaderSettings addColumnSpacing(Integer columnSpacing) {
        jrXmlWriteHelper.addAttribute("columnSpacing", columnSpacing);
        return this;
    }


    public JRXmlHeaderSettings addLeftMargin(Integer leftMargin) {
        jrXmlWriteHelper.addAttribute("leftMargin", leftMargin);
        return this;
    }

    public JRXmlHeaderSettings addRightMargin(Integer rightMargin) {
        jrXmlWriteHelper.addAttribute("rightMargin", rightMargin);
        return this;
    }

    public JRXmlHeaderSettings addTopMargin(Integer topMargin) {
        jrXmlWriteHelper.addAttribute("topMargin", topMargin);
        return this;
    }

    public JRXmlHeaderSettings addBottomMargin(Integer bottomMargin) {
        jrXmlWriteHelper.addAttribute("bottomMargin", bottomMargin);
        return this;
    }

    public JRXmlHeaderSettings addWhenNoDataType(WhenNoDataTypeEnum whenNoDataType) {
        jrXmlWriteHelper.addAttribute("whenNoDataType", whenNoDataType.getName());
        return this;
    }

    public JRXmlHeaderSettings addIsTitleNewPage(boolean isTitleNewPage) {
        jrXmlWriteHelper.addAttribute("isTitleNewPage", isTitleNewPage);
        return this;
    }

    public JRXmlHeaderSettings addIsSummaryNewPage(boolean isSummaryNewPage) {
        jrXmlWriteHelper.addAttribute("isSummaryNewPage", isSummaryNewPage);
        return this;
    }

    public JRXmlHeaderSettings addIsSummaryWithPageHeaderAndFooter(boolean isSummaryWithPageHeaderAndFooter) {
        jrXmlWriteHelper.addAttribute("isSummaryWithPageHeaderAndFooter", isSummaryWithPageHeaderAndFooter);
        return this;
    }

    public JRXmlHeaderSettings addIsFloatColumnFooter(boolean isFloatColumnFooter) {
        jrXmlWriteHelper.addAttribute("isFloatColumnFooter", isFloatColumnFooter);
        return this;
    }

    public JRXml build() {
        return jrXml;
    }
}
