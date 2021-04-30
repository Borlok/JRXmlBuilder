package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextFieldBoxPenBuilder<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldBoxPenBuilder(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldBoxPen<T> builder();
}
