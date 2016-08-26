/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.e;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class a
implements e {
    protected String a;
    protected byte[] b;

    public a(String string, byte[] arrby) {
        this.a = string;
        this.b = arrby;
    }

    @Override
    public void a() {
    }

    public String toString() {
        return "byte[]:" + this.a;
    }

    @Override
    public InputStream a(String string) {
        if (this.a.equals(string)) {
            return new ByteArrayInputStream(this.b);
        }
        return null;
    }

    @Override
    public URL b(String string) {
        if (this.a.equals(string)) {
            String string2 = string.replace('.', '/') + ".class";
            try {
                return new URL("file:/ByteArrayClassPath/" + string2);
            }
            catch (MalformedURLException var3_3) {
                // empty catch block
            }
        }
        return null;
    }
}

