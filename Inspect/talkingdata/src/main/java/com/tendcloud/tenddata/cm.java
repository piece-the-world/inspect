/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.content.SharedPreferences;

public class cm {
    public static void a(Context context, String string, String string2, long l2) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(string, 0);
            sharedPreferences.edit().putLong(string2, l2).commit();
        }
        catch (Throwable var5_5) {
            // empty catch block
        }
    }

    public static void a(Context context, String string, String string2, String string3) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(string, 0);
            sharedPreferences.edit().putString(string2, string3).commit();
        }
        catch (Throwable var4_5) {
            // empty catch block
        }
    }

    public static long b(Context context, String string, String string2, long l2) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(string, 0);
            return sharedPreferences.getLong(string2, l2);
        }
        catch (Throwable var5_5) {
            return l2;
        }
    }

    public static String b(Context context, String string, String string2, String string3) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(string, 0);
            return sharedPreferences.getString(string2, string3);
        }
        catch (Throwable var4_5) {
            return string3;
        }
    }
}

