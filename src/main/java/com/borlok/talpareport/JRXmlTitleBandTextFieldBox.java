package com.borlok.talpareport;

public class JRXmlTitleBandTextFieldBox extends JRXmlAbstractBandTextFieldBox<JRXmlTitleBandTextField> {

    public JRXmlTitleBandTextFieldBox(JRXmlTitleBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlTitleBandTextField build() {
        return parentElement;
    }
}
