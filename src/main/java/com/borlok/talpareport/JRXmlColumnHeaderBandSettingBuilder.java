package com.borlok.talpareport;

public class JRXmlColumnHeaderBandSettingBuilder extends JRXmlAbstractBandSettingBuilder<JRXmlColumnHeaderBand>{

    public JRXmlColumnHeaderBandSettingBuilder(JRXmlColumnHeaderBand parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandSetting<JRXmlColumnHeaderBand> builder() {
        return new JRXmlColumnHeaderBandSetting(parentElement);
    }
}
