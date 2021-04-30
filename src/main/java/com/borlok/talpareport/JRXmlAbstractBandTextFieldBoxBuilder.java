package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextFieldBoxBuilder<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldBoxBuilder(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldBox<T> builder();

}
