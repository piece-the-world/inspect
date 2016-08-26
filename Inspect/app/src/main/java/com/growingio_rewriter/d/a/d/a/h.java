/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d.a;

import com.growingio.d.a.d.a.b;
import com.growingio.d.a.d.a.d;
import com.growingio.d.a.d.a.e;
import com.growingio.d.a.d.a.m;
import com.growingio.d.a.u;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class h
extends e {
    private final u b;
    private final u c;
    private final List<u> dm;
    private final boolean dn;
    private ClassLoader do;

    public h() {
        this(null, null, false);
    }

    public h(u u2, u u3, boolean bl2) {
        this(u2, u3, null, bl2);
    }

    public h(u u2, u u3, List<u> list, boolean bl2) {
        this(327680, u2, u3, list, bl2);
    }

    protected h(int n2, u u2, u u3, List<u> list, boolean bl2) {
        super(n2);
        this.do = this.getClass().getClassLoader();
        this.b = u2;
        this.c = u3;
        this.dm = list;
        this.dn = bl2;
    }

    public void a(ClassLoader classLoader) {
        this.do = classLoader;
    }

    @Override
    public d a(u u2) {
        boolean bl2;
        d d2;
        if (u2 == null) {
            return d.a;
        }
        boolean bl3 = bl2 = u2.a() == 9;
        if (bl2) {
            switch (u2.c().a()) {
                case 1: 
                case 2: 
                case 3: 
                case 4: {
                    return new d(u2);
                }
            }
        }
        if (d.f.equals(d2 = super.a(u2))) {
            if (bl2) {
                d2 = this.a(u2.c());
                String string = d2.a().i();
                for (int i2 = 0; i2 < u2.b(); ++i2) {
                    string = "" + '[' + string;
                }
                d2 = new d(u.a(string));
            } else {
                d2 = new d(u2);
            }
        }
        return d2;
    }

    @Override
    protected boolean a(d d2) {
        u u2 = d2.a();
        return u2 != null && ("Lnull;".equals(u2.i()) || u2.a() == 9);
    }

    @Override
    protected d b(d d2) throws b {
        u u2 = d2.a();
        if (u2 != null) {
            if (u2.a() == 9) {
                return this.a(u.a(u2.i().substring(1)));
            }
            if ("Lnull;".equals(u2.i())) {
                return d2;
            }
        }
        throw new Error("Internal error");
    }

    @Override
    protected boolean b(d d2, d d3) {
        u u2 = d3.a();
        u u3 = d2.a();
        switch (u2.a()) {
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                return u3.equals(u2);
            }
            case 9: 
            case 10: {
                if ("Lnull;".equals(u3.i())) {
                    return true;
                }
                if (u3.a() == 10 || u3.a() == 9) {
                    return this.a(u2, u3);
                }
                return false;
            }
        }
        throw new Error("Internal error");
    }

    @Override
    public d a(d d2, d d3) {
        if (!d2.equals(d3)) {
            u u2 = d2.a();
            u u3 = d3.a();
            if (!(u2 == null || u2.a() != 10 && u2.a() != 9 || u3 == null || u3.a() != 10 && u3.a() != 9)) {
                if ("Lnull;".equals(u2.i())) {
                    return d3;
                }
                if ("Lnull;".equals(u3.i())) {
                    return d2;
                }
                if (this.a(u2, u3)) {
                    return d2;
                }
                if (this.a(u3, u2)) {
                    return d3;
                }
                do {
                    if (u2 != null && !this.c(u2)) continue;
                    return d.f;
                } while (!this.a(u2 = this.d(u2), u3));
                return this.a(u2);
            }
            return d.a;
        }
        return d2;
    }

    protected boolean c(u u2) {
        if (this.b != null && u2.equals(this.b)) {
            return this.dn;
        }
        return this.e(u2).isInterface();
    }

    protected u d(u u2) {
        if (this.b != null && u2.equals(this.b)) {
            return this.c;
        }
        Class class_ = this.e(u2).getSuperclass();
        return class_ == null ? null : u.a(class_);
    }

    @Override
    protected boolean a(u u2, u u3) {
        if (u2.equals(u3)) {
            return true;
        }
        if (this.b != null && u2.equals(this.b)) {
            if (this.d(u3) == null) {
                return false;
            }
            if (this.dn) {
                return u3.a() == 10 || u3.a() == 9;
            }
            return this.a(u2, this.d(u3));
        }
        if (this.b != null && u3.equals(this.b)) {
            if (this.a(u2, this.c)) {
                return true;
            }
            if (this.dm != null) {
                for (int i2 = 0; i2 < this.dm.size(); ++i2) {
                    u u4 = this.dm.get(i2);
                    if (!this.a(u2, u4)) continue;
                    return true;
                }
            }
            return false;
        }
        reference var3_4 = this.e(u2);
        if (var3_4.isInterface()) {
            var3_4 = Object.class;
        }
        return var3_4.isAssignableFrom(this.e(u3));
    }

    protected Class<?> e(u u2) {
        try {
            if (u2.a() == 9) {
                return Class.forName(u2.i().replace('/', '.'), false, this.do);
            }
            return Class.forName(u2.d(), false, this.do);
        }
        catch (ClassNotFoundException var2_2) {
            throw new RuntimeException(var2_2.toString());
        }
    }

    @Override
    public /* synthetic */ m b(u u2) {
        return this.a(u2);
    }
}

