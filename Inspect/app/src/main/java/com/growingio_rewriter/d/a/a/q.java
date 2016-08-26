/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.a.y;
import com.growingio.d.a.c.a;
import com.growingio.d.a.c.b;
import com.growingio.d.a.c.c;
import com.growingio.d.a.m;
import com.growingio.d.a.u;

public abstract class q {
    public String a(String string) {
        u u2 = u.a(string);
        switch (u2.a()) {
            case 9: {
                String string2 = this.a(u2.c().i());
                for (int i2 = 0; i2 < u2.b(); ++i2) {
                    string2 = "" + '[' + string2;
                }
                return string2;
            }
            case 10: {
                String string3 = this.d(u2.e());
                if (string3 == null) break;
                return "" + 'L' + string3 + ';';
            }
        }
        return string;
    }

    private u a(u u2) {
        switch (u2.a()) {
            case 9: {
                String string = this.a(u2.c().i());
                for (int i2 = 0; i2 < u2.b(); ++i2) {
                    string = "" + '[' + string;
                }
                return u.a(string);
            }
            case 10: {
                String string = this.d(u2.e());
                return string != null ? u.b(string) : u2;
            }
            case 11: {
                return u.c(this.c(u2.i()));
            }
        }
        return u2;
    }

    public String b(String string) {
        if (string == null) {
            return null;
        }
        return this.a(u.b(string)).e();
    }

    public String[] a(String[] arrstring) {
        String[] arrstring2 = null;
        boolean bl2 = false;
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            String string = arrstring[i2];
            String string2 = this.d(string);
            if (string2 != null && arrstring2 == null) {
                arrstring2 = new String[arrstring.length];
                if (i2 > 0) {
                    System.arraycopy(arrstring, 0, arrstring2, 0, i2);
                }
                bl2 = true;
            }
            if (!bl2) continue;
            arrstring2[i2] = string2 == null ? string : string2;
        }
        return bl2 ? arrstring2 : arrstring;
    }

    public String c(String string) {
        if ("()V".equals(string)) {
            return string;
        }
        u[] arru = u.d(string);
        StringBuilder stringBuilder = new StringBuilder("(");
        for (int i2 = 0; i2 < arru.length; ++i2) {
            stringBuilder.append(this.a(arru[i2].i()));
        }
        u u2 = u.e(string);
        if (u2 == u.m) {
            stringBuilder.append(")V");
            return stringBuilder.toString();
        }
        stringBuilder.append(')').append(this.a(u2.i()));
        return stringBuilder.toString();
    }

    public Object a(Object object) {
        if (object instanceof u) {
            return this.a((u)object);
        }
        if (object instanceof m) {
            m m2 = (m)object;
            return new m(m2.a(), this.b(m2.b()), this.a(m2.b(), m2.c(), m2.d()), this.c(m2.d()), m2.e());
        }
        return object;
    }

    public String a(String string, boolean bl2) {
        if (string == null) {
            return null;
        }
        a a2 = new a(string);
        c c2 = new c();
        b b2 = this.b(c2);
        if (bl2) {
            a2.b(b2);
        } else {
            a2.a(b2);
        }
        return c2.toString();
    }

    protected b a(b b2) {
        return new y(b2, this);
    }

    protected b b(b b2) {
        return this.a(b2);
    }

    public String a(String string, String string2, String string3) {
        return string2;
    }

    public String a(String string, String string2) {
        return string;
    }

    public String b(String string, String string2, String string3) {
        return string2;
    }

    public String d(String string) {
        return string;
    }
}

