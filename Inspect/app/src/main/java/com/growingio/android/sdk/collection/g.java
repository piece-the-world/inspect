/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 */
package com.growingio.android.sdk.collection;

import android.database.sqlite.SQLiteDatabase;
import com.growingio.android.sdk.collection.f;

class g
implements Runnable {
    final /* synthetic */ f a;

    g(f f2) {
        this.a = f2;
    }

    @Override
    public void run() {
        try {
            SQLiteDatabase sQLiteDatabase = f.a(this.a).getReadableDatabase();
            sQLiteDatabase.close();
        }
        catch (Exception var1_2) {
            var1_2.printStackTrace();
        }
    }
}

