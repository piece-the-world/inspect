/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import com.growingio.e.a.a.a.a;
import com.growingio.e.a.a.a.c.E;
import com.growingio.e.a.a.a.c.b;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D
extends Reader {
    private static final int b = 4096;
    private static final String c = "UTF-8";
    private static final String d = "US-ASCII";
    private static final String e = "UTF-16BE";
    private static final String f = "UTF-16LE";
    private static final String g = "UTF-32BE";
    private static final String h = "UTF-32LE";
    private static final String i = "UTF-16";
    private static final String j = "UTF-32";
    private static final String k = "CP1047";
    private static final a[] l = new a[]{a.a, a.b, a.c, a.d, a.e};
    private static final a[] m = new a[]{new a("UTF-8", 60, 63, 120, 109), new a("UTF-16BE", 0, 60, 0, 63), new a("UTF-16LE", 60, 0, 63, 0), new a("UTF-32BE", 0, 0, 0, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109), new a("UTF-32LE", 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109, 0, 0, 0), new a("CP1047", 76, 111, 167, 148)};
    private final Reader n;
    private final String o;
    private final String p;
    private static final Pattern q = Pattern.compile("charset=[\"']?([.[^; \"']]*)[\"']?");
    public static final Pattern a = Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", 8);
    private static final String r = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";
    private static final String s = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM";
    private static final String t = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL";
    private static final String u = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch";
    private static final String v = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME";

    public String a() {
        return this.p;
    }

    public D(File file) throws IOException {
        this(new FileInputStream(file));
    }

    public D(InputStream inputStream) throws IOException {
        this(inputStream, true);
    }

    public D(InputStream inputStream, boolean bl2) throws IOException {
        this(inputStream, bl2, null);
    }

    public D(InputStream inputStream, boolean bl2, String string) throws IOException {
        this.p = string;
        b b2 = new b((InputStream)new BufferedInputStream(inputStream, 4096), false, l);
        b b3 = new b((InputStream)b2, true, m);
        this.o = this.a(b2, b3, bl2);
        this.n = new InputStreamReader((InputStream)b3, this.o);
    }

    public D(URL uRL) throws IOException {
        this(uRL.openConnection(), null);
    }

    public D(URLConnection uRLConnection, String string) throws IOException {
        this.p = string;
        boolean bl2 = true;
        String string2 = uRLConnection.getContentType();
        InputStream inputStream = uRLConnection.getInputStream();
        b b2 = new b((InputStream)new BufferedInputStream(inputStream, 4096), false, l);
        b b3 = new b((InputStream)b2, true, m);
        this.o = uRLConnection instanceof HttpURLConnection || string2 != null ? this.a(b2, b3, string2, true) : this.a(b2, b3, true);
        this.n = new InputStreamReader((InputStream)b3, this.o);
    }

    public D(InputStream inputStream, String string) throws IOException {
        this(inputStream, string, true);
    }

    public D(InputStream inputStream, String string, boolean bl2, String string2) throws IOException {
        this.p = string2;
        b b2 = new b((InputStream)new BufferedInputStream(inputStream, 4096), false, l);
        b b3 = new b((InputStream)b2, true, m);
        this.o = this.a(b2, b3, string, bl2);
        this.n = new InputStreamReader((InputStream)b3, this.o);
    }

    public D(InputStream inputStream, String string, boolean bl2) throws IOException {
        this(inputStream, string, bl2, null);
    }

    public String b() {
        return this.o;
    }

    @Override
    public int read(char[] arrc, int n2, int n3) throws IOException {
        return this.n.read(arrc, n2, n3);
    }

    @Override
    public void close() throws IOException {
        this.n.close();
    }

    private String a(b b2, b b3, boolean bl2) throws IOException {
        String string = b2.c();
        String string2 = b3.c();
        String string3 = D.a(b3, string2);
        try {
            return this.a(string, string2, string3);
        }
        catch (E var7_7) {
            if (bl2) {
                return this.a(null, var7_7);
            }
            throw var7_7;
        }
    }

    private String a(b b2, b b3, String string, boolean bl2) throws IOException {
        String string2 = b2.c();
        String string3 = b3.c();
        String string4 = D.a(b3, string3);
        try {
            return this.a(string, string2, string3, string4, bl2);
        }
        catch (E var8_8) {
            if (bl2) {
                return this.a(string, var8_8);
            }
            throw var8_8;
        }
    }

    private String a(String string, E e2) throws IOException {
        String string2;
        if (string != null && string.startsWith("text/html")) {
            string = string.substring("text/html".length());
            string = "text/xml" + string;
            try {
                return this.a(string, e2.a(), e2.b(), e2.c(), true);
            }
            catch (E var3_3) {
                e2 = var3_3;
            }
        }
        if ((string2 = e2.c()) == null) {
            string2 = e2.e();
        }
        if (string2 == null) {
            string2 = this.p == null ? "UTF-8" : this.p;
        }
        return string2;
    }

    String a(String string, String string2, String string3) throws IOException {
        if (string == null) {
            if (string2 == null || string3 == null) {
                return this.p == null ? "UTF-8" : this.p;
            }
            if (string3.equals("UTF-16") && (string2.equals("UTF-16BE") || string2.equals("UTF-16LE"))) {
                return string2;
            }
            return string3;
        }
        if (string.equals("UTF-8")) {
            if (string2 != null && !string2.equals("UTF-8")) {
                String string4 = MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", string, string2, string3);
                throw new E(string4, string, string2, string3);
            }
            if (string3 != null && !string3.equals("UTF-8")) {
                String string5 = MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", string, string2, string3);
                throw new E(string5, string, string2, string3);
            }
            return string;
        }
        if (string.equals("UTF-16BE") || string.equals("UTF-16LE")) {
            if (string2 != null && !string2.equals(string)) {
                String string6 = MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", string, string2, string3);
                throw new E(string6, string, string2, string3);
            }
            if (string3 != null && !string3.equals("UTF-16") && !string3.equals(string)) {
                String string7 = MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", string, string2, string3);
                throw new E(string7, string, string2, string3);
            }
            return string;
        }
        if (string.equals("UTF-32BE") || string.equals("UTF-32LE")) {
            if (string2 != null && !string2.equals(string)) {
                String string8 = MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", string, string2, string3);
                throw new E(string8, string, string2, string3);
            }
            if (string3 != null && !string3.equals("UTF-32") && !string3.equals(string)) {
                String string9 = MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", string, string2, string3);
                throw new E(string9, string, string2, string3);
            }
            return string;
        }
        String string10 = MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM", string, string2, string3);
        throw new E(string10, string, string2, string3);
    }

    String a(String string, String string2, String string3, String string4, boolean bl2) throws IOException {
        if (bl2 && string4 != null) {
            return string4;
        }
        String string5 = D.a(string);
        String string6 = D.b(string);
        boolean bl3 = D.c(string5);
        boolean bl4 = D.d(string5);
        if (!bl3 && !bl4) {
            String string7 = MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME", string5, string6, string2, string3, string4);
            throw new E(string7, string5, string6, string2, string3, string4);
        }
        if (string6 == null) {
            if (bl3) {
                return this.a(string2, string3, string4);
            }
            return this.p == null ? "US-ASCII" : this.p;
        }
        if (string6.equals("UTF-16BE") || string6.equals("UTF-16LE")) {
            if (string2 != null) {
                String string8 = MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL", string5, string6, string2, string3, string4);
                throw new E(string8, string5, string6, string2, string3, string4);
            }
            return string6;
        }
        if (string6.equals("UTF-16")) {
            if (string2 != null && string2.startsWith("UTF-16")) {
                return string2;
            }
            String string9 = MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch", string5, string6, string2, string3, string4);
            throw new E(string9, string5, string6, string2, string3, string4);
        }
        if (string6.equals("UTF-32BE") || string6.equals("UTF-32LE")) {
            if (string2 != null) {
                String string10 = MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL", string5, string6, string2, string3, string4);
                throw new E(string10, string5, string6, string2, string3, string4);
            }
            return string6;
        }
        if (string6.equals("UTF-32")) {
            if (string2 != null && string2.startsWith("UTF-32")) {
                return string2;
            }
            String string11 = MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch", string5, string6, string2, string3, string4);
            throw new E(string11, string5, string6, string2, string3, string4);
        }
        return string6;
    }

    static String a(String string) {
        String string2 = null;
        if (string != null) {
            int n2 = string.indexOf(";");
            string2 = n2 >= 0 ? string.substring(0, n2) : string;
            string2 = string2.trim();
        }
        return string2;
    }

    static String b(String string) {
        int n2;
        String string2 = null;
        if (string != null && (n2 = string.indexOf(";")) > -1) {
            String string3 = string.substring(n2 + 1);
            Matcher matcher = q.matcher(string3);
            string2 = matcher.find() ? matcher.group(1) : null;
            string2 = string2 != null ? string2.toUpperCase(Locale.US) : null;
        }
        return string2;
    }

    private static String a(InputStream inputStream, String string) throws IOException {
        String string2 = null;
        if (string != null) {
            byte[] arrby = new byte[4096];
            inputStream.mark(4096);
            int n2 = 0;
            int n3 = 4096;
            int n4 = inputStream.read(arrby, n2, n3);
            int n5 = -1;
            String string3 = "";
            while (n4 != -1 && n5 == -1 && n2 < 4096) {
                n4 = inputStream.read(arrby, n2 += n4, n3 -= n4);
                string3 = new String(arrby, 0, n2, string);
                n5 = string3.indexOf(62);
            }
            if (n5 == -1) {
                if (n4 == -1) {
                    throw new IOException("Unexpected end of XML stream");
                }
                throw new IOException("XML prolog or ROOT element not found on first " + n2 + " bytes");
            }
            int n6 = n2;
            if (n6 > 0) {
                inputStream.reset();
                BufferedReader bufferedReader = new BufferedReader(new StringReader(string3.substring(0, n5 + 1)));
                StringBuffer stringBuffer = new StringBuffer();
                String string4 = bufferedReader.readLine();
                while (string4 != null) {
                    stringBuffer.append(string4);
                    string4 = bufferedReader.readLine();
                }
                Matcher matcher = a.matcher(stringBuffer);
                if (matcher.find()) {
                    string2 = matcher.group(1).toUpperCase();
                    string2 = string2.substring(1, string2.length() - 1);
                }
            }
        }
        return string2;
    }

    static boolean c(String string) {
        return string != null && (string.equals("application/xml") || string.equals("application/xml-dtd") || string.equals("application/xml-external-parsed-entity") || string.startsWith("application/") && string.endsWith("+xml"));
    }

    static boolean d(String string) {
        return string != null && (string.equals("text/xml") || string.equals("text/xml-external-parsed-entity") || string.startsWith("text/") && string.endsWith("+xml"));
    }
}

