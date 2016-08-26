/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.SparseArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.b;

import android.text.TextUtils;
import android.util.SparseArray;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.af;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.utils.LogUtil;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class g {
    long f = System.currentTimeMillis();
    public String g;

    protected c g() {
        return c.h();
    }

    protected GConfig h() {
        return GConfig.o();
    }

    protected void a(JSONObject jSONObject) {
        try {
            SparseArray sparseArray = this.g().n();
            for (int i2 = 0; i2 < sparseArray.size(); ++i2) {
                int n2 = sparseArray.keyAt(i2);
                String string = String.valueOf(sparseArray.get(n2));
                jSONObject.put("cs" + String.valueOf(n2 + 1), (Object)string);
            }
        }
        catch (JSONException var2_3) {
            LogUtil.d("GIO.VPAEvent", "patch cs value error: ", (Throwable)var2_3);
        }
    }

    public int f() {
        return 1;
    }

    protected JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("s", (Object)af.a());
            jSONObject.put("tm", this.f);
            String string = this.g().b();
            if (j.e().a()) {
                string = "GioCircle." + string;
            }
            jSONObject.put("d", (Object)string);
            if (!TextUtils.isEmpty((CharSequence)this.g)) {
                jSONObject.put("p", (Object)this.g);
            }
        }
        catch (JSONException var2_3) {
            LogUtil.d("GIO.VPAEvent", "generate common event property error", (Throwable)var2_3);
        }
        return jSONObject;
    }

    public abstract JSONObject b();
}

