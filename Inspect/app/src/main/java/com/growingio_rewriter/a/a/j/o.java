/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.j.h;
import com.growingio.a.a.j.k;
import com.growingio.a.a.j.m;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

class o
extends InputStream {
    int a;
    int b;
    int c;
    boolean d;
    final com.growingio.a.a.b.m e;
    final /* synthetic */ Reader f;
    final /* synthetic */ m g;

    o(m m2, Reader reader) {
        this.g = m2;
        this.f = reader;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = false;
        this.e = this.g.a();
    }

    @Override
    public int read() throws IOException {
        do {
            int n2;
            if ((n2 = this.f.read()) == -1) {
                if (!this.d && !this.g.b.b(this.c)) {
                    throw new k("Invalid input length " + this.c);
                }
                return -1;
            }
            ++this.c;
            char c2 = (char)n2;
            if (this.e.c(c2)) {
                if (!(this.d || this.c != 1 && this.g.b.b(this.c - 1))) {
                    throw new k("Padding cannot start at index " + this.c);
                }
                this.d = true;
                continue;
            }
            if (this.d) {
                throw new k("Expected padding character but found '" + c2 + "' at index " + this.c);
            }
            this.a <<= this.g.b.p;
            this.a |= this.g.b.f(c2);
            this.b += this.g.b.p;
            if (this.b >= 8) break;
        } while (true);
        this.b -= 8;
        return this.a >> this.b & 255;
    }

    @Override
    public void close() throws IOException {
        this.f.close();
    }
}

