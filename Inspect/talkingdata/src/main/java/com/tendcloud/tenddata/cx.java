/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.cv;
import com.tendcloud.tenddata.cy;
import com.tendcloud.tenddata.dd;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class cx
extends OutputStream {
    static final int a = 8192;
    private OutputStream c;
    private final DataOutputStream d;
    private final cv e;
    private final dd f;
    private final cy g;
    private final int h;
    private boolean i = true;
    private boolean j = true;
    private boolean k = true;
    private int l = 0;
    private boolean m = false;
    private IOException n = null;
    private final byte[] o = new byte[1];

    private static int a(int n2) {
        return 8192 > n2 ? 8192 - n2 : 0;
    }

    public cx(OutputStream outputStream, byte[] arrby) {
        if (outputStream == null) {
            throw new NullPointerException();
        }
        this.c = outputStream;
        this.d = new DataOutputStream(outputStream);
        this.f = new dd(8192);
        int n2 = arrby != null ? arrby.length + 4096 : 4096;
        int n3 = cx.a(n2);
        int n4 = 1;
        int n5 = 0;
        int n6 = 0;
        int n7 = 24 + Runtime.getRuntime().availableProcessors() * 4;
        int n8 = (int)(16.0 + (double)Runtime.getRuntime().availableProcessors() * 2.5);
        this.g = cy.a(this.f, n4, n5, n6, n2, n3, n7, n8);
        this.e = this.g.b();
        byte[] arrby2 = arrby;
        if (arrby2 != null && arrby2.length > 0) {
            this.e.a(n2, arrby2);
            this.i = false;
        }
        this.h = (n6 * 5 + n5) * 9 + n4;
    }

    @Override
    public void write(int n2) {
        this.o[0] = (byte)n2;
        this.write(this.o, 0, 1);
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        if (n2 < 0 || n3 < 0 || n2 + n3 < 0 || n2 + n3 > arrby.length) {
            throw new IndexOutOfBoundsException();
        }
        if (this.n != null) {
            throw this.n;
        }
        if (this.m) {
            throw new IOException("Stream finished or closed");
        }
        try {
            while (n3 > 0) {
                int n4 = this.e.a(arrby, n2, n3);
                n2 += n4;
                n3 -= n4;
                this.l += n4;
                if (!this.g.f()) continue;
                this.b();
            }
        }
        catch (IOException var4_5) {
            this.n = var4_5;
            throw var4_5;
        }
    }

    private void b() {
        int n2 = this.f.c();
        int n3 = this.g.d();
        assert (n2 > 0);
        assert (n3 > 0);
        if (n2 + 2 < n3) {
            this.a(n3, n2);
        } else {
            this.g.c();
            n3 = this.g.d();
            assert (n3 > 0);
            this.b(n3);
        }
        this.l -= n3;
        this.g.e();
        this.f.a();
    }

    private void a(int n2, int n3) {
        int n4 = this.k ? (this.i ? 224 : 192) : (this.j ? 160 : 128);
        this.d.writeByte(n4 |= n2 - 1 >>> 16);
        this.d.writeShort(n2 - 1);
        this.d.writeShort(n3 - 1);
        if (this.k) {
            this.d.writeByte(this.h);
        }
        this.f.write(this.c);
        this.k = false;
        this.j = false;
        this.i = false;
    }

    private void b(int n2) {
        while (n2 > 0) {
            int n3 = Math.min(n2, 8192);
            this.d.writeByte(this.i ? 1 : 2);
            this.d.writeShort(n3 - 1);
            this.e.a(this.c, n2, n3);
            n2 -= n3;
            this.i = false;
        }
        this.j = true;
    }

    private void c() {
        assert (!this.m);
        if (this.n != null) {
            throw this.n;
        }
        this.e.d();
        try {
            while (this.l > 0) {
                this.g.f();
                this.b();
            }
            this.c.write(0);
        }
        catch (IOException var1_1) {
            this.n = var1_1;
            throw var1_1;
        }
        this.m = true;
    }

    @Override
    public void flush() {
        if (this.n != null) {
            throw this.n;
        }
        if (this.m) {
            throw new IOException("Stream finished or closed");
        }
        try {
            this.e.c();
            while (this.l > 0) {
                this.g.f();
                this.b();
            }
            this.c.flush();
        }
        catch (IOException var1_1) {
            this.n = var1_1;
            throw var1_1;
        }
    }

    public void a() {
        if (!this.m) {
            this.c();
            this.m = true;
        }
    }

    @Override
    public void close() {
        if (this.c != null) {
            block7 : {
                if (!this.m) {
                    try {
                        this.c();
                    }
                    catch (IOException var1_1) {
                        // empty catch block
                    }
                }
                try {
                    this.c.close();
                }
                catch (IOException var1_2) {
                    if (this.n != null) break block7;
                    this.n = var1_2;
                }
            }
            this.c = null;
        }
        if (this.n != null) {
            throw this.n;
        }
    }
}

