/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.content.res.ColorStateList
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Base64OutputStream
 *  android.util.DisplayMetrics
 *  android.util.JsonWriter
 *  android.util.LruCache
 *  android.view.Display
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.WindowManager
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64OutputStream;
import android.util.DisplayMetrics;
import android.util.JsonWriter;
import android.util.LruCache;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.tendcloud.tenddata.cs;
import com.tendcloud.tenddata.dh;
import com.tendcloud.tenddata.dj;
import com.tendcloud.tenddata.dm;
import com.tendcloud.tenddata.dn;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

@TargetApi(value=16)
class dq {
    private final c a;
    private final List b;
    private final b c;
    private final Handler d;
    private final dn e;
    private static String f = "";
    private static final int g = 255;

    dq(List list, dn dn2) {
        this.b = list;
        this.e = dn2;
        this.d = new Handler(Looper.getMainLooper());
        this.a = new c();
        this.c = new b(255);
    }

    void a(dh dh2, OutputStream outputStream) {
        this.a.findInActivities(dh2);
        FutureTask futureTask = new FutureTask(this.a);
        this.d.post(futureTask);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        List list = Collections.emptyList();
        outputStreamWriter.write("[");
        try {
            list = (List)futureTask.get(1, TimeUnit.SECONDS);
        }
        catch (InterruptedException var8_6) {
        }
        catch (TimeoutException var8_7) {
        }
        catch (ExecutionException var8_8) {
            // empty catch block
        }
        long l2 = System.currentTimeMillis();
        int n2 = list.size();
        for (int i2 = 0; i2 < (n2 == 0 ? 0 : 1); ++i2) {
            if (i2 > 0) {
                outputStreamWriter.write(",");
            }
            d d2 = (d)list.get(i2);
            outputStreamWriter.write("{");
            outputStreamWriter.write("\"activity\":");
            outputStreamWriter.write(JSONObject.quote((String)d2.a));
            outputStreamWriter.write(",");
            outputStreamWriter.write("\"scale\":");
            outputStreamWriter.write(String.format("%s", Float.valueOf(d2.d)));
            outputStreamWriter.write(",");
            outputStreamWriter.write("\"serialized_objects\":");
            JsonWriter jsonWriter = new JsonWriter((Writer)outputStreamWriter);
            jsonWriter.beginObject();
            jsonWriter.name("rootObject").value((long)d2.b.hashCode());
            jsonWriter.name("objects");
            this.a(jsonWriter, d2.b);
            jsonWriter.endObject();
            jsonWriter.flush();
            outputStreamWriter.write(",");
            outputStreamWriter.write("\"screenshot\":");
            outputStreamWriter.flush();
            d2.c.a(Bitmap.CompressFormat.JPEG, 60, outputStream);
            outputStreamWriter.write(",");
            outputStreamWriter.write("\"image_hash\":");
            outputStreamWriter.write(JSONObject.quote((String)f));
            outputStreamWriter.write("}");
        }
        outputStreamWriter.write("]");
        outputStreamWriter.flush();
    }

    List a() {
        return this.b;
    }

    void a(JsonWriter jsonWriter, View view) {
        jsonWriter.beginArray();
        this.b(jsonWriter, view);
        jsonWriter.endArray();
    }

