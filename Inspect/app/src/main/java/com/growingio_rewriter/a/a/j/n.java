/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.j.h;
import com.growingio.a.a.j.m;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

class n
extends OutputStream {
    int a;
    int b;
    int c;
    final /* synthetic */ Writer d;
    final /* synthetic */ m e;

    n(m m2, Writer writer) {
        this.e = m2;
        this.d = writer;
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    @Override
    public void write(int n2) throws IOException {
        this.a <<= 8;
        this.a |= n2 & 255;
        this.b += 8;
        while (this.b >= this.e.b.p) {
            int n3 = this.a >> this.b - this.e.b.p & this.e.b.o;
            this.d.write(this.e.b.a(n3));
            ++this.c;
            this.b -= this.e.b.p;
        }
    }

    @Override
    public void flush() throws IOException {
        this.d.flush();
    }

    @Override
    public void close() throws IOException {
        if (this.b > 0) {
            int n2 = this.a << this.e.b.p - this.b & this.e.b.o;
            this.d.write(this.e.b.a(n2));
            ++this.c;
            if (this.e.c != null) {
                while (this.c % this.e.b.q != 0) {
                    this.d.write(this.e.c.charValue());
                    ++this.c;
                }
            }
        }
        this.d.close();
    }
}

