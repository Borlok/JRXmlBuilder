package com.borlok.talpareport;

public class JRXmlTitleBandTextFieldBoxRightPenBuilder extends JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlTitleBandTextFieldBox> {

    public JRXmlTitleBandTextFieldBoxRightPenBuilder(JRXmlTitleBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPen<JRXmlTitleBandTextFieldBox> builder() {
        return new JRXmlTitleBandTextFieldBoxRightPen(parentElement);
    }
}
