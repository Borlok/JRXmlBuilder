package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextFieldBoxLeftPenBuilder extends JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlColumnHeaderBandTextFieldBox> {

    public JRXmlColumnHeaderBandTextFieldBoxLeftPenBuilder(JRXmlColumnHeaderBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPen<JRXmlColumnHeaderBandTextFieldBox> builder() {
        return new JRXmlColumnHeaderBandTextFieldBoxLeftPen(parentElement);
    }
}
