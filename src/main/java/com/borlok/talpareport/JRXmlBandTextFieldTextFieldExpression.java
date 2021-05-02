package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlBandTextFieldTextFieldExpression extends JRXmlAbstractBandTextFieldTextFieldExpression<JRXmlBandTextField> {

    public JRXmlBandTextFieldTextFieldExpression(JRXmlBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlBandTextField build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
