/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g.a;

import java.lang.reflect.InvocationTargetException;

public class b
extends RuntimeException {
    private Throwable a = null;

    public Throwable a() {
        return this.a;
    }

    public b(String string) {
        super(string);
    }

    public b(InvocationTargetException invocationTargetException) {
        super("by " + invocationTargetException.getTargetException().toString());
        this.a = invocationTargetException.getTargetException();
    }

    public b(IllegalAccessException illegalAccessException) {
        super("by " + illegalAccessException.toString());
        this.a = illegalAccessException;
    }

    public b(ClassNotFoundException classNotFoundException) {
        super("by " + classNotFoundException.toString());
        this.a = classNotFoundException;
    }
}

