/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.T;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

final class ac
implements T {
    private ZipOutputStream a;

    ac(ZipOutputStream zipOutputStream) {
        this.a = zipOutputStream;
    }

    @Override
    public OutputStream a(String string) throws IOException {
        ZipEntry zipEntry = new ZipEntry(string);
        this.a.putNextEntry(zipEntry);
        return this.a;
    }

    @Override
    public void a() throws IOException {
        this.a.flush();
        this.a.closeEntry();
    }
}

