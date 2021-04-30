package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextFieldBuilder<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldBuilder(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextField<T> builder();
}
