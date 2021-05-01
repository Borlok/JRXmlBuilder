package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitleBandTextFieldBoxLeftPen extends JRXmlAbstractBandTextFieldBoxPen<JRXmlTitleBandTextFieldBox> {

    public JRXmlTitleBandTextFieldBoxLeftPen(JRXmlTitleBandTextFieldBox parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("leftPen");
    }

    @Override
    public JRXmlTitleBandTextFieldBox build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
