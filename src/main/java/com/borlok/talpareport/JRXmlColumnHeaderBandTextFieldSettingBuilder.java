package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextFieldSettingBuilder extends JRXmlAbstractBandTextFieldSettingBuilder<JRXmlColumnHeaderBandTextField> {
    public JRXmlColumnHeaderBandTextFieldSettingBuilder(JRXmlColumnHeaderBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldSetting<JRXmlColumnHeaderBandTextField> builder() {
        return new JRXmlColumnHeaderBandTextFieldSetting(parentElement);
    }
}
