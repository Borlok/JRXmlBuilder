package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitleBandTextFieldTextElementFont extends JRXmlAbstractBandTextFieldTextElementFont<JRXmlTitleBandTextFieldTextElement> {

    public JRXmlTitleBandTextFieldTextElementFont(JRXmlTitleBandTextFieldTextElement parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("font");
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
