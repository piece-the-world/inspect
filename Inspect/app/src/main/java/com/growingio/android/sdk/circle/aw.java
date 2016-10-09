/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.os.AsyncTask
 */
package com.growingio.android.sdk.circle;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.AsyncTask;
import com.growingio.android.sdk.circle.ax;
import com.growingio.android.sdk.collection.c;
import java.io.File;
import java.util.concurrent.Executor;

public class aw {
    private static aw a;
    private String b;
    private boolean c = false;
    private AsyncTask d;
    private Context e = c.k().j();

    private aw() {
        this.b = this.e.getFilesDir().toString();
    }

    public static aw a() {
        if (a == null) {
            a = new aw();
        }
        return a;
    }

    public boolean b() {
        return this.c;
    }

    @TargetApi(value=11)
    public void c() {
        if (this.d == null) {
            this.d = new ax(this);
            this.d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
        }
    }

    static /* synthetic */ String a(aw aw2) {
        return aw2.b;
    }

    static /* synthetic */ Context b(aw aw2) {
        return aw2.e;
    }

    static /* synthetic */ AsyncTask a(aw aw2, AsyncTask asyncTask) {
        aw2.d = asyncTask;
        return aw2.d;
    }

    static /* synthetic */ boolean c(aw aw2) {
        return aw2.c;
    }

    static /* synthetic */ boolean a(aw aw2, boolean bl2) {
        aw2.c = bl2;
        return aw2.c;
    }
}

