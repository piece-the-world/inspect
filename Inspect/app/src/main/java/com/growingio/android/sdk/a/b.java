/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.os.AsyncTask
 *  android.util.Pair
 */
package com.growingio.android.sdk.a;

import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.util.Pair;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.e;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class b
extends AsyncTask {
    protected /* varargs */ Pair a(Void ... arrvoid) {
        String string;
        c c2 = c.k();
        GConfig gConfig = GConfig.q();
        if (c2 == null) {
            return null;
        }
        String string2 = String.format(Locale.US, "/products/%s/android/%s/settings", c2.c(), c2.b());
        String string3 = this.a(string2, string = "timestamp=" + System.currentTimeMillis());
        if (string3 == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<String, String>(1);
        hashMap.put("If-None-Match", gConfig.u());
        com.growingio.android.sdk.utils.c c3 = new e().a(hashMap).a(String.format(Locale.US, "%s%s?%s&sign=%s", "https://tags.growingio.com", string2, string, string3)).a();
        Pair pair = c3.b();
        try {
            Map map = c3.a();
            if ((Integer)pair.first == 200) {
                List list;
                gConfig.c(new String((byte[])pair.second));
                if (map != null && map.containsKey("ETag") && (list = (List)map.get("ETag")).size() > 0) {
                    gConfig.b((String)list.get(0));
                }
            }
        }
        catch (Throwable var10_11) {
            LogUtil.d(var10_11);
        }
        return pair;
    }

    @TargetApi(value=9)
    private String a(String string, String string2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(String.format(Locale.US, "api=%s&%s", string, string2).getBytes(Charset.forName("UTF-8")));
            byte[] arrby = messageDigest.digest();
            String string3 = new BigInteger(1, arrby).toString(16);
            int n2 = 40;
            if (string3.length() >= 40) {
                return string3;
            }
            StringBuilder stringBuilder = new StringBuilder(40);
            int n3 = 40 - string3.length();
            while (n3-- > 0) {
                stringBuilder.append("0");
            }
            return stringBuilder.append(string3).toString();
        }
        catch (Exception var4_5) {
            var4_5.printStackTrace();
            return null;
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
        return this.a((Void[])arrobject);
    }
}

