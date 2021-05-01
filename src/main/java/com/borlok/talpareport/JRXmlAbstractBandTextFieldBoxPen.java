package com.borlok.talpareport;

import net.sf.jasperreports.engine.type.LineStyleEnum;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public abstract class JRXmlAbstractBandTextFieldBoxPen<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldBoxPen(T parentElement) {
        this.parentElement = parentElement;
    }

    public JRXmlAbstractBandTextFieldBoxPen<T> addLineWidth(Double lineWidth) {
        jrXmlWriteHelper.addAttribute("lineWidth", lineWidth);
        return this;
    }

    public JRXmlAbstractBandTextFieldBoxPen<T> addLineStyle(LineStyleEnum lineStyle) {
        jrXmlWriteHelper.addAttribute("lineStyle", lineStyle.getName());
        return this;
    }

    public JRXmlAbstractBandTextFieldBoxPen<T> addLineColor(String lineColor) {
        jrXmlWriteHelper.addAttribute("lineColor", lineColor);
        return this;
    }
    public abstract T build();
}
