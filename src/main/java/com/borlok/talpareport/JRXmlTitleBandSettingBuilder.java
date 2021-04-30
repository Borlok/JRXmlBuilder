package com.borlok.talpareport;

public class JRXmlTitleBandSettingBuilder extends JRXmlAbstractBandSettingBuilder<JRXmlTitleBand> {

    public JRXmlTitleBandSettingBuilder(JRXmlTitleBand jrXmlTitleBand) {
        super(jrXmlTitleBand);
    }

    @Override
    public JRXmlAbstractBandSetting<JRXmlTitleBand> builder() {
        return new JRXmlTitleBandSetting(parentElement);
    }
}
