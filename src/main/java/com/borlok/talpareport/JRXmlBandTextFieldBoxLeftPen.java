package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlBandTextFieldBoxLeftPen extends JRXmlAbstractBandTextFieldBoxPen<JRXmlBandTextFieldBox> {

    public JRXmlBandTextFieldBoxLeftPen(JRXmlBandTextFieldBox parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("leftPen");
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
