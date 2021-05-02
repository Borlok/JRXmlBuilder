package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlBandTextFieldBoxPen extends JRXmlAbstractBandTextFieldBoxPen<JRXmlBandTextFieldBox> {

    public JRXmlBandTextFieldBoxPen(JRXmlBandTextFieldBox parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("pen");

    }

    @Override
    public JRXmlBandTextFieldBox build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
