/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import com.growingio.e.a.a.a.e.o;
import java.io.OutputStream;

public class h
extends o {
    private long a = 0;

    public h(OutputStream outputStream) {
        super(outputStream);
    }

    @Override
    protected synchronized void a(int n2) {
        this.a += (long)n2;
    }

    public int a() {
        long l2 = this.c();
        if (l2 > Integer.MAX_VALUE) {
            throw new ArithmeticException("The byte count " + l2 + " is too large to be converted to an int");
        }
        return (int)l2;
    }

    public int b() {
        long l2 = this.d();
        if (l2 > Integer.MAX_VALUE) {
            throw new ArithmeticException("The byte count " + l2 + " is too large to be converted to an int");
        }
        return (int)l2;
    }

    public synchronized long c() {
        return this.a;
    }

    public synchronized long d() {
        long l2 = this.a;
        this.a = 0;
        return l2;
    }
}

