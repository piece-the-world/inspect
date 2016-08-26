/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.h.k;
import com.growingio.a.a.h.l;
import com.growingio.a.a.h.m;
import com.growingio.a.a.h.n;
import com.growingio.a.a.h.q;
import com.growingio.a.a.h.x;
import com.growingio.a.a.m.E;
import com.growingio.a.a.m.G;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

public final class j<T>
implements aV<T>,
Serializable {
    private final q a;
    private final int b;
    private final x<? super T> c;
    private final m d;

    private j(q q2, int n2, x<? super T> x2, m m2) {
        aU.a(n2 > 0, "numHashFunctions (%s) must be > 0", n2);
        aU.a(n2 <= 255, "numHashFunctions (%s) must be <= 255", n2);
        this.a = aU.a(q2);
        this.b = n2;
        this.c = aU.a(x2);
        this.d = aU.a(m2);
    }

    public j<T> a() {
        return new j<T>(this.a.c(), this.b, this.c, this.d);
    }

    public boolean b(T t2) {
        return this.d.b(t2, this.c, this.b, this.a);
    }

    @Override
    public boolean a(T t2) {
        return this.b(t2);
    }

    public boolean c(T t2) {
        return this.d.a(t2, this.c, this.b, this.a);
    }

    public double b() {
        return Math.pow((double)this.a.b() / (double)this.c(), this.b);
    }

    long c() {
        return this.a.a();
    }

    @Override
    public boolean a(j<T> j2) {
        aU.a(j2);
        return this != j2 && this.b == j2.b && this.c() == j2.c() && this.d.equals(j2.d) && this.c.equals(j2.c);
    }

    public void b(j<T> j2) {
        aU.a(j2);
        aU.a(this != j2, (Object)"Cannot combine a BloomFilter with itself.");
        aU.a(this.b == j2.b, "BloomFilters must have the same number of hash functions (%s != %s)", this.b, j2.b);
        aU.a(this.c() == j2.c(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", this.c(), j2.c());
        aU.a(this.d.equals(j2.d), "BloomFilters must have equal strategies (%s != %s)", (Object)this.d, (Object)j2.d);
        aU.a(this.c.equals(j2.c), "BloomFilters must have equal funnels (%s != %s)", this.c, j2.c);
        this.a.a(j2.a);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof j) {
            j j2 = (j)object;
            return this.b == j2.b && this.c.equals(j2.c) && this.a.equals(j2.a) && this.d.equals(j2.d);
        }
        return false;
    }

    public int hashCode() {
        return aL.a(this.b, this.c, this.d, this.a);
    }

    public static <T> j<T> a(x<? super T> x2, int n2, double d2) {
        return j.a(x2, (long)n2, d2);
    }

    public static <T> j<T> a(x<? super T> x2, long l2, double d2) {
        return j.a(x2, l2, d2, n.b);
    }

    static <T> j<T> a(x<? super T> x2, long l2, double d2, m m2) {
        aU.a(x2);
        aU.a(l2 >= 0, "Expected insertions (%s) must be >= 0", l2);
        aU.a(d2 > 0.0, "False positive probability (%s) must be > 0.0", (Object)d2);
        aU.a(d2 < 1.0, "False positive probability (%s) must be < 1.0", (Object)d2);
        aU.a(m2);
        if (l2 == 0) {
            l2 = 1;
        }
        long l3 = j.a(l2, d2);
        int n2 = j.a(l2, l3);
        try {
            return new j<T>(new q(l3), n2, x2, m2);
        }
        catch (IllegalArgumentException var9_6) {
            throw new IllegalArgumentException("Could not create BloomFilter of " + l3 + " bits", var9_6);
        }
    }

    public static <T> j<T> a(x<? super T> x2, int n2) {
        return j.a(x2, (long)n2);
    }

    public static <T> j<T> a(x<? super T> x2, long l2) {
        return j.a(x2, l2, 0.03);
    }

    static int a(long l2, long l3) {
        return Math.max(1, (int)Math.round((double)l3 / (double)l2 * Math.log(2.0)));
    }

    static long a(long l2, double d2) {
        if (d2 == 0.0) {
            d2 = Double.MIN_VALUE;
        }
        return (long)((double)(- l2) * Math.log(d2) / (Math.log(2.0) * Math.log(2.0)));
    }

    private Object d() {
        return new l(this);
    }

    public void a(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeByte(E.a(this.d.ordinal()));
        dataOutputStream.writeByte(G.a(this.b));
        dataOutputStream.writeInt(this.a.a.length);
        for (long l2 : this.a.a) {
            dataOutputStream.writeLong(l2);
        }
    }

    public static <T> j<T> a(InputStream inputStream, x<T> x2) throws IOException {
        aU.a(inputStream, (Object)"InputStream");
        aU.a(x2, (Object)"Funnel");
        int n2 = -1;
        int n3 = -1;
        int n4 = -1;
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            n2 = dataInputStream.readByte();
            n3 = G.a(dataInputStream.readByte());
            n4 = dataInputStream.readInt();
            n n5 = n.a()[n2];
            long[] arrl = new long[n4];
            for (int i2 = 0; i2 < arrl.length; ++i2) {
                arrl[i2] = dataInputStream.readLong();
            }
            return new j<T>(new q(arrl), n3, x2, n5);
        }
        catch (RuntimeException var5_6) {
            IOException iOException = new IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + n2 + " numHashFunctions: " + n3 + " dataLength: " + n4);
            iOException.initCause(var5_6);
            throw iOException;
        }
    }

    static /* synthetic */ q c(j j2) {
        return j2.a;
    }

    static /* synthetic */ int d(j j2) {
        return j2.b;
    }

    static /* synthetic */ x e(j j2) {
        return j2.c;
    }

    static /* synthetic */ m f(j j2) {
        return j2.d;
    }

    /* synthetic */ j(q q2, int n2, x x2, m m2, k k2) {
        this(q2, n2, x2, m2);
    }
}

