package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitleBandTextFieldBox extends JRXmlAbstractBandTextFieldBox<JRXmlTitleBandTextField> {

    public JRXmlTitleBandTextFieldBox(JRXmlTitleBandTextField parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("box");
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxSettingBuilder<JRXmlTitleBandTextFieldBox> addBoxSettingBuilder() {
        return new JRXmlTitleBandTextFieldBoxSettingBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlTitleBandTextFieldBox> addBoxPenBuilder() {
        return new JRXmlTitleBandTextFieldBoxPenBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlTitleBandTextFieldBox> addBoxRightPenBuilder() {
        return new JRXmlTitleBandTextFieldBoxRightPenBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlTitleBandTextFieldBox> addBoxLeftPenBuilder() {
        return new JRXmlTitleBandTextFieldBoxLeftPenBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlTitleBandTextFieldBox> addBoxTopPenBuilder() {
        return new JRXmlTitleBandTextFieldBoxTopPenBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlTitleBandTextFieldBox> addBoxBottomPenBuilder() {
        return new JRXmlTitleBandTextFieldBoxBottomPenBuilder(this);
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
