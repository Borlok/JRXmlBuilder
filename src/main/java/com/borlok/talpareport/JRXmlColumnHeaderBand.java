package com.borlok.talpareport;

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
        return parentElement;
    }
}
