/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.ai;
import com.growingio.a.a.b.aj;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public abstract class ap<T>
extends WeakReference<T>
implements ai {
    protected ap(T t2, aj aj2) {
        super(t2, aj2.a);
        aj2.a();
    }
}

