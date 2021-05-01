package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextFieldTextElementFontBuilder extends JRXmlAbstractBandTextFieldTextElementFontBuilder<JRXmlColumnHeaderBandTextFieldTextElement> {

    public JRXmlColumnHeaderBandTextFieldTextElementFontBuilder(JRXmlColumnHeaderBandTextFieldTextElement parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementFont<JRXmlColumnHeaderBandTextFieldTextElement> builder() {
        return new JRXmlColumnHeaderBandTextFieldTextElementFont(parentElement);
    }
}
