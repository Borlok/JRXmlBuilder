package com.borlok.talpareport;

import java.io.IOException;

import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlColumnHeaderBandTextFieldBox extends JRXmlAbstractBandTextFieldBox<JRXmlColumnHeaderBandTextField> {
    //TODO notrea
    public JRXmlColumnHeaderBandTextFieldBox(JRXmlColumnHeaderBandTextField parentElement) {
        super(parentElement);
        jrXmlWriteHelper.startElement("box");
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxSettingBuilder<JRXmlColumnHeaderBandTextFieldBox> addBoxSettingBuilder() {
        return new JRXmlColumnHeaderBandTextFieldBoxSettingBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlColumnHeaderBandTextFieldBox> addBoxPenBuilder() {
        return new JRXmlColumnHeaderBandTextFieldBoxPenBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlColumnHeaderBandTextFieldBox> addBoxRightPenBuilder() {
        return new JRXmlColumnHeaderBandTextFieldBoxRightPenBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlColumnHeaderBandTextFieldBox> addBoxLeftPenBuilder() {
        return new JRXmlColumnHeaderBandTextFieldBoxLeftPenBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlColumnHeaderBandTextFieldBox> addBoxTopPenBuilder() {
        return new JRXmlColumnHeaderBandTextFieldBoxTopPenBuilder(this);
    }

    @Override
    public JRXmlAbstractBandTextFieldBoxPenBuilder<JRXmlColumnHeaderBandTextFieldBox> addBoxBottomPenBuilder() {
        return new JRXmlColumnHeaderBandTextFieldBoxBottomPenBuilder(this);
    }

    @Override
    public JRXmlColumnHeaderBandTextField build() {
        try {
            jrXmlWriteHelper.closeElement();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parentElement;
    }
}
