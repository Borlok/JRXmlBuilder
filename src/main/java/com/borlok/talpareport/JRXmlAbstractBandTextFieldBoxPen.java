package com.borlok.talpareport;

import net.sf.jasperreports.engine.type.LineStyleEnum;

public abstract class JRXmlAbstractBandTextFieldBoxPen<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldBoxPen(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldBoxPen<T> addLineWidth(Double lineWidth);
    public abstract JRXmlAbstractBandTextFieldBoxPen<T> addLineStyle(LineStyleEnum lineStyle);
    public abstract JRXmlAbstractBandTextFieldBoxPen<T> addLineColor(String lineColor);

    public abstract T build();
}
