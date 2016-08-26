/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.SQLException
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDiskIOException
 *  android.os.Handler
 *  android.util.Log
 *  android.util.Pair
 */
package com.growingio.android.sdk.collection;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDiskIOException;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.ad;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.collection.g;
import com.growingio.android.sdk.collection.i;
import com.growingio.android.sdk.collection.j;
import com.growingio.android.sdk.collection.m;
import com.growingio.android.sdk.collection.q;
import com.growingio.android.sdk.utils.b;
import java.util.LinkedList;

class f {
    private final i a;
    private static f b = null;
    private static final Object c = new Object();
    private static final String d = "CREATE TABLE " + j.a.a() + " (" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "eventType" + " STRING NOT NULL," + "data" + " STRING NOT NULL," + "createdAt" + " INTEGER NOT NULL," + "instant" + " INTEGER NOT NULL DEFAULT 0);" + "CREATE INDEX IF NOT EXISTS instant_idx ON " + j.a.a() + " (" + "instant" + ");" + "CREATE INDEX IF NOT EXISTS time_idx ON " + j.a.a() + " (" + "createdAt" + ");";
    private static final String e = "ALTER TABLE " + j.a.a() + " ADD COLUMN " + "instant" + " BOOLEAN DEFAULT 0;" + "CREATE INDEX IF NOT EXISTS instant_idx ON " + (Object)((Object)j.a) + " (" + "instant" + ");" + "DROP INDEX time_idx;";
    private static final String f = "UPDATE " + (Object)((Object)j.a) + " SET " + "instant" + " = 1 WHERE " + "eventType" + " != 'imp';";
    private static final String g = "DROP TABLE IF EXISTS " + j.a.a();
    private Runnable h;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void a(Context context) {
        if (b != null) {
            return;
        }
        Object object = c;
        synchronized (object) {
            b = new f(context);
        }
    }

    static f a() {
        return b;
    }

    f(Context context) {
        this.h = new g(this);
        this.a = new i(this, context);
    }

    private void f() {
        q q2 = q.d();
        if (q2 != null) {
            q2.b().removeCallbacks(this.h);
            q2.b().postDelayed(this.h, 20000);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(String string, boolean bl2, String string2) {
        Object object;
        if (GConfig.a) {
            Log.w((String)"GIO.DBAdapter", (String)("save " + (bl2 ? "instant" : "non-instant") + " Message: " + string2));
        }
        if (GConfig.o().i()) {
            object = new b(c.h().g(), "AutoTestLog");
            object.a(string2);
        }
        object = c;
        synchronized (object) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("eventType", string);
                contentValues.put("data", string2);
                contentValues.put("createdAt", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("instant", Boolean.valueOf(bl2));
                if (-1 == sQLiteDatabase.insert(j.a.a(), null, contentValues)) {
                    m.a("dbw");
                }
            }
            catch (Exception var6_7) {
                m.a("dbo");
            }
            finally {
                if (sQLiteDatabase != null) {
                    this.f();
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(long l2) {
        Object object = c;
        synchronized (object) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
                int n2 = sQLiteDatabase.delete(j.a.a(), "createdAt <= ?", new String[]{String.valueOf(l2)});
                m.a("delete", n2);
            }
            catch (SQLiteDiskIOException var5_5) {
                m.a("dbioc");
            }
            catch (SQLException var5_6) {
                m.a("dbo");
            }
            finally {
                if (sQLiteDatabase != null) {
                    this.f();
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    long a(String string, String[] arrstring) {
        Object object = c;
        synchronized (object) {
            int n2;
            SQLiteDatabase sQLiteDatabase = null;
            n2 = 0;
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
                n2 = sQLiteDatabase.delete(j.a.a(), string, arrstring);
            }
            catch (SQLiteDiskIOException var6_6) {
                m.a("dbioc");
            }
            catch (SQLException var6_7) {
                m.a("dboc");
            }
            catch (Exception var6_8) {
                m.a(var6_8.getClass().getSimpleName());
                if (GConfig.a) {
                    var6_8.printStackTrace();
                }
            }
            finally {
                if (sQLiteDatabase != null) {
                    this.f();
                }
            }
            return n2;
        }
    }

    Pair a(ad ad2) {
        switch (ad2) {
            case a: {
                return this.b(String.format("SELECT _id, %s FROM %s WHERE %s = '%s' ORDER BY _id LIMIT 50 ", new Object[]{"data", j.a, "eventType", "cstm"}), null);
            }
            case b: {
                return this.b(String.format("SELECT _id, %s FROM %s WHERE %s = '%s' OR %s = '%s' ORDER BY _id LIMIT 50 ", new Object[]{"data", j.a, "eventType", "page", "eventType", "vst"}), null);
            }
            case c: {
                return this.b(String.format("SELECT _id, %s FROM %s WHERE %s = 1 AND ( %s = '%s' OR %s = '%s') ORDER BY _id LIMIT 50 ", new Object[]{"data", j.a, "instant", "eventType", "clck", "eventType", "imp"}), null);
            }
            case d: {
                return this.b(String.format("SELECT _id, %s FROM %s WHERE %s = 0 AND ( %s = '%s' OR %s = '%s') ORDER BY _id LIMIT 50 ", new Object[]{"data", j.a, "instant", "eventType", "clck", "eventType", "imp"}), null);
            }
        }
        return null;
    }

    long a(ad ad2, String string) {
        switch (ad2) {
            case a: {
                return this.a(String.format("_id <= ? AND %s = ?", "eventType"), new String[]{string, "cstm"});
            }
            case b: {
                return this.a(String.format("_id <= ? AND (%s = ? OR %s = ?)", "eventType", "eventType"), new String[]{string, "page", "vst"});
            }
            case c: {
                return this.a(String.format("_id <= ? AND %s = 1 AND (%s = ? OR %s = ?)", "instant", "eventType", "eventType"), new String[]{string, "imp", "clck"});
            }
            case d: {
                return this.a(String.format("_id <= ? AND %s = 0 AND (%s = ? OR %s = ?)", "instant", "eventType", "eventType"), new String[]{string, "imp", "clck"});
            }
        }
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Pair b(String string, String[] arrstring) {
        Object object = c;
        synchronized (object) {
            SQLiteDatabase sQLiteDatabase = this.a.getReadableDatabase();
            Cursor cursor = sQLiteDatabase.rawQuery(string, arrstring);
            LinkedList<String> linkedList = new LinkedList<String>();
            String string2 = null;
            while (cursor.moveToNext()) {
                if (cursor.isLast()) {
                    string2 = cursor.getString(cursor.getColumnIndex("_id"));
                }
                linkedList.add(cursor.getString(cursor.getColumnIndex("data")));
            }
            cursor.close();
            this.f();
            if (linkedList.size() > 0 && string2 != null) {
                return new Pair((Object)string2, linkedList);
            }
            return null;
        }
    }

    static /* synthetic */ String b() {
        return d;
    }

    static /* synthetic */ String c() {
        return e;
    }

    static /* synthetic */ String d() {
        return f;
    }

    static /* synthetic */ String e() {
        return g;
    }

    static /* synthetic */ i a(f f2) {
        return f2.a;
    }
}

