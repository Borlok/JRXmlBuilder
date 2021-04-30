package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitle {
    private JRXml jrXml;

    public JRXmlTitle(JRXml jrXml) {
        this.jrXml = jrXml;
        jrXmlWriteHelper.startElement("title");
    }

    public JRXmlAbstractBandBuilder<JRXmlTitle> addBandBuilder() {
        return new JRXmlTitleBandBuilder(this);
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
