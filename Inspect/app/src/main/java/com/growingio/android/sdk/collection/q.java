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
 *  android.view.View
 *  android.view.ViewTreeObserver
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
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.growingio.android.sdk.b.b;
import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.k;
import com.growingio.android.sdk.b.m;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.a;
import com.growingio.android.sdk.collection.aa;
import com.growingio.android.sdk.collection.ae;
import com.growingio.android.sdk.collection.af;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.collection.d;
import com.growingio.android.sdk.collection.e;
import com.growingio.android.sdk.collection.r;
import com.growingio.android.sdk.collection.s;
import com.growingio.android.sdk.collection.t;
import com.growingio.android.sdk.collection.u;
import com.growingio.android.sdk.collection.v;
import com.growingio.android.sdk.collection.w;
import com.growingio.android.sdk.collection.x;
import com.growingio.android.sdk.utils.h;
import com.growingio.android.sdk.utils.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressLint(value={"NewApi"})
public class q
implements d {
    private final IntentFilter c = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    private static boolean d = false;
    private static int e = 0;
    private AsyncTask f;
    private String g;
    private ae h = new ae();
    private Handler i;
    private GConfig j;
    private aa k;
    private boolean l;
    Map a = new LinkedHashMap();
    private long m;
    private String n;
    public int b;
    private static q o;
    private static final Object p;
    private ViewTreeObserver.OnGlobalLayoutListener q;
    private ViewTreeObserver.OnScrollChangedListener r;
    private Runnable s;
    private Runnable t;
    private Runnable u;

    public long a() {
        return this.m;
    }

    Handler b() {
        return this.i;
    }

    public int c() {
        return this.b;
    }

    public static q d() {
        return o;
    }

    private q(Context context, boolean bl2) {
        this.q = new r(this);
        this.r = new s(this);
        this.s = new t(this);
        this.t = new v(this);
        this.u = new w(this);
        HandlerThread handlerThread = new HandlerThread("GIO.MessageProcessor", 1);
        handlerThread.start();
        this.i = new x(this, handlerThread.getLooper());
        this.j = GConfig.o();
        this.l = bl2;
        this.k = new aa(context);
    }

    private j j() {
        return j.e();
    }

    private c k() {
        return c.h();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void a(Context context, boolean bl2) {
        Object object = p;
        synchronized (object) {
            if (o == null) {
                o = new q(context, bl2);
            }
        }
    }

    private void a(String string) {
        this.a(new m(string));
    }

    private void c(Activity activity) {
        h.b(this.t);
        this.a(new com.growingio.android.sdk.b.c(activity, this.g, this.m, false));
    }

    private void c(Fragment fragment) {
        h.b(this.t);
        this.a(new com.growingio.android.sdk.b.c(fragment, this.g, this.m));
    }

    private void c(android.support.v4.app.Fragment fragment) {
        h.b(this.t);
        this.a(new com.growingio.android.sdk.b.c(fragment, this.g, this.m));
    }

    public void a(String string, String string2) {
        this.m = System.currentTimeMillis();
        this.n = string;
        if (this.l) {
            this.i.obtainMessage(0, (Object)new com.growingio.android.sdk.b.c(string, string2, this.m)).sendToTarget();
            this.e();
        }
    }

    public void a(boolean bl2) {
        Activity activity = this.k().f();
        if (activity == null) {
            return;
        }
        o.a();
        View[] arrview = o.b();
        ArrayList<a> arrayList = new ArrayList<a>();
        boolean bl3 = com.growingio.android.sdk.utils.m.a(arrview) > 1;
        for (View view : arrview) {
            String string;
            if (view == null || "/Ignored".equals(string = this.a(view)) || !com.growingio.android.sdk.utils.m.a(view, string, bl3) || this.c(view) != null) continue;
            a a2 = new a(this.k().a(activity, true), this.m, view, string);
            this.a.put(new WeakReference<View>(view), a2);
            arrayList.add(a2);
            this.b(view);
        }
        this.l();
        Collection collection = bl2 ? arrayList : this.a.values();
        for (a a3 : collection) {
            this.a(a3);
        }
        if (arrayList.size() > 0) {
            j.e().f();
        }
        j.e().l();
    }

    private void b(View view) {
        if (view.getTag(84159245) == null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.q);
            view.getViewTreeObserver().addOnScrollChangedListener(this.r);
            view.setTag(84159245, (Object)true);
        }
    }

    void e() {
        this.a(false);
    }

    public String a(View view) {
        Object object = view.getTag(84159238);
        if (object != null && object instanceof k && ((k)object).a == 1) {
            return "/Ignored";
        }
        String string = view.hashCode() == this.b ? o.d() : o.a(view);
        return string;
    }

    private void a(a a2) {
        if (a2 != null) {
            List list = a2.a();
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

    private void l() {
        Iterator iterator = this.a.keySet().iterator();
        while (iterator.hasNext()) {
            WeakReference weakReference = (WeakReference)iterator.next();
            if (weakReference.get() != null) continue;
            iterator.remove();
        }
    }

    public void a(g g2) {
        if (this.l) {
            this.i.obtainMessage(0, (Object)g2).sendToTarget();
            j j2 = this.j();
            if (j2 != null && j2.c() && g2 instanceof com.growingio.android.sdk.b.c) {
                h.a(new u(this, j2, g2), 200);
            }
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
        if (!this.j.a()) {
            this.k().b(this);
            return;
        }
        activity.getApplicationContext().registerReceiver((BroadcastReceiver)this.h, this.c);
        this.k().b(true);
        this.b = activity.getWindow().getDecorView().hashCode();
        if (af.b()) {
            this.a(this.k().a(activity, false));
        }
        this.m = System.currentTimeMillis();
        this.c(activity);
        this.a.clear();
        this.m();
    }

    @Override
    public void b(Activity activity) {
        this.g = this.k().a(activity, false);
        this.b = -1;
        this.a.clear();
        af.d();
        this.k().b(false);
        try {
            activity.getApplicationContext().unregisterReceiver((BroadcastReceiver)this.h);
        }
        catch (Exception var2_2) {
            // empty catch block
        }
    }

    @Override
    public void a(Fragment fragment) {
        this.m = System.currentTimeMillis();
        this.c(fragment);
        this.a.clear();
        this.m();
    }

    @Override
    public void b(Fragment fragment) {
        this.g = this.k().c(fragment);
        this.a.clear();
    }

    @Override
    public void a(android.support.v4.app.Fragment fragment) {
        this.m = System.currentTimeMillis();
        this.c(fragment);
        this.a.clear();
        this.m();
    }

    @Override
    public void b(android.support.v4.app.Fragment fragment) {
        this.g = this.k().c(fragment);
        this.a.clear();
    }

    private void m() {
        h.b(this.u);
        h.a(this.u, 200);
    }

    public void f() {
        h.b(this.t);
        h.a(this.t, 1000);
    }

    void a(e e2) {
        if (this.k().f() == null) {
            return;
        }
        if (!e2.a()) {
            e2.d = this.m;
        }
        if (this.l) {
            this.i.obtainMessage(0, (Object)e2).sendToTarget();
        }
    }

    static /* synthetic */ void a(q q2) {
        q2.m();
    }

    static /* synthetic */ c b(q q2) {
        return q2.k();
    }

    static /* synthetic */ GConfig c(q q2) {
        return q2.j;
    }

    static /* synthetic */ String d(q q2) {
        return q2.g;
    }

    static /* synthetic */ long e(q q2) {
        return q2.m;
    }

    static /* synthetic */ aa f(q q2) {
        return q2.k;
    }

    static /* synthetic */ boolean g() {
        return d;
    }

    static /* synthetic */ AsyncTask g(q q2) {
        return q2.f;
    }

    static /* synthetic */ AsyncTask a(q q2, AsyncTask asyncTask) {
        q2.f = asyncTask;
        return q2.f;
    }

    static /* synthetic */ int h() {
        return e;
    }

    static /* synthetic */ int i() {
        return e++;
    }

    static /* synthetic */ Handler h(q q2) {
        return q2.i;
    }

    static /* synthetic */ boolean b(boolean bl2) {
        d = bl2;
        return d;
    }

    static {
        p = new Object();
    }
}

