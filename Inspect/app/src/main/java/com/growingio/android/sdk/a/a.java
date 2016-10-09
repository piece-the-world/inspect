/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Pair
 */
package com.growingio.android.sdk.a;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.utils.e;
import java.net.URLEncoder;

public class a
extends AsyncTask {
    protected /* varargs */ Void a(Void ... arrvoid) {
        try {
            c c2 = c.k();
            String string = "https://t.growingio.com/app/" + c2.c() + "/android/devices?u=" + c2.l() + "&dm=" + URLEncoder.encode(new StringBuilder().append(Build.BRAND).append(" ").append(Build.MODEL).toString(), "UTF-8") + "&osv=" + URLEncoder.encode(new StringBuilder().append("Android ").append(Build.VERSION.RELEASE).toString(), "UTF-8") + "&d=" + c2.b();
            int n2 = 0;
            while (n2++ < 3) {
                com.growingio.android.sdk.utils.c c3 = new e().a(string).a();
                if ((Integer)c3.b().first == 200) {
                    GConfig.q().C();
                    return null;
                }
                Thread.sleep(5000);
            }
        }
        catch (Exception var2_3) {
            var2_3.printStackTrace();
        }
        return null;
    }

    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
        return this.a((Void[])arrobject);
    }
}

