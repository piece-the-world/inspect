/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.app.Fragment
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.support.v4.app.Fragment
 *  android.support.v4.view.ViewPager
 *  android.support.v7.widget.RecyclerView
 *  android.text.TextUtils
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 *  android.widget.AdapterView
 *  com.tencent.smtt.sdk.WebChromeClient
 *  com.tencent.smtt.sdk.WebView
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.collection;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.widget.AdapterView;
import com.growingio.android.sdk.b.k;
import com.growingio.android.sdk.collection.ActivityLifecycleCallbacksRegistrar;
import com.growingio.android.sdk.collection.Configuration;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.ag;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.collection.d;
import com.growingio.android.sdk.collection.e;
import com.growingio.android.sdk.collection.n;
import com.growingio.android.sdk.collection.o;
import com.growingio.android.sdk.collection.p;
import com.growingio.android.sdk.collection.q;
import com.growingio.android.sdk.utils.f;
import com.tencent.smtt.sdk.WebView;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import org.json.JSONObject;

public class GrowingIO {
    private static GrowingIO a = null;
    private static final Object b = new Object();
    private GConfig c;
    private ActivityLifecycleCallbacksRegistrar d;
    public static final int GROWING_TAG_KEY = 84159238;
    public static final int GROWING_WEB_CLIENT_KEY = 84159239;
    public static final int GROWING_WEB_BRIDGE_KEY = 84159240;
    public static final int GROWING_VIEW_NAME_KEY = 84159241;
    public static final int GROWING_VIEW_ID_KEY = 84159242;
    public static final int GROWING_INHERIT_INFO_KEY = 84159243;
    public static final int GROWING_CONTENT_KEY = 84159244;
    public static final int GROWING_MONITORING_VIEWTREE_KEY = 84159245;

    public static String getVersion() {
        return "0.9.90";
    }

    private static c a() {
        return c.h();
    }

    private GrowingIO() {
    }

