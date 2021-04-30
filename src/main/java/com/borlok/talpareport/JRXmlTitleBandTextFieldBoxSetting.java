package com.borlok.talpareport;


import static com.borlok.talpareport.JRXml.jrXmlWriteHelper;

public class JRXmlTitleBandTextFieldBoxSetting extends JRXmlAbstractBandTextFieldBoxSetting<JRXmlTitleBandTextFieldBox> {

    public JRXmlTitleBandTextFieldBoxSetting(JRXmlTitleBandTextFieldBox parentElement) {
        super(parentElement);
    }

    @Override
    public JRXmlTitleBandTextFieldBoxSetting addPadding(Integer padding) {
        jrXmlWriteHelper.addAttribute("padding", padding);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldBoxSetting addLeftPadding(Integer leftPadding) {
        jrXmlWriteHelper.addAttribute("leftPadding", leftPadding);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldBoxSetting addRightPadding(Integer rightPadding) {
        jrXmlWriteHelper.addAttribute("rightPadding", rightPadding);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldBoxSetting addTopPadding(Integer topPadding) {
        jrXmlWriteHelper.addAttribute("topPadding", topPadding);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldBoxSetting addBottomPadding(Integer bottomPadding) {
        jrXmlWriteHelper.addAttribute("bottomPadding", bottomPadding);
        return this;
    }

    @Override
    public JRXmlTitleBandTextFieldBox build() {
        return parentElement;
    }
}
