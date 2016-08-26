/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.Y;
import com.growingio.b.aa;
import com.growingio.b.ae;
import com.growingio.b.e;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.net.URL;

final class Z
implements e {
    Y[] a;

    Z(String string) throws ae {
        File[] arrfile = new File(string).listFiles(new aa(this));
        if (arrfile != null) {
            this.a = new Y[arrfile.length];
            for (int i2 = 0; i2 < arrfile.length; ++i2) {
                this.a[i2] = new Y(arrfile[i2].getPath());
            }
        }
    }

    @Override
    public InputStream a(String string) throws ae {
        if (this.a != null) {
            for (int i2 = 0; i2 < this.a.length; ++i2) {
                InputStream inputStream = this.a[i2].a(string);
                if (inputStream == null) continue;
                return inputStream;
            }
        }
        return null;
    }

    @Override
    public URL b(String string) {
        if (this.a != null) {
            for (int i2 = 0; i2 < this.a.length; ++i2) {
                URL uRL = this.a[i2].b(string);
                if (uRL == null) continue;
                return uRL;
            }
        }
        return null;
    }

    @Override
    public void a() {
        if (this.a != null) {
            for (int i2 = 0; i2 < this.a.length; ++i2) {
                this.a[i2].a();
            }
        }
    }
}

