package com.borlok.talpareport;

import net.sf.jasperreports.engine.type.HorizontalTextAlignEnum;
import net.sf.jasperreports.engine.type.LineSpacingEnum;
import net.sf.jasperreports.engine.type.RotationEnum;
import net.sf.jasperreports.engine.type.VerticalTextAlignEnum;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public abstract class JRXmlAbstractBandTextFieldTextElementSetting<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldTextElementSetting(T parentElement) {
        this.parentElement = parentElement;
    }

    public JRXmlAbstractBandTextFieldTextElementSetting<T> addTextAlignment(HorizontalTextAlignEnum textAlignment) {
        jrXmlWriteHelper.addAttribute("textAlignment", textAlignment.getName());
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementSetting<T> addVerticalAlignment(VerticalTextAlignEnum verticalAlignment) {
        jrXmlWriteHelper.addAttribute("verticalAlignment", verticalAlignment.getName());
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementSetting<T> addRotation(RotationEnum rotation) {
        jrXmlWriteHelper.addAttribute("rotation", rotation.getName());
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementSetting<T> addLineSpacing(LineSpacingEnum lineSpacing) {
        jrXmlWriteHelper.addAttribute("lineSpacing", lineSpacing.getName());
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementSetting<T> addIsStyledText(boolean isStyledText) {
        jrXmlWriteHelper.addAttribute("isStyledText", isStyledText);
        return this;
    }

    public JRXmlAbstractBandTextFieldTextElementSetting<T> addMarkup(String markup) {
        jrXmlWriteHelper.addAttribute("markup", markup);
        return this;
    }
    public abstract T build();
}
