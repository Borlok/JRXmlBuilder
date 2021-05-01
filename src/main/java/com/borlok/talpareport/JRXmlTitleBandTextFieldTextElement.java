package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitleBandTextFieldTextElement extends JRXmlAbstractBandTextFieldTextElement<JRXmlTitleBandTextField> {

    public JRXmlTitleBandTextFieldTextElement(JRXmlTitleBandTextField parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("textElement");
    }

    public JRXmlAbstractBandTextFieldTextElementSettingBuilder<JRXmlTitleBandTextFieldTextElement> addTextElementSettingBuilder() {
        return new JRXmlTitleBandTextFieldTextElementSettingBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementFontBuilder<JRXmlTitleBandTextFieldTextElement> addFontBuilder() {
        return new JRXmlTitleBandTextFieldTextElementFontBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementParagraphBuilder<JRXmlTitleBandTextFieldTextElement> addParagraphBuilder() {
        return new JRXmlTitleBandTextFieldTextElementParagraphBuilder(this);
    }


    @Override
    public JRXmlTitleBandTextField build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
