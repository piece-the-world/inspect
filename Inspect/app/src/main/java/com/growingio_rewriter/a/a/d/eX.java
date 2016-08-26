/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.Y;
import com.growingio.a.a.d.bO;
import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.eY;
import com.growingio.a.a.d.eZ;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fd;
import com.growingio.a.a.d.fe;
import com.growingio.a.a.d.ff;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.lc;
import com.growingio.a.a.d.lw;
import com.growingio.a.a.d.mh;
import com.growingio.a.a.d.mj;
import com.growingio.a.a.d.mn;
import java.io.Serializable;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Set;

public final class eX<C extends Comparable>
extends Y<C>
implements Serializable {
    private static final eX<Comparable<?>> a = new eX<C>(ea.<kW<C>>d());
    private static final eX<Comparable<?>> b = new eX(ea.a(kW.c()));
    private final transient ea<kW<C>> c;
    private transient eX<C> d;

    public static <C extends Comparable> eX<C> c() {
        return a;
    }

    static <C extends Comparable> eX<C> d() {
        return b;
    }

    public static <C extends Comparable> eX<C> e(kW<C> kW2) {
        aU.a(kW2);
        if (kW2.j()) {
            return eX.c();
        }
        if (kW2.equals(kW.c())) {
            return eX.d();
        }
        return new eX<C>(ea.a(kW2));
    }

    public static <C extends Comparable> eX<C> d(lc<C> lc2) {
        eX eX2;
        aU.a(lc2);
        if (lc2.a()) {
            return eX.c();
        }
        if (lc2.d(kW.c())) {
            return eX.d();
        }
        if (lc2 instanceof eX && !(eX2 = (eX)lc2).i()) {
            return eX2;
        }
        return new eX<C>(ea.a(lc2.n()));
    }

    eX(ea<kW<C>> ea2) {
        this.c = ea2;
    }

    private eX(ea<kW<C>> ea2, eX<C> eX2) {
        this.c = ea2;
        this.d = eX2;
    }

    @Override
    public boolean c(kW<C> kW2) {
        int n2 = mh.a(this.c, kW.a(), kW2.b, kO.d(), mn.a, mj.b);
        if (n2 < this.c.size() && this.c.get(n2).b(kW2) && !this.c.get(n2).c(kW2).j()) {
            return true;
        }
        return n2 > 0 && this.c.get(n2 - 1).b(kW2) && !this.c.get(n2 - 1).c(kW2).j();
    }

    @Override
    public boolean d(kW<C> kW2) {
        int n2 = mh.a(this.c, kW.a(), kW2.b, kO.d(), mn.a, mj.a);
        return n2 != -1 && this.c.get(n2).a(kW2);
    }

    @Override
    public kW<C> b(C c2) {
        int n2 = mh.a(this.c, kW.a(), bw.b(c2), kO.d(), mn.a, mj.a);
        if (n2 != -1) {
            kW<C> kW2 = this.c.get(n2);
            return kW2.f(c2) ? kW2 : null;
        }
        return null;
    }

    @Override
    public kW<C> e() {
        if (this.c.isEmpty()) {
            throw new NoSuchElementException();
        }
        return kW.a(this.c.get((int)0).b, this.c.get((int)(this.c.size() - 1)).c);
    }

    @Override
    public boolean a() {
        return this.c.isEmpty();
    }

    @Override
    public void a(kW<C> kW2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(lc<C> lc2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(kW<C> kW2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void c(lc<C> lc2) {
        throw new UnsupportedOperationException();
    }

    public fg<kW<C>> f() {
        if (this.c.isEmpty()) {
            return fg.k();
        }
        return new lw<kW<C>>(this.c, kW.a);
    }

    public fg<kW<C>> g() {
        if (this.c.isEmpty()) {
            return fg.k();
        }
        return new lw<kW<C>>(this.c.f(), kW.a.a());
    }

    public eX<C> h() {
        eX<C> eX2 = this.d;
        if (eX2 != null) {
            return eX2;
        }
        if (this.c.isEmpty()) {
            this.d = eX.d();
            return this.d;
        }
        if (this.c.size() == 1 && this.c.get(0).equals(kW.c())) {
            this.d = eX.c();
            return this.d;
        }
        fe fe2 = new fe(this);
        eX2 = this.d = new eX<C>(fe2, this);
        return eX2;
    }

    private ea<kW<C>> h(kW<C> kW2) {
        if (this.c.isEmpty() || kW2.j()) {
            return ea.d();
        }
        if (kW2.a(this.e())) {
            return this.c;
        }
        int n2 = kW2.d() ? mh.a(this.c, kW.b(), kW2.b, mn.d, mj.b) : 0;
        int n3 = kW2.g() ? mh.a(this.c, kW.a(), kW2.c, mn.c, mj.b) : this.c.size();
        int n4 = n3 - n2;
        if (n4 == 0) {
            return ea.d();
        }
        return new eY(this, n4, n2, kW2);
    }

    public eX<C> f(kW<C> kW2) {
        if (!this.a()) {
            kW<C> kW3 = this.e();
            if (kW2.a(kW3)) {
                return this;
            }
            if (kW2.b(kW3)) {
                return new eX<C>(this.h(kW2));
            }
        }
        return eX.c();
    }

    public fz<C> a(bO<C> bO2) {
        aU.a(bO2);
        if (this.a()) {
            return fz.n();
        }
        kW<C> kW2 = this.e().a(bO2);
        if (!kW2.d()) {
            throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
        }
        if (!kW2.g()) {
            try {
                bO2.e();
            }
            catch (NoSuchElementException var3_3) {
                throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
            }
        }
        return new eZ(this, bO2);
    }

    boolean i() {
        return this.c.i_();
    }

    public static <C extends Comparable<?>> fd<C> j() {
        return new fd();
    }

    Object k() {
        return new ff<C>(this.c);
    }

    @Override
    public /* synthetic */ lc g(kW kW2) {
        return this.f(kW2);
    }

    @Override
    public /* synthetic */ lc l() {
        return this.h();
    }

    @Override
    public /* synthetic */ Set m() {
        return this.g();
    }

    @Override
    public /* synthetic */ Set n() {
        return this.f();
    }

    static /* synthetic */ ea a(eX eX2) {
        return eX2.c;
    }
}

