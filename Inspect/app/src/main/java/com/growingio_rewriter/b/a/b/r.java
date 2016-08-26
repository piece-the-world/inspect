/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.b;

public class r
extends Error {
    private String a;

    public r(String string, Error error) {
        super(error.toString(), error);
        this.a = string;
    }

    public String a() {
        return this.a;
    }
}

