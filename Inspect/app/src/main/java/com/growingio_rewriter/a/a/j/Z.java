/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.j.aa;
import com.growingio.a.a.j.ab;
import com.growingio.a.a.j.ac;
import com.growingio.a.a.j.v;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class Z
extends OutputStream {
    private final int a;
    private final boolean b;
    private final v c;
    private OutputStream d;
    private ac e;
    private File f;

    synchronized File a() {
        return this.f;
    }

    public Z(int n2) {
        this(n2, false);
    }

    public Z(int n2, boolean bl2) {
        this.a = n2;
        this.b = bl2;
        this.d = this.e = new ac(null);
        this.c = bl2 ? new aa(this) : new ab(this);
    }

    public v b() {
        return this.c;
    }

    private synchronized InputStream d() throws IOException {
        if (this.f != null) {
            return new FileInputStream(this.f);
        }
        return new ByteArrayInputStream(this.e.a(), 0, this.e.b());
    }

    public synchronized void c() throws IOException {
        try {
            this.close();
        }
        finally {
            if (this.e == null) {
                this.e = new ac(null);
            } else {
                this.e.reset();
            }
            this.d = this.e;
            if (this.f != null) {
                File file = this.f;
                this.f = null;
                if (!file.delete()) {
                    throw new IOException("Could not delete: " + file);
                }
            }
        }
    }

    @Override
    public synchronized void write(int n2) throws IOException {
        this.a(1);
        this.d.write(n2);
    }

    @Override
    public synchronized void write(byte[] arrby) throws IOException {
        this.write(arrby, 0, arrby.length);
    }

    @Override
    public synchronized void write(byte[] arrby, int n2, int n3) throws IOException {
        this.a(n3);
        this.d.write(arrby, n2, n3);
    }

    @Override
    public synchronized void close() throws IOException {
        this.d.close();
    }

    @Override
    public synchronized void flush() throws IOException {
        this.d.flush();
    }

    private void a(int n2) throws IOException {
        if (this.f == null && this.e.b() + n2 > this.a) {
            File file = File.createTempFile("FileBackedOutputStream", null);
            if (this.b) {
                file.deleteOnExit();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(this.e.a(), 0, this.e.b());
            fileOutputStream.flush();
            this.d = fileOutputStream;
            this.f = file;
            this.e = null;
        }
    }

    static /* synthetic */ InputStream a(Z z2) throws IOException {
        return z2.d();
    }
}

