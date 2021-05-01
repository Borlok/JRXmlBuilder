package com.borlok.talpareport;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public abstract class JRXmlAbstractBandTextFieldTextElementFont<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldTextElementFont(T parentElement) {
        this.parentElement = parentElement;
        jrXmlWriteHelper.startElement("font");
    }

    public JRXmlAbstractBandTextFieldTextElementFont<T> addReportFont(String reportFont) {
        jrXmlWriteHelper.addAttribute("reportFont", reportFont);
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementFont<T> addFontName(String fontName) {
        jrXmlWriteHelper.addAttribute("fontName", fontName);
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementFont<T> addSize(Double size) {
        jrXmlWriteHelper.addAttribute("size", size);
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementFont<T> addIsBold(boolean isBold) {
        jrXmlWriteHelper.addAttribute("isBold", isBold);
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementFont<T> addIsItalic(boolean isItalic) {
        jrXmlWriteHelper.addAttribute("isItalic", isItalic);
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementFont<T> addIsUnderline(boolean isUnderline) {
        jrXmlWriteHelper.addAttribute("isUnderline", isUnderline);
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementFont<T> addIsStrikeThrough(boolean isStrikeThrough) {
        jrXmlWriteHelper.addAttribute("isStrikeThrough", isStrikeThrough);
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementFont<T> addPdfFontName(String pdfFontName) {
        jrXmlWriteHelper.addAttribute("pdfFontName", pdfFontName);
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementFont<T> addPdfEncoding(String pdfEncoding) {
        jrXmlWriteHelper.addAttribute("pdfEncoding", pdfEncoding);
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementFont<T> addIsPdfEmbedded(boolean isPdfEmbedded) {
        jrXmlWriteHelper.addAttribute("isPdfEmbedded", isPdfEmbedded);
        return this;
    }

    public abstract T build();
}
