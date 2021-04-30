package com.borlok.talpareport;

import net.sf.jasperreports.engine.type.ModeEnum;
import net.sf.jasperreports.engine.type.PositionTypeEnum;
import net.sf.jasperreports.engine.type.StretchTypeEnum;

public abstract class JRXmlAbstractBandTextFieldReportElement<T> {
    protected T parentElement;

    public JRXmlAbstractBandTextFieldReportElement(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract JRXmlAbstractBandTextFieldReportElement<T> addStyle(String style);
    public abstract JRXmlAbstractBandTextFieldReportElement<T> addPositionType(PositionTypeEnum positionType);
    public abstract JRXmlAbstractBandTextFieldReportElement<T> addStretchType(StretchTypeEnum stretchType);
    public abstract JRXmlAbstractBandTextFieldReportElement<T> addIsPrintRepeatedValues(boolean isPrintRepeatedValues);
    public abstract JRXmlAbstractBandTextFieldReportElement<T> addMode(ModeEnum mode);
    public abstract JRXmlAbstractBandTextFieldReportElement<T> addX(Integer x);
    public abstract JRXmlAbstractBandTextFieldReportElement<T> addY(Integer y);
    public abstract JRXmlAbstractBandTextFieldReportElement<T> addWidth(Integer width);
    public abstract JRXmlAbstractBandTextFieldReportElement<T> addHeight(Integer height);
    public abstract JRXmlAbstractBandTextFieldReportElement<T> addIsRemoveLineWhenBlank(boolean isRemoveLineWhenBlank);
    public abstract JRXmlAbstractBandTextFieldReportElement<T> addIsPrintInFirstWholeBand(boolean isPrintInFirstWholeBand);
    public abstract JRXmlAbstractBandTextFieldReportElement<T> addIsPrintWhenDetailOverflows(boolean isPrintWhenDetailOverflows);
    public abstract JRXmlAbstractBandTextFieldReportElement<T> addPrintWhenGroupChanges(String printWhenGroupChanges);
    public abstract JRXmlAbstractBandTextFieldReportElement<T> addForecolor(String forecolor);
    public abstract JRXmlAbstractBandTextFieldReportElement<T> addBackcolor(String backcolor);

    public abstract T build();
}
