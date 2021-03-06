package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitle extends JRXmlBodyField<JRXml> {

    public JRXmlTitle(JRXml parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("title");
    }

    @Override
    public JRXmlAbstractBandBuilder<JRXmlBodyField<JRXml>> addBand() {
        return new JRXmlBandBuilder(this);
    }

    public JRXml build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }

}
