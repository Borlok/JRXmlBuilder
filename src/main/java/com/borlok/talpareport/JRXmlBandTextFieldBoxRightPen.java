package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlBandTextFieldBoxRightPen extends JRXmlAbstractBandTextFieldBoxPen<JRXmlBandTextFieldBox> {

    public JRXmlBandTextFieldBoxRightPen(JRXmlBandTextFieldBox parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("rightPen");
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
