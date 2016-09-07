/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.app.ActivityManager$RunningTaskInfo
 *  android.app.Notification
 *  android.app.Notification$Builder
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.media.Ringtone
 *  android.media.RingtoneManager
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Message
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.os.Process
 *  android.os.Vibrator
 *  android.text.Html
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.os.PowerManager;
import android.os.Process;
import android.os.Vibrator;
import android.text.Html;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.bn;
import com.tendcloud.tenddata.cs;
import com.tendcloud.tenddata.fd;
import com.tendcloud.tenddata.fe;
import com.tendcloud.tenddata.ff;
import com.tendcloud.tenddata.fg;
import com.tendcloud.tenddata.fi;
import com.tendcloud.tenddata.fj;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

class fc {
    static boolean a = false;
    static final String b = "xdrig.com";
    static String c = null;
    static final String d = "https";
    static final String e = "https://xdrig.com/push";
    static String f = "v1";
    static final String g = "push";
    static final String h = "deviceToken";
    static final String i = "message";
    static boolean j = false;
    static final long k = 864000000;
    private static final String l = "app";
    private static volatile fc m = null;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static fc a() {
        if (m != null) return m;
        reference var0 = fc.class;
        synchronized (fc.class) {
            if (m != null) return m;
            {
                m = new fc();
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return m;
        }
    }

    private fc() {
    }

    private static boolean c(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
            PackageManager packageManager = context.getPackageManager();
            String string = packageManager.getApplicationInfo((String)context.getPackageName(), (int)0).processName;
            List list = activityManager.getRunningAppProcesses();
            if (list != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                    if (Process.myPid() != runningAppProcessInfo.pid || !runningAppProcessInfo.processName.equals(string)) continue;
                    return true;
                }
            }
        }
        catch (Exception var1_2) {
            // empty catch block
        }
        return false;
    }

    static void b() {
        Message message = Message.obtain();
        message.what = 101;
        fg.a().sendMessage(message);
        if (Math.abs(System.currentTimeMillis() - fi.d()) > 864000000) {
            fc.f();
        }
    }

    private static void d(Context context) {
        try {
            bn.startPushService(context);
        }
        catch (Throwable var1_1) {
            // empty catch block
        }
    }

    void c() {
        try {
            fe.c();
            fe.a();
            fe.b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appKey", (Object)fe.k);
            jSONObject.put("service", (Object)"app");
            fe.f.put("appKey", (Object)new JSONArray().put((Object)jSONObject));
            fj.a().sendEmptyMessage(3);
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
    }

    void a(ff ff2) {
        try {
            if (ff2 != null && !ff2.equals("")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("domain", (Object)"push");
                jSONObject.put("name", (Object)"message");
                TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
                if (ff2.e() == null) {
                    treeMap.put("msgSign", ff2.d());
                    treeMap.put("action", ff2.f().a());
                } else {
                    treeMap.put("msgSign", ff2.d());
                    treeMap.put("action", ff2.f().a());
                    treeMap.put("url", ff2.e());
                }
                if (ff2.g() > 0) {
                    treeMap.put("duration", ff2.g());
                }
                jSONObject.put("data", (Object)new JSONObject(treeMap));
                fc.a(jSONObject);
            }
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
    }

    void b(ff ff2) {
        try {
            if (ff2 != null && !ff2.equals("")) {
                fc.a(ff2.b(), ff2.c(), ff2.a());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("domain", (Object)"push");
                jSONObject.put("name", (Object)"deviceToken");
                TreeMap<String, String> treeMap = new TreeMap<String, String>();
                treeMap.put("channel", ff2.c());
                treeMap.put("appId", ff2.b());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("dt", (Object)ff2.a());
                treeMap.put("deviceToken", (String)jSONObject2);
                jSONObject.put("data", (Object)new JSONObject(treeMap));
                fc.a(jSONObject);
                fi.a(System.currentTimeMillis());
            }
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
    }

    void d() {
        fi.b();
    }

    void e() {
        fi.c();
    }

    private static void a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject().put("accountId", (Object)fi.a(ab.mContext));
            fe.a(null, jSONObject2, null, fi.e());
            boolean bl2 = fi.a(fe.a(jSONObject));
            if (bl2) {
                Message message = Message.obtain();
                message.what = 0;
                fj.a().sendMessage(message);
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
    }

    private static void a(String string, String string2, String string3) {
        JSONArray jSONArray = new JSONArray();
        try {
            String string4 = fi.e();
            if (string4.equals("")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("3rdAppId", (Object)string);
                jSONObject.put("channel", (Object)string2);
                jSONObject.put("dt", (Object)string3);
                jSONArray.put((Object)jSONObject);
                fi.b(jSONArray.toString());
            } else {
                JSONArray jSONArray2 = new JSONArray(string4);
                boolean bl2 = false;
                for (int i2 = 0; i2 < jSONArray2.length(); ++i2) {
                    JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                    String string5 = jSONObject.getString("channel");
                    String string6 = jSONObject.getString("dt");
                    String string7 = jSONObject.getString("3rdAppId");
                    if (string5.equals(string2)) {
                        bl2 = true;
                        if (!string7.equals(string)) {
                            jSONObject.put("3rdAppId", (Object)string);
                        }
                        if (!string6.equals(string3)) {
                            jSONObject.put("dt", (Object)string3);
                        }
                    }
                    jSONArray.put((Object)jSONObject);
                }
                if (!bl2) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("channel", (Object)string2);
                    jSONObject.put("3rdAppId", (Object)string);
                    jSONObject.put("dt", (Object)string3);
                    jSONArray.put((Object)jSONObject);
                }
                fi.b(jSONArray.toString());
            }
        }
        catch (Throwable var4_5) {
            // empty catch block
        }
    }

    static void f() {
        try {
            String string = fi.e();
            if (!string.equals("")) {
                JSONArray jSONArray = new JSONArray(string);
                for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    Message message = Message.obtain();
                    message.what = 102;
                    message.obj = new ff(jSONObject.getString("3rdAppId"), jSONObject.getString("dt"), jSONObject.getString("channel"));
                    fg.a().sendMessage(message);
                    fi.a(System.currentTimeMillis());
                }
            }
        }
        catch (Throwable var0_1) {
            // empty catch block
        }
    }

    static void a(Context context, JSONObject jSONObject) {
        try {
            Notification notification;
            JSONObject jSONObject2;
            JSONObject jSONObject3 = jSONObject.getJSONObject("msg");
            String string = jSONObject3.getJSONObject("title").getString("val");
            String string2 = jSONObject3.getJSONObject("content").getString("val");
            String string3 = jSONObject.getString("sign");
            fc.a(string3, false);
            int n2 = (int)System.currentTimeMillis();
            NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
            if (Build.VERSION.SDK_INT < 23) {
                notification = new Notification(0, (CharSequence)Html.fromHtml((String)string), System.currentTimeMillis());
                notification.icon = fc.e(context);
                notification.flags = 16;
            } else {
                notification = new Notification.Builder(context).setContentTitle((CharSequence)Html.fromHtml((String)string)).setContentText((CharSequence)Html.fromHtml((String)string2)).setSmallIcon(fc.e(context)).build();
                notification.flags = 16;
            }
            Intent intent = new Intent("com.talkingdata.notification.click");
            intent.putExtra("sign", string3);
            intent.putExtra("appkey", ab.a(context));
            if (jSONObject3.has("config") && jSONObject3.getJSONObject("config") != null) {
                jSONObject2 = jSONObject3.getJSONObject("config");
                if (jSONObject2.has("sound") && jSONObject2.getInt("sound") > 0) {
                    notification.defaults |= 1;
                }
                if (jSONObject2.has("vibrate") && jSONObject2.getInt("vibrate") > 0) {
                    notification.defaults |= 2;
                }
                if (jSONObject2.has("wakeup") && jSONObject2.getInt("wakeup") > 0) {
                    fc.a(2000, context);
                }
                if (jSONObject2.has("clearable") && jSONObject2.getInt("clearable") == 0) {
                    notification.flags = 32;
                    intent.putExtra("id", n2);
                }
            }
            if (!jSONObject.isNull("custom")) {
                jSONObject2 = jSONObject.getJSONObject("custom");
                intent.putExtra("custom", jSONObject2.toString());
            }
            if (!jSONObject.isNull("ex")) {
                jSONObject2 = jSONObject.getJSONObject("ex");
                intent.putExtra("ex", jSONObject2.toString());
            }
            jSONObject2 = PendingIntent.getBroadcast((Context)context, (int)(n2 + 1), (Intent)intent, (int)268435456);
            Intent intent2 = new Intent("com.talkingdata.notification.cancel");
            intent2.putExtra("sign", string3);
            intent2.putExtra("appkey", ab.a(context));
            PendingIntent pendingIntent = PendingIntent.getBroadcast((Context)context, (int)(n2 + 2), (Intent)intent2, (int)1073741824);
            if (Build.VERSION.SDK_INT < 23) {
                Method method = notification.getClass().getMethod("setLatestEventInfo", Context.class, CharSequence.class, CharSequence.class, PendingIntent.class);
                method.invoke((Object)notification, new Object[]{context, Html.fromHtml((String)string), Html.fromHtml((String)string2), null});
            }
            notification.contentIntent = jSONObject2;
            notification.deleteIntent = pendingIntent;
            notificationManager.notify(n2, notification);
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
    }

    private static int e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            return applicationInfo.icon;
        }
        catch (Throwable var2_3) {
            return 0;
        }
    }

    private static int f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            return applicationInfo.uid;
        }
        catch (Throwable var2_3) {
            return 12089;
        }
    }

    static void a(long l2, Context context) {
        PowerManager.WakeLock wakeLock = null;
        try {
            if (cs.b(context, "android.permission.WAKE_LOCK")) {
                PowerManager powerManager = (PowerManager)context.getSystemService("power");
                wakeLock = powerManager.newWakeLock(805306394, "TDAcquireWakeLock");
                wakeLock.acquire(l2);
            }
        }
        catch (Throwable var4_4) {
            // empty catch block
        }
    }

    static void a(Context context, String string) {
        try {
            Message message = Message.obtain();
            message.what = 103;
            message.obj = new ff(string, null, ff.a.d, 0);
            fg.a().sendMessage(message);
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
    }

    static void a(String string, boolean bl2) {
        try {
            Message message = Message.obtain();
            message.what = 103;
            message.obj = new ff(string, null, bl2 ? ff.a.f : ff.a.c, 0);
            fg.a().sendMessage(message);
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static boolean a(Context context) {
        if (!cs.b(context, "android.permission.GET_TASKS")) return false;
        try {
            ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
            List list = activityManager.getRunningTasks(1);
            if (!((ActivityManager.RunningTaskInfo)list.get((int)0)).baseActivity.getPackageName().equals(context.getPackageName())) return false;
            return true;
        }
        catch (Throwable var1_2) {
            return false;
        }
    }

    private static void g(Context context) {
        try {
            Ringtone ringtone = RingtoneManager.getRingtone((Context)context, (Uri)RingtoneManager.getDefaultUri((int)2));
            if (ringtone != null && !ringtone.isPlaying()) {
                ringtone.play();
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
    }

    private static void a(Context context, int n2) {
        try {
            if (cs.b(context, "android.permission.VIBRATE")) {
                Vibrator vibrator = (Vibrator)context.getSystemService("vibrator");
                vibrator.vibrate((long)n2);
            }
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
    }

    static /* synthetic */ void b(Context context) {
        fc.d(context);
    }

    static {
        try {
            j = fc.c(ab.mContext);
            if (j) {
                if (!a) {
                    new Thread(new fd()).start();
                }
                fc.b();
            }
        }
        catch (Throwable var0) {
            // empty catch block
        }
    }
}

