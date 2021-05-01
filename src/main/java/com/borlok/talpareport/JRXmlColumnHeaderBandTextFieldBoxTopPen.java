package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlColumnHeaderBandTextFieldBoxTopPen extends JRXmlAbstractBandTextFieldBoxPen<JRXmlColumnHeaderBandTextFieldBox> {

    public JRXmlColumnHeaderBandTextFieldBoxTopPen(JRXmlColumnHeaderBandTextFieldBox parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("topPen");
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
