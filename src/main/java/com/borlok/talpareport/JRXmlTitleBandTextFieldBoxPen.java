package com.borlok.talpareport;

import net.sf.jasperreports.engine.type.LineStyleEnum;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitleBandTextFieldBoxPen extends JRXmlAbstractBandTextFieldBoxPen<JRXmlTitleBandTextFieldBox> {

    public JRXmlTitleBandTextFieldBoxPen(JRXmlTitleBandTextFieldBox parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("pen");
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPen<JRXmlTitleBandTextFieldBox> addLineWidth(Double lineWidth) {
        jrXmlWriteHelper.addAttribute("lineWidth", lineWidth);
        return this;
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPen<JRXmlTitleBandTextFieldBox> addLineStyle(LineStyleEnum lineStyle) {
        jrXmlWriteHelper.addAttribute("lineStyle", lineStyle.getName());
        return this;
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPen<JRXmlTitleBandTextFieldBox> addLineColor(String lineColor) {
        jrXmlWriteHelper.addAttribute("lineColor", lineColor);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldBox build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }

}
