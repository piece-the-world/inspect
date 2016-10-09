/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 */
package com.growingio.android.sdk.collection;

import android.database.sqlite.SQLiteDatabase;
import com.growingio.android.sdk.collection.g;

class h
implements Runnable {
    final /* synthetic */ g a;

    h(g g2) {
        this.a = g2;
    }

    @Override
    public void run() {
        try {
            SQLiteDatabase sQLiteDatabase = g.a(this.a).getReadableDatabase();
            sQLiteDatabase.close();
        }
        catch (Exception var1_2) {
            var1_2.printStackTrace();
        }
    }
}

