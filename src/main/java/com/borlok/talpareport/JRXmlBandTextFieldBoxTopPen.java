package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlBandTextFieldBoxTopPen extends JRXmlAbstractBandTextFieldBoxPen<JRXmlBandTextFieldBox> {

    public JRXmlBandTextFieldBoxTopPen(JRXmlBandTextFieldBox parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("topPen");
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
