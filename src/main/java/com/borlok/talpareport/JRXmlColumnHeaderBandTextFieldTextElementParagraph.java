package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlColumnHeaderBandTextFieldTextElementParagraph extends JRXmlAbstractBandTextFieldTextElementParagraph<JRXmlColumnHeaderBandTextFieldTextElement> {

    public JRXmlColumnHeaderBandTextFieldTextElementParagraph(JRXmlColumnHeaderBandTextFieldTextElement parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlColumnHeaderBandTextFieldTextElement build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
