/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.Window
 */
package com.tendcloud.tenddata;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.tendcloud.tenddata.di;
import com.tendcloud.tenddata.dr;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

class dh {
    private WeakHashMap a = new WeakHashMap();
    private final Handler b = new Handler(Looper.getMainLooper());
    private final Map c = new HashMap();
    private final Set d = new HashSet();

    dh() {
    }

    void a(Activity activity) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("Can't add an activity when not on the UI thread");
        }
        this.a.put(activity, activity.getLocalClassName());
        this.c();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void b(Activity activity) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("Can't remove an activity when not on the UI thread");
        }
        this.a.remove((Object)activity);
        Set set = this.d;
        synchronized (set) {
            for (a a2 : this.d) {
                a2.a();
            }
            this.d.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(Map map) {
        Object object = this.d;
        synchronized (object) {
            for (a a2 : this.d) {
                a2.a();
            }
            this.d.clear();
        }
        object = this.c;
        synchronized (object) {
            this.c.clear();
            this.c.putAll(map);
        }
        this.c();
    }

    private void c() {
        if (Thread.currentThread() == this.b.getLooper().getThread()) {
            this.d();
        } else {
            this.b.post((Runnable)new di(this));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void d() {
        for (Activity activity : this.a()) {
            List list;
            List list2;
            String string = activity.getClass().getCanonicalName();
            View view = activity.getWindow().getDecorView().getRootView();
            Map map = this.c;
            synchronized (map) {
                list = (List)this.c.get(string);
                list2 = (List)this.c.get(null);
            }
            if (null != list) {
                this.a(view, list);
            }
            if (null == list2) continue;
            this.a(view, list2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(View view, List list) {
        Set set = this.d;
        synchronized (set) {
            int n2 = list.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                dr dr2 = (dr)list.get(i2);
                a a2 = new a(view, dr2, this.b);
                this.d.add(a2);
            }
        }
    }

    Set a() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("Can't remove an activity when not on the UI thread");
        }
        return Collections.unmodifiableSet(this.a.keySet());
    }

    boolean b() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("Can't check isEmpty() when not on the UI thread");
        }
        return this.a.isEmpty();
    }

    static /* synthetic */ void a(dh dh2) {
        dh2.d();
    }

    static class a
    implements ViewTreeObserver.OnGlobalLayoutListener,
    Runnable {
        private volatile boolean a;
        private boolean b;
        private final WeakReference c;
        private final dr d;
        private final Handler e;

        a(View view, dr dr2, Handler handler) {
            this.d = dr2;
            this.c = new WeakReference<View>(view);
            this.e = handler;
            this.b = true;
            this.a = false;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
            }
            this.run();
        }

        public void onGlobalLayout() {
            this.run();
        }

        @Override
        public void run() {
            if (!this.b) {
                return;
            }
            View view = (View)this.c.get();
            if (null == view || this.a) {
                this.b();
                return;
            }
            this.d.a(view);
            this.e.removeCallbacks((Runnable)this);
            this.e.postDelayed((Runnable)this, 1000);
        }

        void a() {
            this.a = true;
            this.e.post((Runnable)this);
        }

        private void b() {
            if (this.b) {
                ViewTreeObserver viewTreeObserver;
                View view = (View)this.c.get();
                if (null != view && (viewTreeObserver = view.getViewTreeObserver()).isAlive()) {
                    viewTreeObserver.removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                }
                this.d.a();
            }
            this.b = false;
        }
    }

}

