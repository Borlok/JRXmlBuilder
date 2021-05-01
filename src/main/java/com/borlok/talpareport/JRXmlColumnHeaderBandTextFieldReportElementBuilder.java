package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextFieldReportElementBuilder extends JRXmlAbstractBandTextFieldReportElementBuilder<JRXmlColumnHeaderBandTextField> {

    public JRXmlColumnHeaderBandTextFieldReportElementBuilder(JRXmlColumnHeaderBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldReportElement<JRXmlColumnHeaderBandTextField> builder() {
        return new JRXmlColumnHeaderBandTextFieldReportElement(parentElement);
    }
}
