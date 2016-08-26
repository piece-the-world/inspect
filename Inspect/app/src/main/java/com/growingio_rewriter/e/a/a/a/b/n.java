/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public interface n
extends FileFilter,
FilenameFilter {
    @Override
    public boolean accept(File var1);

    @Override
    public boolean accept(File var1, String var2);
}

