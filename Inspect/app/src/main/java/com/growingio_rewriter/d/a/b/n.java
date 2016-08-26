/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.b;

import com.growingio.d.a.u;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class n {
    public final Properties a = new Properties();
    public final Set<Object> b;

    public n(String string) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = new BufferedInputStream(new FileInputStream(string));
            this.a.load(inputStream);
            this.b = new HashSet(this.a.keySet());
        }
        finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public String a(String string) {
        String string2 = (String)this.a.get(string);
        if (string2 == null) {
            int n2;
            int n3 = string.indexOf(46);
            string2 = n3 == -1 ? string : ((n2 = string.indexOf(40)) == -1 ? string.substring(n3 + 1) : string.substring(n3 + 1, n2));
        } else {
            this.b.remove(string);
        }
        return string2;
    }

    public String b(String string) {
        if (string.startsWith("(")) {
            u[] arru = u.d(string);
            u u2 = u.e(string);
            for (int i2 = 0; i2 < arru.length; ++i2) {
                arru[i2] = this.a(arru[i2]);
            }
            u2 = this.a(u2);
            return u.b(u2, arru);
        }
        return this.a(u.a(string)).i();
    }

    private u a(u u2) {
        if (u2.a() == 10) {
            return u.b(this.a(u2.e()));
        }
        if (u2.a() == 9) {
            String string = this.a(u2.c()).i();
            for (int i2 = 0; i2 < u2.b(); ++i2) {
                string = "" + '[' + string;
            }
            return u.a(string);
        }
        return u2;
    }
}

