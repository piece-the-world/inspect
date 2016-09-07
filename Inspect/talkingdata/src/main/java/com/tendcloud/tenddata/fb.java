/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.util.Log;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.ee;
import com.tendcloud.tenddata.fu;
import com.tendcloud.tenddata.gg;
import java.util.HashMap;

class fb {
    private static volatile fb a = null;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static fb a() {
        if (a != null) return a;
        reference var0 = fb.class;
        synchronized (fb.class) {
            if (a != null) return a;
            {
                a = new fb();
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return a;
        }
    }

    private fb() {
        fb.b();
    }

    void a(HashMap hashMap) {
        try {
            if (hashMap.containsKey("throwable")) {
                if (hashMap.containsKey("occurTime")) {
                    fb.a((Throwable)hashMap.get("throwable"), String.valueOf(hashMap.get("occurTime")));
                } else {
                    fb.a((Throwable)hashMap.get("throwable"), "");
                }
            }
        }
        catch (Throwable var2_2) {
            // empty catch block
        }
    }

    public final void onTDEBEventError(fu.a a2) {
        if (a2 == null || a2.a == null) {
            return;
        }
        if (Integer.parseInt(String.valueOf(a2.a.get("apiType"))) != 5) {
            return;
        }
        a2.a.put("controller", fb.a());
        this.a(a2.a);
    }

    private static final void b() {
        Thread.setDefaultUncaughtExceptionHandler(new a());
    }

    static final void a(Throwable throwable, String string) {
        if (ab.mContext == null) {
            return;
        }
        Throwable throwable2 = throwable;
        while (throwable2.getCause() != null) {
            throwable2 = throwable2.getCause();
        }
        StackTraceElement[] arrstackTraceElement = throwable2.getStackTrace();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(throwable2.getClass().getName()).append(":");
        int n2 = 0;
        String string2 = ab.mContext.getPackageName();
        for (int i2 = 0; n2 < 3 && i2 < arrstackTraceElement.length; ++i2) {
            String string3 = arrstackTraceElement[i2].getClassName();
            if (string3.startsWith("java.") && !string2.startsWith("java.") || string3.startsWith("javax.") && !string2.startsWith("javax.") || string3.startsWith("android.") && !string2.startsWith("android.") || string3.startsWith("com.android.") && !string2.startsWith("com.android.")) continue;
            stringBuilder.append(arrstackTraceElement[i2].toString()).append(":");
            ++n2;
        }
        long l2 = string.trim().isEmpty() ? System.currentTimeMillis() : Long.valueOf(string);
        fu.b.a(1).a();
        fu.b.a(1).a(l2, fb.a(throwable));
        fu.b.a(1).b();
        ee.d(System.currentTimeMillis());
    }

    private static final String a(Throwable throwable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(throwable.toString());
        stringBuilder.append("\r\n");
        StackTraceElement[] arrstackTraceElement = throwable.getStackTrace();
        int n2 = arrstackTraceElement.length > 50 ? 50 : arrstackTraceElement.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append("\t");
            stringBuilder.append(arrstackTraceElement[i2]);
            stringBuilder.append("\r\n");
        }
        Throwable throwable2 = throwable.getCause();
        if (throwable2 != null) {
            fb.a(stringBuilder, arrstackTraceElement, throwable2, 1);
        }
        return stringBuilder.toString();
    }

    private static final void a(StringBuilder stringBuilder, StackTraceElement[] arrstackTraceElement, Throwable throwable, int n2) {
        StackTraceElement[] arrstackTraceElement2 = throwable.getStackTrace();
        int n3 = arrstackTraceElement2.length - 1;
        for (int i2 = arrstackTraceElement.length - 1; n3 >= 0 && i2 >= 0 && arrstackTraceElement2[n3].equals(arrstackTraceElement[i2]); --n3, --i2) {
        }
        n3 = n3 > 50 ? 50 : n3;
        stringBuilder.append("Caused by : ");
        stringBuilder.append(throwable);
        stringBuilder.append("\r\n");
        for (int i3 = 0; i3 <= n3; ++i3) {
            stringBuilder.append("\t");
            stringBuilder.append(arrstackTraceElement2[i3]);
            stringBuilder.append("\r\n");
        }
        if (n2 >= 5) {
            return;
        }
        Throwable throwable2 = throwable.getCause();
        if (throwable2 != null) {
            fb.a(stringBuilder, arrstackTraceElement2, throwable, ++n2);
        }
    }

    static {
        try {
            gg.a().register(fb.a());
        }
        catch (Throwable var0) {
            // empty catch block
        }
    }

    static class a
    implements Thread.UncaughtExceptionHandler {
        private Thread.UncaughtExceptionHandler a = Thread.getDefaultUncaughtExceptionHandler();

        a() {
        }

        @Override
        public void uncaughtException(Thread thread, Throwable throwable) {
            if (ab.b) {
                fb.a(throwable, String.valueOf(System.currentTimeMillis()));
                Log.w((String)"TDLog", (String)("UncaughtException in Thread " + thread.getName()), (Throwable)throwable);
            }
            if (this.a != null) {
                this.a.uncaughtException(thread, throwable);
            }
        }
    }

}

