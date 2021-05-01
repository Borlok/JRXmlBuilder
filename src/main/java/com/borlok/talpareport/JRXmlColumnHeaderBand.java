package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlColumnHeaderBand extends JRXmlAbstractBand<JRXmlColumnHeader>{

    public JRXmlColumnHeaderBand(JRXmlColumnHeader parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandSettingBuilder<JRXmlColumnHeaderBand> addBandSettingBuilder() {
        return new JRXmlColumnHeaderBandSettingBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBuilder<JRXmlColumnHeaderBand> addTextFieldBuilder() {
        return new JRXmlColumnHeaderBandTextFieldBuilder(this);
    }

    @Override
    public JRXmlColumnHeader build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
