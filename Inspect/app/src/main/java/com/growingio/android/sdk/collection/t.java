/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.Fragment
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.AsyncTask
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.support.v4.app.Fragment
 *  android.util.Pair
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalFocusChangeListener
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.view.Window
 */
package com.growingio.android.sdk.collection;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.growingio.android.sdk.b.b;
import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.m;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.a;
import com.growingio.android.sdk.collection.aa;
import com.growingio.android.sdk.collection.ab;
import com.growingio.android.sdk.collection.ae;
import com.growingio.android.sdk.collection.ai;
import com.growingio.android.sdk.collection.aj;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.collection.e;
import com.growingio.android.sdk.collection.f;
import com.growingio.android.sdk.collection.u;
import com.growingio.android.sdk.collection.v;
import com.growingio.android.sdk.collection.w;
import com.growingio.android.sdk.collection.x;
import com.growingio.android.sdk.collection.y;
import com.growingio.android.sdk.collection.z;
import com.growingio.android.sdk.utils.i;
import com.growingio.android.sdk.utils.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressLint(value={"NewApi"})
public class t
implements e {
    private final IntentFilter c = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    private static boolean d = false;
    private static int e = 0;
    private AsyncTask f;
    private String g;
    private Pair h;
    private ai i = new ai();
    private Handler j;
    private GConfig k;
    private ae l;
    Map a = new LinkedHashMap();
    private long m;
    private String n;
    public int b;
    private static t o;
    private static final Object p;
    private ViewTreeObserver.OnGlobalLayoutListener q;
    private ViewTreeObserver.OnScrollChangedListener r;
    private ViewTreeObserver.OnGlobalFocusChangeListener s;
    private Runnable t;
    private Runnable u;
    private Runnable v;

    public long a() {
        return this.m;
    }

    Handler b() {
        return this.j;
    }

    public int c() {
        return this.b;
    }

    public static t d() {
        return o;
    }

    private t(Context context) {
        this.q = new u(this);
        this.r = new v(this);
        this.s = new w(this);
        this.t = new y(this);
        this.u = new z(this);
        this.v = new aa(this);
        HandlerThread handlerThread = new HandlerThread("GIO.MessageProcessor", 1);
        handlerThread.start();
        this.j = new ab(this, handlerThread.getLooper());
        this.k = GConfig.q();
        this.l = new ae(context);
    }

    private k i() {
        return k.e();
    }

    private c j() {
        return c.k();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void a(Context context) {
        Object object = p;
        synchronized (object) {
            if (o == null) {
                o = new t(context);
            }
        }
    }

    private void a(String string) {
        this.a(new m(string));
    }

    private void d(Activity activity) {
        this.m = System.currentTimeMillis();
        i.b(this.u);
        i.b(this.t);
        this.h = new Pair(new WeakReference<Activity>(activity), (Object)new com.growingio.android.sdk.b.c(activity, this.g, this.m));
    }

    private void c(Fragment fragment) {
        this.m = System.currentTimeMillis();
        i.b(this.u);
        i.b(this.t);
        this.h = new Pair(new WeakReference<Fragment>(fragment), (Object)new com.growingio.android.sdk.b.c(fragment, this.g, this.m));
    }

    private void c(android.support.v4.app.Fragment fragment) {
        this.m = System.currentTimeMillis();
        i.b(this.u);
        i.b(this.t);
        this.h = new Pair(new WeakReference<android.support.v4.app.Fragment>(fragment), (Object)new com.growingio.android.sdk.b.c(fragment, this.g, this.m));
    }

    public void a(String string, String string2) {
        this.m = System.currentTimeMillis();
        this.n = string;
        this.j.obtainMessage(0, (Object)new com.growingio.android.sdk.b.c(string, string2, this.m)).sendToTarget();
        this.e();
    }

    public void a(boolean bl2) {
        GConfig gConfig = GConfig.q();
        if (gConfig == null || !gConfig.c()) {
            return;
        }
        Activity activity = this.j().i();
        if (activity == null) {
            return;
        }
        n.a();
        View[] arrview = n.b();
        ArrayList<a> arrayList = new ArrayList<a>();
        boolean bl3 = com.growingio.android.sdk.utils.k.a(arrview) > 1;
        for (View view : arrview) {
            String string;
            if (view == null || "/Ignored".equals(string = this.a(view)) || !com.growingio.android.sdk.utils.k.a(view, string, bl3) || this.c(view) != null) continue;
            a a2 = new a(this.j().b(activity), this.m, view, string);
            this.a.put(new WeakReference<View>(view), a2);
            arrayList.add(a2);
            this.b(view);
        }
        Collection collection = bl2 ? arrayList : this.a.values();
        for (a a3 : collection) {
            this.a(a3);
        }
        if (arrayList.size() > 0) {
            k.e().f();
        }
        k.e().l();
    }

    private void b(View view) {
        if (view.getTag(84159245) == null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.q);
            view.getViewTreeObserver().addOnScrollChangedListener(this.r);
            view.getViewTreeObserver().addOnGlobalFocusChangeListener(this.s);
            view.setTag(84159245, (Object)true);
        }
    }

    void e() {
        this.a(false);
    }

    public String a(View view) {
        Object object = view.getTag(84159238);
        if (object != null && object instanceof com.growingio.android.sdk.b.k && ((com.growingio.android.sdk.b.k)object).a == 1) {
            return "/Ignored";
        }
        String string = view.hashCode() == this.b ? n.d() : n.a(view);
        return string;
    }

    private void a(a a2) {
        if (a2 != null) {
            List list = a2.a();
            if (list == null) {
                return;
            }
            for (com.growingio.android.sdk.b.a a3 : list) {
                this.a((g)a3);
            }
        }
    }

    private a c(View view) {
        for (WeakReference weakReference : this.a.keySet()) {
            if (weakReference.get() != view) continue;
            return (a)this.a.get(weakReference);
        }
        return null;
    }

    public void a(g g2) {
        k k2;
        this.j.obtainMessage(0, (Object)g2).sendToTarget();
        if (g2 instanceof com.growingio.android.sdk.b.c) {
            this.g = g2.g;
        }
        if ((k2 = this.i()) != null && k2.c() && g2 instanceof com.growingio.android.sdk.b.c) {
            i.a(new x(this, k2, g2), 120);
        }
    }

    private void a(com.growingio.android.sdk.b.a a2) {
        if (this.n == null) {
            this.a("CirclePage", null);
        }
        a2.g = this.n;
        a2.b = this.m;
        this.a((g)a2);
    }

    public void a(String string, String string2, boolean bl2) {
        b b2 = new b();
        b2.a = string;
        b2.b = System.currentTimeMillis();
        b2.d = string2;
        List<b> list = Collections.singletonList(b2);
        com.growingio.android.sdk.b.a a2 = bl2 ? com.growingio.android.sdk.b.a.c() : com.growingio.android.sdk.b.a.a();
        a2.a = list;
        this.a(a2);
    }

    @Override
    public void a(Activity activity) {
        if (!this.k.a()) {
            this.j().b(this);
            return;
        }
        try {
            activity.getApplicationContext().registerReceiver((BroadcastReceiver)this.i, this.c);
            this.j().b(true);
        }
        catch (SecurityException var2_2) {
            var2_2.printStackTrace();
        }
        this.b = activity.getWindow().getDecorView().hashCode();
        if (aj.b()) {
            this.a(this.j().b(activity));
        }
        this.d(activity);
        this.a.clear();
        this.k();
    }

    @Override
    public void b(Activity activity) {
        this.b = -1;
        this.a.clear();
        aj.d();
        this.j().b(false);
        try {
            activity.getApplicationContext().unregisterReceiver((BroadcastReceiver)this.i);
        }
        catch (Exception var2_2) {
            // empty catch block
        }
    }

    @Override
    public void a(Fragment fragment) {
        this.c(fragment);
        this.a.clear();
        this.k();
    }

    @Override
    public void b(Fragment fragment) {
        this.a.clear();
    }

    @Override
    public void a(android.support.v4.app.Fragment fragment) {
        this.c(fragment);
        this.a.clear();
        this.k();
    }

    @Override
    public void b(android.support.v4.app.Fragment fragment) {
        this.a.clear();
    }

    @Override
    public void c(Activity activity) {
        this.l.b();
    }

    private void k() {
        i.b(this.v);
        i.a(this.v, 120);
    }

    void b(boolean bl2) {
        i.b(this.t);
        i.b(this.u);
        if (bl2) {
            i.a(this.t, 120);
        } else {
            i.a(this.u, 120);
        }
    }

    private void d(boolean bl2) {
        Activity activity = this.j().i();
        if (activity != null) {
            if (bl2) {
                this.m = System.currentTimeMillis();
            }
            i.b(this.u);
            i.b(this.t);
            this.h = new Pair((Object)null, (Object)new com.growingio.android.sdk.b.c(this.j().t(), this.g, this.m));
            if (bl2) {
                this.a.clear();
                this.v.run();
            }
        }
    }

    void a(f f2) {
        if (this.j().i() == null) {
            return;
        }
        if (!f2.a()) {
            f2.d = this.m;
        }
        this.j.obtainMessage(0, (Object)f2).sendToTarget();
    }

    static /* synthetic */ void a(t t2) {
        t2.k();
    }

    static /* synthetic */ void a(t t2, boolean bl2) {
        t2.d(bl2);
    }

    static /* synthetic */ Pair b(t t2) {
        return t2.h;
    }

    static /* synthetic */ Pair a(t t2, Pair pair) {
        t2.h = pair;
        return t2.h;
    }

    static /* synthetic */ c c(t t2) {
        return t2.j();
    }

    static /* synthetic */ GConfig d(t t2) {
        return t2.k;
    }

    static /* synthetic */ ae e(t t2) {
        return t2.l;
    }

    static /* synthetic */ boolean f() {
        return d;
    }

    static /* synthetic */ AsyncTask f(t t2) {
        return t2.f;
    }

    static /* synthetic */ AsyncTask a(t t2, AsyncTask asyncTask) {
        t2.f = asyncTask;
        return t2.f;
    }

    static /* synthetic */ int g() {
        return e;
    }

    static /* synthetic */ int h() {
        return e++;
    }

    static /* synthetic */ Handler g(t t2) {
        return t2.j;
    }

    static /* synthetic */ boolean c(boolean bl2) {
        d = bl2;
        return d;
    }

    static {
        p = new Object();
    }
}

