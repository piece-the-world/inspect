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
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.support.annotation.UiThread
 *  android.support.v4.app.Fragment
 *  android.support.v4.app.FragmentActivity
 *  android.text.TextUtils
 *  android.util.SparseArray
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
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.UiThread;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.SparseArray;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.Configuration;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.d;
import com.growingio.android.sdk.collection.k;
import com.growingio.android.sdk.collection.q;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.a;
import com.growingio.android.sdk.utils.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@TargetApi(value=14)
public class c
implements Application.ActivityLifecycleCallbacks {
    private static c a;
    private static String b;
    private static String c;
    private Handler d;
    private Context e;
    private String f;
    private final Object g = new Object();
    private boolean h = false;
    private int i = -1;
    private SparseArray j = new SparseArray(10);
    private boolean k = false;
    private boolean l = false;
    private String m;
    private GConfig n;
    private SparseArray o = new SparseArray();
    private WeakReference p = new WeakReference<Object>(null);
    private WeakReference q = new WeakReference<Object>(null);
    private SparseArray r = new SparseArray();
    private SparseArray s = new SparseArray();
    private ArrayList t;

    public SparseArray a() {
        return this.o;
    }

    private com.growingio.android.sdk.a.c p() {
        return com.growingio.android.sdk.a.c.a();
    }

    public String b() {
        return b;
    }

    public Handler c() {
        return this.d;
    }

    public String d() {
        return c;
    }

    String e() {
        return "47f566eaec0a47f9b48e9530fe4a4680";
    }

    public Activity f() {
        return (Activity)this.p.get();
    }

    private void b(Activity activity) {
        this.p = new WeakReference<Activity>(activity);
    }

    public Context g() {
        return this.e;
    }

    public static c h() {
        return a;
    }

    public String i() {
        return this.f;
    }

    GConfig j() {
        if (this.n == null) {
            this.n = GConfig.o();
        }
        return this.n;
    }

    boolean k() {
        return this.l;
    }

    void a(boolean bl2) {
        this.l = bl2;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        LogUtil.d("GIO.AppState", "onActivityCreated " + (Object)activity);
        this.b(activity);
        j.e().a(activity.getIntent(), activity);
    }

    public void onActivityStarted(Activity activity) {
        LogUtil.d("GIO.AppState", "onActivityStarted " + (Object)activity);
        j.e().a(activity.getIntent(), activity);
    }

    public void onActivityResumed(Activity activity) {
        LogUtil.d("GIO.AppState", "onActivityResumed " + (Object)activity);
        this.b(activity);
        for (d d2 : this.t) {
            d2.a(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        LogUtil.d("GIO.AppState", "onActivityPaused " + (Object)activity);
        this.b((Activity)null);
        for (d d2 : this.t) {
            d2.b(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        LogUtil.d("GIO.AppState", "onActivityStopped " + (Object)activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        LogUtil.d("GIO.AppState", "onActivitySaveInstanceState " + (Object)activity);
    }

    public void onActivityDestroyed(Activity activity) {
        LogUtil.d("GIO.AppState", "onActivityDestroyed " + (Object)activity);
        this.a().remove(activity.hashCode());
        this.r.remove(activity.hashCode());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    int l() {
        Object object = this.g;
        synchronized (object) {
            if (!this.h || this.i == -1) {
                this.i = this.q();
            }
            return this.i;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void b(boolean bl2) {
        Object object = this.g;
        synchronized (object) {
            this.h = bl2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void m() {
        Object object = this.g;
        synchronized (object) {
            this.i = -1;
        }
    }

    static void a(Configuration configuration) {
        a = new c(configuration);
    }

    public c(Configuration configuration) {
        this.e = configuration.a.getApplicationContext();
        b = this.e.getPackageName();
        c = configuration.b;
        this.d = new Handler(Looper.getMainLooper());
        this.f = TextUtils.isEmpty((CharSequence)configuration.d) ? new k((Context)configuration.a).a().toString() : configuration.d;
        this.t = new ArrayList(2);
    }

    void a(int n2, String string, String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        boolean bl3 = !TextUtils.isEmpty((CharSequence)((CharSequence)this.j.get(n2)));
        String string3 = string + ":" + string2;
        if (bl2) {
            this.j.remove(n2);
        } else {
            this.j.put(n2, (Object)string3);
        }
        if (n2 == 0) {
            if (this.k && !TextUtils.equals((CharSequence)this.m, (CharSequence)string2)) {
                this.l = true;
            }
            this.k = !bl2;
            this.m = string2;
        }
        if (!bl3 && !bl2) {
            q.d().f();
        }
    }

    public SparseArray n() {
        if (j.e().a()) {
            SparseArray sparseArray = new SparseArray(10);
            sparseArray.put(0, (Object)("user:" + this.p().e()));
            sparseArray.put(1, (Object)("ai:" + this.d()));
            return sparseArray;
        }
        return this.j;
    }

    public void a(Fragment fragment) {
        if (this.a((Object)fragment)) {
            this.q = new WeakReference<Fragment>(fragment);
            for (d d2 : this.t) {
                d2.a(fragment);
            }
        }
    }

    public void a(android.support.v4.app.Fragment fragment) {
        if (this.a((Object)fragment)) {
            this.q = new WeakReference<android.support.v4.app.Fragment>(fragment);
            for (d d2 : this.t) {
                d2.a(fragment);
            }
        }
    }

    public void b(Fragment fragment) {
        if (this.a((Object)fragment)) {
            for (d d2 : this.t) {
                d2.b(fragment);
            }
        }
        this.q.clear();
    }

    public void b(android.support.v4.app.Fragment fragment) {
        if (this.a((Object)fragment)) {
            for (d d2 : this.t) {
                d2.b(fragment);
            }
        }
        this.q.clear();
    }

    private boolean a(Object object) {
        Activity activity = (Activity)this.p.get();
        return activity != null && this.a(activity, object);
    }

    private boolean a(Activity activity, Object object) {
        return this.a(object, activity) && this.a(activity.hashCode(), object.hashCode());
    }

    private boolean a(int n2, int n3) {
        GConfig gConfig = this.j();
        if (!gConfig.a()) {
            return false;
        }
        if (gConfig.d()) {
            return true;
        }
        List list = (List)this.r.get(n2);
        return list != null && list.contains(n3);
    }

    @UiThread
    public boolean a(d d2) {
        if (d2 == null || this.t.contains(d2)) {
            return false;
        }
        this.t.add(d2);
        return true;
    }

    @UiThread
    public boolean b(d d2) {
        if (d2 == null) {
            return false;
        }
        int n2 = this.t.indexOf(d2);
        if (n2 == -1) {
            return false;
        }
        this.t.remove(n2);
        return true;
    }

    private int q() {
        int n2 = 0;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager)this.e.getSystemService("connectivity");
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                n2 = networkInfo.getType() == 1 ? 2 : 1;
            }
        }
        catch (SecurityException var2_3) {
            // empty catch block
        }
        return n2;
    }

    void a(int n2, String string) {
        this.s.put(n2, (Object)string);
    }

    public String o() {
        if (this.p.get() == null) {
            return null;
        }
        return this.a((Activity)this.p.get(), true);
    }

    public String c(Fragment fragment) {
        return this.a(fragment.getActivity(), true);
    }

    public String c(android.support.v4.app.Fragment fragment) {
        return this.a((Activity)fragment.getActivity(), true);
    }

    public String a(Activity activity) {
        return this.a(activity, true);
    }

    public String a(Activity activity, boolean bl2) {
        String string;
        SparseArray sparseArray;
        String string2;
        Object t2 = this.q.get();
        if (bl2 && this.a(t2, activity)) {
            sparseArray = (SparseArray)this.a().get(t2.hashCode());
            string = (String)this.s.get(t2.hashCode());
            string2 = string != null ? string : i.a(t2.getClass());
        } else {
            sparseArray = (SparseArray)this.a().get(activity.hashCode());
            string = (String)this.s.get(activity.hashCode());
            string2 = string != null ? string : i.a(activity.getClass());
        }
        if (sparseArray != null && sparseArray.size() > 0 && (string = (String)sparseArray.get(0)) != null) {
            return string2 + '/' + string;
        }
        return string2;
    }

    private boolean a(Object object, Activity activity) {
        return object != null && (object instanceof Fragment && ((Fragment)object).getActivity() == activity || a.f(object) && ((android.support.v4.app.Fragment)object).getActivity() == activity);
    }

    void a(Activity activity, Fragment fragment) {
        this.b(activity.hashCode(), fragment.hashCode());
    }

    void a(Activity activity, android.support.v4.app.Fragment fragment) {
        this.b(activity.hashCode(), fragment.hashCode());
    }

    private void b(int n2, int n3) {
        ArrayList<Integer> arrayList = (ArrayList<Integer>)this.r.get(n2);
        if (arrayList == null) {
            arrayList = new ArrayList<Integer>(1);
            this.r.put(n2, arrayList);
        }
        arrayList.add(n3);
    }
}

