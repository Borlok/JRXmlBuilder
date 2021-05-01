package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextFieldTextElementSetting extends JRXmlAbstractBandTextFieldTextElementSetting<JRXmlColumnHeaderBandTextFieldTextElement> {

    public JRXmlColumnHeaderBandTextFieldTextElementSetting(JRXmlColumnHeaderBandTextFieldTextElement parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlColumnHeaderBandTextFieldTextElement build() {
        return parentElement;
    }
}
