/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  android.util.Pair
 */
package com.growingio.android.sdk.collection;

import android.os.AsyncTask;
import android.util.Pair;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.VdsJsHelper;
import com.growingio.android.sdk.utils.c;
import com.growingio.android.sdk.utils.e;
import com.growingio.android.sdk.utils.j;
import java.io.IOException;

class ao
extends AsyncTask {
    final /* synthetic */ VdsJsHelper a;

    ao(VdsJsHelper vdsJsHelper) {
        this.a = vdsJsHelper;
    }

    protected /* varargs */ Void a(String ... arrstring) {
        long l2 = GConfig.q().y();
        try {
            c c2 = new e().a("https://assets.growingio.com/javascripts/vds_hybrid.min.js").a(l2).a();
            Pair pair = c2.b();
            if ((Integer)pair.first == 200) {
                long l3 = c2.c();
                if (l3 > l2) {
                    j.a((byte[])pair.second, arrstring[0]);
                }
                GConfig.q().b(l3);
            }
        }
        catch (IOException var4_4) {
            var4_4.printStackTrace();
        }
        return null;
    }

    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
        return this.a((String[])arrobject);
    }
}

