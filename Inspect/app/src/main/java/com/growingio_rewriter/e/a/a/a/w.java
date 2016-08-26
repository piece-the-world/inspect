/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

import com.growingio.e.a.a.a.u;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class w
implements Iterator<String> {
    private final BufferedReader a;
    private String b;
    private boolean c = false;

    public w(Reader reader) throws IllegalArgumentException {
        if (reader == null) {
            throw new IllegalArgumentException("Reader must not be null");
        }
        this.a = reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader);
    }

    @Override
    public boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        if (this.c) {
            return false;
        }
        try {
            String string;
            do {
                if ((string = this.a.readLine()) != null) continue;
                this.c = true;
                return false;
            } while (!this.a(string));
            this.b = string;
            return true;
        }
        catch (IOException var1_2) {
            this.c();
            throw new IllegalStateException(var1_2);
        }
    }

    protected boolean a(String string) {
        return true;
    }

    public String a() {
        return this.b();
    }

    public String b() {
        if (!this.hasNext()) {
            throw new NoSuchElementException("No more lines");
        }
        String string = this.b;
        this.b = null;
        return string;
    }

    public void c() {
        this.c = true;
        u.a(this.a);
        this.b = null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove unsupported on LineIterator");
    }

    public static void a(w w2) {
        if (w2 != null) {
            w2.c();
        }
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

