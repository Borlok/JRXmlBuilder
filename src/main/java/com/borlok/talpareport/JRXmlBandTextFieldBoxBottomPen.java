package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlBandTextFieldBoxBottomPen extends JRXmlAbstractBandTextFieldBoxPen<JRXmlBandTextFieldBox> {


    public JRXmlBandTextFieldBoxBottomPen(JRXmlBandTextFieldBox parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("bottomPen");
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
