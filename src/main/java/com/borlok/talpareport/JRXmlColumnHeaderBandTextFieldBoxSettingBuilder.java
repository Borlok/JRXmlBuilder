package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextFieldBoxSettingBuilder extends JRXmlAbstractBandTextFieldBoxSettingBuilder<JRXmlColumnHeaderBandTextFieldBox> {

    public JRXmlColumnHeaderBandTextFieldBoxSettingBuilder(JRXmlColumnHeaderBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxSetting<JRXmlColumnHeaderBandTextFieldBox> builder() {
        return new JRXmlColumnHeaderBandTextFieldBoxSetting(parentElement);
    }
}
