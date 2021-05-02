package com.borlok.talpareport;

public class JRXmlBandTextFieldBoxSetting extends JRXmlAbstractBandTextFieldBoxSetting<JRXmlBandTextFieldBox> {

    public JRXmlBandTextFieldBoxSetting(JRXmlBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlBandTextFieldBox build() {
        return parentElement;
    }
}
