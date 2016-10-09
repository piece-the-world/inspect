/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.app.DialogFragment
 *  android.app.Fragment
 *  android.app.FragmentManager
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.graphics.Point
 *  android.net.Uri
 *  android.os.AsyncTask
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.support.v4.app.Fragment
 *  android.text.TextUtils
 *  android.util.Log
 *  android.util.Pair
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$BadTokenException
 *  android.view.WindowManager$LayoutParams
 *  android.webkit.WebView
 *  android.widget.Toast
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.circle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;
import com.growingio.android.sdk.a.e;
import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.HybridEventEditDialog;
import com.growingio.android.sdk.circle.a;
import com.growingio.android.sdk.circle.aa;
import com.growingio.android.sdk.circle.ab;
import com.growingio.android.sdk.circle.ae;
import com.growingio.android.sdk.circle.af;
import com.growingio.android.sdk.circle.ag;
import com.growingio.android.sdk.circle.ah;
import com.growingio.android.sdk.circle.ai;
import com.growingio.android.sdk.circle.aj;
import com.growingio.android.sdk.circle.ak;
import com.growingio.android.sdk.circle.av;
import com.growingio.android.sdk.circle.aw;
import com.growingio.android.sdk.circle.bc;
import com.growingio.android.sdk.circle.bd;
import com.growingio.android.sdk.circle.be;
import com.growingio.android.sdk.circle.bk;
import com.growingio.android.sdk.circle.l;
import com.growingio.android.sdk.circle.m;
import com.growingio.android.sdk.circle.n;
import com.growingio.android.sdk.circle.o;
import com.growingio.android.sdk.circle.p;
import com.growingio.android.sdk.circle.q;
import com.growingio.android.sdk.circle.r;
import com.growingio.android.sdk.circle.s;
import com.growingio.android.sdk.circle.t;
import com.growingio.android.sdk.circle.v;
import com.growingio.android.sdk.circle.w;
import com.growingio.android.sdk.circle.x;
import com.growingio.android.sdk.circle.y;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.VdsJsHelper;
import com.growingio.android.sdk.collection.an;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.utils.LogUtil;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(value=15)
public class k
implements com.growingio.android.sdk.collection.e {
    private String a;
    private boolean b;
    private boolean c;
    private boolean d;
    private String e;
    private String f;
    private String g;
    private a h;
    private bk i;
    private bc j;
    private aj k;
    private int l;
    private Runnable m;
    private List n;
    private static final Object o = new Object();
    private static k p;
    private Runnable q;
    private Runnable r;
    private Runnable s;
    private Runnable t;
    private an u;
    private com.growingio.android.sdk.b.l v;
    private com.growingio.android.sdk.b.l w;
    private Runnable x;
    private aj y;

    public k() {
        this.q = new y(this);
        this.r = new aa(this);
        this.s = new ab(this);
        this.t = new n(this);
        this.u = new o(this);
        this.v = new p(this);
        this.w = new r(this);
        this.x = new s(this);
        this.y = new v(this);
    }

    public boolean a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    private void b(boolean bl2) {
        this.b = bl2;
        if (bl2) {
            this.c = "app".equalsIgnoreCase(this.a);
            this.d = !this.c;
        } else {
            this.c = false;
            this.d = false;
        }
    }

    public void a(aj aj2) {
        this.k = aj2;
    }

    public Activity d() {
        return this.v().i();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static k e() {
        Object object = o;
        synchronized (object) {
            if (p == null) {
                p = new k();
            }
        }
        return p;
    }

    @Override
    public void a(Activity activity) {
        this.h();
    }

    @Override
    public void b(Activity activity) {
        this.u();
    }

    @Override
    public void a(Fragment fragment) {
    }

    @Override
    public void b(Fragment fragment) {
    }

    @Override
    public void a(android.support.v4.app.Fragment fragment) {
    }

    @Override
    public void b(android.support.v4.app.Fragment fragment) {
    }

    @Override
    public void c(Activity activity) {
    }

    public void f() {
        if (this.c()) {
            com.growingio.android.sdk.utils.i.b(this.t);
            com.growingio.android.sdk.utils.i.a(this.t, 1500);
        }
    }

    public void a(Intent intent, Activity activity) {
        if (intent == null || this.b(intent, activity)) {
            return;
        }
        Uri uri = intent.getData();
        if (this.a(uri)) {
            if (this.d() == null) {
                this.v().a(activity);
            }
            bd.a();
            this.a = uri.getQueryParameter("circleType");
            String string = uri.getQueryParameter("loginToken");
            String string2 = uri.getQueryParameter("source");
            if (TextUtils.isEmpty((CharSequence)this.a) || "app".equals(this.a) && TextUtils.equals((CharSequence)string, (CharSequence)this.e)) {
                return;
            }
            intent.setData(null);
            this.i();
            this.b(true);
            this.q();
            if (this.c()) {
                this.f = uri.getQueryParameter("circleRoomNumber");
                this.r();
            } else if (!TextUtils.isEmpty((CharSequence)string)) {
                if ("replace".equals(string2)) {
                    this.p();
                } else {
                    new av(new l(this), string).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
                }
                this.e = string;
                Log.i((String)"GIO.CircleManager", (String)"preparing app circle...");
            }
        }
    }

    private GConfig n() {
        return GConfig.q();
    }

    private e o() {
        return e.a();
    }

    private void p() {
        if (this.b()) {
            this.s();
        }
    }

    private void q() {
        this.v().a(this);
    }

    private void a(Pair pair) {
        Activity activity;
        String string = "\u53d1\u751f\u672a\u77e5\u9519\u8bef";
        String string2 = this.c() ? "\u8bf7\u91cd\u65b0\u626b\u63cf" : "\u8bf7\u91cd\u65b0\u5524\u9192App";
        this.u();
        if ((Integer)pair.first == 422) {
            try {
                activity = new JSONObject(new String((byte[])pair.second));
                string = activity.getString("error");
            }
            catch (JSONException var4_5) {}
        } else if ((Integer)pair.first >= 500) {
            string = "\u670d\u52a1\u5668\u9519\u8bef\uff0c\u8bf7\u7a0d\u540e\u91cd\u65b0\u626b\u63cf\u4e8c\u7ef4\u7801";
        } else if ((Integer)pair.first == 0) {
            string = "\u68c0\u6d4b\u4e0d\u5230\u7f51\u7edc\u8fde\u63a5\uff0c\u8bf7\u786e\u4fdd\u5df2\u63a5\u5165\u4e92\u8054\u7f51";
            string2 = "\u8bf7\u8fde\u63a5\u7f51\u7edc";
        }
        activity = this.d();
        if (activity != null && !activity.isFinishing()) {
            try {
                new AlertDialog.Builder((Context)this.d()).setTitle((CharSequence)string2).setMessage((CharSequence)string).setPositiveButton((CharSequence)"\u77e5\u9053\u4e86", null).create().show();
            }
            catch (WindowManager.BadTokenException var5_6) {
                // empty catch block
            }
        }
    }

    private void r() {
        if (this.d() == null) {
            return;
        }
        aw aw2 = aw.a();
        if (!aw2.b()) {
            aw2.c();
            return;
        }
        this.q();
        this.a(this.y);
        this.j = new bc(this.f, this.q, this.r, this.s);
        this.j.c();
        this.t();
        this.i.setContent("\u6b63\u5728\u51c6\u5907Web\u5708\u9009\u2026\u2026");
        com.growingio.android.sdk.utils.i.a(new x(this), 1000);
    }

    private void s() {
        if (this.d() == null) {
            return;
        }
        aw aw2 = aw.a();
        if (!aw2.b()) {
            aw2.c();
            return;
        }
        if (!this.w().a()) {
            if (this.w().b()) {
                return;
            }
            ProgressDialog progressDialog = new ProgressDialog((Context)this.d());
            this.w().a(new ae(this, progressDialog));
            progressDialog.requestWindowFeature(1);
            progressDialog.setMessage((CharSequence)"\u6b63\u5728\u52a0\u8f7d\u5386\u53f2\u6807\u7b7e");
            try {
                progressDialog.show();
            }
            catch (WindowManager.BadTokenException var3_3) {
                Toast.makeText((Context)this.d(), (CharSequence)"\u6b63\u5728\u52a0\u8f7d\u5386\u53f2\u6807\u7b7e", (int)1).show();
            }
            this.w().e();
            return;
        }
        this.g();
        HybridEventEditDialog.a((Context)this.d());
        com.growingio.android.sdk.utils.i.a(new af(this), 1000);
    }

    void a(DialogFragment dialogFragment, String string) {
        if (this.d() == null) {
            return;
        }
        try {
            if (dialogFragment.isAdded() || this.d().getFragmentManager().findFragmentByTag(string) != null) {
                return;
            }
            dialogFragment.show(this.d().getFragmentManager(), string);
        }
        catch (IllegalStateException var3_3) {
            // empty catch block
        }
    }

    public void a(List list, String string, String string2) {
        if (this.c()) {
            com.growingio.android.sdk.collection.ak.a().a(null, list);
        } else if (this.b()) {
            this.b(list, string, string2);
        }
    }

    private void b(List list, String string, String string2) {
        Activity activity;
        if (this.h != null) {
            this.h.setVisibility(8);
        }
        if ((activity = this.d()) != null) {
            String string3 = this.v().b(activity);
            HybridEventEditDialog hybridEventEditDialog = new HybridEventEditDialog();
            hybridEventEditDialog.a(activity, list, string3, this.v().b(), new ag(this, hybridEventEditDialog));
        }
    }

    @SuppressLint(value={"RtlHardcoded"})
    void g() {
        if (this.d() == null || !aw.a().b()) {
            return;
        }
        if (this.h == null) {
            if (Build.VERSION.SDK_INT < 19 && !com.growingio.android.sdk.utils.g.d()) {
                Toast.makeText((Context)this.d(), (CharSequence)"\u8bf7\u4f7f\u7528 Android 4.4 \u6216\u66f4\u9ad8\u7248\u672c\u8fdb\u884c\u5708\u9009", (int)0).show();
                return;
            }
            this.h = new a(this.d().getApplicationContext());
            this.h.b();
        } else {
            this.h.b();
        }
    }

    private void t() {
        if (this.i == null) {
            this.i = new bk((Context)this.d());
        }
        this.i.a();
        Activity activity = this.d();
        if (activity != null) {
            activity.getWindow().addFlags(128);
        }
    }

    private void u() {
        if (this.h != null) {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams)this.h.getLayoutParams();
            Point point = new Point();
            point.x = layoutParams.x;
            point.y = layoutParams.y;
            this.n().a(point.x, point.y);
            this.h.d();
            this.h = null;
        }
        if (this.i != null) {
            this.i.b();
            this.i = null;
        }
    }

    void h() {
        Activity activity = this.v().i();
        if (activity == null) {
            return;
        }
        if (this.b()) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            if ((fragmentManager.findFragmentByTag(HybridEventEditDialog.class.getName()) == null || fragmentManager.findFragmentByTag(HybridEventEditDialog.class.getName()).isRemoving()) && (fragmentManager.findFragmentByTag(ak.class.getName()) == null || fragmentManager.findFragmentByTag(ak.class.getName()).isRemoving())) {
                this.g();
            }
        } else if (this.c()) {
            this.t();
        }
    }

    void i() {
        this.u();
        if (this.j != null) {
            this.j.d();
            this.j = null;
        }
        this.o().f();
        if (this.d() != null) {
            this.v().b(this);
        }
        this.b(false);
    }

    public void a(com.growingio.android.sdk.b.n n2) {
        try {
            if (!n2.b().getString("t").equals("page")) {
                return;
            }
            this.a("page", null, n2);
        }
        catch (Exception var2_2) {
            var2_2.printStackTrace();
        }
    }

    public void a(i i2) {
        com.growingio.android.sdk.utils.i.a(new ah(this, i2), 150);
    }

    public void a(String string, i i2, g g2) {
        if (this.d() == null) {
            return;
        }
        this.n = null;
        this.l = 0;
        com.growingio.android.sdk.collection.ak.a().a(this.u);
        com.growingio.android.sdk.utils.k.a(this.d().getWindow().getDecorView(), "", this.v);
        this.m = new m(this, string, i2, g2);
        if (this.l > 0) {
            com.growingio.android.sdk.utils.i.a(this.m, 1500);
        } else {
            com.growingio.android.sdk.utils.i.a(this.m);
        }
    }

    void j() {
        ak ak2 = new ak();
        this.a(ak2, ak.class.getName());
    }

    void k() {
        Activity activity = this.d();
        if (activity != null) {
            activity.finish();
        }
        com.growingio.android.sdk.utils.i.a(new q(this), 1000);
    }

    private c v() {
        return c.k();
    }

    private com.growingio.android.sdk.a.g w() {
        return com.growingio.android.sdk.a.g.c();
    }

    void a(boolean bl2) {
        if (this.a() && this.b()) {
            if (bl2) {
                this.h.setTags(this.w().d());
            } else {
                this.h.setTags(null);
            }
            GConfig.q().b(bl2);
            if (this.d() != null) {
                com.growingio.android.sdk.utils.k.a(this.d().getWindow().getDecorView(), "", this.w);
            }
        }
    }

    public void l() {
        if (this.h != null && this.a() && this.b() && GConfig.q().s()) {
            this.h.setTags(this.w().d());
            com.growingio.android.sdk.utils.i.b(this.x);
            com.growingio.android.sdk.utils.i.a(this.x, 1500);
        }
    }

    void m() {
        if (this.b()) {
            this.s();
        } else if (this.c()) {
            this.r();
        }
    }

    private boolean a(Uri uri) {
        return uri != null && uri.isHierarchical() && uri.isAbsolute() && uri.getScheme().startsWith("growing.");
    }

    private boolean b(Intent intent, Activity activity) {
        boolean bl2 = intent.getBooleanExtra("START_CIRCLE", false);
        if (bl2) {
            this.d(activity);
            intent.removeExtra("START_CIRCLE");
            return true;
        }
        return false;
    }

    private void d(Activity activity) {
        new AlertDialog.Builder((Context)activity).setTitle((CharSequence)"\u66f4\u65b0\u63d0\u9192").setMessage((CharSequence)"\u8bf7\u66f4\u65b0GrowingIO\u5e94\u7528\uff0c\u7136\u540e\u91cd\u65b0\u5f00\u542f\u5708\u9009").setPositiveButton((CharSequence)"\u66f4\u65b0\u5e94\u7528", (DialogInterface.OnClickListener)new t(this, activity)).setNegativeButton((CharSequence)"\u53d6\u6d88", null).create().show();
    }

    private void b(String string, i i2, g g2) {
        com.growingio.android.sdk.utils.i.b(this.m);
        String string2 = "";
        if ("click".equals(string)) {
            string2 = "\u70b9\u51fb\u4e86" + this.b(i2);
        } else if ("touch".equals(string)) {
            string2 = "\u66f4\u65b0\u622a\u56fe";
        } else if ("page".equals(string)) {
            string2 = "\u8fdb\u5165\u4e86";
        }
        if (this.k != null) {
            this.k.a(this.a(string, string2, i2, this.n, g2));
        }
    }

    private String a(String string, String string2, i i2, List list, g g2) {
        Object object;
        Activity activity = this.d();
        if (activity == null) {
            return string;
        }
        if (string.equals("page")) {
            object = "";
            if (g2 instanceof com.growingio.android.sdk.b.c) {
                object = ((com.growingio.android.sdk.b.c)g2).b;
                if (TextUtils.isEmpty((CharSequence)object)) {
                    object = g2.g;
                }
            } else if (g2 instanceof com.growingio.android.sdk.b.n) {
                try {
                    object = g2.b().getString("v");
                    if (TextUtils.isEmpty((CharSequence)object)) {
                        object = g2.b().getString("p");
                    }
                }
                catch (Exception var8_8) {
                    var8_8.printStackTrace();
                }
            }
            string2 = "\u8fdb\u5165\u4e86" + (String)object;
        }
        object = new be(activity, list, i2);
        JSONObject jSONObject = object.a();
        try {
            jSONObject.put("msgId", (Object)"user_action");
            jSONObject.put("userAction", (Object)string);
            jSONObject.put("actionDesc", (Object)string2);
            jSONObject.put("sdkVersion", (Object)"0.9.98_355b84e");
            jSONObject.put("appVersion", (Object)GConfig.sAppVersion);
            jSONObject.put("sdkConfig", (Object)this.x());
            jSONObject.put("cs", (Object)this.y());
            jSONObject.put("ps", (Object)this.z());
            if (string.equals("page")) {
                if (g2 instanceof com.growingio.android.sdk.b.c) {
                    jSONObject.put("domain", (Object)c.k().b());
                    jSONObject.put("page", (Object)g2.g);
                } else if (g2 instanceof com.growingio.android.sdk.b.n) {
                    jSONObject.put("domain", (Object)g2.b().getString("d"));
                    jSONObject.put("page", (Object)g2.b().getString("p"));
                    jSONObject.put("query", (Object)g2.b().optString("q"));
                }
            } else {
                jSONObject.put("domain", (Object)c.k().b());
                jSONObject.put("page", (Object)this.v().b(activity));
            }
            return jSONObject.toString();
        }
        catch (Exception var9_10) {
            LogUtil.d("WebSocketProxy", "send screenshot info message error", var9_10);
            return "";
        }
    }

    private JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdkVersion", (Object)"0.9.98_355b84e");
            jSONObject.put("appVersion", (Object)GConfig.sAppVersion);
            jSONObject.put("isUseId", GConfig.USE_ID);
            jSONObject.put("isTrackingAllFragments", this.n().d());
            jSONObject.put("isTrackWebView", this.n().o());
            jSONObject.put("schema", (Object)GConfig.sGrowingScheme);
            jSONObject.put("channel", (Object)this.n().n());
        }
        catch (JSONException var2_2) {
            LogUtil.e("GIO", var2_2.getMessage());
        }
        return jSONObject;
    }

    private JSONObject y() {
        JSONObject jSONObject = new JSONObject();
        try {
            SparseArray sparseArray = this.v().r();
            for (int i2 = 0; i2 < sparseArray.size(); ++i2) {
                int n2 = sparseArray.keyAt(i2);
                String string = String.valueOf(sparseArray.get(n2));
                jSONObject.put("cs" + String.valueOf(n2 + 1), (Object)string);
            }
        }
        catch (JSONException var2_3) {
            LogUtil.d("GIO.CircleManager", "patch cs value error: ", (Throwable)var2_3);
        }
        return jSONObject;
    }

    private JSONObject z() {
        int n2;
        Activity activity;
        JSONObject jSONObject = new JSONObject();
        Object object = this.v().h();
        if (object != null) {
            n2 = object.hashCode();
        } else {
            activity = this.d();
            if (activity != null) {
                n2 = activity.hashCode();
            } else {
                return null;
            }
        }
        try {
            activity = (SparseArray)this.v().a().get(n2);
            if (activity == null) {
                return null;
            }
            for (int i2 = 0; i2 < activity.size(); ++i2) {
                int n3 = activity.keyAt(i2);
                String string = String.valueOf(activity.get(n3));
                jSONObject.put(n3 == 0 ? "pg" : "ps" + String.valueOf(n3), (Object)string);
            }
        }
        catch (JSONException var4_5) {
            LogUtil.d("GIO.CircleManager", "patch ps value error: ", (Throwable)var4_5);
        }
        return jSONObject;
    }

    private String b(i i2) {
        if (i2 == null) {
            return "\u6309\u94ae";
        }
        if (!TextUtils.isEmpty((CharSequence)i2.k)) {
            return i2.k;
        }
        this.g = null;
        if (i2.c instanceof ViewGroup && !(i2.c instanceof WebView) && !com.growingio.android.sdk.utils.a.d((Object)i2.c)) {
            i2.a(new w(this, i2));
            i2.b();
        } else {
            this.g = i2.k;
        }
        return TextUtils.isEmpty((CharSequence)this.g) ? "\u6309\u94ae" : this.g;
    }

    static /* synthetic */ void a(k k2) {
        k2.p();
    }

    static /* synthetic */ void a(k k2, Pair pair) {
        k2.a(pair);
    }

    static /* synthetic */ bk b(k k2) {
        return k2.i;
    }

    static /* synthetic */ void c(k k2) {
        k2.s();
    }

    static /* synthetic */ Runnable d(k k2) {
        return k2.t;
    }

    static /* synthetic */ void a(k k2, String string, i i2, g g2) {
        k2.b(string, i2, g2);
    }

    static /* synthetic */ List a(k k2, List list) {
        k2.n = list;
        return k2.n;
    }

    static /* synthetic */ bc e(k k2) {
        return k2.j;
    }

    static /* synthetic */ List f(k k2) {
        return k2.n;
    }

    static /* synthetic */ int g(k k2) {
        return --k2.l;
    }

    static /* synthetic */ Runnable h(k k2) {
        return k2.m;
    }

    static /* synthetic */ int i(k k2) {
        return k2.l++;
    }

    static /* synthetic */ com.growingio.android.sdk.a.g j(k k2) {
        return k2.w();
    }

    static /* synthetic */ a k(k k2) {
        return k2.h;
    }

    static /* synthetic */ com.growingio.android.sdk.b.l l(k k2) {
        return k2.w;
    }

    static /* synthetic */ String a(k k2, String string) {
        k2.g = string;
        return k2.g;
    }
}

