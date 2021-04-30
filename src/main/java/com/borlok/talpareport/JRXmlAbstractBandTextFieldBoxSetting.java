package com.borlok.talpareport;

public abstract class JRXmlAbstractBandTextFieldBoxSetting<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldBoxSetting(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlTitleBandTextFieldBoxSetting addPadding(Integer padding);
    public abstract JRXmlTitleBandTextFieldBoxSetting addLeftPadding(Integer leftPadding);
    public abstract JRXmlTitleBandTextFieldBoxSetting addRightPadding(Integer rightPadding);
    public abstract JRXmlTitleBandTextFieldBoxSetting addTopPadding(Integer topPadding);
    public abstract JRXmlTitleBandTextFieldBoxSetting addBottomPadding(Integer bottomPadding);

    public abstract T build();
}
