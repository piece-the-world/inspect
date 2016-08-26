/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.b;
import com.growingio.e.a.a.a.b.c;
import com.growingio.e.a.a.a.b.g;
import com.growingio.e.a.a.a.b.h;
import com.growingio.e.a.a.a.b.j;
import com.growingio.e.a.a.a.b.k;
import com.growingio.e.a.a.a.b.n;
import com.growingio.e.a.a.a.b.o;
import com.growingio.e.a.a.a.b.p;
import com.growingio.e.a.a.a.b.q;
import com.growingio.e.a.a.a.b.r;
import com.growingio.e.a.a.a.b.s;
import com.growingio.e.a.a.a.b.u;
import com.growingio.e.a.a.a.b.v;
import com.growingio.e.a.a.a.b.w;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class l {
    private static final n a = l.a(l.a(new n[]{l.a(), l.c("CVS")}));
    private static final n b = l.a(l.a(new n[]{l.a(), l.c(".svn")}));

    public static /* varargs */ File[] a(n n2, File ... arrfile) {
        if (n2 == null) {
            throw new IllegalArgumentException("file filter is null");
        }
        if (arrfile == null) {
            return new File[0];
        }
        ArrayList<File> arrayList = new ArrayList<File>();
        for (File file : arrfile) {
            if (file == null) {
                throw new IllegalArgumentException("file array contains null");
            }
            if (!n2.accept(file)) continue;
            arrayList.add(file);
        }
        return arrayList.toArray(new File[arrayList.size()]);
    }

    public static File[] a(n n2, Iterable<File> iterable) {
        List<File> list = l.b(n2, iterable);
        return list.toArray(new File[list.size()]);
    }

    public static List<File> b(n n2, Iterable<File> iterable) {
        return l.a(n2, iterable, new ArrayList());
    }

    public static /* varargs */ List<File> b(n n2, File ... arrfile) {
        File[] arrfile2 = l.a(n2, arrfile);
        return Arrays.asList(arrfile2);
    }

    public static /* varargs */ Set<File> c(n n2, File ... arrfile) {
        File[] arrfile2 = l.a(n2, arrfile);
        return new HashSet<File>(Arrays.asList(arrfile2));
    }

    public static Set<File> c(n n2, Iterable<File> iterable) {
        return l.a(n2, iterable, new HashSet());
    }

    private static <T extends Collection<File>> T a(n n2, Iterable<File> iterable, T t2) {
        if (n2 == null) {
            throw new IllegalArgumentException("file filter is null");
        }
        if (iterable != null) {
            for (File file : iterable) {
                if (file == null) {
                    throw new IllegalArgumentException("file collection contains null");
                }
                if (!n2.accept(file)) continue;
                t2.add((File)file);
            }
        }
        return t2;
    }

    public static n a(String string) {
        return new s(string);
    }

    public static n a(String string, com.growingio.e.a.a.a.s s2) {
        return new s(string, s2);
    }

    public static n b(String string) {
        return new v(string);
    }

    public static n b(String string, com.growingio.e.a.a.a.s s2) {
        return new v(string, s2);
    }

    public static n c(String string) {
        return new p(string);
    }

    public static n c(String string, com.growingio.e.a.a.a.s s2) {
        return new p(string, s2);
    }

    public static n a() {
        return h.a;
    }

    public static n b() {
        return k.a;
    }

    public static n a(n n2, n n3) {
        return new c(n2, n3);
    }

    public static n b(n n2, n n3) {
        return new r(n2, n3);
    }

    public static /* varargs */ n a(n ... arrn) {
        return new c(l.c(arrn));
    }

    public static /* varargs */ n b(n ... arrn) {
        return new r(l.c(arrn));
    }

    public static /* varargs */ List<n> c(n ... arrn) {
        if (arrn == null) {
            throw new IllegalArgumentException("The filters must not be null");
        }
        ArrayList<n> arrayList = new ArrayList<n>(arrn.length);
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            if (arrn[i2] == null) {
                throw new IllegalArgumentException("The filter[" + i2 + "] is null");
            }
            arrayList.add(arrn[i2]);
        }
        return arrayList;
    }

    public static n a(n n2) {
        return new q(n2);
    }

    public static n c() {
        return w.a;
    }

    public static n d() {
        return j.a;
    }

    public static n a(FileFilter fileFilter) {
        return new g(fileFilter);
    }

    public static n a(FilenameFilter filenameFilter) {
        return new g(filenameFilter);
    }

    public static n a(long l2) {
        return new b(l2);
    }

    public static n a(long l2, boolean bl2) {
        return new b(l2, bl2);
    }

    public static n a(Date date) {
        return new b(date);
    }

    public static n a(Date date, boolean bl2) {
        return new b(date, bl2);
    }

    public static n a(File file) {
        return new b(file);
    }

    public static n a(File file, boolean bl2) {
        return new b(file, bl2);
    }

    public static n b(long l2) {
        return new u(l2);
    }

    public static n b(long l2, boolean bl2) {
        return new u(l2, bl2);
    }

    public static n a(long l2, long l3) {
        u u2 = new u(l2, true);
        u u3 = new u(l3 + 1, false);
        return new c(u2, u3);
    }

    public static n d(String string) {
        return new o(string);
    }

    public static n a(String string, long l2) {
        return new o(string, l2);
    }

    public static n a(byte[] arrby) {
        return new o(arrby);
    }

    public static n a(byte[] arrby, long l2) {
        return new o(arrby, l2);
    }

    public static n b(n n2) {
        if (n2 == null) {
            return a;
        }
        return l.a(new n[]{n2, a});
    }

    public static n c(n n2) {
        if (n2 == null) {
            return b;
        }
        return l.a(new n[]{n2, b});
    }

    public static n d(n n2) {
        if (n2 == null) {
            return h.a;
        }
        return new c(h.a, n2);
    }

    public static n e(n n2) {
        if (n2 == null) {
            return k.a;
        }
        return new c(k.a, n2);
    }
}

