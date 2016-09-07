/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.os.SystemClock
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.tendcloud.tenddata.TCAgent;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.ce;
import com.tendcloud.tenddata.cj;
import com.tendcloud.tenddata.cn;
import com.tendcloud.tenddata.cr;
import com.tendcloud.tenddata.cs;
import com.tendcloud.tenddata.dt;
import com.tendcloud.tenddata.du;
import com.tendcloud.tenddata.dz;
import com.tendcloud.tenddata.ed;
import com.tendcloud.tenddata.ee;
import com.tendcloud.tenddata.eh;
import com.tendcloud.tenddata.ei;
import com.tendcloud.tenddata.et;
import com.tendcloud.tenddata.ey;
import com.tendcloud.tenddata.ft;
import com.tendcloud.tenddata.fv;
import com.tendcloud.tenddata.fw;
import com.tendcloud.tenddata.fx;
import com.tendcloud.tenddata.fy;
import com.tendcloud.tenddata.fz;
import com.tendcloud.tenddata.ga;
import com.tendcloud.tenddata.gb;
import com.tendcloud.tenddata.gc;
import com.tendcloud.tenddata.gd;
import com.tendcloud.tenddata.ge;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

final class fu {
    static final boolean a = false;
    static volatile boolean b = false;
    static volatile boolean c = false;
    private static boolean g = false;
    static boolean d = false;
    private static final HandlerThread h = new HandlerThread("PauseEventThread");
    private static Handler i = null;
    static du e;
    private static Random j;
    static boolean f;

    fu() {
    }

    static void a(Context context, String string, String string2) {
        if (context == null) {
            ed.a("Init failed Context is null");
            return;
        }
        long l2 = System.currentTimeMillis();
        ab.mContext = context.getApplicationContext();
        cs.c = "TDLog";
        if (!b) {
            String string3;
            try {
                string3 = string;
                String string4 = string2;
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                Bundle bundle = applicationInfo.metaData;
                String string5 = fu.a(bundle, "TD_APP_ID");
                String string6 = fu.a(bundle, "TD_CHANNEL_ID");
                string3 = !cs.b(string5) ? string5 : string3;
                string4 = !cs.b(string6) ? string6 : string4;
                String string7 = cs.a(context, "ChannelConfig.json");
                string4 = !cs.b(string7) ? string7 : string4;
                String string8 = string4 = !cs.b(string4) ? string4 : "Default";
                if (cs.b(string3)) {
                    ed.c("[SDKInit] TD AppId is null");
                    return;
                }
                if (!cs.b(context, "android.permission.INTERNET")) {
                    ed.c("[SDKInit] Permission \"android.permission.INTERNET\" is needed.");
                    return;
                }
                ab.a(string3, string4);
            }
            catch (Throwable var5_5) {
                ed.a("[SDKInit] Failed to initialize!", var5_5);
                return;
            }
            try {
                fu.c(context);
                cs.execute(new fx(context));
                b = true;
                string3 = "Analytics SDK Initializing...\n\tSDK_VERSION is: Android+TD+V2.2.37 gp\n\tApp ID is: " + ab.n + "\n\tApp Channel is: " + ab.w + "\n\tSDK_OVC is: " + "TDOVC+fcb19f63dae5c9829c34b04d144bdd99+TalkingData";
                ed.a(string3);
            }
            catch (Throwable var5_6) {
                ed.a("[SDKInit] Failed to initialize!", var5_6);
            }
        } else {
            ft.a();
            et.a();
            ey.a();
            fu.j();
        }
    }

    static void a(Context context, String string, String string2, Map map) {
        cs.execute(new fy(string, string2, map, context));
    }

    static void a(Activity activity) {
        fu.a(activity, activity.getLocalClassName(), true);
    }

    static void a(Activity activity, String string, boolean bl2) {
        if (!b) {
            fu.a((Context)activity, null, null);
        }
        if (ee.i() != null && ee.i().equals("2")) {
            fu.j();
        }
        ee.d("0");
        i.removeMessages(0);
        if (activity != null && (activity.getChangingConfigurations() & 128) == 128) {
            ed.a("Ignore page changing during screen switch");
            g = true;
            return;
        }
        cs.execute(new fz(string, bl2, activity));
    }

    static void a(Activity activity, String string, String string2) {
        if (!b) {
            fu.a((Context)activity, string, string2);
        }
        fu.a(activity, activity.getLocalClassName(), false);
    }

    static void b(Activity activity) {
        fu.b(activity, activity.getLocalClassName(), true);
    }

