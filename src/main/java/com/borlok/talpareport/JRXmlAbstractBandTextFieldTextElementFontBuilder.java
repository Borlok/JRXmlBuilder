package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextFieldTextElementFontBuilder<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldTextElementFontBuilder(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldTextElementFont<T> builder();
}
