package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextFieldSetting<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldSetting(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract T build();
}
