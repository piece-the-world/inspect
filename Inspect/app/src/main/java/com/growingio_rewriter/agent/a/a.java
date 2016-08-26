/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.a;

import com.growingio.agent.a.b;
import java.util.HashMap;
import java.util.Map;

public class a
extends com.growingio.d.a.a {
    private Map<String, Object> a;
    private final String b;

    public a(String string) {
        super(327680);
        this.b = string;
    }

    @Override
    public void a(String string, String string2, String string3) {
        if (this.a == null) {
            this.a = new HashMap<String, Object>();
        }
        this.a.put(string, string3);
    }

    @Override
    public void b_() {
    }

    @Override
    public com.growingio.d.a.a a(String string) {
        return new b(this, string);
    }

    @Override
    public com.growingio.d.a.a a(String string, String string2) {
        return null;
    }

    @Override
    public void a(String string, Object object) {
        if (this.a == null) {
            this.a = new HashMap<String, Object>();
        }
        this.a.put(string, object);
    }

    public String b() {
        return this.b;
    }

    public Map<String, Object> c() {
        return this.a == null ? new HashMap<String, Object>(0) : this.a;
    }
}

