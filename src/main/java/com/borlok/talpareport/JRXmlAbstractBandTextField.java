package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextField<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextField(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldSettingBuilder<? extends JRXmlAbstractBandTextField<T>> addTextFieldSettingBuilder();
    public abstract JRXmlAbstractBandTextFieldReportElementBuilder<? extends JRXmlAbstractBandTextField<T>> addReportElementBuilder();
    public abstract JRXmlAbstractBandTextFieldBoxBuilder<? extends JRXmlAbstractBandTextField<T>> addBoxBuilder();
    public abstract JRXmlAbstractBandTextFieldTextElementBuilder<? extends JRXmlAbstractBandTextField<T>> addTextElementBuilder();
    public abstract JRXmlAbstractBandTextFieldTextFieldExpressionBuilder<? extends JRXmlAbstractBandTextField<T>> addTextFieldExpressionBuilder();

    public abstract T build();
}
