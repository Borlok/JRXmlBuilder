package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextFieldTextElementSettingBuilder<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldTextElementSettingBuilder(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldTextElementSetting<T> builder();
}
