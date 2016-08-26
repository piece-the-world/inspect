/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextPaint
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.View
 *  android.view.WindowManager
 */
package com.growingio.android.sdk.circle;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.bu;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.collection.q;
import com.growingio.android.sdk.utils.g;
import com.growingio.android.sdk.utils.m;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ct {
    private static boolean a = false;
    private static int b = -1;
    private static int c = -1;
    private static int d = -1;
    private static int e = -1;
    private static double f = -1.0;
    private static float g = -1.0f;
    private static float h = -1.0f;
    private static Bitmap i;

    static void a() {
        if (a) {
            return;
        }
        c c2 = c.h();
        if (c2 == null) {
            return;
        }
        Context context = c2.g();
        if (context == null) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 17) {
            display.getRealMetrics(displayMetrics);
        } else {
            display.getMetrics(displayMetrics);
        }
        b = displayMetrics.widthPixels;
        d = displayMetrics.heightPixels;
        f = 720.0 / (double)b;
        c = (int)(f * (double)b);
        e = (int)(f * (double)d);
        a = true;
        h = com.growingio.android.sdk.utils.i.a(context, 100.0f);
        g = b - com.growingio.android.sdk.utils.i.a(context, 50.0f);
        TextPaint textPaint = new TextPaint();
        int n2 = (int)(displayMetrics.density * 2.0f);
        Rect rect = new Rect();
        String string = "\u622a\u56fe\u5931\u8d25";
        textPaint.setAntiAlias(true);
        textPaint.setColor(-13421773);
        textPaint.setTextSize(displayMetrics.density * 14.0f);
        textPaint.getTextBounds(string, 0, string.length(), rect);
        i = Bitmap.createBitmap((int)(rect.width() + n2 * 2), (int)(rect.height() + n2 * 2), (Bitmap.Config)Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(i);
        canvas.drawText(string, (float)n2, (float)rect.height(), (Paint)textPaint);
    }

    public static Bitmap b() {
        return i;
    }

    public static Bitmap a(i i2) {
        Rect rect = new Rect();
        i2.c.getGlobalVisibleRect(rect);
        View view = i2.c.getRootView();
        Bitmap bitmap = null;
        try {
            if (i2.p != null && !rect.intersect(i2.p)) {
                throw new IllegalStateException("Invisible rect");
            }
            bitmap = Bitmap.createBitmap((int)rect.width(), (int)rect.height(), (Bitmap.Config)Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmap);
            canvas.translate((float)(- rect.left), (float)(- rect.top));
            canvas.clipRect(rect);
            view.draw(canvas);
            return bitmap;
        }
        catch (Exception var4_5) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            return i;
        }
    }

    private static byte[] b(View[] arrview, RectF rectF) {
        byte[] arrby;
        block3 : {
            arrby = null;
            try {
                ByteArrayOutputStream byteArrayOutputStream;
                Bitmap bitmap = ct.a(arrview);
                if (rectF != null) {
                    byteArrayOutputStream = new Canvas(bitmap);
                    Context context = c.h().g();
                    Paint paint = new Paint();
                    float f2 = com.growingio.android.sdk.utils.i.a(c.h().g(), 3.0f);
                    paint.setColor(g.a("growing_light_red"));
                    byteArrayOutputStream.drawRoundRect(rectF, f2, f2, paint);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth((float)com.growingio.android.sdk.utils.i.a(context, 1.0f));
                    paint.setColor(g.a("growing_red"));
                    byteArrayOutputStream.drawRoundRect(rectF, f2, f2, paint);
                }
                byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 70, (OutputStream)byteArrayOutputStream);
                bitmap.recycle();
                arrby = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            }
            catch (Exception var3_4) {
                if (i == null) break block3;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                i.compress(Bitmap.CompressFormat.JPEG, 50, (OutputStream)byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            }
        }
        return arrby;
    }

    static Bitmap a(View[] arrview) {
        Bitmap bitmap = Bitmap.createBitmap((int)ct.d(), (int)ct.f(), (Bitmap.Config)Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmap);
        canvas.scale((float)ct.g(), (float)ct.g());
        int[] arrn = new int[2];
        boolean bl2 = m.a(arrview) > 1;
        for (View view : arrview) {
            if (view instanceof bu || view.getVisibility() != 0 || view.getWidth() == 0 || view.getHeight() == 0 || !m.a(view, q.d().a(view), bl2) || "DO_NOT_DRAW".equals(view.getTag())) continue;
            view.getLocationOnScreen(arrn);
            canvas.save(1);
            canvas.translate((float)arrn[0], (float)arrn[1]);
            view.draw(canvas);
            canvas.restore();
        }
        return bitmap;
    }

    @TargetApi(value=13)
    static byte[] a(View[] arrview, RectF rectF) {
        byte[] arrby = ct.b(arrview, rectF);
        if (arrby == null) {
            arrby = new byte[]{};
        }
        return arrby;
    }

    static byte[] a(Bitmap bitmap, int n2, int n3) {
        if (bitmap == null || n3 <= 0 || n3 <= 0) {
            return new byte[0];
        }
        Bitmap bitmap2 = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n2, (int)n3, (boolean)false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap2.compress(Bitmap.CompressFormat.JPEG, 80, (OutputStream)byteArrayOutputStream);
        bitmap2.recycle();
        byte[] arrby = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        }
        catch (IOException var6_6) {
            // empty catch block
        }
        return arrby;
    }

    static int c() {
        return b;
    }

    static int d() {
        return c;
    }

    static int e() {
        return d;
    }

    static int f() {
        return e;
    }

    public static double g() {
        return f;
    }
}

