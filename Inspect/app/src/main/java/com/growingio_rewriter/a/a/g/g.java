/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.g.J;
import com.growingio.a.a.g.N;
import com.growingio.a.a.g.S;
import com.growingio.a.a.g.a;
import com.growingio.a.a.g.k;
import com.growingio.a.a.g.s;
import java.util.Map;
import java.util.Set;

final class g<N>
extends a<N>
implements J<N> {
    g(s<? super N> s2) {
        super(s2);
    }

    @Override
    public boolean i(N n2) {
        aU.a(n2, (Object)"node");
        if (this.e(n2)) {
            return false;
        }
        this.a.put(n2, this.d());
        return true;
    }

    @Override
    public boolean a(N n2, N n3) {
        aU.a(n2, (Object)"node1");
        aU.a(n3, (Object)"node2");
        aU.a(this.c() || !n2.equals(n3), "Can't add self-loop edge on node %s, as self-loops are not allowed.", n2);
        boolean bl2 = this.e(n2);
        boolean bl3 = this.e(n3);
        if (bl2 && bl3 && ((N)this.a.get(n2)).d().contains(n3)) {
            return false;
        }
        if (!bl2) {
            this.i(n2);
        }
        N n4 = (N)this.a.get(n2);
        n4.d(n3);
        if (!bl3) {
            this.i(n3);
        }
        N n5 = (N)this.a.get(n3);
        n5.c(n2);
        return true;
    }

    @Override
    public boolean j(Object object) {
        aU.a(object, (Object)"node");
        N n2 = (N)this.a.get(object);
        if (n2 == null) {
            return false;
        }
        for (Object n32 : n2.d()) {
            if (object.equals(n32)) continue;
            ((N)this.a.get(n32)).a(object);
        }
        for (Object n32 : n2.c()) {
            ((N)this.a.get(n32)).b(object);
        }
        this.a.remove(object);
        return true;
    }

    @Override
    public boolean b(Object object, Object object2) {
        aU.a(object, (Object)"node1");
        aU.a(object2, (Object)"node2");
        N n2 = (N)this.a.get(object);
        if (n2 == null || !n2.d().contains(object2)) {
            return false;
        }
        N n3 = (N)this.a.get(object2);
        n2.b(object2);
        n3.a(object);
        return true;
    }

    private N<N> d() {
        return this.b() ? k.a() : S.a();
    }
}

