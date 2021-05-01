package com.borlok.talpareport;


import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitleBandTextFieldTextElementParagraph extends JRXmlAbstractBandTextFieldTextElementParagraph<JRXmlTitleBandTextFieldTextElement> {

    public JRXmlTitleBandTextFieldTextElementParagraph(JRXmlTitleBandTextFieldTextElement parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlTitleBandTextFieldTextElement build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
