package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitleBandTextField extends JRXmlAbstractBandTextField<JRXmlTitleBand>{

    public JRXmlTitleBandTextField(JRXmlTitleBand parentElement) {
        super(parentElement);
    }

    public JRXmlAbstractBandTextFieldSettingBuilder<JRXmlTitleBandTextField> addTextFieldSettingBuilder () {
        return new JRXmTitleBandTextFieldSettingBuilder(this);
    }

    public JRXmlAbstractBandTextFieldReportElementBuilder<JRXmlTitleBandTextField> addReportElementBuilder () {
        return new JRXmlTitleBandTextFieldReportElementBuilder(this);
    }

    public JRXmlAbstractBandTextFieldBoxBuilder<JRXmlTitleBandTextField> addBoxBuilder() {
        return new JRXmlTitleBandTextFieldBoxBuilder(this);
    }

    public JRXmlAbstractBandTextFieldTextElementBuilder<JRXmlTitleBandTextField> addTextElementBuilder () {
        return new JRXmlTitleBandTextFieldTextElementBuilder(this);
    }

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
