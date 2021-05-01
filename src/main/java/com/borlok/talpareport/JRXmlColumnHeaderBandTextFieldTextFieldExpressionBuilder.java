package com.borlok.talpareport;

public class JRXmlColumnHeaderBandTextFieldTextFieldExpressionBuilder extends JRXmlAbstractBandTextFieldTextFieldExpressionBuilder<JRXmlColumnHeaderBandTextField> {

    public JRXmlColumnHeaderBandTextFieldTextFieldExpressionBuilder(JRXmlColumnHeaderBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextFieldExpression<JRXmlColumnHeaderBandTextField> builder() {
        return new JRXmlColumnHeaderBandTextFieldTextFieldExpression(parentElement);
    }
}
