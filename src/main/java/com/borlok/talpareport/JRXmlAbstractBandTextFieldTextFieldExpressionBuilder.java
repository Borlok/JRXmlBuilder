package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextFieldTextFieldExpressionBuilder<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldTextFieldExpressionBuilder(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldTextFieldExpression<T> builder();
}
