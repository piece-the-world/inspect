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

public class f
extends a
implements Serializable {
    private static final long c = 7372168004395734046L;
    public static final Comparator<File> a = new f();
    public static final Comparator<File> b = new i(a);

    public int a(File file, File file2) {
        long l2 = file.lastModified() - file2.lastModified();
        if (l2 < 0) {
            return -1;
        }
        if (l2 > 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((File)object, (File)object2);
    }
}

