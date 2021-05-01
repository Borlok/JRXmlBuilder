package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlColumnHeaderBandTextField extends JRXmlAbstractBandTextField<JRXmlColumnHeaderBand> {
//TODO Not realized
    public JRXmlColumnHeaderBandTextField(JRXmlColumnHeaderBand parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("textField");
    }

    @Override
    public JRXmlAbstractBandTextFieldSettingBuilder<JRXmlColumnHeaderBandTextField> addTextFieldSettingBuilder() {
        return new JRXmlColumnHeaderBandTextFieldSettingBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldReportElementBuilder<JRXmlColumnHeaderBandTextField> addReportElementBuilder() {
        return new JRXmlColumnHeaderBandTextFieldReportElementBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxBuilder<JRXmlColumnHeaderBandTextField> addBoxBuilder() {
        return new JRXmlColumnHeaderBandTextFieldBoxBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementBuilder<JRXmlColumnHeaderBandTextField> addTextElementBuilder() {
        return new JRXmlColumnHeaderBandTextFieldTextElementBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextFieldExpressionBuilder<JRXmlColumnHeaderBandTextField> addTextFieldExpressionBuilder() {
        return new JRXmlColumnHeaderBandTextFieldTextFieldExpressionBuilder(this);
    }

    @Override
    public JRXmlColumnHeaderBand build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
