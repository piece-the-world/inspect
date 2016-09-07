/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.ad;
import com.tendcloud.tenddata.af;
import com.tendcloud.tenddata.al;
import com.tendcloud.tenddata.an;
import com.tendcloud.tenddata.ap;
import com.tendcloud.tenddata.d;
import com.tendcloud.tenddata.l;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

public interface h {
    public ap a(d var1, l var2, af var3);

    public void a(d var1, af var2, an var3);

    public void a(d var1, af var2);

    public void a(d var1, String var2);

    public void a(d var1, ByteBuffer var2);

    public void a(d var1, ad var2);

    public void a(d var1, al var2);

    public void a(d var1, int var2, String var3, boolean var4);

    public void b(d var1, int var2, String var3, boolean var4);

    public void a(d var1, int var2, String var3);

    public void a(d var1, Exception var2);

    public void b(d var1, ad var2);

    public void c(d var1, ad var2);

    public String a(d var1);

    public void onWriteDemand(d var1);

    public InetSocketAddress b(d var1);

    public InetSocketAddress c(d var1);
}

