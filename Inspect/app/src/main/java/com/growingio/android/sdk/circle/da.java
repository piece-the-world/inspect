/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.view.animation.AlphaAnimation
 *  android.view.animation.Animation
 *  android.widget.TextView
 *  android.widget.Toast
 */
package com.growingio.android.sdk.circle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.Toast;
import com.growingio.android.sdk.b.a;
import com.growingio.android.sdk.b.b;
import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.circle.bu;
import com.growingio.android.sdk.circle.ct;
import com.growingio.android.sdk.circle.db;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.q;
import com.growingio.android.sdk.utils.f;
import com.growingio.android.sdk.utils.i;
import java.util.Collections;
import java.util.List;

public class da
extends bu {
    private float a;
    private float b;
    private float c;
    private int d;
    private TextView e;
    private WindowManager f;
    private int g = 2005;
    private Animation h;
    private static int i = 0;

    public da(Context context) {
        super(context);
        this.c();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean bl2 = false;
        switch (motionEvent.getAction()) {
            case 0: {
                this.b = this.c = motionEvent.getRawY();
                this.a = motionEvent.getY();
                break;
            }
            case 2: {
                this.b = motionEvent.getRawY();
                if (Math.abs(this.b - this.c) < (float)this.d) break;
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams)this.getLayoutParams();
                layoutParams.y = (int)(this.b - this.a);
                this.f.updateViewLayout((View)this, (ViewGroup.LayoutParams)layoutParams);
                bl2 = true;
                break;
            }
            case 1: 
            case 3: {
                i = (int)this.b;
                if (Math.abs(this.b - this.c) >= (float)this.d) break;
                this.performClick();
                break;
            }
        }
        return bl2;
    }

    private void c() {
        this.e = new TextView(this.getContext());
        this.e.setText((CharSequence)"Web\u7aef\u5708\u9009\u4e2d\u2026");
        this.e.setGravity(17);
        this.e.setTextSize(2, 15.0f);
        int n2 = i.a(this.getContext(), 4.0f);
        this.e.setPadding(n2, n2, n2, n2);
        this.e.setTextColor(-1);
        this.h = new AlphaAnimation(0.0f, 1.0f);
        this.h.setDuration(720);
        this.h.setRepeatCount(-1);
        this.h.setRepeatMode(2);
        this.addView((View)this.e, new ViewGroup.LayoutParams(-1, -2));
        this.setBackgroundColor(-15094626);
        this.f = (WindowManager)this.getContext().getApplicationContext().getSystemService("window");
        this.d = i.a(this.getContext(), 10.0f);
        if (Build.VERSION.SDK_INT < 19) {
            this.g = 2002;
        }
        this.setOnClickListener((View.OnClickListener)new db(this));
    }

    private j getCircleManager() {
        return j.e();
    }

    public void a() {
        if (this.getParent() != null) {
            this.setVisibility(0);
        } else {
            Activity activity = this.getCircleManager().d();
            if (this.g != 2005 && !f.d()) {
                Toast.makeText((Context)activity, (CharSequence)"\u7f3a\u5c11 SYSTEM_ALERT_WINDOW \u6743\u9650\u65e0\u6cd5\u5708\u9009, \u8bf7\u4f7f\u7528Android 4.4\u4ee5\u4e0a\u7cfb\u7edf", (int)0).show();
                return;
            }
            int n2 = 296;
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(ct.c(), -2, this.g, n2, -3);
            layoutParams.gravity = 51;
            layoutParams.y = i == 0 ? this.getStatusBarHeight() : i;
            WindowManager windowManager = (WindowManager)activity.getApplication().getSystemService("window");
            windowManager.addView((View)this, (ViewGroup.LayoutParams)layoutParams);
        }
        this.e.startAnimation(this.h);
        this.setKeepScreenOn(true);
    }

    public int getStatusBarHeight() {
        int n2 = 0;
        int n3 = this.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (n3 > 0) {
            n2 = this.getResources().getDimensionPixelSize(n3);
        }
        return n2;
    }

    public void b() {
        this.f.removeView((View)this);
        this.setKeepScreenOn(false);
    }

    public void setContent(String string) {
        this.e.setText((CharSequence)string);
    }

    private void d() {
        b b2 = new b();
        b2.a = "GioWindow/FloatViewContainer[0]/TextView[0]";
        b2.b = System.currentTimeMillis();
        b2.d = this.e.getText().toString();
        a a2 = a.c();
        a2.g = "GIOActivity";
        a2.b = b2.b;
        a2.a = Collections.singletonList(b2);
        q.d().a((g)a2);
    }

    static /* synthetic */ j a(da da2) {
        return da2.getCircleManager();
    }

    static /* synthetic */ void b(da da2) {
        da2.d();
    }
}

