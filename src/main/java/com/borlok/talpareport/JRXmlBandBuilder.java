package com.borlok.talpareport;

public class JRXmlBandBuilder extends JRXmlAbstractBandBuilder<JRXmlBodyField<JRXml>> {
    public JRXmlBandBuilder(JRXmlBodyField<JRXml> parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBand<JRXmlBodyField<JRXml>> builder() {
        return new JRXmlBand(parentElement);
    }
}
