package com.borlok.talpareport;

public class JRXmlBandTextFieldBoxLeftPenBuilder extends JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlBandTextFieldBox> {

    public JRXmlBandTextFieldBoxLeftPenBuilder(JRXmlBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPen<JRXmlBandTextFieldBox> builder() {
        return new JRXmlBandTextFieldBoxLeftPen(parentElement);
    }
}
