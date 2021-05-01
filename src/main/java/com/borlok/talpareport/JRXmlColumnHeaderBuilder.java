package com.borlok.talpareport;

public class JRXmlColumnHeaderBuilder {
    private JRXml jrXml;

    public JRXmlColumnHeaderBuilder(JRXml jrXml) {
        this.jrXml = jrXml;
    }

    public JRXmlColumnHeader builder() {
        return new JRXmlColumnHeader(jrXml);
    }
}
