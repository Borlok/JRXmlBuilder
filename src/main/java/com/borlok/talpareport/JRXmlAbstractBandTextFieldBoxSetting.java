package com.borlok.talpareport;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public abstract class JRXmlAbstractBandTextFieldBoxSetting<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldBoxSetting(T parentElement) {
        this.parentElement = parentElement;
    }

    public JRXmlAbstractBandTextFieldBoxSetting<T> addPadding(Integer padding) {
        jrXmlWriteHelper.addAttribute("padding", padding);
        return this;
    }

    public JRXmlAbstractBandTextFieldBoxSetting<T> addLeftPadding(Integer leftPadding) {
        jrXmlWriteHelper.addAttribute("leftPadding", leftPadding);
        return this;
    }

    public JRXmlAbstractBandTextFieldBoxSetting<T> addRightPadding(Integer rightPadding) {
        jrXmlWriteHelper.addAttribute("rightPadding", rightPadding);
        return this;
    }

    public JRXmlAbstractBandTextFieldBoxSetting<T> addTopPadding(Integer topPadding) {
        jrXmlWriteHelper.addAttribute("topPadding", topPadding);
        return this;
    }

    public JRXmlAbstractBandTextFieldBoxSetting<T> addBottomPadding(Integer bottomPadding) {
        jrXmlWriteHelper.addAttribute("bottomPadding", bottomPadding);
        return this;
    }
    public abstract T build();
}
