/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  android.util.Log
 *  org.json.JSONArray
 */
package com.growingio.android.sdk.circle;

import android.os.AsyncTask;
import android.util.Log;
import com.growingio.android.sdk.a.d;
import com.growingio.android.sdk.b.f;
import com.growingio.android.sdk.circle.ar;
import com.growingio.android.sdk.collection.GConfig;
import java.lang.ref.WeakReference;
import org.json.JSONArray;

class bs
extends AsyncTask {
    private WeakReference a;

    public bs(ar ar2) {
        this.a = new WeakReference<ar>(ar2);
    }

    protected /* varargs */ JSONArray a(f ... arrf) {
        f f2 = arrf[0];
        if (GConfig.a) {
            Log.i((String)"GrowingIO.EditWindow", (String)("fetch realtime data for " + f2));
        }
        return new d().b(f2);
    }

    protected void a(JSONArray jSONArray) {
        ar ar2;
        super.onPostExecute((Object)jSONArray);
        if (!this.isCancelled() && (ar2 = (ar)((Object)this.a.get())) != null) {
            ar.a(ar2, jSONArray);
        }
    }

    protected /* synthetic */ void onPostExecute(Object object) {
        this.a((JSONArray)object);
    }

    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
        return this.a((f[])arrobject);
    }
}

