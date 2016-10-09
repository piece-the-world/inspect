/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.util.Pair
 */
package com.growingio.android.sdk.utils;

import android.util.Log;
import android.util.Pair;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.n;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocketFactory;

public class c {
    private String b;
    private String c;
    private Map d;
    private byte[] e;
    private long f;
    private long g;
    private Map h;
    public static SSLSocketFactory a;

    public Map a() {
        return this.h;
    }

    private c(String string, String string2, Map map, byte[] arrby, long l2) {
        this.b = string;
        this.c = string2;
        this.d = map;
        this.e = arrby;
        this.f = l2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Pair b() {
        Pair pair = new Pair((Object)0, (Object)new byte[0]);
        OutputStream outputStream = null;
        InputStream inputStream = null;
        HttpURLConnection httpURLConnection = null;
        boolean bl2 = this.c.equals("POST");
        boolean bl3 = false;
        String string = null;
        try {
            URL uRL = new URL(this.b);
            httpURLConnection = (HttpURLConnection)uRL.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(60000);
            if (this.f > 0) {
                httpURLConnection.setIfModifiedSince(this.f);
            }
            if (httpURLConnection instanceof HttpsURLConnection && a != null) {
                ((HttpsURLConnection)httpURLConnection).setSSLSocketFactory(a);
            }
            for (String string2 : this.d.keySet()) {
                httpURLConnection.setRequestProperty(string2, (String)this.d.get(string2));
            }
            if (!this.c.equals("GET")) {
                httpURLConnection.setRequestMethod(this.c);
                httpURLConnection.setDoOutput(true);
                outputStream = httpURLConnection.getOutputStream();
                if (this.e != null) {
                    outputStream.write(this.e);
                }
                outputStream.flush();
                outputStream.close();
                outputStream = null;
            } else {
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            }
            int n2 = httpURLConnection.getResponseCode();
            boolean bl4 = n2 >= 400;
            this.g = httpURLConnection.getLastModified();
            this.h = httpURLConnection.getHeaderFields();
            InputStream inputStream2 = inputStream = bl4 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            if ("gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"))) {
                inputStream = new GZIPInputStream(httpURLConnection.getInputStream());
            }
            pair = new Pair((Object)n2, (Object)c.a(inputStream));
            inputStream.close();
            boolean bl5 = bl3 = (Integer)pair.first == 200;
        }
        catch (UnknownHostException var8_11) {
            string = "uh";
        }
        catch (SocketTimeoutException var8_14) {
            string = "timeout";
        }
        catch (SSLException var8_17) {
            string = "ssl";
        }
        catch (IOException var8_20) {
            string = "io";
        }
        catch (ArrayIndexOutOfBoundsException var8_23) {
            string = "aioob";
            LogUtil.e("GrowingIO.HttpService", "performRequest: bad response");
        }
        catch (Exception var8_26) {
            string = "other";
            LogUtil.e("GrowingIO.HttpService", "performRequest: unknown exception");
            var8_26.printStackTrace();
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                }
                catch (IOException var8_12) {}
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException var8_13) {}
            }
        }
        if (GConfig.DEBUG) {
            Log.w((String)"GrowingIO.HttpService", (String)("performRequest: code " + pair.first + " url:" + this.b + " response:" + new String((byte[])pair.second)));
        }
        if (bl2 && !bl3) {
            if (string == null) {
                string = String.valueOf(pair.first);
            }
            n.a(string);
        }
        return pair;
    }

    private static byte[] a(InputStream inputStream) {
        int n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] arrby = new byte[8192];
        while ((n2 = inputStream.read(arrby, 0, arrby.length)) != -1) {
            byteArrayOutputStream.write(arrby, 0, n2);
        }
        byteArrayOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public long c() {
        return this.g;
    }

    /* synthetic */ c(String string, String string2, Map map, byte[] arrby, long l2, d d2) {
        this(string, string2, map, arrby, l2);
    }
}

