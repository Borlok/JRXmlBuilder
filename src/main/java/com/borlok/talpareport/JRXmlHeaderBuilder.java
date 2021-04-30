package com.borlok.talpareport;

public class JRXmlHeaderBuilder {
    private JRXml jrXml;

    public JRXmlHeaderBuilder(JRXml jrXml) {
        this.jrXml = jrXml;
    }

    public JRXmlHeaderSettings builder() {
        return new JRXmlHeaderSettings(jrXml);
    }
}
