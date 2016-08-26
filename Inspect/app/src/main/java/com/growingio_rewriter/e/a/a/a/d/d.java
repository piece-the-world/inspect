/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.d;

import com.growingio.e.a.a.a.a.g;
import com.growingio.e.a.a.a.d.a;
import com.growingio.e.a.a.a.d.e;
import com.growingio.e.a.a.a.o;
import com.growingio.e.a.a.a.s;
import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class d
implements Serializable {
    private static final long a = 1185122225658782848L;
    private final List<a> b = new CopyOnWriteArrayList<a>();
    private final e c;
    private final FileFilter d;
    private final Comparator<File> e;

    public d(String string) {
        this(new File(string));
    }

    public d(String string, FileFilter fileFilter) {
        this(new File(string), fileFilter);
    }

    public d(String string, FileFilter fileFilter, s s2) {
        this(new File(string), fileFilter, s2);
    }

    public d(File file) {
        this(file, null);
    }

    public d(File file, FileFilter fileFilter) {
        this(file, fileFilter, null);
    }

    public d(File file, FileFilter fileFilter, s s2) {
        this(new e(file), fileFilter, s2);
    }

    protected d(e e2, FileFilter fileFilter, s s2) {
        if (e2 == null) {
            throw new IllegalArgumentException("Root entry is missing");
        }
        if (e2.d() == null) {
            throw new IllegalArgumentException("Root directory is missing");
        }
        this.c = e2;
        this.d = fileFilter;
        this.e = s2 == null || s2.equals(s.c) ? g.e : (s2.equals(s.b) ? g.c : g.a);
    }

    public File a() {
        return this.c.d();
    }

    public FileFilter b() {
        return this.d;
    }

    public void a(a a2) {
        if (a2 != null) {
            this.b.add(a2);
        }
    }

    public void b(a a2) {
        if (a2 != null) {
            while (this.b.remove(a2)) {
            }
        }
    }

    public Iterable<a> c() {
        return this.b;
    }

    public void d() throws Exception {
        this.c.a(this.c.d());
        e[] arre = this.a(this.c.d(), this.c);
        this.c.a(arre);
    }

    public void e() throws Exception {
    }

    public void f() {
        for (a object : this.b) {
            object.a(this);
        }
        File file = this.c.d();
        if (file.exists()) {
            this.a(this.c, this.c.c(), this.a(file));
        } else if (this.c.h()) {
            this.a(this.c, this.c.c(), o.o);
        }
        for (a a2 : this.b) {
            a2.b(this);
        }
    }

    private void a(e e2, e[] arre, File[] arrfile) {
        int n2 = 0;
        e[] arre2 = arrfile.length > 0 ? new e[arrfile.length] : e.a;
        for (e e3 : arre) {
            while (n2 < arrfile.length && this.e.compare(e3.d(), arrfile[n2]) > 0) {
                arre2[n2] = this.a(e2, arrfile[n2]);
                this.a(arre2[n2]);
                ++n2;
            }
            if (n2 < arrfile.length && this.e.compare(e3.d(), arrfile[n2]) == 0) {
                this.b(e3, arrfile[n2]);
                this.a(e3, e3.c(), this.a(arrfile[n2]));
                arre2[n2] = e3;
                ++n2;
                continue;
            }
            this.a(e3, e3.c(), o.o);
            this.b(e3);
        }
        while (n2 < arrfile.length) {
            arre2[n2] = this.a(e2, arrfile[n2]);
            this.a(arre2[n2]);
            ++n2;
        }
        e2.a(arre2);
    }

    private e a(e e2, File file) {
        e e3 = e2.b(file);
        e3.a(file);
        e[] arre = this.a(file, e3);
        e3.a(arre);
        return e3;
    }

    private e[] a(File file, e e2) {
        File[] arrfile = this.a(file);
        e[] arre = arrfile.length > 0 ? new e[arrfile.length] : e.a;
        for (int i2 = 0; i2 < arrfile.length; ++i2) {
            arre[i2] = this.a(e2, arrfile[i2]);
        }
        return arre;
    }

    private void a(e e2) {
        e[] arre = this.b.iterator();
        while (arre.hasNext()) {
            e[] arre2 = arre.next();
            if (e2.i()) {
                arre2.a(e2.d());
                continue;
            }
            arre2.d(e2.d());
        }
        for (e e3 : arre = e2.c()) {
            this.a(e3);
        }
    }

    private void b(e e2, File file) {
        if (e2.a(file)) {
            for (a a2 : this.b) {
                if (e2.i()) {
                    a2.b(file);
                    continue;
                }
                a2.e(file);
            }
        }
    }

    private void b(e e2) {
        for (a a2 : this.b) {
            if (e2.i()) {
                a2.c(e2.d());
                continue;
            }
            a2.f(e2.d());
        }
    }

    private File[] a(File file) {
        File[] arrfile = null;
        if (file.isDirectory()) {
            File[] arrfile2 = arrfile = this.d == null ? file.listFiles() : file.listFiles(this.d);
        }
        if (arrfile == null) {
            arrfile = o.o;
        }
        if (this.e != null && arrfile.length > 1) {
            Arrays.sort(arrfile, this.e);
        }
        return arrfile;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append("[file='");
        stringBuilder.append(this.a().getPath());
        stringBuilder.append('\'');
        if (this.d != null) {
            stringBuilder.append(", ");
            stringBuilder.append(this.d.toString());
        }
        stringBuilder.append(", listeners=");
        stringBuilder.append(this.b.size());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

