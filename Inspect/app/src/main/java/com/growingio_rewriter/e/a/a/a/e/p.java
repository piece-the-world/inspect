/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class p
extends FilterWriter {
    public p(Writer writer) {
        super(writer);
    }

    @Override
    public Writer append(char c2) throws IOException {
        try {
            this.a(1);
            this.out.append(c2);
            this.b(1);
        }
        catch (IOException var2_2) {
            this.a(var2_2);
        }
        return this;
    }

    @Override
    public Writer append(CharSequence charSequence, int n2, int n3) throws IOException {
        try {
            this.a(n3 - n2);
            this.out.append(charSequence, n2, n3);
            this.b(n3 - n2);
        }
        catch (IOException var4_4) {
            this.a(var4_4);
        }
        return this;
    }

    @Override
    public Writer append(CharSequence charSequence) throws IOException {
        try {
            int n2 = 0;
            if (charSequence != null) {
                n2 = charSequence.length();
            }
            this.a(n2);
            this.out.append(charSequence);
            this.b(n2);
        }
        catch (IOException var2_3) {
            this.a(var2_3);
        }
        return this;
    }

    @Override
    public void write(int n2) throws IOException {
        try {
            this.a(1);
            this.out.write(n2);
            this.b(1);
        }
        catch (IOException var2_2) {
            this.a(var2_2);
        }
    }

    @Override
    public void write(char[] arrc) throws IOException {
        try {
            int n2 = 0;
            if (arrc != null) {
                n2 = arrc.length;
            }
            this.a(n2);
            this.out.write(arrc);
            this.b(n2);
        }
        catch (IOException var2_3) {
            this.a(var2_3);
        }
    }

    @Override
    public void write(char[] arrc, int n2, int n3) throws IOException {
        try {
            this.a(n3);
            this.out.write(arrc, n2, n3);
            this.b(n3);
        }
        catch (IOException var4_4) {
            this.a(var4_4);
        }
    }

    @Override
    public void write(String string) throws IOException {
        try {
            int n2 = 0;
            if (string != null) {
                n2 = string.length();
            }
            this.a(n2);
            this.out.write(string);
            this.b(n2);
        }
        catch (IOException var2_3) {
            this.a(var2_3);
        }
    }

    @Override
    public void write(String string, int n2, int n3) throws IOException {
        try {
            this.a(n3);
            this.out.write(string, n2, n3);
            this.b(n3);
        }
        catch (IOException var4_4) {
            this.a(var4_4);
        }
    }

    @Override
    public void flush() throws IOException {
        try {
            this.out.flush();
        }
        catch (IOException var1_1) {
            this.a(var1_1);
        }
    }

    @Override
    public void close() throws IOException {
        try {
            this.out.close();
        }
        catch (IOException var1_1) {
            this.a(var1_1);
        }
    }

    protected void a(int n2) throws IOException {
    }

    protected void b(int n2) throws IOException {
    }

    protected void a(IOException iOException) throws IOException {
        throw iOException;
    }
}

