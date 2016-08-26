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
import com.growingio.android.sdk.collection.ab;
import com.growingio.android.sdk.collection.ac;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.collection.f;
import com.growingio.android.sdk.utils.LogUtil;
import java.util.concurrent.atomic.AtomicInteger;

public class aa {
    private AtomicInteger a = new AtomicInteger(0);
    private AtomicInteger b = new AtomicInteger(0);
    private Handler c;
    private GConfig d;

    private c b() {
        return c.h();
    }

    f a() {
        f f2 = f.a();
        if (f2 == null) {
            f.a(this.b().g());
            f2 = f.a();
        }
        return f2;
    }

    aa(Context context) {
        HandlerThread handlerThread = new HandlerThread("GIO.MessageUploader", 1);
        handlerThread.start();
        this.c = new ac(this, handlerThread.getLooper());
        this.c.post((Runnable)new ab(this));
        this.d = GConfig.o();
        this.c.obtainMessage(2).sendToTarget();
    }

    void a(boolean bl2) {
        if (this.d.v() && bl2) {
            if (this.a(this.a.incrementAndGet())) {
                this.d();
                LogUtil.d("GIO.MessageUploader", "newEventSaved: flush cellular data now");
            } else {
                this.f();
                LogUtil.d("GIO.MessageUploader", "newEventSaved: flush cellular data delayed");
            }
        } else if (this.a(this.a.get() + this.b.incrementAndGet())) {
            this.c();
            LogUtil.d("GIO.MessageUploader", "newEventSaved: flush all data now");
        } else {
            this.e();
            LogUtil.d("GIO.MessageUploader", "newEventSaved: flush all data delayed");
        }
    }

    private boolean a(int n2) {
        return n2 > this.d.j() || this.d.h();
    }

    private void c() {
        if (!this.c.hasMessages(0)) {
            this.c.sendEmptyMessage(0);
        }
    }

    private void d() {
        if (!this.c.hasMessages(1)) {
            this.c.sendEmptyMessage(1);
        }
    }

    private void e() {
        if (!this.c.hasMessages(0)) {
            this.c.sendEmptyMessageDelayed(0, this.d.k());
        }
    }

    private void f() {
        if (!this.c.hasMessages(1)) {
            this.c.sendEmptyMessageDelayed(1, this.d.k());
        }
    }

    static /* synthetic */ Handler a(aa aa2) {
        return aa2.c;
    }

    static /* synthetic */ c b(aa aa2) {
        return aa2.b();
    }

    static /* synthetic */ GConfig c(aa aa2) {
        return aa2.d;
    }

    static /* synthetic */ AtomicInteger d(aa aa2) {
        return aa2.a;
    }

    static /* synthetic */ AtomicInteger e(aa aa2) {
        return aa2.b;
    }
}