    @Deprecated
    public static GrowingIO startTracing(Context context, String string) {
        return GrowingIO.startTracing(context, string, 1.0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Deprecated
    public static GrowingIO startTracing(Context context, String string, double d2) {
        if (!GConfig.isInstrumented()) {
            Log.e((String)"GrowingIO", (String)"Your app have not been instrumented, SDK can't work correctly.");
            return new p(null);
        }
        if (Build.VERSION.SDK_INT < 14) {
            Log.e((String)"GrowingIO", (String)"GrowingIO is not support this device which version less than IceCreamSandwich");
            return new p(null);
        }
        if (null == context || TextUtils.isEmpty((CharSequence)string)) {
            Log.e((String)"GrowingIO", (String)"start GrowingIO auto tracing need a context and token");
            return new p(null);
        }
        f.a(context);
        if (!f.a() || !f.b()) {
            Log.e((String)"GrowingIO", (String)"GrowingIO need to access internet, Please add INTERNET and ACCESS_NETWORK_STATE permissions to your app");
            return new p(null);
        }
        Object object = b;
        synchronized (object) {
            if (null == a) {
                try {
                    a = new GrowingIO((Application)context.getApplicationContext(), string, d2);
                }
                catch (Exception var5_4) {
                    return new p(null);
                }
            }
        }
        return a;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static GrowingIO startWithConfiguration(Application application, Configuration configuration) {
        int n2;
        if (Build.VERSION.SDK_INT < 14) {
            Log.e((String)"GrowingIO", (String)"GrowingIO \u6682\u4e0d\u652f\u6301Android 4.0\u4ee5\u4e0b\u7248\u672c");
            return new p(null);
        }
        configuration.a = application;
        Resources resources = application.getResources();
        if (TextUtils.isEmpty((CharSequence)configuration.b)) {
            configuration.b = resources.getString(resources.getIdentifier("growingio_project_id", "string", application.getPackageName()));
            if (TextUtils.isEmpty((CharSequence)configuration.b)) {
                throw new IllegalStateException("\u672a\u68c0\u6d4b\u5230\u6709\u6548\u7684\u9879\u76eeID, \u8bf7\u53c2\u8003\u5e2e\u52a9\u6587\u6863 https://help.growingio.com/SDK/Android.html");
            }
        }
        if (TextUtils.isEmpty((CharSequence)configuration.c)) {
            configuration.c = resources.getString(resources.getIdentifier("growingio_url_scheme", "string", application.getPackageName()));
            if (TextUtils.isEmpty((CharSequence)configuration.c)) {
                throw new IllegalStateException("\u672a\u68c0\u6d4b\u5230\u6709\u6548\u7684URL Scheme, \u8bf7\u53c2\u8003\u5e2e\u52a9\u6587\u6863 https://help.growingio.com/SDK/Android.html");
            }
        }
        if (TextUtils.isEmpty((CharSequence)configuration.e) && (n2 = resources.getIdentifier("growingio_channel", "string", application.getPackageName())) > 0) {
            try {
                configuration.e = resources.getString(n2);
            }
            catch (Exception var4_5) {
                // empty catch block
            }
        }
        f.a((Context)configuration.a);
        if (!f.a() || !f.b()) {
            throw new IllegalStateException("\u60a8\u7684App\u6ca1\u6709\u7f51\u7edc\u6743\u9650, \u8bf7\u6dfb\u52a0 INTERNET \u548c ACCESS_NETWORK_STATE \u6743\u9650");
        }
        if (!GConfig.isInstrumented()) {
            throw new IllegalStateException("GrowingIO\u65e0\u6cd5\u6b63\u5e38\u542f\u52a8, \u8bf7\u68c0\u67e5:\n1. \u9996\u6b21\u96c6\u6210\u65f6\u8bf7\u5148Clean\u9879\u76ee\u518d\u91cd\u65b0\u7f16\u8bd1.\n2. (Gradle\u73af\u5883) \u786e\u4fdd\u5df2\u7ecf\u542f\u7528\u4e86GrowingIO\u63d2\u4ef6(\u5728build.gradle > buildscript > dependencies \u4e2d\u6dfb\u52a0 classpath: 'com.growingio.android:vds-gradle-plugin:0.9.90' \u7136\u540e\u5728app\u76ee\u5f55\u4e0b\u7684build.gradle\u4e2d\u6dfb\u52a0apply plugin: 'com.growingio.android'.\n3. (Ant\u73af\u5883) \u5c06vds-class-rewriter.jar\u7684\u8def\u5f84\u6dfb\u52a0\u5230\u73af\u5883\u53d8\u91cfANT_OPTS\u4e2d.\n\u6709\u7591\u95ee\u8bf7\u53c2\u8003\u5e2e\u52a9\u6587\u6863 https://help.growingio.com/SDK/Android.html , \u6216\u8005\u8054\u7cfb\u5728\u7ebf\u5ba2\u670d https://www.growingio.com/");
        }
        Object object = b;
        synchronized (object) {
            if (null == a) {
                try {
                    a = new GrowingIO(configuration);
                }
                catch (Exception var4_6) {
                    return new p(null);
                }
            }
        }
        return a;
    }

    @TargetApi(value=14)
    public GrowingIO(Configuration configuration) {
        GConfig.a(configuration);
        c.a(configuration);
        this.c = GConfig.o();
        if (!this.c.a()) {
            Log.d((String)"GrowingIO", (String)"GrowingIO \u5df2\u7981\u7528");
            return;
        }
        if (this.c.b() > 0.0) {
            configuration.f = this.c.b();
        }
        q.a((Context)configuration.a, GrowingIO.a((Context)configuration.a, configuration.f));
        this.setActivityLifecycleCallbacksRegistrar(configuration.t != null ? configuration.t : new n(this, configuration));
        GrowingIO.a().a(q.d());
        this.d.registerActivityLifecycleCallbacks(GrowingIO.a());
        Log.i((String)"GrowingIO", (String)"!!! Thank you very much for using GrowingIO. We will do our best to provide you with the best service. !!!");
        Log.i((String)"GrowingIO", (String)"!!! GrowingIO version: 0.9.90_6a708c0 !!!");
    }

    @Deprecated
    @TargetApi(value=14)
    private GrowingIO(Application application, String string, double d2) {
        this(new Configuration(string).setProjectId(string).setSampling(d2).setContext(application));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static GrowingIO getInstance() {
        Object object = b;
        synchronized (object) {
            if (null == a) {
                Log.e((String)"GrowingIO", (String)"GrowingIO \u8fd8\u672a\u521d\u59cb\u5316, \u8bf7\u5148\u8c03\u7528startWithConfiguration().");
                return new p(null);
            }
            return a;
        }
    }

    public GrowingIO setActivityLifecycleCallbacksRegistrar(ActivityLifecycleCallbacksRegistrar activityLifecycleCallbacksRegistrar) {
        this.d = activityLifecycleCallbacksRegistrar;
        return this;
    }

    private static void a(Object object, List list) {
        if (object instanceof View) {
            View view = (View)object;
            k k2 = new k();
            k2.a = 2;
            k2.b = view;
            k2.c = list;
            view.setTag(84159238, (Object)k2);
        }
    }

    public static void trackBanner(AdapterView adapterView, List list) {
        GrowingIO.a((Object)adapterView, list);
    }

    public static void trackBanner(RecyclerView recyclerView, List list) {
        GrowingIO.a((Object)recyclerView, list);
    }

    public static void trackBanner(ViewPager viewPager, List list) {
        GrowingIO.a((Object)viewPager, list);
    }

    public static void ignoredView(View view) {
        k k2 = new k();
        k2.a = 1;
        view.setTag(84159238, (Object)k2);
    }

    public static void setViewInfo(View view, String string) {
        view.setTag(84159243, (Object)string);
    }

    public static void setViewContent(View view, String string) {
        view.setTag(84159244, (Object)string);
    }

    public GrowingIO setPageName(Activity activity, String string) {
        GrowingIO.a().a(activity.hashCode(), string);
        return this;
    }

    @TargetApi(value=11)
    public GrowingIO setPageName(Fragment fragment, String string) {
        GrowingIO.a().a(fragment.hashCode(), string);
        return this;
    }

    public GrowingIO setPageName(android.support.v4.app.Fragment fragment, String string) {
        GrowingIO.a().a(fragment.hashCode(), string);
        return this;
    }

    public static void setViewID(View view, String string) {
        view.setTag(84159242, (Object)string);
    }

    @Deprecated
    public static void setScheme(String string) {
        GConfig.d = string;
    }

    @Deprecated
    public GrowingIO setThrottle(boolean bl2) {
        this.c.d(bl2);
        return this;
    }

    @Deprecated
    public GrowingIO disable() {
        this.c.y();
        return this;
    }

    @Deprecated
    public static void setTabName(View view, String string) {
        view.setTag(84159241, (Object)string);
    }

    @Deprecated
    public static void setPressed(View view) {
        view.setPressed(true);
        view.setClickable(true);
        view.postDelayed((Runnable)new o(view), (long)ViewConfiguration.getPressedStateDuration());
    }

    @Deprecated
    public static void useID() {
        GConfig.b = true;
        GConfig.c = true;
    }

    public void trackFragment(Activity activity, android.support.v4.app.Fragment fragment) {
        GrowingIO.a().a(activity, fragment);
    }

    public void trackFragment(Activity activity, Fragment fragment) {
        GrowingIO.a().a(activity, fragment);
    }

    public GrowingIO setCS1(String string, String string2) {
        GrowingIO.a().a(0, string, string2);
        return this;
    }

    public GrowingIO setCS2(String string, String string2) {
        GrowingIO.a().a(1, string, string2);
        return this;
    }

    public GrowingIO setCS3(String string, String string2) {
        GrowingIO.a().a(2, string, string2);
        return this;
    }

    public GrowingIO setCS4(String string, String string2) {
        GrowingIO.a().a(3, string, string2);
        return this;
    }

    public GrowingIO setCS5(String string, String string2) {
        GrowingIO.a().a(4, string, string2);
        return this;
    }

    public GrowingIO setCS6(String string, String string2) {
        GrowingIO.a().a(5, string, string2);
        return this;
    }

    public GrowingIO setCS7(String string, String string2) {
        GrowingIO.a().a(6, string, string2);
        return this;
    }

    public GrowingIO setCS8(String string, String string2) {
        GrowingIO.a().a(7, string, string2);
        return this;
    }

    public GrowingIO setCS9(String string, String string2) {
        GrowingIO.a().a(8, string, string2);
        return this;
    }

    public GrowingIO setCS10(String string, String string2) {
        GrowingIO.a().a(9, string, string2);
        return this;
    }

    public GrowingIO setPageGroup(Activity activity, String string) {
        this.a((Object)activity, 0, string);
        return this;
    }

    public GrowingIO setPS1(Activity activity, String string) {
        this.a((Object)activity, 1, string);
        return this;
    }

    public GrowingIO setPS2(Activity activity, String string) {
        this.a((Object)activity, 2, string);
        return this;
    }

    public GrowingIO setPS3(Activity activity, String string) {
        this.a((Object)activity, 3, string);
        return this;
    }

    public GrowingIO setPS4(Activity activity, String string) {
        this.a((Object)activity, 4, string);
        return this;
    }

    public GrowingIO setPS5(Activity activity, String string) {
        this.a((Object)activity, 5, string);
        return this;
    }

    public GrowingIO setPS6(Activity activity, String string) {
        this.a((Object)activity, 6, string);
        return this;
    }

    public GrowingIO setPageGroup(Fragment fragment, String string) {
        this.a((Object)fragment, 0, string);
        return this;
    }

    public GrowingIO setPS1(Fragment fragment, String string) {
        this.a((Object)fragment, 1, string);
        return this;
    }

    public GrowingIO setPS2(Fragment fragment, String string) {
        this.a((Object)fragment, 2, string);
        return this;
    }

    public GrowingIO setPS3(Fragment fragment, String string) {
        this.a((Object)fragment, 3, string);
        return this;
    }

    public GrowingIO setPS4(Fragment fragment, String string) {
        this.a((Object)fragment, 4, string);
        return this;
    }

    public GrowingIO setPS5(Fragment fragment, String string) {
        this.a((Object)fragment, 5, string);
        return this;
    }

    public GrowingIO setPS6(Fragment fragment, String string) {
        this.a((Object)fragment, 6, string);
        return this;
    }

    public GrowingIO setPageGroup(android.support.v4.app.Fragment fragment, String string) {
        this.a((Object)fragment, 0, string);
        return this;
    }

    public GrowingIO setPS1(android.support.v4.app.Fragment fragment, String string) {
        this.a((Object)fragment, 1, string);
        return this;
    }

    public GrowingIO setPS2(android.support.v4.app.Fragment fragment, String string) {
        this.a((Object)fragment, 2, string);
        return this;
    }

    public GrowingIO setPS3(android.support.v4.app.Fragment fragment, String string) {
        this.a((Object)fragment, 3, string);
        return this;
    }

    public GrowingIO setPS4(android.support.v4.app.Fragment fragment, String string) {
        this.a((Object)fragment, 4, string);
        return this;
    }

    public GrowingIO setPS5(android.support.v4.app.Fragment fragment, String string) {
        this.a((Object)fragment, 5, string);
        return this;
    }

    public GrowingIO setPS6(android.support.v4.app.Fragment fragment, String string) {
        this.a((Object)fragment, 6, string);
        return this;
    }

    protected GrowingIO a(Object object, int n2, String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            throw new IllegalArgumentException("property cannot be empty");
        }
        this.a(object).put(n2, (Object)string);
        q q2 = q.d();
        if (q2 != null) {
            q2.f();
        }
        return this;
    }

    private SparseArray a(Object object) {
        SparseArray sparseArray = (SparseArray)GrowingIO.a().a().get(object.hashCode());
        if (sparseArray == null) {
            sparseArray = new SparseArray(6);
            GrowingIO.a().a().put(object.hashCode(), (Object)sparseArray);
        }
        return sparseArray;
    }

    @Deprecated
    public GrowingIO setChannel(String string) {
        if (string.length() > 32) {
            string = string.substring(0, 32);
        }
        if (this.c == null) {
            Log.e((String)"GrowingIO", (String)"Pls invoke GrowingIO.startTracking() first");
        }
        this.c.a(string);
        return this;
    }

    @Deprecated
    public GrowingIO disableImpression() {
        if (this.c != null) {
            this.c.e();
        }
        return this;
    }

    private GrowingIO a(e e2) {
        q q2 = q.d();
        if (q2 != null) {
            q2.a(e2);
        }
        return this;
    }

    public GrowingIO track(String string, JSONObject jSONObject) {
        return this.a(new e(string, null, jSONObject));
    }

    @TargetApi(value=9)
    private static String a(String string) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(string.getBytes(Charset.forName("US-ASCII")), 0, string.length());
            byte[] arrby = messageDigest.digest();
            BigInteger bigInteger = new BigInteger(1, arrby);
            String string2 = String.format("%0" + (arrby.length << 1) + "x", bigInteger);
            return string2;
        }
        catch (NoSuchAlgorithmException var2_3) {
            var2_3.printStackTrace();
            return "";
        }
    }

    private static boolean a(Context context, double d2) {
        if (d2 <= 0.0) {
            return false;
        }
        if (d2 >= 0.9999) {
            return true;
        }
        char[] arrc = GrowingIO.a(GrowingIO.a().i()).toCharArray();
        long l2 = 100000;
        long l3 = (long)((d2 + (double)(1.0f / (float)l2)) * (double)l2);
        long l4 = 1;
        for (int i2 = arrc.length - 1; i2 >= 0; --i2) {
            char c2 = arrc[i2];
            l4 = (l4 * 256 + (long)c2) % l2;
        }
        return l4 < l3;
    }

    @Deprecated
    public static void trackWebView(android.webkit.WebView webView, WebChromeClient webChromeClient) {
        webView.setWebChromeClient(webChromeClient);
        webView.setTag(84159239, (Object)webChromeClient);
        if (GConfig.a) {
            Log.d((String)"GrowingIO", (String)("trackWebView: " + (Object)webView + " with client " + (Object)webChromeClient));
        }
        ag.a((View)webView, null);
    }

    @Deprecated
    public static void trackX5WebView(WebView webView, com.tencent.smtt.sdk.WebChromeClient webChromeClient) {
        webView.setWebChromeClient(webChromeClient);
        webView.setTag(84159239, (Object)webChromeClient);
        if (GConfig.a) {
            Log.d((String)"GrowingIO", (String)("trackWebView: " + (Object)webView + " with client " + (Object)webChromeClient));
        }
        ag.a((View)webView, null);
    }

    /* synthetic */ GrowingIO(n n2) {
        this();
    }
}

