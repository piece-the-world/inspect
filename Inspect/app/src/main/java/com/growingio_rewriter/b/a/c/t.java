/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.c;

import com.growingio.b.a.Q;
import com.growingio.b.a.as;
import com.growingio.b.a.c.a;
import com.growingio.b.a.c.h;
import com.growingio.b.a.c.l;
import com.growingio.b.a.c.m;
import com.growingio.b.a.c.q;
import com.growingio.b.a.c.s;
import com.growingio.b.a.c.u;
import com.growingio.b.a.i;
import com.growingio.b.a.y;

public class t
extends a {
    public int a;
    public int b;
    public h[] c = null;
    public h[] d;

    public static t[] a(as as2, y y2, boolean bl2) throws i {
        t[] arrt = (t[])new u().a(as2);
        if (bl2 && arrt.length < 2 && (arrt.length == 0 || arrt[0].g == 0)) {
            return null;
        }
        Q q2 = as2.c();
        boolean bl3 = (as2.f() & 8) != 0;
        arrt[0].a(y2.b(), y2.h(), q2.c(), as2.g(), bl3, as2.d());
        return arrt;
    }

    protected t(int n2) {
        super(n2);
    }

    @Override
    protected void a(StringBuffer stringBuffer) {
        super.a(stringBuffer);
        stringBuffer.append(",\n stack={");
        this.a(stringBuffer, this.a, this.d);
        stringBuffer.append("}, locals={");
        this.a(stringBuffer, this.b, this.c);
        stringBuffer.append('}');
    }

    private void a(StringBuffer stringBuffer, int n2, h[] arrh) {
        if (arrh == null) {
            return;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            h h2;
            if (i2 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append((h2 = arrh[i2]) == null ? "<>" : h2.toString());
        }
    }

    public boolean a() {
        return this.c != null;
    }

    public void a(int n2, h[] arrh, int n3, h[] arrh2) throws i {
        this.a = n2;
        this.d = arrh;
        this.b = n3;
        this.c = arrh2;
    }

    public void b() {
        if (this.c != null) {
            int n2;
            for (n2 = this.c.length; !(n2 <= 0 || this.c[n2 - 1].c() != s.h || n2 > 1 && this.c[n2 - 2].d()); --n2) {
            }
            this.b = n2;
        }
    }

    void a(int n2, int n3, String string, String string2, boolean bl2, boolean bl3) throws i {
        if (string2.charAt(0) != '(') {
            throw new i("no method descriptor: " + string2);
        }
        this.a = 0;
        this.d = h.a(n2);
        h[] arrh = h.a(n3);
        if (bl3) {
            arrh[0] = new q(string);
        } else if (!bl2) {
            arrh[0] = new m(string);
        }
        int n4 = bl2 ? -1 : 0;
        int n5 = 1;
        try {
            while ((n5 = t.a(string2, n5, ++n4, arrh)) > 0) {
                if (!arrh[n4].d()) continue;
                arrh[++n4] = s.h;
            }
        }
        catch (StringIndexOutOfBoundsException var10_10) {
            throw new i("bad method descriptor: " + string2);
        }
        this.b = n4;
        this.c = arrh;
    }

    private static int a(String string, int n2, int n3, h[] arrh) throws i {
        int n4 = n2;
        int n5 = 0;
        char c2 = string.charAt(n2);
        if (c2 == ')') {
            return 0;
        }
        while (c2 == '[') {
            ++n5;
            c2 = string.charAt(++n2);
        }
        if (c2 == 'L') {
            int n6 = string.indexOf(59, ++n2);
            arrh[n3] = n5 > 0 ? new m(string.substring(n4, ++n6)) : new m(string.substring(n4 + 1, ++n6 - 1).replace('/', '.'));
            return n6;
        }
        if (n5 > 0) {
            arrh[n3] = new m(string.substring(n4, ++n2));
            return n2;
        }
        h h2 = t.a(c2);
        if (h2 == null) {
            throw new i("bad method descriptor: " + string);
        }
        arrh[n3] = h2;
        return n2 + 1;
    }

    private static h a(char c2) {
        switch (c2) {
            case 'B': 
            case 'C': 
            case 'I': 
            case 'S': 
            case 'Z': {
                return s.i;
            }
            case 'J': {
                return s.l;
            }
            case 'F': {
                return s.j;
            }
            case 'D': {
                return s.k;
            }
        }
        return null;
    }

    public static String a(String string) {
        int n2 = string.indexOf(41);
        if (n2 < 0) {
            return "java.lang.Object";
        }
        char c2 = string.charAt(n2 + 1);
        if (c2 == '[') {
            return string.substring(n2 + 1);
        }
        if (c2 == 'L') {
            return string.substring(n2 + 2, string.length() - 1).replace('/', '.');
        }
        return "java.lang.Object";
    }
}

