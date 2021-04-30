package com.borlok.talpareport;

public class JRXmlTitleBandTextFieldReportElementBuilder extends JRXmlAbstractBandTextFieldReportElementBuilder<JRXmlTitleBandTextField> {

    public JRXmlTitleBandTextFieldReportElementBuilder(JRXmlTitleBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldReportElement<JRXmlTitleBandTextField> builder() {
        return new JRXmlTitleBandTextFieldReportElement(parentElement);
    }
}
