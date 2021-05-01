package com.borlok.talpareport;

import net.sf.jasperreports.engine.type.ModeEnum;
import net.sf.jasperreports.engine.type.PositionTypeEnum;
import net.sf.jasperreports.engine.type.StretchTypeEnum;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public abstract class JRXmlAbstractBandTextFieldReportElement<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldReportElement(T parentElement) {
        this.parentElement = parentElement;
        jrXmlWriteHelper.startElement("reportElement");
    }

    public JRXmlAbstractBandTextFieldReportElement<T> addStyle(String style) {
        jrXmlWriteHelper.addAttribute("style", style);
        return this;
    }

    public JRXmlAbstractBandTextFieldReportElement<T> addPositionType(PositionTypeEnum positionType) {
        jrXmlWriteHelper.addAttribute("positionType", positionType);
        return this;
    }

    public JRXmlAbstractBandTextFieldReportElement<T> addStretchType(StretchTypeEnum stretchType) {
        jrXmlWriteHelper.addAttribute("stretchType", stretchType);
        return this;
    }

    public JRXmlAbstractBandTextFieldReportElement<T> addIsPrintRepeatedValues(boolean isPrintRepeatedValues) {
        jrXmlWriteHelper.addAttribute("isPrintRepeatedValues", isPrintRepeatedValues);
        return this;
    }

    public JRXmlAbstractBandTextFieldReportElement<T> addMode(ModeEnum mode) {
        jrXmlWriteHelper.addAttribute("mode", mode);
        return this;
    }

    public JRXmlAbstractBandTextFieldReportElement<T> addX(Integer x) {
        jrXmlWriteHelper.addAttribute("x", x);
        return this;
    }

    public JRXmlAbstractBandTextFieldReportElement<T> addY(Integer y) {
        jrXmlWriteHelper.addAttribute("y", y);
        return this;
    }

    public JRXmlAbstractBandTextFieldReportElement<T> addWidth(Integer width) {
        jrXmlWriteHelper.addAttribute("width", width);
        return this;
    }

    public JRXmlAbstractBandTextFieldReportElement<T> addHeight(Integer height) {
        jrXmlWriteHelper.addAttribute("height", height);
        return this;
    }

    public JRXmlAbstractBandTextFieldReportElement<T> addIsRemoveLineWhenBlank(boolean isRemoveLineWhenBlank) {
        jrXmlWriteHelper.addAttribute("isRemoveLineWhenBlank", isRemoveLineWhenBlank);
        return this;
    }

    public JRXmlAbstractBandTextFieldReportElement<T> addIsPrintInFirstWholeBand(boolean isPrintInFirstWholeBand) {
        jrXmlWriteHelper.addAttribute("isPrintInFirstWholeBand", isPrintInFirstWholeBand);
        return this;
    }

    public JRXmlAbstractBandTextFieldReportElement<T> addIsPrintWhenDetailOverflows(boolean isPrintWhenDetailOverflows) {
        jrXmlWriteHelper.addAttribute("isPrintWhenDetailOverflows", isPrintWhenDetailOverflows);
        return this;
    }

    public JRXmlAbstractBandTextFieldReportElement<T> addPrintWhenGroupChanges(String printWhenGroupChanges) {
        jrXmlWriteHelper.addAttribute("printWhenGroupChanges", printWhenGroupChanges);
        return this;
    }

    public JRXmlAbstractBandTextFieldReportElement<T> addForecolor(String forecolor) {
        jrXmlWriteHelper.addAttribute("forecolor", forecolor);
        return this;
    }

    public JRXmlAbstractBandTextFieldReportElement<T> addBackcolor(String backcolor) {
        jrXmlWriteHelper.addAttribute("backcolor", backcolor);
        return this;
    }
    public abstract T build();
}
