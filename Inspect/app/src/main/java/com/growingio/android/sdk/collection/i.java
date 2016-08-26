/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteOpenHelper
 */
package com.growingio.android.sdk.collection;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.growingio.android.sdk.collection.f;

class i
extends SQLiteOpenHelper {
    final /* synthetic */ f a;

    i(f f2, Context context) {
        this.a = f2;
        super(context, com.growingio.android.sdk.utils.i.b(context) + "growing.db", null, 3);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f.b());
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
        if (n2 == 2) {
            sQLiteDatabase.execSQL(f.c());
            sQLiteDatabase.execSQL(f.d());
            return;
        }
        sQLiteDatabase.execSQL(f.e());
        this.onCreate(sQLiteDatabase);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
        this.onUpgrade(sQLiteDatabase, n2, n3);
    }
}

