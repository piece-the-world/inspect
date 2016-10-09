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
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 *  android.widget.AdapterView
 *  android.widget.EditText
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
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.widget.AdapterView;
import android.widget.EditText;
import com.growingio.android.sdk.b.k;
import com.growingio.android.sdk.collection.ActivityLifecycleCallbacksRegistrar;
import com.growingio.android.sdk.collection.Configuration;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.aj;
import com.growingio.android.sdk.collection.ak;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.collection.e;
import com.growingio.android.sdk.collection.f;
import com.growingio.android.sdk.collection.q;
import com.growingio.android.sdk.collection.r;
import com.growingio.android.sdk.collection.s;
import com.growingio.android.sdk.collection.t;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.a;
import com.growingio.android.sdk.utils.g;
import com.tencent.smtt.sdk.WebView;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import org.json.JSONObject;

public class GrowingIO {
    private static final String TAG = "GrowingIO";
    private static GrowingIO sInstance = null;
    static String sPackageName;
    static String sProjectId;
    private static final Object sInstanceLock;
    private GConfig a;
    private ActivityLifecycleCallbacksRegistrar b;
    public static final int GROWING_TAG_KEY = 84159238;
    public static final int GROWING_WEB_CLIENT_KEY = 84159239;
    public static final int GROWING_WEB_BRIDGE_KEY = 84159240;
    public static final int GROWING_VIEW_NAME_KEY = 84159241;
    public static final int GROWING_VIEW_ID_KEY = 84159242;
    public static final int GROWING_INHERIT_INFO_KEY = 84159243;
    public static final int GROWING_CONTENT_KEY = 84159244;
    public static final int GROWING_MONITORING_VIEWTREE_KEY = 84159245;
    public static final int GROWING_MONITORING_FOCUS_KEY = 84159246;

    public static String getVersion() {
        return "0.9.98";
    }

    private static c a() {
        return c.k();
    }

    private GrowingIO() {
    }

