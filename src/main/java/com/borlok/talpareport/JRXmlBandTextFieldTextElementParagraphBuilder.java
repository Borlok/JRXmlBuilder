package com.borlok.talpareport;

public class JRXmlBandTextFieldTextElementParagraphBuilder extends JRXmlAbstractBandTextFieldTextElementParagraphBuilder<JRXmlBandTextFieldTextElement> {

    public JRXmlBandTextFieldTextElementParagraphBuilder(JRXmlBandTextFieldTextElement parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementParagraph<JRXmlBandTextFieldTextElement> builder() {
        return new JRXmlBandTextFieldTextElementParagraph(parentElement);
    }
}
