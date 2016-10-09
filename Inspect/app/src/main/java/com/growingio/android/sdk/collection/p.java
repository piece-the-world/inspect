/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.growingio.android.sdk.collection;

import android.os.Handler;
import com.growingio.android.sdk.collection.m;
import com.growingio.android.sdk.collection.n;
import com.growingio.android.sdk.collection.o;
import com.growingio.android.sdk.collection.t;
import java.util.Map;
import java.util.Set;

class p
implements Runnable {
    private boolean b;
    final /* synthetic */ n a;

    private p(n n2) {
        this.a = n2;
        this.b = false;
    }

    private void a() {
        if (!this.b) {
            this.b = true;
            t.d().b().postDelayed((Runnable)this, 300000);
        }
    }

    private void b() {
        this.b = true;
        t.d().b().removeCallbacks((Runnable)this);
        t.d().b().post((Runnable)this);
    }

    @Override
    public void run() {
        Set set = n.a(this.a).entrySet();
        try {
            Object[] arrobject = set.toArray();
            int n2 = arrobject.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                Map.Entry entry = (Map.Entry)arrobject[i2];
                n.a(this.a, (m)entry.getValue());
            }
        }
        catch (Exception var2_3) {
            var2_3.printStackTrace();
        }
        this.b = false;
    }

    static /* synthetic */ void a(p p2) {
        p2.a();
    }

    static /* synthetic */ void b(p p2) {
        p2.b();
    }

    /* synthetic */ p(n n2, o o2) {
        this(n2);
    }
}

