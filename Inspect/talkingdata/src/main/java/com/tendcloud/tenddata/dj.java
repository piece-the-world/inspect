/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.dm;
import com.tendcloud.tenddata.dn;
import com.tendcloud.tenddata.dp;
import com.tendcloud.tenddata.dq;
import com.tendcloud.tenddata.dr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class dj {
    private final dn a;
    private final dr.g b;
    private static final Class[] c = new Class[0];
    private static final List d = Collections.emptyList();

    dj(dn dn2, dr.g g2) {
        this.a = dn2;
        this.b = g2;
    }

    dr a(JSONObject jSONObject, dr.f f2) {
        try {
            String string = jSONObject.getString("id");
            String string2 = jSONObject.getString("type");
            JSONArray jSONArray = jSONObject.getJSONArray("path");
            List list = this.a(jSONArray, this.a);
            if (list.size() == 0) {
                // empty if block
            }
            if ("click".equals(string2)) {
                return new dr.a(list, 1, string, f2);
            }
            if ("selected".equals(string2)) {
                return new dr.a(list, 4, string, f2);
            }
            if ("text_changed".equals(string2)) {
                return new dr.b(list, string, f2);
            }
            if ("detected".equals(string2)) {
                return new dr.i(list, string, f2);
            }
        }
        catch (JSONException var3_4) {
            // empty catch block
        }
        return null;
    }

    dq a(JSONObject jSONObject) {
        ArrayList<b> arrayList = new ArrayList<b>();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("config");
            JSONArray jSONArray = jSONObject2.getJSONArray("classes");
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                String string = jSONObject3.getString("name");
                Class class_ = Class.forName(string);
                JSONArray jSONArray2 = jSONObject3.getJSONArray("properties");
                for (int i3 = 0; i3 < jSONArray2.length(); ++i3) {
                    JSONObject jSONObject4 = jSONArray2.getJSONObject(i3);
                    b b2 = this.a(class_, jSONObject4);
                    arrayList.add(b2);
                }
            }
            return new dq(arrayList, this.a);
        }
        catch (Throwable var3_4) {
            return null;
        }
    }

    List a(JSONArray jSONArray, dn dn2) {
        ArrayList<dp.c> arrayList = new ArrayList<dp.c>();
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            int n2;
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String string = dj.a(jSONObject, "prefix");
            String string2 = dj.a(jSONObject, "class");
            int n3 = jSONObject.optInt("index", -1);
            String string3 = dj.a(jSONObject, "description");
            int n4 = jSONObject.optInt("id", -1);
            String string4 = dj.a(jSONObject, "id_name");
            String string5 = dj.a(jSONObject, "tag");
            if ("shortest".equals(string)) {
                n2 = 1;
            } else if (null == string) {
                n2 = 0;
            } else {
                return d;
            }
            Integer n5 = this.a(n4, string4, dn2);
            if (null == n5) {
                return d;
            }
            int n6 = n5;
            arrayList.add(new dp.c(n2, string2, n3, n6, string3, string5));
        }
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Integer a(int n2, String string, dn dn2) {
        if (null == string) return n2;
        if (!dn2.a(string)) {
            return null;
        }
        int n3 = dn2.b(string);
        if (-1 != n3 && -1 != n2 && n3 != n2) {
            return null;
        }
        if (-1 == n3) return n2;
        return n3;
    }

    private b a(Class class_, JSONObject jSONObject) {
        try {
            String string;
            Object object;
            String string2 = jSONObject.getString("name");
            dm dm2 = null;
            if (jSONObject.has("get")) {
                object = jSONObject.getJSONObject("get");
                string = object.getString("selector");
                String string3 = object.getJSONObject("result").getString("type");
                Class class_2 = Class.forName(string3);
                dm2 = new dm(class_, string, c, class_2);
            }
            if (jSONObject.has("set")) {
                string = jSONObject.getJSONObject("set");
                object = string.getString("selector");
            } else {
                object = null;
            }
            return new b(string2, class_, dm2, (String)object);
        }
        catch (Throwable var3_4) {
            return null;
        }
    }

    private static String a(JSONObject jSONObject, String string) {
        if (jSONObject.has(string) && !jSONObject.isNull(string)) {
            return jSONObject.getString(string);
        }
        return null;
    }

    class b {
        public final String a;
        public final Class b;
        public final dm c;
        private final String e;

        public b(String string, Class class_, dm dm2, String string2) {
            this.a = string;
            this.b = class_;
            this.c = dm2;
            this.e = string2;
        }

        public dm a(Object[] arrobject) {
            if (null == this.e) {
                return null;
            }
            return new dm(this.b, this.e, arrobject, Void.TYPE);
        }

        public String toString() {
            return "[PropertyDescription " + this.a + "," + this.b + ", " + this.c + "/" + this.e + "]";
        }
    }

    static class a {
        final dr a;
        final List b;

        private a(dr dr2, List list) {
            this.a = dr2;
            this.b = list;
        }
    }

}

