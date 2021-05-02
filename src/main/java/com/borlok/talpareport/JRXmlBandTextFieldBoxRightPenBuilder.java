package com.borlok.talpareport;

public class JRXmlBandTextFieldBoxRightPenBuilder extends JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlBandTextFieldBox> {

    public JRXmlBandTextFieldBoxRightPenBuilder(JRXmlBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPen<JRXmlBandTextFieldBox> builder() {
        return new JRXmlBandTextFieldBoxRightPen(parentElement);
    }
}
