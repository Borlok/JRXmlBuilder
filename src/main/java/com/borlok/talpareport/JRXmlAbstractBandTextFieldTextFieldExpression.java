package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public abstract class JRXmlAbstractBandTextFieldTextFieldExpression<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldTextFieldExpression(T parentElement) {
        this.parentElement = parentElement;
        jrXmlWriteHelper.startElement("textFieldExpression");
    }

    public JRXmlAbstractBandTextFieldTextFieldExpression<T> addClass(String className) {
        jrXmlWriteHelper.addAttribute("class", className);
        return this;
    }

    public JRXmlAbstractBandTextFieldTextFieldExpression<T> addCDATA(String data) {
        try {
            jrXmlWriteHelper.writeCDATA(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public JRXmlAbstractBandTextFieldTextFieldExpression<T> addCDATAParameter(String data) {
        try {
            jrXmlWriteHelper.writeCDATA("$P{" + data + "}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public JRXmlAbstractBandTextFieldTextFieldExpression<T> addCDATAField(String data) {
        try {
            jrXmlWriteHelper.writeCDATA("$F{" + data + "}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }
    public abstract T build();
}
