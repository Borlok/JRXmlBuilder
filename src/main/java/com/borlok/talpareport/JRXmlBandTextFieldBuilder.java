package com.borlok.talpareport;

public class JRXmlBandTextFieldBuilder extends JRXmlAbstractBandTextFieldBuilder<JRXmlBand> {

    public JRXmlBandTextFieldBuilder(JRXmlBand parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextField<JRXmlBand> builder() {
        return new JRXmlBandTextField(parentElement);
    }
}
