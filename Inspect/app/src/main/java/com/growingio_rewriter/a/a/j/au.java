/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.J;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

class au
extends Reader {
    private final Iterator<? extends J> a;
    private Reader b;

    au(Iterator<? extends J> iterator) throws IOException {
        this.a = iterator;
        this.a();
    }

    private void a() throws IOException {
        this.close();
        if (this.a.hasNext()) {
            this.b = this.a.next().a();
        }
    }

    @Override
    public int read(char[] arrc, int n2, int n3) throws IOException {
        if (this.b == null) {
            return -1;
        }
        int n4 = this.b.read(arrc, n2, n3);
        if (n4 == -1) {
            this.a();
            return this.read(arrc, n2, n3);
        }
        return n4;
    }

    @Override
    public long skip(long l2) throws IOException {
        aU.a(l2 >= 0, (Object)"n is negative");
        if (l2 > 0) {
            while (this.b != null) {
                long l3 = this.b.skip(l2);
                if (l3 > 0) {
                    return l3;
                }
                this.a();
            }
        }
        return 0;
    }

    @Override
    public boolean ready() throws IOException {
        return this.b != null && this.b.ready();
    }

    @Override
    public void close() throws IOException {
        if (this.b != null) {
            try {
                this.b.close();
            }
            finally {
                this.b = null;
            }
        }
    }
}

