/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.SystemClock
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.WindowManager
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.cb;
import com.tendcloud.tenddata.ce;
import com.tendcloud.tenddata.cf;
import com.tendcloud.tenddata.cj;
import com.tendcloud.tenddata.cm;
import com.tendcloud.tenddata.cr;
import com.tendcloud.tenddata.dt;
import com.tendcloud.tenddata.ee;
import com.tendcloud.tenddata.en;
import com.tendcloud.tenddata.ep;
import com.tendcloud.tenddata.fu;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;

class es {
    private static final int a = 20480;
    private static final int b = 7200000;
    private static en.d c = null;
    private static en.e d = null;

    es() {
    }

    static en.g a() {
        DisplayMetrics displayMetrics;
        Object object;
        Object object2;
        Context context = ab.mContext;
        en.g g2 = new en.g();
        String[] arrstring = cf.k();
        try {
            g2.a = arrstring[0];
            try {
                g2.b = Integer.valueOf(arrstring[1]);
            }
            catch (Throwable var3_3) {
                // empty catch block
            }
            g2.d = arrstring[2];
            try {
                g2.c = Float.valueOf(arrstring[3]).floatValue();
            }
            catch (Throwable var3_4) {}
        }
        catch (Exception var3_6) {
            // empty catch block
        }
        int[] arrn = cf.m();
        g2.g = arrn[0];
        g2.h = arrn[1];
        try {
            displayMetrics = cf.n();
            g2.i = displayMetrics[0];
            g2.j = (Object)displayMetrics[1];
            g2.k = (Object)displayMetrics[2];
            g2.l = (Object)displayMetrics[3];
        }
        catch (Throwable var4_8) {
            // empty catch block
        }
        g2.m = cf.o();
        displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager)context.getSystemService("window");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        g2.n = (float)displayMetrics.widthPixels / displayMetrics.xdpi;
        g2.o = (float)displayMetrics.heightPixels / displayMetrics.ydpi;
        g2.p = displayMetrics.densityDpi;
        g2.q = Build.DISPLAY;
        g2.r = "unknown";
        try {
            object2 = Class.forName("android.os.SystemProperties");
            object = new Class[]{String.class};
            Method method = object2.getDeclaredMethod("get", object);
            Object[] arrobject = new Object[]{"gsm.version.baseband"};
            g2.r = (String)method.invoke(null, arrobject);
        }
        catch (Exception var6_11) {
            // empty catch block
        }
        object2 = ce.c(context);
        if (null != object2) {
            g2.s = object2;
        }
        if (null != (object = ce.f(context))) {
            g2.t = object;
        }
        try {
            g2.y = ce.e(context);
            g2.A = ce.d(context);
            g2.B = ce.b(context);
        }
        catch (Exception var8_14) {
            // empty catch block
        }
        return g2;
    }

    static en.f a(dt dt2) {
        Object object;
        Object object2;
        Context context = ab.mContext;
        int n2 = 0;
        en.f f2 = new en.f();
        f2.a = ce.a(context);
        f2.b = ab.n;
        f2.c = es.b();
        f2.d = es.c();
        n2 += f2.a() + 3;
        boolean bl2 = false;
        if (es.e()) {
            bl2 = true;
            object2 = new en.i();
            object2.a = 1;
            object2.c = es.a();
            f2.e.add(object2);
            n2 += ep.c(object2.a) + object2.c.a();
        }
        dt2.a();
        f2.h = dt2.e("error_report");
        object2 = dt2.e();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n3 = 0;
        Object object3 = object2.iterator();
        while (object3.hasNext()) {
            object = (en.j)object3.next();
            ++n3;
            object.h = dt2.a(object.a, f2.f);
            object.i = dt2.b(object.a, f2.g);
            boolean bl3 = false;
            if (object.i != null) {
                for (en.b b2 : object.i) {
                    if (b2.a.startsWith("__")) continue;
                    bl3 = true;
                    break;
                }
            }
            en.i i2 = new en.i();
            i2.a = 2;
            i2.b = object;
            int n4 = object.a();
            if (n4 + n2 > 20480 && n3 != 1) break;
            n2 += n4;
            arrayList.add(object);
            if (SystemClock.elapsedRealtime() - ab.g < 7200000 && object.c == 2 && 0 == object.h.size() && (0 == object.i.size() || !bl3 && !fu.c)) continue;
            f2.e.add(i2);
        }
        f2.f = dt2.a(arrayList);
        f2.g = dt2.b(arrayList);
        if (f2.h > 0) {
            object3 = dt2.d(f2.h);
            object = object3.iterator();
            while (object.hasNext()) {
                en.i i3 = (en.i)object.next();
                f2.e.add(i3);
            }
        }
        dt2.b();
        if (!bl2 && 0 == f2.e.size()) {
            return null;
        }
        return f2;
    }

    static void a(en.f f2, dt dt2) {
        dt2.a();
        List list = f2.e;
        dt2.a(f2.f);
        dt2.b(f2.g);
        dt2.c(f2.h);
        for (en.i i2 : list) {
            switch (i2.a) {
                case 1: {
                    ee.a(false);
                    break;
                }
                case 2: {
                    en.j j2 = i2.b;
                    if (j2.c == 1) {
                        dt2.a(j2.a);
                        break;
                    }
                    if (j2.c != 3) break;
                    dt2.b(j2.a);
                    dt2.c(j2.a);
                    dt2.d(j2.a);
                }
            }
        }
        dt2.b();
    }

    private static synchronized en.d b() {
        if (c != null) {
            return c;
        }
        if (null == ab.mContext) {
            return null;
        }
        c = new en.d();
        es.c.a = ab.mContext.getPackageName();
        es.c.b = ee.o();
        es.c.c = String.valueOf(ee.n());
        es.c.d = ee.g();
        es.c.e = "Android+TD+V2.2.37 gp";
        es.c.f = ab.w;
        es.c.h = cb.a().d(ab.mContext);
        es.c.i = cb.a().e(ab.mContext);
        return c;
    }

    private static synchronized en.e c() {
        if (d == null) {
            if (null == ab.mContext) {
                return null;
            }
            d = new en.e();
            es.d.s = ce.h(ab.mContext);
            es.d.a = cf.f();
            es.d.b = String.valueOf(cf.g());
            es.d.d = Build.CPU_ABI;
            es.d.e = cf.a(ab.mContext);
            es.d.f = cf.j();
            es.d.g = cj.p(ab.mContext);
            es.d.h = cf.i();
            es.d.i = TimeZone.getDefault().getRawOffset() / 1000 / 60 / 60;
            es.d.j = "Android+" + Build.VERSION.RELEASE;
            es.d.r = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        }
        es.d();
        return d;
    }

    private static void d() {
        Location location3;
        List list = cr.a(ab.mContext);
        Location location2 = null;
        for (Location location3 : list) {
            if (location2 != null && location3.getTime() <= location2.getTime()) continue;
            location2 = location3;
        }
        en.h h2 = new en.h();
        if (null != location2) {
            h2.b = location2.getLatitude();
            h2.a = location2.getLongitude();
        }
        es.d.c = h2;
        es.d.k = cj.g(ab.mContext) ? 0 : 1;
        es.d.l = cj.i(ab.mContext);
        es.d.o = cj.k(ab.mContext);
        es.d.n = cj.l(ab.mContext);
        es.d.p = cr.b(ab.mContext);
        es.d.t = cj.r(ab.mContext).toString();
        location3 = cr.d(ab.mContext);
        if (es.e() || new Random().nextInt(100) > 90) {
            es.d.u = location3 == null ? "" : location3.toString();
        }
    }

    private static synchronized boolean e() {
        long l2 = cm.b(ab.mContext, "TDpref_longtime", "TDpref.profile.key", 1);
        return l2 != 0;
    }
}

