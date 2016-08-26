/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.h.H;
import com.growingio.a.a.h.L;
import com.growingio.a.a.h.O;
import com.growingio.a.a.h.P;
import com.growingio.a.a.h.Q;
import com.growingio.a.a.h.T;
import com.growingio.a.a.h.U;
import com.growingio.a.a.h.V;
import com.growingio.a.a.h.W;
import com.growingio.a.a.h.X;
import com.growingio.a.a.h.Y;
import com.growingio.a.a.h.Z;
import com.growingio.a.a.h.aA;
import com.growingio.a.a.h.aD;
import com.growingio.a.a.h.aa;
import com.growingio.a.a.h.ab;
import com.growingio.a.a.h.ac;
import com.growingio.a.a.h.ad;
import com.growingio.a.a.h.ae;
import com.growingio.a.a.h.af;
import com.growingio.a.a.h.ar;
import com.growingio.a.a.h.ay;
import com.growingio.a.a.h.r;
import java.security.Key;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.Checksum;
import javax.crypto.spec.SecretKeySpec;

public final class N {
    private static final int a = (int)System.currentTimeMillis();

    public static L a(int n2) {
        int n3 = N.d(n2);
        if (n3 == 32) {
            return aa.b;
        }
        if (n3 <= 128) {
            return Z.b;
        }
        int n4 = (n3 + 127) / 128;
        L[] arrl = new L[n4];
        arrl[0] = Z.b;
        int n5 = a;
        for (int i2 = 1; i2 < n4; ++i2) {
            arrl[i2] = N.c(n5 += 1500450271);
        }
        return new T(arrl, null);
    }

    public static L b(int n2) {
        return new aA(n2);
    }

    public static L a() {
        return aa.a;
    }

    public static L c(int n2) {
        return new ay(n2);
    }

    public static L b() {
        return Z.a;
    }

    public static L c() {
        return af.a;
    }

    public static L a(long l2, long l3) {
        return new aD(2, 4, l2, l3);
    }

    public static L d() {
        return Y.a;
    }

    public static L e() {
        return ab.a;
    }

    public static L f() {
        return ac.a;
    }

    public static L g() {
        return ad.a;
    }

    public static L h() {
        return ae.a;
    }

    public static L a(Key key) {
        return new ar("HmacMD5", key, N.a("hmacMd5", key));
    }

    public static L a(byte[] arrby) {
        return N.a(new SecretKeySpec(aU.a(arrby), "HmacMD5"));
    }

    public static L b(Key key) {
        return new ar("HmacSHA1", key, N.a("hmacSha1", key));
    }

    public static L b(byte[] arrby) {
        return N.b(new SecretKeySpec(aU.a(arrby), "HmacSHA1"));
    }

    public static L c(Key key) {
        return new ar("HmacSHA256", key, N.a("hmacSha256", key));
    }

    public static L c(byte[] arrby) {
        return N.c(new SecretKeySpec(aU.a(arrby), "HmacSHA256"));
    }

    public static L d(Key key) {
        return new ar("HmacSHA512", key, N.a("hmacSha512", key));
    }

    public static L d(byte[] arrby) {
        return N.d(new SecretKeySpec(aU.a(arrby), "HmacSHA512"));
    }

    private static String a(String string, Key key) {
        return String.format("Hashing.%s(Key[algorithm=%s, format=%s])", string, key.getAlgorithm(), key.getFormat());
    }

    public static L i() {
        return V.a;
    }

    public static L j() {
        return U.a;
    }

    public static L k() {
        return P.a;
    }

    private static L b(Q q2, String string) {
        return new r(q2, Q.a(q2), string);
    }

    public static L l() {
        return W.a;
    }

    public static int a(H h2, int n2) {
        return N.a(h2.d(), n2);
    }

    public static int a(long l2, int n2) {
        int n3;
        aU.a(n2 > 0, "buckets must be positive: %s", n2);
        X x2 = new X(l2);
        int n4 = 0;
        while ((n3 = (int)((double)(n4 + 1) / x2.a())) >= 0 && n3 < n2) {
            n4 = n3;
        }
        return n4;
    }

    public static H a(Iterable<H> iterable) {
        Iterator<H> iterator = iterable.iterator();
        aU.a(iterator.hasNext(), (Object)"Must be at least 1 hash code to combine.");
        int n2 = iterator.next().a();
        byte[] arrby = new byte[n2 / 8];
        for (H h2 : iterable) {
            byte[] arrby2 = h2.e();
            aU.a(arrby2.length == arrby.length, (Object)"All hashcodes must have the same bit length.");
            for (int i2 = 0; i2 < arrby2.length; ++i2) {
                arrby[i2] = (byte)(arrby[i2] * 37 ^ arrby2[i2]);
            }
        }
        return H.b(arrby);
    }

    public static H b(Iterable<H> iterable) {
        Iterator<H> iterator = iterable.iterator();
        aU.a(iterator.hasNext(), (Object)"Must be at least 1 hash code to combine.");
        byte[] arrby = new byte[iterator.next().a() / 8];
        for (H h2 : iterable) {
            byte[] arrby2 = h2.e();
            aU.a(arrby2.length == arrby.length, (Object)"All hashcodes must have the same bit length.");
            for (int i2 = 0; i2 < arrby2.length; ++i2) {
                byte[] arrby3 = arrby;
                int n2 = i2;
                arrby3[n2] = (byte)(arrby3[n2] + arrby2[i2]);
            }
        }
        return H.b(arrby);
    }

    static int d(int n2) {
        aU.a(n2 > 0, (Object)"Number of bits must be positive");
        return n2 + 31 & -32;
    }

    public static /* varargs */ L a(L l2, L l3, L ... arrl) {
        ArrayList<L> arrayList = new ArrayList<L>();
        arrayList.add(l2);
        arrayList.add(l3);
        for (L l4 : arrl) {
            arrayList.add(l4);
        }
        return new T(arrayList.toArray(new L[0]), null);
    }

    public static L c(Iterable<L> iterable) {
        aU.a(iterable);
        ArrayList<L> arrayList = new ArrayList<L>();
        for (L l2 : iterable) {
            arrayList.add(l2);
        }
        aU.a(arrayList.size() > 0, "number of hash functions (%s) must be > 0", arrayList.size());
        return new T(arrayList.toArray(new L[0]), null);
    }

    private N() {
    }

    static /* synthetic */ int m() {
        return a;
    }

    static /* synthetic */ L a(Q q2, String string) {
        return N.b(q2, string);
    }
}

