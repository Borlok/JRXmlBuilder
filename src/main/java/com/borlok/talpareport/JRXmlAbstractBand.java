package com.borlok.talpareport;

public abstract class JRXmlAbstractBand<T> {
    protected T parentElement;

    public JRXmlAbstractBand(T parentElement) {
        this.parentElement = parentElement;
    }
    public abstract JRXmlAbstractBandSettingBuilder<? extends JRXmlAbstractBand<T>> addBandSettingBuilder();
    public abstract JRXmlAbstractBandTextFieldBuilder<? extends JRXmlAbstractBand<T>> addTextFieldBuilder();
    public abstract T build();
}
