package com.borlok.talpareport;

public class JRXmlTitleBandTextFieldBoxSetting extends JRXmlAbstractBandTextFieldBoxSetting<JRXmlTitleBandTextFieldBox> {

    public JRXmlTitleBandTextFieldBoxSetting(JRXmlTitleBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlTitleBandTextFieldBox build() {
        return parentElement;
    }
}
