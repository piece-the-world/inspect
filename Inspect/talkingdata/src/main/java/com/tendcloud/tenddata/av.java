/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

static final class av
extends ObjectInputStream {
    final /* synthetic */ ClassLoader a;

    av(InputStream inputStream, ClassLoader classLoader) {
        this.a = classLoader;
        super(inputStream);
    }

    public Class resolveClass(ObjectStreamClass objectStreamClass) {
        Class class_ = Class.forName(objectStreamClass.getName(), false, this.a);
        if (class_ == null) {
            return super.resolveClass(objectStreamClass);
        }
        return class_;
    }
}

