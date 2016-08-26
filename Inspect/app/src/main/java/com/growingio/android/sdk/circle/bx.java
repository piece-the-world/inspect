/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  android.util.Pair
 */
package com.growingio.android.sdk.circle;

import android.os.AsyncTask;
import android.util.Pair;
import com.growingio.android.sdk.a.c;
import com.growingio.android.sdk.circle.bw;

class bx
extends AsyncTask {
    private String a;
    private bw b;

    bx(bw bw2, String string) {
        this.a = string;
        this.b = bw2;
    }

    protected /* varargs */ Pair a(Void ... arrvoid) {
        return c.a().a(this.a);
    }

    protected void a(Pair pair) {
        this.b.a(pair);
    }

    protected /* synthetic */ void onPostExecute(Object object) {
        this.a((Pair)object);
    }

    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
        return this.a((Void[])arrobject);
    }
}

