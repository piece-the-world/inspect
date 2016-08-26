/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.util.Log
 *  android.view.View
 *  android.view.Window
 */
package com.growingio.android.sdk.collection;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.VdsJsHelper;
import com.growingio.android.sdk.collection.ah;
import com.growingio.android.sdk.collection.aj;
import com.growingio.android.sdk.utils.m;
import java.util.ArrayList;
import java.util.List;

public class ag {
    private static ag a;
    private List b = new ArrayList();
    private String c;

    private ag() {
    }

    public static ag a() {
        if (a == null) {
            a = new ag();
        }
        return a;
    }

    public void a(aj aj2) {
        if (this.b.indexOf(aj2) == -1) {
            this.b.add(aj2);
        }
    }

    public void a(VdsJsHelper vdsJsHelper, List list) {
        for (aj aj2 : this.b) {
            aj2.a(list);
        }
    }

    public static boolean a(View view) {
        Object object = view.getTag(84159240);
        return object != null && object instanceof VdsJsHelper;
    }

    public static void a(View view, i i2) {
        GConfig gConfig = GConfig.o();
        if (gConfig == null || !gConfig.m()) {
            return;
        }
        Object object = view.getTag(84159240);
        if (object == null) {
            if (GConfig.a) {
                Log.d((String)"VdsManager", (String)("hookWebViewIfNeeded: hooked " + (Object)view + " with node " + i2));
            }
            object = new VdsJsHelper(view);
            view.setTag(84159240, object);
        } else if (object instanceof VdsJsHelper && i2 != null) {
            if (GConfig.a) {
                Log.d((String)"VdsManager", (String)("hookWebViewIfNeeded: update node for " + (Object)view));
            }
            ((VdsJsHelper)object).update(i2, true);
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
            boolean bl2 = this.c == null && j.e().b();
            this.c = "javascript:" + string;
            if (bl2 && (activity = j.e().d()) != null) {
                m.a(activity.getWindow().getDecorView(), "", new ah(this));
            }
        }
    }

    public String b() {
        return this.c;
    }

    static /* synthetic */ String a(ag ag2) {
        return ag2.c;
    }
}

