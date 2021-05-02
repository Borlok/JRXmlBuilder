package com.borlok.talpareport;

public class JRXmlBandTextFieldTextElementFontBuilder extends JRXmlAbstractBandTextFieldTextElementFontBuilder<JRXmlBandTextFieldTextElement> {

    public JRXmlBandTextFieldTextElementFontBuilder(JRXmlBandTextFieldTextElement parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementFont<JRXmlBandTextFieldTextElement> builder() {
        return new JRXmlBandTextFieldTextElementFont(parentElement);
    }
}
