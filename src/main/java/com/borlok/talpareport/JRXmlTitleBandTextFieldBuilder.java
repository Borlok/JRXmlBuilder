package com.borlok.talpareport;

public class JRXmlTitleBandTextFieldBuilder extends JRXmlAbstractBandTextFieldBuilder<JRXmlTitleBand> {

    public JRXmlTitleBandTextFieldBuilder(JRXmlTitleBand parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextField<JRXmlTitleBand> builder() {
        return new JRXmlTitleBandTextField(parentElement);
    }
}
