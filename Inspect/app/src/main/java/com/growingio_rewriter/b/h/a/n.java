/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import com.growingio.b.h.a.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class n
extends ObjectInputStream {
    private ClassLoader a = Thread.currentThread().getContextClassLoader();

    public n(InputStream inputStream) throws IOException {
        super(inputStream);
        if (this.a == null) {
            this.a = ClassLoader.getSystemClassLoader();
        }
    }

    public void a(ClassLoader classLoader) {
        if (classLoader != null) {
            this.a = classLoader;
        } else {
            classLoader = ClassLoader.getSystemClassLoader();
        }
    }

    @Override
    protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
        boolean bl2 = this.readBoolean();
        if (bl2) {
            String string = (String)this.readObject();
            Class class_ = this.a.loadClass(string);
            int n2 = this.readInt();
            Class[] arrclass = new Class[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                string = (String)this.readObject();
                arrclass[i2] = this.a.loadClass(string);
            }
            n2 = this.readInt();
            byte[] arrby = new byte[n2];
            this.read(arrby);
            e e2 = new e();
            e2.a(true);
            e2.b(false);
            e2.b(class_);
            e2.a(arrclass);
            Class class_2 = e2.a(arrby);
            return ObjectStreamClass.lookup(class_2);
        }
        return super.readClassDescriptor();
    }
}

