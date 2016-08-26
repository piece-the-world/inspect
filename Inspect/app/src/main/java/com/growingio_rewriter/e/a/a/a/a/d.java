/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.a;

import com.growingio.e.a.a.a.a.a;
import com.growingio.e.a.a.a.a.i;
import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

public class d
extends a
implements Serializable {
    private static final long c = 296132640160964395L;
    public static final Comparator<File> a = new d();
    public static final Comparator<File> b = new i(a);

    public int a(File file, File file2) {
        return this.a(file) - this.a(file2);
    }

    private int a(File file) {
        if (file.isDirectory()) {
            return 1;
        }
        return 2;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((File)object, (File)object2);
    }
}

