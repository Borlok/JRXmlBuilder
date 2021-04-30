package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextFieldReportElementBuilder<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldReportElementBuilder(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldReportElement<T> builder();
}
