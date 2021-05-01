package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlColumnHeaderBandTextFieldBoxPen extends JRXmlAbstractBandTextFieldBoxPen<JRXmlColumnHeaderBandTextFieldBox> {

    public JRXmlColumnHeaderBandTextFieldBoxPen(JRXmlColumnHeaderBandTextFieldBox parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("pen");
    }

    @Override
    public JRXmlColumnHeaderBandTextFieldBox build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
