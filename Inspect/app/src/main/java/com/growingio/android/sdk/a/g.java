/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.os.AsyncTask
 *  android.text.TextUtils
 */
package com.growingio.android.sdk.a;

import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.growingio.android.sdk.a.h;
import com.growingio.android.sdk.a.i;
import com.growingio.android.sdk.b.f;
import com.growingio.android.sdk.collection.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class g {
    public static g a = new g();
    private final Object b = new Object();
    private i c;
    private boolean d = false;
    private boolean e = false;
    private List f = new ArrayList();

    public void a(i i2) {
        this.c = i2;
    }

    public boolean a() {
        return this.d;
    }

    public boolean b() {
        return this.e;
    }

    public static g c() {
        return a;
    }

    public List d() {
        return this.f;
    }

    private g() {
    }

    @TargetApi(value=11)
    public void e() {
        if (this.e || this.d) {
            return;
        }
        this.e = true;
        new h(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
    }

    public List f() {
        ArrayList<f> arrayList = new ArrayList<f>();
        String string = c.k().b() + "::";
        for (f f2 : this.f) {
            if (!f2.f.d.startsWith(string)) continue;
            f f3 = f2.a();
            int n2 = string.length();
            f3.f.d = f3.f.d.substring(n2);
            if (!TextUtils.isEmpty((CharSequence)f3.g.d) && f3.g.d.length() >= n2) {
                f3.g.d = f3.g.d.substring(n2);
            }
            if ((n2 = f3.f.b.indexOf("::")) > 0) {
                f3.f.b = f3.f.b.substring(n2 += "::".length());
                if (!TextUtils.isEmpty((CharSequence)f3.g.b) && f3.g.b.length() > n2) {
                    f3.g.b = f3.g.b.substring(n2);
                }
            }
            if (!TextUtils.isEmpty((CharSequence)f3.f.a)) {
                n2 = f3.f.a.indexOf("::");
                if ((n2 += "::".length()) > 0) {
                    f3.f.a = f3.f.a.substring(n2);
                    if (!TextUtils.isEmpty((CharSequence)f3.g.a) && f3.g.a.length() > n2) {
                        f3.g.a = f3.g.a.substring(n2);
                    }
                }
            }
            arrayList.add(f3);
        }
        return arrayList;
    }

    static /* synthetic */ List a(g g2) {
        return g2.f;
    }

    static /* synthetic */ boolean a(g g2, boolean bl2) {
        g2.d = bl2;
        return g2.d;
    }

    static /* synthetic */ boolean b(g g2, boolean bl2) {
        g2.e = bl2;
        return g2.e;
    }

    static /* synthetic */ i b(g g2) {
        return g2.c;
    }

    static /* synthetic */ i a(g g2, i i2) {
        g2.c = i2;
        return g2.c;
    }
}

