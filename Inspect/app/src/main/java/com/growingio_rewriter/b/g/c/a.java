/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g.c;

public class a
extends Exception {
    private Exception a;

    public a() {
        this.a = null;
    }

    public a(Exception exception) {
        this.a = exception;
    }

    @Override
    public String toString() {
        if (this.a == null) {
            return super.toString();
        }
        return this.a.toString();
    }
}

