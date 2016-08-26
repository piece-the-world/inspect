/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.o;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class t
extends a {
    public o w;
    public List<Integer> x;
    public List<o> y;

    public t(o o2, int[] arrn, o[] arro) {
        super(171);
        this.w = o2;
        this.x = new ArrayList<Integer>(arrn == null ? 0 : arrn.length);
        this.y = new ArrayList<o>(arro == null ? 0 : arro.length);
        if (arrn != null) {
            for (int i2 = 0; i2 < arrn.length; ++i2) {
                this.x.add(arrn[i2]);
            }
        }
        if (arro != null) {
            this.y.addAll(Arrays.asList(arro));
        }
    }

    @Override
    public int b() {
        return 12;
    }

    @Override
    public void a(r r2) {
        int[] arrn = new int[this.x.size()];
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            arrn[i2] = this.x.get(i2);
        }
        p[] arrp = new p[this.y.size()];
        for (int i3 = 0; i3 < arrp.length; ++i3) {
            arrp[i3] = this.y.get(i3).e();
        }
        r2.a(this.w.e(), arrn, arrp);
        this.b(r2);
    }

    @Override
    public a a(Map<o, o> map) {
        t t2 = new t(t.a(this.w, map), null, t.a(this.y, map));
        t2.x.addAll(this.x);
        return t2.a(this);
    }
}

