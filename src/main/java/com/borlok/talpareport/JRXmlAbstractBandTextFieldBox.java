package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextFieldBox<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldBox(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldBoxSettingBuilder<? extends JRXmlAbstractBandTextFieldBox<T>> addBoxSettingBuilder();
    public abstract JRXmlAbstractBandTextFieldBoxPenBuilder<? extends JRXmlAbstractBandTextFieldBox<T>> addBoxPenBuilder();
    public abstract JRXmlAbstractBandTextFieldBoxPenBuilder<? extends JRXmlAbstractBandTextFieldBox<T>> addBoxRightPenBuilder();
    public abstract JRXmlAbstractBandTextFieldBoxPenBuilder<? extends JRXmlAbstractBandTextFieldBox<T>> addBoxLeftPenBuilder();
    public abstract JRXmlAbstractBandTextFieldBoxPenBuilder<? extends JRXmlAbstractBandTextFieldBox<T>> addBoxTopPenBuilder();
    public abstract JRXmlAbstractBandTextFieldBoxPenBuilder<? extends JRXmlAbstractBandTextFieldBox<T>> addBoxBottomPenBuilder();

    public abstract T build();
}
