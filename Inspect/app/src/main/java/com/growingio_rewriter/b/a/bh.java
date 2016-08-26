/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.bj;
import com.growingio.b.a.bk;
import com.growingio.b.a.i;

class bh
extends bj {
    private bk a;

    public bh(byte[] arrby) {
        super(arrby);
        this.a = new bk(arrby.length);
    }

    public byte[] a() throws i {
        this.c();
        return this.a.a();
    }

    @Override
    public void a_(int n2, int n3) {
        this.a.a(n3);
    }

    @Override
    public void a(int n2, int n3, int n4, int n5) {
        this.a.a(n3, n4, this.a(n4, n5));
    }

    @Override
    public void b(int n2, int n3, int n4) {
        this.a.a(n3, n4);
    }

    @Override
    public void a(int n2, int n3, int[] arrn, int[] arrn2) {
        this.a.a(n3, arrn, this.a(arrn, arrn2));
    }

    @Override
    public void a(int n2, int n3, int[] arrn, int[] arrn2, int[] arrn3, int[] arrn4) {
        this.a.a(n3, arrn, this.a(arrn, arrn2), arrn3, this.a(arrn3, arrn4));
    }

    protected int a(int n2, int n3) {
        return n3;
    }

    protected int[] a(int[] arrn, int[] arrn2) {
        return arrn2;
    }
}

