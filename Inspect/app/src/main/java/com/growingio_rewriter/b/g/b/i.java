/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g.b;

import com.growingio.b.K;
import com.growingio.b.L;
import com.growingio.b.Q;
import com.growingio.b.R;
import com.growingio.b.ad;
import com.growingio.b.ae;
import com.growingio.b.aj;
import com.growingio.b.b;
import com.growingio.b.g;
import com.growingio.b.o;
import com.growingio.b.s;
import com.growingio.b.t;
import com.growingio.b.z;
import java.lang.reflect.Method;
import java.util.Hashtable;

public class i
implements aj {
    private static final String a = "importer";
    private static final String b = "objectId";
    private static final String c = "_getObjectId";
    private static final String d = "Sample";
    private g e;
    private Hashtable f = new Hashtable();
    private K g;
    private K h;
    private o[] i;
    private o[] j;
    private o[] k;

    @Override
    public void a(g g2) throws ae {
        this.e = g2;
        o o2 = g2.f("Sample");
        this.g = o2.h("forward");
        this.h = o2.h("forwardStatic");
        this.i = g2.a(new String[]{"ObjectImporter", "int"});
        this.j = g2.a(new String[]{"java.io.Serializable", "Proxy"});
        this.k = new o[]{g2.f("RemoteException")};
    }

    @Override
    public void a(g g2, String string) {
    }

    public boolean a(String string) {
        return this.f.get(string) != null;
    }

    public synchronized boolean a(Class class_) throws b, ae {
        String string = class_.getName();
        if (this.f.get(string) != null) {
            return false;
        }
        o o2 = this.a(this.e.f(string), class_);
        this.f.put(string, o2);
        this.a(o2);
        return true;
    }

    private o a(o o2, Class class_) throws b, ae {
        int n2 = o2.c();
        if (ad.n(n2) || ad.j(n2) || !ad.a(n2)) {
            throw new b(o2.s() + " must be public, non-native, and non-abstract.");
        }
        o o3 = this.e.b(o2.s(), o2.f());
        o3.a(this.j);
        t t2 = new t(this.e.f("ObjectImporter"), "importer", o3);
        t2.a(2);
        o3.a(t2, z.b(0));
        t2 = new t(o.j, "objectId", o3);
        t2.a(2);
        o3.a(t2, z.b(1));
        o3.a(R.a("_getObjectId", t2));
        o3.a(Q.a(o3));
        s s2 = Q.a(this.i, null, o3);
        o3.a(s2);
        try {
            this.a(o3, class_.getMethods());
            return o3;
        }
        catch (SecurityException var7_7) {
            throw new b(var7_7);
        }
    }

    private o b(Class class_) throws ae {
        String string;
        if (!class_.isArray()) {
            string = class_.getName();
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            do {
                stringBuffer.append("[]");
            } while ((class_ = class_.getComponentType()).isArray());
            stringBuffer.insert(0, class_.getName());
            string = stringBuffer.toString();
        }
        return this.e.f(string);
    }

    private o[] a(Class[] arrclass) throws ae {
        int n2 = arrclass.length;
        o[] arro = new o[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arro[i2] = this.b(arrclass[i2]);
        }
        return arro;
    }

    private void a(o o2, Method[] arrmethod) throws b, ae {
        for (int i2 = 0; i2 < arrmethod.length; ++i2) {
            Method method = arrmethod[i2];
            int n2 = method.getModifiers();
            if (method.getDeclaringClass() == Object.class || ad.f(n2)) continue;
            if (ad.a(n2)) {
                K k2 = ad.e(n2) ? this.h : this.g;
                K k3 = R.a(this.b(method.getReturnType()), method.getName(), this.a(method.getParameterTypes()), this.k, k2, L.a(i2), o2);
                k3.a(n2);
                o2.a(k3);
                continue;
            }
            if (ad.c(n2) || ad.b(n2)) continue;
            throw new b("the methods must be public, protected, or private.");
        }
    }

    private void a(o o2) throws b, ae {
        o o3;
        while ((o3 = o2.f()) != null) {
            try {
                o3.b((o[])null);
                break;
            }
            catch (ae var3_3) {
                o3.a(Q.a(o3));
                o2 = o3;
                continue;
            }
        }
    }
}

