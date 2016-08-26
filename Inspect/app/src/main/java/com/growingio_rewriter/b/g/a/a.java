/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g.a;

public class a
extends Exception {
    public a(String string) {
        super(string);
    }

    public a(Exception exception) {
        super("by " + exception.toString());
    }
}

