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
import java.util.List;
import java.util.Map;

public class f
extends a {
    public int w;
    public List<Object> x;
    public List<Object> y;

    private f() {
        super(-1);
    }

    public f(int n2, int n3, Object[] arrobject, int n4, Object[] arrobject2) {
        super(-1);
        this.w = n2;
        switch (n2) {
            case -1: 
            case 0: {
                this.x = f.a(n3, arrobject);
                this.y = f.a(n4, arrobject2);
                break;
            }
            case 1: {
                this.x = f.a(n3, arrobject);
                break;
            }
            case 2: {
                this.x = Arrays.asList(new Object[n3]);
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                this.y = f.a(1, arrobject2);
            }
        }
    }

    @Override
    public int b() {
        return 14;
    }

    @Override
    public void a(r r2) {
        switch (this.w) {
            case -1: 
            case 0: {
                r2.a(this.w, this.x.size(), f.a(this.x), this.y.size(), f.a(this.y));
                break;
            }
            case 1: {
                r2.a(this.w, this.x.size(), f.a(this.x), 0, null);
                break;
            }
            case 2: {
                r2.a(this.w, this.x.size(), null, 0, null);
                break;
            }
            case 3: {
                r2.a(this.w, 0, null, 0, null);
                break;
            }
            case 4: {
                r2.a(this.w, 0, null, 1, f.a(this.y));
            }
        }
    }

    @Override
    public a a(Map<o, o> map) {
        Object object;
        int n2;
        f f2 = new f();
        f2.w = this.w;
        if (this.x != null) {
            f2.x = new ArrayList<Object>();
            for (n2 = 0; n2 < this.x.size(); ++n2) {
                object = this.x.get(n2);
                if (object instanceof o) {
                    object = map.get(object);
                }
                f2.x.add(object);
            }
        }
        if (this.y != null) {
            f2.y = new ArrayList<Object>();
            for (n2 = 0; n2 < this.y.size(); ++n2) {
                object = this.y.get(n2);
                if (object instanceof o) {
                    object = map.get(object);
                }
                f2.y.add(object);
            }
        }
        return f2;
    }

    private static List<Object> a(int n2, Object[] arrobject) {
        return Arrays.asList(arrobject).subList(0, n2);
    }

    private static Object[] a(List<Object> list) {
        Object[] arrobject = new Object[list.size()];
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            Object object = list.get(i2);
            if (object instanceof o) {
                object = ((o)object).e();
            }
            arrobject[i2] = object;
        }
        return arrobject;
    }
}

