package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextFieldBoxPenBuilder extends JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlColumnHeaderBandTextFieldBox> {

    public JRXmlColumnHeaderBandTextFieldBoxPenBuilder(JRXmlColumnHeaderBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPen<JRXmlColumnHeaderBandTextFieldBox> builder() {
        return new JRXmlColumnHeaderBandTextFieldBoxPen(parentElement);
    }
}
