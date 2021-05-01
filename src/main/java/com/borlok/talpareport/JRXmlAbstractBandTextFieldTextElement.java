package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextFieldTextElement<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldTextElement(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldTextElementSettingBuilder<? extends JRXmlAbstractBandTextFieldTextElement<T>> addTextElementSettingBuilder();
    public abstract JRXmlAbstractBandTextFieldTextElementFontBuilder<? extends JRXmlAbstractBandTextFieldTextElement<T>> addFontBuilder();
    public abstract JRXmlAbstractBandTextFieldTextElementParagraphBuilder<? extends JRXmlAbstractBandTextFieldTextElement<T>> addParagraphBuilder();

     public abstract T build();
}
