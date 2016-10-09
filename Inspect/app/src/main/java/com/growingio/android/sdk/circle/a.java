/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.Application
 *  android.app.DialogFragment
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.ShapeDrawable
 *  android.graphics.drawable.shapes.RoundRectShape
 *  android.graphics.drawable.shapes.Shape
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.support.annotation.NonNull
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.webkit.WebView
 *  android.widget.Toast
 */
package com.growingio.android.sdk.circle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.DialogFragment;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.HybridEventEditDialog;
import com.growingio.android.sdk.circle.ao;
import com.growingio.android.sdk.circle.aq;
import com.growingio.android.sdk.circle.b;
import com.growingio.android.sdk.circle.bd;
import com.growingio.android.sdk.circle.bi;
import com.growingio.android.sdk.circle.c;
import com.growingio.android.sdk.circle.d;
import com.growingio.android.sdk.circle.e;
import com.growingio.android.sdk.circle.f;
import com.growingio.android.sdk.circle.g;
import com.growingio.android.sdk.circle.h;
import com.growingio.android.sdk.circle.i;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.utils.j;
import com.growingio.android.sdk.utils.n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@TargetApi(value=15)
public class a
extends aq {
    private int b = 2005;
    private final int c = 10;
    static int a;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private boolean j = false;
    private View k;
    private Point l = null;
    private i m;
    private aq n;
    private bi o;
    private ao p;
    private Rect q;
    private com.growingio.android.sdk.b.i r;
    private boolean s = false;
    private Rect t = new Rect();
    private List u = new ArrayList();
    private boolean v = false;
    private WindowManager w;
    private View[] x;
    private int y;
    private static Method z;
    private Comparator A;
    private l B;
    private l C;
    private Runnable D;

    com.growingio.android.sdk.collection.c getAppState() {
        return com.growingio.android.sdk.collection.c.k();
    }

    k getCircleManager() {
        return k.e();
    }

    @SuppressLint(value={"RtlHardcoded"})
    public a(Context context) {
        super(context);
        this.A = new e(this);
        this.B = new f(this);
        this.C = new g(this);
        this.D = new h(this);
        this.a();
    }

    public void a() {
        a = j.a(this.getContext(), 48.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape((Shape)new RoundRectShape(new float[]{(float)a / 2.0f, (float)a / 2.0f, (float)a / 2.0f, (float)a / 2.0f, (float)a / 2.0f, (float)a / 2.0f, (float)a / 2.0f, (float)a / 2.0f}, null, null));
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.getPaint().setColor(-436254684);
        shapeDrawable.getPaint().setAntiAlias(true);
        this.setBackgroundDrawable((Drawable)shapeDrawable);
        this.w = (WindowManager)this.getContext().getApplicationContext().getSystemService("window");
        this.y = j.a(this.getContext(), 4.0f);
        if (Build.VERSION.SDK_INT < 19) {
            this.b = 2002;
        }
        this.f();
        this.m = new i(this.getContext());
        this.setOnClickListener((View.OnClickListener)new b(this));
    }

    private void f() {
        this.n = new aq(this.getContext());
        float f2 = j.a(this.getContext(), 3.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new RoundRectShape(new float[]{f2, f2, f2, f2, f2, f2, f2, f2}, null, null));
        shapeDrawable.getPaint().setColor(1291798564);
        shapeDrawable.getPaint().setStrokeWidth((float)j.a(this.getContext(), 1.0f));
        shapeDrawable.getPaint().setAntiAlias(true);
        this.n.setBackgroundDrawable((Drawable)shapeDrawable);
        int n2 = 312;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(0, 0, this.b, n2, -3);
        layoutParams.gravity = 51;
        layoutParams.setTitle((CharSequence)("MaskWindow:" + this.getContext().getPackageName()));
        this.w.addView((View)this.n, (ViewGroup.LayoutParams)layoutParams);
        this.o = new bi(this.getContext());
        this.o.setFloatType(this.b);
        this.o.a();
        if (GConfig.q().s()) {
            this.o.setTags(com.growingio.android.sdk.a.g.c().d());
        }
    }

    public void b() {
        this.g();
        if (this.getParent() == null) {
            Point point = GConfig.q().t();
            int n2 = 296;
            Activity activity = k.e().d();
            if (this.b != 2005 && !com.growingio.android.sdk.utils.g.d()) {
                Toast.makeText((Context)activity, (CharSequence)"\u7f3a\u5c11 SYSTEM_ALERT_WINDOW \u6743\u9650\u65e0\u6cd5\u5708\u9009, \u8bf7\u4f7f\u7528Android 4.4\u4ee5\u4e0a\u7cfb\u7edf", (int)0).show();
                return;
            }
            if (GConfig.q().r()) {
                point.x = (bd.b() - a) / 2;
                point.y = (bd.d() - a) / 2;
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(a, a, this.b, n2, -3);
            layoutParams.gravity = 51;
            layoutParams.x = point.x;
            layoutParams.y = point.y;
            WindowManager windowManager = (WindowManager)activity.getApplication().getSystemService("window");
            layoutParams.setTitle((CharSequence)("AnchorWindow:" + this.getContext().getPackageName()));
            windowManager.addView((View)this, (ViewGroup.LayoutParams)layoutParams);
            this.m.b();
        } else {
            this.setVisibility(0);
            this.o.setVisibility(0);
            this.bringToFront();
        }
    }

    private void g() {
        if (GConfig.q().r()) {
            if (this.p == null) {
                this.p = new ao(this.getContext());
                int n2 = 296;
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, this.b, n2, -3);
                layoutParams.gravity = 51;
                layoutParams.setTitle((CharSequence)("CircleTipWindow:" + this.getContext().getPackageName()));
                this.p.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
                this.p.setOnClickListener((View.OnClickListener)new c(this));
            }
            if (this.p.getParent() == null) {
                this.w.addView((View)this.p, this.p.getLayoutParams());
                this.bringToFront();
            }
        }
    }

    public boolean onTouchEvent(@NonNull MotionEvent event) {
        boolean bl2 = false;
        switch (event.getAction()) {
            case 0: {
                this.h = event.getX();
                this.i = event.getY();
                this.f = event.getRawX();
                this.g = event.getRawY();
                this.d = event.getRawX();
                this.e = event.getRawY();
                this.j = true;
                this.x = n.c();
                this.o.c();
                break;
            }
            case 2: {
                if (!this.j) break;
                this.d = event.getRawX();
                this.e = event.getRawY();
                if (Math.abs(this.d - this.f) < (float)this.y && Math.abs(this.e - this.g) < (float)this.y) break;
                if (this.p != null) {
                    this.l();
                }
                this.h();
                Rect rect = new Rect();
                this.getGlobalVisibleRect(rect);
                if (!rect.contains((int)this.f, (int)this.g)) {
                    this.l = new Point((int)this.d, (int)this.e);
                    this.i();
                } else {
                    this.m.setVisibility(8);
                }
                bl2 = true;
                break;
            }
            case 1: 
            case 3: {
                this.j = false;
                this.n.setVisibility(8);
                this.m.setVisibility(8);
                this.n.getLayoutParams().width = 0;
                this.c();
                if (this.q != null) {
                    this.u.clear();
                    this.a(this.x);
                    com.growingio.android.sdk.utils.k.a(this.x, this.C);
                    if (this.u.size() > 0) {
                        View view = ((com.growingio.android.sdk.b.i)this.u.get((int)0)).c;
                        if (view instanceof WebView || com.growingio.android.sdk.utils.a.d((Object)view)) {
                            this.a(view);
                        } else {
                            Collections.sort(this.u, this.A);
                            this.a("elem", this.u);
                        }
                        this.k();
                    } else {
                        k.e().l();
                    }
                    this.q = null;
                    bl2 = true;
                } else if (Math.abs(this.d - this.f) < (float)this.y && Math.abs(this.e - this.g) < (float)this.y) {
                    this.performClick();
                } else {
                    this.o.setVisibility(GConfig.q().s() ? 0 : 8);
                    k.e().l();
                }
                this.x = null;
                this.removeCallbacks(this.D);
                break;
            }
        }
        return bl2;
    }

    private void a(Object[] arrobject) {
        if (arrobject == null || arrobject.length <= 1) {
            return;
        }
        for (int i2 = 0; i2 < arrobject.length / 2; ++i2) {
            Object object = arrobject[i2];
            arrobject[i2] = arrobject[arrobject.length - i2 - 1];
            arrobject[arrobject.length - i2 - 1] = object;
        }
    }

    private void a(String string, List list) {
        this.setVisibility(8);
        HybridEventEditDialog hybridEventEditDialog = new HybridEventEditDialog();
        String string2 = this.getAppState().t();
        hybridEventEditDialog.a(this.getAppState().i(), list, string2, this.getAppState().b(), new d(this, hybridEventEditDialog));
    }

    private void h() {
        int n2;
        int n3;
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams)this.getLayoutParams();
        int n4 = (int)(this.d - this.h);
        int n5 = (int)(this.e - this.i);
        if (n4 < 0) {
            n4 = 0;
        }
        if (n5 < 0) {
            n5 = 0;
        }
        boolean bl2 = this.getContext().getResources().getConfiguration().orientation == 1;
        int n6 = bd.b() - this.getWidth();
        int n7 = bd.d() - this.getHeight();
        int n8 = n2 = bl2 ? n6 : n7;
        if (n4 > n2) {
            n4 = n2;
        }
        int n9 = n3 = bl2 ? n7 : n6;
        if (n5 > n3) {
            n5 = n3;
        }
        if (n5 < 0) {
            n5 = 0;
        }
        layoutParams.x = n4;
        layoutParams.y = n5;
        this.w.updateViewLayout((View)this, (ViewGroup.LayoutParams)layoutParams);
    }

    private boolean a(Rect rect, Rect rect2) {
        return rect.contains(rect2) && rect.width() - rect2.width() < 10 && rect.height() - rect2.height() < 10;
    }

    private void i() {
        this.r = null;
        this.q = null;
        this.u.clear();
        this.v = false;
        com.growingio.android.sdk.utils.k.a(this.x, this.B);
        this.j();
    }

    private void j() {
        if (this.u.size() > 0) {
            this.r = (com.growingio.android.sdk.b.i)this.u.get(0);
            this.q = new Rect();
            j.a(this.r.c, this.q, this.r.f);
            if (this.r.c instanceof WebView || com.growingio.android.sdk.utils.a.d((Object)this.r.c)) {
                this.n.setVisibility(8);
                this.m.setVisibility(8);
                int[] arrn = new int[2];
                this.r.c.getLocationOnScreen(arrn);
                this.a(this.r.c, this.d - (float)arrn[0], this.e - (float)arrn[1]);
                this.k = this.r.c;
            } else {
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams)this.n.getLayoutParams();
                this.n.setVisibility(this.s ? 8 : 0);
                if (this.q.left != layoutParams.x || this.q.top != layoutParams.y || this.q.width() != layoutParams.width || this.q.height() != layoutParams.height) {
                    layoutParams.width = this.q.width();
                    layoutParams.height = this.q.height();
                    layoutParams.x = this.q.left;
                    layoutParams.y = this.q.top;
                    this.w.removeView((View)this.n);
                    this.w.addView((View)this.n, (ViewGroup.LayoutParams)layoutParams);
                    this.k();
                    if (this.r.m && this.r.e != -1) {
                        this.postDelayed(this.D, 3000);
                    }
                }
                if (this.s) {
                    this.m.setVisibility(8);
                } else {
                    this.m.a(this.q, (int)(this.d - this.h + (float)(a / 2)), (int)(this.e - this.i + (float)(a / 2)));
                }
            }
        } else {
            this.n.setVisibility(8);
            this.n.getLayoutParams().width = 0;
            this.m.setVisibility(8);
            this.k();
            this.c();
        }
    }

    private void k() {
        this.removeCallbacks(this.D);
        this.o.b();
        this.s = false;
    }

    public void a(View view, float f2, float f3) {
        j.a(view, "_vds_hybrid.hoverOn", Float.valueOf(f2), Float.valueOf(f3));
    }

    public void a(View view) {
        j.a(view, "_vds_hybrid.findElementAtPoint", new Object[0]);
        this.k = view;
    }

    public void c() {
        if (this.k != null) {
            j.a(this.k, "_vds_hybrid.cancelHover", new Object[0]);
            this.k = null;
        }
    }

    private static boolean c(View view) {
        boolean bl2 = false;
        try {
            if (z == null) {
                Class class_ = Class.forName("android.view.View");
                z = class_.getDeclaredMethod("isVisibleToUser", new Class[0]);
                z.setAccessible(true);
            }
            bl2 = (Boolean)z.invoke((Object)view, new Object[0]);
        }
        catch (IllegalAccessException var2_3) {
        }
        catch (ClassNotFoundException var2_4) {
        }
        catch (NoSuchMethodException var2_5) {
        }
        catch (InvocationTargetException var2_6) {
            // empty catch block
        }
        return bl2;
    }

    private void a(DialogFragment dialogFragment, String string) {
        this.getCircleManager().a(dialogFragment, string);
    }

    private void l() {
        if (this.p != null) {
            if (this.p.getParent() != null) {
                this.w.removeView((View)this.p);
            }
            this.p = null;
            GConfig.q().a(false);
        }
    }

    public void d() {
        this.w.removeView((View)this);
        this.w.removeView((View)this.n);
        if (this.m != null) {
            this.m.c();
        }
        if (this.p != null && this.p.getParent() != null) {
            this.w.removeView((View)this.p);
        }
        if (this.o != null) {
            this.o.c();
            this.w.removeView((View)this.o);
        }
    }

    public void setTags(List tags) {
        this.o.setTags(tags);
    }

    public boolean e() {
        return this.j;
    }

    static /* synthetic */ aq a(a a2) {
        return a2.n;
    }

    static /* synthetic */ bi b(a a2) {
        return a2.o;
    }

    static /* synthetic */ void c(a a2) {
        a2.l();
    }

    static /* synthetic */ void a(a a2, DialogFragment dialogFragment, String string) {
        a2.a(dialogFragment, string);
    }

    static /* synthetic */ boolean b(View view) {
        return a.c(view);
    }

    static /* synthetic */ Rect d(a a2) {
        return a2.t;
    }

    static /* synthetic */ Point e(a a2) {
        return a2.l;
    }

    static /* synthetic */ boolean f(a a2) {
        return a2.v;
    }

    static /* synthetic */ boolean a(a a2, boolean bl2) {
        a2.v = bl2;
        return a2.v;
    }

    static /* synthetic */ List g(a a2) {
        return a2.u;
    }

    static /* synthetic */ Rect h(a a2) {
        return a2.q;
    }

    static /* synthetic */ boolean a(a a2, Rect rect, Rect rect2) {
        return a2.a(rect, rect2);
    }

    static /* synthetic */ com.growingio.android.sdk.b.i i(a a2) {
        return a2.r;
    }

    static /* synthetic */ boolean b(a a2, boolean bl2) {
        a2.s = bl2;
        return a2.s;
    }
}

