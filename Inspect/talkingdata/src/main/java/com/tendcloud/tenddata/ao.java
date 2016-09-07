/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.tendcloud.tenddata;

import android.app.Activity;
import android.content.Context;
import com.tendcloud.tenddata.u;
import java.util.Map;

interface ao
extends u {
    public void a(Context var1);

    public void a(Context var1, String var2, String var3);

    public String b(Context var1);

    public void a(Activity var1);

    public void onResume(Activity var1, String var2, String var3);

    public void b(Activity var1);

    public void onPageStart(Context var1, String var2);

    public void onPageEnd(Context var1, String var2);

    public void a(Context var1, String var2, String var3, Map var4);

    public void c(boolean var1);

    public void a(Context var1, Throwable var2);

    public void setLocation(double var1, double var3, String var5);
}

