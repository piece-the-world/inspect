/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

class a
extends Writer {
    private final Appendable a;
    private boolean b;

    a(Appendable appendable) {
        this.a = aU.a(appendable);
    }

    @Override
    public void write(char[] arrc, int n2, int n3) throws IOException {
        this.a();
        this.a.append(new String(arrc, n2, n3));
    }

    @Override
    public void flush() throws IOException {
        this.a();
        if (this.a instanceof Flushable) {
            ((Flushable)((Object)this.a)).flush();
        }
    }

    @Override
    public void close() throws IOException {
        this.b = true;
        if (this.a instanceof Closeable) {
            ((Closeable)((Object)this.a)).close();
        }
    }

    @Override
    public void write(int n2) throws IOException {
        this.a();
        this.a.append((char)n2);
    }

    @Override
    public void write(String string) throws IOException {
        this.a();
        this.a.append(string);
    }

    @Override
    public void write(String string, int n2, int n3) throws IOException {
        this.a();
        this.a.append(string, n2, n2 + n3);
    }

    @Override
    public Writer append(char c2) throws IOException {
        this.a();
        this.a.append(c2);
        return this;
    }

    @Override
    public Writer append(CharSequence charSequence) throws IOException {
        this.a();
        this.a.append(charSequence);
        return this;
    }

    @Override
    public Writer append(CharSequence charSequence, int n2, int n3) throws IOException {
        this.a();
        this.a.append(charSequence, n2, n3);
        return this;
    }

    private void a() throws IOException {
        if (this.b) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }
}

