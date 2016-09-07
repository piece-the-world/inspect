/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.tendcloud.tenddata;

import android.util.Log;
import com.tendcloud.tenddata.az;
import java.io.PrintStream;

public class bh {
    private static boolean a = false;

    public static void setIsShow(boolean bl2) {
        a = bl2;
    }

    public static void a(String string, String string2) {
        if (a && !az.a(string2)) {
            Log.d((String)string, (String)string2);
            System.out.println(string2);
        }
    }

    public static void b(String string, String string2) {
        if (a && !az.a(string2)) {
            Log.e((String)string, (String)string2);
            System.err.println(string2);
        }
    }

    public static void a(String string, String string2, Throwable throwable) {
        if (a && !az.a(string2)) {
            Log.e((String)string, (String)string2, (Throwable)throwable);
            System.err.println(string2);
        }
    }

    public static void c(String string, String string2) {
        if (!az.a(string2)) {
            Log.e((String)string, (String)string2);
        }
    }

    public static void d(String string, String string2) {
        if (a && !az.a(string2)) {
            Log.i((String)string, (String)string2);
            System.out.println(string2);
        }
    }

    public static void e(String string, String string2) {
        if (a && !az.a(string2)) {
            Log.w((String)string, (String)string2);
            System.err.println(string2);
        }
    }
}

