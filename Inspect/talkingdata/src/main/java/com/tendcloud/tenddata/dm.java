/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.tendcloud.tenddata;

import android.view.View;
import java.lang.reflect.Method;

class dm {
    private final String a;
    private final Object[] b;
    private final Class c;
    private final Class d;
    private final Method e;

    dm(Class class_, String string, Object[] arrobject, Class class_2) {
        this.a = string;
        this.b = arrobject;
        this.c = class_2;
        this.e = this.b(class_);
        if (null == this.e) {
            throw new NoSuchMethodException("Method " + class_.getName() + "." + this.a + " doesn't exit");
        }
        this.d = this.e.getDeclaringClass();
    }

    public String toString() {
        return "[Caller " + this.a + "(" + this.b + ")" + "]";
    }

    Object[] a() {
        return this.b;
    }

    Object a(View view) {
        return this.a(view, this.b);
    }

    Object a(View view, Object[] arrobject) {
        Class class_ = view.getClass();
        if (this.d.isAssignableFrom(class_)) {
            try {
                return this.e.invoke((Object)view, arrobject);
            }
            catch (Exception var4_4) {
                // empty catch block
            }
        }
        return null;
    }

    boolean a(Object[] arrobject) {
        Class<?>[] arrclass = this.e.getParameterTypes();
        if (arrobject.length != arrclass.length) {
            return false;
        }
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            Class class_;
            Class class_2 = dm.a(arrclass[i2]);
            if (!(null == arrobject[i2] ? class_2 == Byte.TYPE || class_2 == Short.TYPE || class_2 == Integer.TYPE || class_2 == Long.TYPE || class_2 == Float.TYPE || class_2 == Double.TYPE || class_2 == Boolean.TYPE || class_2 == Character.TYPE : !class_2.isAssignableFrom(class_ = dm.a(arrobject[i2].getClass())))) continue;
            return false;
        }
        return true;
    }

    private static Class a(Class class_) {
        if (class_ == Byte.class) {
            class_ = Byte.TYPE;
        } else if (class_ == Short.class) {
            class_ = Short.TYPE;
        } else if (class_ == Integer.class) {
            class_ = Integer.TYPE;
        } else if (class_ == Long.class) {
            class_ = Long.TYPE;
        } else if (class_ == Float.class) {
            class_ = Float.TYPE;
        } else if (class_ == Double.class) {
            class_ = Double.TYPE;
        } else if (class_ == Boolean.class) {
            class_ = Boolean.TYPE;
        } else if (class_ == Character.class) {
            class_ = Character.TYPE;
        }
        return class_;
    }

    private Method b(Class class_) {
        Class[] arrclass = new Class[this.b.length];
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            arrclass[i2] = this.b[i2].getClass();
        }
        for (Method method : class_.getMethods()) {
            Class class_2;
            Class class_3;
            String string = method.getName();
            Class<?>[] arrclass2 = method.getParameterTypes();
            if (!string.equals(this.a) || arrclass2.length != this.b.length || !(class_2 = dm.a(this.c)).isAssignableFrom(class_3 = dm.a(method.getReturnType()))) continue;
            boolean bl2 = true;
            for (int i3 = 0; i3 < arrclass2.length && bl2; ++i3) {
                Class class_4 = dm.a(arrclass[i3]);
                Class class_5 = dm.a(arrclass2[i3]);
                bl2 = class_5.isAssignableFrom(class_4);
            }
            if (!bl2) continue;
            return method;
        }
        return null;
    }
}

