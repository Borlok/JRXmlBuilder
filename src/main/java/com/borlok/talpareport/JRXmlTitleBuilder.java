package com.borlok.talpareport;

public class JRXmlTitleBuilder {
    private JRXml jrXml;

    public JRXmlTitleBuilder(JRXml jrXml) {
        this.jrXml = jrXml;
    }

    public JRXmlTitle builder() {
        return new JRXmlTitle(jrXml);
    }
}
