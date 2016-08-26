/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.a;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.Serializable;

public class g
extends a
implements Serializable {
    private static final long a = -8723373124984771318L;
    private final FilenameFilter b;
    private final FileFilter c;

    public g(FilenameFilter filenameFilter) {
        if (filenameFilter == null) {
            throw new IllegalArgumentException("The FilenameFilter must not be null");
        }
        this.b = filenameFilter;
        this.c = null;
    }

    public g(FileFilter fileFilter) {
        if (fileFilter == null) {
            throw new IllegalArgumentException("The FileFilter must not be null");
        }
        this.c = fileFilter;
        this.b = null;
    }

    @Override
    public boolean accept(File file) {
        if (this.c != null) {
            return this.c.accept(file);
        }
        return super.accept(file);
    }

    @Override
    public boolean accept(File file, String string) {
        if (this.b != null) {
            return this.b.accept(file, string);
        }
        return super.accept(file, string);
    }

    @Override
    public String toString() {
        String string = this.c != null ? this.c.toString() : this.b.toString();
        return super.toString() + "(" + string + ")";
    }
}

