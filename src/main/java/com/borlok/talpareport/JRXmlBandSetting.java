package com.borlok.talpareport;

public class JRXmlBandSetting extends JRXmlAbstractBandSetting<JRXmlBand> {
    public JRXmlBandSetting(JRXmlBand parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlBand build() {
        return parentElement;
    }
}
