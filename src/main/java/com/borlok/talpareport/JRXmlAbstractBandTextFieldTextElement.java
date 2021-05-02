package com.borlok.talpareport;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public abstract class JRXmlAbstractBandTextFieldTextElement<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldTextElement(T parentElement) {
        this.parentElement = parentElement;
        jrXmlWriteHelper.startElement("textElement");
    }

    public abstract JRXmlAbstractBandTextFieldTextElementSettingBuilder<? extends JRXmlAbstractBandTextFieldTextElement<T>> addTextElementSetting();
    public abstract JRXmlAbstractBandTextFieldTextElementFontBuilder<? extends JRXmlAbstractBandTextFieldTextElement<T>> addFont();
    public abstract JRXmlAbstractBandTextFieldTextElementParagraphBuilder<? extends JRXmlAbstractBandTextFieldTextElement<T>> addParagraph();

     public abstract T build();
}
