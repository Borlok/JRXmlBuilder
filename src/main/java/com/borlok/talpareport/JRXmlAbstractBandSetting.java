package com.borlok.talpareport;

public abstract class JRXmlAbstractBandSetting<T> {
    protected T parentElement;

    public JRXmlAbstractBandSetting(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract T build();
}
