package com.borlok.talpareport;

public class JRXmlStyleBuilder {
    private JRXml jrXml;

    public JRXmlStyleBuilder(JRXml jrXml) {
        this.jrXml = jrXml;
    }

    public JRXmlStyle builder() {
        return new JRXmlStyle(jrXml);
    }
}
