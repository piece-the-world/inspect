/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.d;

import java.io.File;
import java.io.Serializable;

public class e
implements Serializable {
    private static final long b = -2505664948818681153L;
    static final e[] a = new e[0];
    private final e c;
    private e[] d;
    private final File e;
    private String f;
    private boolean g;
    private boolean h;
    private long i;
    private long j;

    public e(File file) {
        this(null, file);
    }

    public e(e e2, File file) {
        if (file == null) {
            throw new IllegalArgumentException("File is missing");
        }
        this.e = file;
        this.c = e2;
        this.f = file.getName();
    }

    public boolean a(File file) {
        boolean bl2 = this.g;
        long l2 = this.i;
        boolean bl3 = this.h;
        long l3 = this.j;
        this.f = file.getName();
        this.g = file.exists();
        this.h = this.g && file.isDirectory();
        this.i = this.g ? file.lastModified() : 0;
        this.j = this.g && !this.h ? file.length() : 0;
        return this.g != bl2 || this.i != l2 || this.h != bl3 || this.j != l3;
    }

    public e b(File file) {
        return new e(this, file);
    }

    public e a() {
        return this.c;
    }

    public int b() {
        return this.c == null ? 0 : this.c.b() + 1;
    }

    public e[] c() {
        return this.d != null ? this.d : a;
    }

    public void a(e[] arre) {
        this.d = arre;
    }

    public File d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public void a(String string) {
        this.f = string;
    }

    public long f() {
        return this.i;
    }

    public void a(long l2) {
        this.i = l2;
    }

    public long g() {
        return this.j;
    }

    public void b(long l2) {
        this.j = l2;
    }

    public boolean h() {
        return this.g;
    }

    public void a(boolean bl2) {
        this.g = bl2;
    }

    public boolean i() {
        return this.h;
    }

    public void b(boolean bl2) {
        this.h = bl2;
    }
}

