package com.borlok.talpareport;

import net.sf.jasperreports.engine.type.LineSpacingEnum;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public abstract class JRXmlAbstractBandTextFieldTextElementParagraph<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldTextElementParagraph(T parentElement) {
        this.parentElement = parentElement;
        jrXmlWriteHelper.startElement("paragraph");
    }

    public JRXmlAbstractBandTextFieldTextElementParagraph<T> addLineSpacing(LineSpacingEnum lineSpacing) {
        jrXmlWriteHelper.addAttribute("lineSpacing", lineSpacing.getName());
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementParagraph<T> addLineSpacingSize(Double lineSpacingSize) {
        jrXmlWriteHelper.addAttribute("lineSpacingSize", lineSpacingSize);
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementParagraph<T> addFirstLineIndent(Double firstLineIndent) {
        jrXmlWriteHelper.addAttribute("firstLineIndent", firstLineIndent);
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementParagraph<T> addLeftIndent(Double leftIndent) {
        jrXmlWriteHelper.addAttribute("leftIndent", leftIndent);
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementParagraph<T> addRightIndent(Double rightIndent) {
        jrXmlWriteHelper.addAttribute("rightIndent", rightIndent);
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementParagraph<T> addSpacingBefore(Double spacingBefore) {
        jrXmlWriteHelper.addAttribute("spacingBefore", spacingBefore);
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementParagraph<T> addSpacingAfter(Double spacingAfter) {
        jrXmlWriteHelper.addAttribute("spacingAfter", spacingAfter);
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementParagraph<T> addTabStopWidth(Double tabStopWidth) {
        jrXmlWriteHelper.addAttribute("tabStopWidth", tabStopWidth);
        return this;
    }
    public abstract T build();
}
