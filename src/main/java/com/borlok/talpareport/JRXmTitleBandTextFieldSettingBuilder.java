package com.borlok.talpareport;

public class JRXmTitleBandTextFieldSettingBuilder extends JRXmlAbstractBandTextFieldSettingBuilder<JRXmlTitleBandTextField> {

    public JRXmTitleBandTextFieldSettingBuilder(JRXmlTitleBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldSetting<JRXmlTitleBandTextField> builder() {
        return new JRXmTitleBandTextFieldSetting(parentElement);
    }

}
