/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class ar
extends Number
implements Serializable {
    private static final long a = 0;
    private volatile transient long b;
    private static final AtomicLongFieldUpdater<ar> c = AtomicLongFieldUpdater.newUpdater(ar.class, "b");

    public ar(double d2) {
        this.b = Double.doubleToRawLongBits(d2);
    }

    public ar() {
    }

    public final double a() {
        return Double.longBitsToDouble(this.b);
    }

    public final void a(double d2) {
        long l2;
        this.b = l2 = Double.doubleToRawLongBits(d2);
    }

    public final void b(double d2) {
        this.a(d2);
    }

    public final double c(double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        return Double.longBitsToDouble(c.getAndSet(this, l2));
    }

    public final boolean a(double d2, double d3) {
        return c.compareAndSet(this, Double.doubleToRawLongBits(d2), Double.doubleToRawLongBits(d3));
    }

    public final boolean b(double d2, double d3) {
        return c.weakCompareAndSet(this, Double.doubleToRawLongBits(d2), Double.doubleToRawLongBits(d3));
    }

    public final double d(double d2) {
        double d3;
        long l2;
        long l3;
        double d4;
        while (!c.compareAndSet(this, l3 = this.b, l2 = Double.doubleToRawLongBits(d3 = (d4 = Double.longBitsToDouble(l3)) + d2))) {
        }
        return d4;
    }

    public final double e(double d2) {
        double d3;
        long l2;
        long l3;
        double d4;
        while (!c.compareAndSet(this, l3 = this.b, l2 = Double.doubleToRawLongBits(d3 = (d4 = Double.longBitsToDouble(l3)) + d2))) {
        }
        return d3;
    }

    public String toString() {
        return Double.toString(this.a());
    }

    @Override
    public int intValue() {
        return (int)this.a();
    }

    @Override
    public long longValue() {
        return (long)this.a();
    }

    @Override
    public float floatValue() {
        return (float)this.a();
    }

    @Override
    public double doubleValue() {
        return this.a();
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(this.a());
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.a(objectInputStream.readDouble());
    }
}

