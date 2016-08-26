/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.I;
import com.growingio.b.J;
import com.growingio.b.K;
import com.growingio.b.X;
import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.R;
import com.growingio.b.a.T;
import com.growingio.b.a.Y;
import com.growingio.b.a.Z;
import com.growingio.b.a.aA;
import com.growingio.b.a.ac;
import com.growingio.b.a.af;
import com.growingio.b.a.as;
import com.growingio.b.a.az;
import com.growingio.b.a.b.c;
import com.growingio.b.a.h;
import com.growingio.b.a.i;
import com.growingio.b.a.p;
import com.growingio.b.a.y;
import com.growingio.b.ad;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.b.a;
import com.growingio.b.b.f;
import com.growingio.b.d;
import com.growingio.b.d.e;
import com.growingio.b.g;
import com.growingio.b.j;
import com.growingio.b.n;
import com.growingio.b.o;
import com.growingio.b.s;
import com.growingio.b.t;
import com.growingio.b.z;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

class r
extends o {
    g a;
    boolean p;
    private boolean u;
    boolean q;
    boolean r;
    p s;
    byte[] t;
    private WeakReference v;
    private a w;
    private X x;
    private Hashtable y;
    private int z;
    private boolean A = g.b;
    private int B;
    private static final int C = 2;

    r(String string, g g2) {
        super(string);
        this.a = g2;
        this.r = false;
        this.q = false;
        this.u = false;
        this.p = false;
        this.s = null;
        this.t = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = 0;
        this.B = 0;
    }

    r(InputStream inputStream, g g2) throws IOException {
        this((String)null, g2);
        this.s = new p(new DataInputStream(inputStream));
        this.b = this.s.i();
    }

    r(p p2, g g2) {
        this((String)null, g2);
        this.s = p2;
        this.b = this.s.i();
    }

    @Override
    protected void a(StringBuffer stringBuffer) {
        Object object;
        if (this.p) {
            stringBuffer.append("changed ");
        }
        if (this.u) {
            stringBuffer.append("frozen ");
        }
        if (this.q) {
            stringBuffer.append("pruned ");
        }
        stringBuffer.append(ad.t(this.c()));
        stringBuffer.append(" class ");
        stringBuffer.append(this.s());
        try {
            String string;
            object = this.f();
            if (object != null && !(string = object.s()).equals("java.lang.Object")) {
                stringBuffer.append(" extends " + object.s());
            }
        }
        catch (ae var2_3) {
            stringBuffer.append(" extends ??");
        }
        try {
            object = this.d();
            if (object.length > 0) {
                stringBuffer.append(" implements ");
            }
            for (int i2 = 0; i2 < object.length; ++i2) {
                stringBuffer.append(object[i2].s());
                stringBuffer.append(", ");
            }
        }
        catch (ae var2_4) {
            stringBuffer.append(" extends ??");
        }
        object = this.Y();
        this.a(stringBuffer, " fields=", object.i(), object.j());
        this.a(stringBuffer, " constructors=", object.c(), object.g());
        this.a(stringBuffer, " methods=", object.a(), object.b());
    }

    private void a(StringBuffer stringBuffer, String string, I i2, I i3) {
        stringBuffer.append(string);
        while (i2 != i3) {
            i2 = i2.s();
            stringBuffer.append(i2);
            stringBuffer.append(", ");
        }
    }

    @Override
    public a k() {
        if (this.w == null) {
            this.w = new a(this);
        }
        return this.w;
    }

    @Override
    public p j() {
        return this.b(true);
    }

    public p b(boolean bl2) {
        p p2 = this.s;
        if (p2 != null) {
            return p2;
        }
        if (bl2) {
            this.a.b();
        }
        if (this.t != null) {
            try {
                p p3 = new p(new DataInputStream(new ByteArrayInputStream(this.t)));
                this.t = null;
                this.B = 2;
                return this.a(p3);
            }
            catch (IOException var3_4) {
                throw new RuntimeException(var3_4.toString(), var3_4);
            }
        }
        InputStream inputStream = null;
        try {
            inputStream = this.a.l(this.s());
            if (inputStream == null) {
                throw new ae(this.s());
            }
            p p4 = new p(new DataInputStream(inputStream = new BufferedInputStream(inputStream)));
            if (!p4.i().equals(this.b)) {
                throw new RuntimeException("cannot find " + this.b + ": " + p4.i() + " found in " + this.b.replace('.', '/') + ".class");
            }
            p p5 = this.a(p4);
            return p5;
        }
        catch (ae var4_7) {
            throw new RuntimeException(var4_7.toString(), var4_7);
        }
        catch (IOException var4_8) {
            throw new RuntimeException(var4_8.toString(), var4_8);
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException var8_12) {}
            }
        }
    }

    @Override
    final void R() {
        ++this.B;
    }

    @Override
    void W() {
        if (this.B < 2) {
            if (!this.m() && g.c) {
                this.ac();
            } else if (this.n() && !this.q) {
                this.ab();
            }
        }
        this.B = 0;
    }

    private synchronized void ab() {
        if (this.s == null || this.X() != null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            this.s.a(dataOutputStream);
            byteArrayOutputStream.close();
            this.t = byteArrayOutputStream.toByteArray();
            this.s = null;
        }
        catch (IOException var3_3) {
            // empty catch block
        }
    }

    private synchronized void ac() {
        if (this.s != null && !this.m() && this.X() == null) {
            this.s = null;
        }
    }

    private synchronized p a(p p2) {
        if (this.s == null) {
            this.s = p2;
        }
        return this.s;
    }

    @Override
    public g a() {
        return this.a;
    }

    void a(g g2) {
        this.a = g2;
    }

    @Override
    public URL l() throws ae {
        URL uRL = this.a.i(this.s());
        if (uRL == null) {
            throw new ae(this.s());
        }
        return uRL;
    }

    @Override
    public boolean m() {
        return this.p;
    }

    @Override
    public boolean n() {
        return this.u;
    }

    @Override
    public void o() {
        this.u = true;
    }

    @Override
    void p() throws RuntimeException {
        if (this.n()) {
            String string = this.s() + " class is frozen";
            if (this.q) {
                string = string + " and pruned";
            }
            throw new RuntimeException(string);
        }
        this.p = true;
    }

    @Override
    public void q() {
        this.n("defrost");
        this.u = false;
    }

    @Override
    public boolean a(o o2) throws ae {
        int n2;
        String string = o2.s();
        if (this == o2 || this.s().equals(string)) {
            return true;
        }
        p p2 = this.j();
        String string2 = p2.j();
        if (string2 != null && string2.equals(string)) {
            return true;
        }
        String[] arrstring = p2.l();
        int n3 = arrstring.length;
        for (n2 = 0; n2 < n3; ++n2) {
            if (!arrstring[n2].equals(string)) continue;
            return true;
        }
        if (string2 != null && this.a.f(string2).a(o2)) {
            return true;
        }
        for (n2 = 0; n2 < n3; ++n2) {
            if (!this.a.f(arrstring[n2]).a(o2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public void a(String string) throws RuntimeException {
        String string2 = this.s();
        if (string.equals(string2)) {
            return;
        }
        this.a.j(string);
        p p2 = this.j();
        super.a(string);
        p2.a(string);
        this.ad();
        this.a.a(string2, this);
    }

    @Override
    public String v() {
        aA aA2 = (aA)this.j().e("Signature");
        return aA2 == null ? null : aA2.a();
    }

    @Override
    public void b(String string) {
        p p2 = this.i();
        aA aA2 = new aA(p2.c(), string);
        p2.a(aA2);
    }

    @Override
    public void a(d d2) throws RuntimeException {
        String string = this.s();
        String string2 = (String)d2.get(T.a(string));
        if (string2 != null) {
            string2 = T.b(string2);
            this.a.j(string2);
        }
        super.a(d2);
        p p2 = this.j();
        p2.a(d2);
        this.ad();
        if (string2 != null) {
            super.a(string2);
            this.a.a(string, this);
        }
    }

    @Override
    public void b(String string, String string2) throws RuntimeException {
        String string3 = this.s();
        if (string3.equals(string)) {
            this.a(string2);
        } else {
            super.b(string, string2);
            this.j().a(string, string2);
            this.ad();
        }
    }

    @Override
    public boolean x() {
        return ad.k(this.c());
    }

    @Override
    public boolean y() {
        return ad.l(this.c());
    }

    @Override
    public boolean z() {
        return ad.m(this.c());
    }

    @Override
    public int c() {
        p p2 = this.j();
        int n2 = p2.g();
        n2 = com.growingio.b.a.a.a(n2, 32);
        int n3 = p2.h();
        if (n3 != -1 && (n3 & 8) != 0) {
            n2 |= 8;
        }
        return com.growingio.b.a.a.j(n2);
    }

    @Override
    public o[] D() throws ae {
        p p2 = this.j();
        af af2 = (af)p2.e("InnerClasses");
        if (af2 == null) {
            return new o[0];
        }
        String string = p2.i() + "$";
        int n2 = af2.a();
        ArrayList<o> arrayList = new ArrayList<o>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2 = af2.b(i2);
            if (string2 == null || !string2.startsWith(string) || string2.lastIndexOf(36) >= string.length()) continue;
            arrayList.add(this.a.f(string2));
        }
        return arrayList.toArray(new o[arrayList.size()]);
    }

    @Override
    public void a(int n2) {
        p p2 = this.j();
        if (ad.e(n2)) {
            int n3 = p2.h();
            if (n3 != -1 && (n3 & 8) != 0) {
                n2 &= -9;
            } else {
                throw new RuntimeException("cannot change " + this.s() + " into a static class");
            }
        }
        this.p();
        p2.a(com.growingio.b.a.a.i(n2));
    }

    @Override
    public boolean c(String string) {
        p p2 = this.j();
        com.growingio.b.a.c c2 = (com.growingio.b.a.c)p2.e("RuntimeInvisibleAnnotations");
        com.growingio.b.a.c c3 = (com.growingio.b.a.c)p2.e("RuntimeVisibleAnnotations");
        return r.a(string, this.a(), c2, c3);
    }

    static boolean a(Class class_, g g2, com.growingio.b.a.c c2, com.growingio.b.a.c c3) {
        return r.a(class_.getName(), g2, c2, c3);
    }

    static boolean a(String string, g g2, com.growingio.b.a.c c2, com.growingio.b.a.c c3) {
        int n2;
        com.growingio.b.a.b.a[] arra = c2 == null ? null : c2.b();
        com.growingio.b.a.b.a[] arra2 = c3 == null ? null : c3.b();
        if (arra != null) {
            for (n2 = 0; n2 < arra.length; ++n2) {
                if (!arra[n2].a().equals(string)) continue;
                return true;
            }
        }
        if (arra2 != null) {
            for (n2 = 0; n2 < arra2.length; ++n2) {
                if (!arra2[n2].a().equals(string)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public Object b(Class class_) throws ClassNotFoundException {
        p p2 = this.j();
        com.growingio.b.a.c c2 = (com.growingio.b.a.c)p2.e("RuntimeInvisibleAnnotations");
        com.growingio.b.a.c c3 = (com.growingio.b.a.c)p2.e("RuntimeVisibleAnnotations");
        return r.b(class_, this.a(), c2, c3);
    }

    static Object b(Class class_, g g2, com.growingio.b.a.c c2, com.growingio.b.a.c c3) throws ClassNotFoundException {
        int n2;
        com.growingio.b.a.b.a[] arra = c2 == null ? null : c2.b();
        com.growingio.b.a.b.a[] arra2 = c3 == null ? null : c3.b();
        String string = class_.getName();
        if (arra != null) {
            for (n2 = 0; n2 < arra.length; ++n2) {
                if (!arra[n2].a().equals(string)) continue;
                return r.a(arra[n2], g2);
            }
        }
        if (arra2 != null) {
            for (n2 = 0; n2 < arra2.length; ++n2) {
                if (!arra2[n2].a().equals(string)) continue;
                return r.a(arra2[n2], g2);
            }
        }
        return null;
    }

    @Override
    public Object[] A() throws ClassNotFoundException {
        return this.c(false);
    }

    @Override
    public Object[] B() {
        try {
            return this.c(true);
        }
        catch (ClassNotFoundException var1_1) {
            throw new RuntimeException("Unexpected exception ", var1_1);
        }
    }

    private Object[] c(boolean bl2) throws ClassNotFoundException {
        p p2 = this.j();
        com.growingio.b.a.c c2 = (com.growingio.b.a.c)p2.e("RuntimeInvisibleAnnotations");
        com.growingio.b.a.c c3 = (com.growingio.b.a.c)p2.e("RuntimeVisibleAnnotations");
        return r.a(bl2, this.a(), c2, c3);
    }

    static Object[] a(boolean bl2, g g2, com.growingio.b.a.c c2, com.growingio.b.a.c c3) throws ClassNotFoundException {
        com.growingio.b.a.b.a[] arra;
        int n2;
        int n3;
        int n4;
        com.growingio.b.a.b.a[] arra2;
        if (c2 == null) {
            arra2 = null;
            n3 = 0;
        } else {
            arra2 = c2.b();
            n3 = arra2.length;
        }
        if (c3 == null) {
            arra = null;
            n4 = 0;
        } else {
            arra = c3.b();
            n4 = arra.length;
        }
        if (!bl2) {
            int n5;
            Object[] arrobject = new Object[n3 + n4];
            for (n5 = 0; n5 < n3; ++n5) {
                arrobject[n5] = r.a(arra2[n5], g2);
            }
            for (n5 = 0; n5 < n4; ++n5) {
                arrobject[n5 + n3] = r.a(arra[n5], g2);
            }
            return arrobject;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (n2 = 0; n2 < n3; ++n2) {
            try {
                arrayList.add(r.a(arra2[n2], g2));
                continue;
            }
            catch (ClassNotFoundException var10_12) {
                // empty catch block
            }
        }
        for (n2 = 0; n2 < n4; ++n2) {
            try {
                arrayList.add(r.a(arra[n2], g2));
                continue;
            }
            catch (ClassNotFoundException var10_14) {
                // empty catch block
            }
        }
        return arrayList.toArray();
    }

    static Object[][] a(boolean bl2, g g2, az az2, az az3, as as2) throws ClassNotFoundException {
        int n2 = 0;
        n2 = az2 != null ? az2.a() : (az3 != null ? az3.a() : T.f(as2.g()));
        Object[][] arrobject = new Object[n2][];
        for (int i2 = 0; i2 < n2; ++i2) {
            com.growingio.b.a.b.a[] arra;
            int n3;
            int n4;
            int n5;
            com.growingio.b.a.b.a[] arra2;
            if (az2 == null) {
                arra = null;
                n3 = 0;
            } else {
                arra = az2.b()[i2];
                n3 = arra.length;
            }
            if (az3 == null) {
                arra2 = null;
                n4 = 0;
            } else {
                arra2 = az3.b()[i2];
                n4 = arra2.length;
            }
            if (!bl2) {
                int n6;
                arrobject[i2] = new Object[n3 + n4];
                for (n6 = 0; n6 < n3; ++n6) {
                    arrobject[i2][n6] = r.a(arra[n6], g2);
                }
                for (n6 = 0; n6 < n4; ++n6) {
                    arrobject[i2][n6 + n3] = r.a(arra2[n6], g2);
                }
                continue;
            }
            ArrayList<Object> arrayList = new ArrayList<Object>();
            for (n5 = 0; n5 < n3; ++n5) {
                try {
                    arrayList.add(r.a(arra[n5], g2));
                    continue;
                }
                catch (ClassNotFoundException var14_16) {
                    // empty catch block
                }
            }
            for (n5 = 0; n5 < n4; ++n5) {
                try {
                    arrayList.add(r.a(arra2[n5], g2));
                    continue;
                }
                catch (ClassNotFoundException var14_17) {
                    // empty catch block
                }
            }
            arrobject[i2] = arrayList.toArray();
        }
        return arrobject;
    }

    private static Object a(com.growingio.b.a.b.a a2, g g2) throws ClassNotFoundException {
        try {
            ClassLoader classLoader = g2.f();
            return a2.a(classLoader, g2);
        }
        catch (ClassNotFoundException var2_3) {
            ClassLoader classLoader = g2.getClass().getClassLoader();
            try {
                return a2.a(classLoader, g2);
            }
            catch (ClassNotFoundException var4_5) {
                try {
                    Class class_ = g2.f(a2.a()).O();
                    return c.a(class_.getClassLoader(), class_, g2, a2);
                }
                catch (Throwable var5_7) {
                    throw new ClassNotFoundException(a2.a());
                }
            }
        }
    }

    @Override
    public boolean b(o o2) {
        if (o2 == null) {
            return false;
        }
        String string = o2.s();
        try {
            for (o o3 = this; o3 != null; o3 = o3.f()) {
                if (!o3.s().equals(string)) continue;
                return true;
            }
        }
        catch (Exception var4_4) {
            // empty catch block
        }
        return false;
    }

    @Override
    public o f() throws ae {
        String string = this.j().j();
        if (string == null) {
            return null;
        }
        return this.a.f(string);
    }

    @Override
    public void c(o o2) throws b {
        this.p();
        if (this.x()) {
            this.d(o2);
        } else {
            this.j().b(o2.s());
        }
    }

    @Override
    public o[] d() throws ae {
        String[] arrstring = this.j().l();
        int n2 = arrstring.length;
        o[] arro = new o[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arro[i2] = this.a.f(arrstring[i2]);
        }
        return arro;
    }

    @Override
    public void a(o[] arro) {
        String[] arrstring;
        this.p();
        if (arro == null) {
            arrstring = new String[]{};
        } else {
            int n2 = arro.length;
            arrstring = new String[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                arrstring[i2] = arro[i2].s();
            }
        }
        this.j().a(arrstring);
    }

    @Override
    public void d(o o2) {
        this.p();
        if (o2 != null) {
            this.j().c(o2.s());
        }
    }

    @Override
    public o E() throws ae {
        p p2 = this.j();
        af af2 = (af)p2.e("InnerClasses");
        if (af2 == null) {
            return null;
        }
        String string = this.s();
        int n2 = af2.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!string.equals(af2.b(i2))) continue;
            String string2 = af2.d(i2);
            if (string2 != null) {
                return this.a.f(string2);
            }
            Y y2 = (Y)p2.e("EnclosingMethod");
            if (y2 == null) continue;
            return this.a.f(y2.g());
        }
        return null;
    }

    @Override
    public n G() throws ae {
        p p2 = this.j();
        Y y2 = (Y)p2.e("EnclosingMethod");
        if (y2 == null) {
            return null;
        }
        o o2 = this.a.f(y2.g());
        String string = y2.h();
        if ("<init>".equals(string)) {
            return o2.f(y2.i());
        }
        if ("<clinit>".equals(string)) {
            return o2.L();
        }
        return o2.a(string, y2.i());
    }

    @Override
    public o a(String string, boolean bl2) {
        if (!bl2) {
            throw new RuntimeException("sorry, only nested static class is supported");
        }
        this.p();
        o o2 = this.a.n(this.s() + "$" + string);
        p p2 = this.j();
        p p3 = o2.j();
        af af2 = (af)p2.e("InnerClasses");
        if (af2 == null) {
            af2 = new af(p2.c());
            p2.a(af2);
        }
        af2.a(o2.s(), this.s(), string, p3.g() & -33 | 8);
        p3.a(af2.a(p3.c(), null));
        return o2;
    }

    private void ad() {
        J j2 = this.X();
        if (j2 != null) {
            I i2 = j2.b();
            for (I i3 = j2.a(); i3 != i2; i3 = i3.s()) {
                i3.t();
            }
        }
    }

    protected J X() {
        WeakReference weakReference = this.v;
        if (weakReference != null) {
            return (J)weakReference.get();
        }
        return null;
    }

    protected synchronized J Y() {
        J j2 = null;
        if (this.v == null || (j2 = (J)this.v.get()) == null) {
            j2 = new J(this);
            this.a(j2);
            this.b(j2);
            this.v = new WeakReference<J>(j2);
        }
        return j2;
    }

    private void a(J j2) {
        List list = this.b(false).m();
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ac ac2 = (ac)list.get(i2);
            t t2 = new t(ac2, (o)this);
            j2.c(t2);
        }
    }

    private void b(J j2) {
        List list = this.b(false).n();
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            as as2 = (as)list.get(i2);
            if (as2.b()) {
                K k2 = new K(as2, this);
                j2.a(k2);
                continue;
            }
            s s2 = new s(as2, (o)this);
            j2.b(s2);
        }
    }

    @Override
    public t[] H() {
        ArrayList arrayList = new ArrayList();
        r.a(arrayList, (o)this);
        return arrayList.toArray(new t[arrayList.size()]);
    }

    private static void a(ArrayList arrayList, o o2) {
        Object object;
        if (o2 == null) {
            return;
        }
        try {
            r.a(arrayList, o2.f());
        }
        catch (ae var4_2) {
            // empty catch block
        }
        try {
            object = o2.d();
            int n2 = object.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                r.a(arrayList, (o)object[i2]);
            }
        }
        catch (ae var4_4) {
            // empty catch block
        }
        object = ((r)o2).Y();
        I i3 = object.i();
        I i4 = object.j();
        while (i3 != i4) {
            if (ad.b((i3 = i3.s()).d())) continue;
            arrayList.add(i3);
        }
    }

    @Override
    public t c(String string, String string2) throws ae {
        t t2 = this.d(string, string2);
        return this.a(t2, string, string2);
    }

    private t a(t t2, String string, String string2) throws ae {
        if (t2 == null) {
            String string3 = "field: " + string;
            if (string2 != null) {
                string3 = string3 + " type " + string2;
            }
            throw new ae(string3 + " in " + this.s());
        }
        return t2;
    }

    @Override
    t d(String string, String string2) {
        t t2 = this.f(string, string2);
        if (t2 != null) {
            return t2;
        }
        try {
            o[] arro = this.d();
            int n2 = arro.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                t t3 = arro[i2].d(string, string2);
                if (t3 == null) continue;
                return t3;
            }
            o o2 = this.f();
            if (o2 != null) {
                return o2.d(string, string2);
            }
        }
        catch (ae var4_5) {
            // empty catch block
        }
        return null;
    }

    @Override
    public t[] I() {
        I i2;
        J j2 = this.Y();
        I i3 = j2.j();
        int n2 = J.a(i2, i3);
        t[] arrt = new t[n2];
        int n3 = 0;
        for (i2 = j2.i(); i2 != i3; i2 = i2.s()) {
            arrt[n3++] = (t)i2;
        }
        return arrt;
    }

    @Override
    public t e(String string) throws ae {
        return this.e(string, null);
    }

    @Override
    public t e(String string, String string2) throws ae {
        t t2 = this.f(string, string2);
        return this.a(t2, string, string2);
    }

    private t f(String string, String string2) {
        J j2 = this.Y();
        I i2 = j2.i();
        I i3 = j2.j();
        while (i2 != i3) {
            if (!(i2 = i2.s()).q().equals(string) || string2 != null && !string2.equals(i2.k())) continue;
            return (t)i2;
        }
        return null;
    }

    @Override
    public n[] J() {
        I i2;
        J j2 = this.Y();
        I i3 = j2.g();
        int n2 = J.a(i2, i3);
        I i4 = j2.a();
        I i5 = j2.b();
        int n3 = J.a(i4, i5);
        n[] arrn = new n[n2 + n3];
        int n4 = 0;
        for (i2 = j2.c(); i2 != i3; i2 = i2.s()) {
            arrn[n4++] = (n)i2;
        }
        while (i4 != i5) {
            i4 = i4.s();
            arrn[n4++] = (n)i4;
        }
        return arrn;
    }

    @Override
    public s[] h() {
        J j2 = this.Y();
        I i2 = j2.c();
        I i3 = j2.g();
        int n2 = 0;
        I i4 = i2;
        while (i4 != i3) {
            if (!r.c((s)(i4 = i4.s()))) continue;
            ++n2;
        }
        s[] arrs = new s[n2];
        int n3 = 0;
        i4 = i2;
        while (i4 != i3) {
            s s2 = (s)(i4 = i4.s());
            if (!r.c(s2)) continue;
            arrs[n3++] = s2;
        }
        return arrs;
    }

    private static boolean c(s s2) {
        return !ad.b(s2.d()) && s2.o();
    }

    @Override
    public s f(String string) throws ae {
        J j2 = this.Y();
        I i2 = j2.c();
        I i3 = j2.g();
        while (i2 != i3) {
            s s2 = (s)(i2 = i2.s());
            if (!s2.c().g().equals(string) || !s2.o()) continue;
            return s2;
        }
        return super.f(string);
    }

    @Override
    public s[] K() {
        Object object;
        J j2 = this.Y();
        I i2 = j2.c();
        I i3 = j2.g();
        int n2 = 0;
        I i4 = i2;
        while (i4 != i3) {
            object = (s)(i4 = i4.s());
            if (!object.o()) continue;
            ++n2;
        }
        object = new s[n2];
        int n3 = 0;
        i4 = i2;
        while (i4 != i3) {
            s s2 = (s)(i4 = i4.s());
            if (!s2.o()) continue;
            object[n3++] = s2;
        }
        return object;
    }

    @Override
    public s L() {
        J j2 = this.Y();
        I i2 = j2.c();
        I i3 = j2.g();
        while (i2 != i3) {
            s s2 = (s)(i2 = i2.s());
            if (!s2.p()) continue;
            return s2;
        }
        return null;
    }

    @Override
    public K[] g() {
        HashMap hashMap = new HashMap();
        r.a(hashMap, (o)this);
        return hashMap.values().toArray(new K[hashMap.size()]);
    }

    private static void a(HashMap hashMap, o o2) {
        Object object;
        try {
            object = o2.d();
            int n2 = object.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                r.a(hashMap, (o)object[i2]);
            }
        }
        catch (ae var2_3) {
            // empty catch block
        }
        try {
            object = o2.f();
            if (object != null) {
                r.a(hashMap, (o)object);
            }
        }
        catch (ae var2_4) {
            // empty catch block
        }
        if (o2 instanceof r) {
            object = ((r)o2).Y();
            I i3 = object.a();
            I i4 = object.b();
            while (i3 != i4) {
                if (ad.b((i3 = i3.s()).d())) continue;
                hashMap.put(((K)i3).o(), i3);
            }
        }
    }

    @Override
    public K a(String string, String string2) throws ae {
        K k2 = r.a(this, string, string2);
        if (k2 != null) {
            return k2;
        }
        throw new ae(string + "(..) is not found in " + this.s());
    }

    private static K a(o o2, String string, String string2) {
        I i2;
        o[] arro;
        if (o2 instanceof r) {
            arro = ((r)o2).Y();
            i2 = arro.a();
            I i3 = arro.b();
            while (i2 != i3) {
                if (!(i2 = i2.s()).q().equals(string) || !((K)i2).c().g().equals(string2)) continue;
                return (K)i2;
            }
        }
        try {
            arro = o2.f();
            if (arro != null && (i2 = r.a((o)arro, string, string2)) != null) {
                return i2;
            }
        }
        catch (ae var3_4) {
            // empty catch block
        }
        try {
            arro = o2.d();
            int n2 = arro.length;
            for (int i4 = 0; i4 < n2; ++i4) {
                K k2 = r.a(arro[i4], string, string2);
                if (k2 == null) continue;
                return k2;
            }
        }
        catch (ae var3_5) {
            // empty catch block
        }
        return null;
    }

    @Override
    public K[] M() {
        I i2;
        J j2 = this.Y();
        I i3 = j2.b();
        int n2 = J.a(i2, i3);
        K[] arrk = new K[n2];
        int n3 = 0;
        for (i2 = j2.a(); i2 != i3; i2 = i2.s()) {
            arrk[n3++] = (K)i2;
        }
        return arrk;
    }

    @Override
    public K[] g(String string) throws ae {
        J j2 = this.Y();
        I i2 = j2.a();
        I i3 = j2.b();
        ArrayList<K> arrayList = new ArrayList<K>();
        while (i2 != i3) {
            if (!(i2 = i2.s()).q().equals(string)) continue;
            arrayList.add((K)i2);
        }
        return arrayList.toArray(new K[arrayList.size()]);
    }

    @Override
    public K h(String string) throws ae {
        J j2 = this.Y();
        I i2 = j2.a();
        I i3 = j2.b();
        while (i2 != i3) {
            if (!(i2 = i2.s()).q().equals(string)) continue;
            return (K)i2;
        }
        throw new ae(string + "(..) is not found in " + this.s());
    }

    @Override
    public K a(String string, o[] arro) throws ae {
        String string2 = T.b(arro);
        J j2 = this.Y();
        I i2 = j2.a();
        I i3 = j2.b();
        while (i2 != i3) {
            if (!(i2 = i2.s()).q().equals(string) || !((K)i2).c().g().startsWith(string2)) continue;
            return (K)i2;
        }
        throw new ae(string + "(..) is not found in " + this.s());
    }

    @Override
    public void a(t t2, String string) throws b {
        this.a(t2, z.c(string));
    }

    @Override
    public void a(t t2, z z2) throws b {
        Object object;
        this.p();
        if (t2.r_() != this) {
            throw new b("cannot add");
        }
        if (z2 == null) {
            z2 = t2.b();
        }
        if (z2 != null) {
            z2.a(t2.k());
            int n2 = t2.d();
            if (ad.e(n2) && ad.f(n2)) {
                try {
                    object = this.j().c();
                    int n3 = z2.a((Q)object, t2.i());
                    if (n3 != 0) {
                        t2.g().a(new R((Q)object, n3));
                        z2 = null;
                    }
                }
                catch (ae var4_6) {
                    // empty catch block
                }
            }
        }
        this.Y().c(t2);
        this.j().a(t2.g());
        if (z2 != null) {
            X x2 = new X(t2, z2);
            object = this.x;
            if (object == null) {
                this.x = x2;
            } else {
                while (object.a != null) {
                    object = object.a;
                }
                object.a = x2;
            }
        }
    }

    @Override
    public void b(t t2) throws ae {
        this.p();
        ac ac2 = t2.g();
        p p2 = this.j();
        if (!p2.m().remove(ac2)) {
            throw new ae(t2.toString());
        }
        this.Y().d(t2);
        this.r = true;
    }

    @Override
    public s N() throws b {
        s s2 = this.L();
        if (s2 != null) {
            return s2;
        }
        this.p();
        p p2 = this.j();
        com.growingio.b.a.o o2 = new com.growingio.b.a.o(p2.c(), 0, 0);
        this.a(p2, o2, 0, 0);
        return this.L();
    }

    @Override
    public void a(s s2) throws b {
        this.p();
        if (s2.r_() != this) {
            throw new b("cannot add");
        }
        this.Y().b(s2);
        this.j().a(s2.c());
    }

    @Override
    public void b(s s2) throws ae {
        this.p();
        as as2 = s2.c();
        p p2 = this.j();
        if (!p2.n().remove(as2)) {
            throw new ae(s2.toString());
        }
        this.Y().d(s2);
        this.r = true;
    }

    @Override
    public void a(K k2) throws b {
        this.p();
        if (k2.r_() != this) {
            throw new b("bad declaring class");
        }
        int n2 = k2.d();
        if ((this.c() & 512) != 0) {
            k2.a(n2 | 1);
            if ((n2 & 1024) == 0) {
                throw new b("an interface method must be abstract: " + k2.toString());
            }
        }
        this.Y().a(k2);
        this.j().a(k2.c());
        if ((n2 & 1024) != 0) {
            this.a(this.c() | 1024);
        }
    }

    @Override
    public void b(K k2) throws ae {
        this.p();
        as as2 = k2.c();
        p p2 = this.j();
        if (!p2.n().remove(as2)) {
            throw new ae(k2.toString());
        }
        this.Y().d(k2);
        this.r = true;
    }

    @Override
    public byte[] i(String string) {
        h h2 = this.j().e(string);
        if (h2 == null) {
            return null;
        }
        return h2.f();
    }

    @Override
    public void a(String string, byte[] arrby) {
        this.p();
        p p2 = this.j();
        p2.a(new h(p2.c(), string, arrby));
    }

    @Override
    public void a(j j2) throws b {
        this.p();
        p p2 = this.j();
        Q q2 = p2.c();
        List list = p2.n();
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            as as2 = (as)list.get(i2);
            j2.a((o)this, as2, q2);
        }
    }

    @Override
    public void a(e e2) throws b {
        this.p();
        p p2 = this.j();
        List list = p2.n();
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            as as2 = (as)list.get(i2);
            e2.a(this, as2);
        }
    }

    @Override
    public void Q() {
        if (this.q) {
            return;
        }
        this.u = true;
        this.q = true;
        this.j().b();
    }

    @Override
    public void S() {
        this.r = true;
    }

    @Override
    public void a(DataOutputStream dataOutputStream) throws b, IOException {
        try {
            if (this.m()) {
                this.n("toBytecode");
                p p2 = this.j();
                if (this.r) {
                    p2.a();
                    this.r = false;
                }
                this.c(p2);
                this.d(p2);
                if (c != null) {
                    this.b(p2);
                }
                p2.a(dataOutputStream);
                dataOutputStream.flush();
                this.x = null;
                if (this.A) {
                    p2.b();
                    this.q = true;
                }
            } else {
                this.a.a(this.s(), dataOutputStream);
            }
            this.B = 0;
            this.u = true;
        }
        catch (ae var2_3) {
            throw new b(var2_3);
        }
        catch (IOException var2_4) {
            throw new b(var2_4);
        }
    }

    private void b(p p2) throws IOException {
        DataOutputStream dataOutputStream = this.k(c);
        try {
            p2.a(dataOutputStream);
        }
        finally {
            dataOutputStream.close();
        }
    }

    private void n(String string) {
        if (this.q) {
            throw new RuntimeException(string + "(): " + this.s() + " was pruned.");
        }
    }

    @Override
    public boolean a(boolean bl2) {
        boolean bl3 = !this.A;
        this.A = !bl2;
        return bl3;
    }

    private void c(p p2) throws b, ae {
        if (this.x == null) {
            return;
        }
        com.growingio.b.a.o o2 = new com.growingio.b.a.o(p2.c(), 0, 0);
        f f2 = new f(o2, this);
        int n2 = 0;
        boolean bl2 = false;
        X x2 = this.x;
        while (x2 != null) {
            t t2 = x2.b;
            if (ad.e(t2.d())) {
                bl2 = true;
                int n3 = x2.c.a(t2.i(), t2.q(), o2, f2);
                if (n2 < n3) {
                    n2 = n3;
                }
            }
            x2 = x2.a;
        }
        if (bl2) {
            this.a(p2, o2, n2, 0);
        }
    }

    private void a(p p2, com.growingio.b.a.o o2, int n2, int n3) throws b {
        Object object;
        as as2 = p2.o();
        if (as2 == null) {
            o2.b(177);
            o2.d(n2);
            o2.e(n3);
            as2 = new as(p2.c(), "<clinit>", "()V");
            as2.a(8);
            as2.a(o2.e());
            p2.a(as2);
            object = this.X();
            if (object != null) {
                object.b(new s(as2, (o)this));
            }
        } else {
            object = as2.j();
            if (object == null) {
                throw new b("empty <clinit>");
            }
            try {
                int n4;
                B b2 = object.k();
                int n5 = b2.b(o2.g());
                b2.a(o2.d(), n5);
                int n6 = object.b();
                if (n6 < n2) {
                    object.a(n2);
                }
                if ((n4 = object.h()) < n3) {
                    object.b(n3);
                }
            }
            catch (i var7_9) {
                throw new b(var7_9);
            }
        }
        try {
            as2.a(this.a, p2);
        }
        catch (i var6_7) {
            throw new b(var6_7);
        }
    }

    private void d(p p2) throws b, ae {
        if (this.x == null) {
            return;
        }
        Q q2 = p2.c();
        List list = p2.n();
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            y y2;
            as as2 = (as)list.get(i2);
            if (!as2.d() || (y2 = as2.j()) == null) continue;
            try {
                com.growingio.b.a.o o2 = new com.growingio.b.a.o(q2, 0, y2.h());
                o[] arro = T.a(as2.g(), this.a);
                int n3 = this.a(o2, arro);
                r.a(y2, o2, n3);
                as2.a(this.a, p2);
                continue;
            }
            catch (i var8_9) {
                throw new b(var8_9);
            }
        }
    }

    private static void a(y y2, com.growingio.b.a.o o2, int n2) throws i {
        B b2 = y2.k();
        int n3 = b2.i();
        if (n3 < 0 && (n3 = b2.j()) >= 0) {
            return;
        }
        int n4 = b2.b(o2.g());
        b2.a(o2.d(), n4);
        int n5 = y2.b();
        if (n5 < n2) {
            y2.a(n2);
        }
    }

    private int a(com.growingio.b.a.o o2, o[] arro) throws b, ae {
        int n2 = 0;
        f f2 = new f(o2, this);
        try {
            f2.a(arro, false);
        }
        catch (com.growingio.b.b.e var5_5) {
            throw new b(var5_5);
        }
        X x2 = this.x;
        while (x2 != null) {
            int n3;
            t t2 = x2.b;
            if (!ad.e(t2.d()) && n2 < (n3 = x2.c.a(t2.i(), t2.q(), o2, arro, f2))) {
                n2 = n3;
            }
            x2 = x2.a;
        }
        return n2;
    }

    Hashtable Z() {
        if (this.y == null) {
            this.y = new Hashtable();
        }
        return this.y;
    }

    int aa() {
        return this.z++;
    }

    @Override
    public String m(String string) {
        String string2;
        HashMap hashMap = new HashMap();
        this.a(hashMap);
        Set set = hashMap.keySet();
        String[] arrstring = new String[set.size()];
        set.toArray(arrstring);
        if (r.a(string, arrstring)) {
            return string;
        }
        int n2 = 100;
        do {
            if (n2 <= 999) continue;
            throw new RuntimeException("too many unique name");
        } while (!r.a(string2 = string + n2++, arrstring));
        return string2;
    }

    private static boolean a(String string, String[] arrstring) {
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!arrstring[i2].startsWith(string)) continue;
            return false;
        }
        return true;
    }

    private void a(HashMap hashMap) {
        Object object2;
        int n2;
        int n3 = this.c();
        if (ad.n(n3) || ad.k(n3)) {
            try {
                for (o object3 : this.d()) {
                    if (object3 == null || !(object3 instanceof r)) continue;
                    ((r)object3).a(hashMap);
                }
            }
            catch (ae var3_4) {
                // empty catch block
            }
        }
        try {
            object2 = this.f();
            if (object2 != null && object2 instanceof r) {
                ((r)object2).a(hashMap);
            }
        }
        catch (ae var3_5) {
            // empty catch block
        }
        object2 = this.j().n();
        int n4 = object2.size();
        for (n2 = 0; n2 < n4; ++n2) {
            as as2 = (as)object2.get(n2);
            hashMap.put(as2.a(), this);
        }
        object2 = this.j().m();
        n4 = object2.size();
        for (n2 = 0; n2 < n4; ++n2) {
            ac ac2 = (ac)object2.get(n2);
            hashMap.put(ac2.b(), this);
        }
    }
}

