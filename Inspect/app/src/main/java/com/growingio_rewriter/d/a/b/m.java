/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.b;

import com.growingio.d.a.a;
import com.growingio.d.a.a.q;
import com.growingio.d.a.c;
import com.growingio.d.a.j;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.t;
import com.growingio.d.a.u;
import com.growingio.d.a.v;
import java.util.HashMap;
import java.util.List;

public class m
extends com.growingio.d.a.a.p
implements t {
    private final com.growingio.d.a.b.c b;
    private static final HashMap<String, String[]> c;

    public m(com.growingio.d.a.b.c c2, r r2, q q2) {
        super(327680, r2, q2);
        this.b = c2;
    }

    @Override
    public void a(String string, int n2) {
    }

    @Override
    public a c() {
        return null;
    }

    @Override
    public a a(String string, boolean bl2) {
        return null;
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        return null;
    }

    @Override
    public a a(int n2, String string, boolean bl2) {
        return null;
    }

    @Override
    public void a(String string, String string2, String string3, p p2, p p3, int n2) {
    }

    @Override
    public void b(int n2, p p2) {
    }

    @Override
    public void a(int n2, int n3, Object[] arrobject, int n4, Object[] arrobject2) {
    }

    @Override
    public void a(c c2) {
    }

    @Override
    public void a(Object object) {
        Object object2;
        if (!(object instanceof u)) {
            super.a(object);
            return;
        }
        String string = ((u)object).e();
        String string2 = "class$" + string.replace('/', '$');
        if (!this.b.h.contains(string)) {
            this.b.h.add(string);
            object2 = this.b.a(4104, string2, "Ljava/lang/Class;");
            object2.a();
        }
        object2 = this.b.c;
        this.n_.b(178, (String)object2, string2, "Ljava/lang/Class;");
    }

    @Override
    public void a(int n2, String string, String string2, String string3, boolean bl2) {
        String[] arrstring;
        if (n2 == 184 && string2.equals("valueOf") && (arrstring = c.get(string + string3)) != null) {
            String string4 = arrstring[0];
            String string5 = arrstring[1];
            super.a(187, string4);
            super.a_(89);
            super.a_(string5 == "(J)V" || string5 == "(D)V" ? 94 : 93);
            super.a_(88);
            super.a(183, string4, "<init>", string5, false);
            return;
        }
        super.a(n2, string, string2, string3, bl2);
    }

    static {
        String[][] arrarrstring = new String[][]{{"java/lang/Byte", "(B)V"}, {"java/lang/Short", "(S)V"}, {"java/lang/Character", "(C)V"}, {"java/lang/Integer", "(I)V"}, {"java/lang/Long", "(J)V"}, {"java/lang/Float", "(F)V"}, {"java/lang/Double", "(D)V"}};
        HashMap<String, String[]> hashMap = new HashMap<String, String[]>();
        for (String[] arrstring : arrarrstring) {
            String string = arrstring[0];
            String string2 = arrstring[1];
            String string3 = string + '(' + string2.charAt(1) + ")L" + string + ';';
            hashMap.put(string3, arrstring);
        }
        c = hashMap;
    }
}

