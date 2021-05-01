package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlColumnHeaderBandTextFieldTextElement extends JRXmlAbstractBandTextFieldTextElement<JRXmlColumnHeaderBandTextField> {

    public JRXmlColumnHeaderBandTextFieldTextElement(JRXmlColumnHeaderBandTextField parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("textElement");
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementSettingBuilder<JRXmlColumnHeaderBandTextFieldTextElement> addTextElementSettingBuilder() {
        return new JRXmlColumnHeaderBandTextFieldTextElementSettingBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementFontBuilder<JRXmlColumnHeaderBandTextFieldTextElement> addFontBuilder() {
        return new JRXmlColumnHeaderBandTextFieldTextElementFontBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementParagraphBuilder<JRXmlColumnHeaderBandTextFieldTextElement> addParagraphBuilder() {
        return new JRXmlColumnHeaderBandTextFieldTextElementParagraphBuilder(this);
    }

    @Override
    public JRXmlColumnHeaderBandTextField build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
