package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextFieldTextFieldExpression<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldTextFieldExpression(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldTextFieldExpression<T> addClass(String className);
    public abstract JRXmlAbstractBandTextFieldTextFieldExpression<T> addCDATA(String data);
    public abstract JRXmlAbstractBandTextFieldTextFieldExpression<T> addCDATAParameter(String data);
    public abstract JRXmlAbstractBandTextFieldTextFieldExpression<T> addCDATAField(String data);

    public abstract T build();
}
