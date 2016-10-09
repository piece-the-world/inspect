/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.app.Fragment
 *  android.content.Context
 *  android.content.Intent
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.support.annotation.UiThread
 *  android.support.v4.app.Fragment
 *  android.support.v4.app.FragmentActivity
 *  android.text.TextUtils
 *  android.util.SparseArray
 *  android.view.View
 *  android.widget.EditText
 */
package com.growingio.android.sdk.collection;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.UiThread;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import com.growingio.android.sdk.a.a;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.Configuration;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.GrowingIO;
import com.growingio.android.sdk.collection.d;
import com.growingio.android.sdk.collection.e;
import com.growingio.android.sdk.collection.l;
import com.growingio.android.sdk.collection.t;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.f;
import com.growingio.android.sdk.utils.h;
import com.growingio.android.sdk.utils.i;
import com.growingio.android.sdk.utils.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

@TargetApi(value=14)
public class c
implements Application.ActivityLifecycleCallbacks {
    private static c a;
    private Context b;
    private String c;
    private final Object d = new Object();
    private boolean e = false;
    private int f = -1;
    private SparseArray g = new SparseArray(10);
    private Double h;
    private Double i;
    private boolean j = false;
    private boolean k = false;
    private String l;
    private boolean m = false;
    private GConfig n;
    private String o;
    private ArrayList p;
    private SparseArray q = new SparseArray();
    private WeakReference r = new WeakReference<Object>(null);
    private WeakReference s = new WeakReference<Object>(null);
    private SparseArray t = new SparseArray();
    private SparseArray u = new SparseArray();
    private SparseArray v = new SparseArray();
    private ArrayList w;
    private Runnable x;

    public SparseArray a() {
        return this.q;
    }

    private com.growingio.android.sdk.a.e u() {
        return com.growingio.android.sdk.a.e.a();
    }

    public String b() {
        return GrowingIO.sPackageName;
    }

    public String c() {
        return GrowingIO.sProjectId;
    }

    String d() {
        return "0a1b4118dd954ec3bcc69da5138bdb96";
    }

    public void a(double d2, double d3) {
        this.h = d2;
        this.i = d3;
    }

    public Double e() {
        return this.h;
    }

    public Double f() {
        return this.i;
    }

    public void g() {
        this.h = null;
        this.i = null;
    }

    public Object h() {
        return this.s.get();
    }

    public Activity i() {
        return (Activity)this.r.get();
    }

    public void a(Activity activity) {
        if (activity == null) {
            i.a(this.x);
        } else {
            i.b(this.x);
            this.r = new WeakReference<Activity>(activity);
        }
    }

    public Context j() {
        return this.b;
    }

    public static c k() {
        return a;
    }

    public String l() {
        return this.c;
    }

    GConfig m() {
        if (this.n == null) {
            this.n = GConfig.q();
        }
        return this.n;
    }

    boolean n() {
        return this.k;
    }

    void a(boolean bl2) {
        this.k = bl2;
    }

    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        LogUtil.d("GIO.AppState", new Object[]{"onActivityCreated ", activity});
        this.a(activity);
        k.e().a(activity.getIntent(), activity);
        if (this.p != null) {
            this.p.clear();
        }
    }

    public void onActivityStarted(Activity activity) {
        LogUtil.d("GIO.AppState", new Object[]{"onActivityStarted ", activity});
        k.e().a(activity.getIntent(), activity);
    }

    public void onActivityResumed(Activity activity) {
        LogUtil.d("GIO.AppState", new Object[]{"onActivityResumed ", activity});
        this.a(activity);
        this.s.clear();
        for (e e2 : this.w) {
            e2.a(activity);
        }
        if (!this.m) {
            this.m = true;
            if (!this.m().B()) {
                new a().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        LogUtil.d("GIO.AppState", new Object[]{"onActivityPaused ", activity});
        for (e e22 : this.w) {
            e22.b(activity);
        }
        if (this.p != null) {
            int n2 = this.p.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                e e22;
                e22 = (EditText)this.p.get(i2);
                if (!e22.isFocused()) continue;
                com.growingio.android.sdk.utils.k.c((View)e22);
                break;
            }
        }
    }

    public void onActivityStopped(Activity activity) {
        LogUtil.d("GIO.AppState", new Object[]{"onActivityStopped ", activity});
        if (null == this.i()) {
            for (e e2 : this.w) {
                e2.c(activity);
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        LogUtil.d("GIO.AppState", new Object[]{"onActivitySaveInstanceState ", activity});
    }

    public void onActivityDestroyed(Activity activity) {
        LogUtil.d("GIO.AppState", new Object[]{"onActivityDestroyed ", activity});
        this.a().remove(activity.hashCode());
        this.t.remove(activity.hashCode());
        this.u.remove(activity.hashCode());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    int o() {
        Object object = this.d;
        synchronized (object) {
            if (!this.e || this.f == -1) {
                this.f = this.v();
            }
            return this.f;
        }
    }

    public String p() {
        return this.o;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void b(boolean bl2) {
        Object object = this.d;
        synchronized (object) {
            this.e = bl2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void q() {
        Object object = this.d;
        synchronized (object) {
            this.f = -1;
        }
    }

    static void a(Configuration configuration) {
        a = new c(configuration);
    }

    public c(Configuration configuration) {
        this.x = new d(this);
        this.b = configuration.a.getApplicationContext();
        GrowingIO.sPackageName = this.b.getPackageName();
        GrowingIO.sProjectId = configuration.b;
        this.c = TextUtils.isEmpty((CharSequence)configuration.d) ? new l((Context)configuration.a).a().toString() : configuration.d;
        this.w = new ArrayList(2);
        h.a(this.b);
        h.a(this.g);
    }

    void a(int n2, String string, String string2) {
        if (!this.m().a()) {
            return;
        }
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        boolean bl3 = !TextUtils.isEmpty((CharSequence)((CharSequence)this.g.get(n2)));
        String string3 = string + ":" + string2;
        if (bl2) {
            this.g.remove(n2);
            h.a(n2);
        } else {
            this.g.put(n2, (Object)string3);
            h.a(n2, string3);
        }
        if (n2 == 0) {
            if (this.j && !TextUtils.equals((CharSequence)this.l, (CharSequence)string2)) {
                this.k = true;
            }
            this.j = !bl2;
            this.l = string2;
        }
        if (!bl3 && !bl2) {
            t.d().b(false);
        }
    }

    public SparseArray r() {
        return this.g;
    }

    public SparseArray s() {
        if (k.e().a()) {
            SparseArray sparseArray = new SparseArray(10);
            sparseArray.put(0, (Object)("user:" + this.u().e()));
            sparseArray.put(1, (Object)("ai:" + this.c()));
            return sparseArray;
        }
        return this.g;
    }

    public void a(Fragment fragment) {
        if (this.a((Object)fragment)) {
            this.s = new WeakReference<Fragment>(fragment);
            for (e e2 : this.w) {
                e2.a(fragment);
            }
        }
    }

    public void a(android.support.v4.app.Fragment fragment) {
        if (this.a((Object)fragment)) {
            this.s = new WeakReference<android.support.v4.app.Fragment>(fragment);
            for (e e2 : this.w) {
                e2.a(fragment);
            }
        }
    }

    public void b(Fragment fragment) {
        if (this.a((Object)fragment)) {
            for (e e2 : this.w) {
                e2.b(fragment);
            }
        }
        if (fragment == this.s.get()) {
            this.s.clear();
        }
    }

    public void b(android.support.v4.app.Fragment fragment) {
        if (this.a((Object)fragment)) {
            for (e e2 : this.w) {
                e2.b(fragment);
            }
        }
        if (fragment == this.s.get()) {
            this.s.clear();
        }
    }

    private boolean a(Object object) {
        Activity activity = (Activity)this.r.get();
        return activity != null && this.a(activity, object);
    }

    private boolean a(Activity activity, Object object) {
        return this.a(object, activity) && this.a(activity.hashCode(), object.hashCode());
    }

    private boolean a(int n2, int n3) {
        GConfig gConfig = this.m();
        if (!gConfig.a()) {
            return false;
        }
        List list = (List)this.u.get(n2);
        if (list != null && list.contains(n3)) {
            return false;
        }
        if (gConfig.d()) {
            return true;
        }
        List list2 = (List)this.t.get(n2);
        return list2 != null && list2.contains(n3);
    }

    @UiThread
    public boolean a(e e2) {
        if (e2 == null || this.w.contains(e2)) {
            return false;
        }
        this.w.add(e2);
        return true;
    }

    @UiThread
    public boolean b(e e2) {
        if (e2 == null) {
            return false;
        }
        int n2 = this.w.indexOf(e2);
        if (n2 == -1) {
            return false;
        }
        this.w.remove(n2);
        return true;
    }

    private int v() {
        int n2 = 0;
        this.o = "UNKNOWN";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager)this.b.getSystemService("connectivity");
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                if (networkInfo.getType() == 1) {
                    n2 = 2;
                    this.o = "WIFI";
                } else {
                    n2 = 1;
                    this.o = f.a(networkInfo.getSubtype(), networkInfo.getSubtypeName());
                }
            }
        }
        catch (SecurityException var2_3) {
            // empty catch block
        }
        return n2;
    }

    void a(int n2, String string) {
        this.v.put(n2, (Object)string);
    }

    public String t() {
        if (this.r.get() == null) {
            return null;
        }
        return this.b((Activity)this.r.get());
    }

    public String b(Activity activity) {
        String string;
        SparseArray sparseArray;
        String string2;
        Object t2 = this.s.get();
        if (this.a(t2, activity)) {
            sparseArray = (SparseArray)this.a().get(t2.hashCode());
            string2 = (String)this.v.get(t2.hashCode());
            string = string2 != null ? string2 : j.a(t2.getClass());
        } else {
            sparseArray = (SparseArray)this.a().get(activity.hashCode());
            string2 = (String)this.v.get(activity.hashCode());
            string = string2 != null ? string2 : j.a(activity.getClass());
        }
        if (sparseArray != null && sparseArray.size() > 0 && (string2 = (String)sparseArray.get(0)) != null) {
            return string + '/' + string2;
        }
        return string;
    }

    private boolean a(Object object, Activity activity) {
        return object != null && (object instanceof Fragment && ((Fragment)object).getActivity() == activity || com.growingio.android.sdk.utils.a.g(object) && ((android.support.v4.app.Fragment)object).getActivity() == activity);
    }

    void a(Activity activity, Fragment fragment) {
        this.c(activity.hashCode(), fragment.hashCode());
    }

    void a(Activity activity, android.support.v4.app.Fragment fragment) {
        this.c(activity.hashCode(), fragment.hashCode());
    }

    void b(Activity activity, Fragment fragment) {
        this.b(activity.hashCode(), fragment.hashCode());
    }

    void b(Activity activity, android.support.v4.app.Fragment fragment) {
        this.b(activity.hashCode(), fragment.hashCode());
    }

    private void b(int n2, int n3) {
        ArrayList<Integer> arrayList = (ArrayList<Integer>)this.u.get(n2);
        if (arrayList == null) {
            arrayList = new ArrayList<Integer>(1);
            this.u.put(n2, arrayList);
        }
        arrayList.add(n3);
    }

    private void c(int n2, int n3) {
        ArrayList<Integer> arrayList = (ArrayList<Integer>)this.t.get(n2);
        if (arrayList == null) {
            arrayList = new ArrayList<Integer>(1);
            this.t.put(n2, arrayList);
        }
        arrayList.add(n3);
    }

    public void a(EditText editText) {
        if (this.p == null) {
            this.p = new ArrayList();
        }
        this.p.add(editText);
    }

    static /* synthetic */ WeakReference a(c c2) {
        return c2.r;
    }
}

