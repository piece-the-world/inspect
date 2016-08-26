/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.aa;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class Z
implements Cloneable {
    private Q a;
    private ArrayList b;

    public Z(Q q2) {
        this.a = q2;
        this.b = new ArrayList();
    }

    Z(Q q2, DataInputStream dataInputStream) throws IOException {
        this.a = q2;
        int n2 = dataInputStream.readUnsignedShort();
        ArrayList<aa> arrayList = new ArrayList<aa>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = dataInputStream.readUnsignedShort();
            int n4 = dataInputStream.readUnsignedShort();
            int n5 = dataInputStream.readUnsignedShort();
            int n6 = dataInputStream.readUnsignedShort();
            arrayList.add(new aa(n3, n4, n5, n6));
        }
        this.b = arrayList;
    }

    public Object clone() throws CloneNotSupportedException {
        Z z2 = (Z)super.clone();
        z2.b = new ArrayList(this.b);
        return z2;
    }

    public int a() {
        return this.b.size();
    }

    public int a(int n2) {
        aa aa2 = (aa)this.b.get(n2);
        return aa2.a;
    }

    public void a(int n2, int n3) {
        aa aa2 = (aa)this.b.get(n2);
        aa2.a = n3;
    }

    public int b(int n2) {
        aa aa2 = (aa)this.b.get(n2);
        return aa2.b;
    }

    public void b(int n2, int n3) {
        aa aa2 = (aa)this.b.get(n2);
        aa2.b = n3;
    }

    public int c(int n2) {
        aa aa2 = (aa)this.b.get(n2);
        return aa2.c;
    }

    public void c(int n2, int n3) {
        aa aa2 = (aa)this.b.get(n2);
        aa2.c = n3;
    }

    public int d(int n2) {
        aa aa2 = (aa)this.b.get(n2);
        return aa2.d;
    }

    public void d(int n2, int n3) {
        aa aa2 = (aa)this.b.get(n2);
        aa2.d = n3;
    }

    public void a(int n2, Z z2, int n3) {
        int n4 = z2.a();
        while (--n4 >= 0) {
            aa aa2 = (aa)z2.b.get(n4);
            this.a(n2, aa2.a + n3, aa2.b + n3, aa2.c + n3, aa2.d);
        }
    }

    public void a(int n2, int n3, int n4, int n5, int n6) {
        if (n3 < n4) {
            this.b.add(n2, new aa(n3, n4, n5, n6));
        }
    }

    public void a(int n2, int n3, int n4, int n5) {
        if (n2 < n3) {
            this.b.add(new aa(n2, n3, n4, n5));
        }
    }

    public void e(int n2) {
        this.b.remove(n2);
    }

    public Z a(Q q2, Map map) {
        Z z2 = new Z(q2);
        Q q3 = this.a;
        int n2 = this.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            aa aa2 = (aa)this.b.get(i2);
            int n3 = q3.a(aa2.d, q2, map);
            z2.a(aa2.a, aa2.b, aa2.c, n3);
        }
        return z2;
    }

    void a(int n2, int n3, boolean bl2) {
        int n4 = this.a();
        for (int i2 = 0; i2 < n4; ++i2) {
            aa aa2 = (aa)this.b.get(i2);
            aa2.a = Z.a(aa2.a, n2, n3, bl2);
            aa2.b = Z.a(aa2.b, n2, n3, bl2);
            aa2.c = Z.a(aa2.c, n2, n3, bl2);
        }
    }

    private static int a(int n2, int n3, int n4, boolean bl2) {
        if (n2 > n3 || bl2 && n2 == n3) {
            n2 += n4;
        }
        return n2;
    }

    void a(DataOutputStream dataOutputStream) throws IOException {
        int n2 = this.a();
        dataOutputStream.writeShort(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            aa aa2 = (aa)this.b.get(i2);
            dataOutputStream.writeShort(aa2.a);
            dataOutputStream.writeShort(aa2.b);
            dataOutputStream.writeShort(aa2.c);
            dataOutputStream.writeShort(aa2.d);
        }
    }
}

