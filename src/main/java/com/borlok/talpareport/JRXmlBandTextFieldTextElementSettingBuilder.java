package com.borlok.talpareport;

public class JRXmlBandTextFieldTextElementSettingBuilder extends JRXmlAbstractBandTextFieldTextElementSettingBuilder<JRXmlBandTextFieldTextElement> {

    public JRXmlBandTextFieldTextElementSettingBuilder(JRXmlBandTextFieldTextElement parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementSetting<JRXmlBandTextFieldTextElement> builder() {
        return new JRXmlBandTextFieldTextElementSetting(parentElement);
    }
}
