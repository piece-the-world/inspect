/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g.b;

public class f
extends RuntimeException {
    public f(String string) {
        super(string);
    }

    public f(Exception exception) {
        super("by " + exception.toString());
    }
}

