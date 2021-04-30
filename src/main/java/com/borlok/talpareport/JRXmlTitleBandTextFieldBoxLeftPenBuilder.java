package com.borlok.talpareport;

public class JRXmlTitleBandTextFieldBoxLeftPenBuilder extends JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlTitleBandTextFieldBox> {

    public JRXmlTitleBandTextFieldBoxLeftPenBuilder(JRXmlTitleBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPen<JRXmlTitleBandTextFieldBox> builder() {
        return new JRXmlTitleBandTextFieldBoxLeftPen(parentElement);
    }
}
