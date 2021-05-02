package com.borlok.talpareport;

public class JRXmlDetailBuilder {
    private JRXml jrXml;

    public JRXmlDetailBuilder(JRXml jrXml) {
        this.jrXml = jrXml;
    }

    public JRXmlDetail builder() {
        return new JRXmlDetail(jrXml);
    }
}
