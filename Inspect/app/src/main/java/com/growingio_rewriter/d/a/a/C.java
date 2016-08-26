/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.a.D;
import com.growingio.d.a.d.A;
import com.growingio.d.a.d.v;
import com.growingio.d.a.r;
import java.util.Collections;
import java.util.List;

public class C
extends v {
    public C(r r2, int n2, String string, String string2, String string3, String[] arrstring) {
        this(327680, r2, n2, string, string2, string3, arrstring);
    }

    protected C(int n2, r r2, int n3, String string, String string2, String string3, String[] arrstring) {
        super(n2, n3, string, string2, string3, arrstring);
        this.n_ = r2;
    }

    @Override
    public void b() {
        D d2 = new D(this);
        Collections.sort(this.bn_, d2);
        for (int i2 = 0; i2 < this.bn_.size(); ++i2) {
            ((A)this.bn_.get(i2)).a(i2);
        }
        if (this.n_ != null) {
            this.a(this.n_);
        }
    }
}

