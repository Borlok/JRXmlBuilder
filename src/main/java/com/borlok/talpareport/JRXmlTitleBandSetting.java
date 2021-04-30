package com.borlok.talpareport;

public class JRXmlTitleBandSetting extends JRXmlAbstractBandSetting<JRXmlTitleBand>{

    public JRXmlTitleBandSetting(JRXmlTitleBand parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlTitleBand build() {
        return parentElement;
    }


}
