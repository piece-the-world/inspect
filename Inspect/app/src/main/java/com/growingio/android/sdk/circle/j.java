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
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;
import com.growingio.android.sdk.a.c;
import com.growingio.android.sdk.a.e;
import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.a;
import com.growingio.android.sdk.circle.ac;
import com.growingio.android.sdk.circle.ad;
import com.growingio.android.sdk.circle.ae;
import com.growingio.android.sdk.circle.af;
import com.growingio.android.sdk.circle.ag;
import com.growingio.android.sdk.circle.ar;
import com.growingio.android.sdk.circle.bw;
import com.growingio.android.sdk.circle.bx;
import com.growingio.android.sdk.circle.cg;
import com.growingio.android.sdk.circle.cn;
import com.growingio.android.sdk.circle.ct;
import com.growingio.android.sdk.circle.da;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.circle.l;
import com.growingio.android.sdk.circle.m;
import com.growingio.android.sdk.circle.n;
import com.growingio.android.sdk.circle.o;
import com.growingio.android.sdk.circle.p;
import com.growingio.android.sdk.circle.q;
import com.growingio.android.sdk.circle.r;
import com.growingio.android.sdk.circle.s;
import com.growingio.android.sdk.circle.u;
import com.growingio.android.sdk.circle.v;
import com.growingio.android.sdk.circle.w;
import com.growingio.android.sdk.circle.y;
import com.growingio.android.sdk.circle.z;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.VdsJsHelper;
import com.growingio.android.sdk.collection.aj;
import com.growingio.android.sdk.collection.d;
import com.growingio.android.sdk.utils.f;
import com.growingio.android.sdk.utils.h;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(value=15)
public class j
implements d {
    private String a;
    private boolean b;
    private boolean c;
    private boolean d;
    private String e;
    private String f;
    private String g;
    private a h;
    private da i;
    private cn j;
    private int k;
    private Runnable l;
    private List m;
    private static final Object n = new Object();
    private static j o;
    private Runnable p;
    private Runnable q;
    private Runnable r;
    private Runnable s;
    private Runnable t;
    private aj u;
    private com.growingio.android.sdk.b.l v;
    private com.growingio.android.sdk.b.l w;
    private Runnable x;

    public j() {
        this.p = new w(this);
        this.q = new y(this);
        this.r = new z(this);
        this.s = new ae(this);
        this.t = new m(this);
        this.u = new n(this);
        this.v = new o(this);
        this.w = new q(this);
        this.x = new r(this);
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

    public Activity d() {
        return this.v().f();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static j e() {
        Object object = n;
        synchronized (object) {
            if (o == null) {
                o = new j();
            }
        }
        return o;
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

    public void f() {
        if (this.c()) {
            h.b(this.t);
            h.a(this.t, 1500);
        }
    }

    public void a(Intent intent, Activity activity) {
        if (intent == null || this.b(intent, activity)) {
            return;
        }
        Uri uri = intent.getData();
        if (this.a(uri)) {
            ct.a();
            com.growingio.android.sdk.utils.g.a((Context)activity);
            this.a = uri.getQueryParameter("circleType");
            String string = uri.getQueryParameter("loginToken");
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
                if (com.growingio.android.sdk.utils.g.c()) {
                    new bx(new k(this), string).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
                    this.e = string;
                    Log.i((String)"GIO.CircleManager", (String)"preparing app circle...");
                } else {
                    this.c(activity);
                }
            }
        }
    }

    private GConfig n() {
        return GConfig.o();
    }

    private c o() {
        return c.a();
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
        cg cg2 = cg.a();
        if (!cg2.b()) {
            cg2.c();
            return;
        }
        this.q();
        this.j = new cn(this.f, this.p, this.q, this.r);
        this.j.c();
        this.t();
        this.i.setContent("\u6b63\u5728\u51c6\u5907Web\u5708\u9009\u2026\u2026");
        h.a(new v(this), 1000);
    }

    private void s() {
        if (this.d() == null) {
            return;
        }
        cg cg2 = cg.a();
        if (!cg2.b()) {
            cg2.c();
            return;
        }
        if (!this.w().a()) {
            if (this.w().b()) {
                return;
            }
            ProgressDialog progressDialog = new ProgressDialog((Context)this.d());
            this.w().a(new ac(this, progressDialog));
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
        h.a(new ad(this), 1000);
    }

    void a(DialogFragment dialogFragment, String string) {
        if (this.d() == null) {
            return;
        }
        try {
            dialogFragment.show(this.d().getFragmentManager(), string);
        }
        catch (IllegalStateException var3_3) {
            // empty catch block
        }
    }

    public void a(List list, String string, String string2) {
        if (this.c()) {
            com.growingio.android.sdk.collection.ag.a().a(null, list);
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
            ar ar2 = new ar();
            String string3 = this.v().a(activity);
            ar2.a((Context)activity, list, string3 + "::" + string2, "elem", false, this.v().b() + "::" + string);
            this.a(ar2, ar.class.getName());
        }
    }

    @SuppressLint(value={"RtlHardcoded"})
    void g() {
        if (this.d() == null || !cg.a().b()) {
            return;
        }
        if (this.h == null) {
            if (Build.VERSION.SDK_INT < 19 && !f.d()) {
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
            this.i = new da((Context)this.d());
        }
        this.i.a();
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
        Activity activity = this.v().f();
        if (activity == null) {
            return;
        }
        if (this.b()) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag(ar.class.getName()) == null && fragmentManager.findFragmentByTag(ag.class.getName()) == null) {
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
        h.a(new af(this, i2), 150);
    }

    public void a(String string, i i2, g g2) {
        if (this.d() == null) {
            return;
        }
        if (this.j != null && this.j.b() && this.j.a()) {
            this.m = null;
            this.k = 0;
            com.growingio.android.sdk.collection.ag.a().a(this.u);
            com.growingio.android.sdk.utils.m.a(this.d().getWindow().getDecorView(), "", this.v);
            this.l = new l(this, string, i2, g2);
            if (this.k > 0) {
                h.a(this.l, 1500);
            } else {
                h.a(this.l);
            }
        }
    }

    void j() {
        ag ag2 = new ag();
        this.a(ag2, ag.class.getName());
    }

    void k() {
        Activity activity = this.d();
        if (activity != null) {
            activity.finish();
        }
        h.a(new p(this), 1000);
    }

    private com.growingio.android.sdk.collection.c v() {
        return com.growingio.android.sdk.collection.c.h();
    }

    private e w() {
        return e.c();
    }

    void a(boolean bl2) {
        if (this.a() && this.b()) {
            if (bl2) {
                this.h.setTags(this.w().d());
            } else {
                this.h.setTags(null);
            }
            GConfig.o().c(bl2);
            if (this.d() != null) {
                com.growingio.android.sdk.utils.m.a(this.d().getWindow().getDecorView(), "", this.w);
            }
        }
    }

    public void l() {
        if (this.h != null && this.a() && this.b() && GConfig.o().r()) {
            this.h.setTags(this.w().d());
            h.b(this.x);
            h.a(this.x, 1500);
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
            this.c(activity);
            intent.removeExtra("START_CIRCLE");
            return true;
        }
        return false;
    }

    private void c(Activity activity) {
        new AlertDialog.Builder((Context)activity).setTitle((CharSequence)"\u66f4\u65b0\u63d0\u9192").setMessage((CharSequence)"\u8bf7\u66f4\u65b0GrowingIO\u5e94\u7528\uff0c\u7136\u540e\u91cd\u65b0\u5f00\u542f\u5708\u9009").setPositiveButton((CharSequence)"\u66f4\u65b0\u5e94\u7528", (DialogInterface.OnClickListener)new s(this, activity)).setNegativeButton((CharSequence)"\u53d6\u6d88", null).create().show();
    }

    private void b(String string, i i2, g g2) {
        if (this.j != null && this.j.b() && this.j.a()) {
            h.b(this.l);
            String string2 = "";
            if ("click".equals(string)) {
                string2 = "\u70b9\u51fb\u4e86" + this.b(i2);
            } else if ("touch".equals(string)) {
                string2 = "\u66f4\u65b0\u622a\u56fe";
            } else if ("page".equals(string)) {
                string2 = "\u8fdb\u5165\u4e86";
            }
            this.j.a(string, string2, this.m, i2, g2);
        }
    }

    private String b(i i2) {
        if (i2 == null) {
            return "\u6309\u94ae";
        }
        if (!TextUtils.isEmpty((CharSequence)i2.k)) {
            return i2.k;
        }
        this.g = null;
        if (i2.c instanceof ViewGroup && !(i2.c instanceof WebView) && !com.growingio.android.sdk.utils.a.c((Object)i2.c)) {
            i2.a(new u(this, i2));
            i2.b();
        } else {
            this.g = i2.k;
        }
        return TextUtils.isEmpty((CharSequence)this.g) ? "\u6309\u94ae" : this.g;
    }

    static /* synthetic */ void a(j j2) {
        j2.p();
    }

    static /* synthetic */ void a(j j2, Pair pair) {
        j2.a(pair);
    }

    static /* synthetic */ da b(j j2) {
        return j2.i;
    }

    static /* synthetic */ void c(j j2) {
        j2.s();
    }

    static /* synthetic */ Runnable d(j j2) {
        return j2.t;
    }

    static /* synthetic */ void a(j j2, String string, i i2, g g2) {
        j2.b(string, i2, g2);
    }

    static /* synthetic */ List a(j j2, List list) {
        j2.m = list;
        return j2.m;
    }

    static /* synthetic */ cn e(j j2) {
        return j2.j;
    }

    static /* synthetic */ List f(j j2) {
        return j2.m;
    }

    static /* synthetic */ int g(j j2) {
        return --j2.k;
    }

    static /* synthetic */ Runnable h(j j2) {
        return j2.l;
    }

    static /* synthetic */ int i(j j2) {
        return j2.k++;
    }

    static /* synthetic */ e j(j j2) {
        return j2.w();
    }

    static /* synthetic */ a k(j j2) {
        return j2.h;
    }

    static /* synthetic */ com.growingio.android.sdk.b.l l(j j2) {
        return j2.w;
    }

    static /* synthetic */ String a(j j2, String string) {
        j2.g = string;
        return j2.g;
    }
}

