package com.borlok.talpareport;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public abstract class JRXmlAbstractBandTextFieldBox<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldBox(T parentElement) {
        this.parentElement = parentElement;
        jrXmlWriteHelper.startElement("box");
    }

    public abstract JRXmlAbstractBandTextFieldBoxSettingBuilder<? extends JRXmlAbstractBandTextFieldBox<T>> addBoxSetting();
    public abstract JRXmlAbstractBandTextFieldBoxPenBuilder<? extends JRXmlAbstractBandTextFieldBox<T>> addPen();
    public abstract JRXmlAbstractBandTextFieldBoxPenBuilder<? extends JRXmlAbstractBandTextFieldBox<T>> addRightPen();
    public abstract JRXmlAbstractBandTextFieldBoxPenBuilder<? extends JRXmlAbstractBandTextFieldBox<T>> addLeftPen();
    public abstract JRXmlAbstractBandTextFieldBoxPenBuilder<? extends JRXmlAbstractBandTextFieldBox<T>> addTopPen();
    public abstract JRXmlAbstractBandTextFieldBoxPenBuilder<? extends JRXmlAbstractBandTextFieldBox<T>> addBottomPen();

    public abstract T build();
}
