package com.borlok.talpareport;

public class JRXmlTitleBandTextFieldTextElementSetting extends JRXmlAbstractBandTextFieldTextElementSetting<JRXmlTitleBandTextFieldTextElement> {

    public JRXmlTitleBandTextFieldTextElementSetting(JRXmlTitleBandTextFieldTextElement parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlTitleBandTextFieldTextElement build() {
        return parentElement;
    }


}
