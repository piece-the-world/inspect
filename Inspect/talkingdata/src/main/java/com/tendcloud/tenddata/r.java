/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

public class r
extends Exception {
    private static final long a = 3731842424390998726L;
    private int b;

    public r(int n2) {
        this.b = n2;
    }

    public r(int n2, String string) {
        super(string);
        this.b = n2;
    }

    public r(int n2, Throwable throwable) {
        super(throwable);
        this.b = n2;
    }

    public r(int n2, String string, Throwable throwable) {
        super(string, throwable);
        this.b = n2;
    }

    public int a() {
        return this.b;
    }
}

