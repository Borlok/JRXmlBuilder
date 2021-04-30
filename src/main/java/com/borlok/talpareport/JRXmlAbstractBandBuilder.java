package com.borlok.talpareport;

public abstract class JRXmlAbstractBandBuilder<T> {
    protected T parentElement;

    public JRXmlAbstractBandBuilder(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBand<T> builder();
}
