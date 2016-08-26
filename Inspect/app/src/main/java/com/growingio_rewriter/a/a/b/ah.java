/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.ai;
import com.growingio.a.a.b.aj;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public abstract class ah<T>
extends PhantomReference<T>
implements ai {
    protected ah(T t2, aj aj2) {
        super(t2, aj2.a);
        aj2.a();
    }
}

