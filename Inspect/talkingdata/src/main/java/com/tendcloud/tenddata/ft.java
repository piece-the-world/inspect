/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.SystemClock
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.os.SystemClock;
import com.tendcloud.tenddata.aa;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.cj;
import com.tendcloud.tenddata.dt;
import com.tendcloud.tenddata.ed;
import com.tendcloud.tenddata.ee;
import com.tendcloud.tenddata.fu;
import com.tendcloud.tenddata.gg;
import java.util.HashMap;
import java.util.UUID;

class ft {
    private static volatile ft a = null;
    private HashMap b = new HashMap();
    private String c = null;
    private dt d = fu.b.a(1);
    private boolean e = false;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static ft a() {
        if (a != null) return a;
        reference var0 = ft.class;
        synchronized (ft.class) {
            if (a != null) return a;
            {
                a = new ft();
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return a;
        }
    }

    private ft() {
    }

    void a(HashMap hashMap) {
        try {
            int n2 = Integer.parseInt(String.valueOf(hashMap.get("apiType")));
            switch (n2) {
                case 1: {
                    this.b();
                    break;
                }
                case 2: {
                    boolean bl2 = Boolean.parseBoolean(hashMap.get("isPageOrSession").toString());
                    if (bl2) {
                        long l2 = Long.valueOf(String.valueOf(hashMap.get("occurTime")));
                        String string = String.valueOf(hashMap.get("pageName"));
                        String string2 = this.c == null ? ee.e() : this.c;
                        this.a(l2, string, string2);
                        break;
                    }
                    this.b(hashMap);
                    break;
                }
                case 3: {
                    boolean bl3 = Boolean.parseBoolean(hashMap.get("isPageOrSession").toString());
                    if (bl3) {
                        String string = String.valueOf(hashMap.get("pageName"));
                        this.b(string);
                        break;
                    }
                    this.c(hashMap);
                    break;
                }
                case 6: {
                    long l3 = Long.valueOf(String.valueOf(hashMap.get("occurTime")));
                    String string = String.valueOf(hashMap.get("pageName"));
                    String string3 = this.c == null ? ee.e() : this.c;
                    this.a(l3, string, string3);
                    break;
                }
                case 7: {
                    String string = String.valueOf(hashMap.get("pageName"));
                    this.b(string);
                    break;
                }
            }
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
    }

    public final void onTDEBEventSession(fu.a a2) {
        if (a2 == null || a2.a == null) {
            return;
        }
        int n2 = Integer.parseInt(String.valueOf(a2.a.get("apiType")));
        if (n2 != 1 && n2 != 2 && n2 != 3 && n2 != 6 && n2 != 7) {
            return;
        }
        a2.a.put("controller", ft.a());
        if (!String.valueOf(a2.a.get("occurTime")).trim().isEmpty()) {
            this.a(a2.a);
        }
    }

    private final void b() {
        aa.a().a(true);
    }

    private final void b(HashMap hashMap) {
        long l2 = ee.f();
        long l3 = ee.h();
        l3 = l3 > l2 ? l3 : l2;
        long l4 = Long.valueOf(String.valueOf(hashMap.get("occurTime")));
        if (l4 - l3 > ab.A) {
            this.a(l4);
        } else {
            ed.a("[Session] - Same session as before!");
        }
        aa.a().a(true);
    }

    void a(long l2) {
        ed.a("[Session] - New session!");
        this.b(l2);
        ee.c("");
        this.e = true;
    }

    private final void c(HashMap hashMap) {
        String string = String.valueOf(hashMap.get("pageName"));
        if (hashMap.containsKey("sessionEnd")) {
            this.a(ee.b());
            aa.a().a(true);
            return;
        }
        long l2 = Long.valueOf(String.valueOf(hashMap.get("occurTime")));
        ee.d(l2);
        ee.c(string);
        this.e = false;
        this.c = null;
    }

    private final void b(long l2) {
        this.a(ee.b());
        String string = UUID.randomUUID().toString();
        long l3 = ee.h();
        long l4 = l2 - l3;
        l4 = 0 == l3 ? 0 : l4;
        int n2 = ab.mContext != null && cj.c(ab.mContext) ? 1 : -1;
        ee.b(string);
        ee.a(l2);
        long l5 = this.d.a(string, l2, l4, n2);
        ed.a(String.format("sessionId: %s, status: %s", string, String.valueOf(l5)));
    }

    private final void a(String string) {
        if (string != null && !string.trim().isEmpty()) {
            long l2 = ee.f();
            long l3 = ee.h();
            long l4 = l3 - l2;
            l4 = l4 < 500 ? -1000 : l4;
            this.d.a(string, (int)l4 / 1000);
        }
    }

    private final void a(long l2, String string, String string2) {
        fu.c = true;
        if (this.b.containsKey(string)) {
            return;
        }
        if (string2 != null && !string2.isEmpty()) {
            ed.a("onPageStart being called!, pagename: " + string + ", refer: " + string2);
        } else {
            ed.a("onPageStart being called!, pagename: " + string);
        }
        if (string != null) {
            ee.c(l2);
            ab.y = this.d.a(ee.b(), string, l2, 0, string2, SystemClock.elapsedRealtime());
            if (this.b.containsKey(string)) {
                return;
            }
            this.b.put(string, ab.y);
        }
    }

    private final void b(String string) {
        if (!this.b.containsKey(string)) {
            return;
        }
        long l2 = this.c(string);
        if (l2 != -1) {
            this.d.a(l2, SystemClock.elapsedRealtime());
        }
        if (this.e) {
            ee.c(string);
        }
        this.c = string;
    }

    private Long c(String string) {
        if (!this.b.containsKey(string)) {
            return ab.y;
        }
        Long l2 = (Long)this.b.get(string);
        this.b.remove(string);
        return l2;
    }

    static {
        try {
            gg.a().register(ft.a());
        }
        catch (Throwable var0) {
            // empty catch block
        }
    }
}

