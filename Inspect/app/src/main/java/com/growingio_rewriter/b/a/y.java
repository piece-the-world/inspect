/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.A;
import com.growingio.b.a.B;
import com.growingio.b.a.Q;
import com.growingio.b.a.Z;
import com.growingio.b.a.aP;
import com.growingio.b.a.aZ;
import com.growingio.b.a.ay;
import com.growingio.b.a.h;
import com.growingio.b.a.i;
import com.growingio.b.a.x;
import com.growingio.b.a.z;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class y
extends h
implements ay {
    public static final String a = "Code";
    private int b;
    private int di;
    private Z dj;
    private ArrayList dk;

    public y(Q q2, int n2, int n3, byte[] arrby, Z z2) {
        super(q2, "Code");
        this.b = n2;
        this.di = n3;
        this.e = arrby;
        this.dj = z2;
        this.dk = new ArrayList();
    }

    private y(Q q2, y y2, Map map) throws i {
        super(q2, "Code");
        this.b = y2.b();
        this.di = y2.h();
        this.dj = y2.l().a(q2, map);
        this.dk = new ArrayList();
        List list = y2.m();
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            h h2 = (h)list.get(i2);
            this.dk.add(h2.a(q2, map));
        }
        this.e = y2.a(q2, map, this.dj, this);
    }

    y(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, (byte[])null);
        int n3 = dataInputStream.readInt();
        this.b = dataInputStream.readUnsignedShort();
        this.di = dataInputStream.readUnsignedShort();
        int n4 = dataInputStream.readInt();
        this.e = new byte[n4];
        dataInputStream.readFully(this.e);
        this.dj = new Z(q2, dataInputStream);
        this.dk = new ArrayList();
        int n5 = dataInputStream.readUnsignedShort();
        for (int i2 = 0; i2 < n5; ++i2) {
            this.dk.add(h.a(q2, dataInputStream));
        }
    }

    @Override
    public h a(Q q2, Map map) throws A {
        try {
            return new y(q2, this, map);
        }
        catch (i var3_3) {
            throw new A("bad bytecode. fatal?");
        }
    }

    @Override
    public int e() {
        return 18 + this.e.length + this.dj.a() * 8 + h.a(this.dk);
    }

    @Override
    void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.d);
        dataOutputStream.writeInt(this.e() - 6);
        dataOutputStream.writeShort(this.b);
        dataOutputStream.writeShort(this.di);
        dataOutputStream.writeInt(this.e.length);
        dataOutputStream.write(this.e);
        this.dj.a(dataOutputStream);
        dataOutputStream.writeShort(this.dk.size());
        h.a(this.dk, dataOutputStream);
    }

    @Override
    public byte[] f() {
        throw new UnsupportedOperationException("CodeAttribute.get()");
    }

    @Override
    public void a(byte[] arrby) {
        throw new UnsupportedOperationException("CodeAttribute.set()");
    }

    @Override
    void a(String string, String string2) {
        h.a(this.dk, string, string2);
    }

    @Override
    void a(Map map) {
        h.a((List)this.dk, map);
    }

    @Override
    void b(Map map) {
        h.b((List)this.dk, map);
    }

    public String a() {
        Q q2 = this.d();
        return q2.c();
    }

    public int b() {
        return this.b;
    }

    public void a(int n2) {
        this.b = n2;
    }

    public int g() throws i {
        this.b = new x(this).a();
        return this.b;
    }

    public int h() {
        return this.di;
    }

    public void b(int n2) {
        this.di = n2;
    }

    public int i() {
        return this.e.length;
    }

    public byte[] j() {
        return this.e;
    }

    void b(byte[] arrby) {
        super.a(arrby);
    }

    public B k() {
        return new B(this);
    }

    public Z l() {
        return this.dj;
    }

    public List m() {
        return this.dk;
    }

    public h a(String string) {
        return h.a(this.dk, string);
    }

    public void a(aZ aZ2) {
        h.b(this.dk, "StackMapTable");
        if (aZ2 != null) {
            this.dk.add(aZ2);
        }
    }

    public void a(aP aP2) {
        h.b(this.dk, "StackMap");
        if (aP2 != null) {
            this.dk.add(aP2);
        }
    }

    private byte[] a(Q q2, Map map, Z z2, y y2) throws i {
        byte[] arrby;
        int n2 = this.i();
        y2.e = arrby = new byte[n2];
        z z3 = y.a(this.e, 0, n2, this.d(), arrby, q2, map);
        return z.a(arrby, z3, z2, y2);
    }

    private static z a(byte[] arrby, int n2, int n3, Q q2, byte[] arrby2, Q q3, Map map) throws i {
        z z2 = null;
        int n4 = n2;
        while (n4 < n3) {
            byte by2;
            int n5 = B.b(arrby, n4);
            arrby2[n4] = by2 = arrby[n4];
            switch (by2 & 255) {
                case 19: 
                case 20: 
                case 178: 
                case 179: 
                case 180: 
                case 181: 
                case 182: 
                case 183: 
                case 184: 
                case 187: 
                case 189: 
                case 192: 
                case 193: {
                    y.a(n4 + 1, arrby, q2, arrby2, q3, map);
                    break;
                }
                case 18: {
                    int n6 = arrby[n4 + 1] & 255;
                    n6 = q2.a(n6, q3, map);
                    if (n6 < 256) {
                        arrby2[n4 + 1] = (byte)n6;
                        break;
                    }
                    arrby2[n4] = 0;
                    arrby2[n4 + 1] = 0;
                    z z3 = new z();
                    z3.b = n4;
                    z3.c = n6;
                    z3.a = z2;
                    z2 = z3;
                    break;
                }
                case 185: {
                    y.a(n4 + 1, arrby, q2, arrby2, q3, map);
                    arrby2[n4 + 3] = arrby[n4 + 3];
                    arrby2[n4 + 4] = arrby[n4 + 4];
                    break;
                }
                case 186: {
                    y.a(n4 + 1, arrby, q2, arrby2, q3, map);
                    arrby2[n4 + 3] = 0;
                    arrby2[n4 + 4] = 0;
                    break;
                }
                case 197: {
                    y.a(n4 + 1, arrby, q2, arrby2, q3, map);
                    arrby2[n4 + 3] = arrby[n4 + 3];
                    break;
                }
                default: {
                    while (++n4 < n5) {
                        arrby2[n4] = arrby[n4];
                    }
                    break block0;
                }
            }
            n4 = n5;
        }
        return z2;
    }

    private static void a(int n2, byte[] arrby, Q q2, byte[] arrby2, Q q3, Map map) {
        int n3 = (arrby[n2] & 255) << 8 | arrby[n2 + 1] & 255;
        n3 = q2.a(n3, q3, map);
        arrby2[n2] = (byte)(n3 >> 8);
        arrby2[n2 + 1] = (byte)n3;
    }

    public void a(int n2, int n3) throws i {
        B b2 = this.k();
        while (b2.e()) {
            y.a(b2, n2, n3);
        }
        this.b(this.h() + n3);
    }

    private static void a(B b2, int n2, int n3) throws i {
        int n4 = b2.f();
        int n5 = b2.c(n4);
        if (n5 < 21) {
            return;
        }
        if (n5 < 79) {
            if (n5 < 26) {
                y.a(b2, n4, n5, n2, n3);
            } else if (n5 < 46) {
                y.a(b2, n4, n5, n2, n3, 26, 21);
            } else {
                if (n5 < 54) {
                    return;
                }
                if (n5 < 59) {
                    y.a(b2, n4, n5, n2, n3);
                } else {
                    y.a(b2, n4, n5, n2, n3, 59, 54);
                }
            }
        } else if (n5 == 132) {
            int n6 = b2.c(n4 + 1);
            if (n6 < n2) {
                return;
            }
            if ((n6 += n3) < 256) {
                b2.a(n6, n4 + 1);
            } else {
                byte by2 = (byte)b2.c(n4 + 2);
                int n7 = b2.i(3);
                b2.a(196, n7 - 3);
                b2.a(132, n7 - 2);
                b2.b(n6, n7 - 1);
                b2.b((int)by2, n7 + 1);
            }
        } else if (n5 == 169) {
            y.a(b2, n4, n5, n2, n3);
        } else if (n5 == 196) {
            int n8 = b2.e(n4 + 2);
            if (n8 < n2) {
                return;
            }
            b2.b(n8 += n3, n4 + 2);
        }
    }

    private static void a(B b2, int n2, int n3, int n4, int n5) throws i {
        int n6 = b2.c(n2 + 1);
        if (n6 < n4) {
            return;
        }
        if ((n6 += n5) < 256) {
            b2.a(n6, n2 + 1);
        } else {
            int n7 = b2.i(2);
            b2.a(196, n7 - 2);
            b2.a(n3, n7 - 1);
            b2.b(n6, n7);
        }
    }

    private static void a(B b2, int n2, int n3, int n4, int n5, int n6, int n7) throws i {
        int n8 = (n3 - n6) % 4;
        if (n8 < n4) {
            return;
        }
        if ((n8 += n5) < 4) {
            b2.a(n3 + n5, n2);
        } else {
            n3 = (n3 - n6) / 4 + n7;
            if (n8 < 256) {
                int n9 = b2.i(1);
                b2.a(n3, n9 - 1);
                b2.a(n8, n9);
            } else {
                int n10 = b2.i(3);
                b2.a(196, n10 - 1);
                b2.a(n3, n10);
                b2.b(n8, n10 + 1);
            }
        }
    }
}

