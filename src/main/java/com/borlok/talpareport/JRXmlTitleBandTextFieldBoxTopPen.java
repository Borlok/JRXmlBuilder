package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitleBandTextFieldBoxTopPen extends JRXmlAbstractBandTextFieldBoxPen<JRXmlTitleBandTextFieldBox> {

    public JRXmlTitleBandTextFieldBoxTopPen(JRXmlTitleBandTextFieldBox parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("topPen");
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
