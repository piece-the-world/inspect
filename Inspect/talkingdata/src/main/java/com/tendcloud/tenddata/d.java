/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.ad;
import com.tendcloud.tenddata.l;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

public interface d {
    public static final int a = 80;
    public static final int b = 443;

    public void a(int var1, String var2);

    public void close(int var1);

    public void a();

    public void b(int var1, String var2);

    public void send(String var1);

    public void send(ByteBuffer var1);

    public void send(byte[] var1);

    public void sendFrame(ad var1);

    public void a(ad.a var1, ByteBuffer var2, boolean var3);

    public boolean b();

    public InetSocketAddress c();

    public InetSocketAddress d();

    public boolean e();

    public boolean f();

    public boolean g();

    public boolean h();

    public boolean i();

    public l j();

    public a k();

    public String l();

    public static enum a {
        a,
        b,
        c,
        d,
        e;
        

        private a() {
        }
    }

    public static enum b {
        a,
        b;
        

        private b() {
        }
    }

}

