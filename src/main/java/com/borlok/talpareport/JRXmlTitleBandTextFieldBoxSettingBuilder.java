package com.borlok.talpareport;

public class JRXmlTitleBandTextFieldBoxSettingBuilder extends JRXmlAbstractBandTextFieldBoxSettingBuilder<JRXmlTitleBandTextFieldBox> {

    public JRXmlTitleBandTextFieldBoxSettingBuilder(JRXmlTitleBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxSetting<JRXmlTitleBandTextFieldBox> builder() {
        return new JRXmlTitleBandTextFieldBoxSetting(parentElement);
    }
}
