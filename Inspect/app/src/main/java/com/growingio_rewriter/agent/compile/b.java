/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

public class b {
    private final byte[] a;
    private final boolean b;
    private final byte[] c;
    private final String d;

    public b(byte[] arrby, String string, byte[] arrby2, boolean bl2) {
        this.a = arrby;
        this.d = string;
        this.c = arrby2;
        this.b = bl2;
    }

    public b(byte[] arrby, boolean bl2) {
        this(arrby, null, null, bl2);
    }

    public byte[] a() {
        return this.a;
    }

    public String b() {
        return this.d;
    }

    public byte[] c() {
        return this.c;
    }

    public boolean d() {
        return this.d != null;
    }

    public boolean e() {
        return this.b;
    }
}

