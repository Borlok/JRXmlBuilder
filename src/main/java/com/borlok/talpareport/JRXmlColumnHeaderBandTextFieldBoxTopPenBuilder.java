package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextFieldBoxTopPenBuilder extends JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlColumnHeaderBandTextFieldBox> {

    public JRXmlColumnHeaderBandTextFieldBoxTopPenBuilder(JRXmlColumnHeaderBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPen<JRXmlColumnHeaderBandTextFieldBox> builder() {
        return new JRXmlColumnHeaderBandTextFieldBoxTopPen(parentElement);
    }
}
