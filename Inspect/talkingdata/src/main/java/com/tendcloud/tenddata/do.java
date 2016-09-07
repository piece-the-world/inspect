/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.util.DisplayMetrics
 *  android.util.JsonWriter
 *  android.util.Pair
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.JsonWriter;
import android.util.Pair;
import com.tendcloud.tenddata.TCAgent;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.cc;
import com.tendcloud.tenddata.cj;
import com.tendcloud.tenddata.cs;
import com.tendcloud.tenddata.dh;
import com.tendcloud.tenddata.dj;
import com.tendcloud.tenddata.dk;
import com.tendcloud.tenddata.dl;
import com.tendcloud.tenddata.dn;
import com.tendcloud.tenddata.dq;
import com.tendcloud.tenddata.dr;
import com.tendcloud.tenddata.du;
import com.tendcloud.tenddata.ew;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(value=16)
class do
implements dr.g {
    private static final String i = "www.talkingdata.com";
    private static final String j = "wss";
    private static final String k = "/codeless/app/sdk/";
    private static volatile do l = null;
    private final Context m;
    private final dk n;
    final dh a;
    private final Map o;
    private final d p;
    private final float q;
    private static final String r = "talkingdata.viewcrawler.changes";
    private static final String s = "config.events";
    private static final int t = 0;
    static final int b = 1;
    private static final int u = 2;
    private static final int v = 3;
    private static final int w = 4;
    private static final int x = 5;
    private static final int y = 6;
    private static final int z = 7;
    private static final int A = 8;
    private static final int B = 9;
    private static final int C = 10;
    private static final int D = 11;
    private static final int E = 12;
    public static final int c = 13;
    public static final String d = "-----BEGIN CERTIFICATE-----\nMIIFODCCBCCgAwIBAgIQUT+5dDhwtzRAQY0wkwaZ/zANBgkqhkiG9w0BAQsFADCB\nyjELMAkGA1UEBhMCVVMxFzAVBgNVBAoTDlZlcmlTaWduLCBJbmMuMR8wHQYDVQQL\nExZWZXJpU2lnbiBUcnVzdCBOZXR3b3JrMTowOAYDVQQLEzEoYykgMjAwNiBWZXJp\nU2lnbiwgSW5jLiAtIEZvciBhdXRob3JpemVkIHVzZSBvbmx5MUUwQwYDVQQDEzxW\nZXJpU2lnbiBDbGFzcyAzIFB1YmxpYyBQcmltYXJ5IENlcnRpZmljYXRpb24gQXV0\naG9yaXR5IC0gRzUwHhcNMTMxMDMxMDAwMDAwWhcNMjMxMDMwMjM1OTU5WjB+MQsw\nCQYDVQQGEwJVUzEdMBsGA1UEChMUU3ltYW50ZWMgQ29ycG9yYXRpb24xHzAdBgNV\nBAsTFlN5bWFudGVjIFRydXN0IE5ldHdvcmsxLzAtBgNVBAMTJlN5bWFudGVjIENs\nYXNzIDMgU2VjdXJlIFNlcnZlciBDQSAtIEc0MIIBIjANBgkqhkiG9w0BAQEFAAOC\nAQ8AMIIBCgKCAQEAstgFyhx0LbUXVjnFSlIJluhL2AzxaJ+aQihiw6UwU35VEYJb\nA3oNL+F5BMm0lncZgQGUWfm893qZJ4Itt4PdWid/sgN6nFMl6UgfRk/InSn4vnlW\n9vf92Tpo2otLgjNBEsPIPMzWlnqEIRoiBAMnF4scaGGTDw5RgDMdtLXO637QYqzu\ns3sBdO9pNevK1T2p7peYyo2qRA4lmUoVlqTObQJUHypqJuIGOmNIrLRM0XWTUP8T\nL9ba4cYY9Z/JJV3zADreJk20KQnNDz0jbxZKgRb78oMQw7jW2FUyPfG9D72MUpVK\nFpd6UiFjdS8W+cRmvvW1Cdj/JwDNRHxvSz+w9wIDAQABo4IBYzCCAV8wEgYDVR0T\nAQH/BAgwBgEB/wIBADAwBgNVHR8EKTAnMCWgI6Ahhh9odHRwOi8vczEuc3ltY2Iu\nY29tL3BjYTMtZzUuY3JsMA4GA1UdDwEB/wQEAwIBBjAvBggrBgEFBQcBAQQjMCEw\nHwYIKwYBBQUHMAGGE2h0dHA6Ly9zMi5zeW1jYi5jb20wawYDVR0gBGQwYjBgBgpg\nhkgBhvhFAQc2MFIwJgYIKwYBBQUHAgEWGmh0dHA6Ly93d3cuc3ltYXV0aC5jb20v\nY3BzMCgGCCsGAQUFBwICMBwaGmh0dHA6Ly93d3cuc3ltYXV0aC5jb20vcnBhMCkG\nA1UdEQQiMCCkHjAcMRowGAYDVQQDExFTeW1hbnRlY1BLSS0xLTUzNDAdBgNVHQ4E\nFgQUX2DPYZBV34RDFIpgKrL1evRDGO8wHwYDVR0jBBgwFoAUf9Nlp8Ld7LvwMAnz\nQzn6Aq8zMTMwDQYJKoZIhvcNAQELBQADggEBAF6UVkndji1l9cE2UbYD49qecxny\nH1mrWH5sJgUs+oHXXCMXIiw3k/eG7IXmsKP9H+IyqEVv4dn7ua/ScKAyQmW/hP4W\nKo8/xabWo5N9Q+l0IZE1KPRj6S7t9/Vcf0uatSDpCr3gRRAMFJSaXaXjS5HoJJtG\nQGX0InLNmfiIEfXzf+YzguaoxX7+0AjiJVgIcWjmzaLmFN5OUiQt/eV5E1PnXi8t\nTRttQBVSK/eHiXgSgW7ZTaoteNTCLD0IX4eRnh8OsN4wUmSGiaqdZpwOdgyA8nTY\nKvi4Os7X1g8RvmurFPW9QaAiY4nxug9vKWNmLT+sjHLF+8fk1A/yO0+MKcc=\n-----END CERTIFICATE-----\n";
    static final boolean e = false;
    static final boolean f = false;
    static final String g = "TDDynamicEvent";
    static final String h = "TDExceptionLog";

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static do a(Context context, String string, du du2) {
        if (l != null) return l;
        reference var3_3 = do.class;
        synchronized (do.class) {
            if (l != null) return l;
            {
                l = new do(context, string, du2);
            }
            // ** MonitorExit[var3_3] (shouldn't be in output)
            return l;
        }
    }

    static do a() {
        return l;
    }

    private do(Context context, String string, du du2) {
        this.m = context;
        this.a = new dh();
        this.o = this.d();
        this.q = Resources.getSystem().getDisplayMetrics().scaledDensity;
        du2.a(this.a);
        HandlerThread handlerThread = new HandlerThread("CodelessViewCrawler");
        handlerThread.setPriority(10);
        handlerThread.start();
        this.p = new d(context, string, handlerThread.getLooper(), this);
        ew.a().a(this.p);
        this.n = new dk(this.p);
        this.c();
    }

    d b() {
        return this.p;
    }

    public void c() {
        this.p.a();
        this.p.sendMessage(this.p.obtainMessage(0));
    }

    public void setEventBindings(JSONArray jSONArray) {
        Message message = this.p.obtainMessage(5);
        message.obj = jSONArray;
        this.p.sendMessage(message);
    }

    public void setVariants(JSONArray jSONArray) {
        Message message = this.p.obtainMessage(9);
        message.obj = jSONArray;
        this.p.sendMessage(message);
    }

    @Override
    public void onLayoutError(dr.e e2) {
        Message message = this.p.obtainMessage();
        message.what = 12;
        message.obj = e2;
        this.p.sendMessage(message);
    }

    public Map d() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("sdk_version", "+V2.2.37 gp");
        hashMap.put("system_name", "Android");
        hashMap.put("system_version", Build.VERSION.RELEASE == null ? "UNKNOWN" : Build.VERSION.RELEASE);
        hashMap.put("device_manufacturer", Build.MANUFACTURER == null ? "UNKNOWN" : Build.MANUFACTURER);
        hashMap.put("device_brand", Build.BRAND == null ? "UNKNOWN" : Build.BRAND);
        hashMap.put("device_model", Build.MODEL == null ? "UNKNOWN" : Build.MODEL);
        try {
            PackageManager packageManager = this.m.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(this.m.getPackageName(), 0);
            hashMap.put("app_version", packageInfo.versionName);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
        }
        catch (PackageManager.NameNotFoundException var2_3) {
            // empty catch block
        }
        return hashMap;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static X509Certificate b(String string) {
        if (cs.b(string)) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(string.getBytes());
        X509Certificate x509Certificate = null;
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            x509Certificate = (X509Certificate)certificateFactory.generateCertificate(byteArrayInputStream);
        }
        catch (Exception var3_4) {}
        finally {
            byteArrayInputStream = null;
        }
        return x509Certificate;
    }

    private static String b(JSONObject jSONObject, String string) {
        if (jSONObject.has(string) && !jSONObject.isNull(string)) {
            return jSONObject.getString(string);
        }
        return null;
    }

    static class c {
        public final JSONObject a;
        public final Pair b;

        public c(JSONObject jSONObject, Pair pair) {
            this.a = jSONObject;
            this.b = pair;
        }
    }

    static class b {
        public final String a;
        public final JSONObject b;
        public final Pair c;

        public b(String string, JSONObject jSONObject, Pair pair) {
            this.a = string;
            this.b = jSONObject;
            this.c = pair;
        }
    }

    class a
    implements dl.a {
        private a() {
        }

        @Override
        public void sendSnapshot(JSONObject jSONObject) {
            do.a().p.removeMessages(2);
            this.a(2, jSONObject);
        }

        @Override
        public void performEdit(JSONObject jSONObject) {
            this.a(3, jSONObject);
        }

        @Override
        public void clearEdits(JSONObject jSONObject) {
            this.a(10, jSONObject);
        }

        @Override
        public void setTweaks(JSONObject jSONObject) {
            this.a(11, jSONObject);
        }

        @Override
        public void bindEvents(JSONObject jSONObject) {
            this.a(6, jSONObject);
        }

        @Override
        public void a() {
            this.a(4, null);
        }

        @Override
        public void b() {
            Message message = do.this.p.obtainMessage(8);
            do.this.p.sendMessage(message);
        }

        private void a(int n2, JSONObject jSONObject) {
            Message message = do.a().p.obtainMessage(n2);
            if (jSONObject != null) {
                message.obj = jSONObject;
            }
            do.a().p.sendMessage(message);
        }
    }

    class d
    extends Handler {
        private dl b;
        private dq c;
        private final Context d;
        private final String e;
        private final Lock f;
        private final dj g;
        private final Map h;
        private final List i;
        private final List j;
        private final List k;
        private final List l;
        private final List m;
        private final Set n;

        public d(Context context, String string, Looper looper, dr.g g2) {
            super(looper);
            this.d = context;
            this.e = string;
            this.c = null;
            String string2 = null;
            if (null == string2) {
                string2 = context.getPackageName();
            }
            dn.b b2 = new dn.b(string2, context);
            this.g = new dj(b2, g2);
            this.h = new HashMap();
            this.i = new ArrayList();
            this.j = new ArrayList();
            this.k = new ArrayList();
            this.l = new ArrayList();
            this.m = new ArrayList();
            this.n = new HashSet();
            this.f = new ReentrantLock();
            this.f.lock();
        }

        public void a() {
            this.f.unlock();
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public void handleMessage(Message message) {
            this.f.lock();
            try {
                int n2 = message.what;
                switch (n2) {
                    case 0: {
                        this.b();
                        this.c();
                        return;
                    }
                    case 1: {
                        this.d();
                        return;
                    }
                    case 4: {
                        this.e();
                        return;
                    }
                    case 2: {
                        this.a((JSONObject)message.obj);
                        return;
                    }
                    case 7: {
                        this.b((String)message.obj);
                        return;
                    }
                    case 12: {
                        this.a((dr.e)message.obj);
                        return;
                    }
                    case 9: {
                        this.a((JSONArray)message.obj);
                        return;
                    }
                    case 3: {
                        this.b((JSONObject)message.obj);
                        return;
                    }
                    case 5: {
                        this.b((JSONArray)message.obj);
                        return;
                    }
                    case 6: {
                        this.d((JSONObject)message.obj);
                        return;
                    }
                    case 10: {
                        this.c((JSONObject)message.obj);
                        return;
                    }
                    case 8: {
                        this.f();
                        return;
                    }
                    case 13: {
                        this.sendEvent((Hashtable)message.obj);
                    }
                }
            }
            finally {
                this.f.unlock();
            }
        }

        private void b() {
            SharedPreferences sharedPreferences = this.h();
            String string = sharedPreferences.getString("talkingdata.viewcrawler.changes", null);
            if (null != string) {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    int n2 = jSONArray.length();
                    for (int i2 = 0; i2 < n2; ++i2) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        int n3 = jSONObject.getInt("id");
                        int n4 = jSONObject.getInt("experiment_id");
                        Pair pair = new Pair((Object)n4, (Object)n3);
                        this.n.add(pair);
                    }
                }
                catch (JSONException var3_4) {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.remove("talkingdata.viewcrawler.changes");
                    editor.remove("config.events");
                    editor.apply();
                }
            }
        }

        private void c() {
            SharedPreferences sharedPreferences = this.h();
            String string = sharedPreferences.getString("talkingdata.viewcrawler.changes", null);
            String string2 = sharedPreferences.getString("config.events", null);
            try {
                JSONArray jSONArray;
                Object object;
                int n2;
                if (null != string) {
                    this.k.clear();
                    this.l.clear();
                    jSONArray = new JSONArray(string);
                    n2 = jSONArray.length();
                    for (int i2 = 0; i2 < n2; ++i2) {
                        reference var14_18;
                        b b2;
                        Object object2;
                        object = jSONArray.getJSONObject(i2);
                        int n3 = object.getInt("id");
                        int n4 = object.getInt("experiment_id");
                        Pair pair = new Pair((Object)n4, (Object)n3);
                        JSONArray jSONArray2 = object.getJSONArray("actions");
                        for (int i3 = 0; i3 < jSONArray2.length(); ++i3) {
                            object2 = jSONArray2.getJSONObject(i3);
                            var14_18 = do.b((JSONObject)object2, "target_activity");
                            b2 = new b(var14_18, (JSONObject)object2, pair);
                            this.k.add(b2);
                        }
                        JSONArray jSONArray3 = object.getJSONArray("tweaks");
                        object2 = jSONArray3.length();
                        for (var14_18 = (reference)false ? 1 : 0; var14_18 < object2; ++var14_18) {
                            b2 = jSONArray3.getJSONObject((int)var14_18);
                            c c2 = new c((JSONObject)b2, pair);
                            this.l.add(c2);
                        }
                    }
                }
                if (null != string2) {
                    jSONArray = new JSONArray(string2);
                    this.m.clear();
                    for (n2 = 0; n2 < jSONArray.length(); ++n2) {
                        JSONObject jSONObject = jSONArray.getJSONObject(n2);
                        object = do.b(jSONObject, "target_activity");
                        this.m.add(new Pair(object, (Object)jSONObject));
                    }
                }
            }
            catch (JSONException var4_5) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.remove("talkingdata.viewcrawler.changes");
                editor.remove("config.events");
                editor.apply();
            }
            this.g();
        }

        private void d() {
            if (this.b != null && this.b.a()) {
                return;
            }
            String string = "wss://www.talkingdata.com/codeless/app/sdk/" + ab.a(ab.mContext);
            try {
                if ("wss".equals("wss")) {
                    SSLSocketFactory sSLSocketFactory = !cs.b("-----BEGIN CERTIFICATE-----\nMIIFODCCBCCgAwIBAgIQUT+5dDhwtzRAQY0wkwaZ/zANBgkqhkiG9w0BAQsFADCB\nyjELMAkGA1UEBhMCVVMxFzAVBgNVBAoTDlZlcmlTaWduLCBJbmMuMR8wHQYDVQQL\nExZWZXJpU2lnbiBUcnVzdCBOZXR3b3JrMTowOAYDVQQLEzEoYykgMjAwNiBWZXJp\nU2lnbiwgSW5jLiAtIEZvciBhdXRob3JpemVkIHVzZSBvbmx5MUUwQwYDVQQDEzxW\nZXJpU2lnbiBDbGFzcyAzIFB1YmxpYyBQcmltYXJ5IENlcnRpZmljYXRpb24gQXV0\naG9yaXR5IC0gRzUwHhcNMTMxMDMxMDAwMDAwWhcNMjMxMDMwMjM1OTU5WjB+MQsw\nCQYDVQQGEwJVUzEdMBsGA1UEChMUU3ltYW50ZWMgQ29ycG9yYXRpb24xHzAdBgNV\nBAsTFlN5bWFudGVjIFRydXN0IE5ldHdvcmsxLzAtBgNVBAMTJlN5bWFudGVjIENs\nYXNzIDMgU2VjdXJlIFNlcnZlciBDQSAtIEc0MIIBIjANBgkqhkiG9w0BAQEFAAOC\nAQ8AMIIBCgKCAQEAstgFyhx0LbUXVjnFSlIJluhL2AzxaJ+aQihiw6UwU35VEYJb\nA3oNL+F5BMm0lncZgQGUWfm893qZJ4Itt4PdWid/sgN6nFMl6UgfRk/InSn4vnlW\n9vf92Tpo2otLgjNBEsPIPMzWlnqEIRoiBAMnF4scaGGTDw5RgDMdtLXO637QYqzu\ns3sBdO9pNevK1T2p7peYyo2qRA4lmUoVlqTObQJUHypqJuIGOmNIrLRM0XWTUP8T\nL9ba4cYY9Z/JJV3zADreJk20KQnNDz0jbxZKgRb78oMQw7jW2FUyPfG9D72MUpVK\nFpd6UiFjdS8W+cRmvvW1Cdj/JwDNRHxvSz+w9wIDAQABo4IBYzCCAV8wEgYDVR0T\nAQH/BAgwBgEB/wIBADAwBgNVHR8EKTAnMCWgI6Ahhh9odHRwOi8vczEuc3ltY2Iu\nY29tL3BjYTMtZzUuY3JsMA4GA1UdDwEB/wQEAwIBBjAvBggrBgEFBQcBAQQjMCEw\nHwYIKwYBBQUHMAGGE2h0dHA6Ly9zMi5zeW1jYi5jb20wawYDVR0gBGQwYjBgBgpg\nhkgBhvhFAQc2MFIwJgYIKwYBBQUHAgEWGmh0dHA6Ly93d3cuc3ltYXV0aC5jb20v\nY3BzMCgGCCsGAQUFBwICMBwaGmh0dHA6Ly93d3cuc3ltYXV0aC5jb20vcnBhMCkG\nA1UdEQQiMCCkHjAcMRowGAYDVQQDExFTeW1hbnRlY1BLSS0xLTUzNDAdBgNVHQ4E\nFgQUX2DPYZBV34RDFIpgKrL1evRDGO8wHwYDVR0jBBgwFoAUf9Nlp8Ld7LvwMAnz\nQzn6Aq8zMTMwDQYJKoZIhvcNAQELBQADggEBAF6UVkndji1l9cE2UbYD49qecxny\nH1mrWH5sJgUs+oHXXCMXIiw3k/eG7IXmsKP9H+IyqEVv4dn7ua/ScKAyQmW/hP4W\nKo8/xabWo5N9Q+l0IZE1KPRj6S7t9/Vcf0uatSDpCr3gRRAMFJSaXaXjS5HoJJtG\nQGX0InLNmfiIEfXzf+YzguaoxX7+0AjiJVgIcWjmzaLmFN5OUiQt/eV5E1PnXi8t\nTRttQBVSK/eHiXgSgW7ZTaoteNTCLD0IX4eRnh8OsN4wUmSGiaqdZpwOdgyA8nTY\nKvi4Os7X1g8RvmurFPW9QaAiY4nxug9vKWNmLT+sjHLF+8fk1A/yO0+MKcc=\n-----END CERTIFICATE-----\n") ? cc.a(true, do.b("-----BEGIN CERTIFICATE-----\nMIIFODCCBCCgAwIBAgIQUT+5dDhwtzRAQY0wkwaZ/zANBgkqhkiG9w0BAQsFADCB\nyjELMAkGA1UEBhMCVVMxFzAVBgNVBAoTDlZlcmlTaWduLCBJbmMuMR8wHQYDVQQL\nExZWZXJpU2lnbiBUcnVzdCBOZXR3b3JrMTowOAYDVQQLEzEoYykgMjAwNiBWZXJp\nU2lnbiwgSW5jLiAtIEZvciBhdXRob3JpemVkIHVzZSBvbmx5MUUwQwYDVQQDEzxW\nZXJpU2lnbiBDbGFzcyAzIFB1YmxpYyBQcmltYXJ5IENlcnRpZmljYXRpb24gQXV0\naG9yaXR5IC0gRzUwHhcNMTMxMDMxMDAwMDAwWhcNMjMxMDMwMjM1OTU5WjB+MQsw\nCQYDVQQGEwJVUzEdMBsGA1UEChMUU3ltYW50ZWMgQ29ycG9yYXRpb24xHzAdBgNV\nBAsTFlN5bWFudGVjIFRydXN0IE5ldHdvcmsxLzAtBgNVBAMTJlN5bWFudGVjIENs\nYXNzIDMgU2VjdXJlIFNlcnZlciBDQSAtIEc0MIIBIjANBgkqhkiG9w0BAQEFAAOC\nAQ8AMIIBCgKCAQEAstgFyhx0LbUXVjnFSlIJluhL2AzxaJ+aQihiw6UwU35VEYJb\nA3oNL+F5BMm0lncZgQGUWfm893qZJ4Itt4PdWid/sgN6nFMl6UgfRk/InSn4vnlW\n9vf92Tpo2otLgjNBEsPIPMzWlnqEIRoiBAMnF4scaGGTDw5RgDMdtLXO637QYqzu\ns3sBdO9pNevK1T2p7peYyo2qRA4lmUoVlqTObQJUHypqJuIGOmNIrLRM0XWTUP8T\nL9ba4cYY9Z/JJV3zADreJk20KQnNDz0jbxZKgRb78oMQw7jW2FUyPfG9D72MUpVK\nFpd6UiFjdS8W+cRmvvW1Cdj/JwDNRHxvSz+w9wIDAQABo4IBYzCCAV8wEgYDVR0T\nAQH/BAgwBgEB/wIBADAwBgNVHR8EKTAnMCWgI6Ahhh9odHRwOi8vczEuc3ltY2Iu\nY29tL3BjYTMtZzUuY3JsMA4GA1UdDwEB/wQEAwIBBjAvBggrBgEFBQcBAQQjMCEw\nHwYIKwYBBQUHMAGGE2h0dHA6Ly9zMi5zeW1jYi5jb20wawYDVR0gBGQwYjBgBgpg\nhkgBhvhFAQc2MFIwJgYIKwYBBQUHAgEWGmh0dHA6Ly93d3cuc3ltYXV0aC5jb20v\nY3BzMCgGCCsGAQUFBwICMBwaGmh0dHA6Ly93d3cuc3ltYXV0aC5jb20vcnBhMCkG\nA1UdEQQiMCCkHjAcMRowGAYDVQQDExFTeW1hbnRlY1BLSS0xLTUzNDAdBgNVHQ4E\nFgQUX2DPYZBV34RDFIpgKrL1evRDGO8wHwYDVR0jBBgwFoAUf9Nlp8Ld7LvwMAnz\nQzn6Aq8zMTMwDQYJKoZIhvcNAQELBQADggEBAF6UVkndji1l9cE2UbYD49qecxny\nH1mrWH5sJgUs+oHXXCMXIiw3k/eG7IXmsKP9H+IyqEVv4dn7ua/ScKAyQmW/hP4W\nKo8/xabWo5N9Q+l0IZE1KPRj6S7t9/Vcf0uatSDpCr3gRRAMFJSaXaXjS5HoJJtG\nQGX0InLNmfiIEfXzf+YzguaoxX7+0AjiJVgIcWjmzaLmFN5OUiQt/eV5E1PnXi8t\nTRttQBVSK/eHiXgSgW7ZTaoteNTCLD0IX4eRnh8OsN4wUmSGiaqdZpwOdgyA8nTY\nKvi4Os7X1g8RvmurFPW9QaAiY4nxug9vKWNmLT+sjHLF+8fk1A/yO0+MKcc=\n-----END CERTIFICATE-----\n")) : cc.a(false, do.b("-----BEGIN CERTIFICATE-----\nMIIFODCCBCCgAwIBAgIQUT+5dDhwtzRAQY0wkwaZ/zANBgkqhkiG9w0BAQsFADCB\nyjELMAkGA1UEBhMCVVMxFzAVBgNVBAoTDlZlcmlTaWduLCBJbmMuMR8wHQYDVQQL\nExZWZXJpU2lnbiBUcnVzdCBOZXR3b3JrMTowOAYDVQQLEzEoYykgMjAwNiBWZXJp\nU2lnbiwgSW5jLiAtIEZvciBhdXRob3JpemVkIHVzZSBvbmx5MUUwQwYDVQQDEzxW\nZXJpU2lnbiBDbGFzcyAzIFB1YmxpYyBQcmltYXJ5IENlcnRpZmljYXRpb24gQXV0\naG9yaXR5IC0gRzUwHhcNMTMxMDMxMDAwMDAwWhcNMjMxMDMwMjM1OTU5WjB+MQsw\nCQYDVQQGEwJVUzEdMBsGA1UEChMUU3ltYW50ZWMgQ29ycG9yYXRpb24xHzAdBgNV\nBAsTFlN5bWFudGVjIFRydXN0IE5ldHdvcmsxLzAtBgNVBAMTJlN5bWFudGVjIENs\nYXNzIDMgU2VjdXJlIFNlcnZlciBDQSAtIEc0MIIBIjANBgkqhkiG9w0BAQEFAAOC\nAQ8AMIIBCgKCAQEAstgFyhx0LbUXVjnFSlIJluhL2AzxaJ+aQihiw6UwU35VEYJb\nA3oNL+F5BMm0lncZgQGUWfm893qZJ4Itt4PdWid/sgN6nFMl6UgfRk/InSn4vnlW\n9vf92Tpo2otLgjNBEsPIPMzWlnqEIRoiBAMnF4scaGGTDw5RgDMdtLXO637QYqzu\ns3sBdO9pNevK1T2p7peYyo2qRA4lmUoVlqTObQJUHypqJuIGOmNIrLRM0XWTUP8T\nL9ba4cYY9Z/JJV3zADreJk20KQnNDz0jbxZKgRb78oMQw7jW2FUyPfG9D72MUpVK\nFpd6UiFjdS8W+cRmvvW1Cdj/JwDNRHxvSz+w9wIDAQABo4IBYzCCAV8wEgYDVR0T\nAQH/BAgwBgEB/wIBADAwBgNVHR8EKTAnMCWgI6Ahhh9odHRwOi8vczEuc3ltY2Iu\nY29tL3BjYTMtZzUuY3JsMA4GA1UdDwEB/wQEAwIBBjAvBggrBgEFBQcBAQQjMCEw\nHwYIKwYBBQUHMAGGE2h0dHA6Ly9zMi5zeW1jYi5jb20wawYDVR0gBGQwYjBgBgpg\nhkgBhvhFAQc2MFIwJgYIKwYBBQUHAgEWGmh0dHA6Ly93d3cuc3ltYXV0aC5jb20v\nY3BzMCgGCCsGAQUFBwICMBwaGmh0dHA6Ly93d3cuc3ltYXV0aC5jb20vcnBhMCkG\nA1UdEQQiMCCkHjAcMRowGAYDVQQDExFTeW1hbnRlY1BLSS0xLTUzNDAdBgNVHQ4E\nFgQUX2DPYZBV34RDFIpgKrL1evRDGO8wHwYDVR0jBBgwFoAUf9Nlp8Ld7LvwMAnz\nQzn6Aq8zMTMwDQYJKoZIhvcNAQELBQADggEBAF6UVkndji1l9cE2UbYD49qecxny\nH1mrWH5sJgUs+oHXXCMXIiw3k/eG7IXmsKP9H+IyqEVv4dn7ua/ScKAyQmW/hP4W\nKo8/xabWo5N9Q+l0IZE1KPRj6S7t9/Vcf0uatSDpCr3gRRAMFJSaXaXjS5HoJJtG\nQGX0InLNmfiIEfXzf+YzguaoxX7+0AjiJVgIcWjmzaLmFN5OUiQt/eV5E1PnXi8t\nTRttQBVSK/eHiXgSgW7ZTaoteNTCLD0IX4eRnh8OsN4wUmSGiaqdZpwOdgyA8nTY\nKvi4Os7X1g8RvmurFPW9QaAiY4nxug9vKWNmLT+sjHLF+8fk1A/yO0+MKcc=\n-----END CERTIFICATE-----\n"));
                    if (null == sSLSocketFactory) {
                        return;
                    }
                    Socket socket = sSLSocketFactory.createSocket();
                    this.b = new dl(new URI(string), new a(), socket);
                } else {
                    this.b = new dl(new URI(string), new a(), null);
                }
            }
            catch (URISyntaxException var2_3) {
            }
            catch (Exception var2_4) {
                // empty catch block
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        private void a(String string) {
            if (this.b == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_message", (Object)string);
            }
            catch (JSONException var3_3) {
                // empty catch block
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.b.b());
            outputStreamWriter.write("{\"type\": \"error\", ");
            outputStreamWriter.write("\"payload\": ");
            outputStreamWriter.write(jSONObject.toString());
            outputStreamWriter.write("}");
            try {
                outputStreamWriter.close();
                return;
            }
            catch (IOException var4_5) {
                return;
            }
            catch (IOException iOException) {
                try {
                    outputStreamWriter.close();
                    return;
                }
                catch (IOException var4_7) {
                    return;
                }
                catch (Throwable throwable) {
                    try {
                        outputStreamWriter.close();
                        throw throwable;
                    }
                    catch (IOException var6_9) {
                        // empty catch block
                    }
                    throw throwable;
                }
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        private void e() {
            if (this.b == null) {
                return;
            }
            BufferedOutputStream bufferedOutputStream = this.b.b();
            JsonWriter jsonWriter = new JsonWriter((Writer)new OutputStreamWriter(bufferedOutputStream));
            jsonWriter.beginObject();
            jsonWriter.name("type").value("device_info_response");
            jsonWriter.name("payload").beginObject();
            jsonWriter.name("scaled_density").value((double)l.q);
            jsonWriter.name("ssid").value(cj.v(this.d));
            for (Map.Entry entry : do.a().o.entrySet()) {
                jsonWriter.name((String)entry.getKey()).value((String)entry.getValue());
            }
            jsonWriter.endObject();
            jsonWriter.endObject();
            try {
                jsonWriter.close();
                return;
            }
            catch (IOException var3_4) {
                return;
            }
            catch (IOException iOException) {
                try {
                    jsonWriter.close();
                    return;
                }
                catch (IOException var3_6) {
                    return;
                }
                catch (Throwable throwable) {
                    try {
                        jsonWriter.close();
                        throw throwable;
                    }
                    catch (IOException var6_9) {
                        // empty catch block
                    }
                    throw throwable;
                }
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        private void a(JSONObject jSONObject) {
            long l2 = System.currentTimeMillis();
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
                if (jSONObject2.has("config")) {
                    this.c = this.g.a(jSONObject2);
                }
            }
            catch (Throwable var4_4) {
                return;
            }
            if (null == this.c) {
                return;
            }
            long l3 = System.currentTimeMillis();
            BufferedOutputStream bufferedOutputStream = this.b.b();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(bufferedOutputStream);
            outputStreamWriter.write("{");
            outputStreamWriter.write("\"type\": \"snapshot_response\",");
            outputStreamWriter.write("\"payload\": {");
            outputStreamWriter.write("\"activities\":");
            outputStreamWriter.flush();
            this.c.a(do.e().a, bufferedOutputStream);
            long l4 = System.currentTimeMillis() - l2;
            outputStreamWriter.write(",\"snapshot_time_millis\": ");
            outputStreamWriter.write(Long.toString(l4));
            outputStreamWriter.write("}");
            outputStreamWriter.write("}");
            try {
                outputStreamWriter.close();
                return;
            }
            catch (IOException var8_9) {
                return;
            }
            catch (IOException iOException) {
                try {
                    outputStreamWriter.close();
                    return;
                }
                catch (IOException var8_11) {
                    return;
                }
                catch (Throwable throwable) {
                    try {
                        outputStreamWriter.close();
                        throw throwable;
                    }
                    catch (IOException var11_13) {
                        // empty catch block
                    }
                    throw throwable;
                }
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        private void b(String string) {
            if (this.b == null) {
                return;
            }
            BufferedOutputStream bufferedOutputStream = this.b.b();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(bufferedOutputStream);
            JsonWriter jsonWriter = new JsonWriter((Writer)outputStreamWriter);
            jsonWriter.beginObject();
            jsonWriter.name("type").value("track_message");
            jsonWriter.name("payload");
            jsonWriter.beginObject();
            jsonWriter.name("event_name").value(string);
            jsonWriter.endObject();
            jsonWriter.endObject();
            jsonWriter.flush();
            try {
                jsonWriter.close();
                return;
            }
            catch (IOException var5_5) {
                return;
            }
            catch (IOException iOException) {
                try {
                    jsonWriter.close();
                    return;
                }
                catch (IOException var5_7) {
                    return;
                }
                catch (Throwable throwable) {
                    try {
                        jsonWriter.close();
                        throw throwable;
                    }
                    catch (IOException var7_9) {
                        // empty catch block
                    }
                    throw throwable;
                }
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        private void a(dr.e e2) {
            if (this.b == null) {
                return;
            }
            BufferedOutputStream bufferedOutputStream = this.b.b();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(bufferedOutputStream);
            JsonWriter jsonWriter = new JsonWriter((Writer)outputStreamWriter);
            jsonWriter.beginObject();
            jsonWriter.name("type").value("layout_error");
            jsonWriter.name("exception_type").value(e2.a());
            jsonWriter.name("cid").value(e2.b());
            jsonWriter.endObject();
            try {
                jsonWriter.close();
                return;
            }
            catch (IOException var5_5) {
                return;
            }
            catch (IOException iOException) {
                try {
                    jsonWriter.close();
                    return;
                }
                catch (IOException var5_7) {
                    return;
                }
                catch (Throwable throwable) {
                    try {
                        jsonWriter.close();
                        throw throwable;
                    }
                    catch (IOException var7_9) {
                        // empty catch block
                    }
                    throw throwable;
                }
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public void sendEvent(Hashtable hashtable) {
            if (this.b == null || !this.b.a()) {
                try {
                    String string = hashtable.get("id").toString();
                    hashtable.remove("id");
                    TCAgent.onEvent(ab.mContext, string, "", hashtable);
                    return;
                }
                catch (Throwable var2_3) {
                    // empty catch block
                }
                return;
            }
            BufferedOutputStream bufferedOutputStream = this.b.b();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(bufferedOutputStream);
            JsonWriter jsonWriter = new JsonWriter((Writer)outputStreamWriter);
            jsonWriter.beginObject();
            jsonWriter.name("type").value("event_triggered_response");
            for (Map.Entry entry : hashtable.entrySet()) {
                jsonWriter.name((String)entry.getKey()).value(entry.getValue() + "");
            }
            jsonWriter.endObject();
            try {
                jsonWriter.close();
                return;
            }
            catch (IOException var5_8) {
                return;
            }
            catch (IOException iOException) {
                try {
                    jsonWriter.close();
                    return;
                }
                catch (IOException var5_10) {
                    return;
                }
                catch (Throwable throwable) {
                    try {
                        jsonWriter.close();
                        throw throwable;
                    }
                    catch (IOException var8_13) {
                        // empty catch block
                    }
                    throw throwable;
                }
            }
        }

        private void b(JSONObject jSONObject) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
                JSONArray jSONArray = jSONObject2.getJSONArray("actions");
                for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                    String string = do.b(jSONObject3, "target_activity");
                    String string2 = jSONObject3.getString("id");
                    this.h.put(string2, new Pair((Object)string, (Object)jSONObject3));
                }
                this.g();
            }
            catch (JSONException var2_3) {
                // empty catch block
            }
        }

        private void c(JSONObject jSONObject) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
                JSONArray jSONArray = jSONObject2.getJSONArray("actions");
                for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                    String string = jSONArray.getString(i2);
                    this.h.remove(string);
                }
            }
            catch (JSONException var2_3) {
                // empty catch block
            }
            this.g();
        }

        private void a(JSONArray jSONArray) {
            SharedPreferences sharedPreferences = this.h();
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("talkingdata.viewcrawler.changes", jSONArray.toString());
            editor.apply();
            this.c();
        }

        private void b(JSONArray jSONArray) {
            SharedPreferences sharedPreferences = this.h();
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("config.events", jSONArray.toString());
            editor.apply();
            this.c();
        }

        private void d(JSONObject jSONObject) {
            JSONArray jSONArray;
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
                jSONArray = jSONObject2.getJSONArray("events");
            }
            catch (JSONException var3_3) {
                return;
            }
            int n2 = jSONArray.length();
            this.j.clear();
            for (int i2 = 0; i2 < n2; ++i2) {
                try {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                    String string = do.b(jSONObject3, "target_activity");
                    this.j.add(new Pair((Object)string, (Object)jSONObject3));
                    continue;
                }
                catch (JSONException var5_8) {
                    // empty catch block
                }
            }
            this.g();
        }

        private void f() {
            this.h.clear();
            this.j.clear();
            this.c = null;
            this.g();
        }

        private void g() {
            try {
                int n2;
                dr dr2;
                Pair pair;
                ArrayList<Pair> arrayList = new ArrayList<Pair>();
                HashSet hashSet = new HashSet();
                int n3 = this.m.size();
                for (n2 = 0; n2 < n3; ++n2) {
                    pair = (Pair)this.m.get(n2);
                    try {
                        dr2 = this.g.a((JSONObject)pair.second, do.a().n);
                        if (dr2 == null) continue;
                        arrayList.add(new Pair(pair.first, (Object)dr2));
                        continue;
                    }
                    catch (Throwable var6_10) {
                        // empty catch block
                    }
                }
                n3 = this.j.size();
                for (n2 = 0; n2 < n3; ++n2) {
                    pair = (Pair)this.j.get(n2);
                    try {
                        dr2 = this.g.a((JSONObject)pair.second, l.n);
                        arrayList.add(new Pair(pair.first, (Object)dr2));
                        continue;
                    }
                    catch (Throwable var6_11) {
                        // empty catch block
                    }
                }
                HashMap<Object, List> hashMap = new HashMap<Object, List>();
                n2 = arrayList.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    List list;
                    dr2 = (Pair)arrayList.get(i2);
                    if (hashMap.containsKey(dr2.first)) {
                        list = (List)hashMap.get(dr2.first);
                    } else {
                        list = new ArrayList();
                        hashMap.put(dr2.first, list);
                    }
                    list.add(dr2.second);
                }
                do.e().a.a(hashMap);
                this.n.addAll(hashSet);
            }
            catch (Throwable var1_2) {
                // empty catch block
            }
        }

        private SharedPreferences h() {
            String string = "TalingDataConfig" + this.e;
            return this.d.getSharedPreferences(string, 0);
        }
    }

}

