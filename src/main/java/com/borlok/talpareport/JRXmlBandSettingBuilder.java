package com.borlok.talpareport;

public class JRXmlBandSettingBuilder extends JRXmlAbstractBandSettingBuilder<JRXmlBand> {

    public JRXmlBandSettingBuilder(JRXmlBand parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandSetting<JRXmlBand> builder() {
        return new JRXmlBandSetting(parentElement);
    }
}
