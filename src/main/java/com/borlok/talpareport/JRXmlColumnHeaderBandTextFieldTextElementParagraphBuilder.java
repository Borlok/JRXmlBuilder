package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextFieldTextElementParagraphBuilder extends JRXmlAbstractBandTextFieldTextElementParagraphBuilder<JRXmlColumnHeaderBandTextFieldTextElement> {

    public JRXmlColumnHeaderBandTextFieldTextElementParagraphBuilder(JRXmlColumnHeaderBandTextFieldTextElement parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementParagraph<JRXmlColumnHeaderBandTextFieldTextElement> builder() {
        return new JRXmlColumnHeaderBandTextFieldTextElementParagraph(parentElement);
    }
}
