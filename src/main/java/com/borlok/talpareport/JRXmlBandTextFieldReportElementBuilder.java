package com.borlok.talpareport;

public class JRXmlBandTextFieldReportElementBuilder extends JRXmlAbstractBandTextFieldReportElementBuilder<JRXmlBandTextField> {

    public JRXmlBandTextFieldReportElementBuilder(JRXmlBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldReportElement<JRXmlBandTextField> builder() {
        return new JRXmlBandTextFieldReportElement(parentElement);
    }
}
