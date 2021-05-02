package com.borlok.talpareport;

public class JRXmlBandTextFieldBoxBottomPenBuilder extends JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlBandTextFieldBox> {

    public JRXmlBandTextFieldBoxBottomPenBuilder(JRXmlBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPen<JRXmlBandTextFieldBox> builder() {
        return new JRXmlBandTextFieldBoxBottomPen(parentElement);
    }
}
