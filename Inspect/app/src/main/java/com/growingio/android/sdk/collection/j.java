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
import com.growingio.android.sdk.collection.g;

class j
extends SQLiteOpenHelper {
    final /* synthetic */ g a;

    j(g g2, Context context) {
        this.a = g2;
        super(context, com.growingio.android.sdk.utils.j.b(context) + "growing.db", null, 3);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(g.b());
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion == 2) {
            db.execSQL(g.c());
            db.execSQL(g.d());
            return;
        }
        db.execSQL(g.e());
        this.onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        this.onUpgrade(db, oldVersion, newVersion);
    }
}

