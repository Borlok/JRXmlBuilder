package com.borlok.talpareport;

public class JRXmlBandTextFieldTextElementBuilder extends JRXmlAbstractBandTextFieldTextElementBuilder<JRXmlBandTextField> {

    public JRXmlBandTextFieldTextElementBuilder(JRXmlBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElement<JRXmlBandTextField> builder() {
        return new JRXmlBandTextFieldTextElement(parentElement);
    }
}
