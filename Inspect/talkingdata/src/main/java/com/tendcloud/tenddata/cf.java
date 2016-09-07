/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Environment
 *  android.os.StatFs
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cf {
    private static final int a = 3600000;

    public static String a() {
        return "Android+" + Build.VERSION.RELEASE;
    }

    public static String b() {
        return Build.MANUFACTURER.trim();
    }

    public static String c() {
        return Build.BRAND.trim();
    }

    public static String d() {
        return Build.MODEL.trim();
    }

    public static int e() {
        return TimeZone.getDefault().getRawOffset() / 3600000;
    }

    public static String f() {
        try {
            String string = Build.MODEL.trim();
            String string2 = cf.a(Build.MANUFACTURER.trim(), string);
            if (TextUtils.isEmpty((CharSequence)string2)) {
                string2 = cf.a(Build.BRAND.trim(), string);
            }
            return (string2 == null ? "" : string2) + ":" + string;
        }
        catch (Throwable var0_1) {
            return "";
        }
    }

    private static String a(String string, String string2) {
        try {
            String string3 = string.toLowerCase();
            if (string3.startsWith("unknown") || string3.startsWith("alps") || string3.startsWith("android") || string3.startsWith("sprd") || string3.startsWith("spreadtrum") || string3.startsWith("rockchip") || string3.startsWith("wondermedia") || string3.startsWith("mtk") || string3.startsWith("mt65") || string3.startsWith("nvidia") || string3.startsWith("brcm") || string3.startsWith("marvell") || string2.toLowerCase().contains(string3)) {
                return null;
            }
            return string;
        }
        catch (Throwable var2_3) {
            return null;
        }
    }

    public static int g() {
        return Build.VERSION.SDK_INT;
    }

    public static String h() {
        return Build.VERSION.RELEASE;
    }

    public static String i() {
        return Locale.getDefault().getLanguage();
    }

    public static String j() {
        return Locale.getDefault().getCountry();
    }

    public static String a(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                int n2 = displayMetrics.widthPixels;
                int n3 = displayMetrics.heightPixels;
                return "" + Math.min(n2, n3) + "*" + Math.max(n2, n3) + "*" + displayMetrics.densityDpi;
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
        return "";
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static String[] k() {
        boolean bl2;
        ArrayList<String> arrayList;
        String string;
        String[] arrstring;
        block17 : {
            arrstring = new String[4];
            for (int i2 = 0; i2 < 4; ++i2) {
                arrstring[i2] = "";
            }
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            arrayList = new ArrayList<String>();
            bl2 = false;
            try {
                fileReader = new FileReader("/proc/cpuinfo");
                bufferedReader = new BufferedReader(fileReader, 1024);
                while ((string = bufferedReader.readLine()) != null) {
                    arrayList.add(string);
                }
                bl2 = true;
                try {
                    bufferedReader.close();
                    fileReader.close();
                }
                catch (IOException var6_7) {}
                break block17;
                catch (Throwable throwable) {
                    try {
                        bufferedReader.close();
                        fileReader.close();
                    }
                    catch (IOException var6_9) {}
                    break block17;
                    catch (Throwable throwable2) {
                        try {
                            bufferedReader.close();
                            fileReader.close();
                            throw throwable2;
                        }
                        catch (IOException var8_14) {
                            // empty catch block
                        }
                        throw throwable2;
                    }
                }
            }
            catch (Throwable var6_11) {
                // empty catch block
            }
        }
        String[] arrstring2 = new String[]{"Processor\\s*:\\s*(.*)", "CPU\\s*variant\\s*:\\s*0x(.*)", "Hardware\\s*:\\s*(.*)"};
        if (bl2) {
            int n2 = arrayList.size();
            for (int i3 = 0; i3 < 3; ++i3) {
                Pattern pattern = Pattern.compile(arrstring2[i3]);
                for (int i4 = 0; i4 < n2; ++i4) {
                    string = (String)arrayList.get(i4);
                    Matcher matcher = pattern.matcher(string);
                    if (!matcher.find()) continue;
                    arrstring[i3] = matcher.toMatchResult().group(1);
                }
            }
        }
        arrstring[3] = cf.b("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
        return arrstring;
    }

    public static String[] l() {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static int[] m() {
        Object object;
        int[] arrn = new int[]{0, 0};
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        int[] arrn2 = new int[4];
        for (object = 0; object < 4; ++object) {
            arrn2[object] = 0;
        }
        try {
            fileReader = new FileReader("/proc/meminfo");
            bufferedReader = new BufferedReader(fileReader, 1024);
            for (int i2 = 0; i2 < 4; ++i2) {
                object = bufferedReader.readLine();
                arrn2[i2] = cf.a((String)object);
            }
            arrn[0] = arrn2[0];
            arrn[1] = arrn2[1] + arrn2[2] + arrn2[3];
            try {
                bufferedReader.close();
                fileReader.close();
                return arrn;
            }
            catch (IOException var5_6) {
                return arrn;
            }
            catch (IOException iOException) {
                try {
                    bufferedReader.close();
                    fileReader.close();
                    return arrn;
                }
                catch (IOException var5_8) {
                    return arrn;
                }
                catch (Throwable throwable) {
                    try {
                        bufferedReader.close();
                        fileReader.close();
                        throw throwable;
                    }
                    catch (IOException var7_11) {
                        // empty catch block
                    }
                    throw throwable;
                }
            }
        }
        catch (Throwable var5_9) {
            // empty catch block
        }
        return arrn;
    }

    public static int[] n() {
        try {
            int[] arrn = new int[4];
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            arrn[0] = statFs.getBlockCount() * (statFs.getBlockSize() / 512) / 2;
            arrn[1] = statFs.getAvailableBlocks() * (statFs.getBlockSize() / 512) / 2;
            statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            arrn[2] = statFs.getBlockCount() * (statFs.getBlockSize() / 512) / 2;
            arrn[3] = statFs.getAvailableBlocks() * (statFs.getBlockSize() / 512) / 2;
            return arrn;
        }
        catch (Throwable var0_1) {
            return null;
        }
    }

    public static int o() {
        try {
            String string = cf.b("/sys/class/power_supply/battery/full_bat");
            Pattern pattern = Pattern.compile("\\s*([0-9]+)");
            Matcher matcher = pattern.matcher(string);
            if (!matcher.find()) {
                return 0;
            }
            string = matcher.toMatchResult().group(0);
            return Integer.valueOf(string);
        }
        catch (Exception var0_1) {
            return 0;
        }
    }

    private static int a(String string) {
        try {
            String string2 = "";
            Pattern pattern = Pattern.compile("([0-9]+)");
            Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
                string2 = matcher.toMatchResult().group(0);
            }
            return Integer.valueOf(string2);
        }
        catch (Exception var1_2) {
            return 0;
        }
    }

    private static String b(String string) {
        String string2 = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(string);
            try {
                int n2;
                char[] arrc = new char[1024];
                bufferedReader = new BufferedReader(fileReader, 1024);
                while (-1 != (n2 = bufferedReader.read(arrc, 0, 1024))) {
                    string2 = string2 + new String(arrc, 0, n2);
                }
                bufferedReader.close();
                fileReader.close();
            }
            catch (IOException var4_5) {}
        }
        catch (Throwable var4_6) {
            // empty catch block
        }
        return string2;
    }
}

