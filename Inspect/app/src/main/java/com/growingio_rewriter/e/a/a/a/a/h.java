/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.a;

import com.growingio.e.a.a.a.a.a;
import com.growingio.e.a.a.a.a.i;
import com.growingio.e.a.a.a.s;
import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

public class h
extends a
implements Serializable {
    private static final long g = 6527501707585768673L;
    public static final Comparator<File> a = new h();
    public static final Comparator<File> b = new i(a);
    public static final Comparator<File> c = new h(s.b);
    public static final Comparator<File> d = new i(c);
    public static final Comparator<File> e = new h(s.c);
    public static final Comparator<File> f = new i(e);
    private final s h;

    public h() {
        this.h = s.a;
    }

    public h(s s2) {
        this.h = s2 == null ? s.a : s2;
    }

    public int a(File file, File file2) {
        return this.h.a(file.getPath(), file2.getPath());
    }

    @Override
    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.h + "]";
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((File)object, (File)object2);
    }
}

