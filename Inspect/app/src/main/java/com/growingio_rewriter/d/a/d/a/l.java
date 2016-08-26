/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d.a;

import com.growingio.d.a.d.a.b;
import com.growingio.d.a.d.n;
import com.growingio.d.a.d.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class l {
    o a;
    boolean[] b;
    List<n> c;

    private l() {
    }

    l(o o2, int n2, n n3) {
        this.a = o2;
        this.b = new boolean[n2];
        this.c = new ArrayList<n>();
        this.c.add(n3);
    }

    public l a() {
        l l2 = new l();
        l2.a = this.a;
        l2.b = new boolean[this.b.length];
        System.arraycopy(this.b, 0, l2.b, 0, this.b.length);
        l2.c = new ArrayList<n>(this.c);
        return l2;
    }

    public boolean a(l l2) throws b {
        int n2;
        boolean bl2 = false;
        for (n2 = 0; n2 < this.b.length; ++n2) {
            if (!l2.b[n2] || this.b[n2]) continue;
            this.b[n2] = true;
            bl2 = true;
        }
        if (l2.a == this.a) {
            for (n2 = 0; n2 < l2.c.size(); ++n2) {
                n n3 = l2.c.get(n2);
                if (this.c.contains(n3)) continue;
                this.c.add(n3);
                bl2 = true;
            }
        }
        return bl2;
    }
}

