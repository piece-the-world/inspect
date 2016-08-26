/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.v;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

final class at
extends InputStream {
    private Iterator<? extends v> a;
    private InputStream b;

    public at(Iterator<? extends v> iterator) throws IOException {
        this.a = aU.a(iterator);
        this.a();
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

    private void a() throws IOException {
        this.close();
        if (this.a.hasNext()) {
            this.b = this.a.next().a();
        }
    }

    @Override
    public int available() throws IOException {
        if (this.b == null) {
            return 0;
        }
        return this.b.available();
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public int read() throws IOException {
        if (this.b == null) {
            return -1;
        }
        int n2 = this.b.read();
        if (n2 == -1) {
            this.a();
            return this.read();
        }
        return n2;
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) throws IOException {
        if (this.b == null) {
            return -1;
        }
        int n4 = this.b.read(arrby, n2, n3);
        if (n4 == -1) {
            this.a();
            return this.read(arrby, n2, n3);
        }
        return n4;
    }

    @Override
    public long skip(long l2) throws IOException {
        if (this.b == null || l2 <= 0) {
            return 0;
        }
        long l3 = this.b.skip(l2);
        if (l3 != 0) {
            return l3;
        }
        if (this.read() == -1) {
            return 0;
        }
        return 1 + this.b.skip(l2 - 1);
    }
}

