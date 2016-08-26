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
import com.growingio.android.sdk.circle.ch;
import com.growingio.android.sdk.collection.c;
import java.io.File;
import java.util.concurrent.Executor;

public class cg {
    private static cg a;
    private String b;
    private boolean c = false;
    private AsyncTask d;
    private Context e = c.h().g();

    private cg() {
        this.b = this.e.getFilesDir().toString();
    }

    public static cg a() {
        if (a == null) {
            a = new cg();
        }
        return a;
    }

    public boolean b() {
        return this.c;
    }

    @TargetApi(value=11)
    public void c() {
        if (this.d == null) {
            this.d = new ch(this);
            this.d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
        }
    }

    static /* synthetic */ String a(cg cg2) {
        return cg2.b;
    }

    static /* synthetic */ Context b(cg cg2) {
        return cg2.e;
    }

    static /* synthetic */ AsyncTask a(cg cg2, AsyncTask asyncTask) {
        cg2.d = asyncTask;
        return cg2.d;
    }

    static /* synthetic */ boolean c(cg cg2) {
        return cg2.c;
    }

    static /* synthetic */ boolean a(cg cg2, boolean bl2) {
        cg2.c = bl2;
        return cg2.c;
    }
}

