package com.borlok.talpareport;

import net.sf.jasperreports.engine.type.HorizontalTextAlignEnum;
import net.sf.jasperreports.engine.type.LineSpacingEnum;
import net.sf.jasperreports.engine.type.RotationEnum;
import net.sf.jasperreports.engine.type.VerticalTextAlignEnum;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitleBandTextFieldTextElement extends JRXmlAbstractBandTextFieldTextElement<JRXmlTitleBandTextField> {

    public JRXmlTitleBandTextFieldTextElement(JRXmlTitleBandTextField parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("textElement");
    }

    @Override
    public JRXmlTitleBandTextFieldTextElement addTextAlignment(HorizontalTextAlignEnum textAlignment) {
        jrXmlWriteHelper.addAttribute("textAlignment", textAlignment.getName());
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldTextElement addVerticalAlignment(VerticalTextAlignEnum verticalAlignment) {
        jrXmlWriteHelper.addAttribute("verticalAlignment", verticalAlignment.getName());
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldTextElement addRotation(RotationEnum rotation) {
        jrXmlWriteHelper.addAttribute("rotation", rotation.getName());
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldTextElement addLineSpacing(LineSpacingEnum lineSpacing) {
        jrXmlWriteHelper.addAttribute("lineSpacing", lineSpacing.getName());
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldTextElement addIsStyledText(boolean isStyledText) {
        jrXmlWriteHelper.addAttribute("isStyledText", isStyledText);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldTextElement addMarkup(String markup) {
        jrXmlWriteHelper.addAttribute("markup", markup);
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
