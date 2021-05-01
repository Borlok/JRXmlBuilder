package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlColumnHeaderBandTextFieldBoxLeftPen extends JRXmlAbstractBandTextFieldBoxPen<JRXmlColumnHeaderBandTextFieldBox> {

    public JRXmlColumnHeaderBandTextFieldBoxLeftPen(JRXmlColumnHeaderBandTextFieldBox parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("leftPen");
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
