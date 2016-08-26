/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import com.growingio.b.h.a.d;
import com.growingio.b.h.a.e;
import com.growingio.b.h.a.m;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;

public class o
extends ObjectOutputStream {
    public o(OutputStream outputStream) throws IOException {
        super(outputStream);
    }

    @Override
    protected void writeClassDescriptor(ObjectStreamClass objectStreamClass) throws IOException {
        Class class_ = objectStreamClass.forClass();
        if (e.a(class_)) {
            this.writeBoolean(true);
            Class class_2 = class_.getSuperclass();
            Class<?>[] arrclass = class_.getInterfaces();
            byte[] arrby = e.c(class_);
            String string = class_2.getName();
            this.writeObject(string);
            this.writeInt(arrclass.length - 1);
            for (int i2 = 0; i2 < arrclass.length; ++i2) {
                Class class_3 = arrclass[i2];
                if (class_3 == m.class || class_3 == d.class) continue;
                string = arrclass[i2].getName();
                this.writeObject(string);
            }
            this.writeInt(arrby.length);
            this.write(arrby);
        } else {
            this.writeBoolean(false);
            super.writeClassDescriptor(objectStreamClass);
        }
    }
}

