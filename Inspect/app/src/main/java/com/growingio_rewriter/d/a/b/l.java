/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.b;

import com.growingio.d.a.a;
import com.growingio.d.a.b.e;
import com.growingio.d.a.b.f;
import com.growingio.d.a.m;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.v;

public class l
extends r {
    private final f a;

    public l(r r2, f f2) {
        super(327680, r2);
        this.a = f2;
    }

    @Override
    public void a(String string, int n2) {
        this.a.a("MethodParameters");
        if (string != null) {
            this.a.a(string);
        }
        this.n_.a(string, n2);
    }

    @Override
    public a c() {
        this.a.a("AnnotationDefault");
        return new com.growingio.d.a.b.a(this.n_.c(), this.a);
    }

    @Override
    public a a(String string, boolean bl2) {
        this.a.a(string);
        if (bl2) {
            this.a.a("RuntimeVisibleAnnotations");
        } else {
            this.a.a("RuntimeInvisibleAnnotations");
        }
        return new com.growingio.d.a.b.a(this.n_.a(string, bl2), this.a);
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        this.a.a(string);
        if (bl2) {
            this.a.a("RuntimeVisibleTypeAnnotations");
        } else {
            this.a.a("RuntimeInvisibleTypeAnnotations");
        }
        return new com.growingio.d.a.b.a(this.n_.a(string, bl2), this.a);
    }

    @Override
    public a a(int n2, String string, boolean bl2) {
        this.a.a(string);
        if (bl2) {
            this.a.a("RuntimeVisibleParameterAnnotations");
        } else {
            this.a.a("RuntimeInvisibleParameterAnnotations");
        }
        return new com.growingio.d.a.b.a(this.n_.a(n2, string, bl2), this.a);
    }

    @Override
    public void a(int n2, String string) {
        this.a.b(string);
        this.n_.a(n2, string);
    }

    @Override
    public void b(int n2, String string, String string2, String string3) {
        this.a.a(string, string2, string3);
        this.n_.b(n2, string, string2, string3);
    }

    @Override
    public void a(int n2, String string, String string2, String string3, boolean bl2) {
        this.a.a(string, string2, string3, bl2);
        this.n_.a(n2, string, string2, string3, bl2);
    }

    @Override
    public /* varargs */ void a(String string, String string2, m m2, Object ... arrobject) {
        this.a.a(string, string2, m2, arrobject);
        this.n_.a(string, string2, m2, arrobject);
    }

    @Override
    public void a(Object object) {
        this.a.a(object);
        this.n_.a(object);
    }

    @Override
    public void b(String string, int n2) {
        this.a.b(string);
        this.n_.b(string, n2);
    }

    @Override
    public a b(int n2, v v2, String string, boolean bl2) {
        this.a.a(string);
        if (bl2) {
            this.a.a("RuntimeVisibleTypeAnnotations");
        } else {
            this.a.a("RuntimeInvisibleTypeAnnotations");
        }
        return new com.growingio.d.a.b.a(this.n_.b(n2, v2, string, bl2), this.a);
    }

    @Override
    public void a(p p2, p p3, p p4, String string) {
        if (string != null) {
            this.a.b(string);
        }
        this.n_.a(p2, p3, p4, string);
    }

    @Override
    public a c(int n2, v v2, String string, boolean bl2) {
        this.a.a(string);
        if (bl2) {
            this.a.a("RuntimeVisibleTypeAnnotations");
        } else {
            this.a.a("RuntimeInvisibleTypeAnnotations");
        }
        return new com.growingio.d.a.b.a(this.n_.c(n2, v2, string, bl2), this.a);
    }

    @Override
    public void a(String string, String string2, String string3, p p2, p p3, int n2) {
        if (string3 != null) {
            this.a.a("LocalVariableTypeTable");
            this.a.a(string);
            this.a.a(string3);
        }
        this.a.a("LocalVariableTable");
        this.a.a(string);
        this.a.a(string2);
        this.n_.a(string, string2, string3, p2, p3, n2);
    }

    @Override
    public a a(int n2, v v2, p[] arrp, p[] arrp2, int[] arrn, String string, boolean bl2) {
        this.a.a(string);
        if (bl2) {
            this.a.a("RuntimeVisibleTypeAnnotations");
        } else {
            this.a.a("RuntimeInvisibleTypeAnnotations");
        }
        return new com.growingio.d.a.b.a(this.n_.a(n2, v2, arrp, arrp2, arrn, string, bl2), this.a);
    }

    @Override
    public void b(int n2, p p2) {
        this.a.a("LineNumberTable");
        this.n_.b(n2, p2);
    }

    @Override
    public void d(int n2, int n3) {
        this.a.a("Code");
        this.n_.d(n2, n3);
    }
}

