/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Xfermode
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 */
package com.growingio.android.sdk.circle;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.growingio.android.sdk.circle.bu;
import com.growingio.android.sdk.circle.i;
import com.growingio.android.sdk.collection.q;
import com.growingio.android.sdk.utils.g;
import com.growingio.android.sdk.utils.m;
import com.growingio.android.sdk.utils.o;

public class h
extends View {
    private int a = 2005;
    private WindowManager b;
    private Rect c;
    private Bitmap d;
    private int e;
    private int f;
    private int g;
    private int h;
    private float i;
    private float j;
    private int k;
    private final float l = 1.17f;
    private i m = i.a;

    public h(Context context) {
        super(context);
        this.a();
    }

    public void a() {
        this.b = (WindowManager)this.getContext().getApplicationContext().getSystemService("window");
        this.k = com.growingio.android.sdk.utils.i.a(this.getContext(), 80.0f);
        this.e = com.growingio.android.sdk.utils.i.a(this.getContext(), 120.0f);
        this.f = com.growingio.android.sdk.utils.i.a(this.getContext(), 80.0f);
        this.h = com.growingio.android.sdk.utils.i.a(this.getContext(), 16.0f);
        this.g = com.growingio.android.sdk.utils.i.a(this.getContext(), 18.0f);
    }

    public void b() {
        if (Build.VERSION.SDK_INT < 19) {
            this.a = 2002;
        }
        int n2 = 312;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(0, 0, this.a, n2, -3);
        layoutParams.gravity = 51;
        layoutParams.setTitle((CharSequence)("CircleMagnifierWindow:" + this.getContext().getPackageName()));
        this.setVisibility(8);
        this.b.addView((View)this, (ViewGroup.LayoutParams)layoutParams);
    }

    public void a(Rect rect, int n2, int n3) {
        if (rect == null || rect.width() >= this.k || rect.height() >= this.k) {
            this.setVisibility(8);
            return;
        }
        int n4 = this.getResources().getDisplayMetrics().widthPixels;
        float f2 = (float)(this.e / 2 - com.growingio.android.sdk.utils.i.a(this.getContext(), 2.0f)) / 1.17f;
        this.i = (float)n2 > (float)n4 - f2 ? (float)n4 - f2 : ((float)n2 < f2 ? f2 : (float)n2);
        this.j = n3 < this.f / 2 ? (float)(this.f / 2) : (float)n3;
        this.c = rect;
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams)this.getLayoutParams();
        int n5 = com.growingio.android.sdk.utils.i.a(this.getContext(), 1.0f);
        if (rect.top - this.f >= this.h + n5) {
            layoutParams.width = this.e;
            layoutParams.height = this.f + this.h;
            layoutParams.x = rect.left + rect.width() / 2 - layoutParams.width / 2;
            layoutParams.y = rect.top - layoutParams.height - n5;
            this.m = i.a;
        } else if (rect.left - this.getWidth() >= this.h + n5) {
            layoutParams.width = this.e + this.h;
            layoutParams.height = this.f;
            layoutParams.x = rect.left - layoutParams.width - n5;
            layoutParams.y = rect.top + rect.height() / 2 - layoutParams.height / 2;
            this.m = i.b;
        } else {
            layoutParams.width = this.e + this.h;
            layoutParams.height = this.f;
            layoutParams.x = rect.right + n5;
            layoutParams.y = rect.top + rect.height() / 2 - layoutParams.height / 2;
            this.m = i.c;
        }
        this.b.updateViewLayout((View)this, (ViewGroup.LayoutParams)layoutParams);
        this.setVisibility(0);
        this.bringToFront();
        this.invalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View[] arrview = o.c();
        if (arrview.length <= 0) {
            return;
        }
        float f2 = this.getResources().getDisplayMetrics().density * 2.0f;
        float f3 = this.getResources().getDisplayMetrics().density * 5.0f;
        int n2 = this.e / 2;
        int n3 = this.f / 2;
        int n4 = 0;
        Path path = new Path();
        if (this.m == i.a) {
            path.moveTo((float)(n2 - this.g / 2), (float)this.f - f2);
            path.lineTo((float)n2, (float)(this.f + this.h) - f2);
            path.lineTo((float)(n2 + this.g / 2), (float)this.f - f2);
            path.close();
        } else if (this.m == i.b) {
            path.moveTo((float)this.e - f2, (float)(n3 - this.g / 2));
            path.lineTo((float)(this.e + this.h) - f2, (float)n3);
            path.lineTo((float)this.e - f2, (float)(n3 + this.g / 2));
            path.close();
        } else if (this.m == i.c) {
            n4 = this.h;
            path.moveTo((float)n4 + f2, (float)(n3 - this.g / 2));
            path.lineTo(f2, (float)n3);
            path.lineTo((float)n4 + f2, (float)(n3 + this.g / 2));
            path.close();
        }
        Path path2 = new Path();
        path2.addRoundRect(new RectF(f2 + (float)n4, f2, (float)(this.e + n4) - f2, (float)this.f - f2), f3, f3, Path.Direction.CCW);
        Paint paint = new Paint();
        paint.setColor(-986896);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setFilterBitmap(true);
        canvas.drawPath(path2, paint);
        paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.a(arrview, f3);
        canvas.save();
        canvas.translate((float)n4, 0.0f);
        canvas.drawBitmap(this.d, 0.0f, 0.0f, paint);
        canvas.restore();
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f2);
        paint2.setColor(-986896);
        canvas.drawPath(path2, paint2);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setColor(-986896);
        canvas.drawPath(path, paint2);
    }

    private void a(View[] paint, float f2) {
        if (this.d == null) {
            this.d = Bitmap.createBitmap((int)this.e, (int)this.f, (Bitmap.Config)Bitmap.Config.RGB_565);
        }
        Canvas canvas = new Canvas(this.d);
        canvas.scale(1.17f, 1.17f);
        canvas.translate(- this.i + (float)this.e / 2.34f, - this.j + (float)this.f / 2.34f);
        int[] arrn = new int[2];
        boolean bl2 = m.a((View[])paint) > 1;
        for (View view : paint) {
            if (view instanceof bu || view.getVisibility() != 0 || view.getWidth() == 0 || view.getHeight() == 0 || !m.a(view, q.d().a(view), bl2) || "DO_NOT_DRAW".equals(view.getTag())) continue;
            view.getLocationOnScreen(arrn);
            canvas.save(1);
            canvas.translate((float)arrn[0], (float)arrn[1]);
            view.draw(canvas);
            canvas.restore();
        }
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth((float)com.growingio.android.sdk.utils.i.a(this.getContext(), 1.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(g.a("growing_red"));
        canvas.drawRoundRect(new RectF(this.c), f2, f2, paint2);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(g.a("growing_light_red"));
        canvas.drawRoundRect(new RectF(this.c), f2, f2, paint2);
    }

    public void c() {
        if (this.d != null && !this.d.isRecycled()) {
            this.d.recycle();
            this.d = null;
        }
        if (this.getParent() != null) {
            this.b.removeView((View)this);
        }
    }
}

