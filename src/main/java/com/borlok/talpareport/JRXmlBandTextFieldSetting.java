package com.borlok.talpareport;

public class JRXmlBandTextFieldSetting extends JRXmlAbstractBandTextFieldSetting<JRXmlBandTextField> {

    public JRXmlBandTextFieldSetting(JRXmlBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlBandTextField build() {
        return parentElement;
    }
}
