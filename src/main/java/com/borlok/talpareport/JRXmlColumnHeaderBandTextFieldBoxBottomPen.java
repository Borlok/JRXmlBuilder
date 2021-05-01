package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlColumnHeaderBandTextFieldBoxBottomPen extends JRXmlAbstractBandTextFieldBoxPen<JRXmlColumnHeaderBandTextFieldBox> {

    public JRXmlColumnHeaderBandTextFieldBoxBottomPen(JRXmlColumnHeaderBandTextFieldBox parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("bottomPen");
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
