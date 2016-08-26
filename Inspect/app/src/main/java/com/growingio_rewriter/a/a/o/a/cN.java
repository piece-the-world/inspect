/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aJ;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.eD;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.oP;
import com.growingio.a.a.o.a.bY;
import com.growingio.a.a.o.a.cD;
import com.growingio.a.a.o.a.cF;
import com.growingio.a.a.o.a.cG;
import com.growingio.a.a.o.a.cO;
import com.growingio.a.a.o.a.cP;
import com.growingio.a.a.o.a.cQ;
import com.growingio.a.a.o.a.cR;
import com.growingio.a.a.o.a.cS;
import com.growingio.a.a.o.a.cT;
import com.growingio.a.a.o.a.cU;
import com.growingio.a.a.o.a.cd;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class cN {
    private static final Logger a = Logger.getLogger(cN.class.getName());
    private static final bY<cR> b = new cO("healthy()");
    private static final bY<cR> c = new cP("stopped()");
    private final cU d;
    private final ea<cD> e;

    public cN(Iterable<? extends cD> iterable) {
        ea<cD> ea2 = ea.a(iterable);
        if (ea2.isEmpty()) {
            a.log(Level.WARNING, "ServiceManager configured with no services.  Is your application configured properly?", new cQ(null));
            ea2 = ea.a(new cS(null));
        }
        this.d = new cU(ea2);
        this.e = ea2;
        WeakReference<cU> weakReference = new WeakReference<cU>(this.d);
        oP<cD> oP2 = ea2.k_();
        while (oP2.hasNext()) {
            cD cD2 = oP2.next();
            cD2.a(new cT(cD2, weakReference), cd.c());
            aU.a(cD2.g() == cG.a, "Can only manage NEW services, %s", (Object)cD2);
        }
        this.d.a();
    }

    public void a(cR cR2, Executor executor) {
        this.d.a(cR2, executor);
    }

    public void a(cR cR2) {
        this.d.a(cR2, cd.c());
    }

    public cN a() {
        cD cD2;
        oP<cD> oP2 = this.e.k_();
        while (oP2.hasNext()) {
            cD2 = oP2.next();
            cG cG2 = cD2.g();
            aU.b(cG2 == cG.a, "Service %s is %s, cannot start it.", (Object)cD2, (Object)cG2);
        }
        oP2 = this.e.k_();
        while (oP2.hasNext()) {
            cD2 = oP2.next();
            try {
                this.d.a(cD2);
                cD2.i();
            }
            catch (IllegalStateException var3_4) {
                a.log(Level.WARNING, "Unable to start Service " + cD2, var3_4);
            }
        }
        return this;
    }

    public void b() {
        this.d.b();
    }

    public void a(long l2, TimeUnit timeUnit) throws TimeoutException {
        this.d.a(l2, timeUnit);
    }

    public cN c() {
        oP<cD> oP2 = this.e.k_();
        while (oP2.hasNext()) {
            cD cD2 = oP2.next();
            cD2.j();
        }
        return this;
    }

    public void d() {
        this.d.c();
    }

    public void b(long l2, TimeUnit timeUnit) throws TimeoutException {
        this.d.b(l2, timeUnit);
    }

    public boolean e() {
        oP<cD> oP2 = this.e.k_();
        while (oP2.hasNext()) {
            cD cD2 = oP2.next();
            if (cD2.f()) continue;
            return false;
        }
        return true;
    }

    public eD<cG, cD> f() {
        return this.d.d();
    }

    public ei<cD, Long> g() {
        return this.d.e();
    }

    public String toString() {
        return aH.a(cN.class).a("services", aL.a(this.e, aW.a(aW.a(cS.class)))).toString();
    }

    static /* synthetic */ Logger h() {
        return a;
    }

    static /* synthetic */ bY i() {
        return c;
    }

    static /* synthetic */ bY j() {
        return b;
    }
}

