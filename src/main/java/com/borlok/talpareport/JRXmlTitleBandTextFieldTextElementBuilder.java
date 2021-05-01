package com.borlok.talpareport;

public class JRXmlTitleBandTextFieldTextElementBuilder extends JRXmlAbstractBandTextFieldTextElementBuilder<JRXmlTitleBandTextField> {

    public JRXmlTitleBandTextFieldTextElementBuilder(JRXmlTitleBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElement<JRXmlTitleBandTextField> builder() {
        return new JRXmlTitleBandTextFieldTextElement(parentElement);
    }
}
