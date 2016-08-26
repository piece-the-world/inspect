/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.oP;
import com.growingio.a.a.g.K;
import com.growingio.a.a.g.M;
import com.growingio.a.a.g.O;
import com.growingio.a.a.g.Q;
import com.growingio.a.a.g.T;
import com.growingio.a.a.g.b;
import com.growingio.a.a.g.i;
import com.growingio.a.a.g.q;
import java.util.Map;
import java.util.Set;

final class h<N, E>
extends b<N, E>
implements K<N, E> {
    h(M<? super N, ? super E> m2) {
        super(m2);
    }

    @Override
    public boolean o(N n2) {
        aU.a(n2, (Object)"node");
        if (this.m(n2)) {
            return false;
        }
        this.a.put(n2, this.f());
        return true;
    }

    @Override
    public boolean a(E e2, N n2, N n3) {
        aU.a(e2, (Object)"edge");
        aU.a(n2, (Object)"node1");
        aU.a(n3, (Object)"node2");
        aU.a(this.c() || !n2.equals(n3), "Can't add self-loop edge on node %s, as self-loops are not allowed.", n2);
        boolean bl2 = this.m(n2);
        boolean bl3 = this.m(n3);
        if (this.n(e2)) {
            aU.a(bl2 && bl3 && this.a(n2, n3).contains(e2), "Edge %s already exists between the following nodes: %s, so it can't be reused to connect node %s to %s", e2, this.e(e2), n2, n3);
            return false;
        }
        if (!this.e()) {
            aU.a(!bl2 || !bl3 || !this.c(n2).contains(n3), "Nodes %s and %s are already connected by a different edge.", n2, n3);
        }
        if (!bl2) {
            this.o(n2);
        }
        O o2 = (O)this.a.get(n2);
        o2.b(e2, n3);
        if (!bl3) {
            this.o(n3);
        }
        O o3 = (O)this.a.get(n3);
        o3.a(e2, n2);
        this.b.put(e2, n2);
        return true;
    }

    @Override
    public boolean p(Object object) {
        aU.a(object, (Object)"node");
        if (!this.m(object)) {
            return false;
        }
        oP oP2 = ea.a(this.d(object)).k_();
        while (oP2.hasNext()) {
            Object e2 = oP2.next();
            this.q(e2);
        }
        this.a.remove(object);
        return true;
    }

    @Override
    public boolean q(Object object) {
        aU.a(object, (Object)"edge");
        Object v2 = this.b.get(object);
        if (v2 == null) {
            return false;
        }
        Object n2 = ((O)this.a.get(v2)).a(object);
        ((O)this.a.get(v2)).c(object);
        ((O)this.a.get(n2)).b(object);
        this.b.remove(object);
        return true;
    }

    private O<N, E> f() {
        return this.b() ? (this.e() ? i.g() : q.g()) : (this.e() ? Q.g() : T.g());
    }
}

