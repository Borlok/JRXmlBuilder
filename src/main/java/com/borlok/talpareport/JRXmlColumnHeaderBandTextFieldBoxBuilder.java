package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextFieldBoxBuilder extends JRXmlAbstractBandTextFieldBoxBuilder<JRXmlColumnHeaderBandTextField> {

    public JRXmlColumnHeaderBandTextFieldBoxBuilder(JRXmlColumnHeaderBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBox<JRXmlColumnHeaderBandTextField> builder() {
        return new JRXmlColumnHeaderBandTextFieldBox(parentElement);
    }
}
