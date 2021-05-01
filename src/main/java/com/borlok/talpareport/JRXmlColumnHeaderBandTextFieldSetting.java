package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextFieldSetting extends JRXmlAbstractBandTextFieldSetting<JRXmlColumnHeaderBandTextField> {

    public JRXmlColumnHeaderBandTextFieldSetting(JRXmlColumnHeaderBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlColumnHeaderBandTextField build() {
        return parentElement;
    }
}
