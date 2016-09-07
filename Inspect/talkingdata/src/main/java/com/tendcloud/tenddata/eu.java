/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.content.Context;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.cb;
import com.tendcloud.tenddata.cc;
import com.tendcloud.tenddata.cm;
import com.tendcloud.tenddata.dx;
import com.tendcloud.tenddata.ed;
import com.tendcloud.tenddata.ee;
import com.tendcloud.tenddata.ev;
import com.tendcloud.tenddata.gg;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

class eu {
    public static final String a = "jic.talkingdata.com";
    private static String f = null;
    private static String g = "https";
    private static final String h = g + "://" + "jic.talkingdata.com" + "/sdk/conf?";
    public static final long b = 259200000;
    private static final long i = 5;
    private static long j = 0;
    private static long k = 0;
    private static final String l = "frequency";
    private static final String m = "interval";
    private static final String n = "configVersion";
    private static final String o = "lastGetCloudSettingsTime";
    private static final String p = "SDKInitNumber";
    private static final String q = "SDKInitTime";
    protected static final String c = "isDeveloper";
    private static final String r = "TD";
    protected final String d = "TDCloudSettingsConfig" + ab.a(ab.mContext);
    private static volatile eu s = null;
    HashMap e = new HashMap();
    private static final String t = "-----BEGIN CERTIFICATE-----\nMIIFODCCBCCgAwIBAgIQUT+5dDhwtzRAQY0wkwaZ/zANBgkqhkiG9w0BAQsFADCB\nyjELMAkGA1UEBhMCVVMxFzAVBgNVBAoTDlZlcmlTaWduLCBJbmMuMR8wHQYDVQQL\nExZWZXJpU2lnbiBUcnVzdCBOZXR3b3JrMTowOAYDVQQLEzEoYykgMjAwNiBWZXJp\nU2lnbiwgSW5jLiAtIEZvciBhdXRob3JpemVkIHVzZSBvbmx5MUUwQwYDVQQDEzxW\nZXJpU2lnbiBDbGFzcyAzIFB1YmxpYyBQcmltYXJ5IENlcnRpZmljYXRpb24gQXV0\naG9yaXR5IC0gRzUwHhcNMTMxMDMxMDAwMDAwWhcNMjMxMDMwMjM1OTU5WjB+MQsw\nCQYDVQQGEwJVUzEdMBsGA1UEChMUU3ltYW50ZWMgQ29ycG9yYXRpb24xHzAdBgNV\nBAsTFlN5bWFudGVjIFRydXN0IE5ldHdvcmsxLzAtBgNVBAMTJlN5bWFudGVjIENs\nYXNzIDMgU2VjdXJlIFNlcnZlciBDQSAtIEc0MIIBIjANBgkqhkiG9w0BAQEFAAOC\nAQ8AMIIBCgKCAQEAstgFyhx0LbUXVjnFSlIJluhL2AzxaJ+aQihiw6UwU35VEYJb\nA3oNL+F5BMm0lncZgQGUWfm893qZJ4Itt4PdWid/sgN6nFMl6UgfRk/InSn4vnlW\n9vf92Tpo2otLgjNBEsPIPMzWlnqEIRoiBAMnF4scaGGTDw5RgDMdtLXO637QYqzu\ns3sBdO9pNevK1T2p7peYyo2qRA4lmUoVlqTObQJUHypqJuIGOmNIrLRM0XWTUP8T\nL9ba4cYY9Z/JJV3zADreJk20KQnNDz0jbxZKgRb78oMQw7jW2FUyPfG9D72MUpVK\nFpd6UiFjdS8W+cRmvvW1Cdj/JwDNRHxvSz+w9wIDAQABo4IBYzCCAV8wEgYDVR0T\nAQH/BAgwBgEB/wIBADAwBgNVHR8EKTAnMCWgI6Ahhh9odHRwOi8vczEuc3ltY2Iu\nY29tL3BjYTMtZzUuY3JsMA4GA1UdDwEB/wQEAwIBBjAvBggrBgEFBQcBAQQjMCEw\nHwYIKwYBBQUHMAGGE2h0dHA6Ly9zMi5zeW1jYi5jb20wawYDVR0gBGQwYjBgBgpg\nhkgBhvhFAQc2MFIwJgYIKwYBBQUHAgEWGmh0dHA6Ly93d3cuc3ltYXV0aC5jb20v\nY3BzMCgGCCsGAQUFBwICMBwaGmh0dHA6Ly93d3cuc3ltYXV0aC5jb20vcnBhMCkG\nA1UdEQQiMCCkHjAcMRowGAYDVQQDExFTeW1hbnRlY1BLSS0xLTUzNDAdBgNVHQ4E\nFgQUX2DPYZBV34RDFIpgKrL1evRDGO8wHwYDVR0jBBgwFoAUf9Nlp8Ld7LvwMAnz\nQzn6Aq8zMTMwDQYJKoZIhvcNAQELBQADggEBAF6UVkndji1l9cE2UbYD49qecxny\nH1mrWH5sJgUs+oHXXCMXIiw3k/eG7IXmsKP9H+IyqEVv4dn7ua/ScKAyQmW/hP4W\nKo8/xabWo5N9Q+l0IZE1KPRj6S7t9/Vcf0uatSDpCr3gRRAMFJSaXaXjS5HoJJtG\nQGX0InLNmfiIEfXzf+YzguaoxX7+0AjiJVgIcWjmzaLmFN5OUiQt/eV5E1PnXi8t\nTRttQBVSK/eHiXgSgW7ZTaoteNTCLD0IX4eRnh8OsN4wUmSGiaqdZpwOdgyA8nTY\nKvi4Os7X1g8RvmurFPW9QaAiY4nxug9vKWNmLT+sjHLF+8fk1A/yO0+MKcc=\n-----END CERTIFICATE-----\n";

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static eu a() {
        if (s != null) return s;
        reference var0 = eu.class;
        synchronized (eu.class) {
            if (s != null) return s;
            {
                s = new eu();
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return s;
        }
    }

    private eu() {
        new Thread(new ev(this)).start();
    }

    private boolean b() {
        try {
            boolean bl2 = ab.a();
            if (bl2) {
                cm.a(ab.mContext, this.d, "SDKInitNumber", 0);
                return true;
            }
            long l2 = cm.b(ab.mContext, this.d, "SDKInitNumber", 0);
            cm.a(ab.mContext, this.d, "SDKInitNumber", l2 + 1);
            long l3 = System.currentTimeMillis() - cm.b(ab.mContext, this.d, "lastGetCloudSettingsTime", System.currentTimeMillis());
            long l4 = cm.b(ab.mContext, this.d, "interval", 0);
            long l5 = cm.b(ab.mContext, this.d, "frequency", 1);
            long l6 = cm.b(ab.mContext, this.d, "SDKInitNumber", 0);
            if (l5 == 1 && l3 >= l4 || l5 != 1 && l6 >= l5) {
                cm.a(ab.mContext, this.d, "SDKInitNumber", 0);
                return true;
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
        return false;
    }

    private void c() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("id=" + ab.a(ab.mContext));
            stringBuffer.append("&p=1");
            String string = cb.a().c(ab.mContext);
            int n2 = cb.a().b(ab.mContext);
            stringBuffer.append("&v=" + URLEncoder.encode(new StringBuilder().append(string).append("+").append(n2).toString(), "UTF-8"));
            stringBuffer.append("&sv=" + URLEncoder.encode("+V2.2.37 gp".substring(1), "UTF-8"));
            String string2 = cm.b(ab.mContext, this.d, "configVersion", "a");
            stringBuffer.append(string2.equals("") ? "" : "&cv=" + URLEncoder.encode(string2, "UTF-8"));
            String string3 = h + stringBuffer.toString();
            String string4 = cc.a(string3, "-----BEGIN CERTIFICATE-----\nMIIFODCCBCCgAwIBAgIQUT+5dDhwtzRAQY0wkwaZ/zANBgkqhkiG9w0BAQsFADCB\nyjELMAkGA1UEBhMCVVMxFzAVBgNVBAoTDlZlcmlTaWduLCBJbmMuMR8wHQYDVQQL\nExZWZXJpU2lnbiBUcnVzdCBOZXR3b3JrMTowOAYDVQQLEzEoYykgMjAwNiBWZXJp\nU2lnbiwgSW5jLiAtIEZvciBhdXRob3JpemVkIHVzZSBvbmx5MUUwQwYDVQQDEzxW\nZXJpU2lnbiBDbGFzcyAzIFB1YmxpYyBQcmltYXJ5IENlcnRpZmljYXRpb24gQXV0\naG9yaXR5IC0gRzUwHhcNMTMxMDMxMDAwMDAwWhcNMjMxMDMwMjM1OTU5WjB+MQsw\nCQYDVQQGEwJVUzEdMBsGA1UEChMUU3ltYW50ZWMgQ29ycG9yYXRpb24xHzAdBgNV\nBAsTFlN5bWFudGVjIFRydXN0IE5ldHdvcmsxLzAtBgNVBAMTJlN5bWFudGVjIENs\nYXNzIDMgU2VjdXJlIFNlcnZlciBDQSAtIEc0MIIBIjANBgkqhkiG9w0BAQEFAAOC\nAQ8AMIIBCgKCAQEAstgFyhx0LbUXVjnFSlIJluhL2AzxaJ+aQihiw6UwU35VEYJb\nA3oNL+F5BMm0lncZgQGUWfm893qZJ4Itt4PdWid/sgN6nFMl6UgfRk/InSn4vnlW\n9vf92Tpo2otLgjNBEsPIPMzWlnqEIRoiBAMnF4scaGGTDw5RgDMdtLXO637QYqzu\ns3sBdO9pNevK1T2p7peYyo2qRA4lmUoVlqTObQJUHypqJuIGOmNIrLRM0XWTUP8T\nL9ba4cYY9Z/JJV3zADreJk20KQnNDz0jbxZKgRb78oMQw7jW2FUyPfG9D72MUpVK\nFpd6UiFjdS8W+cRmvvW1Cdj/JwDNRHxvSz+w9wIDAQABo4IBYzCCAV8wEgYDVR0T\nAQH/BAgwBgEB/wIBADAwBgNVHR8EKTAnMCWgI6Ahhh9odHRwOi8vczEuc3ltY2Iu\nY29tL3BjYTMtZzUuY3JsMA4GA1UdDwEB/wQEAwIBBjAvBggrBgEFBQcBAQQjMCEw\nHwYIKwYBBQUHMAGGE2h0dHA6Ly9zMi5zeW1jYi5jb20wawYDVR0gBGQwYjBgBgpg\nhkgBhvhFAQc2MFIwJgYIKwYBBQUHAgEWGmh0dHA6Ly93d3cuc3ltYXV0aC5jb20v\nY3BzMCgGCCsGAQUFBwICMBwaGmh0dHA6Ly93d3cuc3ltYXV0aC5jb20vcnBhMCkG\nA1UdEQQiMCCkHjAcMRowGAYDVQQDExFTeW1hbnRlY1BLSS0xLTUzNDAdBgNVHQ4E\nFgQUX2DPYZBV34RDFIpgKrL1evRDGO8wHwYDVR0jBBgwFoAUf9Nlp8Ld7LvwMAnz\nQzn6Aq8zMTMwDQYJKoZIhvcNAQELBQADggEBAF6UVkndji1l9cE2UbYD49qecxny\nH1mrWH5sJgUs+oHXXCMXIiw3k/eG7IXmsKP9H+IyqEVv4dn7ua/ScKAyQmW/hP4W\nKo8/xabWo5N9Q+l0IZE1KPRj6S7t9/Vcf0uatSDpCr3gRRAMFJSaXaXjS5HoJJtG\nQGX0InLNmfiIEfXzf+YzguaoxX7+0AjiJVgIcWjmzaLmFN5OUiQt/eV5E1PnXi8t\nTRttQBVSK/eHiXgSgW7ZTaoteNTCLD0IX4eRnh8OsN4wUmSGiaqdZpwOdgyA8nTY\nKvi4Os7X1g8RvmurFPW9QaAiY4nxug9vKWNmLT+sjHLF+8fk1A/yO0+MKcc=\n-----END CERTIFICATE-----\n", true);
            if (string4 != null) {
                Object object;
                cm.a(ab.mContext, this.d, "lastGetCloudSettingsTime", System.currentTimeMillis());
                JSONObject jSONObject = new JSONObject(string4);
                if (jSONObject.has("cv")) {
                    object = jSONObject.get("cv");
                    cm.a(ab.mContext, this.d, "configVersion", object + "");
                }
                if (jSONObject.has("pipline_settings")) {
                    object = jSONObject.getJSONObject("pipline_settings");
                    if (object.has("frequency")) {
                        j = object.getLong("frequency");
                        j = j >= 5 ? 5 : (j < 1 ? 1 : j);
                        cm.a(ab.mContext, this.d, "frequency", j);
                    }
                    if (object.has("interval")) {
                        k = object.getLong("interval");
                        k = j > 1 ? 0 : (k > 259200000 ? 259200000 : k);
                        cm.a(ab.mContext, this.d, "interval", k);
                    }
                }
                if (jSONObject.has("events")) {
                    object = jSONObject.getJSONArray("events");
                    dx dx2 = new dx();
                    dx2.a.put("cloudSettingsType", "codeless");
                    dx2.a.put("data", object);
                    gg.a().post(dx2);
                }
            }
        }
        catch (Throwable var1_6) {
            // empty catch block
        }
    }

    void a(HashMap hashMap) {
        ed.a("Enter cloud settings initFundamentalData");
        String string = ee.l();
        b b2 = b.a(string);
    }

    static /* synthetic */ boolean a(eu eu2) {
        return eu2.b();
    }

    static /* synthetic */ void b(eu eu2) {
        eu2.c();
    }

    static {
        try {
            gg.a().register(eu.a());
        }
        catch (Throwable var0) {
            // empty catch block
        }
    }

    static class a {
        String a = null;
        long b = -1;
        String c = null;
        String d = null;
        int e = 10;

        a() {
        }

        void a(JSONObject jSONObject) {
            try {
                if (jSONObject != null) {
                    this.a = jSONObject.optString("Name");
                    this.b = this.a(jSONObject.optString("Interval"));
                    this.c = jSONObject.optString("EnableTime");
                    this.d = jSONObject.optString("DisableTime");
                    this.e = jSONObject.optInt("MinPowerThreshold");
                }
            }
            catch (Throwable var2_2) {
                // empty catch block
            }
        }

        private long a(String string) {
            long l2 = 0;
            if (string != null && !string.trim().isEmpty()) {
                String string2 = string.substring(string.length() - 1);
                if (!this.b(string2)) {
                    if (string2.equals("s")) {
                        l2 = Long.parseLong(string.substring(0, string.length() - 2));
                    } else if (string2.equals("m")) {
                        l2 = Long.parseLong(string.substring(0, string.length() - 2)) * 60;
                    } else if (string2.equals("h")) {
                        l2 = Long.parseLong(string.substring(0, string.length() - 2)) * 60 * 60;
                    }
                } else {
                    l2 = Long.parseLong(string);
                }
            }
            return l2;
        }

        private final boolean b(String string) {
            if (string != null && !"".equals(string.trim())) {
                return string.matches("^[0-9]*$");
            }
            return false;
        }
    }

    static class b {
        private static volatile b g = null;
        String a = "Analytics";
        int b = 0;
        int c = 10;
        int d = 0;
        HashMap e;
        HashMap f;

        private b() {
        }

        static b a() {
            return b.a(null);
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        static b a(String string) {
            if (string == null || string.isEmpty()) {
                return g;
            }
            if (g != null) return g;
            reference var1_1 = b.class;
            synchronized (b.class) {
                if (g != null) return g;
                {
                    g = new b();
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        if (jSONObject == null) return g;
                        {
                            Iterator iterator;
                            JSONObject jSONObject2;
                            b.g.b = jSONObject.optInt("Status");
                            b.g.c = jSONObject.optInt("MaxSize");
                            b.g.d = jSONObject.optInt("networkFilter");
                            JSONArray jSONArray = jSONObject.optJSONArray("Elements");
                            if (jSONArray != null) {
                                for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                                    iterator = jSONArray.getJSONObject(i2);
                                    if (iterator == null) continue;
                                    b.a((JSONObject)iterator);
                                }
                            }
                            if ((jSONObject2 = jSONObject.optJSONObject("UserDefines")) == null) return g;
                            {
                                iterator = jSONObject2.keys();
                                while (iterator.hasNext()) {
                                    String string2 = (String)iterator.next();
                                    b.g.f.put(string2, jSONObject2.optString(string2));
                                }
                            }
                        }
                    }
                    catch (Throwable var2_3) {
                        // empty catch block
                    }
                }
                // ** MonitorExit[var1_1] (shouldn't be in output)
                return g;
            }
        }

        private static void a(JSONObject jSONObject) {
            try {
                if (jSONObject != null) {
                    a a2 = new a();
                    a2.a(jSONObject);
                    b.g.e.put(a2.a, a2);
                }
            }
            catch (Throwable var1_2) {
                // empty catch block
            }
        }
    }

}