    @Deprecated
    public static GrowingIO startTracing(Context context, String token) {
        return GrowingIO.startTracing(context, token, 1.0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Deprecated
    public static GrowingIO startTracing(Context context, String token, double sampling) {
        if (!GConfig.isInstrumented()) {
            Log.e((String)"GrowingIO", (String)"Your app have not been instrumented, SDK can't work correctly.");
            return new s(null);
        }
        if (Build.VERSION.SDK_INT < 14) {
            Log.e((String)"GrowingIO", (String)"GrowingIO is not support this device which version less than IceCreamSandwich");
            return new s(null);
        }
        if (null == context || TextUtils.isEmpty((CharSequence)token)) {
            Log.e((String)"GrowingIO", (String)"start GrowingIO auto tracing need a context and token");
            return new s(null);
        }
        g.a(context);
        if (!g.a() || !g.b()) {
            Log.e((String)"GrowingIO", (String)"GrowingIO need to access internet, Please add INTERNET and ACCESS_NETWORK_STATE permissions to your app");
            return new s(null);
        }
        Object object = sInstanceLock;
        synchronized (object) {
            if (null == sInstance) {
                try {
                    sInstance = new GrowingIO((Application)context.getApplicationContext(), token, sampling);
                }
                catch (Exception var5_4) {
                    return new s(null);
                }
            }
        }
        return sInstance;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static GrowingIO startWithConfiguration(Application application, Configuration configuration) {
        int n2;
        if (Build.VERSION.SDK_INT < 14) {
            Log.e((String)"GrowingIO", (String)"GrowingIO \u6682\u4e0d\u652f\u6301Android 4.0\u4ee5\u4e0b\u7248\u672c");
            return new s(null);
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
        g.a((Context)configuration.a);
        if (!g.a() || !g.b()) {
            throw new IllegalStateException("\u60a8\u7684App\u6ca1\u6709\u7f51\u7edc\u6743\u9650, \u8bf7\u6dfb\u52a0 INTERNET \u548c ACCESS_NETWORK_STATE \u6743\u9650");
        }
        if (!GConfig.isInstrumented()) {
            throw new IllegalStateException("GrowingIO\u65e0\u6cd5\u6b63\u5e38\u542f\u52a8, \u8bf7\u68c0\u67e5:\n1. \u9996\u6b21\u96c6\u6210\u65f6\u8bf7\u5148Clean\u9879\u76ee\u518d\u91cd\u65b0\u7f16\u8bd1.\n2. (Gradle\u73af\u5883) \u786e\u4fdd\u5df2\u7ecf\u542f\u7528\u4e86GrowingIO\u63d2\u4ef6(\u5728build.gradle > buildscript > dependencies \u4e2d\u6dfb\u52a0 classpath: 'com.growingio.android:vds-gradle-plugin:0.9.98' \u7136\u540e\u5728app\u76ee\u5f55\u4e0b\u7684build.gradle\u4e2d\u6dfb\u52a0apply plugin: 'com.growingio.android'.\n3. (Ant\u73af\u5883) \u5c06vds-class-rewriter.jar\u7684\u8def\u5f84\u6dfb\u52a0\u5230\u73af\u5883\u53d8\u91cfANT_OPTS\u4e2d.\n\u6709\u7591\u95ee\u8bf7\u53c2\u8003\u5e2e\u52a9\u6587\u6863 https://help.growingio.com/SDK/Android.html , \u6216\u8005\u8054\u7cfb\u5728\u7ebf\u5ba2\u670d https://www.growingio.com/");
        }
        c.a(configuration);
        GConfig.a(configuration);
        GConfig gConfig = GConfig.q();
        LogUtil.d("GrowingIO", gConfig);
        if (!gConfig.a()) {
            Log.d((String)"GrowingIO", (String)"GrowingIO \u5df2\u7981\u7528");
            return new s(null);
        }
        if (gConfig.b() > 0.0) {
            configuration.f = gConfig.b();
        }
        if (!GrowingIO.a(configuration.f)) {
            return new s(null);
        }
        Object object = sInstanceLock;
        synchronized (object) {
            if (null == sInstance) {
                try {
                    sInstance = new GrowingIO(configuration);
                }
                catch (Exception var5_7) {
                    return new s(null);
                }
            }
        }
        return sInstance;
    }

    @TargetApi(value=14)
    public GrowingIO(Configuration configuration) {
        this.a = GConfig.q();
        t.a((Context)configuration.a);
        this.setActivityLifecycleCallbacksRegistrar(configuration.u != null ? configuration.u : new q(this, configuration));
        GrowingIO.a().a(t.d());
        this.b.registerActivityLifecycleCallbacks(GrowingIO.a());
        Log.i((String)"GrowingIO", (String)"!!! Thank you very much for using GrowingIO. We will do our best to provide you with the best service. !!!");
        Log.i((String)"GrowingIO", (String)"!!! GrowingIO version: 0.9.98_355b84e !!!");
    }

    @Deprecated
    @TargetApi(value=14)
    private GrowingIO(Application application, String token, double sampling) {
        this(new Configuration(token).setProjectId(token).setSampling(sampling).setContext(application));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static GrowingIO getInstance() {
        Object object = sInstanceLock;
        synchronized (object) {
            if (null == sInstance) {
                Log.e((String)"GrowingIO", (String)"GrowingIO \u8fd8\u672a\u521d\u59cb\u5316, \u8bf7\u5148\u8c03\u7528startWithConfiguration().");
                return new s(null);
            }
            return sInstance;
        }
    }

    public GrowingIO setActivityLifecycleCallbacksRegistrar(ActivityLifecycleCallbacksRegistrar registrar) {
        this.b = registrar;
        return this;
    }

    public static void trackBanner(View banner, List bannerContents) {
        if (!(banner instanceof AdapterView || a.b((Object)banner) || a.a((Object)banner))) {
            new IllegalArgumentException("\u5f53\u524d\u53ea\u652f\u6301AdapterView, ViewPager \u548c RecyclerView \u5b9e\u73b0\u7684Banner").printStackTrace();
        }
        View view = banner;
        k k2 = new k();
        k2.a = 2;
        k2.b = view;
        k2.c = bannerContents;
        view.setTag(84159238, (Object)k2);
    }

    public static void ignoredView(View view) {
        k k2 = new k();
        k2.a = 1;
        view.setTag(84159238, (Object)k2);
    }

    public GrowingIO ignoreFragment(Activity activity, Fragment fragment) {
        GrowingIO.a().b(activity, fragment);
        return this;
    }

    public GrowingIO ignoreFragment(Activity activity, android.support.v4.app.Fragment fragment) {
        GrowingIO.a().b(activity, fragment);
        return this;
    }

    public static void setViewInfo(View view, String info) {
        view.setTag(84159243, (Object)info);
    }

    public static void setViewContent(View view, String content) {
        view.setTag(84159244, (Object)content);
    }

    public GrowingIO setPageName(Activity activity, String name) {
        GrowingIO.a().a(activity.hashCode(), name);
        return this;
    }

    @TargetApi(value=11)
    public GrowingIO setPageName(Fragment fragment, String name) {
        GrowingIO.a().a(fragment.hashCode(), name);
        return this;
    }

    public GrowingIO setPageName(android.support.v4.app.Fragment fragment, String name) {
        GrowingIO.a().a(fragment.hashCode(), name);
        return this;
    }

    public static void setViewID(View view, String id) {
        view.setTag(84159242, (Object)id);
    }

    @Deprecated
    public static void setScheme(String scheme) {
        GConfig.sGrowingScheme = scheme;
    }

    @Deprecated
    public GrowingIO setThrottle(boolean throttle) {
        this.a.c(throttle);
        return this;
    }

    @Deprecated
    public GrowingIO disable() {
        this.a.z();
        return this;
    }

    @Deprecated
    public static void setTabName(View tab, String name) {
        tab.setTag(84159241, (Object)name);
    }

    @Deprecated
    public static void setPressed(View view) {
        view.setPressed(true);
        view.setClickable(true);
        view.postDelayed((Runnable)new r(view), (long)ViewConfiguration.getPressedStateDuration());
    }

    @Deprecated
    public static void useID() {
        GConfig.USE_ID = true;
        GConfig.CIRCLE_USE_ID = true;
    }

    public String getDeviceId() {
        c c2 = GrowingIO.a();
        if (c2 != null) {
            return c2.l();
        }
        return "";
    }

    public String getSessionId() {
        return aj.a();
    }

    public GrowingIO trackEditText(EditText editText) {
        if (editText == null) {
            return this;
        }
        if (GrowingIO.a(editText.getInputType())) {
            return this;
        }
        editText.setTag(84159246, (Object)editText.getText().toString());
        c c2 = GrowingIO.a();
        if (c2 != null) {
            c2.a(editText);
        }
        return this;
    }

    private static boolean a(int n2) {
        int n3 = n2 & 4095;
        return n3 == 129 || n3 == 225 || n3 == 18 || n3 == 145;
    }

    public GrowingIO trackFragment(Activity activity, android.support.v4.app.Fragment fragment) {
        GrowingIO.a().a(activity, fragment);
        return this;
    }

    public GrowingIO trackFragment(Activity activity, Fragment fragment) {
        GrowingIO.a().a(activity, fragment);
        return this;
    }

    public GrowingIO setGeoLocation(double latitude, double longitude) {
        GrowingIO.a().a(latitude, longitude);
        return this;
    }

    public GrowingIO clearGeoLocation() {
        GrowingIO.a().g();
        return this;
    }

    public GrowingIO setCS1(String key, String value) {
        GrowingIO.a().a(0, key, value);
        return this;
    }

    public GrowingIO setCS2(String key, String value) {
        GrowingIO.a().a(1, key, value);
        return this;
    }

    public GrowingIO setCS3(String key, String value) {
        GrowingIO.a().a(2, key, value);
        return this;
    }

    public GrowingIO setCS4(String key, String value) {
        GrowingIO.a().a(3, key, value);
        return this;
    }

    public GrowingIO setCS5(String key, String value) {
        GrowingIO.a().a(4, key, value);
        return this;
    }

    public GrowingIO setCS6(String key, String value) {
        GrowingIO.a().a(5, key, value);
        return this;
    }

    public GrowingIO setCS7(String key, String value) {
        GrowingIO.a().a(6, key, value);
        return this;
    }

    public GrowingIO setCS8(String key, String value) {
        GrowingIO.a().a(7, key, value);
        return this;
    }

    public GrowingIO setCS9(String key, String value) {
        GrowingIO.a().a(8, key, value);
        return this;
    }

    public GrowingIO setCS10(String key, String value) {
        GrowingIO.a().a(9, key, value);
        return this;
    }

    public GrowingIO setPageGroup(Activity activity, String name) {
        this.a((Object)activity, 0, name);
        return this;
    }

    public GrowingIO setPS1(Activity activity, String property) {
        this.a((Object)activity, 1, property);
        return this;
    }

    public GrowingIO setPS2(Activity activity, String property) {
        this.a((Object)activity, 2, property);
        return this;
    }

    public GrowingIO setPS3(Activity activity, String property) {
        this.a((Object)activity, 3, property);
        return this;
    }

    public GrowingIO setPS4(Activity activity, String property) {
        this.a((Object)activity, 4, property);
        return this;
    }

    public GrowingIO setPS5(Activity activity, String property) {
        this.a((Object)activity, 5, property);
        return this;
    }

    public GrowingIO setPS6(Activity activity, String property) {
        this.a((Object)activity, 6, property);
        return this;
    }

    public GrowingIO setPS7(Activity activity, String property) {
        this.a((Object)activity, 7, property);
        return this;
    }

    public GrowingIO setPS8(Activity activity, String property) {
        this.a((Object)activity, 8, property);
        return this;
    }

    public GrowingIO setPS9(Activity activity, String property) {
        this.a((Object)activity, 9, property);
        return this;
    }

    public GrowingIO setPS10(Activity activity, String property) {
        this.a((Object)activity, 10, property);
        return this;
    }

    public GrowingIO setPageGroup(Fragment fragment, String name) {
        this.a((Object)fragment, 0, name);
        return this;
    }

    public GrowingIO setPS1(Fragment fragment, String property) {
        this.a((Object)fragment, 1, property);
        return this;
    }

    public GrowingIO setPS2(Fragment fragment, String property) {
        this.a((Object)fragment, 2, property);
        return this;
    }

    public GrowingIO setPS3(Fragment fragment, String property) {
        this.a((Object)fragment, 3, property);
        return this;
    }

    public GrowingIO setPS4(Fragment fragment, String property) {
        this.a((Object)fragment, 4, property);
        return this;
    }

    public GrowingIO setPS5(Fragment fragment, String property) {
        this.a((Object)fragment, 5, property);
        return this;
    }

    public GrowingIO setPS6(Fragment fragment, String property) {
        this.a((Object)fragment, 6, property);
        return this;
    }

    public GrowingIO setPS7(Fragment fragment, String property) {
        this.a((Object)fragment, 7, property);
        return this;
    }

    public GrowingIO setPS8(Fragment fragment, String property) {
        this.a((Object)fragment, 8, property);
        return this;
    }

    public GrowingIO setPS9(Fragment fragment, String property) {
        this.a((Object)fragment, 9, property);
        return this;
    }

    public GrowingIO setPS10(Fragment fragment, String property) {
        this.a((Object)fragment, 10, property);
        return this;
    }

    public GrowingIO setPageGroup(android.support.v4.app.Fragment fragment, String name) {
        this.a((Object)fragment, 0, name);
        return this;
    }

    public GrowingIO setPS1(android.support.v4.app.Fragment fragment, String property) {
        this.a((Object)fragment, 1, property);
        return this;
    }

    public GrowingIO setPS2(android.support.v4.app.Fragment fragment, String property) {
        this.a((Object)fragment, 2, property);
        return this;
    }

    public GrowingIO setPS3(android.support.v4.app.Fragment fragment, String property) {
        this.a((Object)fragment, 3, property);
        return this;
    }

    public GrowingIO setPS4(android.support.v4.app.Fragment fragment, String property) {
        this.a((Object)fragment, 4, property);
        return this;
    }

    public GrowingIO setPS5(android.support.v4.app.Fragment fragment, String property) {
        this.a((Object)fragment, 5, property);
        return this;
    }

    public GrowingIO setPS6(android.support.v4.app.Fragment fragment, String property) {
        this.a((Object)fragment, 6, property);
        return this;
    }

    public GrowingIO setPS7(android.support.v4.app.Fragment fragment, String property) {
        this.a((Object)fragment, 7, property);
        return this;
    }

    public GrowingIO setPS8(android.support.v4.app.Fragment fragment, String property) {
        this.a((Object)fragment, 8, property);
        return this;
    }

    public GrowingIO setPS9(android.support.v4.app.Fragment fragment, String property) {
        this.a((Object)fragment, 9, property);
        return this;
    }

    public GrowingIO setPS10(android.support.v4.app.Fragment fragment, String property) {
        this.a((Object)fragment, 10, property);
        return this;
    }

    protected GrowingIO a(Object object, int n2, String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            throw new IllegalArgumentException("property cannot be empty");
        }
        if (!this.a.a()) {
            return this;
        }
        this.a(object).put(n2, (Object)string);
        t t2 = t.d();
        if (t2 != null && (object == GrowingIO.a().i() || object == GrowingIO.a().h())) {
            t2.b(true);
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
    public GrowingIO setChannel(String channel) {
        if (channel.length() > 32) {
            channel = channel.substring(0, 32);
        }
        if (this.a == null) {
            Log.e((String)"GrowingIO", (String)"Pls invoke GrowingIO.startTracking() first");
        }
        this.a.a(channel);
        return this;
    }

    @Deprecated
    public GrowingIO disableImpression() {
        if (this.a != null) {
            this.a.e();
        }
        return this;
    }

    public GrowingIO setImp(boolean enable) {
        if (this.a != null) {
            if (!enable) {
                this.a.e();
            } else {
                this.a.f();
            }
        }
        return this;
    }

    private GrowingIO a(f f2) {
        t t2 = t.d();
        if (t2 != null) {
            t2.a(f2);
        }
        return this;
    }

    public GrowingIO track(String eventName, JSONObject properties) {
        return this.a(new f(eventName, null, properties));
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

    private static boolean a(double d2) {
        if (d2 <= 0.0) {
            return false;
        }
        if (d2 >= 0.9999) {
            return true;
        }
        char[] arrc = GrowingIO.a(GrowingIO.a().l()).toCharArray();
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
    public static void trackWebView(android.webkit.WebView webview, WebChromeClient client) {
        webview.setWebChromeClient(client);
        webview.setTag(84159239, (Object)client);
        if (GConfig.DEBUG) {
            Log.d((String)"GrowingIO", (String)("trackWebView: " + (Object)webview + " with client " + (Object)client));
        }
        ak.b((View)webview);
    }

    @Deprecated
    public static void trackX5WebView(WebView webView, com.tencent.smtt.sdk.WebChromeClient client) {
        webView.setWebChromeClient(client);
        webView.setTag(84159239, (Object)client);
        if (GConfig.DEBUG) {
            Log.d((String)"GrowingIO", (String)("trackWebView: " + (Object)webView + " with client " + (Object)client));
        }
        ak.b((View)webView);
    }

    /* synthetic */ GrowingIO(q x0) {
        this();
    }

    static {
        sInstanceLock = new Object();
    }
}

