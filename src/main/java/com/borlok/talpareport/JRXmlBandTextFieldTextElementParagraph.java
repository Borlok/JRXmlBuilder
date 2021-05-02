package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlBandTextFieldTextElementParagraph extends JRXmlAbstractBandTextFieldTextElementParagraph<JRXmlBandTextFieldTextElement> {

    public JRXmlBandTextFieldTextElementParagraph(JRXmlBandTextFieldTextElement parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlBandTextFieldTextElement build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
