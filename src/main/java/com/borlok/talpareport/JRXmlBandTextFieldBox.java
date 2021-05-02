package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlBandTextFieldBox extends JRXmlAbstractBandTextFieldBox<JRXmlBandTextField> {

    public JRXmlBandTextFieldBox(JRXmlBandTextField parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxSettingBuilder<JRXmlBandTextFieldBox> addBoxSetting() {
        return new JRXmlBandTextFieldBoxSettingBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlBandTextFieldBox> addPen() {
        return new JRXmlBandTextFieldBoxPenBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlBandTextFieldBox> addRightPen() {
        return new JRXmlBandTextFieldBoxRightPenBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlBandTextFieldBox> addLeftPen() {
        return new JRXmlBandTextFieldBoxLeftPenBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlBandTextFieldBox> addTopPen() {
        return new JRXmlBandTextFieldBoxTopPenBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlBandTextFieldBox> addBottomPen() {
        return new JRXmlBandTextFieldBoxBottomPenBuilder(this);
    }

    @Override
    public JRXmlBandTextField build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
