package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextFieldTextElementBuilder<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldTextElementBuilder(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldTextElement<T> builder();
}
