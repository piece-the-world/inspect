/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aH;
import com.growingio.a.a.d.cC;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ec;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.lP;
import com.growingio.a.a.d.oP;
import java.util.Collection;
import java.util.List;
import java.util.Set;

final class lO<E>
extends cC<List<E>>
implements Set<List<E>> {
    private final transient ea<fg<E>> a;
    private final transient aH<E> b;

    static <E> Set<List<E>> a(List<? extends Set<? extends E>> list) {
        ec<fg<E>> ec2 = new ec<fg<E>>(list.size());
        for (Set<E> set2 : list) {
            fg<E> fg2 = fg.a(set2);
            if (fg2.isEmpty()) {
                return fg.k();
            }
            ec2.c(fg2);
        }
        ea ea2 = ec2.b();
        lP lP2 = new lP(ea2);
        return new lO(ea2, new aH(lP2));
    }

    private lO(ea<fg<E>> ea2, aH<E> aH2) {
        this.a = ea2;
        this.b = aH2;
    }

    @Override
    protected Collection<List<E>> b() {
        return this.b;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof lO) {
            lO lO2 = (lO)object;
            return this.a.equals(lO2.a);
        }
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        int n2;
        int n3 = this.size() - 1;
        for (n2 = 0; n2 < this.a.size(); ++n2) {
            n3 *= 31;
            n3 = ~ (~ n3);
        }
        n2 = 1;
        oP<fg<E>> oP2 = this.a.k_();
        while (oP2.hasNext()) {
            Set set = oP2.next();
            n2 = 31 * n2 + this.size() / set.size() * set.hashCode();
            n2 = ~ (~ n2);
        }
        return ~ (~ (n2 += n3));
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.b();
    }
}

