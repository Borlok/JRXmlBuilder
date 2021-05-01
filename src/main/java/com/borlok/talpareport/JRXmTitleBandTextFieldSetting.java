package com.borlok.talpareport;

public class JRXmTitleBandTextFieldSetting extends JRXmlAbstractBandTextFieldSetting<JRXmlTitleBandTextField> {

    public JRXmTitleBandTextFieldSetting(JRXmlTitleBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlTitleBandTextField build() {
        return parentElement;
    }
}
