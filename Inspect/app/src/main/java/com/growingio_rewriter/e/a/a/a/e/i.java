/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import com.growingio.e.a.a.a.e.c;
import com.growingio.e.a.a.a.e.t;
import com.growingio.e.a.a.a.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class i
extends t {
    private c a;
    private OutputStream b;
    private File c;
    private final String d;
    private final String e;
    private final File f;
    private boolean g = false;

    public i(int n2, File file) {
        this(n2, file, null, null, null);
    }

    public i(int n2, String string, String string2, File file) {
        this(n2, null, string, string2, file);
        if (string == null) {
            throw new IllegalArgumentException("Temporary file prefix is missing");
        }
    }

    private i(int n2, File file, String string, String string2, File file2) {
        super(n2);
        this.c = file;
        this.b = this.a = new c();
        this.d = string;
        this.e = string2;
        this.f = file2;
    }

    @Override
    protected OutputStream a() throws IOException {
        return this.b;
    }

    @Override
    protected void b() throws IOException {
        if (this.d != null) {
            this.c = File.createTempFile(this.d, this.e, this.f);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(this.c);
        try {
            this.a.a(fileOutputStream);
        }
        catch (IOException var2_2) {
            fileOutputStream.close();
            throw var2_2;
        }
        this.b = fileOutputStream;
        this.a = null;
    }

    public boolean c() {
        return !this.h();
    }

    public byte[] d() {
        if (this.a != null) {
            return this.a.d();
        }
        return null;
    }

    public File e() {
        return this.c;
    }

    @Override
    public void close() throws IOException {
        super.close();
        this.g = true;
    }

    public void a(OutputStream outputStream) throws IOException {
        if (!this.g) {
            throw new IOException("Stream not closed");
        }
        if (this.c()) {
            this.a.a(outputStream);
        } else {
            FileInputStream fileInputStream = new FileInputStream(this.c);
            try {
                u.a((InputStream)fileInputStream, outputStream);
            }
            finally {
                u.a(fileInputStream);
            }
        }
    }
}

