package com.borlok.talpareport;

public class JRXmlTitleBandTextFieldTextElementParagraphBuilder extends JRXmlAbstractBandTextFieldTextElementParagraphBuilder<JRXmlTitleBandTextFieldTextElement> {
    public JRXmlTitleBandTextFieldTextElementParagraphBuilder(JRXmlTitleBandTextFieldTextElement parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementParagraph<JRXmlTitleBandTextFieldTextElement> builder() {
        return new JRXmlTitleBandTextFieldTextElementParagraph(parentElement);
    }
}
