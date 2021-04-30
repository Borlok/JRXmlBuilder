package com.borlok.talpareport;

public class JRXmlColumnHeader {
    private JRXml jrXml;

    public JRXmlColumnHeader(JRXml jrXml) {
        this.jrXml = jrXml;
    }


    public JRXmlAbstractBandBuilder<JRXmlColumnHeader> addBandBuilder() {
        return new JRXmlColumnHeaderBandBuilder(this);
    }
}
