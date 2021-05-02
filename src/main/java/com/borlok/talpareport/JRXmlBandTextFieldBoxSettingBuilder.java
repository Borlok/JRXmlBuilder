package com.borlok.talpareport;

public class JRXmlBandTextFieldBoxSettingBuilder extends JRXmlAbstractBandTextFieldBoxSettingBuilder<JRXmlBandTextFieldBox> {

    public JRXmlBandTextFieldBoxSettingBuilder(JRXmlBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxSetting<JRXmlBandTextFieldBox> builder() {
        return new JRXmlBandTextFieldBoxSetting(parentElement);
    }
}