    static void b(Activity activity, String string, boolean bl2) {
        ee.d("1");
        i.removeMessages(0);
        i.sendEmptyMessageDelayed(0, ab.A);
        cs.execute(new ga(string, bl2));
    }

    static void a(Context context, String string) {
        if (g) {
            g = false;
            return;
        }
        ed.a("onPageStart being called! pageName: " + string);
        String string2 = string;
        if (cs.b(string) && context instanceof Activity) {
            Activity activity = (Activity)context;
            string2 = activity.getLocalClassName();
        }
        fu.a(context, string2, 6);
    }

    static void b(Context context, String string) {
        ed.a("onPageEnd being called! pageName: " + string);
        Activity activity = null;
        String string2 = string;
        if (context instanceof Activity) {
            activity = (Activity)context;
            if (cs.b(string)) {
                string2 = activity.getLocalClassName();
            }
            if ((activity.getChangingConfigurations() & 128) == 128) {
                g = true;
                return;
            }
        }
        fu.a(context, string2, 7);
    }

    private static void a(Context context, String string, int n2) {
        if (context != null && !b) {
            fu.a(context, null, null);
        }
        cs.execute(new gb(n2, string));
    }

    static String a(Context context) {
        if (context != null && !b) {
            fu.a(context, ab.a(context), ab.getPartnerId(context));
        }
        return ce.a(context);
    }

    static void a(double d2, double d3, String string) {
        try {
            if (TCAgent.LOG_ON) {
                ed.a("setLocation being called! latitude: " + d2 + " longitude: " + d3 + " location Provider : " + string);
            }
            if (!cs.b(string)) {
                TreeMap<String, String> treeMap = new TreeMap<String, String>();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lat", d2);
                jSONObject.put("lng", d3);
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put("provider", (Object)string);
                treeMap.put("loc", jSONObject.toString());
                TCAgent.onEvent(ab.mContext, "__tx.env", null, treeMap);
            } else if (TCAgent.LOG_ON) {
                ed.c("location Provider is null or empty, failed to setLocation ");
            }
        }
        catch (Throwable var5_4) {
            // empty catch block
        }
    }

    static void a(String string, long l2) {
        ee.e(string);
        ee.e(l2);
    }

    static void a(Context context, Throwable throwable) {
        cs.execute(new gc(throwable, context));
    }

    private static void h() {
        try {
            if (ee.i().equals("1")) {
                dz.a().removeMessages(103);
                a a2 = new a();
                a2.a.put("apiType", 3);
                a2.a.put("occurTime", String.valueOf(System.currentTimeMillis()));
                a2.a.put("isPageOrSession", false);
                a2.a.put("sessionEnd", 1);
                Message.obtain((Handler)dz.a(), (int)102, (Object)a2).sendToTarget();
                ee.d("2");
            }
        }
        catch (Exception var0_1) {
            // empty catch block
        }
    }

    private static String a(Bundle bundle, String string) {
        if (bundle != null) {
            for (String string2 : bundle.keySet()) {
                if (!string2.equalsIgnoreCase(string)) continue;
                return String.valueOf(bundle.get(string));
            }
        }
        return null;
    }

    private static void c(Context context) {
        if (cs.a(14)) {
            try {
                Application application = null;
                if (ab.mContext instanceof Activity) {
                    application = ((Activity)ab.mContext).getApplication();
                } else if (ab.mContext instanceof Application) {
                    application = (Application)ab.mContext;
                }
                if (application != null && !d) {
                    Class class_ = Class.forName("android.app.Application$ActivityLifecycleCallbacks");
                    Method method = application.getClass().getMethod("registerActivityLifecycleCallbacks", class_);
                    e = new du();
                    method.invoke((Object)application, e);
                    d = true;
                }
            }
            catch (Throwable var1_2) {}
        } else {
            gd gd2 = new gd(context);
            try {
                Class class_ = Class.forName("android.app.ActivityManagerNative");
                cs.a(class_, (cn)gd2, "gDefault", "android.app.IActivityManager");
                d = true;
            }
            catch (Throwable var2_6) {
                ed.c("registerActivityLifecycleListener " + var2_6.getMessage());
            }
        }
    }

    private static void i() {
        if (ee.g() == 0) {
            ee.b(System.currentTimeMillis());
        } else if (System.currentTimeMillis() - ee.g() > 86400000) {
            cs.e = true;
        }
    }

    private static void j() {
        a a2 = new a();
        a2.a.put("apiType", 1);
        a2.a.put("controller", ft.a());
        Message message = Message.obtain();
        message.what = 102;
        message.obj = a2;
        dz.a().sendMessageDelayed(message, 100);
        fu.k();
    }

