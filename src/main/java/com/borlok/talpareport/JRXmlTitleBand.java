package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;


public class JRXmlTitleBand extends JRXmlAbstractBand<JRXmlTitle>{

    public JRXmlTitleBand(JRXmlTitle parentElement) {
        super(parentElement);
    }

    public JRXmlAbstractBandSettingBuilder<JRXmlTitleBand> addBandSettingBuilder () {
        return new JRXmlTitleBandSettingBuilder(this);
    }

    public JRXmlAbstractBandTextFieldBuilder<JRXmlTitleBand> addTextFieldBuilder() {
        return new JRXmlTitleBandTextFieldBuilder(this);
    }

    @Override
    public JRXmlTitle build () {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
