package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitleBandTextFieldTextFieldExpression extends JRXmlAbstractBandTextFieldTextFieldExpression<JRXmlTitleBandTextField> {

    public JRXmlTitleBandTextFieldTextFieldExpression(JRXmlTitleBandTextField parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("textFieldExpression");
    }

    @Override
    public JRXmlTitleBandTextFieldTextFieldExpression addClass(String className) {
        jrXmlWriteHelper.addAttribute("class", className);
        return this;
    }

    public JRXmlTitleBandTextFieldTextFieldExpression addCDATA(String data) {
        try {
            jrXmlWriteHelper.writeCDATA(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public JRXmlTitleBandTextFieldTextFieldExpression addCDATAParameter(String data) {
        try {
            jrXmlWriteHelper.writeCDATA("$P{" + data + "}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public JRXmlTitleBandTextFieldTextFieldExpression addCDATAField(String data) {
        try {
            jrXmlWriteHelper.writeCDATA("$F{" + data + "}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public JRXmlTitleBandTextField build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
