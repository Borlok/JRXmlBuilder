package com.borlok.talpareport;

import net.sf.jasperreports.engine.type.*;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlStyle {
    private JRXml jrXml;

    public JRXmlStyle(JRXml jrXml) {
        this.jrXml = jrXml;
        jrXmlWriteHelper.startElement("style");
    }

    public JRXmlStyle addName(String name) {
        jrXmlWriteHelper.addAttribute("name", name);
        return this;
    }

    public JRXmlStyle addIsDefault(boolean isDefault) {
        jrXmlWriteHelper.addAttribute("isDefault", isDefault);
        return this;
    }

    public JRXmlStyle addFontName(String fontName) {
        jrXmlWriteHelper.addAttribute("fontName", fontName);
        return this;
    }

    public JRXmlStyle addFontSize(Integer fontSize) {
        jrXmlWriteHelper.addAttribute("fontSize", fontSize);
        return this;
    }

    public JRXmlStyle addPdfEncoding(String encoding) {
        jrXmlWriteHelper.addAttribute("pdfEncoding", encoding);
        return this;
    }

    public JRXmlStyle addPdfFontName(String pathToFont) {
        jrXmlWriteHelper.addAttribute("pdfFontName", pathToFont);
        return this;
    }

    public JRXmlStyle addIsPdfEmbedded (boolean isPdfEmbedded) {
        jrXmlWriteHelper.addAttribute("isPdfEmbedded", isPdfEmbedded);
        return this;
    }

    public JRXmlStyle addParentStyle(String stylePath) {
        jrXmlWriteHelper.addAttribute("style", stylePath);
        return this;
    }

    public JRXmlStyle addMode(ModeEnum mode) {
        jrXmlWriteHelper.addAttribute("mode", mode.getName());
        return this;
    }

    public JRXmlStyle addForecolor(String forecolor) {
        jrXmlWriteHelper.addAttribute("forecolor", forecolor);
        return this;
    }

    public JRXmlStyle addBackcolor(String backcolor) {
        jrXmlWriteHelper.addAttribute("backcolor", backcolor);
        return this;
    }

    public JRXmlStyle addPen(PenEnum pen) {
        jrXmlWriteHelper.addAttribute("pen", pen.getName());
        return this;
    }

    public JRXmlStyle addFill(FillEnum fill) {
        jrXmlWriteHelper.addAttribute("fill", fill.getName());
        return this;
    }

    public JRXmlStyle addBorder(PenEnum border) {
        jrXmlWriteHelper.addAttribute("border", border.getName());
        return this;
    }

    public JRXmlStyle addTopBorder(PenEnum border) {
        jrXmlWriteHelper.addAttribute("topBorder", border.getName());
        return this;
    }

    public JRXmlStyle addLeftBorder(PenEnum border) {
        jrXmlWriteHelper.addAttribute("LeftBorder", border.getName());
        return this;
    }

    public JRXmlStyle addBottomBorder(PenEnum border) {
        jrXmlWriteHelper.addAttribute("bottomBorder", border.getName());
        return this;
    }

    public JRXmlStyle addRightBorder(PenEnum border) {
        jrXmlWriteHelper.addAttribute("rightBorder", border.getName());
        return this;
    }

    public JRXmlStyle addBorderColor(String borderColor) {
        jrXmlWriteHelper.addAttribute("borderColor", borderColor);
        return this;
    }
    public JRXmlStyle addTopBorderColor(String borderColor) {
        jrXmlWriteHelper.addAttribute("topBorderColor", borderColor);
        return this;
    }
    public JRXmlStyle addLeftBorderColor(String borderColor) {
        jrXmlWriteHelper.addAttribute("leftBorderColor", borderColor);
        return this;
    }
    public JRXmlStyle addBottomBorderColor(String borderColor) {
        jrXmlWriteHelper.addAttribute("bottomBorderColor", borderColor);
        return this;
    }
    public JRXmlStyle addRightBorderColor(String borderColor) {
        jrXmlWriteHelper.addAttribute("rightBorderColor", borderColor);
        return this;
    }

    public JRXmlStyle addPadding(Integer padding) {
        jrXmlWriteHelper.addAttribute("padding", padding);
        return this;
    }

    public JRXmlStyle addTopPadding(Integer padding) {
        jrXmlWriteHelper.addAttribute("topPadding", padding);
        return this;
    }

    public JRXmlStyle addLeftPadding(Integer padding) {
        jrXmlWriteHelper.addAttribute("LeftPadding", padding);
        return this;
    }

    public JRXmlStyle addBottomPadding(Integer padding) {
        jrXmlWriteHelper.addAttribute("bottomPadding", padding);
        return this;
    }

    public JRXmlStyle addRightPadding(Integer padding) {
        jrXmlWriteHelper.addAttribute("rightPadding", padding);
        return this;
    }

    public JRXmlStyle addRotation(RotationEnum rotation) {
        jrXmlWriteHelper.addAttribute("rotation", rotation.getName());
        return this;
    }

    public JRXmlStyle addLineSpacing(LineSpacingEnum lineSpacing) {
        jrXmlWriteHelper.addAttribute("lineSpacing", lineSpacing.getName());
        return this;
    }
    public JRXml build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jrXml;
    }
}
