/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

public final class bC
extends Enum<bC> {
    public static final /* enum */ bC a = new bC("java.version");
    public static final /* enum */ bC b = new bC("java.vendor");
    public static final /* enum */ bC c = new bC("java.vendor.url");
    public static final /* enum */ bC d = new bC("java.home");
    public static final /* enum */ bC e = new bC("java.vm.specification.version");
    public static final /* enum */ bC f = new bC("java.vm.specification.vendor");
    public static final /* enum */ bC g = new bC("java.vm.specification.name");
    public static final /* enum */ bC h = new bC("java.vm.version");
    public static final /* enum */ bC i = new bC("java.vm.vendor");
    public static final /* enum */ bC j = new bC("java.vm.name");
    public static final /* enum */ bC k = new bC("java.specification.version");
    public static final /* enum */ bC l = new bC("java.specification.vendor");
    public static final /* enum */ bC m = new bC("java.specification.name");
    public static final /* enum */ bC n = new bC("java.class.version");
    public static final /* enum */ bC o = new bC("java.class.path");
    public static final /* enum */ bC p = new bC("java.library.path");
    public static final /* enum */ bC q = new bC("java.io.tmpdir");
    public static final /* enum */ bC r = new bC("java.compiler");
    public static final /* enum */ bC s = new bC("java.ext.dirs");
    public static final /* enum */ bC t = new bC("os.name");
    public static final /* enum */ bC u = new bC("os.arch");
    public static final /* enum */ bC v = new bC("os.version");
    public static final /* enum */ bC w = new bC("file.separator");
    public static final /* enum */ bC x = new bC("path.separator");
    public static final /* enum */ bC y = new bC("line.separator");
    public static final /* enum */ bC z = new bC("user.name");
    public static final /* enum */ bC A = new bC("user.home");
    public static final /* enum */ bC B = new bC("user.dir");
    private final String C;
    private static final /* synthetic */ bC[] D;

    public static bC[] a() {
        return (bC[])D.clone();
    }

    public static bC a(String string) {
        return (bC)((Object)Enum.valueOf(bC.class, string));
    }

    private bC(String string2) {
        super(string, n2);
        this.C = string2;
    }

    public String b() {
        return this.C;
    }

    public String c() {
        return System.getProperty(this.C);
    }

    public String toString() {
        return this.b() + "=" + this.c();
    }

    static {
        D = new bC[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B};
    }
}

