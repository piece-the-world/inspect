/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.telephony.TelephonyManager
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.WindowManager
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.utils.LogUtil;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class m
extends g {
    String a;

    public m(String string) {
        this.a = string;
    }

    @Override
    public JSONObject b() {
        JSONObject jSONObject = this.j();
        try {
            jSONObject.put("t", (Object)"vst");
            this.c(jSONObject);
            this.a(jSONObject);
            this.b(jSONObject);
            jSONObject.put("b", (Object)"native");
            jSONObject.put("l", (Object)Locale.getDefault().toString());
            jSONObject.put("ch", (Object)this.i().n());
            Context context = this.h().j();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
            if (Build.VERSION.SDK_INT >= 17) {
                display.getRealMetrics(displayMetrics);
            } else {
                display.getMetrics(displayMetrics);
            }
            jSONObject.put("sh", displayMetrics.heightPixels);
            jSONObject.put("sw", displayMetrics.widthPixels);
            jSONObject.put("db", (Object)(Build.BRAND == null ? "UNKNOWN" : Build.BRAND));
            jSONObject.put("dm", (Object)(Build.MODEL == null ? "UNKNOWN" : Build.MODEL));
            jSONObject.put("ph", m.a(context) ? 1 : 0);
            jSONObject.put("os", (Object)"Android");
            jSONObject.put("osv", (Object)(Build.VERSION.RELEASE == null ? "UNKNOWN" : Build.VERSION.RELEASE));
            TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
            int n2 = 3;
            String string = telephonyManager.getSimOperator();
            if (!TextUtils.isEmpty((CharSequence)string) && string.length() > 3) {
                jSONObject.put("ca", (Object)new StringBuffer(string).insert(3, '-').toString());
            }
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(this.h().b(), 0);
            jSONObject.put("cv", (Object)(k.e().a() ? "0.9.98_355b84e" : packageInfo.versionName));
            jSONObject.put("av", (Object)"0.9.98_355b84e");
            jSONObject.put("sn", (Object)packageManager.getApplicationLabel(context.getApplicationInfo()));
            jSONObject.put("v", (Object)GConfig.sGrowingScheme);
            jSONObject.put("p", (Object)this.a);
        }
        catch (JSONException var2_3) {
            LogUtil.d("GIO.VPAEvent", "generation the Visit Event error", (Throwable)var2_3);
        }
        catch (PackageManager.NameNotFoundException var2_4) {
            LogUtil.d("GIO.VPAEvent", "get PackageInfo error", (Throwable)var2_4);
        }
        return jSONObject;
    }

    private static boolean a(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
        int n2 = telephonyManager.getPhoneType();
        return n2 != 0;
    }
}

