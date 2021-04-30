package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextFieldBoxSettingBuilder<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldBoxSettingBuilder(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldBoxSetting<T> builder();
}
