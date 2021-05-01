package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextFieldBoxRightPenBuilder extends JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlColumnHeaderBandTextFieldBox> {

    public JRXmlColumnHeaderBandTextFieldBoxRightPenBuilder(JRXmlColumnHeaderBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPen<JRXmlColumnHeaderBandTextFieldBox> builder() {
        return new JRXmlColumnHeaderBandTextFieldBoxRightPen(parentElement);
    }
}
