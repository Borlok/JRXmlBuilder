package com.borlok.talpareport;

public class JRXmlColumnHeaderBandBuilder extends JRXmlAbstractBandBuilder<JRXmlColumnHeader> {

    public JRXmlColumnHeaderBandBuilder(JRXmlColumnHeader parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBand<JRXmlColumnHeader> builder() {
        return new JRXmlColumnHeaderBand(parentElement);
    }
}
