package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmTitleBandTextFieldSetting extends JRXmlAbstractBandTextFieldSetting<JRXmlTitleBandTextField> {

    public JRXmTitleBandTextFieldSetting(JRXmlTitleBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlTitleBandTextField build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
