/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Message
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.tendcloud.tenddata.TCAgent;
import com.tendcloud.tenddata.cs;
import com.tendcloud.tenddata.dz;
import com.tendcloud.tenddata.ed;
import com.tendcloud.tenddata.fu;
import java.util.HashMap;
import java.util.Map;

static final class fy
implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Map c;
    final /* synthetic */ Context d;

    fy(String string, String string2, Map map, Context context) {
        this.a = string;
        this.b = string2;
        this.c = map;
        this.d = context;
    }

    @Override
    public void run() {
        block3 : {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onEvent being called! eventId: ");
                stringBuilder.append(this.a);
                stringBuilder.append(", eventLabel: ");
                stringBuilder.append(this.b);
                stringBuilder.append(", eventMap: ");
                stringBuilder.append(this.c == null ? "null" : "mapSize: " + String.valueOf(this.c.size()));
                if (!this.a.equals("__tx.env")) {
                    ed.a(stringBuilder.toString());
                }
                fu.a a2 = new fu.a();
                a2.a.put("context", this.d);
                a2.a.put("apiType", 4);
                a2.a.put("eventId", cs.a(this.a));
                a2.a.put("eventLabel", this.b == null ? null : cs.a(this.b));
                a2.a.put("map", this.c);
                a2.a.put("occurTime", String.valueOf(System.currentTimeMillis()));
                Message.obtain((Handler)dz.a(), (int)102, (Object)a2).sendToTarget();
            }
            catch (Throwable var1_2) {
                if (!TCAgent.LOG_ON) break block3;
                var1_2.printStackTrace();
            }
        }
    }
}

