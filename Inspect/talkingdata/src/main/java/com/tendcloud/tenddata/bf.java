/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.apptalkingdata.push.service.HttpCallback;
import com.tendcloud.tenddata.bh;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class bf {
    private final String d = bf.class.getName();
    String a;
    List b;
    HttpCallback c;
    private BufferedReader e;
    private PrintWriter f;
    private HttpURLConnection g;
    private StringBuffer h = new StringBuffer();

    public bf(String string, List list, HttpCallback httpCallback) {
        this.a = string;
        this.b = list;
        this.c = httpCallback;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public a a() {
        a a2;
        a2 = new a();
        try {
            URL uRL = new URL(this.a);
            this.g = (HttpURLConnection)uRL.openConnection();
            this.g.setConnectTimeout(10000);
            this.g.setReadTimeout(30000);
            this.g.setRequestMethod("POST");
            this.g.setUseCaches(false);
            this.g.setDoOutput(true);
            this.g.setDoInput(true);
            if (this.b != null) {
                StringBuffer stringBuffer = new StringBuffer();
                for (Object object : this.b) {
                    stringBuffer.append(object.a() + "=" + object.b() + "&");
                }
                if (stringBuffer.length() > 0) {
                    stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                }
                this.f = new PrintWriter(this.g.getOutputStream());
                this.f.write(stringBuffer.toString());
                this.f.flush();
            }
            int n2 = this.g.getResponseCode();
            String string = this.g.getResponseMessage();
            a2.a = n2;
            a2.b = string;
            if (n2 != 200) {
                bh.b(this.d, "code:" + n2 + "  msg: " + (String)string);
                this.c.requestError(n2, new Exception());
            } else {
                Object object;
                this.e = new BufferedReader(new InputStreamReader(this.g.getInputStream()));
                while ((object = this.e.readLine()) != null) {
                    this.h.append((String)object);
                }
                a2.b = this.h.toString();
                if (this.c != null) {
                    this.c.requestSuccess(a2.b);
                }
            }
        }
        catch (Exception var2_4) {
            bh.a(this.d, "http connnection error:  " + var2_4);
            a2.b = var2_4.getMessage();
        }
        finally {
            this.g.disconnect();
            try {
                if (this.f != null) {
                    this.f.close();
                }
                if (this.e != null) {
                    this.e.close();
                }
            }
            catch (IOException var2_5) {
                var2_5.printStackTrace();
            }
        }
        return a2;
    }

    public static class a {
        public int a;
        public String b;
    }

}

