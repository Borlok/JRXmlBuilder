package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlDetail extends JRXmlBodyField<JRXml> {
    public JRXmlDetail(JRXml parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("detail");
    }

    @Override
    public JRXmlAbstractBandBuilder<JRXmlBodyField<JRXml>> addBand() {
        return new JRXmlBandBuilder(this);
    }

    @Override
    public JRXml build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
