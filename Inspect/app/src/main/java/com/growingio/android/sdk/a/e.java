/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.os.AsyncTask
 *  android.text.TextUtils
 *  android.util.Log
 */
package com.growingio.android.sdk.a;

import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.growingio.android.sdk.a.f;
import com.growingio.android.sdk.a.g;
import com.growingio.android.sdk.b.h;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.utils.i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;

public class e {
    public static e a = new e();
    private final Object b = new Object();
    private g c;
    private boolean d = false;
    private boolean e = false;
    private List f = new ArrayList();

    public void a(g g2) {
        this.c = g2;
    }

    public boolean a() {
        return this.d;
    }

    public boolean b() {
        return this.e;
    }

    public static e c() {
        return a;
    }

    public List d() {
        return this.f;
    }

    private e() {
    }

    @TargetApi(value=11)
    public void e() {
        if (this.e || this.d) {
            return;
        }
        this.e = true;
        new f(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
    }

    public static com.growingio.android.sdk.b.f a(String string, String string2, String string3, String string4, int n2, String string5, String string6, String string7, String string8, h h2) {
        h h3 = new h();
        h h4 = new h();
        h4.d = h3.d = string;
        h3.b = string3;
        h3.f = string7;
        if (string2.equals("elem")) {
            h3.a = string4;
            h3.e = string6;
            h3.c = string5;
            h3.g = string8;
            h4.a = e.b(string4);
            h4.c = string5;
            h4.e = string6;
            h4.g = string8;
            if (h2 != null) {
                h4.d = h2.d;
                h4.b = h2.b;
                h4.f = h2.f;
            } else {
                h4.b = string3;
                h4.f = string7;
            }
        } else if (string2.equals("page")) {
            h3.c = null;
            h4.b = string3;
            h4.a = null;
            h4.c = null;
            h4.e = null;
            h4.f = string7;
        }
        com.growingio.android.sdk.b.f f2 = new com.growingio.android.sdk.b.f();
        f2.d = string2;
        f2.e = "Android";
        f2.f = h3;
        f2.g = h4;
        return f2;
    }

    private static String b(String string) {
        if (GConfig.b) {
            int n2 = string.indexOf("::");
            String string2 = string;
            String string3 = "";
            if (n2 != -1) {
                string2 = string.substring(0, n2);
                string3 = string.substring(n2);
            }
            if (GConfig.c) {
                int n3 = string2.lastIndexOf(35);
                if (n3 != -1) {
                    string2 = string2.substring(n3);
                    return "" + '*' + string2 + string3;
                }
            } else {
                string2 = i.a.reset(string2).replaceAll("");
                return string2 + string3;
            }
        }
        return string;
    }

    public List f() {
        ArrayList<com.growingio.android.sdk.b.f> arrayList = new ArrayList<com.growingio.android.sdk.b.f>();
        String string = c.h().b() + "::";
        for (com.growingio.android.sdk.b.f f2 : this.f) {
            if (!f2.f.d.startsWith(string)) continue;
            com.growingio.android.sdk.b.f f3 = f2.a();
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(com.growingio.android.sdk.b.f f2) {
        Object object = this.b;
        synchronized (object) {
            this.f.add(f2);
        }
    }

    public com.growingio.android.sdk.b.f a(String string, String string2, String string3) {
        if (string3 == null) {
            string3 = "";
        }
        for (com.growingio.android.sdk.b.f f2 : this.f) {
            if (!f2.d.equals("page") || !"Android".equalsIgnoreCase(f2.e) || !TextUtils.equals((CharSequence)f2.f.d, (CharSequence)string) || !TextUtils.equals((CharSequence)f2.f.b, (CharSequence)string2) || !TextUtils.equals((CharSequence)f2.f.f, (CharSequence)string3)) continue;
            return f2;
        }
        return e.a(string, "page", string2, null, 0, null, null, string3, null, null);
    }

    public List b(com.growingio.android.sdk.b.f f2) {
        ArrayList<com.growingio.android.sdk.b.f> arrayList = new ArrayList<com.growingio.android.sdk.b.f>(1);
        arrayList.add(f2);
        for (com.growingio.android.sdk.b.f f3 : this.f) {
            if (!f3.d.equals("page") || f2.a(f3) || !f2.b(f3)) continue;
            arrayList.add(f3);
            if (!GConfig.a) continue;
            Log.d((String)"GrowingIO.TagStore", (String)("getMatchedPageTags: " + f3));
        }
        return arrayList;
    }

    public void a(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return;
        }
        for (com.growingio.android.sdk.b.f f2 : this.f) {
            if (!TextUtils.equals((CharSequence)string, (CharSequence)f2.b)) continue;
            this.f.remove(f2);
            return;
        }
    }

    static /* synthetic */ List a(e e2) {
        return e2.f;
    }

    static /* synthetic */ boolean a(e e2, boolean bl2) {
        e2.d = bl2;
        return e2.d;
    }

    static /* synthetic */ boolean b(e e2, boolean bl2) {
        e2.e = bl2;
        return e2.e;
    }

    static /* synthetic */ g b(e e2) {
        return e2.c;
    }

    static /* synthetic */ g a(e e2, g g2) {
        e2.c = g2;
        return e2.c;
    }
}

