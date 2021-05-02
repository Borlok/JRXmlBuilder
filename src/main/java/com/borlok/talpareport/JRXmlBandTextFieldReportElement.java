package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlBandTextFieldReportElement extends JRXmlAbstractBandTextFieldReportElement<JRXmlBandTextField> {

    public JRXmlBandTextFieldReportElement(JRXmlBandTextField parentElement) {
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
