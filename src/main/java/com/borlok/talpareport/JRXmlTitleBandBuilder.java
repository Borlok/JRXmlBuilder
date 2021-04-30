package com.borlok.talpareport;

public class JRXmlTitleBandBuilder extends JRXmlAbstractBandBuilder<JRXmlTitle> {

    public JRXmlTitleBandBuilder(JRXmlTitle parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBand<JRXmlTitle> builder() {
        return new JRXmlTitleBand(parentElement);
    }
}
