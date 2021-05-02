package com.borlok.talpareport;

public class JRXmlBandTextFieldBoxTopPenBuilder extends JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlBandTextFieldBox> {
    public JRXmlBandTextFieldBoxTopPenBuilder(JRXmlBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPen<JRXmlBandTextFieldBox> builder() {
        return new JRXmlBandTextFieldBoxTopPen(parentElement);
    }
}
