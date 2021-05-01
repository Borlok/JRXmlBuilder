package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextFieldTextElementBuilder extends JRXmlAbstractBandTextFieldTextElementBuilder<JRXmlColumnHeaderBandTextField> {

    public JRXmlColumnHeaderBandTextFieldTextElementBuilder(JRXmlColumnHeaderBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElement<JRXmlColumnHeaderBandTextField> builder() {
        return new JRXmlColumnHeaderBandTextFieldTextElement(parentElement);
    }
}
