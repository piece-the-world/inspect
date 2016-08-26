/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.ae;
import com.growingio.b.b.e;

public class b
extends Exception {
    private Throwable a;
    private String b;

    @Override
    public Throwable getCause() {
        return this.a == this ? null : this.a;
    }

    @Override
    public synchronized Throwable initCause(Throwable throwable) {
        this.a = throwable;
        return this;
    }

    public String a() {
        if (this.b != null) {
            return this.b;
        }
        return this.toString();
    }

    public b(String string) {
        super(string);
        this.b = string;
        this.initCause(null);
    }

    public b(Throwable throwable) {
        super("by " + throwable.toString());
        this.b = null;
        this.initCause(throwable);
    }

    public b(String string, Throwable throwable) {
        this(string);
        this.initCause(throwable);
    }

    public b(ae ae2) {
        this("cannot find " + ae2.getMessage(), ae2);
    }

    public b(e e2) {
        this("[source error] " + e2.getMessage(), e2);
    }

    public b(ClassNotFoundException classNotFoundException, String string) {
        this("cannot find " + string, classNotFoundException);
    }

    public b(ClassFormatError classFormatError, String string) {
        this("invalid class format: " + string, classFormatError);
    }
}

