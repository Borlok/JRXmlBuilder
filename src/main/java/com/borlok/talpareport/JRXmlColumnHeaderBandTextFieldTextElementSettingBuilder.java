package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextFieldTextElementSettingBuilder extends JRXmlAbstractBandTextFieldTextElementSettingBuilder<JRXmlColumnHeaderBandTextFieldTextElement> {

    public JRXmlColumnHeaderBandTextFieldTextElementSettingBuilder(JRXmlColumnHeaderBandTextFieldTextElement parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementSetting<JRXmlColumnHeaderBandTextFieldTextElement> builder() {
        return new JRXmlColumnHeaderBandTextFieldTextElementSetting(parentElement);
    }
}
