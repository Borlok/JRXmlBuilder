package com.borlok.talpareport;

import net.sf.jasperreports.engine.util.JRXmlWriteHelper;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class JRXml {
    protected static JRXmlWriteHelper jrXmlWriteHelper;
    private boolean isCreated;
    private Writer writer;

    public JRXml() {
    }

    public JRXml setPathForJRXlmSave(String path) {
        try {
            writer = new FileWriter(path);
            jrXmlWriteHelper = new JRXmlWriteHelper(writer);
            return this;
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
        return this;
    }

    public JRXmlHeaderBuilder addHeaderBuilder() {
        return new JRXmlHeaderBuilder(this);
    }

    public JRXmlStyleBuilder addStyleBuilder() {
        return new JRXmlStyleBuilder(this);
    }

    public JRXml addParameter(String value, Class<?> classOfValue) { //TODO addParameters
        try {
            jrXmlWriteHelper.startElement("parameter");
            jrXmlWriteHelper.addAttribute("name", value);
            jrXmlWriteHelper.addAttribute("class", classOfValue.getName());
            jrXmlWriteHelper.closeElement();
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
        return this;
    }

    public JRXml addField(String value, Class<?> classOfValue) {//TODO addFields
        try {
            jrXmlWriteHelper.startElement("field");
            jrXmlWriteHelper.addAttribute("name", value);
            jrXmlWriteHelper.addAttribute("class", classOfValue.getName());
            jrXmlWriteHelper.closeElement();
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
        return this;
    }

    public JRXmlTitleBuilder addTitleBuilder() {
        return new JRXmlTitleBuilder(this);
    }

    public JRXmlColumnHeaderBuilder addColumnHeaderBuilder() {
        return new JRXmlColumnHeaderBuilder(this);
    }

    public JRXml toJRXml() {
        try {
            jrXmlWriteHelper.closeElement();
            isCreated = true;
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
            if (writer == null) throw new NullPointerException("Please set path for JRXml save");
        }
        return this;
    }

    public void build() {
        try {
            if (!isCreated) {
                jrXmlWriteHelper.closeElement();
                isCreated = true;
            }
            jrXmlWriteHelper.getUnderlyingWriter().flush();
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
            if (writer == null) throw new NullPointerException("Please set path for JRXml save");
            throw new IllegalArgumentException("Ошибка при сборе ");
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
