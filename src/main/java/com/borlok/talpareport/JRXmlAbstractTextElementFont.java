package com.borlok.talpareport;

public abstract class JRXmlAbstractTextElementFont<T> {
    protected T parentElement;

    public JRXmlAbstractTextElementFont(T parentElement) {
        this.parentElement = parentElement;
    }

    public abstract T build();
}
