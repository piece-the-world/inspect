/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

public class as
implements Serializable {
    private static final long a = 0;
    private transient AtomicLongArray b;

    public as(int n2) {
        this.b = new AtomicLongArray(n2);
    }

    public as(double[] arrd) {
        int n2 = arrd.length;
        long[] arrl = new long[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrl[i2] = Double.doubleToRawLongBits(arrd[i2]);
        }
        this.b = new AtomicLongArray(arrl);
    }

    public final int a() {
        return this.b.length();
    }

    public final double a(int n2) {
        return Double.longBitsToDouble(this.b.get(n2));
    }

    public final void a(int n2, double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        this.b.set(n2, l2);
    }

    public final void b(int n2, double d2) {
        this.a(n2, d2);
    }

    public final double c(int n2, double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        return Double.longBitsToDouble(this.b.getAndSet(n2, l2));
    }

    public final boolean a(int n2, double d2, double d3) {
        return this.b.compareAndSet(n2, Double.doubleToRawLongBits(d2), Double.doubleToRawLongBits(d3));
    }

    public final boolean b(int n2, double d2, double d3) {
        return this.b.weakCompareAndSet(n2, Double.doubleToRawLongBits(d2), Double.doubleToRawLongBits(d3));
    }

    public final double d(int n2, double d2) {
        long l2;
        double d3;
        double d4;
        long l3;
        while (!this.b.compareAndSet(n2, l2 = this.b.get(n2), l3 = Double.doubleToRawLongBits(d4 = (d3 = Double.longBitsToDouble(l2)) + d2))) {
        }
        return d3;
    }

    public double e(int n2, double d2) {
        long l2;
        double d3;
        double d4;
        long l3;
        while (!this.b.compareAndSet(n2, l2 = this.b.get(n2), l3 = Double.doubleToRawLongBits(d4 = (d3 = Double.longBitsToDouble(l2)) + d2))) {
        }
        return d4;
    }

    public String toString() {
        int n2 = this.a() - 1;
        if (n2 == -1) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder(19 * (n2 + 1));
        stringBuilder.append('[');
        int n3 = 0;
        do {
            stringBuilder.append(Double.longBitsToDouble(this.b.get(n3)));
            if (n3 == n2) {
                return stringBuilder.append(']').toString();
            }
            stringBuilder.append(',').append(' ');
            ++n3;
        } while (true);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int n2 = this.a();
        objectOutputStream.writeInt(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            objectOutputStream.writeDouble(this.a(i2));
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int n2 = objectInputStream.readInt();
        this.b = new AtomicLongArray(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a(i2, objectInputStream.readDouble());
        }
    }
}

