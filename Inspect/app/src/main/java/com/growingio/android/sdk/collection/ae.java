/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 */
package com.growingio.android.sdk.collection;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.af;
import com.growingio.android.sdk.collection.ag;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.collection.g;
import com.growingio.android.sdk.collection.n;
import com.growingio.android.sdk.utils.LogUtil;
import java.util.concurrent.atomic.AtomicInteger;

public class ae {
    private AtomicInteger a = new AtomicInteger(0);
    private AtomicInteger b = new AtomicInteger(0);
    private Handler c;
    private GConfig d;

    private c c() {
        return c.k();
    }

    g a() {
        g g2 = g.a();
        if (g2 == null) {
            g.a(this.c().j());
            g2 = g.a();
        }
        return g2;
    }

    ae(Context context) {
        HandlerThread handlerThread = new HandlerThread("GIO.MessageUploader", 1);
        handlerThread.start();
        this.c = new ag(this, handlerThread.getLooper());
        this.c.post((Runnable)new af(this));
        this.d = GConfig.q();
        this.c.obtainMessage(2).sendToTarget();
    }

    void a(boolean bl2, int n2) {
        if (this.d.w() && bl2) {
            if (this.a(this.a.addAndGet(n2))) {
                this.b();
                LogUtil.d("GIO.MessageUploader", "instant event saved: ", n2, "/", this.a.get(), "  flush data now");
            } else {
                this.f();
                LogUtil.d("GIO.MessageUploader", "instant event saved: ", n2, "/", this.a.get(), "  flush data later");
            }
        } else if (this.a(this.a.get() + this.b.addAndGet(n2))) {
            this.d();
            LogUtil.d("GIO.MessageUploader", "non-instant event saved: ", n2, "/", this.a.get(), "  flush data now");
        } else {
            this.e();
            LogUtil.d("GIO.MessageUploader", "non-instant event saved: ", n2, "/", this.a.get(), "  flush data later");
        }
    }

    private boolean a(int n2) {
        return n2 > this.d.l() || this.d.j();
    }

    private void d() {
        this.c.removeMessages(0);
        this.c.sendEmptyMessage(0);
    }

    public void b() {
        this.c.removeMessages(1);
        this.c.sendEmptyMessage(1);
        n.a().b();
    }

    private void e() {
        if (!this.c.hasMessages(0)) {
            this.c.sendEmptyMessageDelayed(0, this.d.m());
        }
    }

    private void f() {
        if (!this.c.hasMessages(1)) {
            this.c.sendEmptyMessageDelayed(1, this.d.m());
        }
    }

    static /* synthetic */ Handler a(ae ae2) {
        return ae2.c;
    }

    static /* synthetic */ c b(ae ae2) {
        return ae2.c();
    }

    static /* synthetic */ GConfig c(ae ae2) {
        return ae2.d;
    }

    static /* synthetic */ AtomicInteger d(ae ae2) {
        return ae2.a;
    }

    static /* synthetic */ AtomicInteger e(ae ae2) {
        return ae2.b;
    }
}

