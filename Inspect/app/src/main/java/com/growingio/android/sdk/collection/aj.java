/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.support.annotation.UiThread
 */
package com.growingio.android.sdk.collection;

import android.support.annotation.UiThread;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.c;
import java.util.UUID;

public class aj {
    private static long a = -1;
    private static UUID b = UUID.randomUUID();
    private static boolean c = false;

    public static String a() {
        return b.toString();
    }

    @UiThread
    static boolean b() {
        boolean bl2 = false;
        c c2 = c.k();
        if (System.currentTimeMillis() > a + GConfig.q().p() || aj.c() || c2.n()) {
            bl2 = true;
            a = System.currentTimeMillis();
            b = UUID.randomUUID();
            c2.a(false);
        }
        return bl2;
    }

    static boolean c() {
        boolean bl2 = k.e().a();
        boolean bl3 = c != bl2;
        c = bl2;
        return bl3;
    }

    @UiThread
    static void d() {
        a = System.currentTimeMillis();
    }
}

