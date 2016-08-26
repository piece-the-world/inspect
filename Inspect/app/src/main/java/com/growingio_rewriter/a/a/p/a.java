/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.p;

import com.growingio.a.a.e.g;
import com.growingio.a.a.e.i;
import com.growingio.a.a.e.l;

public class a {
    private static final char a = '\u0000';
    private static final char b = '\u001f';
    private static final g c;
    private static final g d;
    private static final g e;

    private a() {
    }

    public static g a() {
        return d;
    }

    public static g b() {
        return e;
    }

    static {
        l l2 = i.b();
        l2.a('\u0000', '\ufffd');
        l2.a("\ufffd");
        for (char c2 = '\u0000'; c2 <= '\u001f'; c2 = (char)((char)(c2 + 1))) {
            if (c2 == 9 || c2 == 10 || c2 == 13) continue;
            l2.a(c2, "\ufffd");
        }
        l2.a('&', "&amp;");
        l2.a('<', "&lt;");
        l2.a('>', "&gt;");
        d = l2.a();
        l2.a('\'', "&apos;");
        l2.a('\"', "&quot;");
        c = l2.a();
        l2.a('\t', "&#x9;");
        l2.a('\n', "&#xA;");
        l2.a('\r', "&#xD;");
        e = l2.a();
    }
}

