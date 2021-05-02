package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlColumnHeader extends JRXmlBodyField<JRXml>{

    public JRXmlColumnHeader(JRXml parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("columnHeader");
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
