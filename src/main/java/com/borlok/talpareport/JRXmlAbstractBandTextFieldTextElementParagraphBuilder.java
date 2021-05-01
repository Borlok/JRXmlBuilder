package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextFieldTextElementParagraphBuilder<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldTextElementParagraphBuilder(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldTextElementParagraph<T> builder();
}
