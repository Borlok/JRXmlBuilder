package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextFieldSettingBuilder<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldSettingBuilder(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldSetting<T> builder();
}
