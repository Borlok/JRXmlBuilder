package com.borlok.talpareport;

public class JRXmlTitleBandTextFieldTextElementSettingBuilder extends JRXmlAbstractBandTextFieldTextElementSettingBuilder<JRXmlTitleBandTextFieldTextElement> {

    public JRXmlTitleBandTextFieldTextElementSettingBuilder(JRXmlTitleBandTextFieldTextElement parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementSetting<JRXmlTitleBandTextFieldTextElement> builder() {
        return new JRXmlTitleBandTextFieldTextElementSetting(parentElement);
    }
}
