/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.l;

import com.growingio.a.a.b.Q;
import com.growingio.a.a.b.aC;
import com.growingio.a.a.b.aG;
import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.e;
import com.growingio.a.a.b.m;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.eM;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.eg;
import com.growingio.a.a.d.eh;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.gN;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jN;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.oP;
import com.growingio.a.a.l.h;
import com.growingio.a.a.l.i;
import com.growingio.a.a.l.j;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

public final class g {
    private static final String aR = "charset";
    private static final eg<String, String> aS = eg.d("charset", e.a(Q.c.name()));
    private static final m aT = m.e().a(m.l().o()).a(m.b(' ')).a(m.b("()<>@,;:\\\"/[]?="));
    private static final m aU = m.e().a(m.b("\"\\\r"));
    private static final m aV = m.a(" \t\r\n");
    private static final String aW = "application";
    private static final String aX = "audio";
    private static final String aY = "image";
    private static final String aZ = "text";
    private static final String ba = "video";
    private static final String bb = "*";
    private static final Map<g, g> bc = ii.c();
    public static final g a = g.c("*", "*");
    public static final g b = g.c("text", "*");
    public static final g c = g.c("image", "*");
    public static final g d = g.c("audio", "*");
    public static final g e = g.c("video", "*");
    public static final g f = g.c("application", "*");
    public static final g g = g.d("text", "cache-manifest");
    public static final g h = g.d("text", "css");
    public static final g i = g.d("text", "csv");
    public static final g j = g.d("text", "html");
    public static final g k = g.d("text", "calendar");
    public static final g l = g.d("text", "plain");
    public static final g m = g.d("text", "javascript");
    public static final g n = g.d("text", "tab-separated-values");
    public static final g o = g.d("text", "vcard");
    public static final g p = g.d("text", "vnd.wap.wml");
    public static final g q = g.d("text", "xml");
    public static final g r = g.c("image", "bmp");
    public static final g s = g.c("image", "x-canon-crw");
    public static final g t = g.c("image", "gif");
    public static final g u = g.c("image", "vnd.microsoft.icon");
    public static final g v = g.c("image", "jpeg");
    public static final g w = g.c("image", "png");
    public static final g x = g.c("image", "vnd.adobe.photoshop");
    public static final g y = g.d("image", "svg+xml");
    public static final g z = g.c("image", "tiff");
    public static final g A = g.c("image", "webp");
    public static final g B = g.c("audio", "mp4");
    public static final g C = g.c("audio", "mpeg");
    public static final g D = g.c("audio", "ogg");
    public static final g E = g.c("audio", "webm");
    public static final g F = g.c("audio", "l24");
    public static final g G = g.c("audio", "basic");
    public static final g H = g.c("audio", "aac");
    public static final g I = g.c("audio", "vorbis");
    public static final g J = g.c("audio", "x-ms-wma");
    public static final g K = g.c("audio", "x-ms-wax");
    public static final g L = g.c("audio", "vnd.rn-realaudio");
    public static final g M = g.c("audio", "vnd.wave");
    public static final g N = g.c("video", "mp4");
    public static final g O = g.c("video", "mpeg");
    public static final g P = g.c("video", "ogg");
    public static final g Q = g.c("video", "quicktime");
    public static final g R = g.c("video", "webm");
    public static final g S = g.c("video", "x-ms-wmv");
    public static final g T = g.c("video", "x-flv");
    public static final g U = g.c("video", "3gpp");
    public static final g V = g.c("video", "3gpp2");
    public static final g W = g.d("application", "xml");
    public static final g X = g.d("application", "atom+xml");
    public static final g Y = g.c("application", "x-bzip2");
    public static final g Z = g.d("application", "dart");
    public static final g aa = g.c("application", "vnd.apple.pkpass");
    public static final g ab = g.c("application", "vnd.ms-fontobject");
    public static final g ac = g.c("application", "epub+zip");
    public static final g ad = g.c("application", "x-www-form-urlencoded");
    public static final g ae = g.c("application", "pkcs12");
    public static final g af = g.c("application", "binary");
    public static final g ag = g.c("application", "x-gzip");
    public static final g ah = g.d("application", "javascript");
    public static final g ai = g.d("application", "json");
    public static final g aj = g.d("application", "manifest+json");
    public static final g ak = g.c("application", "vnd.google-earth.kml+xml");
    public static final g al = g.c("application", "vnd.google-earth.kmz");
    public static final g am = g.c("application", "mbox");
    public static final g an = g.c("application", "x-apple-aspen-config");
    public static final g ao = g.c("application", "vnd.ms-excel");
    public static final g ap = g.c("application", "vnd.ms-powerpoint");
    public static final g aq = g.c("application", "msword");
    public static final g ar = g.c("application", "x-nacl");
    public static final g as = g.c("application", "x-pnacl");
    public static final g at = g.c("application", "octet-stream");
    public static final g au = g.c("application", "ogg");
    public static final g av = g.c("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
    public static final g aw = g.c("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
    public static final g ax = g.c("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    public static final g ay = g.c("application", "vnd.oasis.opendocument.graphics");
    public static final g az = g.c("application", "vnd.oasis.opendocument.presentation");
    public static final g aA = g.c("application", "vnd.oasis.opendocument.spreadsheet");
    public static final g aB = g.c("application", "vnd.oasis.opendocument.text");
    public static final g aC = g.c("application", "pdf");
    public static final g aD = g.c("application", "postscript");
    public static final g aE = g.c("application", "protobuf");
    public static final g aF = g.d("application", "rdf+xml");
    public static final g aG = g.d("application", "rtf");
    public static final g aH = g.c("application", "font-sfnt");
    public static final g aI = g.c("application", "x-shockwave-flash");
    public static final g aJ = g.c("application", "vnd.sketchup.skp");
    public static final g aK = g.d("application", "soap+xml");
    public static final g aL = g.c("application", "x-tar");
    public static final g aM = g.c("application", "font-woff");
    public static final g aN = g.c("application", "font-woff2");
    public static final g aO = g.d("application", "xhtml+xml");
    public static final g aP = g.d("application", "xrd+xml");
    public static final g aQ = g.c("application", "zip");
    private final String bd;
    private final String be;
    private final eg<String, String> bf;
    private String bg;
    private int bh;
    private static final aG bi = aC.a("; ").c("=");

    private static g c(String string, String string2) {
        return g.b(new g(string, string2, eg.<String, String>a()));
    }

    private static g d(String string, String string2) {
        return g.b(new g(string, string2, aS));
    }

    private static g b(g g2) {
        bc.put(g2, g2);
        return g2;
    }

    private g(String string, String string2, eg<String, String> eg2) {
        this.bd = string;
        this.be = string2;
        this.bf = eg2;
    }

    public String a() {
        return this.bd;
    }

    public String b() {
        return this.be;
    }

    public eg<String, String> c() {
        return this.bf;
    }

    private Map<String, eM<String>> h() {
        return ii.a(this.bf.y(), new h(this));
    }

    public aP<Charset> d() {
        fg<String> fg2 = fg.a(this.bf.e("charset"));
        switch (fg2.size()) {
            case 0: {
                return aP.f();
            }
            case 1: {
                return aP.b(Charset.forName(fL.d(fg2)));
            }
        }
        throw new IllegalStateException("Multiple charset values defined: " + fg2);
    }

    public g e() {
        return this.bf.o() ? this : g.b(this.bd, this.be);
    }

    public g a(jr<String, String> jr2) {
        return g.a(this.bd, this.be, jr2);
    }

    public g a(String string, String string2) {
        aU.a(string);
        aU.a(string2);
        String string3 = g.h(string);
        eh<String, String> eh2 = eg.b();
        Object object = this.bf.z().k_();
        while (object.hasNext()) {
            Map.Entry<String, String> entry = object.next();
            String string4 = entry.getKey();
            if (string3.equals(string4)) continue;
            eh2.a(string4, entry.getValue());
        }
        eh2.a(string3, g.e(string3, string2));
        object = new g(this.bd, this.be, eh2.a());
        return (g)aH.a(bc.get(object), object);
    }

    public g a(Charset charset) {
        aU.a(charset);
        return this.a("charset", charset.name());
    }

    public boolean f() {
        return "*".equals(this.bd) || "*".equals(this.be);
    }

    public boolean a(g g2) {
        return !(!g2.bd.equals("*") && !g2.bd.equals(this.bd) || !g2.be.equals("*") && !g2.be.equals(this.be) || !this.bf.z().containsAll(g2.bf.z()));
    }

    public static g b(String string, String string2) {
        return g.a(string, string2, eg.<String, String>a());
    }

    static g a(String string) {
        return g.b("application", string);
    }

    static g b(String string) {
        return g.b("audio", string);
    }

    static g c(String string) {
        return g.b("image", string);
    }

    static g d(String string) {
        return g.b("text", string);
    }

    static g e(String string) {
        return g.b("video", string);
    }

    private static g a(String string, String string2, jr<String, String> jr2) {
        aU.a(string);
        aU.a(string2);
        aU.a(jr2);
        String string3 = g.h(string);
        String string4 = g.h(string2);
        aU.a(!"*".equals(string3) || "*".equals(string4), (Object)"A wildcard type cannot be used with a non-wildcard subtype");
        eh<String, String> eh2 = eg.b();
        for (Map.Entry<String, String> entry : jr2.l()) {
            String string5 = g.h(entry.getKey());
            eh2.a(string5, g.e(string5, entry.getValue()));
        }
        g g2 = new g(string3, string4, eh2.a());
        return (g)aH.a(bc.get(g2), g2);
    }

    private static String h(String string) {
        aU.a(aT.d(string));
        return e.a(string);
    }

    private static String e(String string, String string2) {
        return "charset".equals(string) ? e.a(string2) : string2;
    }

    public static g f(String string) {
        aU.a(string);
        j j2 = new j(string);
        try {
            String string2 = j2.b(aT);
            j2.a('/');
            String string3 = j2.b(aT);
            eh<String, String> eh2 = eg.b();
            while (j2.b()) {
                String string4;
                j2.a(';');
                j2.a(aV);
                String string5 = j2.b(aT);
                j2.a('=');
                if ('\"' == j2.a()) {
                    j2.a('\"');
                    StringBuilder stringBuilder = new StringBuilder();
                    while ('\"' != j2.a()) {
                        if ('\\' == j2.a()) {
                            j2.a('\\');
                            stringBuilder.append(j2.c(m.e()));
                            continue;
                        }
                        stringBuilder.append(j2.b(aU));
                    }
                    string4 = stringBuilder.toString();
                    j2.a('\"');
                } else {
                    string4 = j2.b(aT);
                }
                eh2.a(string5, string4);
            }
            return g.a(string2, string3, eh2.a());
        }
        catch (IllegalStateException var2_3) {
            throw new IllegalArgumentException("Could not parse '" + string + "'", var2_3);
        }
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof g) {
            g g2 = (g)object;
            return this.bd.equals(g2.bd) && this.be.equals(g2.be) && this.h().equals(g2.h());
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.bh;
        if (n2 == 0) {
            this.bh = n2 = aL.a(this.bd, this.be, this.h());
        }
        return n2;
    }

    public String toString() {
        String string = this.bg;
        if (string == null) {
            this.bg = string = this.i();
        }
        return string;
    }

    private String i() {
        StringBuilder stringBuilder = new StringBuilder().append(this.bd).append('/').append(this.be);
        if (!this.bf.o()) {
            stringBuilder.append("; ");
            gN gN2 = jN.a(this.bf, new i(this));
            bi.a(stringBuilder, gN2.l());
        }
        return stringBuilder.toString();
    }

    private static String i(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length() + 16).append('\"');
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '\r' || c2 == '\\' || c2 == '\"') {
                stringBuilder.append('\\');
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.append('\"').toString();
    }

    static /* synthetic */ m g() {
        return aT;
    }

    static /* synthetic */ String g(String string) {
        return g.i(string);
    }
}

