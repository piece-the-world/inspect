/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.tendcloud.tenddata;

import android.content.Context;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.dt;
import com.tendcloud.tenddata.ee;
import com.tendcloud.tenddata.fu;
import com.tendcloud.tenddata.gg;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class et {
    private static volatile et a = null;
    private dt b = fu.b.a(1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static et a() {
        if (a != null) return a;
        reference var0 = et.class;
        synchronized (et.class) {
            if (a != null) return a;
            {
                a = new et();
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return a;
        }
    }

    private et() {
    }

    void a(HashMap hashMap) {
        if (hashMap.containsKey("map") && hashMap.get("map") instanceof Map) {
            this.a(String.valueOf(hashMap.get("eventId")), String.valueOf(hashMap.get("eventLabel")), String.valueOf(hashMap.get("occurTime")), (Map)hashMap.get("map"));
        } else {
            this.a(String.valueOf(hashMap.get("eventId")), String.valueOf(hashMap.get("eventLabel")), String.valueOf(hashMap.get("occurTime")), null);
        }
    }

    private final void a(String string, String string2, String string3, Map map) {
        if (ee.b() == null || ee.b().isEmpty()) {
            return;
        }
        this.b.a(ee.b(), string, string2, Long.valueOf(string3), map);
    }

    public final void onTDEBEventAppEvent(fu.a a2) {
        Object v2;
        if (a2 == null || a2.a == null) {
            return;
        }
        if (Integer.parseInt(String.valueOf(a2.a.get("apiType"))) != 4) {
            return;
        }
        if (!fu.b) {
            Object treeMap = a2.a.get("context");
            if (treeMap != null && treeMap instanceof Context) {
                fu.a((Context)treeMap, null, null);
            } else {
                return;
            }
        }
        TreeMap treeMap = new TreeMap();
        String string = String.valueOf(a2.a.get("eventId"));
        if (ab.a.size() > 0 && string != null && !string.startsWith("__")) {
            treeMap.putAll(ab.a);
        }
        if ((v2 = a2.a.get("map")) != null && v2 instanceof Map) {
            treeMap.putAll((Map)v2);
        }
        a2.a.put("controller", et.a());
        a2.a.put("map", treeMap);
        this.a(a2.a);
    }

    static {
        try {
            gg.a().register(et.a());
        }
        catch (Throwable var0) {
            // empty catch block
        }
    }
}

