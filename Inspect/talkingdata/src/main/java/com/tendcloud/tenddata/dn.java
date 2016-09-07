/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.R
 *  android.R$drawable
 *  android.R$id
 *  android.content.Context
 *  android.util.Log
 *  android.util.SparseArray
 */
package com.tendcloud.tenddata;

import android.R;
import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

abstract class dn {
    private final Context a;
    private final Map b;
    private final SparseArray c;
    private static final String d = "TD.ResReader";

    protected dn(Context context) {
        this.a = context;
        this.b = new HashMap();
        this.c = new SparseArray();
    }

    boolean a(String string) {
        return this.b.containsKey(string);
    }

    int b(String string) {
        return (Integer)this.b.get(string);
    }

    String a(int n2) {
        return (String)this.c.get(n2);
    }

    private static void a(Class class_, String string, Map map) {
        try {
            Field[] arrfield = class_.getFields();
            for (int i2 = 0; i2 < arrfield.length; ++i2) {
                Class class_2;
                Field field = arrfield[i2];
                int n2 = field.getModifiers();
                if (!Modifier.isStatic(n2) || (class_2 = field.getType()) != Integer.TYPE) continue;
                String string2 = field.getName();
                int n3 = field.getInt(null);
                String string3 = null == string ? string2 : string + ":" + string2;
                map.put(string3, n3);
            }
        }
        catch (IllegalAccessException var3_4) {
            // empty catch block
        }
    }

    protected abstract Class a();

    protected abstract String a(Context var1);

    protected void b() {
        this.b.clear();
        this.c.clear();
        Class class_ = this.a();
        dn.a(class_, "android", this.b);
        String string = this.a(this.a);
        try {
            Class<?> class_2 = Class.forName(string);
            dn.a(class_2, null, this.b);
        }
        catch (ClassNotFoundException var3_4) {
            Log.w((String)"TD.ResReader", (String)("Class not found from '" + string));
        }
        for (Map.Entry entry : this.b.entrySet()) {
            this.c.put(((Integer)entry.getValue()).intValue(), entry.getKey());
        }
    }

    static class a
    extends dn {
        private final String a;

        protected a(String string, Context context) {
            super(context);
            this.a = string;
            this.b();
        }

        @Override
        protected Class a() {
            return R.drawable.class;
        }

        @Override
        protected String a(Context context) {
            return this.a + ".R$drawable";
        }
    }

    static class b
    extends dn {
        private final String a;

        public b(String string, Context context) {
            super(context);
            this.a = string;
            this.b();
        }

        @Override
        protected Class a() {
            return R.id.class;
        }

        @Override
        protected String a(Context context) {
            return this.a + ".R$id";
        }
    }

}

