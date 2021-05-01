package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitleBandTextFieldBoxBottomPen extends JRXmlAbstractBandTextFieldBoxPen<JRXmlTitleBandTextFieldBox> {

    public JRXmlTitleBandTextFieldBoxBottomPen(JRXmlTitleBandTextFieldBox parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("bottomPen");
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
