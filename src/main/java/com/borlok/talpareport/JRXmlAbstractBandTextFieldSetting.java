package com.borlok.talpareport;

import net.sf.jasperreports.engine.type.EvaluationTimeEnum;
import net.sf.jasperreports.engine.type.TextAdjustEnum;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public abstract class JRXmlAbstractBandTextFieldSetting<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldSetting(T parentElement) {
        this.parentElement = parentElement;
    }

    public JRXmlAbstractBandTextFieldSetting<T> addTextAdjust(TextAdjustEnum textAdjust) {
        jrXmlWriteHelper.addAttribute("textAdjust", textAdjust.getName());
        return this;
    }

    public JRXmlAbstractBandTextFieldSetting<T> addEvaluationTime(EvaluationTimeEnum evaluationTime) {
        jrXmlWriteHelper.addAttribute("evaluationTime", evaluationTime.getName());
        return this;
    }

    public JRXmlAbstractBandTextFieldSetting<T> addEvaluationGroup(String evaluationGroup) {
        jrXmlWriteHelper.addAttribute("evaluationGroup", evaluationGroup);
        return this;
    }

    public JRXmlAbstractBandTextFieldSetting<T> addPattern(String pattern) {
        jrXmlWriteHelper.addAttribute("pattern", pattern);
        return this;
    }

    public JRXmlAbstractBandTextFieldSetting<T> addIsBlankWhenNull(boolean isBlankWhenNull) {
        jrXmlWriteHelper.addAttribute("isBlankWhenNull", isBlankWhenNull);
        return this;
    }

    public JRXmlAbstractBandTextFieldSetting<T> addHyperlinkType(String hyperlinkType) {
        jrXmlWriteHelper.addAttribute("hyperlinkType", hyperlinkType);
        return this;
    }

    public JRXmlAbstractBandTextFieldSetting<T> addHyperlinkTarget(String hyperlinkTarget) {
        jrXmlWriteHelper.addAttribute("hyperlinkTarget", hyperlinkTarget);
        return this;
    }

    public JRXmlAbstractBandTextFieldSetting<T> addBookmarkLevel(Integer bookmarkLevel) {
        jrXmlWriteHelper.addAttribute("bookmarkLevel", bookmarkLevel);
        return this;
    }

    public abstract T build();
}
