/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.AsyncTask
 *  android.util.Pair
 */
package com.growingio.android.sdk.collection;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Pair;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.collection.q;
import com.growingio.android.sdk.collection.x;
import com.growingio.android.sdk.collection.z;
import com.growingio.android.sdk.utils.e;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

class y
extends AsyncTask {
    final /* synthetic */ x a;

    y(x x2) {
        this.a = x2;
    }

    protected /* varargs */ Pair a(Void ... arrvoid) {
        String string;
        c c2 = c.h();
        GConfig gConfig = GConfig.o();
        if (c2 == null) {
            return null;
        }
        String string2 = String.format(Locale.US, "/products/%s/android/%s/settings", c2.d(), c2.g().getPackageName());
        String string3 = this.a(string2, string = "timestamp=" + System.currentTimeMillis());
        if (string3 == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<String, String>(1);
        hashMap.put("If-None-Match", gConfig.t());
        com.growingio.android.sdk.utils.c c3 = new e().a(hashMap).a(String.format(Locale.US, "%s%s?%s&sign=%s", "https://tags.growingio.com", string2, string, string3)).a();
        Pair pair = c3.b();
        Map map = c3.a();
        if ((Integer)pair.first == 200) {
            List list;
            gConfig.c(new String((byte[])pair.second));
            if (map != null && map.containsKey("ETag") && (list = (List)map.get("ETag")).size() > 0) {
                gConfig.b((String)list.get(0));
            }
        }
        return pair;
    }

    protected void a(Pair pair) {
        if ((Integer)pair.first != 200 && (Integer)pair.first != 304 && q.h() < 1) {
            q.h(this.a.a).postDelayed((Runnable)new z(this), 5000);
        } else {
            q.b(true);
        }
        q.a(this.a.a, null);
    }

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

    protected /* synthetic */ void onPostExecute(Object object) {
        this.a((Pair)object);
    }

    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
        return this.a((Void[])arrobject);
    }
}

