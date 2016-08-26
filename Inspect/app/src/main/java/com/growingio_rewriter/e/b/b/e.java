/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.b.b;

public class e {
    public static e a = new e(null);
    private String b;
    private Throwable c;
    private Object[] d;

    public e(String string) {
        this(string, null, null);
    }

    public e(String string, Object[] arrobject, Throwable throwable) {
        this.b = string;
        this.c = throwable;
        this.d = arrobject;
    }

    public String a() {
        return this.b;
    }

    public Object[] b() {
        return this.d;
    }

    public Throwable c() {
        return this.c;
    }
}

