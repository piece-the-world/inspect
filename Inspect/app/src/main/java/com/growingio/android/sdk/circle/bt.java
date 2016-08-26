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
import com.growingio.android.sdk.a.d;
import com.growingio.android.sdk.b.f;
import com.growingio.android.sdk.circle.ar;
import java.lang.ref.WeakReference;

class bt
extends AsyncTask {
    private WeakReference a;

    public bt(ar ar2) {
        this.a = new WeakReference<ar>(ar2);
    }

    protected /* varargs */ Pair a(f ... arrf) {
        f f2 = arrf[0];
        return new d().a(f2);
    }

    protected void a(Pair pair) {
        ar ar2;
        super.onPostExecute((Object)pair);
        if (!this.isCancelled() && (ar2 = (ar)((Object)this.a.get())) != null) {
            ar.a(ar2, pair);
        }
    }

    protected /* synthetic */ void onPostExecute(Object object) {
        this.a((Pair)object);
    }

    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
        return this.a((f[])arrobject);
    }
}

