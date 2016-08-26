/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.c;

import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.c.h;
import com.growingio.b.a.c.l;
import com.growingio.b.a.c.s;
import com.growingio.b.a.i;
import com.growingio.b.ae;
import com.growingio.b.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class o
extends com.growingio.b.a.c.i {
    protected ArrayList a = new ArrayList(2);
    protected ArrayList b = new ArrayList(2);
    protected ArrayList c = null;
    protected String d;
    private boolean e;
    private int f = 0;
    private int g = 0;
    private boolean h = false;

    public o(h h2) {
        this.b(h2);
        this.d = null;
        this.e = h2.d();
    }

    @Override
    public String g() {
        if (this.d == null) {
            return ((h)this.a.get(0)).g();
        }
        return this.d;
    }

    @Override
    public l c() {
        if (this.d == null) {
            return ((h)this.a.get(0)).c();
        }
        return null;
    }

    @Override
    public boolean d() {
        if (this.d == null) {
            return this.e;
        }
        return false;
    }

    @Override
    public boolean e() {
        if (this.d == null) {
            return ((h)this.a.get(0)).e();
        }
        return false;
    }

    @Override
    public boolean f() {
        if (this.d == null) {
            return ((h)this.a.get(0)).f();
        }
        return false;
    }

    @Override
    public void b(h h2) {
        this.a.add(h2);
        if (h2 instanceof o) {
            ((o)h2).b.add(this);
        }
    }

    @Override
    public int a() {
        if (this.d == null) {
            return ((h)this.a.get(0)).a();
        }
        return super.a();
    }

    @Override
    public int a(Q q2) {
        if (this.d == null) {
            return ((h)this.a.get(0)).a(q2);
        }
        return super.a(q2);
    }

    @Override
    public void a(String string, g g2) throws i {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(string);
    }

    @Override
    protected o h() {
        return this;
    }

    @Override
    public int a(ArrayList arrayList, int n2, g g2) throws ae {
        o o2;
        if (this.f > 0) {
            return n2;
        }
        this.f = this.g = ++n2;
        arrayList.add(this);
        this.h = true;
        int n3 = this.a.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            o2 = ((h)this.a.get(i2)).h();
            if (o2 == null) continue;
            if (o2.f == 0) {
                n2 = o2.a(arrayList, n2, g2);
                if (o2.g >= this.g) continue;
                this.g = o2.g;
                continue;
            }
            if (!o2.h || o2.f >= this.g) continue;
            this.g = o2.f;
        }
        if (this.f == this.g) {
            ArrayList<o> arrayList2 = new ArrayList<o>();
            do {
                o2 = (o)arrayList.remove(arrayList.size() - 1);
                o2.h = false;
                arrayList2.add(o2);
            } while (o2 != this);
            this.a(arrayList2, g2);
        }
        return n2;
    }

    private void a(ArrayList arrayList, g g2) throws ae {
        Object object;
        int n2;
        HashSet<String> hashSet = new HashSet<String>();
        boolean bl2 = false;
        h h2 = null;
        int n3 = arrayList.size();
        block0 : for (n2 = 0; n2 < n3; ++n2) {
            object = ((o)arrayList.get((int)n2)).a;
            int n4 = object.size();
            for (int i2 = 0; i2 < n4; ++i2) {
                h h3 = (h)object.get(i2);
                l l2 = h3.c();
                if (h2 == null) {
                    if (l2 == null) {
                        bl2 = false;
                        h2 = h3;
                        if (h3.f()) {
                            continue block0;
                        }
                    } else {
                        bl2 = true;
                        h2 = l2;
                    }
                } else if (l2 == null && bl2 || l2 != null && h2 != l2) {
                    bl2 = true;
                    h2 = s.h;
                    continue block0;
                }
                if (l2 != null || h3.e()) continue;
                hashSet.add(h3.g());
            }
        }
        if (bl2) {
            this.e = h2.d();
            for (n2 = 0; n2 < n3; ++n2) {
                object = (o)arrayList.get(n2);
                object.a.clear();
                object.a.add(h2);
                object.e = h2.d();
            }
        } else {
            String string = this.a(arrayList, hashSet, g2);
            for (int i3 = 0; i3 < n3; ++i3) {
                o o2 = (o)arrayList.get(i3);
                o2.d = string;
            }
        }
    }

    private String a(ArrayList arrayList, HashSet hashSet, g g2) throws ae {
        Iterator iterator = hashSet.iterator();
        if (hashSet.size() == 0) {
            return null;
        }
        if (hashSet.size() == 1) {
            return (String)iterator.next();
        }
        com.growingio.b.o o2 = g2.f((String)iterator.next());
        while (iterator.hasNext()) {
            o2 = o.a(o2, g2.f((String)iterator.next()));
        }
        if (o2.f() == null || o.a(o2)) {
            o2 = this.a(arrayList, g2, new HashSet(), o2);
        }
        if (o2.b()) {
            return T.a(o2);
        }
        return o2.s();
    }

    private static boolean a(com.growingio.b.o o2) throws ae {
        return o2.b() && o2.e().f() == null;
    }

    private com.growingio.b.o a(ArrayList arrayList, g g2, HashSet hashSet, com.growingio.b.o o2) throws ae {
        if (arrayList == null) {
            return o2;
        }
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            o o3 = (o)arrayList.get(i2);
            if (!hashSet.add(o3)) {
                return o2;
            }
            if (o3.c != null) {
                int n3 = o3.c.size();
                for (int i3 = 0; i3 < n3; ++i3) {
                    com.growingio.b.o o4 = g2.f((String)o3.c.get(i3));
                    if (!o4.a(o2)) continue;
                    o2 = o4;
                }
            }
            o2 = this.a(o3.b, g2, hashSet, o2);
        }
        return o2;
    }
}

