/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g.b;

public class d
extends Exception {
    public d(String string) {
        super(string + " is not exported");
    }

    public d(String string, Exception exception) {
        super(string + " because of " + exception.toString());
    }
}

