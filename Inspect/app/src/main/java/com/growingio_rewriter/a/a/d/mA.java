/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ek;
import com.growingio.a.a.d.fD;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.lx;
import com.growingio.a.a.d.nC;
import com.growingio.a.a.d.oP;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

final class mA<R, C, V>
extends lx<R, C, V> {
    static final fD<Object, Object, Object> a = new mA<Object, Object, Object>(ea.<nC<R, C, V>>d(), fg.k(), fg.k());
    private final ei<R, Map<C, V>> b;
    private final ei<C, Map<R, V>> c;
    private final int[] d;
    private final int[] e;

    mA(ea<nC<R, C, V>> ea2, fg<R> fg2, fg<C> fg3) {
        ek ek2;
        int[] arrn;
        Object object;
        ei<R, Integer> ei2 = ii.a(fg2);
        LinkedHashMap linkedHashMap = ii.d();
        Object object2 = fg2.k_();
        while (object2.hasNext()) {
            arrn = object2.next();
            linkedHashMap.put(arrn, new LinkedHashMap());
        }
        object2 = ii.d();
        arrn = fg3.k_();
        while (arrn.hasNext()) {
            object = arrn.next();
            object2.put(object, new LinkedHashMap());
        }
        arrn = new int[ea2.size()];
        object = new int[ea2.size()];
        for (int i2 = 0; i2 < ea2.size(); ++i2) {
            ek2 = ea2.get(i2);
            R iterator = ek2.a();
            C c2 = ek2.b();
            V v2 = ek2.c();
            arrn[i2] = ei2.get(iterator);
            Map map = (Map)linkedHashMap.get(iterator);
            object[i2] = map.size();
            V v3 = map.put(c2, v2);
            if (v3 != null) {
                throw new IllegalArgumentException("Duplicate value for row=" + iterator + ", column=" + c2 + ": " + v2 + ", " + v3);
            }
            ((Map)object2.get(c2)).put(iterator, v2);
        }
        this.d = arrn;
        this.e = object;
        ek ek3 = new ek(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ek3.b(entry.getKey(), ei.b((Map)entry.getValue()));
        }
        this.b = ek3.b();
        ek2 = new ek(object2.size());
        for (Map.Entry entry2 : object2.entrySet()) {
            ek2.b(entry2.getKey(), ei.b((Map)entry2.getValue()));
        }
        this.c = ek2.b();
    }

    @Override
    public ei<C, Map<R, V>> k() {
        return this.c;
    }

    @Override
    public ei<R, Map<C, V>> l() {
        return this.b;
    }

    @Override
    public int n() {
        return this.d.length;
    }

    @Override
    nC<R, C, V> a(int n2) {
        int n3 = this.d[n2];
        Map.Entry<R, Map<C, V>> entry = this.b.k().h().get(n3);
        ei ei2 = (ei)entry.getValue();
        int n4 = this.e[n2];
        Map.Entry entry2 = ei2.k().h().get(n4);
        return mA.c(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override
    V b(int n2) {
        int n3 = this.d[n2];
        ei ei2 = (ei)this.b.h().h().get(n3);
        int n4 = this.e[n2];
        return ei2.h().h().get(n4);
    }

    @Override
    public /* synthetic */ Map p() {
        return this.k();
    }

    @Override
    public /* synthetic */ Map r() {
        return this.l();
    }
}

