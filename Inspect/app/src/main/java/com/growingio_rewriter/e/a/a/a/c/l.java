/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import com.growingio.e.a.a.a.c.p;
import java.io.IOException;
import java.io.InputStream;

public class l
extends p {
    private long a;

    public l(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public synchronized long skip(long l2) throws IOException {
        long l3 = super.skip(l2);
        this.a += l3;
        return l3;
    }

    @Override
    protected synchronized void a(int n2) {
        if (n2 != -1) {
            this.a += (long)n2;
        }
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

