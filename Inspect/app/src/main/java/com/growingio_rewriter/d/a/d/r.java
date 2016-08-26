/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.a;
import com.growingio.d.a.d.B;
import com.growingio.d.a.d.o;
import com.growingio.d.a.p;
import com.growingio.d.a.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class r
extends B {
    public List<o> e;
    public List<o> f;
    public List<Integer> g;

    public r(int n2, v v2, o[] arro, o[] arro2, int[] arrn, String string) {
        this(327680, n2, v2, arro, arro2, arrn, string);
    }

    public r(int n2, int n3, v v2, o[] arro, o[] arro2, int[] arrn, String string) {
        super(n2, n3, v2, string);
        this.e = new ArrayList<o>(arro.length);
        this.e.addAll(Arrays.asList(arro));
        this.f = new ArrayList<o>(arro2.length);
        this.f.addAll(Arrays.asList(arro2));
        this.g = new ArrayList<Integer>(arrn.length);
        for (int n4 : arrn) {
            this.g.add(n4);
        }
    }

    public void a(com.growingio.d.a.r r2, boolean bl2) {
        p[] arrp = new p[this.e.size()];
        p[] arrp2 = new p[this.f.size()];
        int[] arrn = new int[this.g.size()];
        for (int i2 = 0; i2 < arrp.length; ++i2) {
            arrp[i2] = this.e.get(i2).e();
            arrp2[i2] = this.f.get(i2).e();
            arrn[i2] = this.g.get(i2);
        }
        this.a(r2.a(this.h, this.i, arrp, arrp2, arrn, this.a, true));
    }
}

