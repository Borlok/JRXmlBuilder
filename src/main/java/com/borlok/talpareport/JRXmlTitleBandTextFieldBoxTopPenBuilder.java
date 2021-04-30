package com.borlok.talpareport;

public class JRXmlTitleBandTextFieldBoxTopPenBuilder extends JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlTitleBandTextFieldBox> {

    public JRXmlTitleBandTextFieldBoxTopPenBuilder(JRXmlTitleBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPen<JRXmlTitleBandTextFieldBox> builder() {
        return new JRXmlTitleBandTextFieldBoxTopPen(parentElement);
    }
}
