package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextFieldBox<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldBox(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract T build();
}
