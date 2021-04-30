package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextField extends JRXmlAbstractBandTextField<JRXmlColumnHeaderBand> {
//TODO Not realized
    public JRXmlColumnHeaderBandTextField(JRXmlColumnHeaderBand parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldSettingBuilder<JRXmlColumnHeaderBandTextField> addTextFieldSettingBuilder() {
        return null;
    }

    @Override
    public JRXmlAbstractBandTextFieldReportElementBuilder<JRXmlColumnHeaderBandTextField> addReportElementBuilder() {
        return null;
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxBuilder<JRXmlColumnHeaderBandTextField> addBoxBuilder() {
        return null;
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementBuilder<JRXmlColumnHeaderBandTextField> addTextElementBuilder() {
        return null;
    }

    @Override
    public JRXmlAbstractBandTextFieldTextFieldExpressionBuilder<JRXmlColumnHeaderBandTextField> addTextFieldExpressionBuilder() {
        return null;
    }

    @Override
    public JRXmlColumnHeaderBand build() {
        return parentElement;
    }
}
