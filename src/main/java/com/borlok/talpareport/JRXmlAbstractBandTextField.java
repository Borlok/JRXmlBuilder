package com.borlok.talpareport;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public abstract class JRXmlAbstractBandTextField<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextField(T parentElement) {
        this.parentElement = parentElement;
        jrXmlWriteHelper.startElement("textField");
    }

    public abstract JRXmlAbstractBandTextFieldSettingBuilder<? extends JRXmlAbstractBandTextField<T>> addTextFieldSetting();
    public abstract JRXmlAbstractBandTextFieldReportElementBuilder<? extends JRXmlAbstractBandTextField<T>> addReportElement();
    public abstract JRXmlAbstractBandTextFieldBoxBuilder<? extends JRXmlAbstractBandTextField<T>> addBox();
    public abstract JRXmlAbstractBandTextFieldTextElementBuilder<? extends JRXmlAbstractBandTextField<T>> addTextElement();
    public abstract JRXmlAbstractBandTextFieldTextFieldExpressionBuilder<? extends JRXmlAbstractBandTextField<T>> addTextFieldExpression();

    public abstract T build();
}
