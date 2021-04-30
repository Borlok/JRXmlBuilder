package com.borlok.talpareport;

public abstract class JRXmlAbstractTextElementFontBuilder<T> {
    protected T parentElement;

    public JRXmlAbstractTextElementFontBuilder(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldSetting<T> builder();
}
