package com.borlok.talpareport;

import net.sf.jasperreports.engine.type.HorizontalTextAlignEnum;
import net.sf.jasperreports.engine.type.LineSpacingEnum;
import net.sf.jasperreports.engine.type.RotationEnum;
import net.sf.jasperreports.engine.type.VerticalTextAlignEnum;

public abstract class JRXmlAbstractBandTextFieldTextElement<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldTextElement(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldTextElement<T> addTextAlignment(HorizontalTextAlignEnum textAlignment);
    public abstract JRXmlAbstractBandTextFieldTextElement<T> addVerticalAlignment(VerticalTextAlignEnum verticalAlignment);
    public abstract JRXmlAbstractBandTextFieldTextElement<T> addRotation(RotationEnum rotation);
    public abstract JRXmlAbstractBandTextFieldTextElement<T> addLineSpacing(LineSpacingEnum lineSpacing);
    public abstract JRXmlAbstractBandTextFieldTextElement<T> addIsStyledText(boolean isStyledText);
    public abstract JRXmlAbstractBandTextFieldTextElement<T> addMarkup(String markup);

    public abstract T build();
}
