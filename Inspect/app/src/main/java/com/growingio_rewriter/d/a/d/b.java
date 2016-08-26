/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.a;
import java.util.ArrayList;
import java.util.List;

public class b
extends a {
    public String a;
    public List<Object> b;

    public b(String string) {
        this(327680, string);
        if (this.getClass() != b.class) {
            throw new IllegalStateException();
        }
    }

    public b(int n2, String string) {
        super(n2);
        this.a = string;
    }

    b(List<Object> list) {
        super(327680);
        this.b = list;
    }

    @Override
    public void a(String string, Object object) {
        if (this.b == null) {
            this.b = new ArrayList<Object>(this.a != null ? 2 : 1);
        }
        if (this.a != null) {
            this.b.add(string);
        }
        this.b.add(object);
    }

    @Override
    public void a(String string, String string2, String string3) {
        if (this.b == null) {
            this.b = new ArrayList<Object>(this.a != null ? 2 : 1);
        }
        if (this.a != null) {
            this.b.add(string);
        }
        this.b.add(new String[]{string2, string3});
    }

    @Override
    public a a(String string, String string2) {
        if (this.b == null) {
            this.b = new ArrayList<Object>(this.a != null ? 2 : 1);
        }
        if (this.a != null) {
            this.b.add(string);
        }
        b b2 = new b(string2);
        this.b.add(b2);
        return b2;
    }

    @Override
    public a a(String string) {
        if (this.b == null) {
            this.b = new ArrayList<Object>(this.a != null ? 2 : 1);
        }
        if (this.a != null) {
            this.b.add(string);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        this.b.add(arrayList);
        return new b(arrayList);
    }

    @Override
    public void b_() {
    }

    public void a(int n2) {
    }

    public void a(a a2) {
        if (a2 != null) {
            if (this.b != null) {
                for (int i2 = 0; i2 < this.b.size(); i2 += 2) {
                    String string = (String)this.b.get(i2);
                    Object object = this.b.get(i2 + 1);
                    b.a(a2, string, object);
                }
            }
            a2.b_();
        }
    }

    static void a(a a2, String string, Object object) {
        if (a2 != null) {
            if (object instanceof String[]) {
                String[] arrstring = (String[])object;
                a2.a(string, arrstring[0], arrstring[1]);
            } else if (object instanceof b) {
                b b2 = (b)object;
                b2.a(a2.a(string, b2.a));
            } else if (object instanceof List) {
                a a3 = a2.a(string);
                if (a3 != null) {
                    List list = (List)object;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        b.a(a3, null, list.get(i2));
                    }
                    a3.b_();
                }
            } else {
                a2.a(string, object);
            }
        }
    }
}

