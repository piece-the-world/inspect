/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.b.bD;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.eD;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fl;
import com.growingio.a.a.d.fm;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jK;
import com.growingio.a.a.d.jN;
import com.growingio.a.a.d.js;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.d.oP;
import com.growingio.a.a.o.a.bX;
import com.growingio.a.a.o.a.cD;
import com.growingio.a.a.o.a.cG;
import com.growingio.a.a.o.a.cN;
import com.growingio.a.a.o.a.cR;
import com.growingio.a.a.o.a.cS;
import com.growingio.a.a.o.a.cV;
import com.growingio.a.a.o.a.cW;
import com.growingio.a.a.o.a.cX;
import com.growingio.a.a.o.a.cY;
import com.growingio.a.a.o.a.cb;
import com.growingio.a.a.o.a.cc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

final class cU {
    final cb a = new cb();
    final lH<cG, cD> b = js.a(cG.class).e().e();
    final kl<cG> c = this.b.r();
    final Map<cD, bD> d = ii.g();
    boolean e;
    boolean f;
    final int g;
    final cc h;
    final cc i;
    final List<bX<cR>> j;

    cU(dQ<cD> dQ2) {
        this.h = new cX(this);
        this.i = new cY(this);
        this.j = Collections.synchronizedList(new ArrayList());
        this.g = dQ2.size();
        this.b.c(cG.a, dQ2);
    }

    void a(cD cD2) {
        this.a.a();
        try {
            bD bD2 = this.d.get(cD2);
            if (bD2 == null) {
                this.d.put(cD2, bD.b());
            }
        }
        finally {
            this.a.d();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a() {
        block5 : {
            this.a.a();
            try {
                if (!this.f) {
                    this.e = true;
                    break block5;
                }
                ArrayList<cD> arrayList = gO.a();
                oP<cD> oP2 = this.d().E().k_();
                while (oP2.hasNext()) {
                    cD cD2 = oP2.next();
                    if (cD2.g() == cG.a) continue;
                    arrayList.add(cD2);
                }
                throw new IllegalArgumentException("Services started transitioning asynchronously before the ServiceManager was constructed: " + arrayList);
            }
            finally {
                this.a.d();
            }
        }
    }

    void a(cR cR2, Executor executor) {
        aU.a(cR2, (Object)"listener");
        aU.a(executor, (Object)"executor");
        this.a.a();
        try {
            if (!this.i.a()) {
                this.j.add(new bX<cR>(cR2, executor));
            }
        }
        finally {
            this.a.d();
        }
    }

    void b() {
        this.a.b(this.h);
        try {
            this.i();
        }
        finally {
            this.a.d();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(long l2, TimeUnit timeUnit) throws TimeoutException {
        this.a.a();
        try {
            if (!this.a.f(this.h, l2, timeUnit)) {
                throw new TimeoutException("Timeout waiting for the services to become healthy. The following services have not started: " + jN.a(this.b, aW.a(fg.b(cG.a, cG.b))));
            }
            this.i();
        }
        finally {
            this.a.d();
        }
    }

    void c() {
        this.a.b(this.i);
        this.a.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void b(long l2, TimeUnit timeUnit) throws TimeoutException {
        this.a.a();
        try {
            if (!this.a.f(this.i, l2, timeUnit)) {
                throw new TimeoutException("Timeout waiting for the services to stop. The following services have not stopped: " + jN.a(this.b, aW.a(aW.a(EnumSet.of(cG.e, cG.f)))));
            }
        }
        finally {
            this.a.d();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    eD<cG, cD> d() {
        fm<cG, cD> fm2;
        fm2 = fl.b();
        this.a.a();
        try {
            for (Map.Entry<cG, cD> entry : this.b.u()) {
                if (entry.getValue() instanceof cS) continue;
                fm2.a(entry);
            }
        }
        finally {
            this.a.d();
        }
        return fm2.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    ei<cD, Long> e() {
        ArrayList<Map.Entry<cD, Long>> arrayList;
        this.a.a();
        try {
            arrayList = gO.b(this.d.size());
            for (Map.Entry<cD, bD> entry : this.d.entrySet()) {
                cD cD2 = entry.getKey();
                bD bD2 = entry.getValue();
                if (bD2.c() || cD2 instanceof cS) continue;
                arrayList.add(ii.a(cD2, bD2.a(TimeUnit.MILLISECONDS)));
            }
        }
        finally {
            this.a.d();
        }
        Collections.sort(arrayList, kO.d().a(new cV(this)));
        return ei.b(arrayList);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(cD cD2, cG cG2, cG cG3) {
        aU.a(cD2);
        aU.a(cG2 != cG3);
        this.a.a();
        try {
            this.f = true;
            if (!this.e) {
                return;
            }
            aU.b(this.b.c((Object)cG2, cD2), "Service %s not at the expected location in the state map %s", (Object)cD2, (Object)cG2);
            aU.b(this.b.a(cG3, cD2), "Service %s in the state map unexpectedly at %s", (Object)cD2, (Object)cG3);
            bD bD2 = this.d.get(cD2);
            if (bD2 == null) {
                bD2 = bD.b();
                this.d.put(cD2, bD2);
            }
            if (cG3.compareTo(cG.c) >= 0 && bD2.c()) {
                bD2.e();
                if (!(cD2 instanceof cS)) {
                    cN.h().log(Level.FINE, "Started {0} in {1}.", new Object[]{cD2, bD2});
                }
            }
            if (cG3 == cG.f) {
                this.b(cD2);
            }
            if (this.c.a((Object)cG.c) == this.g) {
                this.g();
            } else if (this.c.a((Object)cG.e) + this.c.a((Object)cG.f) == this.g) {
                this.f();
            }
        }
        finally {
            this.a.d();
            this.h();
        }
    }

    void f() {
        cN.i().a(this.j);
    }

    void g() {
        cN.j().a(this.j);
    }

    void b(cD cD2) {
        new cW(this, "failed({service=" + cD2 + "})", cD2).a(this.j);
    }

    void h() {
        aU.b(!this.a.g(), "It is incorrect to execute listeners with the monitor held.");
        for (int i2 = 0; i2 < this.j.size(); ++i2) {
            this.j.get(i2).a();
        }
    }

    void i() {
        if (this.c.a((Object)cG.c) != this.g) {
            IllegalStateException illegalStateException = new IllegalStateException("Expected to be healthy after starting. The following services are not running: " + jN.a(this.b, aW.a(aW.a(cG.c))));
            throw illegalStateException;
        }
    }
}

