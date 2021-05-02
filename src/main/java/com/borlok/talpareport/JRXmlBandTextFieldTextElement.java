package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlBandTextFieldTextElement extends JRXmlAbstractBandTextFieldTextElement<JRXmlBandTextField> {

    public JRXmlBandTextFieldTextElement(JRXmlBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementSettingBuilder<JRXmlBandTextFieldTextElement> addTextElementSetting() {
        return new JRXmlBandTextFieldTextElementSettingBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementFontBuilder<JRXmlBandTextFieldTextElement> addFont() {
        return new JRXmlBandTextFieldTextElementFontBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementParagraphBuilder<JRXmlBandTextFieldTextElement> addParagraph() {
        return new JRXmlBandTextFieldTextElementParagraphBuilder(this);
    }

    @Override
    public JRXmlBandTextField build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
