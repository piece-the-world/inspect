/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

final class ff {
    private String a = null;
    private String b = null;
    private String c = null;
    private String d;
    private String e;
    private a f;
    private int g;

    ff() {
    }

    ff(String string, String string2, String string3) {
        this.c = string;
        this.b = string2;
        this.a = string3;
    }

    ff(String string, String string2, a a2, int n2) {
        this.e = string;
        this.f = a2;
        this.d = string2;
        this.g = n2;
    }

    String a() {
        return this.b;
    }

    String b() {
        return this.c;
    }

    String c() {
        return this.a;
    }

    String d() {
        return this.e;
    }

    String e() {
        return this.d;
    }

    a f() {
        return this.f;
    }

    int g() {
        return this.g;
    }

    static enum a {
        a(0),
        b(1),
        c(2),
        d(3),
        e(4),
        f(11),
        g(12),
        h(13);
        
        private final int i;

        private a(int n3) {
            this.i = n3;
        }

        public int a() {
            return this.i;
        }
    }

}

