/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile.a;

import com.growingio.agent.compile.a.g;
import com.growingio.agent.compile.k;
import com.growingio.agent.compile.m;
import com.growingio.d.a.a.j;
import com.growingio.d.a.a.o;
import com.growingio.d.a.r;
import com.growingio.d.a.u;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class f
extends com.growingio.d.a.f {
    protected final Set<String> a;
    protected final k b;
    protected boolean c = false;
    protected final m d;
    private final Map<o, g> h;
    protected String e;

    protected abstract void a(j var1, o var2, o var3);

    public f(com.growingio.d.a.f f2, k k2, m m2, Set<String> set, Map<o, o> map) {
        super(327680, f2);
        this.b = k2;
        this.d = m2;
        this.a = Collections.unmodifiableSet(set);
        this.h = new HashMap<o, g>();
        for (Map.Entry<o, o> entry : map.entrySet()) {
            this.h.put(entry.getKey(), new g(this, entry.getValue()));
        }
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        super.a(n2, n3, string, string2, string3, arrstring);
        this.e = string3;
        this.c = this.b();
        if (this.c) {
            this.b.e();
            this.d.a("Rewriting " + string);
        }
    }

    protected boolean b() {
        return this.a.contains(this.e) && !this.a.contains(this.b.h());
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        r r2 = super.a(n2, string, string2, string3, arrstring);
        if (!this.c) {
            return r2;
        }
        o o2 = new o(string, string2);
        g g2 = this.h.get(o2);
        if (g2 == null) {
            return r2;
        }
        this.h.remove(o2);
        return g2.a(n2, o2, r2, false);
    }

    @Override
    public void a() {
        if (this.c) {
            for (Map.Entry<o, g> entry : this.h.entrySet()) {
                r r2 = entry.getValue().a(1, entry.getKey(), super.a(1, entry.getKey().a(), entry.getKey().b(), null, null), true);
                r2.a_();
                r2.a_(177);
                r2.d(entry.getKey().d().length, entry.getKey().d().length + 1);
                r2.b();
                this.d.d("adding " + this.b.h() + "." + entry.getKey());
            }
            super.a();
        }
    }
}

