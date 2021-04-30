package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextFieldBuilder extends JRXmlAbstractBandTextFieldBuilder<JRXmlColumnHeaderBand> {

    public JRXmlColumnHeaderBandTextFieldBuilder(JRXmlColumnHeaderBand parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextField<JRXmlColumnHeaderBand> builder() {
        return new JRXmlColumnHeaderBandTextField(parentElement);
    }
}
