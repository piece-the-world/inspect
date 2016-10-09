/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.graphics.Rect
 *  android.support.v4.view.ViewPager
 *  android.text.TextUtils
 *  android.util.LruCache
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.webkit.WebView
 *  android.widget.AdapterView
 *  android.widget.ExpandableListView
 *  android.widget.ImageView
 *  android.widget.RadioGroup
 *  android.widget.RatingBar
 *  android.widget.SeekBar
 *  android.widget.Spinner
 *  android.widget.TextView
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Rect;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.growingio.android.sdk.b.d;
import com.growingio.android.sdk.b.j;
import com.growingio.android.sdk.b.k;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.bd;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.a;
import com.growingio.android.sdk.utils.n;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class i {
    @SuppressLint(value={"NewApi"})
    private static LruCache t = new LruCache(100);
    l a;
    public String b;
    public View c;
    public int d;
    public int e = -1;
    public boolean f;
    public d g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public boolean n;
    public boolean o = false;
    public Rect p;
    public j q;
    public String r;
    public String s;
    private int u;
    private int v = -1;

    public void a(l l2) {
        this.a = l2;
    }

    public i() {
    }

    public i(View view, int n2, int n3, boolean bl2, boolean bl3, boolean bl4, boolean bl5, String string, String string2, String string3, l l2) {
        this.c = view;
        this.e = n3;
        this.f = bl3;
        this.u = n2;
        this.m = bl2;
        this.n = bl4;
        this.o = bl5;
        this.j = string2;
        this.i = string;
        this.r = string3;
        this.a = l2;
    }

    public void a() {
        if (this.a.a(this)) {
            this.b = com.growingio.android.sdk.utils.j.a(this.c.getClass());
            this.g();
            this.h();
            this.f();
            if (this.i()) {
                this.a.b(this);
            }
            if (a.d((Object)this.c)) {
                return;
            }
            this.b();
        }
    }

    public void b() {
        if (this.c instanceof ViewGroup && !(this.c instanceof Spinner) && !(this.c instanceof RadioGroup)) {
            ViewGroup viewGroup = (ViewGroup)this.c;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); ++i2) {
                View view = viewGroup.getChildAt(i2);
                i i3 = new i(view, i2, this.e, this.m || com.growingio.android.sdk.utils.j.a(this.c), this.f, this.n || com.growingio.android.sdk.utils.j.c(this.c), this.o, this.i, this.j, this.r, this.a);
                i3.s = com.growingio.android.sdk.utils.j.c(this.c) ? this.j : this.s;
                i3.h = this.h;
                i3.l = this.l;
                i3.a();
            }
        }
    }

    public int hashCode() {
        if (this.v == -1) {
            int n2 = 17;
            n2 = n2 * 31 + (this.k != null ? this.k.hashCode() : 0);
            n2 = n2 * 31 + (this.j != null ? this.j.hashCode() : 0);
            n2 = n2 * 31 + (this.l != null ? this.l.hashCode() : 0);
            this.v = n2 = n2 * 31 + this.e;
        }
        return this.v;
    }

    public boolean equals(Object object) {
        return object != null && object instanceof i && object.hashCode() == this.hashCode();
    }

    public i c() {
        return new i(null, this.u, this.e, this.m, this.f, this.n, this.o, this.i, this.j, this.r, null);
    }

    public boolean d() {
        return this.j() && !com.growingio.android.sdk.utils.j.b(this.c);
    }

    private void f() {
        if (this.c.getTag(84159243) != null) {
            this.l = (String)this.c.getTag(84159243);
        }
        this.k = com.growingio.android.sdk.utils.j.a(this.c, this.h);
    }

    private void g() {
        int n2 = this.u;
        if (this.c.getParent() != null && this.c.getParent() instanceof ViewGroup) {
            int n3;
            ViewGroup viewGroup = (ViewGroup)this.c.getParent();
            if (a.b((Object)viewGroup)) {
                n2 = ((ViewPager)viewGroup).getCurrentItem();
            } else if (viewGroup instanceof AdapterView) {
                AdapterView adapterView = (AdapterView)viewGroup;
                n2 = adapterView.getFirstVisiblePosition() + this.u;
            } else if (a.a((Object)viewGroup) && (n3 = com.growingio.android.sdk.utils.k.a(this.c, viewGroup)) >= 0) {
                n2 = n3;
            }
        }
        this.d = n2;
    }

    private void h() {
        Object object;
        ViewParent viewParent = this.c.getParent();
        if (viewParent == null || n.b(this.c) && !(viewParent instanceof View)) {
            return;
        }
        String string = this.i;
        String string2 = this.j;
        Object object2 = this.c.getTag(84159241);
        if (object2 != null) {
            this.i = "/" + object2;
            this.j = this.j + "/" + object2;
            return;
        }
        if (viewParent != null && viewParent instanceof View) {
            object = (View)viewParent;
            if (object instanceof ExpandableListView) {
                ExpandableListView expandableListView = (ExpandableListView)object;
                long l2 = ((ExpandableListView)this.c.getParent()).getExpandableListPosition(this.d);
                if (ExpandableListView.getPackedPositionType((long)l2) == 2) {
                    this.m = false;
                    if (this.d < expandableListView.getHeaderViewsCount()) {
                        this.i = string + "/ELH[" + this.d + "]/" + this.b + "[0]";
                        this.j = string2 + "/ELH[" + this.d + "]/" + this.b + "[0]";
                    } else {
                        int n2 = this.d - (expandableListView.getCount() - expandableListView.getFooterViewsCount());
                        this.i = string + "/ELF[" + n2 + "]/" + this.b + "[0]";
                        this.j = string2 + "/ELF[" + n2 + "]/" + this.b + "[0]";
                    }
                } else {
                    int n3 = ExpandableListView.getPackedPositionGroup((long)l2);
                    int n4 = ExpandableListView.getPackedPositionChild((long)l2);
                    if (n4 != -1) {
                        this.e = n4;
                        this.i = string + "/ELVG[" + n3 + "]/ELVC[" + n4 + "]/" + this.b + "[0]";
                        this.j = string + "/ELVG[" + n3 + "]/ELVC[-]/" + this.b + "[0]";
                    } else {
                        this.e = n3;
                        this.i = string + "/ELVG[" + n3 + "]/" + this.b + "[0]";
                        this.j = string + "/ELVG[-]/" + this.b + "[0]";
                    }
                }
            } else if (com.growingio.android.sdk.utils.j.a((View)object)) {
                Object object3 = object.getTag(84159238);
                if (object3 != null && object3 instanceof k) {
                    k k2 = (k)object3;
                    this.d = k2.a(this.d);
                    if (k2.c instanceof List) {
                        this.h = com.growingio.android.sdk.utils.j.a(String.valueOf(((List)k2.c).get(this.d)));
                    }
                }
                this.e = this.d;
                this.i = string + "/" + this.b + "[" + this.e + "]";
                this.j = string + "/" + this.b + "[-]";
            } else if (a.c((Object)viewParent)) {
                this.i = string + "/" + this.b + "[0]";
                this.j = string2 + "/" + this.b + "[0]";
            } else {
                this.i = string + "/" + this.b + "[" + this.d + "]";
                this.j = string2 + "/" + this.b + "[" + this.d + "]";
            }
        } else {
            this.i = string + "/" + this.b + "[" + this.d + "]";
            this.j = string2 + "/" + this.b + "[" + this.d + "]";
        }
        if (GConfig.USE_ID && (object = com.growingio.android.sdk.utils.j.a(this.c, this.o)) != null) {
            if (this.c.getTag(84159242) != null) {
                this.o = true;
            }
            this.i = this.i + "#" + (String)object;
            this.j = this.j + "#" + (String)object;
        }
    }

    private boolean i() {
        ViewParent viewParent = this.c.getParent();
        if (viewParent != null && (this.c.isClickable() || this.c instanceof TextView || this.c instanceof ImageView || this.c instanceof WebView || viewParent instanceof AdapterView || this.c instanceof RadioGroup || this.c instanceof Spinner || this.c instanceof RatingBar || this.c instanceof SeekBar || a.d((Object)this.c))) {
            return true;
        }
        return false;
    }

    @TargetApi(value=11)
    private boolean j() {
        return this.c.getLocalVisibleRect(new Rect()) && this.c.getVisibility() == 0 && this.c.getWidth() > 0 && this.c.getHeight() > 0 && this.c.getAlpha() > 0.0f;
    }

    private void a(View view, Rect rect, boolean bl2) {
        if (bl2) {
            view.getGlobalVisibleRect(rect);
        } else {
            int[] arrn = new int[2];
            view.getLocationOnScreen(arrn);
            view.getLocalVisibleRect(rect);
            rect.offset(arrn[0], arrn[1]);
        }
    }

    public JSONObject e() {
        View view = this.c;
        JSONObject jSONObject = new JSONObject();
        try {
            String string;
            Object object;
            jSONObject.put("xpath", (Object)this.j);
            if (this.e > -1) {
                jSONObject.put("index", (Object)String.valueOf(this.e));
            }
            Rect rect = new Rect();
            this.a(view, rect, this.f);
            double d2 = bd.f();
            com.growingio.android.sdk.utils.j.a(view, rect, this.f);
            if (this.p != null && !rect.intersect(this.p)) {
                return null;
            }
            jSONObject.put("left", (double)rect.left * d2);
            jSONObject.put("top", (double)rect.top * d2);
            jSONObject.put("width", (double)rect.width() * d2);
            jSONObject.put("height", (double)rect.height() * d2);
            jSONObject.put("isTrackingEditText", this.c.getTag(84159246) != null);
            boolean bl2 = com.growingio.android.sdk.utils.j.c(view);
            jSONObject.put("isContainer", bl2 || !this.n && !TextUtils.isEmpty((CharSequence)this.k));
            String string2 = string = bl2 ? "button" : "text";
            if (this.q != null) {
                string = this.q.e;
                jSONObject.put("href", (Object)this.q.d);
                jSONObject.put("query", (Object)this.q.c);
            }
            jSONObject.put("nodeType", (Object)string);
            if (!TextUtils.isEmpty((CharSequence)this.s)) {
                jSONObject.put("parentXPath", (Object)this.s);
            }
            if (!TextUtils.isEmpty((CharSequence)this.k)) {
                jSONObject.put("content", (Object)this.k);
            }
            if ((object = this.c.getTag(84159244)) != null) {
                jSONObject.put("grContent", object);
            }
            jSONObject.put("grImage", this.c instanceof ImageView);
            jSONObject.put("grBannerContent", (Object)this.h);
            jSONObject.put("grIgnored", com.growingio.android.sdk.utils.j.b(this.c));
            jSONObject.put("grObj", (Object)this.l);
        }
        catch (JSONException var3_4) {
            LogUtil.d("GIO.ViewNode", "generate impress view error", (Throwable)var3_4);
            return null;
        }
        return jSONObject;
    }
}

