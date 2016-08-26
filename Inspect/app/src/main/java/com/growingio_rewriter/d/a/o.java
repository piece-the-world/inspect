/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

final class o {
    int a;
    int b;
    int c;
    long d;
    String e;
    String f;
    String g;
    int h;
    o i;

    o() {
    }

    o(int n2) {
        this.a = n2;
    }

    o(int n2, o o2) {
        this.a = n2;
        this.b = o2.b;
        this.c = o2.c;
        this.d = o2.d;
        this.e = o2.e;
        this.f = o2.f;
        this.g = o2.g;
        this.h = o2.h;
    }

    void a(int n2) {
        this.b = 3;
        this.c = n2;
        this.h = Integer.MAX_VALUE & this.b + n2;
    }

    void a(long l2) {
        this.b = 5;
        this.d = l2;
        this.h = Integer.MAX_VALUE & this.b + (int)l2;
    }

    void a(float f2) {
        this.b = 4;
        this.c = Float.floatToRawIntBits(f2);
        this.h = Integer.MAX_VALUE & this.b + (int)f2;
    }

    void a(double d2) {
        this.b = 6;
        this.d = Double.doubleToRawLongBits(d2);
        this.h = Integer.MAX_VALUE & this.b + (int)d2;
    }

    void a(int n2, String string, String string2, String string3) {
        this.b = n2;
        this.e = string;
        this.f = string2;
        this.g = string3;
        switch (n2) {
            case 7: {
                this.c = 0;
            }
            case 1: 
            case 8: 
            case 16: 
            case 30: {
                this.h = Integer.MAX_VALUE & n2 + string.hashCode();
                return;
            }
            case 12: {
                this.h = Integer.MAX_VALUE & n2 + string.hashCode() * string2.hashCode();
                return;
            }
        }
        this.h = Integer.MAX_VALUE & n2 + string.hashCode() * string2.hashCode() * string3.hashCode();
    }

    void a(String string, String string2, int n2) {
        this.b = 18;
        this.d = n2;
        this.e = string;
        this.f = string2;
        this.h = Integer.MAX_VALUE & 18 + n2 * this.e.hashCode() * this.f.hashCode();
    }

    void a(int n2, int n3) {
        this.b = 33;
        this.c = n2;
        this.h = n3;
    }

    boolean a(o o2) {
        switch (this.b) {
            case 1: 
            case 7: 
            case 8: 
            case 16: 
            case 30: {
                return o2.e.equals(this.e);
            }
            case 5: 
            case 6: 
            case 32: {
                return o2.d == this.d;
            }
            case 3: 
            case 4: {
                return o2.c == this.c;
            }
            case 31: {
                return o2.c == this.c && o2.e.equals(this.e);
            }
            case 12: {
                return o2.e.equals(this.e) && o2.f.equals(this.f);
            }
            case 18: {
                return o2.d == this.d && o2.e.equals(this.e) && o2.f.equals(this.f);
            }
        }
        return o2.e.equals(this.e) && o2.f.equals(this.f) && o2.g.equals(this.g);
    }
}

