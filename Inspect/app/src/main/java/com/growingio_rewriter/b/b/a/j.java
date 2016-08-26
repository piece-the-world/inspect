/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b.a;

import com.growingio.b.b.a.b;
import com.growingio.b.b.a.n;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;

public class j
extends b {
    protected double a;
    protected int b;

    public j(double d2, int n2) {
        this.a = d2;
        this.b = n2;
    }

    public double c() {
        return this.a;
    }

    public void a(double d2) {
        this.a = d2;
    }

    public int d() {
        return this.b;
    }

    @Override
    public String toString() {
        return Double.toString(this.a);
    }

    @Override
    public void a(x x2) throws e {
        x2.a(this);
    }

    public b a(int n2, b b2) {
        if (b2 instanceof n) {
            return this.a(n2, (n)b2);
        }
        if (b2 instanceof j) {
            return this.a(n2, (j)b2);
        }
        return null;
    }

    private j a(int n2, j j2) {
        int n3 = this.b == 405 || j2.b == 405 ? 405 : 404;
        return j.a(n2, this.a, j2.a, n3);
    }

    private j a(int n2, n n3) {
        return j.a(n2, this.a, n3.a, this.b);
    }

    private static j a(int n2, double d2, double d3, int n3) {
        double d4;
        switch (n2) {
            case 43: {
                d4 = d2 + d3;
                break;
            }
            case 45: {
                d4 = d2 - d3;
                break;
            }
            case 42: {
                d4 = d2 * d3;
                break;
            }
            case 47: {
                d4 = d2 / d3;
                break;
            }
            case 37: {
                d4 = d2 % d3;
                break;
            }
            default: {
                return null;
            }
        }
        return new j(d4, n3);
    }
}

