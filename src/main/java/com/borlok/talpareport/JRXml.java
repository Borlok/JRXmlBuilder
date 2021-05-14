package com.borlok.talpareport;

import net.sf.jasperreports.engine.util.JRXmlWriteHelper;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

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

    public JRXmlHeaderBuilder addHeader() {
        return new JRXmlHeaderBuilder(this);
    }

    public JRXmlStyleBuilder addStyle() {
        return new JRXmlStyleBuilder(this);
    }

    public JRXml addParameter(String value, Class<?> classOfValue) {
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

    public JRXml addParameters(Map<String, Class<?>> parametersMap) {
        try {
            for (Map.Entry<String, Class<?>> parameter : parametersMap.entrySet()) {
                jrXmlWriteHelper.startElement("parameter");
                jrXmlWriteHelper.addAttribute("name", parameter.getKey());
                jrXmlWriteHelper.addAttribute("class", parameter.getValue().getName());
                jrXmlWriteHelper.closeElement();
            }
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
        return this;
    }

    public JRXml addField(String value, Class<?> classOfValue) {
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

    public JRXml addFields(Map<String, Class<?>> fieldsMap) {
        try {
            for (Map.Entry<String, Class<?>> field : fieldsMap.entrySet()) {
                jrXmlWriteHelper.startElement("field");
                jrXmlWriteHelper.addAttribute("name", field.getKey());
                jrXmlWriteHelper.addAttribute("class", field.getValue().getName());
                jrXmlWriteHelper.closeElement();
            }
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
        return this;
    }

    public JRXmlTitleBuilder addTitle() {
        return new JRXmlTitleBuilder(this);
    }

    public JRXmlColumnHeaderBuilder addColumnHeader() {
        return new JRXmlColumnHeaderBuilder(this);
    }

    public JRXmlDetailBuilder addDetail() {
        return new JRXmlDetailBuilder(this);
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

    public void buildWithoutClose() {
        try {
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
