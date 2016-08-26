/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 */
package com.growingio.android.sdk.circle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.growingio.android.sdk.b.f;
import com.growingio.android.sdk.b.h;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.bu;
import com.growingio.android.sdk.circle.ct;
import com.growingio.android.sdk.circle.cz;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.utils.m;
import com.growingio.android.sdk.utils.o;
import java.util.ArrayList;
import java.util.List;

public class cy
extends bu {
    private int a;
    private List b;
    private i c;
    private int d = 0;
    private l e;

    public cy(Context context) {
        super(context);
        this.e = new cz(this);
        this.b = new ArrayList();
    }

    public void a() {
        if (this.getParent() != null) {
            this.setVisibility(0);
        } else {
            int n2 = 312;
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(ct.c(), ct.e(), this.a, n2, -3);
            layoutParams.gravity = 51;
            layoutParams.setTitle((CharSequence)("TagsWindow:" + this.getContext().getPackageName()));
            ((WindowManager)this.getContext().getApplicationContext().getSystemService("window")).addView((View)this, (ViewGroup.LayoutParams)layoutParams);
        }
    }

    public void a(i i2) {
        this.c = i2;
        this.removeAllViews();
        this.setVisibility(0);
        this.d = 0;
        m.a(o.b(), this.e);
    }

    public void b() {
        this.setVisibility(8);
        this.c = null;
        this.removeAllViews();
    }

    public void setVisibility(int n2) {
        super.setVisibility(n2);
    }

    public void setTags(List list) {
        this.c();
        if (list == null || list.size() == 0) {
            return;
        }
        String string = c.h().b();
        for (f f2 : list) {
            if (!f2.d.equals("elem") || !string.equals(f2.g.d)) continue;
            this.a(f2);
        }
        if (this.b.size() > 0) {
            m.a(o.b(), this.e);
        }
    }

    public void a(f f2) {
        Activity activity = j.e().d();
        if (activity != null) {
            String string = c.h().a(activity);
            if (f2.g.b == null || f2.g.b.equals(string)) {
                i i2 = new i();
                if (!TextUtils.isEmpty((CharSequence)f2.g.c)) {
                    i2.k = f2.g.c;
                }
                boolean bl2 = i2.m = !TextUtils.isEmpty((CharSequence)f2.g.e);
                if (i2.m) {
                    try {
                        i2.e = Integer.valueOf(f2.g.e);
                    }
                    catch (NumberFormatException var5_5) {
                        i2.e = -2;
                    }
                } else {
                    i2.e = -2;
                }
                i2.j = f2.g.a;
                this.b.add(i2);
            }
        }
    }

    public void c() {
        this.b.clear();
        this.removeAllViews();
    }

    public void setFloatType(int n2) {
        this.a = n2;
    }

    static /* synthetic */ i a(cy cy2) {
        return cy2.c;
    }

    static /* synthetic */ List b(cy cy2) {
        return cy2.b;
    }

    static /* synthetic */ int c(cy cy2) {
        return cy2.d++;
    }
}

