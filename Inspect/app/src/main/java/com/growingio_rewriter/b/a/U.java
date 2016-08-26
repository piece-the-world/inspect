/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

public class U {
    private String a;
    private int b;
    private int c;
    private boolean d;

    public U(String string) {
        this.a = string;
        this.c = 0;
        this.b = 0;
        this.d = false;
    }

    public boolean a() {
        return this.b < this.a.length();
    }

    public boolean b() {
        return this.d;
    }

    public char c() {
        return this.a.charAt(this.c);
    }

    public boolean d() {
        char c2 = this.c();
        return c2 == 'D' || c2 == 'J';
    }

    public int e() {
        int n2;
        char c2;
        if ((c2 = this.a.charAt(n2 = this.b++)) == '(') {
            c2 = this.a.charAt(++n2);
            this.d = true;
        }
        if (c2 == ')') {
            ++this.b;
            c2 = this.a.charAt(++n2);
            this.d = false;
        }
        while (c2 == '[') {
            c2 = this.a.charAt(++n2);
        }
        if (c2 == 'L') {
            if ((n2 = this.a.indexOf(59, n2) + 1) <= 0) {
                throw new IndexOutOfBoundsException("bad descriptor");
            }
        } else {
            ++n2;
        }
        this.c = this.b;
        this.b = n2;
        return this.c;
    }
}

