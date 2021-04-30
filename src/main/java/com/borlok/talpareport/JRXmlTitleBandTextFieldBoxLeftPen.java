package com.borlok.talpareport;

import net.sf.jasperreports.engine.type.LineStyleEnum;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitleBandTextFieldBoxLeftPen extends JRXmlAbstractBandTextFieldBoxPen<JRXmlTitleBandTextFieldBox> {

    public JRXmlTitleBandTextFieldBoxLeftPen(JRXmlTitleBandTextFieldBox parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("leftPen");
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
