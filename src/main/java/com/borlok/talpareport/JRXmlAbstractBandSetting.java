package com.borlok.talpareport;

import net.sf.jasperreports.engine.type.SplitTypeEnum;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public abstract class JRXmlAbstractBandSetting<T> {
    protected T parentElement;

    public JRXmlAbstractBandSetting(T parentElement) {
        this.parentElement = parentElement;
    }

    public JRXmlAbstractBandSetting<T> addHeight(Integer height) {
        jrXmlWriteHelper.addAttribute("height", height);
        return this;
    }

    public JRXmlAbstractBandSetting<T> addIsSplitAllowed(boolean isSplitAllowed) {
        jrXmlWriteHelper.addAttribute("isSplitAllowed", isSplitAllowed);
        return this;
    }

    public JRXmlAbstractBandSetting<T> addSplitType(SplitTypeEnum splitType) {
        jrXmlWriteHelper.addAttribute("splitType", splitType.getName());
        return this;
    }
    public abstract T build();
}
