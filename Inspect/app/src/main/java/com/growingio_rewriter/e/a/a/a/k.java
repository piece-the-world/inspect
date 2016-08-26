/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

import com.growingio.e.a.a.a.l;
import java.io.File;
import java.io.IOException;

public class k {
    public static final k a = new k("Normal");
    public static final k b = new l();
    private final String c;

    protected k(String string) {
        this.c = string;
    }

    public boolean a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        try {
            return this.c(file);
        }
        catch (IOException var2_2) {
            return false;
        }
    }

    public void b(File file) throws IOException {
        if (file.exists() && !this.c(file)) {
            throw new IOException("Deletion failed: " + file);
        }
    }

    protected boolean c(File file) throws IOException {
        return file.delete();
    }

    public String toString() {
        return "FileDeleteStrategy[" + this.c + "]";
    }
}

