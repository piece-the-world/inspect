/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.b;

import com.growingio.d.a.b.e;
import com.growingio.d.a.m;
import com.growingio.d.a.u;
import java.util.HashMap;

public class f
extends HashMap<e, e> {
    private static final long a = 1;
    private final e b = new e();
    private final e c = new e();
    private final e d = new e();
    private final e e = new e();
    private final e f = new e();

    public e a(int n2) {
        this.b.a(n2);
        e e2 = this.a(this.b);
        if (e2 == null) {
            e2 = new e(this.b);
            this.b(e2);
        }
        return e2;
    }

    public e a(float f2) {
        this.b.a(f2);
        e e2 = this.a(this.b);
        if (e2 == null) {
            e2 = new e(this.b);
            this.b(e2);
        }
        return e2;
    }

    public e a(long l2) {
        this.b.a(l2);
        e e2 = this.a(this.b);
        if (e2 == null) {
            e2 = new e(this.b);
            this.b(e2);
        }
        return e2;
    }

    public e a(double d2) {
        this.b.a(d2);
        e e2 = this.a(this.b);
        if (e2 == null) {
            e2 = new e(this.b);
            this.b(e2);
        }
        return e2;
    }

    public e a(String string) {
        this.b.a('s', string, null, null);
        e e2 = this.a(this.b);
        if (e2 == null) {
            e2 = new e(this.b);
            this.b(e2);
        }
        return e2;
    }

    private e d(String string) {
        this.c.a('S', string, null, null);
        e e2 = this.a(this.c);
        if (e2 == null) {
            this.a(string);
            e2 = new e(this.c);
            this.b(e2);
        }
        return e2;
    }

    public e b(String string) {
        this.c.a('C', string, null, null);
        e e2 = this.a(this.c);
        if (e2 == null) {
            this.a(string);
            e2 = new e(this.c);
            this.b(e2);
        }
        return e2;
    }

    public e c(String string) {
        this.c.a('t', string, null, null);
        e e2 = this.a(this.c);
        if (e2 == null) {
            this.a(string);
            e2 = new e(this.c);
            this.b(e2);
        }
        return e2;
    }

    public e a(int n2, String string, String string2, String string3, boolean bl2) {
        this.e.a((char)(104 + n2 - 1 + (bl2 && n2 != 9 ? 4 : 0)), string, string2, string3);
        e e2 = this.a(this.e);
        if (e2 == null) {
            if (n2 <= 4) {
                this.a(string, string2, string3);
            } else {
                this.a(string, string2, string3, bl2);
            }
            e2 = new e(this.e);
            this.b(e2);
        }
        return e2;
    }

    public e a(Object object) {
        if (object instanceof Integer) {
            int n2 = (Integer)object;
            return this.a(n2);
        }
        if (object instanceof Float) {
            float f2 = ((Float)object).floatValue();
            return this.a(f2);
        }
        if (object instanceof Long) {
            long l2 = (Long)object;
            return this.a(l2);
        }
        if (object instanceof Double) {
            double d2 = (Double)object;
            return this.a(d2);
        }
        if (object instanceof String) {
            return this.d((String)object);
        }
        if (object instanceof u) {
            u u2 = (u)object;
            int n3 = u2.a();
            if (n3 == 10) {
                return this.b(u2.e());
            }
            if (n3 == 11) {
                return this.c(u2.i());
            }
            return this.b(u2.i());
        }
        if (object instanceof m) {
            m m2 = (m)object;
            return this.a(m2.a(), m2.b(), m2.c(), m2.d(), m2.e());
        }
        throw new IllegalArgumentException("value " + object);
    }

    public e a(String string, String string2, String string3) {
        this.d.a('G', string, string2, string3);
        e e2 = this.a(this.d);
        if (e2 == null) {
            this.b(string);
            this.a(string2, string3);
            e2 = new e(this.d);
            this.b(e2);
        }
        return e2;
    }

    public e a(String string, String string2, String string3, boolean bl2) {
        this.d.a(bl2 ? 'N' : 'M', string, string2, string3);
        e e2 = this.a(this.d);
        if (e2 == null) {
            this.b(string);
            this.a(string2, string3);
            e2 = new e(this.d);
            this.b(e2);
        }
        return e2;
    }

    public /* varargs */ e a(String string, String string2, m m2, Object ... arrobject) {
        this.f.a(string, string2, m2, arrobject);
        e e2 = this.a(this.f);
        if (e2 == null) {
            this.a(string, string2);
            this.a(m2.a(), m2.b(), m2.c(), m2.d(), m2.e());
            for (int i2 = 0; i2 < arrobject.length; ++i2) {
                this.a(arrobject[i2]);
            }
            e2 = new e(this.f);
            this.b(e2);
        }
        return e2;
    }

    public e a(String string, String string2) {
        this.c.a('T', string, string2, null);
        e e2 = this.a(this.c);
        if (e2 == null) {
            this.a(string);
            this.a(string2);
            e2 = new e(this.c);
            this.b(e2);
        }
        return e2;
    }

    private e a(e e2) {
        return (e)this.get(e2);
    }

    private void b(e e2) {
        this.put(e2, e2);
    }
}

