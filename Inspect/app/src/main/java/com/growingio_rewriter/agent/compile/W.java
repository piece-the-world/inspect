/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.U;
import com.growingio.agent.compile.m;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

class W
implements InvocationHandler {
    final /* synthetic */ U a;

    W(U u2) {
        this.a = u2;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] arrobject) throws Throwable {
        File file;
        List list = (List)arrobject[0];
        Iterator iterator = list.iterator();
        do {
            if (iterator.hasNext()) continue;
            this.a.a.d("Ant preDexLibraries: " + list);
            this.a.a.a("No agent detected in Ant build");
            return null;
        } while (!(file = (File)iterator.next()).getName().toLowerCase().startsWith("vds-android-agent"));
        this.a.a.a("Detected the VDS Android agent in an Ant build (" + file.getPath() + ")");
        return file;
    }
}

