/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.preference.PreferenceManager
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.tendcloud.tenddata.cd;
import com.tendcloud.tenddata.cj;
import com.tendcloud.tenddata.cs;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class cc {
    private static final int d = 600;
    private static final int e = 60000;
    private static final int f = 60000;
    public static int a = 60000;
    public static int b = 60000;
    public static volatile HashMap c = new HashMap();
    private static Context g = null;
    private static volatile HashMap h = new HashMap();

    public static d a(Context context, String string, String string2, String string3, String string4, byte[] arrby) {
        g = context;
        cc.b(string, string2);
        return cc.a(string, string2, string3, string4, arrby);
    }

    public static String a(String string, boolean bl2) {
        return cc.b(string, null, bl2);
    }

    public static String a(String string, String string2, boolean bl2) {
        return cc.b(string, string2, bl2);
    }

    public static SSLSocketFactory a(boolean bl2, X509Certificate x509Certificate) {
        try {
            Object object;
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            if (bl2 && x509Certificate != null) {
                object = new c(x509Certificate);
                sSLContext.init(null, new TrustManager[]{object}, null);
            } else {
                sSLContext.init(null, null, null);
            }
            object = sSLContext.getSocketFactory();
            return object;
        }
        catch (Throwable var2_3) {
            return null;
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
    private static String b(String string, String string2, boolean bl2) {
        StringBuffer stringBuffer;
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        block30 : {
            if (cs.b(string)) {
                return null;
            }
            httpURLConnection = null;
            bufferedReader = null;
            stringBuffer = new StringBuffer();
            URL uRL = new URL(string);
            httpURLConnection = (HttpURLConnection)cc.a(uRL, null, false);
            if (string.toLowerCase().startsWith("https") && !cs.b(string2)) {
                HttpsURLConnection httpsURLConnection;
                c.put(Thread.currentThread().getId(), uRL.getHost());
                httpURLConnection = httpsURLConnection = cc.a(httpURLConnection, string2);
            }
            httpURLConnection.setRequestMethod("GET");
            int n2 = httpURLConnection.getResponseCode();
            if (n2 == 200) {
                if (bl2) {
                    stringBuffer.append(new String(cc.a(httpURLConnection.getInputStream()), "utf-8"));
                } else {
                    String string3;
                    bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    while ((string3 = bufferedReader.readLine()) != null) {
                        stringBuffer.append("/n");
                        stringBuffer.append(string3);
                    }
                }
                break block30;
            }
            String string4 = null;
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            }
            catch (Throwable var9_16) {
                // empty catch block
            }
            try {
                if (httpURLConnection == null) return string4;
                httpURLConnection.disconnect();
                return string4;
            }
            catch (Throwable var9_17) {
                // empty catch block
            }
            return string4;
        }
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
        catch (Throwable var6_7) {
            // empty catch block
        }
        try {
            if (httpURLConnection == null) return stringBuffer.toString();
            httpURLConnection.disconnect();
            return stringBuffer.toString();
        }
        catch (Throwable var6_8) {
            return stringBuffer.toString();
        }
        catch (Throwable throwable) {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            }
            catch (Throwable var6_10) {
                // empty catch block
            }
            try {
                if (httpURLConnection == null) return stringBuffer.toString();
                httpURLConnection.disconnect();
                return stringBuffer.toString();
            }
            catch (Throwable var6_11) {
                return stringBuffer.toString();
            }
            catch (Throwable throwable2) {
                try {
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                }
                catch (Throwable var11_19) {
                    // empty catch block
                }
                try {
                    if (httpURLConnection == null) throw throwable2;
                    httpURLConnection.disconnect();
                    throw throwable2;
                }
                catch (Throwable var11_20) {
                    // empty catch block
                }
                throw throwable2;
            }
        }
    }

    private static byte[] a(InputStream inputStream) {
        byte[] arrby = null;
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
            byte[] arrby2 = new byte[1024];
            int n2 = -1;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while ((n2 = gZIPInputStream.read(arrby2, 0, arrby2.length)) != -1) {
                byteArrayOutputStream.write(arrby2, 0, n2);
            }
            arrby = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            gZIPInputStream.close();
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
        return arrby;
    }

    public static String a(String string, File file) {
        return cc.b(string, null, file);
    }

    public static String a(String string, String string2, File file) {
        return cc.b(string, string2, file);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static String b(String string, String string2, File file) {
        Object object;
        block17 : {
            MessageDigest messageDigest;
            Object object2;
            object = null;
            URL uRL = new URL(string);
            object = (HttpURLConnection)cc.a(uRL, null, false);
            if (string.toLowerCase().startsWith("https") && !cs.b(string2)) {
                c.put(Thread.currentThread().getId(), uRL.getHost());
                object = object2 = cc.a((URLConnection)object, string2);
            }
            if (object.getResponseCode() != 200) break block17;
            object2 = object.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            messageDigest = MessageDigest.getInstance("MD5");
            try {
                int n2;
                byte[] arrby = new byte[4096];
                while ((n2 = object2.read(arrby)) != -1) {
                    fileOutputStream.write(arrby, 0, n2);
                    messageDigest.update(arrby, 0, n2);
                }
            }
            finally {
                fileOutputStream.close();
                object2.close();
            }
            String string3 = cs.a(messageDigest.digest());
            try {
                if (object == null) return string3;
                object.disconnect();
                return string3;
            }
            catch (Throwable var9_12) {
                // empty catch block
            }
            return string3;
        }
        try {
            if (object == null) return null;
            object.disconnect();
            return null;
        }
        catch (Throwable var4_5) {
            return null;
        }
        catch (Throwable throwable) {
            try {
                if (object == null) return null;
                object.disconnect();
                return null;
            }
            catch (Throwable var4_7) {
                return null;
            }
            catch (Throwable throwable2) {
                try {
                    if (object == null) throw throwable2;
                    object.disconnect();
                    throw throwable2;
                }
                catch (Throwable var12_17) {
                    // empty catch block
                }
                throw throwable2;
            }
        }
    }

    private static URL a(String string, String string2) {
        URL uRL = new URL(string);
        if (cj.a()) {
            return uRL;
        }
        return new URL(uRL.getProtocol(), string2, uRL.getPort(), uRL.getFile());
    }

    private static void a(String string) {
        String string2 = cc.a(string, 1);
        if (string2 != null && !string2.equalsIgnoreCase(cc.a(string, 3)) && g != null) {
            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)g);
            sharedPreferences.edit().putString(cs.d(string), cc.a(string, 1)).apply();
            cc.a(string, cc.a(string, 1), 3);
        }
    }

    private static d a(String string, String string2, String string3, String string4, byte[] arrby) {
        d d2 = new d(600);
        try {
            if (cc.a(string, 2) != null) {
                d2 = cc.a(cc.a(string, 2), string3, string4, arrby, string);
                if (d2.a == 600) {
                    cc.a(string, null, 2);
                }
            } else {
                if (cc.a(string, 1) != null) {
                    d2 = cc.a(cc.a(string, 1), string3, string4, arrby, string);
                    if (d2.a != 600) {
                        cc.a(string, cc.a(string, 1), 2);
                        cc.a(string);
                    }
                }
                if (d2.a == 600 && cc.a(string, 3) != null) {
                    d2 = cc.a(cc.a(string, 3), string3, string4, arrby, string);
                    if (d2.a != 600) {
                        cc.a(string, cc.a(string, 3), 2);
                    }
                }
                if (d2.a == 600 && cc.a(string, 4) != null) {
                    d2 = cc.a(cc.a(string, 4), string3, string4, arrby, string);
                    if (d2.a != 600) {
                        cc.a(string, cc.a(string, 4), 2);
                    }
                }
            }
            return d2;
        }
        catch (Throwable var6_6) {
            return d2;
        }
    }

    private static d a(String string, String string2, String string3, byte[] arrby, String string4) {
        try {
            if (string2.startsWith("https://")) {
                c.put(Thread.currentThread().getId(), string4);
            }
            URLConnection uRLConnection = null;
            uRLConnection = string2.toLowerCase().startsWith("https") && string3.trim().isEmpty() ? cc.a(new URL(string2), string4, true) : cc.a(cc.a(string2, string), string4, true);
            if (uRLConnection == null) {
                return new d(600, "");
            }
            if (string2.toLowerCase().startsWith("https") && !string3.trim().isEmpty()) {
                uRLConnection = cc.a(uRLConnection, string3);
            }
            return cc.a(arrby, uRLConnection);
        }
        catch (Throwable var5_6) {
            return new d(600, "");
        }
    }

    private static URLConnection a(URL uRL, String string, boolean bl2) {
        URLConnection uRLConnection;
        try {
            uRLConnection = uRL.openConnection();
            uRLConnection.setRequestProperty("Accept-Encoding", "");
            uRLConnection.setRequestProperty("User-Agent", "");
            if (string != null) {
                uRLConnection.setRequestProperty("Host", string);
                uRLConnection.setRequestProperty("Content-Type", "");
                if (!cs.b(string) && string.equals("eauth.xdrig.com")) {
                    uRLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                }
            } else {
                String string2 = uRL.getHost();
                if (cs.b(string2) || string2.equals("jic.talkingdata.com")) {
                    // empty if block
                }
            }
            uRLConnection.setDoInput(true);
            if (bl2) {
                uRLConnection.setDoOutput(true);
            }
            uRLConnection.setConnectTimeout(a);
            uRLConnection.setReadTimeout(b);
        }
        catch (Throwable var4_5) {
            return null;
        }
        return uRLConnection;
    }

    private static HttpsURLConnection a(URLConnection uRLConnection, String string) {
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection)uRLConnection;
            SSLContext sSLContext = null;
            sSLContext = cs.a(16) ? SSLContext.getInstance("TLSv1.2") : SSLContext.getInstance("TLSv1");
            c c2 = new c(cc.b(string));
            sSLContext.init(null, new TrustManager[]{c2}, null);
            cd cd2 = new cd();
            httpsURLConnection.setHostnameVerifier(cd2);
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            return httpsURLConnection;
        }
        catch (Throwable var2_3) {
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static d a(byte[] arrby, URLConnection uRLConnection) {
        StringBuffer stringBuffer;
        int n2;
        if (arrby == null || arrby.length == 0 || uRLConnection == null) {
            return new d(600, "");
        }
        OutputStream outputStream = null;
        BufferedReader bufferedReader = null;
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRLConnection;
        stringBuffer = new StringBuffer();
        n2 = 600;
        try {
            String string;
            httpURLConnection.setRequestMethod("POST");
            outputStream = httpURLConnection.getOutputStream();
            outputStream.write(arrby);
            outputStream.close();
            n2 = httpURLConnection.getResponseCode();
            InputStream inputStream = n2 > 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while ((string = bufferedReader.readLine()) != null) {
                stringBuffer.append(string);
                stringBuffer.append('\n');
            }
        }
        catch (Throwable var7_11) {}
        finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            }
            catch (Throwable var7_8) {
                // empty catch block
            }
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            }
            catch (Throwable var7_9) {
                // empty catch block
            }
            try {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
            catch (Throwable var7_10) {
                // empty catch block
            }
            a = 60000;
            b = 60000;
        }
        return new d(n2, stringBuffer.toString());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static X509Certificate b(String string) {
        if (string == null) return null;
        if (string.trim().isEmpty()) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(string.getBytes());
        X509Certificate x509Certificate = null;
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        x509Certificate = (X509Certificate)certificateFactory.generateCertificate(byteArrayInputStream);
        try {
            if (byteArrayInputStream == null) return x509Certificate;
            byteArrayInputStream.close();
            return x509Certificate;
        }
        catch (Throwable var3_4) {
            return x509Certificate;
        }
        catch (Exception exception) {
            try {
                if (byteArrayInputStream == null) return x509Certificate;
                byteArrayInputStream.close();
                return x509Certificate;
            }
            catch (Throwable var3_6) {
                return x509Certificate;
            }
            catch (Throwable throwable) {
                try {
                    if (byteArrayInputStream == null) throw throwable;
                    byteArrayInputStream.close();
                    throw throwable;
                }
                catch (Throwable var5_8) {
                    // empty catch block
                }
                throw throwable;
            }
        }
    }

    private static synchronized void a(String string, String string2, int n2) {
        if (cs.b(string) || !h.containsKey(string)) {
            return;
        }
        a a2 = (a)h.get(string);
        switch (n2) {
            case 1: {
                a2.b = string2;
                break;
            }
            case 2: {
                a2.d = string2;
                break;
            }
            case 3: {
                a2.c = string2;
                break;
            }
            case 4: {
                a2.a = string2;
                break;
            }
        }
    }

    private static synchronized void b(String string, String string2) {
        if (cs.b(string) || h.containsKey(string)) {
            return;
        }
        a a2 = new a();
        a2.e = string;
        a2.a = string2;
        a2.c = PreferenceManager.getDefaultSharedPreferences((Context)g).getString(cs.d(string), null);
        try {
            InetAddress inetAddress = InetAddress.getByName(string);
            a2.b = inetAddress.getHostAddress();
        }
        catch (Throwable var3_4) {
            // empty catch block
        }
        h.put(string, a2);
    }

    private static synchronized String a(String string, int n2) {
        if (cs.b(string) || !h.containsKey(string)) {
            return null;
        }
        a a2 = (a)h.get(string);
        if (a2 == null) {
            return null;
        }
        switch (n2) {
            case 1: {
                return a2.b;
            }
            case 2: {
                return a2.d;
            }
            case 3: {
                return a2.c;
            }
            case 4: {
                return a2.a;
            }
        }
        return null;
    }

    private static void a(HttpsURLConnection httpsURLConnection) {
        if (httpsURLConnection != null) {
            try {
                Certificate[] arrcertificate;
                System.out.println("Response url: " + httpsURLConnection.getURL());
                System.out.println("Response Code : " + httpsURLConnection.getResponseCode());
                System.out.println("Cipher Suite : " + httpsURLConnection.getCipherSuite());
                System.out.println("\n");
                for (Certificate certificate : arrcertificate = httpsURLConnection.getServerCertificates()) {
                    System.out.println("Cert Type : " + certificate.getType());
                    System.out.println("Cert Hash Code : " + certificate.hashCode());
                    System.out.println("Cert Public Key Algorithm : " + certificate.getPublicKey().getAlgorithm());
                    System.out.println("Cert Public Key Format : " + certificate.getPublicKey().getFormat());
                    System.out.println("\n");
                }
            }
            catch (Throwable var1_2) {
                // empty catch block
            }
        }
    }

    static class b {
        static final int a = 1;
        static final int b = 2;
        static final int c = 3;
        static final int d = 4;

        b() {
        }
    }

    static class a {
        String a = null;
        String b = null;
        String c = null;
        String d = null;
        String e = null;

        a() {
        }
    }

    static class c
    implements X509TrustManager {
        X509Certificate a;

        c(X509Certificate x509Certificate) {
            this.a = x509Certificate;
        }

        @Override
        public void checkClientTrusted(X509Certificate[] arrx509Certificate, String string) {
        }

        @Override
        public void checkServerTrusted(X509Certificate[] arrx509Certificate, String string) {
            block8 : {
                if (arrx509Certificate.length == 0) {
                    throw new CertificateException("No server certificate found!");
                }
                if (!arrx509Certificate[0].getIssuerDN().equals(this.a.getSubjectDN())) {
                    throw new CertificateException("Parent certificate of server was different than expected signing certificate");
                }
                try {
                    int n2;
                    String string2 = arrx509Certificate[0].getSubjectDN().getName();
                    int n3 = string2.indexOf("CN=");
                    if (n3 >= 0 && (n2 = (string2 = string2.substring(n3 + 3)).indexOf(",")) >= 0) {
                        string2 = string2.substring(0, n2);
                    }
                    String[] arrstring = string2.split("\\.");
                    String string3 = string2;
                    if (arrstring.length >= 2) {
                        string3 = arrstring[arrstring.length - 2] + "." + arrstring[arrstring.length - 1];
                    }
                    if (!cc.c.containsKey(Thread.currentThread().getId())) {
                        throw new CertificateException("No valid host provided!");
                    }
                    if (!((String)cc.c.get(Thread.currentThread().getId())).endsWith(string3)) {
                        throw new CertificateException("Server certificate has incorrect host name!");
                    }
                    arrx509Certificate[0].verify(this.a.getPublicKey());
                    arrx509Certificate[0].checkValidity();
                }
                catch (Throwable var3_4) {
                    if (!(var3_4 instanceof CertificateException)) break block8;
                    throw new CertificateException(var3_4);
                }
            }
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }

    public static class d {
        public int a;
        public String b;

        d(int n2, String string) {
            this.a = n2;
            this.b = string;
        }

        d(int n2) {
            this(n2, "");
        }

        public int a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

}

