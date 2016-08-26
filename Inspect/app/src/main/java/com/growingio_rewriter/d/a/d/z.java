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

public class z
extends a {
    public int w;
    public int x;
    public o y;
    public List<o> z;

    public /* varargs */ z(int n2, int n3, o o2, o ... arro) {
        super(170);
        this.w = n2;
        this.x = n3;
        this.y = o2;
        this.z = new ArrayList<o>();
        if (arro != null) {
            this.z.addAll(Arrays.asList(arro));
        }
    }

    @Override
    public int b() {
        return 11;
    }

    @Override
    public void a(r r2) {
        p[] arrp = new p[this.z.size()];
        for (int i2 = 0; i2 < arrp.length; ++i2) {
            arrp[i2] = this.z.get(i2).e();
        }
        r2.a(this.w, this.x, this.y.e(), arrp);
        this.b(r2);
    }

    @Override
    public a a(Map<o, o> map) {
        return new z(this.w, this.x, z.a(this.y, map), z.a(this.z, map)).a(this);
    }
}

