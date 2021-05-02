package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlBandTextField extends JRXmlAbstractBandTextField<JRXmlBand> {

    public JRXmlBandTextField(JRXmlBand parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldSettingBuilder<JRXmlBandTextField> addTextFieldSetting() {
        return new JRXmlBandTextFieldSettingBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldReportElementBuilder<JRXmlBandTextField> addReportElement() {
        return new JRXmlBandTextFieldReportElementBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxBuilder<JRXmlBandTextField> addBox() {
        return new JRXmlBandTextFieldBoxBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextElementBuilder<JRXmlBandTextField> addTextElement() {
        return new JRXmlBandTextFieldTextElementBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextFieldExpressionBuilder<JRXmlBandTextField> addTextFieldExpression() {
        return new JRXmlBandTextFieldTextFieldExpressionBuilder(this);
    }

    @Override
    public JRXmlBand build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
