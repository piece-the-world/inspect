/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.a;

import com.growingio.b.a.a.v;
import com.growingio.b.o;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class s
extends v {
    private Map r;
    private v s;
    private v t;
    private s u;
    private boolean v = false;

    public s(Map map) {
        this(map, null);
    }

    public s(Map map, v v2) {
        super(null);
        this.r = map;
        this.t = v2;
    }

    @Override
    public o a() {
        if (this.s != null) {
            return this.s.a();
        }
        return v.n.a();
    }

    @Override
    public v d() {
        return null;
    }

    @Override
    public int e() {
        return 1;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    boolean b() {
        boolean bl2 = this.v;
        this.v = false;
        return bl2;
    }

    @Override
    public boolean a(v v2) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public boolean b(v v2) {
        Map map;
        if (this.s != null) {
            return v2.a(this.s);
        }
        if (v.n.equals(v2)) {
            return true;
        }
        if (this.t != null && !v2.a(this.t)) {
            this.t = null;
        }
        if ((map = this.a(this, v2)).size() == 1 && this.t == null) {
            this.s = v.a((o)map.values().iterator().next());
            this.j();
            return true;
        }
        if (map.size() >= 1) {
            this.r = map;
            this.i();
            return true;
        }
        if (this.t != null) {
            this.s = this.t;
            this.j();
            return true;
        }
        return false;
    }

    private void i() {
        s s2 = this.u;
        while (s2 != null) {
            s2.r = this.r;
            s2.t = this.t;
            s2 = s2.u;
        }
    }

    private void j() {
        s s2 = this.u;
        while (s2 != null) {
            s2.s = this.s;
            s2 = s2.u;
        }
    }

    @Override
    public boolean g() {
        return true;
    }

    private Map a(s s2) {
        HashMap<String, o> hashMap = new HashMap<String, o>();
        for (o o2 : s2.r.values()) {
            hashMap.put(o2.s(), o2);
            this.a(o2, hashMap);
        }
        return hashMap;
    }

    private Map a(s s2, s s3) {
        Map map = this.a(s2);
        Map map2 = this.a(s3);
        return this.a(map, map2);
    }

    private Map a(s s2, v v2) {
        Map map = this.a(s2);
        Map map2 = this.a(v2.a(), null);
        return this.a(map, map2);
    }

    private boolean b(s s2) {
        while (s2 != null) {
            if (s2 == this) {
                return true;
            }
            s2 = s2.u;
        }
        return false;
    }

    @Override
    public v c(v v2) {
        Object object;
        Object object2;
        if (this == v2) {
            return this;
        }
        if (v2 == j) {
            return this;
        }
        if (v2 == m) {
            return m;
        }
        if (v2 == null) {
            return this;
        }
        if (this.s != null) {
            return this.s.c(v2);
        }
        if (this.t != null && (!(object = this.t.c(v2)).equals(this.t) || object.b())) {
            this.t = v.n.equals(object) ? null : object;
            this.v = true;
        }
        if (v2 instanceof s) {
            object2 = (s)v2;
            if (object2.s != null) {
                object = this.a(this, object2.s);
            } else {
                object = this.a((s)object2, this);
                if (!this.b((s)object2)) {
                    this.u = object2;
                }
            }
        } else {
            object = this.a(this, v2);
        }
        if (object.size() > 1 || object.size() == 1 && this.t != null) {
            if (object.size() != this.r.size()) {
                this.v = true;
            } else if (!this.v) {
                object2 = object.keySet().iterator();
                while (object2.hasNext()) {
                    if (this.r.containsKey(object2.next())) continue;
                    this.v = true;
                }
            }
            this.r = object;
            this.i();
            return this;
        }
        this.s = object.size() == 1 ? v.a((o)object.values().iterator().next()) : (this.t != null ? this.t : n);
        this.j();
        return this.s;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof s)) {
            return false;
        }
        s s2 = (s)object;
        if (this.s != null) {
            return this.s.equals(s2.s);
        }
        if (s2.s != null) {
            return false;
        }
        return this.r.keySet().equals(s2.r.keySet());
    }

    @Override
    public String toString() {
        if (this.s != null) {
            return this.s.toString();
        }
        StringBuffer stringBuffer = new StringBuffer("{");
        Iterator iterator = this.r.keySet().iterator();
        while (iterator.hasNext()) {
            stringBuffer.append(iterator.next());
            stringBuffer.append(", ");
        }
        stringBuffer.setLength(stringBuffer.length() - 2);
        if (this.t != null) {
            stringBuffer.append(", *").append(this.t.toString());
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}

