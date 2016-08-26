/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.hE;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.o.a.aM;
import com.growingio.a.a.o.a.aS;
import com.growingio.a.a.o.a.aY;
import com.growingio.a.a.o.a.aZ;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

class aT {
    final Map<aT, aS> a = new hE().d().h();
    final Map<aT, aZ> b = new hE().d().h();
    final String c;

    aT(String string) {
        this.c = aU.a(string);
    }

    String a() {
        return this.c;
    }

    void a(aY aY2, List<aT> list) {
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a(aY2, list.get(i2));
        }
    }

    void a(aY aY2, aT aT2) {
        aU.b(this != aT2, "Attempted to acquire multiple locks with the same rank %s", (Object)aT2.a());
        if (this.a.containsKey(aT2)) {
            return;
        }
        aZ aZ2 = this.b.get(aT2);
        if (aZ2 != null) {
            aZ aZ3 = new aZ(aT2, this, aZ2.a(), null);
            aY2.a(aZ3);
            return;
        }
        Set<aT> set = lI.e();
        aS aS2 = aT2.a(this, set);
        if (aS2 == null) {
            this.a.put(aT2, new aS(aT2, this));
        } else {
            aZ aZ4 = new aZ(aT2, this, aS2, null);
            this.b.put(aT2, aZ4);
            aY2.a(aZ4);
        }
    }

    private aS a(aT aT2, Set<aT> set) {
        if (!set.add(this)) {
            return null;
        }
        aS aS2 = this.a.get(aT2);
        if (aS2 != null) {
            return aS2;
        }
        for (Map.Entry<aT, aS> entry : this.a.entrySet()) {
            aT aT3 = entry.getKey();
            aS2 = aT3.a(aT2, set);
            if (aS2 == null) continue;
            aS aS3 = new aS(aT3, this);
            aS3.setStackTrace(entry.getValue().getStackTrace());
            aS3.initCause(aS2);
            return aS3;
        }
        return null;
    }
}

