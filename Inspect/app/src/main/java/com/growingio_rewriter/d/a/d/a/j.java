/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d.a;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.a.b;
import com.growingio.d.a.d.a.g;
import com.growingio.d.a.d.a.i;
import com.growingio.d.a.d.a.k;
import com.growingio.d.a.d.a.m;
import com.growingio.d.a.d.d;
import com.growingio.d.a.d.p;
import com.growingio.d.a.t;
import com.growingio.d.a.u;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class j
extends g<k>
implements t {
    public j() {
        super(327680);
    }

    protected j(int n2) {
        super(n2);
    }

    public k a(u u2) {
        if (u2 == u.m) {
            return null;
        }
        return new k(u2 == null ? 1 : u2.j());
    }

    public k a(a a2) {
        int n2;
        switch (a2.a()) {
            case 9: 
            case 10: 
            case 14: 
            case 15: {
                n2 = 2;
                break;
            }
            case 18: {
                Object object = ((p)a2).w;
                n2 = object instanceof Long || object instanceof Double ? 2 : 1;
                break;
            }
            case 178: {
                n2 = u.a(((d)a2).y).j();
                break;
            }
            default: {
                n2 = 1;
            }
        }
        return new k(n2, a2);
    }

    @Override
    public k a(a a2, k k2) {
        return new k(k2.b(), a2);
    }

    @Override
    public k b(a a2, k k2) {
        int n2;
        switch (a2.a()) {
            case 117: 
            case 119: 
            case 133: 
            case 135: 
            case 138: 
            case 140: 
            case 141: 
            case 143: {
                n2 = 2;
                break;
            }
            case 180: {
                n2 = u.a(((d)a2).y).j();
                break;
            }
            default: {
                n2 = 1;
            }
        }
        return new k(n2, a2);
    }

    public k a(a a2, k k2, k k3) {
        int n2;
        switch (a2.a()) {
            case 47: 
            case 49: 
            case 97: 
            case 99: 
            case 101: 
            case 103: 
            case 105: 
            case 107: 
            case 109: 
            case 111: 
            case 113: 
            case 115: 
            case 121: 
            case 123: 
            case 125: 
            case 127: 
            case 129: 
            case 131: {
                n2 = 2;
                break;
            }
            default: {
                n2 = 1;
            }
        }
        return new k(n2, a2);
    }

    @Override
    public k a(a a2, k k2, k k3, k k4) {
        return new k(1, a2);
    }

    @Override
    public k a(a a2, List<? extends k> list) {
        int n2;
        int n3 = a2.a();
        if (n3 == 197) {
            n2 = 1;
        } else {
            String string = n3 == 186 ? ((com.growingio.d.a.d.m)a2).x : ((com.growingio.d.a.d.u)a2).y;
            n2 = u.e(string).j();
        }
        return new k(n2, a2);
    }

    @Override
    public void b(a a2, k k2, k k3) {
    }

    @Override
    public k a(k k2, k k3) {
        if (k2.b instanceof i && k3.b instanceof i) {
            Set<a> set = ((i)k2.b).a((i)k3.b);
            if (set == k2.b && k2.a == k3.a) {
                return k2;
            }
            return new k(Math.min(k2.a, k3.a), set);
        }
        if (k2.a != k3.a || !k2.b.containsAll(k3.b)) {
            HashSet<a> hashSet = new HashSet<a>();
            hashSet.addAll(k2.b);
            hashSet.addAll(k3.b);
            return new k(Math.min(k2.a, k3.a), hashSet);
        }
        return k2;
    }

    @Override
    public /* synthetic */ void a(a a2, m m2, m m3) throws b {
        this.b(a2, (k)m2, (k)m3);
    }

    @Override
    public /* synthetic */ m b(a a2, List list) throws b {
        return this.a(a2, list);
    }

    @Override
    public /* synthetic */ m b(a a2, m m2, m m3) throws b {
        return this.a(a2, (k)m2, (k)m3);
    }

    @Override
    public /* synthetic */ m a(a a2, m m2) throws b {
        return this.b(a2, (k)m2);
    }

    @Override
    public /* synthetic */ m b(a a2, m m2) throws b {
        return this.a(a2, (k)m2);
    }

    @Override
    public /* synthetic */ m b(a a2) throws b {
        return this.a(a2);
    }

    @Override
    public /* synthetic */ m b(u u2) {
        return this.a(u2);
    }
}

