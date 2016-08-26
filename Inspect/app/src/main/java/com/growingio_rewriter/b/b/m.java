/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import java.util.HashMap;

public final class m
extends HashMap {
    public int a(String string) {
        Object v2 = this.get(string);
        if (v2 == null) {
            return -1;
        }
        return (Integer)v2;
    }

    public void a(String string, int n2) {
        this.put(string, new Integer(n2));
    }
}