    public static void a() {
        try {
            Long[][] arrlong;
            int n2;
            int n3 = Calendar.getInstance().get(11);
            int n4 = 950;
            if (n3 >= 1 && n3 <= 6) {
                n4 = 200;
            }
            if ((n2 = j.nextInt(1000)) > n4) {
                return;
            }
            TreeMap<String, String> treeMap = new TreeMap<String, String>();
            treeMap.put("loc", cr.b(ab.mContext));
            if (f) {
                arrlong = cj.r(ab.mContext);
                treeMap.put("net", arrlong != null ? arrlong.toString() : null);
            }
            if (n2 % 2 == 0) {
                arrlong = cr.e(ab.mContext);
                treeMap.put("ruas", Arrays.toString(arrlong[0]));
                treeMap.put("ras", Arrays.toString(arrlong[1]));
            }
            TCAgent.onEvent(ab.mContext, "__tx.env", null, treeMap);
        }
        catch (Throwable var0_1) {
            // empty catch block
        }
    }

    private static void d(Context context) {
        String string = cs.a();
        if (string != null) {
            TreeMap<String, String> treeMap = new TreeMap<String, String>();
            treeMap.put("sysproperty", string);
            TCAgent.onEvent(context, "__tx.env", null, treeMap);
        }
        new Thread(new ge()).start();
    }

    private static void k() {
        JSONObject jSONObject;
        Object object;
        JSONArray jSONArray = cj.y(ab.mContext);
        if (jSONArray != null && jSONArray.length() == 2) {
            object = new TreeMap();
            object.put("imeis", jSONArray.toString());
            jSONObject = cj.z(ab.mContext);
            object.put("phoneNetworkInfo", jSONObject != null ? jSONObject.toString() : null);
            TCAgent.onEvent(ab.mContext, "__tx.env", null, (Map)object);
        }
        if ((object = ce.a()) != null) {
            jSONObject = new JSONObject();
            jSONObject.put((String)"SerialNo", (Object)object);
            TCAgent.onEvent(ab.mContext, "__tx.env", null, (Map)jSONObject);
        }
    }

    private static FileChannel l() {
        FileChannel fileChannel;
        block7 : {
            fileChannel = null;
            RandomAccessFile randomAccessFile = null;
            try {
                boolean bl2;
                File file = new File(ab.mContext.getFilesDir(), "td.lock");
                if (!file.exists() && !(bl2 = file.createNewFile())) {
                    return fileChannel;
                }
                randomAccessFile = new RandomAccessFile(file, "rw");
                fileChannel = randomAccessFile.getChannel();
            }
            catch (Throwable var2_3) {
                block6 : {
                    try {
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                        fileChannel = null;
                    }
                    catch (Exception var3_5) {
                        if (!TCAgent.LOG_ON) break block6;
                        var3_5.printStackTrace();
                    }
                }
                if (!TCAgent.LOG_ON) break block7;
                var2_3.printStackTrace();
            }
        }
        return fileChannel;
    }

    private static void m() {
        new Thread(new fw()).start();
    }

    private static void n() {
        long l2 = fu.a("1.cn.pool.ntp.org");
        if (l2 != -1) {
            ee.f(l2);
        } else {
            l2 = fu.a("0.asia.pool.ntp.org");
            if (l2 != -1) {
                ee.f(l2);
            } else {
                l2 = fu.a("2.asia.pool.ntp.org");
                if (l2 != -1) {
                    ee.f(l2);
                }
            }
        }
    }

    private static long a(String string) {
        long l2 = -1;
        ei ei2 = new ei();
        if (ei2.a(string, 5000)) {
            long l3 = ei2.a() + SystemClock.elapsedRealtime() - ei2.b();
            l2 = l3 - System.currentTimeMillis();
        }
        return l2;
    }

    static /* synthetic */ void b() {
        fu.h();
    }

    static /* synthetic */ FileChannel c() {
        return fu.l();
    }

    static /* synthetic */ void d() {
        fu.i();
    }

    static /* synthetic */ void e() {
        fu.j();
    }

    static /* synthetic */ void f() {
        fu.m();
    }

    static /* synthetic */ void b(Context context) {
        fu.d(context);
    }

    static /* synthetic */ void g() {
        fu.n();
    }

    static {
        h.start();
        i = new fv(h.getLooper());
        j = new Random();
        f = true;
    }

    static class b {
        b() {
        }

        static dt a(int n2) {
            eh eh2 = null;
            switch (n2) {
                case 1: {
                    eh2 = eh.f();
                    break;
                }
            }
            return eh2;
        }
    }

    static class a {
        HashMap a = new HashMap();

        a() {
        }
    }

}

