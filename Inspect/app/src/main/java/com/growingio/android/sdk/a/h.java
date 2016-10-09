/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 */
package com.growingio.android.sdk.a;

import android.os.AsyncTask;
import com.growingio.android.sdk.a.f;
import com.growingio.android.sdk.a.g;
import java.util.Collection;
import java.util.List;

class h
extends AsyncTask {
    final /* synthetic */ g a;

    h(g g2) {
        this.a = g2;
    }

    protected /* varargs */ List a(Void ... arrvoid) {
        return new f().b();
    }

    protected void a(List list) {
        super.onPostExecute((Object)list);
        g.a(this.a).clear();
        g.a(this.a).addAll(list);
        g.a(this.a, true);
        g.b(this.a, false);
        if (g.b(this.a) != null) {
            g.b(this.a).a();
            g.a(this.a, null);
        }
    }

    protected /* synthetic */ void onPostExecute(Object object) {
        this.a((List)object);
    }

    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
        return this.a((Void[])arrobject);
    }
}

