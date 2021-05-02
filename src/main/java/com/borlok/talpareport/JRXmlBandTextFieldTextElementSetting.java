package com.borlok.talpareport;

public class JRXmlBandTextFieldTextElementSetting extends JRXmlAbstractBandTextFieldTextElementSetting<JRXmlBandTextFieldTextElement> {

    public JRXmlBandTextFieldTextElementSetting(JRXmlBandTextFieldTextElement parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlBandTextFieldTextElement build() {
        return parentElement;
    }
}
