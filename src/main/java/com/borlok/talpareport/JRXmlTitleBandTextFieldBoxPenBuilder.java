package com.borlok.talpareport;

public class JRXmlTitleBandTextFieldBoxPenBuilder extends JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlTitleBandTextFieldBox> {

    public JRXmlTitleBandTextFieldBoxPenBuilder(JRXmlTitleBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPen<JRXmlTitleBandTextFieldBox> builder() {
        return new JRXmlTitleBandTextFieldBoxPen(parentElement);
    }
}
