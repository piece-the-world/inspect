/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

public class ae
extends Exception {
    public ae(String string) {
        super(string);
    }

    public ae(String string, Exception exception) {
        super(string + " because of " + exception.toString());
    }
}

