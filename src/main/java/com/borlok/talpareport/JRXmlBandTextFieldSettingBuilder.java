package com.borlok.talpareport;

public class JRXmlBandTextFieldSettingBuilder extends JRXmlAbstractBandTextFieldSettingBuilder<JRXmlBandTextField> {

    public JRXmlBandTextFieldSettingBuilder(JRXmlBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldSetting<JRXmlBandTextField> builder() {
        return new JRXmlBandTextFieldSetting(parentElement);
    }
}
