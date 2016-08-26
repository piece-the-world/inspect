/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.Fragment
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.support.v4.app.Fragment
 *  android.support.v4.app.FragmentActivity
 *  android.text.TextUtils
 *  android.util.SparseArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.SparseArray;
import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.utils.LogUtil;
import org.json.JSONException;
import org.json.JSONObject;

public class c
extends g {
    String a;
    public String b;
    String c = "PORTRAIT";
    int d;
    public long e;

    public c(Activity activity, String string, long l2, boolean bl2) {
        this.g = this.g().a(activity, bl2);
        String string2 = this.c = activity.getResources().getConfiguration().orientation == 1 ? "PORTRAIT" : "LANDSCAPE";
        if (!TextUtils.isEmpty((CharSequence)activity.getTitle())) {
            this.b = activity.getTitle().toString();
        }
        this.e = l2;
        this.a = string;
        this.d = activity.hashCode();
    }

    public c(String string, String string2, long l2) {
        this.g = string;
        this.e = l2;
        this.b = string2;
    }

    @TargetApi(value=11)
    public c(Fragment fragment, String string, long l2) {
        this(fragment.getActivity(), string, l2, true);
        this.d = fragment.hashCode();
    }

    public c(android.support.v4.app.Fragment fragment, String string, long l2) {
        this((Activity)fragment.getActivity(), string, l2, true);
        this.d = fragment.hashCode();
    }

    @Override
    public JSONObject b() {
        JSONObject jSONObject = this.i();
        try {
            jSONObject.put("t", (Object)"page");
            this.a(jSONObject);
            this.b(jSONObject);
            jSONObject.put("tm", this.e);
            if (!TextUtils.isEmpty((CharSequence)this.a)) {
                jSONObject.put("rp", (Object)this.a);
            }
            jSONObject.put("o", (Object)this.c);
            jSONObject.put("v", (Object)this.b);
        }
        catch (JSONException var2_2) {
            LogUtil.d("GIO.VPAEvent", "generate page event error", (Throwable)var2_2);
        }
        return jSONObject;
    }

    private void b(JSONObject jSONObject) {
        SparseArray sparseArray = (SparseArray)this.g().a().get(this.d);
        if (sparseArray != null) {
            try {
                for (int i2 = 0; i2 < sparseArray.size(); ++i2) {
                    String string = i2 == 0 ? "pg" : "ps" + i2;
                    jSONObject.put(string, sparseArray.get(i2));
                }
            }
            catch (JSONException var3_4) {
                var3_4.printStackTrace();
            }
        }
    }
}

