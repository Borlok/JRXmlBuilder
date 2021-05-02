package com.borlok.talpareport;

public class JRXmlBandTextFieldTextFieldExpressionBuilder extends JRXmlAbstractBandTextFieldTextFieldExpressionBuilder<JRXmlBandTextField> {

    public JRXmlBandTextFieldTextFieldExpressionBuilder(JRXmlBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldTextFieldExpression<JRXmlBandTextField> builder() {
        return new JRXmlBandTextFieldTextFieldExpression(parentElement);
    }
}
