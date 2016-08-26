/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.b;

import com.growingio.d.a.a;
import com.growingio.d.a.b.e;
import com.growingio.d.a.b.f;
import com.growingio.d.a.b.g;
import com.growingio.d.a.b.l;
import com.growingio.d.a.c;
import com.growingio.d.a.j;
import com.growingio.d.a.r;
import com.growingio.d.a.v;

public class b
extends com.growingio.d.a.f {
    private final f a;

    public b(com.growingio.d.a.f f2, f f3) {
        super(327680, f2);
        this.a = f3;
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        if ((n3 & 131072) != 0) {
            this.a.a("Deprecated");
        }
        if ((n3 & 4096) != 0) {
            this.a.a("Synthetic");
        }
        this.a.b(string);
        if (string2 != null) {
            this.a.a("Signature");
            this.a.a(string2);
        }
        if (string3 != null) {
            this.a.b(string3);
        }
        if (arrstring != null) {
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                this.a.b(arrstring[i2]);
            }
        }
        this.g.a(n2, n3, string, string2, string3, arrstring);
    }

    @Override
    public void a_(String string, String string2) {
        if (string != null) {
            this.a.a("SourceFile");
            this.a.a(string);
        }
        if (string2 != null) {
            this.a.a("SourceDebugExtension");
        }
        this.g.a_(string, string2);
    }

    @Override
    public void a(String string, String string2, String string3) {
        this.a.a("EnclosingMethod");
        this.a.b(string);
        if (string2 != null && string3 != null) {
            this.a.a(string2, string3);
        }
        this.g.a(string, string2, string3);
    }

    @Override
    public a a(String string, boolean bl2) {
        this.a.a(string);
        if (bl2) {
            this.a.a("RuntimeVisibleAnnotations");
        } else {
            this.a.a("RuntimeInvisibleAnnotations");
        }
        return new com.growingio.d.a.b.a(this.g.a(string, bl2), this.a);
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        this.a.a(string);
        if (bl2) {
            this.a.a("RuntimeVisibleTypeAnnotations");
        } else {
            this.a.a("RuntimeInvisibleTypeAnnotations");
        }
        return new com.growingio.d.a.b.a(this.g.a(string, bl2), this.a);
    }

    @Override
    public void a(c c2) {
        this.g.a(c2);
    }

    @Override
    public void a(String string, String string2, String string3, int n2) {
        this.a.a("InnerClasses");
        if (string != null) {
            this.a.b(string);
        }
        if (string2 != null) {
            this.a.b(string2);
        }
        if (string3 != null) {
            this.a.a(string3);
        }
        this.g.a(string, string2, string3, n2);
    }

    @Override
    public j a(int n2, String string, String string2, String string3, Object object) {
        if ((n2 & 4096) != 0) {
            this.a.a("Synthetic");
        }
        if ((n2 & 131072) != 0) {
            this.a.a("Deprecated");
        }
        this.a.a(string);
        this.a.a(string2);
        if (string3 != null) {
            this.a.a("Signature");
            this.a.a(string3);
        }
        if (object != null) {
            this.a.a(object);
        }
        return new g(this.g.a(n2, string, string2, string3, object), this.a);
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        if ((n2 & 4096) != 0) {
            this.a.a("Synthetic");
        }
        if ((n2 & 131072) != 0) {
            this.a.a("Deprecated");
        }
        this.a.a(string);
        this.a.a(string2);
        if (string3 != null) {
            this.a.a("Signature");
            this.a.a(string3);
        }
        if (arrstring != null) {
            this.a.a("Exceptions");
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                this.a.b(arrstring[i2]);
            }
        }
        return new l(this.g.a(n2, string, string2, string3, arrstring), this.a);
    }
}

