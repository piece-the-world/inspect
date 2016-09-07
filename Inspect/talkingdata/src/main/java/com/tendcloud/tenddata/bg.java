/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteOpenHelper
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tendcloud.tenddata.az;
import com.tendcloud.tenddata.bh;
import java.util.ArrayList;
import java.util.List;

public final class bg {
    private static final String a = bg.class.getName();
    private static a b;
    private static final String c = "create table IF NOT EXISTS kv (k text primary key, v text)";
    private static final String d = "insert into kv values(?,?)";
    private static final String e = "update kv set v=? where k=?";
    private static final String f = "delete from kv where k=?";
    private static final String g = "select k from kv where k like ?";
    private static final String h = "select v from kv where k like ?";
    private static final String i = "select k from kv where v=?";
    private static final String j = "select v from kv where k=?";
    private static final String k = "create table IF NOT EXISTS msg (msg_id text primary key, ct INTEGER)";
    private static final String l = "insert into msg values(?,?)";
    private static final String m = "update msg set ct=? where msg_id=?";
    private static final String n = "delete from msg where ct<=?";
    private static final String o = "select ct from msg where msg_id=?";
    private static final String p = "select ct from msg order by ct asc limit 1 offset 100";
    private static final String q = "select count(*) from msg";

    public static synchronized void init(Context context) {
        if (context != null && b == null) {
            b = new a(context);
        }
    }

    public static boolean a() {
        return b != null;
    }

    public static void b() {
        bg.f().close();
    }

    public static boolean a(String string, String string2) {
        if (string != null) {
            try {
                if (bg.e(string)) {
                    bg.f().getWritableDatabase().execSQL("update kv set v=? where k=?", (Object[])new String[]{string2, string});
                } else {
                    bg.f().getWritableDatabase().execSQL("insert into kv values(?,?)", (Object[])new String[]{string, string2});
                }
                return true;
            }
            catch (Exception var2_2) {
                bh.e(a, var2_2.getMessage());
            }
        }
        return false;
    }

    public static List a(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (string != null) {
            Cursor cursor = bg.f().getReadableDatabase().rawQuery("select k from kv where k like ?", new String[]{string});
            if (cursor.moveToFirst()) {
                while (!cursor.isAfterLast()) {
                    arrayList.add(cursor.getString(0));
                    cursor.moveToNext();
                }
            }
            cursor.close();
        }
        return arrayList;
    }

    public static List b(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (string != null) {
            Cursor cursor = bg.f().getReadableDatabase().rawQuery("select k from kv where v=?", new String[]{string});
            if (cursor.moveToFirst()) {
                while (!cursor.isAfterLast()) {
                    arrayList.add(cursor.getString(0));
                    cursor.moveToNext();
                }
            }
            cursor.close();
        }
        return arrayList;
    }

    public static List c(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (string != null) {
            Cursor cursor = bg.f().getReadableDatabase().rawQuery("select v from kv where k like ?", new String[]{string});
            if (cursor.moveToFirst()) {
                while (!cursor.isAfterLast()) {
                    arrayList.add(cursor.getString(0));
                    cursor.moveToNext();
                }
            }
            cursor.close();
        }
        return arrayList;
    }

    public static String d(String string) {
        String string2 = null;
        if (string != null) {
            Cursor cursor = bg.f().getReadableDatabase().rawQuery("select v from kv where k=?", new String[]{string});
            if (cursor.moveToFirst()) {
                string2 = cursor.getString(0);
            }
            cursor.close();
        }
        return string2;
    }

    public static boolean e(String string) {
        Cursor cursor = bg.f().getReadableDatabase().rawQuery("select v from kv where k=?", new String[]{string});
        boolean bl2 = cursor.moveToFirst();
        cursor.close();
        return bl2;
    }

    public static void delete(String string) {
        bg.f().getWritableDatabase().execSQL("delete from kv where k=?", (Object[])new String[]{string});
    }

    public static void deleteLike(String string) {
        if (string != null) {
            List list = bg.a(string);
            for (String string2 : list) {
                bg.delete(string2);
            }
        }
    }

    public static boolean f(String string) {
        if (string != null) {
            if (bg.c() >= 1000) {
                bg.d();
            }
            try {
                bg.f().getWritableDatabase().execSQL("insert into msg values(?,?)", new Object[]{string, System.currentTimeMillis()});
                return true;
            }
            catch (Exception var1_1) {
                bh.e(a, var1_1.getMessage());
            }
        }
        return false;
    }

    public static boolean g(String string) {
        boolean bl2 = false;
        if (az.a(string)) {
            return true;
        }
        try {
            Cursor cursor = bg.f().getReadableDatabase().rawQuery("select ct from msg where msg_id=?", new String[]{string});
            bl2 = cursor.moveToFirst();
            cursor.close();
        }
        catch (Throwable var2_3) {
            bh.b(a, var2_3.getMessage());
        }
        return bl2;
    }

    public static long c() {
        long l2 = 0;
        try {
            Cursor cursor = bg.f().getReadableDatabase().rawQuery("select count(*) from msg", null);
            cursor.moveToFirst();
            l2 = cursor.getLong(0);
            cursor.close();
        }
        catch (Throwable var2_2) {
            bh.b(a, var2_2.getMessage());
        }
        return l2;
    }

    public static void d() {
        long l2 = 0;
        Cursor cursor = bg.f().getReadableDatabase().rawQuery("select ct from msg order by ct asc limit 1 offset 100", null);
        if (cursor.moveToFirst()) {
            l2 = cursor.getLong(0);
            cursor.close();
        }
        if (l2 > 0) {
            bg.f().getWritableDatabase().execSQL("delete from msg where ct<=?", new Object[]{l2});
        }
    }

    private static a f() {
        if (b == null) {
            throw new RuntimeException("Err: invoke PushManager.startPushService to init mpush sdk");
        }
        return b;
    }

    static class a
    extends SQLiteOpenHelper {
        public a(Context context) {
            super(context, "mpush_app.db", null, 2);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("create table IF NOT EXISTS kv (k text primary key, v text)");
                sQLiteDatabase.execSQL("create table IF NOT EXISTS msg (msg_id text primary key, ct INTEGER)");
            }
            catch (Exception var2_2) {
                bh.b(a, var2_2.getMessage());
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
            if (n3 == 2) {
                sQLiteDatabase.execSQL("create table IF NOT EXISTS msg (msg_id text primary key, ct INTEGER)");
            }
        }
    }

}

