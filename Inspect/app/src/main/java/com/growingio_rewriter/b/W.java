/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

final class W
implements e {
    String a;

    W(String string) {
        this.a = string;
    }

    @Override
    public InputStream a(String string) {
        try {
            char c2 = File.separatorChar;
            String string2 = this.a + c2 + string.replace('.', c2) + ".class";
            return new FileInputStream(string2.toString());
        }
        catch (FileNotFoundException var2_3) {
        }
        catch (SecurityException var2_4) {
            // empty catch block
        }
        return null;
    }

    @Override
    public URL b(String string) {
        char c2 = File.separatorChar;
        String string2 = this.a + c2 + string.replace('.', c2) + ".class";
        File file = new File(string2);
        if (file.exists()) {
            try {
                return file.getCanonicalFile().toURI().toURL();
            }
            catch (MalformedURLException var5_5) {
            }
            catch (IOException var5_6) {
                // empty catch block
            }
        }
        return null;
    }

    @Override
    public void a() {
    }

    public String toString() {
        return this.a;
    }
}

