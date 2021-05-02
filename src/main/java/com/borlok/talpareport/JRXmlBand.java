package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlBand extends JRXmlAbstractBand<JRXmlBodyField<JRXml>> {

    public JRXmlBand(JRXmlBodyField<JRXml> parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandSettingBuilder<JRXmlBand> addBandSetting() {
        return new JRXmlBandSettingBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBuilder<JRXmlBand> addTextField() {
        return new JRXmlBandTextFieldBuilder(this);
    }

    @Override
    public JRXmlBodyField<JRXml> build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
