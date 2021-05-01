package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextFieldBoxSetting extends JRXmlAbstractBandTextFieldBoxSetting<JRXmlColumnHeaderBandTextFieldBox> {

    public JRXmlColumnHeaderBandTextFieldBoxSetting(JRXmlColumnHeaderBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlColumnHeaderBandTextFieldBox build() {
        return parentElement;
    }

}
