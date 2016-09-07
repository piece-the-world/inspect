/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Environment
 *  android.preference.PreferenceManager
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.preference.PreferenceManager;
import com.tendcloud.tenddata.az;
import com.tendcloud.tenddata.bh;
import com.tendcloud.tenddata.bw;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class bk {
    private static final String a = bk.class.getSimpleName();
    private static SharedPreferences b;

    public static void init(Context context) {
        if (b == null) {
            b = PreferenceManager.getDefaultSharedPreferences((Context)context);
        }
    }

    public static void a(String string, Object object) {
        SharedPreferences.Editor editor = b.edit();
        if (object instanceof String) {
            editor.putString(string, object.toString());
        } else if (object instanceof Boolean) {
            editor.putBoolean(string, ((Boolean)object).booleanValue());
        } else if (object instanceof Integer) {
            editor.putInt(string, ((Integer)object).intValue());
        } else if (object instanceof Float) {
            editor.putFloat(string, ((Float)object).floatValue());
        } else if (object instanceof Long) {
            editor.putLong(string, ((Long)object).longValue());
        }
        editor.commit();
    }

    public static Object b(String string, Object object) {
        Object object2 = null;
        if (object instanceof String) {
            object2 = b.getString(string, object.toString());
        } else if (object instanceof Boolean) {
            object2 = b.getBoolean(string, ((Boolean)object).booleanValue());
        } else if (object instanceof Integer) {
            object2 = b.getInt(string, ((Integer)object).intValue());
        } else if (object instanceof Float) {
            object2 = Float.valueOf(b.getFloat(string, ((Float)object).floatValue()));
        } else if (object instanceof Long) {
            object2 = b.getLong(string, ((Long)object).longValue());
        }
        String string2 = object2;
        return string2;
    }

    public static void a(Context context, String string, String string2) {
        try {
            FileOutputStream fileOutputStream = context.openFileOutput(string, 3);
            byte[] arrby = string2.getBytes();
            fileOutputStream.write(arrby);
            fileOutputStream.close();
        }
        catch (Exception var3_4) {
            var3_4.printStackTrace();
        }
    }

    public static String b(Context context, String string, String string2) {
        String string3 = null;
        try {
            Context context2 = !az.a(string) ? context.createPackageContext(string, 2) : context;
            File file = context2.getFileStreamPath(string2);
            if (file == null || !file.exists()) {
                bh.e(a, String.format("old sdk doesn't have preference file [%s, %s]", string, string2));
                return null;
            }
            try {
                FileInputStream fileInputStream = context2.openFileInput(string2);
                byte[] arrby = new byte[fileInputStream.available()];
                fileInputStream.read(arrby);
                fileInputStream.close();
                string3 = new String(arrby);
            }
            catch (Exception var6_9) {
                bh.a(a, "read file err", var6_9);
            }
        }
        catch (PackageManager.NameNotFoundException var5_6) {
            bh.a(a, "find package err", (Throwable)var5_6);
        }
        catch (SecurityException var5_7) {
            bh.a(a, "permission err", var5_7);
        }
        return string3;
    }

    public static void putCodePreferences(Context context) {
        bk.a(context, "mpush_version_preferences_file", "26");
    }

    public static int a(Context context, String string) {
        int n2 = 0;
        String string2 = bk.b(context, string, "mpush_version_preferences_file");
        if (!az.a(string2)) {
            n2 = Integer.parseInt(string2);
        }
        return n2;
    }

    public static void putGatewayPreferences(Context context) {
        bk.a(context, "mpush_gateway_preferences_file", bw.b(context));
    }

    public static String b(Context context, String string) {
        String string2 = bk.b(context, string, "mpush_gateway_preferences_file");
        if (az.a(string2)) {
            string2 = "http://pg.xdrig.com";
        }
        return string2;
    }

    public static void c(Context context, String string) {
        bk.a(context, "mpush_process_preferences_file", string);
    }

    public static String d(Context context, String string) {
        return bk.b(context, string, "mpush_process_preferences_file");
    }

    public static void a(String string, String string2) {
        try {
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/.mpush/");
            if (!file.exists()) {
                file.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file.getPath() + "/" + string);
            byte[] arrby = string2.getBytes();
            fileOutputStream.write(arrby);
            fileOutputStream.close();
        }
        catch (Throwable var2_3) {
            throw new RuntimeException("err in write sd file", var2_3);
        }
    }

    public static String a(String string) {
        String string2 = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(Environment.getExternalStorageDirectory().getAbsolutePath() + "/.mpush/" + string);
            byte[] arrby = new byte[fileInputStream.available()];
            fileInputStream.read(arrby);
            fileInputStream.close();
            string2 = new String(arrby);
        }
        catch (Throwable var2_3) {
            bh.a(a, "get SD card file err", var2_3);
        }
        return string2;
    }
}

