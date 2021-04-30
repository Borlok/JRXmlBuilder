package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitleBandTextField extends JRXmlAbstractBandTextField<JRXmlTitleBand>{

    public JRXmlTitleBandTextField(JRXmlTitleBand parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("textField");
    }

    @Override
    public JRXmlAbstractBandTextFieldSettingBuilder<JRXmlTitleBandTextField> addTextFieldSettingBuilder () {
        return new JRXmTitleBandTextFieldSettingBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldReportElementBuilder<JRXmlTitleBandTextField> addReportElementBuilder () {
        return new JRXmlTitleBandTextFieldReportElementBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxBuilder<JRXmlTitleBandTextField> addBoxBuilder() {
        return new JRXmlTitleBandTextFieldBoxBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementBuilder<JRXmlTitleBandTextField> addTextElementBuilder () {
        return new JRXmlTitleBandTextFieldTextElementBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextFieldExpressionBuilder<JRXmlTitleBandTextField> addTextFieldExpressionBuilder() {
        return new JRXmlTitleBandTextFieldTextFieldExpressionBuilder(this);
    }

    @Override
    public JRXmlTitleBand build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }

}
