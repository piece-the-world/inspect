/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.DatabaseUtils
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.provider.BaseColumns
 */
package com.tendcloud.tenddata;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.provider.BaseColumns;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.cs;
import com.tendcloud.tenddata.dt;
import com.tendcloud.tenddata.dy;
import com.tendcloud.tenddata.ee;
import com.tendcloud.tenddata.en;
import com.tendcloud.tenddata.fu;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class eh
extends dt {
    static final String a = "TDtcagent.db";
    private static volatile eh b = null;
    private static final int c = 6;
    private static final String d = "10";
    private static SQLiteDatabase e;
    private static int f;
    private final int g = 1;
    private final int h = 2;
    private final int i = 3;
    private static final int j = 8192000;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static eh f() {
        if (b != null) return b;
        reference var0 = eh.class;
        synchronized (eh.class) {
            if (b != null) return b;
            {
                b = new eh();
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return b;
        }
    }

    private eh() {
    }

    @Override
    void a() {
        this.i();
    }

    void a(Context context) {
        if (ab.mContext == null && context != null) {
            ab.mContext = context;
        }
        this.i();
    }

    @Override
    void c() {
        this.b();
    }

    @Override
    void b() {
        this.l();
    }

    boolean g() {
        return e != null && e.isOpen();
    }

    private synchronized void i() {
        try {
            if (ab.mContext != null) {
                if (e == null) {
                    File file = new File(ab.mContext.getFilesDir(), "TDtcagent.db");
                    boolean bl2 = file.exists();
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    e = SQLiteDatabase.openOrCreateDatabase((File)file, (SQLiteDatabase.CursorFactory)null);
                    if (file.length() > 6144000) {
                        fu.f = false;
                        if (file.length() > 8089600) {
                            eh.j();
                            this.k();
                            fu.f = true;
                        }
                    }
                    long l2 = e.setMaximumSize(8192000);
                    f = 1;
                    if (!bl2) {
                        this.k();
                    } else {
                        int n2 = e.getVersion();
                        if (6 > n2) {
                            eh.j();
                            this.k();
                        }
                    }
                } else {
                    ++f;
                }
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
    }

    private static void j() {
        e.setVersion(6);
        d.b(e);
        a.b(e);
        b.b(e);
        c.b(e);
    }

    private void k() {
        e.setVersion(6);
        d.a(e);
        a.a(e);
        b.a(e);
        c.a(e);
    }

    void h() {
        try {
            this.l();
            File file = new File(ab.mContext.getFilesDir(), "TDtcagent.db");
            if (file.exists()) {
                if (Build.VERSION.SDK_INT >= 16) {
                    SQLiteDatabase.deleteDatabase((File)file);
                } else {
                    file.delete();
                }
            }
        }
        catch (Throwable var1_2) {
            var1_2.printStackTrace();
        }
    }

    private synchronized void l() {
        --f;
        if ((eh.f = Math.max(0, f)) == 0 && e != null) {
            e.close();
            e = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private synchronized long a(String string, ContentValues contentValues, String string2, String[] arrstring, int n2) {
        long l2 = 0;
        if (cs.b(string)) {
            return l2;
        }
        e.beginTransaction();
        try {
            switch (n2) {
                case 1: {
                    l2 = e.insert(string, null, contentValues);
                    break;
                }
                case 2: {
                    l2 = e.update(string, contentValues, string2, arrstring);
                    break;
                }
                case 3: {
                    l2 = e.delete(string, string2, arrstring);
                    break;
                }
            }
            e.setTransactionSuccessful();
        }
        catch (Throwable var8_7) {}
        finally {
            e.endTransaction();
        }
        return l2;
    }

    @Override
    synchronized long a(String string, long l2, long l3, int n2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("session_id", dy.a(string));
        contentValues.put("start_time", dy.a(String.valueOf(l2)));
        contentValues.put("duration", dy.a(String.valueOf(0)));
        contentValues.put("is_launch", dy.a(String.valueOf(0)));
        contentValues.put("interval", dy.a(String.valueOf(l3)));
        contentValues.put("is_connected", dy.a(String.valueOf(n2)));
        return this.a("session", contentValues, null, null, 1);
    }

    @Override
    synchronized long a(String string) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_launch", dy.a(String.valueOf(2)));
        return this.a("session", contentValues, "session_id=?", new String[]{dy.a(string)}, 2);
    }

    @Override
    synchronized long a(String string, int n2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("duration", dy.a(String.valueOf(n2)));
        return this.a("session", contentValues, "session_id=?", new String[]{dy.a(string)}, 2);
    }

    @Override
    synchronized long b(String string) {
        return this.a("session", null, "session_id=?", new String[]{dy.a(string)}, 3);
    }

    @Override
    synchronized long d() {
        return DatabaseUtils.queryNumEntries((SQLiteDatabase)e, (String)"session");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    synchronized List e() {
        ArrayList<en.j> arrayList;
        block11 : {
            arrayList = new ArrayList<en.j>();
            Cursor cursor = null;
            try {
                cursor = e.query("session", d.h, null, null, null, null, "_id", "10");
                if (!cursor.moveToFirst()) break block11;
                while (!cursor.isAfterLast()) {
                    en.j j2 = new en.j();
                    try {
                        j2.a = dy.b(cursor.getString(1));
                        j2.b = Long.parseLong(dy.b(cursor.getString(2)));
                        j2.g = Integer.parseInt(dy.b(cursor.getString(3)));
                        String string = dy.b(cursor.getString(4));
                        j2.c = string != null && !string.equals("null") && Integer.parseInt(string) == 0 ? 1 : (0 != j2.g ? 3 : 2);
                    }
                    catch (Throwable var4_6) {
                        cursor.moveToNext();
                        continue;
                    }
                    if (1 == j2.c) {
                        j2.j = Integer.parseInt(dy.b(cursor.getString(5)));
                        if (j2.j < 0) {
                            j2.j = 0;
                        }
                        j2.g = j2.j / 1000;
                    }
                    j2.k = Integer.parseInt(dy.b(cursor.getString(6)));
                    j2.l = ee.m();
                    arrayList.add(j2);
                    cursor.moveToNext();
                }
            }
            catch (Throwable var3_4) {}
            finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return arrayList;
    }

    @Override
    synchronized long a(String string, String string2, long l2, int n2, String string3, long l3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("session_id", dy.a(string));
        contentValues.put("name", dy.a(string2));
        contentValues.put("start_time", dy.a(String.valueOf(l2)));
        contentValues.put("duration", dy.a(String.valueOf(n2)));
        contentValues.put("refer", dy.a(string3));
        contentValues.put("realtime", dy.a(String.valueOf(l3)));
        return this.a("activity", contentValues, null, null, 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    synchronized long e(long l2) {
        Cursor cursor = null;
        try {
            cursor = e.query("activity", a.h, "_id=?", new String[]{String.valueOf(l2)}, null, null, "_id");
            if (cursor.moveToFirst() && !cursor.isAfterLast()) {
                long l3 = Long.parseLong(dy.b(cursor.getString(6)));
                return l3;
            }
        }
        catch (Throwable var4_4) {}
        finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return 0;
    }

    @Override
    synchronized long a(long l2, long l3) {
        long l4 = this.e(l2);
        long l5 = (l3 - l4) / 1000;
        ContentValues contentValues = new ContentValues();
        contentValues.put("duration", dy.a(String.valueOf(l5)));
        return this.a("activity", contentValues, "_id=?", new String[]{String.valueOf(l2)}, 2);
    }

    @Override
    synchronized long a(long l2) {
        return this.a("activity", null, "_id<=? AND duration !=? ", new String[]{String.valueOf(l2), dy.a("0")}, 3);
    }

    @Override
    synchronized long c(String string) {
        return this.a("activity", null, "session_id=? ", new String[]{dy.a(string)}, 3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    synchronized List a(String string, long l2) {
        ArrayList<en.a> arrayList;
        block9 : {
            arrayList = new ArrayList<en.a>();
            Cursor cursor = null;
            try {
                cursor = e.query("activity", a.h, "session_id=? AND duration !=? ", new String[]{dy.a(string), dy.a("0")}, null, null, "_id");
                if (!cursor.moveToFirst()) break block9;
                while (!cursor.isAfterLast()) {
                    en.a a2 = new en.a();
                    try {
                        a2.a = dy.b(cursor.getString(1));
                        a2.b = Long.parseLong(dy.b(cursor.getString(2)));
                        a2.c = Integer.parseInt(dy.b(cursor.getString(3)));
                        a2.d = dy.b(cursor.getString(5));
                    }
                    catch (Throwable var7_7) {
                        cursor.moveToNext();
                        continue;
                    }
                    arrayList.add(a2);
                    cursor.moveToNext();
                }
            }
            catch (Throwable var6_6) {}
            finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return arrayList;
    }

    @Override
    synchronized long a(String string, String string2, String string3, long l2, Map map) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_id", dy.a(string2));
        contentValues.put("event_label", dy.a(string3));
        contentValues.put("session_id", dy.a(string));
        contentValues.put("occurtime", dy.a(String.valueOf(l2)));
        contentValues.put("paramap", this.a(map, true));
        return this.a("app_event", contentValues, null, null, 1);
    }

    @Override
    synchronized long b(long l2) {
        return this.a("app_event", null, "_id<=? ", new String[]{String.valueOf(l2)}, 3);
    }

    @Override
    synchronized long d(String string) {
        return this.a("app_event", null, "session_id=? ", new String[]{dy.a(string)}, 3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    synchronized List b(String string, long l2) {
        ArrayList<en.b> arrayList;
        block9 : {
            arrayList = new ArrayList<en.b>();
            Cursor cursor = null;
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SELECT COUNT(_id), MAX(occurtime), event_id, event_label, paramap from app_event where session_id = ? group by event_id, event_label, paramap");
                cursor = e.rawQuery(stringBuilder.toString(), new String[]{dy.a(string)});
                if (!cursor.moveToFirst()) break block9;
                while (!cursor.isAfterLast()) {
                    en.b b2 = new en.b();
                    try {
                        b2.c = cursor.getInt(0);
                        b2.d = Long.parseLong(dy.b(cursor.getString(1)));
                        b2.a = dy.b(cursor.getString(2));
                        b2.b = dy.b(cursor.getString(3));
                        b2.e = null;
                        b2.e = this.a(cursor.getBlob(4));
                    }
                    catch (Throwable var8_8) {
                        cursor.moveToNext();
                        continue;
                    }
                    arrayList.add(b2);
                    cursor.moveToNext();
                }
            }
            catch (Throwable var6_6) {}
            finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return arrayList;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    synchronized long a(List list) {
        long l2;
        l2 = 0;
        int n2 = list.size();
        if (0 == n2) {
            return 0;
        }
        try {
            for (int i2 = n2 - 1; i2 >= 0; --i2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SELECT MAX(_id) from activity where duration != 0 and session_id =?");
                Cursor cursor = null;
                try {
                    cursor = e.rawQuery(stringBuilder.toString(), new String[]{dy.a(((en.j)list.get((int)i2)).a)});
                    if (!cursor.moveToFirst() || (l2 = cursor.getLong(0)) == 0) continue;
                    break;
                }
                finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        }
        catch (Throwable var5_5) {
            // empty catch block
        }
        return l2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    synchronized long e(String string) {
        Cursor cursor = null;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SELECT MAX(_id) from ");
            stringBuilder.append(string);
            cursor = e.rawQuery(stringBuilder.toString(), null);
            if (cursor.moveToFirst() && !cursor.isAfterLast()) {
                long l2 = cursor.getLong(0);
                return l2;
            }
        }
        catch (Throwable var3_4) {}
        finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    synchronized long b(List list) {
        long l2 = 0;
        int n2 = list.size();
        if (0 == n2) {
            return 0;
        }
        try {
            for (int i2 = n2 - 1; i2 >= 0; --i2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SELECT MAX(_id) from app_event where session_id =?");
                Cursor cursor = null;
                try {
                    cursor = e.rawQuery(stringBuilder.toString(), new String[]{dy.a(((en.j)list.get((int)i2)).a)});
                    if (!cursor.moveToFirst() || (l2 = cursor.getLong(0)) == 0) continue;
                    long l3 = l2;
                    return l3;
                }
                finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
            return 0;
        }
        catch (Throwable var5_5) {
            // empty catch block
        }
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    synchronized long a(String string, en.c c2, StringBuffer stringBuffer) {
        block13 : {
            Cursor cursor = null;
            try {
                cursor = e.query("error_report", c.f, null, null, null, null, "_id");
                String[] arrstring = string.split("\r\n");
                if (arrstring.length < 3) {
                    long l2 = 0;
                    return l2;
                }
                String string2 = arrstring[0] + "\r\n" + arrstring[1] + "\r\n" + arrstring[2];
                stringBuffer.append(cs.c(string2));
                if (!cursor.moveToFirst()) break block13;
                while (!cursor.isAfterLast()) {
                    try {
                        c2.a = Long.parseLong(dy.b(cursor.getString(1)));
                        c2.d = cursor.getBlob(2);
                        c2.b = Integer.parseInt(dy.b(cursor.getString(3)));
                    }
                    catch (Throwable var7_9) {
                        cursor.moveToNext();
                        continue;
                    }
                    String string3 = new String(c2.d, "UTF-8");
                    if (string3.length() < string2.length() || (arrstring = string3.split("\r\n")).length < 3) continue;
                    string3 = arrstring[0] + "\r\n" + arrstring[1] + "\r\n" + arrstring[2];
                    if (string3.equals(string2)) {
                        long l3 = cursor.getLong(0);
                        return l3;
                    }
                    cursor.moveToNext();
                }
            }
            catch (Throwable var5_6) {}
            finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return 0;
    }

    @Override
    synchronized long a(long l2, String string) {
        long l3 = 0;
        ContentValues contentValues = new ContentValues();
        contentValues.put("error_time", dy.a(String.valueOf(l2)));
        en.c c2 = new en.c();
        StringBuffer stringBuffer = new StringBuffer("");
        try {
            long l4 = this.a(string, c2, stringBuffer);
            if (0 == l4) {
                byte[] arrby = string.getBytes("UTF-8");
                contentValues.put("message", arrby);
                contentValues.put("repeat", dy.a(String.valueOf(1)));
                contentValues.put("shorthashcode", dy.a(stringBuffer.toString()));
                l3 = this.a("error_report", contentValues, null, null, 1);
            } else {
                contentValues.put("repeat", dy.a(String.valueOf(c2.b + 1)));
                l3 = this.a("error_report", contentValues, "_id=?", new String[]{String.valueOf(l4)}, 2);
            }
        }
        catch (Throwable var9_8) {
            // empty catch block
        }
        return l3;
    }

    @Override
    synchronized long c(long l2) {
        return this.a("error_report", null, "_id<=?", new String[]{String.valueOf(l2)}, 3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    synchronized List d(long l2) {
        ArrayList<en.i> arrayList;
        block9 : {
            arrayList = new ArrayList<en.i>();
            Cursor cursor = null;
            try {
                String string;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SELECT error_time,message,repeat, shorthashcode from error_report where _id<=?");
                cursor = e.rawQuery(stringBuilder.toString(), new String[]{String.valueOf(l2)});
                if (!cursor.moveToFirst()) break block9;
                String string2 = string = ab.mContext != null ? String.valueOf(ee.n()) : "";
                while (!cursor.isAfterLast()) {
                    en.i i2 = new en.i();
                    try {
                        i2.a = 3;
                        en.c c2 = new en.c();
                        c2.a = Long.parseLong(dy.b(cursor.getString(0)));
                        c2.d = cursor.getBlob(1);
                        c2.b = Integer.parseInt(dy.b(cursor.getString(2)));
                        c2.e = dy.b(cursor.getString(3));
                        c2.c = string;
                        i2.d = c2;
                    }
                    catch (Throwable var8_9) {
                        cursor.moveToNext();
                        continue;
                    }
                    arrayList.add(i2);
                    cursor.moveToNext();
                }
            }
            catch (Throwable var5_5) {}
            finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return arrayList;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private byte[] a(Map map, boolean bl2) {
        if (null == map || map.size() == 0) {
            return null;
        }
        int n2 = map.size() > 50 ? 50 : map.size();
        ByteArrayOutputStream byteArrayOutputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            byte[] arrby;
            byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(n2);
            int n3 = 0;
            byte[] arrby2 = map.entrySet().iterator();
            while (arrby2.hasNext()) {
                arrby = arrby2.next();
                dataOutputStream.writeUTF((String)arrby.getKey());
                Object v2 = arrby.getValue();
                if (v2 instanceof Number) {
                    dataOutputStream.writeInt(66);
                    dataOutputStream.writeDouble(((Number)v2).doubleValue());
                } else {
                    dataOutputStream.writeInt(88);
                    if (bl2) {
                        dataOutputStream.writeUTF(cs.a(v2.toString()));
                    } else {
                        dataOutputStream.writeUTF(v2.toString());
                    }
                }
                if (++n3 != 50) continue;
                break;
            }
            arrby = arrby2 = byteArrayOutputStream.toByteArray();
            return arrby;
        }
        catch (Throwable var6_7) {
            byte[] arrby = null;
            return arrby;
        }
        finally {
            this.a(byteArrayOutputStream);
            this.a(dataOutputStream);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Map a(byte[] arrby) {
        if (arrby == null || arrby.length == 0) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = null;
        DataInputStream dataInputStream = null;
        try {
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            byteArrayInputStream = new ByteArrayInputStream(arrby);
            dataInputStream = new DataInputStream(byteArrayInputStream);
            int n2 = dataInputStream.readInt();
            for (int i2 = 0; i2 < n2; ++i2) {
                Object object;
                String string = dataInputStream.readUTF();
                int n3 = dataInputStream.readInt();
                if (n3 == 66) {
                    object = dataInputStream.readDouble();
                } else if (n3 == 88) {
                    object = dataInputStream.readUTF();
                } else {
                    Map map = null;
                    return map;
                }
                hashMap.put(string, object);
            }
            HashMap<String, Object> hashMap2 = hashMap;
            return hashMap2;
        }
        catch (Throwable var4_5) {
            Map map = null;
            return map;
        }
        finally {
            this.a(byteArrayInputStream);
            this.a(dataInputStream);
        }
    }

    private void a(Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        }
        catch (Throwable var2_2) {
            // empty catch block
        }
    }

    static final class c
    implements BaseColumns {
        static final String a = "error_time";
        static final String b = "message";
        static final String c = "repeat";
        static final String d = "shorthashcode";
        static final String e = "error_report";
        static final String[] f = new String[]{"_id", "error_time", "message", "repeat", "shorthashcode"};

        c() {
        }

        static final void a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE error_report (_id INTEGER PRIMARY KEY autoincrement,error_time LONG,message BLOB,repeat INTERGER,shorthashcode TEXT)");
        }

        static final void b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS error_report");
        }
    }

    static final class b
    implements BaseColumns {
        static final String a = "event_id";
        static final String b = "event_label";
        static final String c = "session_id";
        static final String d = "occurtime";
        static final String e = "paramap";
        static final String f = "app_event";
        static final String[] g = new String[]{"_id", "event_id", "event_label", "session_id", "occurtime", "paramap"};

        b() {
        }

        static final void a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE app_event (_id INTEGER PRIMARY KEY autoincrement,event_id TEXT,event_label TEXT,session_id TEXT,occurtime LONG,paramap BLOB)");
        }

        static final void b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS app_event");
        }
    }

    static final class a
    implements BaseColumns {
        static final String a = "name";
        static final String b = "start_time";
        static final String c = "duration";
        static final String d = "session_id";
        static final String e = "refer";
        static final String f = "realtime";
        static final String g = "activity";
        static final String[] h = new String[]{"_id", "name", "start_time", "duration", "session_id", "refer", "realtime"};

        a() {
        }

        static final void a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE activity (_id INTEGER PRIMARY KEY autoincrement,name TEXT,start_time LONG,duration INTEGER,session_id TEXT,refer TEXT,realtime LONG)");
        }

        static final void b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS activity");
        }
    }

    static final class d
    implements BaseColumns {
        static final String a = "session_id";
        static final String b = "start_time";
        static final String c = "duration";
        static final String d = "is_launch";
        static final String e = "interval";
        static final String f = "is_connected";
        static final String g = "session";
        static final String[] h = new String[]{"_id", "session_id", "start_time", "duration", "is_launch", "interval", "is_connected"};

        d() {
        }

        static final void a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE session (_id INTEGER PRIMARY KEY autoincrement,session_id TEXT,start_time LONG,duration INTEGER,is_launch INTEGER,interval LONG, is_connected INTEGER)");
        }

        static final void b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS session");
        }
    }

}

