package com.borlok.talpareport;

public class JRXmlColumnHeaderBandSetting extends JRXmlAbstractBandSetting<JRXmlColumnHeaderBand> {

    public JRXmlColumnHeaderBandSetting(JRXmlColumnHeaderBand parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlColumnHeaderBand build() {
        return parentElement;
    }
}
