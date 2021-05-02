package com.borlok.talpareport;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public abstract class JRXmlAbstractBand<T> {
    protected T parentElement;

    public JRXmlAbstractBand(T parentElement) {
        this.parentElement = parentElement;
        jrXmlWriteHelper.startElement("band");
    }
    public abstract JRXmlAbstractBandSettingBuilder<? extends JRXmlAbstractBand<T>> addBandSetting();
    public abstract JRXmlAbstractBandTextFieldBuilder<? extends JRXmlAbstractBand<T>> addTextField();
    public abstract T build();
}
