package com.borlok.talpareport;

public class JRXmlTitleBandTextFieldTextFieldExpressionBuilder extends JRXmlAbstractBandTextFieldTextFieldExpressionBuilder<JRXmlTitleBandTextField> {

    public JRXmlTitleBandTextFieldTextFieldExpressionBuilder(JRXmlTitleBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextFieldExpression<JRXmlTitleBandTextField> builder() {
        return new JRXmlTitleBandTextFieldTextFieldExpression(parentElement);
    }
}
