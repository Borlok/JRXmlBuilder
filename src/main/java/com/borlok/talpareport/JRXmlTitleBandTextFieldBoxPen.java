package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitleBandTextFieldBoxPen extends JRXmlAbstractBandTextFieldBoxPen<JRXmlTitleBandTextFieldBox> {

    public JRXmlTitleBandTextFieldBoxPen(JRXmlTitleBandTextFieldBox parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("pen");
    }

    @Override
    public JRXmlTitleBandTextFieldBox build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }

}
