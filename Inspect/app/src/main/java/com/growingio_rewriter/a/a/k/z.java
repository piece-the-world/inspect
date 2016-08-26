/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.k.n;
import com.growingio.a.a.k.v;
import com.growingio.a.a.k.w;
import com.growingio.a.a.m.i;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class z {
    private final int a;
    private final int[] b;

    private z(int n2, int[] arrn) {
        for (int n3 : arrn) {
            v.a(n3, n2);
        }
        this.a = n2;
        this.b = arrn;
    }

    public Map<Integer, Double> a(Collection<? extends Number> collection) {
        return this.b(i.a(collection));
    }

    public /* varargs */ Map<Integer, Double> a(double ... arrd) {
        return this.b((double[])arrd.clone());
    }

    public /* varargs */ Map<Integer, Double> a(long ... arrl) {
        return this.b(v.a(arrl));
    }

    public /* varargs */ Map<Integer, Double> a(int ... arrn) {
        return this.b(v.a(arrn));
    }

    public /* varargs */ Map<Integer, Double> b(double ... arrd) {
        int n2;
        aU.a(arrd.length > 0, (Object)"Cannot calculate quantiles of an empty dataset");
        if (v.a(arrd)) {
            HashMap<Integer, Double> hashMap = new HashMap<Integer, Double>();
            for (int n3 : this.b) {
                hashMap.put(n3, Double.NaN);
            }
            return Collections.unmodifiableMap(hashMap);
        }
        int[] arrn = new int[this.b.length];
        int[] arrn2 = new int[this.b.length];
        int[] arrn3 = new int[this.b.length * 2];
        int n4 = 0;
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            long l2 = (long)this.b[i2] * (long)(arrd.length - 1);
            n2 = (int)n.a(l2, (long)this.a, RoundingMode.DOWN);
            int n5 = (int)(l2 - (long)n2 * (long)this.a);
            arrn[i2] = n2;
            arrn2[i2] = n5;
            arrn3[n4] = n2;
            ++n4;
            if (n5 == 0) continue;
            arrn3[n4] = n2 + 1;
            ++n4;
        }
        Arrays.sort(arrn3, 0, n4);
        v.a(arrn3, 0, n4 - 1, arrd, 0, arrd.length - 1);
        HashMap<Integer, Double> hashMap = new HashMap<Integer, Double>();
        for (int i3 = 0; i3 < this.b.length; ++i3) {
            int n6 = arrn[i3];
            n2 = arrn2[i3];
            if (n2 == 0) {
                hashMap.put(this.b[i3], arrd[n6]);
                continue;
            }
            hashMap.put(this.b[i3], v.a(arrd[n6], arrd[n6 + 1], (double)n2, (double)this.a));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* synthetic */ z(int n2, int[] arrn, w w2) {
        this(n2, arrn);
    }
}

