/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

class dp {
    private boolean a = false;
    private final b b = new b();

    dp() {
    }

    void a(View view, List list, a a2) {
        if (list.isEmpty()) {
            return;
        }
        if (this.b.a()) {
            return;
        }
        c c2 = (c)list.get(0);
        List list2 = list.subList(1, list.size());
        int n2 = this.b.b();
        View view2 = this.a(c2, view, n2);
        this.b.c();
        if (null != view2) {
            this.b(view2, list2, a2);
        }
    }

    private void b(View view, List list, a a2) {
        if (list.isEmpty()) {
            this.a = true;
            a2.accumulate(view);
            return;
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        if (this.b.a()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup)view;
        c c2 = (c)list.get(0);
        List list2 = list.subList(1, list.size());
        int n2 = viewGroup.getChildCount();
        int n3 = this.b.b();
        for (int i2 = 0; i2 < n2; ++i2) {
            View view2 = viewGroup.getChildAt(i2);
            View view3 = this.a(c2, view2, n3);
            if (null != view3) {
                this.b(view3, list2, a2);
            }
            if (c2.c >= 0 && this.b.a(n3) > c2.c) break;
        }
        this.b.c();
    }

    private View a(c c2, View view, int n2) {
        int n3 = this.b.a(n2);
        if (this.a(c2, view)) {
            this.b.b(n2);
            if (c2.c == -1 || c2.c == n3) {
                return view;
            }
        }
        if (c2.a == 1 && view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup)view;
            int n4 = viewGroup.getChildCount();
            for (int i2 = 0; i2 < n4; ++i2) {
                View view2 = viewGroup.getChildAt(i2);
                View view3 = this.a(c2, view2, n2);
                if (null == view3) continue;
                return view3;
            }
        }
        return null;
    }

    private boolean a(c c2, View view) {
        Object object;
        if (null != c2.b && !dp.a((Object)view, c2.b)) {
            return false;
        }
        if (-1 != c2.d && view.getId() != c2.d) {
            return false;
        }
        if (null != c2.e && !c2.e.equals(view.getContentDescription())) {
            return false;
        }
        String string = c2.f;
        if (!(null == c2.f || null != (object = view.getTag()) && string.equals(view.getTag().toString()))) {
            return false;
        }
        return true;
    }

    private static boolean a(Object object, String string) {
        Class class_ = object.getClass();
        while (!class_.getCanonicalName().equals(string)) {
            if (class_ == Object.class) {
                return false;
            }
            class_ = class_.getSuperclass();
        }
        return true;
    }

    static class b {
        private final int[] a = new int[256];
        private int b = 0;
        private static final int c = 256;

        b() {
        }

        boolean a() {
            return this.a.length == this.b;
        }

        int b() {
            int n2 = this.b++;
            this.a[n2] = 0;
            return n2;
        }

        int a(int n2) {
            return this.a[n2];
        }

        void b(int n2) {
            int[] arrn = this.a;
            int n3 = n2;
            arrn[n3] = arrn[n3] + 1;
        }

        void c() {
            --this.b;
            if (this.b < 0) {
                throw new ArrayIndexOutOfBoundsException(this.b);
            }
        }
    }

    static interface a {
        public void accumulate(View var1);
    }

    static class c {
        final int a;
        final String b;
        final int c;
        final int d;
        final String e;
        final String f;
        static final int g = 0;
        static final int h = 1;

        c(int n2, String string, int n3, int n4, String string2, String string3) {
            this.a = n2;
            this.b = string;
            this.c = n3;
            this.d = n4;
            this.e = string2;
            this.f = string3;
        }

        public String toString() {
            try {
                JSONObject jSONObject = new JSONObject();
                if (this.a == 1) {
                    jSONObject.put("prefix", (Object)"shortest");
                }
                if (null != this.b) {
                    jSONObject.put("class", (Object)this.b);
                }
                if (this.c > -1) {
                    jSONObject.put("index", this.c);
                }
                if (this.d > -1) {
                    jSONObject.put("id", this.d);
                }
                if (null != this.e) {
                    jSONObject.put("contentDescription", (Object)this.e);
                }
                if (null != this.f) {
                    jSONObject.put("tag", (Object)this.f);
                }
                return jSONObject.toString();
            }
            catch (JSONException var1_2) {
                throw new RuntimeException("Can't serialize PathElement to String", (Throwable)var1_2);
            }
        }
    }

}