    private void b(JsonWriter jsonWriter, View view) {
        RelativeLayout.LayoutParams layoutParams;
        int n2 = view.getId();
        String string = -1 == n2 ? null : this.e.a(n2);
        jsonWriter.beginObject();
        jsonWriter.name("hashCode").value((long)view.hashCode());
        jsonWriter.name("id").value((long)n2);
        jsonWriter.name("id_name").value(string);
        CharSequence charSequence = view.getContentDescription();
        if (null == charSequence) {
            jsonWriter.name("contentDescription").nullValue();
        } else {
            jsonWriter.name("contentDescription").value(charSequence.toString());
        }
        Object object = view.getTag();
        if (null == object) {
            jsonWriter.name("tag").nullValue();
        } else if (object instanceof CharSequence) {
            jsonWriter.name("tag").value(object.toString());
        }
        jsonWriter.name("top").value((long)view.getTop());
        jsonWriter.name("left").value((long)view.getLeft());
        jsonWriter.name("width").value((long)view.getWidth());
        jsonWriter.name("height").value((long)view.getHeight());
        jsonWriter.name("scrollX").value((long)view.getScrollX());
        jsonWriter.name("scrollY").value((long)view.getScrollY());
        jsonWriter.name("visibility").value((long)view.getVisibility());
        float f2 = 0.0f;
        float f3 = 0.0f;
        if (Build.VERSION.SDK_INT >= 11) {
            f2 = view.getTranslationX();
            f3 = view.getTranslationY();
        }
        jsonWriter.name("translationX").value((double)f2);
        jsonWriter.name("translationY").value((double)f3);
        jsonWriter.name("classes");
        jsonWriter.beginArray();
        Class class_ = view.getClass();
        do {
            jsonWriter.value((String)this.c.get(class_));
        } while ((class_ = class_.getSuperclass()) != Object.class && class_ != null);
        jsonWriter.endArray();
        this.c(jsonWriter, view);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
            layoutParams = (RelativeLayout.LayoutParams)layoutParams2;
            int[] arrn = layoutParams.getRules();
            jsonWriter.name("layoutRules");
            jsonWriter.beginArray();
            for (int n3 : arrn) {
                jsonWriter.value((long)n3);
            }
            jsonWriter.endArray();
        }
        jsonWriter.name("subviews");
        jsonWriter.beginArray();
        if (view instanceof ViewGroup) {
            layoutParams = (ViewGroup)view;
            int n4 = layoutParams.getChildCount();
            for (int i2 = 0; i2 < n4; ++i2) {
                View view2 = layoutParams.getChildAt(i2);
                if (null == view2) continue;
                jsonWriter.value((long)view2.hashCode());
            }
        }
        jsonWriter.endArray();
        jsonWriter.endObject();
        if (view instanceof ViewGroup) {
            layoutParams = (ViewGroup)view;
            int n5 = layoutParams.getChildCount();
            for (int i3 = 0; i3 < n5; ++i3) {
                View view3 = layoutParams.getChildAt(i3);
                if (null == view3) continue;
                this.b(jsonWriter, view3);
            }
        }
    }

    private void c(JsonWriter jsonWriter, View view) {
        Class class_ = view.getClass();
        for (dj.b b2 : this.b) {
            Object object;
            if (!b2.b.isAssignableFrom(class_) || null == b2.c || null == (object = b2.c.a(view))) continue;
            if (object instanceof Number) {
                jsonWriter.name(b2.a).value((Number)object);
                continue;
            }
            if (object instanceof Boolean) {
                jsonWriter.name(b2.a).value(((Boolean)object).booleanValue());
                continue;
            }
            if (object instanceof ColorStateList) {
                jsonWriter.name(b2.a).value((Number)((ColorStateList)object).getDefaultColor());
                continue;
            }
            if (object instanceof Drawable) {
                Drawable drawable2 = (Drawable)object;
                Rect rect = drawable2.getBounds();
                jsonWriter.name(b2.a);
                jsonWriter.beginObject();
                jsonWriter.name("classes");
                jsonWriter.beginArray();
                for (Class class_2 = drawable2.getClass(); class_2 != Object.class; class_2 = class_2.getSuperclass()) {
                    jsonWriter.value(class_2.getCanonicalName());
                }
                jsonWriter.endArray();
                jsonWriter.name("dimensions");
                jsonWriter.beginObject();
                jsonWriter.name("left").value((long)rect.left);
                jsonWriter.name("right").value((long)rect.right);
                jsonWriter.name("top").value((long)rect.top);
                jsonWriter.name("bottom").value((long)rect.bottom);
                jsonWriter.endObject();
                if (drawable2 instanceof ColorDrawable) {
                    ColorDrawable colorDrawable = (ColorDrawable)drawable2;
                    jsonWriter.name("color").value((long)colorDrawable.getColor());
                }
                jsonWriter.endObject();
                continue;
            }
            jsonWriter.name(b2.a).value(object.toString());
        }
    }

    static String a(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)byteArrayOutputStream);
            byte[] arrby = MessageDigest.getInstance("MD5").digest(byteArrayOutputStream.toByteArray());
            return cs.a(arrby);
        }
        catch (NoSuchAlgorithmException var1_2) {
            var1_2.printStackTrace();
            return "";
        }
    }

    static class d {
        final String a;
        final View b;
        a c;
        float d;

        d(String string, View view) {
            this.a = string;
            this.b = view;
            this.c = null;
            this.d = 1.0f;
        }
    }

    static class a {
        private Bitmap a = null;
        private final Paint b = new Paint(2);

        synchronized void a(int n2, int n3, int n4, Bitmap bitmap) {
            if (null == this.a || this.a.getWidth() != n2 || this.a.getHeight() != n3) {
                try {
                    this.a = Bitmap.createBitmap((int)n2, (int)n3, (Bitmap.Config)Bitmap.Config.RGB_565);
                }
                catch (OutOfMemoryError var5_5) {
                    this.a = null;
                }
                if (null != this.a) {
                    this.a.setDensity(n4);
                }
            }
            if (null != this.a) {
                Canvas canvas = new Canvas(this.a);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.b);
            }
        }

        synchronized String a(Bitmap.CompressFormat compressFormat, int n2, OutputStream outputStream) {
            if (null == this.a || this.a.getWidth() == 0 || this.a.getHeight() == 0) {
                outputStream.write("null".getBytes());
                return "";
            }
            outputStream.write(34);
            String string = dq.a(this.a);
            if (string != null && !string.equals(f)) {
                f = string;
                Base64OutputStream base64OutputStream = new Base64OutputStream(outputStream, 2);
                this.a.compress(compressFormat, n2, (OutputStream)base64OutputStream);
                base64OutputStream.flush();
            }
            outputStream.write(34);
            return dq.a(this.a);
        }
    }

    static class c
    implements Callable {
        private dh a;
        private final List b = new ArrayList();
        private final DisplayMetrics c = new DisplayMetrics();
        private final a d = new a();
        private final int e = 160;

        public void findInActivities(dh dh2) {
            this.a = dh2;
        }

        public List a() {
            Object object;
            this.b.clear();
            Set set = this.a.a();
            for (Activity activity : set) {
                object = activity.getClass().getCanonicalName();
                View view = activity.getWindow().getDecorView().getRootView();
                activity.getWindowManager().getDefaultDisplay().getMetrics(this.c);
                d d2 = new d((String)object, view);
                this.b.add(d2);
            }
            int n2 = this.b.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                object = (d)this.b.get(i2);
                this.a((d)object);
            }
            return this.b;
        }

        private void a(d d2) {
            Object object;
            View view = d2.b;
            Bitmap bitmap = null;
            try {
                object = View.class.getDeclaredMethod("createSnapshot", Bitmap.Config.class, Integer.TYPE, Boolean.TYPE);
                object.setAccessible(true);
                bitmap = (Bitmap)object.invoke((Object)view, new Object[]{Bitmap.Config.RGB_565, -1, false});
            }
            catch (NoSuchMethodException var4_5) {
            }
            catch (Exception var4_6) {
                // empty catch block
            }
            object = null;
            try {
                if (null == bitmap) {
                    object = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    view.buildDrawingCache(true);
                    bitmap = view.getDrawingCache();
                }
            }
            catch (RuntimeException var5_7) {
                // empty catch block
            }
            float f2 = 1.0f;
            if (null != bitmap) {
                int n2 = bitmap.getDensity();
                if (n2 != 0) {
                    f2 = 160.0f / (float)n2;
                }
                int n3 = bitmap.getWidth();
                int n4 = bitmap.getHeight();
                int n5 = (int)((double)((float)bitmap.getWidth() * f2) + 0.5);
                int n6 = (int)((double)((float)bitmap.getHeight() * f2) + 0.5);
                if (n3 > 0 && n4 > 0 && n5 > 0 && n6 > 0) {
                    this.d.a(n5, n6, 160, bitmap);
                }
            }
            if (null != object && !object.booleanValue()) {
                view.setDrawingCacheEnabled(false);
            }
            d2.d = f2;
            d2.c = this.d;
        }

        public /* synthetic */ Object call() {
            return this.a();
        }
    }

    static class b
    extends LruCache {
        public b(int n2) {
            super(n2);
        }

        protected String a(Class class_) {
            return class_.getCanonicalName();
        }

        protected /* synthetic */ Object create(Object object) {
            return this.a((Class)object);
        }
    }

}

