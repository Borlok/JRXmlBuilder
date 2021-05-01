package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlColumnHeaderBandTextFieldBoxRightPen extends JRXmlAbstractBandTextFieldBoxPen<JRXmlColumnHeaderBandTextFieldBox> {

    public JRXmlColumnHeaderBandTextFieldBoxRightPen(JRXmlColumnHeaderBandTextFieldBox parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("rightPen");
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
