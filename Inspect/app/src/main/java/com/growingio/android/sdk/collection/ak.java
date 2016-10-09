/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 *  android.view.Window
 */
package com.growingio.android.sdk.collection;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.VdsJsHelper;
import com.growingio.android.sdk.collection.al;
import com.growingio.android.sdk.collection.an;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.j;
import java.util.ArrayList;
import java.util.List;

public class ak {
    private static ak a;
    private List b = new ArrayList();
    private String c;

    private ak() {
    }

    public static ak a() {
        if (a == null) {
            a = new ak();
        }
        return a;
    }

    public void a(an an2) {
        if (this.b.indexOf(an2) == -1) {
            this.b.add(an2);
        }
    }

    public void a(VdsJsHelper vdsJsHelper, List list) {
        for (an an2 : this.b) {
            an2.a(list);
        }
    }

    public static boolean a(View view) {
        Object object = view.getTag(84159240);
        return object != null && object instanceof VdsJsHelper;
    }

    public static void b(View view) {
        GConfig gConfig = GConfig.q();
        if (gConfig == null || !gConfig.o() || j.b(view)) {
            return;
        }
        Object object = view.getTag(84159240);
        if (object == null) {
            i i2 = com.growingio.android.sdk.utils.k.a(view, null);
            object = new VdsJsHelper(view);
            if (i2 != null) {
                ((VdsJsHelper)object).update(i2, false);
            }
            view.setTag(84159240, object);
            LogUtil.d("VdsManager", new Object[]{"hookWebViewIfNeeded: hooked ", view, " with node ", i2});
        }
    }

    public static void a(View view, i i2, boolean bl2) {
        Object object = view.getTag(84159240);
        if (object != null && object instanceof VdsJsHelper) {
            ((VdsJsHelper)object).update(i2, bl2);
        }
    }

    public void a(String string) {
        if (string != null) {
            Activity activity;
            boolean bl2 = this.c == null && k.e().b();
            this.c = "javascript:" + string;
            if (bl2 && (activity = k.e().d()) != null) {
                com.growingio.android.sdk.utils.k.a(activity.getWindow().getDecorView(), "", new al(this));
            }
        }
    }

    public String b() {
        return this.c;
    }

    static /* synthetic */ String a(ak ak2) {
        return ak2.c;
    }
}

