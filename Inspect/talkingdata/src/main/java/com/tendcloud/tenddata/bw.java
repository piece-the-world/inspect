/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningServiceInfo
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ResolveInfo
 *  android.content.pm.ServiceInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import com.apptalkingdata.protobuf.MessageNano;
import com.apptalkingdata.push.service.LocalService;
import com.apptalkingdata.push.service.Msg;
import com.apptalkingdata.push.service.Pb;
import com.apptalkingdata.push.service.PushService;
import com.apptalkingdata.push.service.PushServiceReceiver;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.az;
import com.tendcloud.tenddata.bb;
import com.tendcloud.tenddata.bg;
import com.tendcloud.tenddata.bh;
import com.tendcloud.tenddata.bk;
import com.tendcloud.tenddata.bx;
import com.tendcloud.tenddata.ce;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class bw {
    private static String d = bw.class.getName();
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    private static String e;

    public static void a(Context context, long l2) {
        Intent intent = new Intent(context, (Class)PushService.class);
        intent.putExtra("service-cmd", "service-ping");
        PendingIntent pendingIntent = PendingIntent.getService((Context)context, (int)0, (Intent)intent, (int)134217728);
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        alarmManager.cancel(pendingIntent);
        long l3 = System.currentTimeMillis() + l2;
        int n2 = Build.VERSION.SDK_INT;
        if (n2 < 19) {
            alarmManager.set(0, l3, pendingIntent);
        } else {
            alarmManager.setExact(0, l3, pendingIntent);
        }
    }

    public static byte[] a(Object object) {
        byte[] arrby = null;
        byte by2 = -1;
        if (object instanceof Pb.Ping) {
            (Pb.Ping)object;
            arrby = Pb.Ping.toByteArray((Pb.Ping)object);
            by2 = 1;
        } else if (object instanceof Pb.Msg) {
            (Pb.Msg)object;
            arrby = Pb.Msg.toByteArray((Pb.Msg)object);
            by2 = 0;
        } else if (object instanceof Pb.Ack) {
            (Pb.Ack)object;
            arrby = Pb.Ack.toByteArray((Pb.Ack)object);
            by2 = 2;
        }
        if (arrby == null) {
            bh.b(d, "bad obj");
            return null;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(arrby.length + 1);
        byteBuffer.put(by2);
        byteBuffer.put(arrby);
        return byteBuffer.array();
    }

    public static byte[] a(byte[] arrby) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(arrby.length + 4);
        byteBuffer.putInt(arrby.length);
        byteBuffer.put(arrby);
        return byteBuffer.array();
    }

    public static Object a(byte[] arrby, Class class_) {
        MessageNano messageNano = null;
        if (arrby != null && arrby.length >= 1) {
            try {
                byte[] arrby2 = new byte[arrby.length - 1];
                System.arraycopy(arrby, 1, arrby2, 0, arrby.length - 1);
                if (class_ == Pb.Ping.class) {
                    Pb.Ping ping;
                    messageNano = ping = Pb.Ping.parseFrom(arrby2);
                } else if (class_ == Pb.Msg.class) {
                    Pb.Msg msg;
                    messageNano = msg = Pb.Msg.parseFrom(arrby2);
                }
            }
            catch (Exception var3_4) {
                var3_4.printStackTrace();
            }
        }
        return messageNano;
    }

    public static Msg a(Pb.Msg msg) {
        Msg msg2 = new Msg();
        msg2.id = msg.id;
        msg2.ct = msg.ct;
        msg2.tp = msg.tp;
        msg2.d = new String(msg.d);
        return msg2;
    }

    public static String a(Context context) {
        if (e != null && !e.isEmpty()) {
            return e;
        }
        try {
            e = ce.a(context);
            bh.a(d, "TCAgent getDeviceId " + e);
            if (e != null && !e.isEmpty()) {
                return e;
            }
        }
        catch (Throwable var1_1) {
            bh.a(d, "[push] Error getDeviceId " + var1_1);
        }
        if (e == null || e.isEmpty()) {
            bh.a(d, "Get Push Id Error uuid is null");
        }
        return e;
    }

    public static String b(Context context) {
        String string = bw.a(context, "MPUSH_GATEWAY");
        if (az.a(string)) {
            string = "http://pg.xdrig.com";
        }
        return string;
    }

    public static String c(Context context) {
        String string = null;
        String string2 = null;
        try {
            string = bg.d("mpush_db_appid");
            if (!az.a(string)) {
                return string;
            }
            string = ab.getAppAnalyticsAppId();
            string2 = "app-" + string;
            bh.a(d, "TalkingDataSDK getAppId " + string2);
        }
        catch (Throwable var3_3) {
            bh.a(d, "get AppId Error" + var3_3);
        }
        if (az.a(string2)) {
            throw new RuntimeException("[mpush] start service error, app id is required");
        }
        bg.a("mpush_db_appid", string2);
        return string2;
    }

    public static String a(Context context, String string) {
        if (context == null || string == null) {
            throw new IllegalArgumentException("context & meta Key required");
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        }
        catch (PackageManager.NameNotFoundException var3_3) {
            throw new RuntimeException("fail to get application info", (Throwable)var3_3);
        }
        return applicationInfo.metaData == null ? null : applicationInfo.metaData.getString(string);
    }

    public static String d(Context context) {
        return bw.a("com.mrocker.push.service" + bw.b(context.getApplicationContext()) + bw.a(context));
    }

    public static String a(String string) {
        return bw.b(bw.b(string));
    }

    public static byte[] b(String string) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(string.getBytes());
            byte[] arrby = messageDigest.digest();
            return arrby;
        }
        catch (Exception var1_2) {
            var1_2.printStackTrace();
            return null;
        }
    }

    public static String b(byte[] arrby) {
        String string = "";
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            string = Integer.toHexString(arrby[i2] & 255);
            stringBuilder.append(string.length() == 1 ? "0" + string : string);
        }
        return stringBuilder.toString();
    }

    public static HashMap c(String string) {
        try {
            JSONObject jSONObject = new JSONObject(string);
            Iterator iterator = jSONObject.keys();
            HashMap<String, String> hashMap = new HashMap<String, String>();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                String string3 = jSONObject.get(string2).toString();
                hashMap.put(string2, string3);
            }
            return hashMap;
        }
        catch (Exception var2_3) {
            var2_3.printStackTrace();
            return null;
        }
    }

    public static void isPushAutoStart(Context context) {
        bw.c(context);
        bb.submitExecutor(new bx(context));
    }

    private static void k(Context context) {
        try {
            String[] arrstring;
            boolean bl2 = false;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            for (String string : arrstring = packageInfo.requestedPermissions) {
                if (!"android.permission.RECEIVE_BOOT_COMPLETED".equals(string)) continue;
                bl2 = true;
                break;
            }
            if (!bl2) {
                throw new IllegalStateException("start service error! please add 'android.permission.RECEIVE_BOOT_COMPLETED' in AndroidManifest uses-permission");
            }
        }
        catch (PackageManager.NameNotFoundException var1_2) {
            bh.b(d, var1_2.toString());
        }
    }

    private static void l(Context context) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class)PushService.class), 4);
            boolean bl2 = serviceInfo.exported;
            String string = serviceInfo.processName;
            if (!bl2) {
                throw new IllegalStateException("start service error! please add 'exported=\"true\"' into AndroidManifest <service android:name=\"PushService\"/> ");
            }
            bk.c(context, string);
        }
        catch (PackageManager.NameNotFoundException var1_2) {
            throw new IllegalStateException("start service error! please add <service android:name=\"PushService\" exported=\"true\" android:process=\":push\"/> into AndroidManifest");
        }
    }

    private static void m(Context context) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        List list = context.getPackageManager().queryBroadcastReceivers(intent, 64);
        StringBuffer stringBuffer = new StringBuffer("");
        boolean bl2 = false;
        for (ResolveInfo resolveInfo : list) {
            IntentFilter intentFilter = resolveInfo.filter;
            if (intentFilter == null || !resolveInfo.activityInfo.name.equals(PushServiceReceiver.class.getName())) continue;
            bl2 = true;
            stringBuffer.append(intentFilter.hasAction("android.intent.action.CMD") ? "" : " android.intent.action.CMD");
            stringBuffer.append(intentFilter.hasAction("android.talkingdata.action.media.MESSAGE") ? "" : " android.talkingdata.action.media.MESSAGE");
            stringBuffer.append(intentFilter.hasAction("android.intent.action.BOOT_COMPLETED") ? "" : " android.intent.action.BOOT_COMPLETED");
            stringBuffer.append(intentFilter.hasAction("android.net.conn.CONNECTIVITY_CHANGE") ? "" : " android.net.conn.CONNECTIVITY_CHANGE");
            stringBuffer.append(intentFilter.hasAction("android.intent.action.USER_PRESENT") ? "" : " android.intent.action.USER_PRESENT");
        }
        if (!bl2) {
            throw new IllegalStateException("start service error! please add <receiver android:name=\"PushServiceReceiver\"/> into AndroidManifest");
        }
        if (!az.a(stringBuffer.toString())) {
            throw new IllegalStateException("start service error! please add '" + stringBuffer.toString() + "' into AndroidManifest <receiver android:name=\"PushServiceReceiver\"/> ");
        }
    }

    public static void b(Context context, String string) {
        boolean bl2 = bw.c(context, string, PushService.class.getName());
        if (!bl2) {
            bw.d(context, string);
        }
        bw.c(context, string);
    }

    public static void c(Context context, String string) {
        try {
            Intent intent = new Intent();
            intent.setClassName(string, LocalService.class.getName());
            context.startService(intent);
        }
        catch (Throwable var2_3) {
            bh.a(d, "restart service error: ", var2_3);
        }
    }

    public static void d(Context context, String string) {
        try {
            Intent intent = new Intent();
            intent.setClassName(string, PushService.class.getName());
            context.startService(intent);
        }
        catch (Throwable var2_3) {
            bh.b(d, "restart service error: " + var2_3.getMessage());
        }
    }

    public static void e(Context context, String string) {
        String string2 = "com.gametalkingdata.push.service.PushService";
        String string3 = "com.gametalkingdata.push.service.LocalService";
        boolean bl2 = bw.c(context, string, string2);
        if (!bl2) {
            bw.b(context, string, string2);
        }
        bw.a(context, string, string3);
        String string4 = "com.mrocker.push.service.PushService";
        String string5 = "com.mrocker.push.service.LocalService";
        boolean bl3 = bw.c(context, string, string4);
        if (!bl3) {
            bw.b(context, string, string4);
        }
        bw.a(context, string, string5);
    }

    public static void a(Context context, String string, String string2) {
        try {
            Intent intent = new Intent();
            intent.setClassName(string, string2);
            context.startService(intent);
        }
        catch (Throwable var3_4) {
            bh.a(d, "restart td service error: ", var3_4);
        }
    }

    public static void b(Context context, String string, String string2) {
        try {
            Intent intent = new Intent();
            intent.setClassName(string, string2);
            context.startService(intent);
        }
        catch (Throwable var3_4) {
            bh.b(d, "restart td service error: " + var3_4.getMessage());
        }
    }

    public static boolean c(Context context, String string, String string2) {
        boolean bl2 = false;
        try {
            Context context2 = context.createPackageContext(string, 2);
            bl2 = bw.f(context2, string2);
        }
        catch (PackageManager.NameNotFoundException var4_5) {
            bh.b(d, "isServiceRunning   error !");
        }
        return bl2;
    }

    public static boolean f(Context context, String string) {
        boolean bl2 = false;
        ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
        List list = activityManager.getRunningServices(Integer.MAX_VALUE);
        if (list.size() <= 0) {
            return false;
        }
        String string2 = context.getPackageName() + ":push";
        for (ActivityManager.RunningServiceInfo runningServiceInfo : list) {
            if (!runningServiceInfo.service.getClassName().equals(string) || !runningServiceInfo.process.equals(string2)) continue;
            bl2 = true;
            break;
        }
        return bl2;
    }

    public static List e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        HashSet<String> hashSet = new HashSet<String>();
        try {
            for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(new Intent("android.talkingdata.action.notification.SHOW"), 0)) {
                hashSet.add(resolveInfo.activityInfo.packageName);
            }
        }
        catch (Exception var3_4) {
            bh.b(d, "listPushPackages  error!");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(hashSet);
        return arrayList;
    }

    public static List f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        HashSet<String> hashSet = new HashSet<String>();
        try {
            for (ResolveInfo resolveInfo2 : packageManager.queryBroadcastReceivers(new Intent("android.talkingdata.action.notification.SHOW"), 0)) {
                hashSet.add(resolveInfo2.activityInfo.packageName);
            }
            for (ResolveInfo resolveInfo2 : packageManager.queryBroadcastReceivers(new Intent("android.mpushservice.action.notification.SHOW"), 0)) {
                hashSet.add(resolveInfo2.activityInfo.packageName);
            }
        }
        catch (Exception var3_4) {
            bh.b(d, "listOtherPackages  error!");
        }
        Iterator iterator = new ArrayList();
        iterator.addAll(hashSet);
        return iterator;
    }

    public static String g(Context context) {
        String string = null;
        try {
            string = bg.d("mpush_db_channel");
            if (!az.a(string)) {
                return string;
            }
            Class class_ = Class.forName("com.tendcloud.tenddata.dg");
            Method method = class_.getMethod("getChannelId", Context.class);
            Object object = method.invoke(class_.newInstance(), new Object[]{context});
            string = object.toString();
            bh.a(d, "TalkingDataSDK getChannelId " + string);
        }
        catch (Throwable var2_3) {
            bh.a(d, "Error getChannelId from TalkingDataSDK" + var2_3);
        }
        if (az.a(string)) {
            bh.a(d, "channel is null");
        }
        bg.a("mpush_db_channel", string);
        return string;
    }

    static /* synthetic */ void h(Context context) {
        bw.k(context);
    }

    static /* synthetic */ void i(Context context) {
        bw.l(context);
    }

    static /* synthetic */ void j(Context context) {
        bw.m(context);
    }
}

