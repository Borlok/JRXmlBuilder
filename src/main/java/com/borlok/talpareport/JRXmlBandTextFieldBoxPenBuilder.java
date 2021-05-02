package com.borlok.talpareport;

public class JRXmlBandTextFieldBoxPenBuilder extends JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlBandTextFieldBox> {

    public JRXmlBandTextFieldBoxPenBuilder(JRXmlBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPen<JRXmlBandTextFieldBox> builder() {
        return new JRXmlBandTextFieldBoxPen(parentElement);
    }
}
