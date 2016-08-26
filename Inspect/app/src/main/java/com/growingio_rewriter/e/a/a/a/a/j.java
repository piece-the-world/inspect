/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.a;

import com.growingio.e.a.a.a.a.a;
import com.growingio.e.a.a.a.a.i;
import com.growingio.e.a.a.a.o;
import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

public class j
extends a
implements Serializable {
    private static final long e = -1201561106411416190L;
    public static final Comparator<File> a = new j();
    public static final Comparator<File> b = new i(a);
    public static final Comparator<File> c = new j(true);
    public static final Comparator<File> d = new i(c);
    private final boolean f;

    public j() {
        this.f = false;
    }

    public j(boolean bl2) {
        this.f = bl2;
    }

    public int a(File file, File file2) {
        long l2 = 0;
        l2 = file.isDirectory() ? (this.f && file.exists() ? o.q(file) : 0) : file.length();
        long l3 = 0;
        l3 = file2.isDirectory() ? (this.f && file2.exists() ? o.q(file2) : 0) : file2.length();
        long l4 = l2 - l3;
        if (l4 < 0) {
            return -1;
        }
        if (l4 > 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "[sumDirectoryContents=" + this.f + "]";
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((File)object, (File)object2);
    }
}

