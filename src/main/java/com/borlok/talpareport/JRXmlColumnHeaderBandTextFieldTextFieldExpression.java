package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlColumnHeaderBandTextFieldTextFieldExpression extends JRXmlAbstractBandTextFieldTextFieldExpression<JRXmlColumnHeaderBandTextField> {

    public JRXmlColumnHeaderBandTextFieldTextFieldExpression(JRXmlColumnHeaderBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlColumnHeaderBandTextField build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
