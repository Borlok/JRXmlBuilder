package com.borlok.talpareport;

public abstract class JRXmlAbstractBandSettingBuilder<T> {
    protected T parentElement;

    public JRXmlAbstractBandSettingBuilder(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandSetting<T> builder();
}
