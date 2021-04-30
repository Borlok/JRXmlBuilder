package com.borlok.talpareport;

public class JRXmlTitleBandTextFieldBoxBuilder extends JRXmlAbstractBandTextFieldBoxBuilder<JRXmlTitleBandTextField> {

    public JRXmlTitleBandTextFieldBoxBuilder(JRXmlTitleBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBox<JRXmlTitleBandTextField> builder() {
        return new JRXmlTitleBandTextFieldBox(parentElement);
    }
}
