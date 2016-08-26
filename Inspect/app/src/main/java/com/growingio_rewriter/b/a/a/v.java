/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.a;

import com.growingio.b.a.a.r;
import com.growingio.b.a.a.s;
import com.growingio.b.ae;
import com.growingio.b.g;
import com.growingio.b.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class v {
    private final o r;
    private final boolean s;
    private static final Map t = new IdentityHashMap();
    public static final v a = new v(o.m);
    public static final v b = new v(o.f);
    public static final v c = new v(o.k);
    public static final v d = new v(o.g);
    public static final v e = new v(o.h);
    public static final v f = new v(o.i);
    public static final v g = new v(o.j);
    public static final v h = new v(o.l);
    public static final v i = new v(o.n);
    public static final v j = new v(null);
    public static final v k = new v(null, true);
    public static final v l = new v(null, true);
    public static final v m = new v(null, true);
    public static final v n = v.a("java.lang.Object");
    public static final v o = v.a("java.io.Serializable");
    public static final v p = v.a("java.lang.Cloneable");
    public static final v q = v.a("java.lang.Throwable");

    public static v a(o o2) {
        v v2 = (v)t.get(o2);
        return v2 != null ? v2 : new v(o2);
    }

    private static v a(String string) {
        try {
            return new v(g.a().f(string));
        }
        catch (ae var1_1) {
            throw new RuntimeException(var1_1);
        }
    }

    v(o o2) {
        this(o2, false);
    }

    private v(o o2, boolean bl2) {
        this.r = o2;
        this.s = bl2;
    }

    boolean b() {
        return false;
    }

    public int e() {
        return this.r == o.m || this.r == o.k || this == l ? 2 : 1;
    }

    public o a() {
        return this.r;
    }

    public boolean g() {
        return !this.s && (this.r == null || !this.r.r());
    }

    public boolean h() {
        return this.s;
    }

    public boolean f() {
        return this.r != null && this.r.b();
    }

    public int c() {
        if (!this.f()) {
            return 0;
        }
        String string = this.r.s();
        int n2 = string.length() - 1;
        int n3 = 0;
        while (string.charAt(n2) == ']') {
            n2 -= 2;
            ++n3;
        }
        return n3;
    }

    public v d() {
        o o2;
        if (this.r == null || !this.r.b()) {
            return null;
        }
        try {
            o2 = this.r.e();
        }
        catch (ae var2_2) {
            throw new RuntimeException(var2_2);
        }
        v v2 = (v)t.get(o2);
        return v2 != null ? v2 : new v(o2);
    }

    public boolean a(v v2) {
        if (this == v2) {
            return true;
        }
        if (v2 == j && this.g() || this == j && v2.g()) {
            return true;
        }
        if (v2 instanceof s) {
            return ((s)v2).b(this);
        }
        if (v2 instanceof r) {
            return ((r)v2).b(this);
        }
        if (this.r == null || this.r.r()) {
            return false;
        }
        try {
            return v2.r.a(this.r);
        }
        catch (Exception var2_2) {
            throw new RuntimeException(var2_2);
        }
    }

    public v c(v v2) {
        if (v2 == this) {
            return this;
        }
        if (v2 == null) {
            return this;
        }
        if (v2 == j) {
            return this;
        }
        if (this == j) {
            return v2;
        }
        if (!v2.g() || !this.g()) {
            return m;
        }
        if (v2 instanceof s) {
            return v2.c(this);
        }
        if (v2.f() && this.f()) {
            return this.e(v2);
        }
        try {
            return this.f(v2);
        }
        catch (ae var2_2) {
            throw new RuntimeException(var2_2);
        }
    }

    v d(v v2) {
        while (v2.f()) {
            v2 = v2.d();
        }
        return v2;
    }

    private v a(v v2, int n2) {
        v v3;
        if (v2 instanceof s) {
            return new r((s)v2, n2);
        }
        String string = this.a(v2.r.s(), n2);
        try {
            v3 = v.a(this.b(v2).f(string));
        }
        catch (ae var5_5) {
            throw new RuntimeException(var5_5);
        }
        return v3;
    }

    String a(String string, int n2) {
        int n3 = string.length();
        int n4 = n3 + n2 * 2;
        char[] arrc = new char[n4];
        string.getChars(0, n3, arrc, 0);
        while (n3 < n4) {
            arrc[n3++] = 91;
            arrc[n3++] = 93;
        }
        string = new String(arrc);
        return string;
    }

    private g b(v v2) {
        g g2 = v2.r.a();
        return g2 != null ? g2 : g.a();
    }

    private v e(v v2) {
        int n2;
        int n3;
        v v3;
        v v4 = this.d(v2);
        v v5 = this.d(this);
        int n4 = v2.c();
        if (n4 == (n2 = this.c())) {
            v v6 = v5.c(v4);
            if (v6 == m) {
                return n;
            }
            return this.a(v6, n2);
        }
        if (n4 < n2) {
            v3 = v4;
            n3 = n4;
        } else {
            v3 = v5;
            n3 = n2;
        }
        if (v.a(v.p.r, v3.r) || v.a(v.o.r, v3.r)) {
            return this.a(v3, n3);
        }
        return this.a(n, n3);
    }

    private static o b(o o2, o o3) throws ae {
        o o4;
        o o5 = o2;
        o o6 = o4 = o3;
        o o7 = o5;
        do {
            if (v.a(o5, o4) && o5.f() != null) {
                return o5;
            }
            o o8 = o5.f();
            o o9 = o4.f();
            if (o9 == null) {
                o4 = o6;
                break;
            }
            if (o8 == null) {
                o5 = o7;
                o7 = o6;
                o6 = o5;
                o5 = o4;
                o4 = o6;
                break;
            }
            o5 = o8;
            o4 = o9;
        } while (true);
        while ((o5 = o5.f()) != null) {
            o7 = o7.f();
        }
        o5 = o7;
        while (!v.a(o5, o4)) {
            o5 = o5.f();
            o4 = o4.f();
        }
        return o5;
    }

    private v f(v v2) throws ae {
        o o2 = v.b(this.r, v2.r);
        if (o2.f() == null) {
            Map map = this.g(v2);
            if (map.size() == 1) {
                return new v((o)map.values().iterator().next());
            }
            if (map.size() > 1) {
                return new s(map);
            }
            return new v(o2);
        }
        Map map = this.a(v2, o2);
        if (map.size() > 0) {
            return new s(map, new v(o2));
        }
        return new v(o2);
    }

    private Map g(v v2) {
        Map map = this.a(v2.r, null);
        Map map2 = this.a(this.r, null);
        return this.a(map, map2);
    }

    private Map a(v v2, o o2) {
        Map map = this.b(v2.r, null);
        Map map2 = this.b(this.r, null);
        Map map3 = this.a(o2, null);
        for (Object k2 : map3.keySet()) {
            map.remove(k2);
            map2.remove(k2);
        }
        return this.a(map, map2);
    }

    Map a(Map map, Map map2) {
        Iterator iterator = map2.keySet().iterator();
        while (iterator.hasNext()) {
            if (map.containsKey(iterator.next())) continue;
            iterator.remove();
        }
        for (o o2 : new ArrayList(map2.values())) {
            o[] arro;
            try {
                arro = o2.d();
            }
            catch (ae var6_7) {
                throw new RuntimeException(var6_7);
            }
            for (int i2 = 0; i2 < arro.length; ++i2) {
                map2.remove(arro[i2].s());
            }
        }
        return map2;
    }

    Map a(o o2, Map hashMap) {
        if (hashMap == null) {
            hashMap = new HashMap<String, o>();
        }
        if (o2.x()) {
            hashMap.put(o2.s(), o2);
        }
        do {
            try {
                o[] arro = o2.d();
                for (int i2 = 0; i2 < arro.length; ++i2) {
                    o o3 = arro[i2];
                    hashMap.put(o3.s(), o3);
                    this.a(o3, hashMap);
                }
                o2 = o2.f();
                continue;
            }
            catch (ae var3_4) {
                throw new RuntimeException(var3_4);
            }
        } while (o2 != null);
        return hashMap;
    }

    Map b(o o2, Map hashMap) {
        o[] arro;
        if (hashMap == null) {
            hashMap = new HashMap<String, o>();
        }
        if (o2.x()) {
            hashMap.put(o2.s(), o2);
        }
        try {
            arro = o2.d();
        }
        catch (ae var4_4) {
            throw new RuntimeException(var4_4);
        }
        for (int i2 = 0; i2 < arro.length; ++i2) {
            o o3 = arro[i2];
            hashMap.put(o3.s(), o3);
            this.b(o3, hashMap);
        }
        return hashMap;
    }

    public boolean equals(Object object) {
        if (!(object instanceof v)) {
            return false;
        }
        return object.getClass() == this.getClass() && v.a(this.r, ((v)object).r);
    }

    static boolean a(o o2, o o3) {
        return o2 == o3 || o2 != null && o3 != null && o2.s().equals(o3.s());
    }

    public String toString() {
        if (this == m) {
            return "BOGUS";
        }
        if (this == j) {
            return "UNINIT";
        }
        if (this == k) {
            return "RETURN ADDRESS";
        }
        if (this == l) {
            return "TOP";
        }
        return this.r == null ? "null" : this.r.s();
    }

    static {
        t.put(o.m, a);
        t.put(o.k, c);
        t.put(o.g, d);
        t.put(o.i, f);
        t.put(o.j, g);
        t.put(o.l, h);
        t.put(o.h, e);
        t.put(o.f, b);
        t.put(o.n, i);
    }
}

