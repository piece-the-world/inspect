/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.X;
import com.growingio.b.a.aO;
import com.growingio.b.a.ac;
import com.growingio.b.a.af;
import com.growingio.b.a.as;
import com.growingio.b.a.h;
import com.growingio.b.a.i;
import com.growingio.b.b;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public final class p {
    int a;
    int b;
    Q c;
    int d;
    int e;
    int f;
    int[] g;
    ArrayList h;
    ArrayList i;
    ArrayList j;
    String k;
    String[] l;
    String m;
    public static final int n = 45;
    public static final int o = 46;
    public static final int p = 47;
    public static final int q = 48;
    public static final int r = 49;
    public static final int s = 50;
    public static final int t = 51;
    public static final int u = 52;
    public static final int v;

    public p(DataInputStream dataInputStream) throws IOException {
        this.a(dataInputStream);
    }

    public p(boolean bl2, String string, String string2) {
        this.a = v;
        this.b = 0;
        this.c = new Q(string);
        this.d = this.c.d();
        this.e = bl2 ? 1536 : 32;
        this.f(string2);
        this.g = null;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.k = string;
        this.j = new ArrayList();
        this.j.add(new aO(this.c, p.g(this.k)));
    }

    private void f(String string) {
        if (string != null) {
            this.f = this.c.a(string);
            this.m = string;
        } else {
            this.f = this.c.a("java.lang.Object");
            this.m = "java.lang.Object";
        }
    }

    private static String g(String string) {
        int n2 = string.lastIndexOf(46);
        if (n2 >= 0) {
            string = string.substring(n2 + 1);
        }
        return string + ".java";
    }

    public void a() {
        int n2;
        Object object;
        Q q2 = this.u();
        ArrayList arrayList = this.i;
        int n3 = arrayList.size();
        for (n2 = 0; n2 < n3; ++n2) {
            object = (as)arrayList.get(n2);
            object.a(q2);
        }
        arrayList = this.h;
        n3 = arrayList.size();
        for (n2 = 0; n2 < n3; ++n2) {
            object = (ac)arrayList.get(n2);
            object.a(q2);
        }
        this.j = h.a(this.j, q2);
        this.c = q2;
    }

    private Q u() {
        Q q2 = new Q(this.k);
        this.d = q2.d();
        String string = this.j();
        if (string != null) {
            this.f = q2.a(this.j());
        }
        if (this.g != null) {
            int n2 = this.g.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                this.g[i2] = q2.a(this.c.d(this.g[i2]));
            }
        }
        return q2;
    }

    public void b() {
        int n2;
        h h2;
        Object object;
        h h3;
        Q q2 = this.u();
        ArrayList<h> arrayList = new ArrayList<h>();
        h h4 = this.e("RuntimeInvisibleAnnotations");
        if (h4 != null) {
            h4 = h4.a(q2, null);
            arrayList.add(h4);
        }
        if ((h3 = this.e("RuntimeVisibleAnnotations")) != null) {
            h3 = h3.a(q2, null);
            arrayList.add(h3);
        }
        if ((h2 = this.e("Signature")) != null) {
            h2 = h2.a(q2, null);
            arrayList.add(h2);
        }
        ArrayList arrayList2 = this.i;
        int n3 = arrayList2.size();
        for (n2 = 0; n2 < n3; ++n2) {
            object = (as)arrayList2.get(n2);
            object.b(q2);
        }
        arrayList2 = this.h;
        n3 = arrayList2.size();
        for (n2 = 0; n2 < n3; ++n2) {
            object = (ac)arrayList2.get(n2);
            object.b(q2);
        }
        this.j = arrayList;
        this.c = q2;
    }

    public Q c() {
        return this.c;
    }

    public boolean d() {
        return (this.e & 512) != 0;
    }

    public boolean e() {
        return (this.e & 16) != 0;
    }

    public boolean f() {
        return (this.e & 1024) != 0;
    }

    public int g() {
        return this.e;
    }

    public void a(int n2) {
        if ((n2 & 512) == 0) {
            n2 |= 32;
        }
        this.e = n2;
    }

    public int h() {
        af af2 = (af)this.e("InnerClasses");
        if (af2 == null) {
            return -1;
        }
        String string = this.i();
        int n2 = af2.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!string.equals(af2.b(i2))) continue;
            return af2.g(i2);
        }
        return -1;
    }

    public String i() {
        return this.k;
    }

    public void a(String string) {
        this.a(this.k, string);
    }

    public String j() {
        if (this.m == null) {
            this.m = this.c.d(this.f);
        }
        return this.m;
    }

    public int k() {
        return this.f;
    }

    public void b(String string) throws b {
        if (string == null) {
            string = "java.lang.Object";
        }
        try {
            this.f = this.c.a(string);
            ArrayList arrayList = this.i;
            int n2 = arrayList.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                as as2 = (as)arrayList.get(i2);
                as2.d(string);
            }
        }
        catch (i var2_3) {
            throw new b(var2_3);
        }
        this.m = string;
    }

    public final void a(String string, String string2) {
        int n2;
        Object object;
        String string3;
        if (string.equals(string2)) {
            return;
        }
        if (string.equals(this.k)) {
            this.k = string2;
        }
        string = T.a(string);
        string2 = T.a(string2);
        this.c.b(string, string2);
        h.a(this.j, string, string2);
        ArrayList arrayList = this.i;
        int n3 = arrayList.size();
        for (n2 = 0; n2 < n3; ++n2) {
            object = (as)arrayList.get(n2);
            string3 = object.g();
            object.b(T.a(string3, string, string2));
            h.a(object.h(), string, string2);
        }
        arrayList = this.h;
        n3 = arrayList.size();
        for (n2 = 0; n2 < n3; ++n2) {
            object = (ac)arrayList.get(n2);
            string3 = object.d();
            object.b(T.a(string3, string, string2));
            h.a(object.f(), string, string2);
        }
    }

    public final void a(Map map) {
        int n2;
        Object object;
        String string;
        String string2 = (String)map.get(T.a(this.k));
        if (string2 != null) {
            this.k = T.b(string2);
        }
        this.c.a(map);
        h.a((List)this.j, map);
        ArrayList arrayList = this.i;
        int n3 = arrayList.size();
        for (n2 = 0; n2 < n3; ++n2) {
            object = (as)arrayList.get(n2);
            string = object.g();
            object.b(T.a(string, map));
            h.a(object.h(), map);
        }
        arrayList = this.h;
        n3 = arrayList.size();
        for (n2 = 0; n2 < n3; ++n2) {
            object = (ac)arrayList.get(n2);
            string = object.d();
            object.b(T.a(string, map));
            h.a(object.f(), map);
        }
    }

    public final void b(Map map) {
        String string;
        int n2;
        Object object;
        this.c.a(map);
        h.b((List)this.j, map);
        ArrayList arrayList = this.i;
        int n3 = arrayList.size();
        for (n2 = 0; n2 < n3; ++n2) {
            object = (as)arrayList.get(n2);
            string = object.g();
            T.a(string, map);
            h.b(object.h(), map);
        }
        arrayList = this.h;
        n3 = arrayList.size();
        for (n2 = 0; n2 < n3; ++n2) {
            object = (ac)arrayList.get(n2);
            string = object.d();
            T.a(string, map);
            h.b(object.f(), map);
        }
    }

    public String[] l() {
        if (this.l != null) {
            return this.l;
        }
        String[] arrstring = null;
        if (this.g == null) {
            arrstring = new String[]{};
        } else {
            int n2 = this.g.length;
            String[] arrstring2 = new String[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                arrstring2[i2] = this.c.d(this.g[i2]);
            }
            arrstring = arrstring2;
        }
        this.l = arrstring;
        return arrstring;
    }

    public void a(String[] arrstring) {
        this.l = null;
        if (arrstring != null) {
            int n2 = arrstring.length;
            this.g = new int[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                this.g[i2] = this.c.a(arrstring[i2]);
            }
        }
    }

    public void c(String string) {
        this.l = null;
        int n2 = this.c.a(string);
        if (this.g == null) {
            this.g = new int[1];
            this.g[0] = n2;
        } else {
            int n3 = this.g.length;
            int[] arrn = new int[n3 + 1];
            System.arraycopy(this.g, 0, arrn, 0, n3);
            arrn[n3] = n2;
            this.g = arrn;
        }
    }

    public List m() {
        return this.h;
    }

    public void a(ac ac2) throws X {
        this.b(ac2.b(), ac2.d());
        this.h.add(ac2);
    }

    public final void b(ac ac2) {
        this.h.add(ac2);
    }

    private void b(String string, String string2) throws X {
        ListIterator listIterator = this.h.listIterator(0);
        while (listIterator.hasNext()) {
            ac ac2 = (ac)listIterator.next();
            if (!ac2.b().equals(string)) continue;
            throw new X("duplicate field: " + string);
        }
    }

    public List n() {
        return this.i;
    }

    public as d(String string) {
        ArrayList arrayList = this.i;
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            as as2 = (as)arrayList.get(i2);
            if (!as2.a().equals(string)) continue;
            return as2;
        }
        return null;
    }

    public as o() {
        return this.d("<clinit>");
    }

    public void a(as as2) throws X {
        this.c(as2);
        this.i.add(as2);
    }

    public final void b(as as2) {
        this.i.add(as2);
    }

    private void c(as as2) throws X {
        String string = as2.a();
        String string2 = as2.g();
        ListIterator listIterator = this.i.listIterator(0);
        while (listIterator.hasNext()) {
            if (!p.a(as2, string, string2, (as)listIterator.next(), listIterator)) continue;
            throw new X("duplicate method: " + string + " in " + this.i());
        }
    }

    private static boolean a(as as2, String string, String string2, as as3, ListIterator listIterator) {
        if (!as3.a().equals(string)) {
            return false;
        }
        String string3 = as3.g();
        if (!T.d(string3, string2)) {
            return false;
        }
        if (string3.equals(string2)) {
            if (p.d(as3)) {
                return true;
            }
            listIterator.remove();
            return false;
        }
        return false;
    }

    private static boolean d(as as2) {
        return (as2.f() & 64) == 0;
    }

    public List p() {
        return this.j;
    }

    public h e(String string) {
        ArrayList arrayList = this.j;
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            h h2 = (h)arrayList.get(i2);
            if (!h2.c().equals(string)) continue;
            return h2;
        }
        return null;
    }

    public void a(h h2) {
        h.b(this.j, h2.c());
        this.j.add(h2);
    }

    public String q() {
        aO aO2 = (aO)this.e("SourceFile");
        if (aO2 == null) {
            return null;
        }
        return aO2.a();
    }

    private void a(DataInputStream dataInputStream) throws IOException {
        int n2;
        int n3 = dataInputStream.readInt();
        if (n3 != -889275714) {
            throw new IOException("bad magic number: " + Integer.toHexString(n3));
        }
        this.b = dataInputStream.readUnsignedShort();
        this.a = dataInputStream.readUnsignedShort();
        this.c = new Q(dataInputStream);
        this.e = dataInputStream.readUnsignedShort();
        this.d = dataInputStream.readUnsignedShort();
        this.c.a(this.d);
        this.f = dataInputStream.readUnsignedShort();
        int n4 = dataInputStream.readUnsignedShort();
        if (n4 == 0) {
            this.g = null;
        } else {
            this.g = new int[n4];
            for (n2 = 0; n2 < n4; ++n2) {
                this.g[n2] = dataInputStream.readUnsignedShort();
            }
        }
        Q q2 = this.c;
        n4 = dataInputStream.readUnsignedShort();
        this.h = new ArrayList();
        for (n2 = 0; n2 < n4; ++n2) {
            this.b(new ac(q2, dataInputStream));
        }
        n4 = dataInputStream.readUnsignedShort();
        this.i = new ArrayList();
        for (n2 = 0; n2 < n4; ++n2) {
            this.b(new as(q2, dataInputStream));
        }
        this.j = new ArrayList();
        n4 = dataInputStream.readUnsignedShort();
        for (n2 = 0; n2 < n4; ++n2) {
            this.a(h.a(q2, dataInputStream));
        }
        this.k = this.c.d(this.d);
    }

    public void a(DataOutputStream dataOutputStream) throws IOException {
        Object object;
        int n2;
        dataOutputStream.writeInt(-889275714);
        dataOutputStream.writeShort(this.b);
        dataOutputStream.writeShort(this.a);
        this.c.a(dataOutputStream);
        dataOutputStream.writeShort(this.e);
        dataOutputStream.writeShort(this.d);
        dataOutputStream.writeShort(this.f);
        int n3 = this.g == null ? 0 : this.g.length;
        dataOutputStream.writeShort(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            dataOutputStream.writeShort(this.g[n2]);
        }
        ArrayList arrayList = this.h;
        n3 = arrayList.size();
        dataOutputStream.writeShort(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            object = (ac)arrayList.get(n2);
            object.a(dataOutputStream);
        }
        arrayList = this.i;
        n3 = arrayList.size();
        dataOutputStream.writeShort(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            object = (as)arrayList.get(n2);
            object.a(dataOutputStream);
        }
        dataOutputStream.writeShort(this.j.size());
        h.a(this.j, dataOutputStream);
    }

    public int r() {
        return this.a;
    }

    public void b(int n2) {
        this.a = n2;
    }

    public int s() {
        return this.b;
    }

    public void c(int n2) {
        this.b = n2;
    }

    public void t() {
        this.a = 49;
        this.b = 0;
    }

    static {
        int n2 = 47;
        try {
            Class.forName("java.lang.StringBuilder");
            n2 = 49;
            Class.forName("java.util.zip.DeflaterInputStream");
            n2 = 50;
            Class.forName("java.lang.invoke.CallSite");
            n2 = 51;
            Class.forName("java.util.function.Function");
            n2 = 52;
        }
        catch (Throwable var1_1) {
            // empty catch block
        }
        v = n2;
    }
}

