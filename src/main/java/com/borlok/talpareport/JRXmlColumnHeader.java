package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlColumnHeader {
    private JRXml jrXml;

    public JRXmlColumnHeader(JRXml jrXml) {
        this.jrXml = jrXml;
        jrXmlWriteHelper.startElement("columnHeader");
    }

    public JRXmlAbstractBandBuilder<JRXmlColumnHeader> addBandBuilder() {
        return new JRXmlColumnHeaderBandBuilder(this);
    }

    public JRXml build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jrXml;
    }
}
