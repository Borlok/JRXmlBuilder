package com.borlok.talpareport;

public class JRXmlBandTextFieldBoxBuilder extends JRXmlAbstractBandTextFieldBoxBuilder<JRXmlBandTextField> {

    public JRXmlBandTextFieldBoxBuilder(JRXmlBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBox<JRXmlBandTextField> builder() {
        return new JRXmlBandTextFieldBox(parentElement);
    }
}
