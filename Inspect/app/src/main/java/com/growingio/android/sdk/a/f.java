/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 */
package com.growingio.android.sdk.a;

import android.os.AsyncTask;
import com.growingio.android.sdk.a.d;
import com.growingio.android.sdk.a.e;
import java.util.Collection;
import java.util.List;

class f
extends AsyncTask {
    final /* synthetic */ e a;

    f(e e2) {
        this.a = e2;
    }

    protected /* varargs */ List a(Void ... arrvoid) {
        return new d().b();
    }

    protected void a(List list) {
        super.onPostExecute((Object)list);
        e.a(this.a).clear();
        e.a(this.a).addAll(list);
        e.a(this.a, true);
        e.b(this.a, false);
        if (e.b(this.a) != null) {
            e.b(this.a).a();
            e.a(this.a, null);
        }
    }

    protected /* synthetic */ void onPostExecute(Object object) {
        this.a((List)object);
    }

    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
        return this.a((Void[])arrobject);
    }
}

