/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.hardware.Sensor
 *  android.hardware.SensorManager
 *  android.net.wifi.WifiInfo
 *  android.net.wifi.WifiManager
 *  android.os.Build
 *  android.os.Environment
 *  android.preference.PreferenceManager
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  android.telephony.TelephonyManager
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tendcloud.tenddata.cj;
import com.tendcloud.tenddata.cm;
import com.tendcloud.tenddata.cs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class ce {
    private static final String c = "pref.deviceid.key";
    private static final String d = "00:00:00:00:00:00";
    private static final Pattern e = Pattern.compile("^([0-9A-F]{2}:){5}([0-9A-F]{2})$");
    private static final Pattern f = Pattern.compile("[0-3][0-9a-f]{24,32}");
    private static final Pattern g = Pattern.compile("[0-3][0-9a-f]{32}");
    private static final String h = ".tcookieid";
    static TelephonyManager a;
    static String b;
    private static String i;

    public static void init(Context context) {
        a = (TelephonyManager)context.getSystemService("phone");
    }

    public static synchronized String a(Context context) {
        if (b == null) {
            b = ce.k(context);
        }
        return b;
    }

    public static String b(Context context) {
        try {
            return Settings.Secure.getString((ContentResolver)context.getContentResolver(), (String)"android_id");
        }
        catch (Throwable var1_1) {
            return null;
        }
    }

    public static String c(Context context) {
        block8 : {
            try {
                if (cs.a(23) && context.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
                    return null;
                }
                if (!cs.b(context, "android.permission.READ_PHONE_STATE")) break block8;
                if (a == null) {
                    ce.init(context);
                }
                String string = null;
                JSONArray jSONArray = cj.y(context);
                if (jSONArray != null && jSONArray.length() == 2) {
                    try {
                        string = jSONArray.getJSONObject(1).getString("imei");
                    }
                    catch (Exception var3_4) {
                        // empty catch block
                    }
                }
                if (string == null) {
                    string = a.getDeviceId();
                }
                return string;
            }
            catch (Throwable var1_2) {
                // empty catch block
            }
        }
        return null;
    }

    public static String d(Context context) {
        try {
            if (cs.a(23) && context.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
                return null;
            }
            if (cs.b(context, "android.permission.READ_PHONE_STATE")) {
                if (a == null) {
                    ce.init(context);
                }
                return a.getSimSerialNumber();
            }
        }
        catch (Throwable var1_1) {
            // empty catch block
        }
        return null;
    }

    public static String e(Context context) {
        try {
            if (cs.a(23) && context.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
                return null;
            }
            if (cs.b(context, "android.permission.READ_PHONE_STATE")) {
                if (a == null) {
                    ce.init(context);
                }
                return a.getSubscriberId();
            }
        }
        catch (Throwable var1_1) {
            // empty catch block
        }
        return null;
    }

    public static String f(Context context) {
        if (!cs.b) {
            return null;
        }
        String string = null;
        String string2 = "02:00:00:00:00:00";
        try {
            WifiInfo wifiInfo;
            WifiManager wifiManager;
            if (cs.a(23)) {
                try {
                    ArrayList<NetworkInterface> arrayList = Collections.list(NetworkInterface.getNetworkInterfaces());
                    if (arrayList == null || arrayList.size() <= 0) {
                        return string2;
                    }
                    for (NetworkInterface networkInterface : arrayList) {
                        if (!networkInterface.getName().equalsIgnoreCase("wlan0")) continue;
                        byte[] arrby = networkInterface.getHardwareAddress();
                        if (arrby == null) {
                            return "";
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        for (byte by2 : arrby) {
                            stringBuilder.append(String.format("%02X:", Byte.valueOf(by2)));
                        }
                        if (stringBuilder.length() > 0) {
                            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                        }
                        string = stringBuilder.toString().toUpperCase().trim();
                    }
                }
                catch (Throwable var3_4) {
                    // empty catch block
                }
                return !cs.b(string) ? string : string2;
            }
            if (cs.b(context, "android.permission.ACCESS_WIFI_STATE") && (wifiManager = (WifiManager)context.getSystemService("wifi")).isWifiEnabled() && (wifiInfo = wifiManager.getConnectionInfo()) != null && (string = wifiInfo.getMacAddress()) != null && ("00:00:00:00:00:00".equals(string = string.toUpperCase().trim()) || !e.matcher(string).matches())) {
                string = null;
            }
        }
        catch (Throwable var3_6) {
            // empty catch block
        }
        return string;
    }

    public static final String g(Context context) {
        try {
            Class class_ = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            Method method = class_.getMethod("getAdvertisingIdInfo", Context.class);
            Object object = method.invoke(null, new Object[]{context});
            Class class_2 = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            method = class_2.getMethod("getId", new Class[0]);
            String string = (String)method.invoke(object, new Object[0]);
            return string;
        }
        catch (Throwable var1_2) {
            return null;
        }
    }

    public static final String a() {
        try {
            if (cs.a(9)) {
                return Build.SERIAL;
            }
        }
        catch (Throwable var0) {
            // empty catch block
        }
        return null;
    }

    public static final String h(Context context) {
        String string = ce.f(context);
        if (!TextUtils.isEmpty((CharSequence)string)) {
            string = string.replaceAll(":", "");
            string = String.valueOf(Long.parseLong(string, 16));
        }
        String string2 = ce.b(context);
        String string3 = ce.c(context);
        String string4 = ce.e(context);
        String string5 = ce.d(context);
        String string6 = ce.a(context);
        String string7 = ce.g(context);
        String string8 = ce.a();
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(2).append("|").append(string).append("|").append(string2).append("|").append(string3).append("|").append(string4).append("|").append(string5).append("|").append(string6).append("|").append(string7).append("|").append(string8).toString();
    }

    private static String k(Context context) {
        String string = ce.i(context);
        String string2 = ce.b();
        boolean bl2 = ce.c();
        String string3 = ce.a(context, bl2);
        String[] arrstring = new String[]{string, string2, string3};
        String string4 = null;
        for (String string52 : arrstring) {
            if (cs.b(string52) || !g.matcher(string52).matches()) continue;
            string4 = string52;
            break;
        }
        if (cs.b(string4) && !cs.b(string) && Math.random() < 0.99) {
            for (String string52 : arrstring) {
                if (cs.b(string52) || !f.matcher(string52).matches()) continue;
                string4 = string52;
                break;
            }
        }
        if (cs.b(string4)) {
            string4 = ce.l(context);
        }
        if (!string4.equals(string)) {
            ce.b(context, string4);
        }
        if (!string4.equals(string3)) {
            ce.a(context, string4, bl2);
        }
        if (!string4.equals(string2)) {
            ce.a(context, string4);
        }
        return string4;
    }

    static String a(Context context, boolean bl2) {
        if (cs.a(23) && context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return null;
        }
        String string = Environment.getExternalStorageState();
        if ("mounted".equals(string)) {
            String string2 = ce.a(new File(Environment.getExternalStorageDirectory(), bl2 ? ".tcookieid" : ".tcookieid" + ce.j(context)));
            if (cs.b(string2)) {
                string2 = ce.a(new File(Environment.getExternalStorageDirectory(), ".tid" + ce.j(context)));
            }
            return string2;
        }
        return "";
    }

    static String b() {
        String string = null;
        File[] arrfile = new File("/").listFiles();
        if (arrfile == null || arrfile.length == 0) {
            return string;
        }
        for (File file : arrfile) {
            if (!file.isDirectory() || "/sdcard".equals(file.getAbsolutePath())) continue;
            if (file.canWrite() && !cs.b(string = ce.a(new File(file, ".tcookieid")))) {
                return string;
            }
            if (file.listFiles() == null) continue;
            for (File file2 : file.listFiles()) {
                if (!file2.isDirectory() || cs.b(string = ce.a(new File(file2, ".tcookieid")))) continue;
                return string;
            }
        }
        return string;
    }

    private static String a(File file) {
        try {
            if (file.exists() && file.canRead()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] arrby = new byte[128];
                int n2 = fileInputStream.read(arrby);
                fileInputStream.close();
                return new String(arrby, 0, n2);
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
        return null;
    }

    static String i(Context context) {
        String string = cm.b(context, "tdid", "pref.deviceid.key", null);
        if (cs.b(string)) {
            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)context);
            string = sharedPreferences.getString("pref.deviceid.key", null);
        }
        return string;
    }

    private static void a(Context context, String string, boolean bl2) {
        ce.a(new File(Environment.getExternalStorageDirectory(), bl2 ? ".tcookieid" : ".tcookieid" + ce.j(context)), string);
    }

    private static void a(Context context, String string) {
        File[] arrfile = new File("/").listFiles();
        if (arrfile == null || arrfile.length == 0) {
            return;
        }
        for (File file : arrfile) {
            if (!file.isDirectory() || "/sdcard".equals(file.getAbsolutePath())) continue;
            if (file.canWrite() && !new File(file, ".tcookieid" + ce.j(context)).exists()) {
                ce.a(new File(file, ".tcookieid"), string);
            }
            if (file.listFiles() == null) continue;
            for (File file2 : file.listFiles()) {
                if (!file2.isDirectory() || !file2.canWrite() || new File(file2, ".tcookieid" + ce.j(context)).exists()) continue;
                ce.a(new File(file2, ".tcookieid"), string);
            }
        }
    }

    private static void a(File file, String string) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(string.getBytes());
            fileOutputStream.close();
            if (cs.a(9)) {
                Method method = file.getClass().getMethod("setReadable", Boolean.TYPE, Boolean.TYPE);
                method.invoke(file, true, false);
            } else {
                Runtime.getRuntime().exec("chmod 444 " + file.getAbsolutePath());
            }
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
    }

    private static void b(Context context, String string) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("tdid", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("pref.deviceid.key", string);
                editor.commit();
            }
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
    }

    private static String l(Context context) {
        String string = ce.m(context);
        string = "3" + cs.c(string);
        return string;
    }

    private static String m(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ce.c(context)).append('-').append(ce.f(context)).append('-').append(ce.b(context));
        return stringBuilder.toString();
    }

    static boolean c() {
        boolean bl2 = true;
        try {
            if (cs.a(9)) {
                bl2 = (Boolean)Environment.class.getMethod("isExternalStorageRemovable", new Class[0]).invoke(null, new Object[0]);
            }
        }
        catch (Throwable var1_1) {
            // empty catch block
        }
        return !bl2;
    }

    static String j(Context context) {
        if (i == null) {
            try {
                SensorManager sensorManager = (SensorManager)context.getSystemService("sensor");
                List list = sensorManager.getSensorList(-1);
                Sensor[] arrsensor = new Sensor[64];
                for (Sensor sensor : list) {
                    if (sensor.getType() >= arrsensor.length || sensor.getType() < 0) continue;
                    arrsensor[sensor.getType()] = sensor;
                }
                StringBuffer stringBuffer = new StringBuffer();
                for (int i2 = 0; i2 < arrsensor.length; ++i2) {
                    if (arrsensor[i2] == null) continue;
                    stringBuffer.append(i2).append('.').append(arrsensor[i2].getVendor()).append('-').append(arrsensor[i2].getName()).append('-').append(arrsensor[i2].getVersion()).append('\n');
                }
                i = String.valueOf(stringBuffer.toString().hashCode());
            }
            catch (Throwable var1_2) {
                // empty catch block
            }
        }
        return i;
    }

    static {
        i = null;
    }
}

