/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.text.TextUtils
 *  android.util.SparseArray
 */
package com.growingio.android.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;

public class h {
    private static SharedPreferences a;

    public static void a(Context context) {
        a = context.getSharedPreferences("growing_persist_data", 0);
    }

    public static void a(SparseArray sparseArray) {
        for (int i2 = 0; i2 < 10; ++i2) {
            String string = a.getString("cs" + i2, null);
            if (TextUtils.isEmpty((CharSequence)string)) continue;
            sparseArray.put(i2, (Object)string);
        }
    }

    public static void a(int n2) {
        a.edit().remove("cs" + n2).commit();
    }

    public static void a(int n2, String string) {
        a.edit().putString("cs" + n2, string).commit();
    }
}

