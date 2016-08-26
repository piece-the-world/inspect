/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.T;
import com.growingio.a.a.j.ae;
import com.growingio.a.a.j.af;
import com.growingio.a.a.j.v;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

final class ai
extends v {
    private final File a;

    private ai(File file) {
        this.a = aU.a(file);
    }

    public FileInputStream h() throws IOException {
        return new FileInputStream(this.a);
    }

    @Override
    public aP<Long> d() {
        if (this.a.isFile()) {
            return aP.b(this.a.length());
        }
        return aP.f();
    }

    @Override
    public long e() throws IOException {
        if (!this.a.isFile()) {
            throw new FileNotFoundException(this.a.toString());
        }
        return this.a.length();
    }

    @Override
    public byte[] f() throws IOException {
        T t2 = T.a();
        try {
            FileInputStream fileInputStream = t2.a(this.h());
            byte[] arrby = ae.a(fileInputStream, fileInputStream.getChannel().size());
            return arrby;
        }
        catch (Throwable var2_3) {
            throw t2.a(var2_3);
        }
        finally {
            t2.close();
        }
    }

    public String toString() {
        return "Files.asByteSource(" + this.a + ")";
    }

    @Override
    public /* synthetic */ InputStream a() throws IOException {
        return this.h();
    }

    /* synthetic */ ai(File file, af af2) {
        this(file);
    }
}

