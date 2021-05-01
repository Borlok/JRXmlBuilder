package com.borlok.talpareport;

public class JRXmlTitleBandTextFieldTextElementFontBuilder extends JRXmlAbstractBandTextFieldTextElementFontBuilder<JRXmlTitleBandTextFieldTextElement> {
    public JRXmlTitleBandTextFieldTextElementFontBuilder(JRXmlTitleBandTextFieldTextElement parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementFont<JRXmlTitleBandTextFieldTextElement> builder() {
        return new JRXmlTitleBandTextFieldTextElementFont(parentElement);
    }
}
