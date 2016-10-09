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
import com.growingio.android.sdk.a.e;
import com.growingio.android.sdk.circle.ai;

class av
extends AsyncTask {
    private String a;
    private ai b;

    av(ai ai2, String string) {
        this.a = string;
        this.b = ai2;
    }

    protected /* varargs */ Pair a(Void ... arrvoid) {
        return e.a().a(this.a);
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

