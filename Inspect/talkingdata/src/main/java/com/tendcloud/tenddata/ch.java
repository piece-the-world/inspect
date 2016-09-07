/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.tendcloud.tenddata;

import android.content.Context;
import com.tendcloud.tenddata.cg;
import com.tendcloud.tenddata.cm;

public class ch
implements cg {
    private static final String b = "dyn_update_check_ts";
    Context a;

    @Override
    public void f() {
    }

    @Override
    public void initialize(Context context, String string) {
        this.a = context;
    }

    @Override
    public String a() {
        return "1";
    }

    @Override
    public boolean b() {
        long l2 = cm.b(this.a, "actionstablepref", "dyn_update_check_ts", System.currentTimeMillis());
        long l3 = Math.abs((System.currentTimeMillis() - l2) / 86400000);
        return l3 > 7 || Math.random() * (double)l3 > 2.0;
    }

    @Override
    public String c() {
        return "https://u.talkingdata.net/ota/common/android/dynamic/ver";
    }

    @Override
    public String d() {
        return "https://u.talkingdata.net/ota/common/android/dynamic/sdk.zip";
    }

    @Override
    public void a(String string) {
        cm.a(this.a, "actionstablepref", "dyn_update_check_ts", System.currentTimeMillis());
    }

    @Override
    public void e() {
    }
}

