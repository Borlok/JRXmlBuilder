package com.borlok.talpareport;

import net.sf.jasperreports.engine.type.ModeEnum;
import net.sf.jasperreports.engine.type.PositionTypeEnum;
import net.sf.jasperreports.engine.type.StretchTypeEnum;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitleBandTextFieldReportElement extends JRXmlAbstractBandTextFieldReportElement<JRXmlTitleBandTextField> {

    public JRXmlTitleBandTextFieldReportElement(JRXmlTitleBandTextField parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("reportElement");
    }

    @Override
    public JRXmlTitleBandTextFieldReportElement addStyle(String style) {
        jrXmlWriteHelper.addAttribute("style", style);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldReportElement addPositionType(PositionTypeEnum positionType) {
        jrXmlWriteHelper.addAttribute("positionType", positionType);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldReportElement addStretchType(StretchTypeEnum stretchType) {
        jrXmlWriteHelper.addAttribute("stretchType", stretchType);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldReportElement addIsPrintRepeatedValues(boolean isPrintRepeatedValues) {
        jrXmlWriteHelper.addAttribute("isPrintRepeatedValues", isPrintRepeatedValues);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldReportElement addMode(ModeEnum mode) {
        jrXmlWriteHelper.addAttribute("mode", mode);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldReportElement addX(Integer x) {
        jrXmlWriteHelper.addAttribute("x", x);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldReportElement addY(Integer y) {
        jrXmlWriteHelper.addAttribute("y", y);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldReportElement addWidth(Integer width) {
        jrXmlWriteHelper.addAttribute("width", width);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldReportElement addHeight(Integer height) {
        jrXmlWriteHelper.addAttribute("height", height);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldReportElement addIsRemoveLineWhenBlank(boolean isRemoveLineWhenBlank) {
        jrXmlWriteHelper.addAttribute("isRemoveLineWhenBlank", isRemoveLineWhenBlank);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldReportElement addIsPrintInFirstWholeBand(boolean isPrintInFirstWholeBand) {
        jrXmlWriteHelper.addAttribute("isPrintInFirstWholeBand", isPrintInFirstWholeBand);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldReportElement addIsPrintWhenDetailOverflows(boolean isPrintWhenDetailOverflows) {
        jrXmlWriteHelper.addAttribute("isPrintWhenDetailOverflows", isPrintWhenDetailOverflows);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldReportElement addPrintWhenGroupChanges(String printWhenGroupChanges) {
        jrXmlWriteHelper.addAttribute("printWhenGroupChanges", printWhenGroupChanges);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldReportElement addForecolor(String forecolor) {
        jrXmlWriteHelper.addAttribute("forecolor", forecolor);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldReportElement addBackcolor(String backcolor) {
        jrXmlWriteHelper.addAttribute("backcolor", backcolor);
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
