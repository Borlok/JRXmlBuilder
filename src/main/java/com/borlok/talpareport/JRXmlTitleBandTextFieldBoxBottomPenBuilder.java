package com.borlok.talpareport;

public class JRXmlTitleBandTextFieldBoxBottomPenBuilder extends JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlTitleBandTextFieldBox> {

    public JRXmlTitleBandTextFieldBoxBottomPenBuilder(JRXmlTitleBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPen<JRXmlTitleBandTextFieldBox> builder() {
        return new JRXmlTitleBandTextFieldBoxBottomPen(parentElement);
    }
}
