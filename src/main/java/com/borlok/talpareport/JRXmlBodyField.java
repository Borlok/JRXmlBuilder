package com.borlok.talpareport;

public abstract class JRXmlBodyField<T> {
    protected T parentElement;

    public JRXmlBodyField(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandBuilder<JRXmlBodyField<JRXml>> addBand();

    public abstract T build();
}
