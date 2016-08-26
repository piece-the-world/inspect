/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.e;

import com.growingio.d.a.a;
import com.growingio.d.a.e.c;
import com.growingio.d.a.e.d;
import com.growingio.d.a.e.g;
import com.growingio.d.a.m;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.t;
import com.growingio.d.a.u;
import com.growingio.d.a.v;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class f
extends r {
    public int a;
    private int b;
    private boolean c;
    private boolean f;
    private boolean g;
    private int h;
    private final Map<p, Integer> i;
    private Set<p> j;
    private int k;
    private int l;
    private int m = -1;
    private List<p> n;
    private static final int[] o;
    private static Field p;

    public f(r r2) {
        this(r2, new HashMap<p, Integer>());
    }

    public f(r r2, Map<p, Integer> map) {
        this(327680, r2, map);
        if (this.getClass() != f.class) {
            throw new IllegalStateException();
        }
    }

    protected f(int n2, r r2, Map<p, Integer> map) {
        super(n2, r2);
        this.i = map;
        this.j = new HashSet<p>();
        this.n = new ArrayList<p>();
    }

    public f(int n2, String string, String string2, r r2, Map<p, Integer> map) {
        this(new g(327680, n2, string, string2, null, null, r2), map);
        this.b = n2;
    }

    @Override
    public void a(String string, int n2) {
        if (string != null) {
            f.a(this.a, string, "name");
        }
        d.a(n2, 36880);
        super.a(string, n2);
    }

    @Override
    public a a(String string, boolean bl2) {
        this.f();
        f.b(string, false);
        return new c(super.a(string, bl2));
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        this.f();
        int n3 = n2 >>> 24;
        if (n3 != 1 && n3 != 18 && n3 != 20 && n3 != 21 && n3 != 22 && n3 != 23) {
            throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(n3));
        }
        d.a(n2, v2);
        f.b(string, false);
        return new c(super.a(n2, v2, string, bl2));
    }

    @Override
    public a c() {
        this.f();
        return new c(super.c(), false);
    }

    @Override
    public a a(int n2, String string, boolean bl2) {
        this.f();
        f.b(string, false);
        return new c(super.a(n2, string, bl2));
    }

    @Override
    public void a(com.growingio.d.a.c c2) {
        this.f();
        if (c2 == null) {
            throw new IllegalArgumentException("Invalid attribute (must not be null)");
        }
        super.a(c2);
    }

    @Override
    public void a_() {
        if ((this.b & 1024) != 0) {
            throw new RuntimeException("Abstract methods cannot have code");
        }
        this.c = true;
        super.a_();
    }

    @Override
    public void a(int n2, int n3, Object[] arrobject, int n4, Object[] arrobject2) {
        int n5;
        int n6;
        int n7;
        if (this.h == this.m) {
            throw new IllegalStateException("At most one frame can be visited at a given code location.");
        }
        this.m = this.h;
        switch (n2) {
            case -1: 
            case 0: {
                n6 = Integer.MAX_VALUE;
                n7 = Integer.MAX_VALUE;
                break;
            }
            case 3: {
                n6 = 0;
                n7 = 0;
                break;
            }
            case 4: {
                n6 = 0;
                n7 = 1;
                break;
            }
            case 1: 
            case 2: {
                n6 = 3;
                n7 = 0;
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid frame type " + n2);
            }
        }
        if (n3 > n6) {
            throw new IllegalArgumentException("Invalid nLocal=" + n3 + " for frame type " + n2);
        }
        if (n4 > n7) {
            throw new IllegalArgumentException("Invalid nStack=" + n4 + " for frame type " + n2);
        }
        if (n2 != 2) {
            if (n3 > 0 && (arrobject == null || arrobject.length < n3)) {
                throw new IllegalArgumentException("Array local[] is shorter than nLocal");
            }
            for (n5 = 0; n5 < n3; ++n5) {
                this.b(arrobject[n5]);
            }
        }
        if (n4 > 0 && (arrobject2 == null || arrobject2.length < n4)) {
            throw new IllegalArgumentException("Array stack[] is shorter than nStack");
        }
        for (n5 = 0; n5 < n4; ++n5) {
            this.b(arrobject2[n5]);
        }
        if (n2 == -1) {
            ++this.k;
        } else {
            ++this.l;
        }
        if (this.k > 0 && this.l > 0) {
            throw new RuntimeException("Expanded and compressed frames must not be mixed.");
        }
        super.a(n2, n3, arrobject, n4, arrobject2);
    }

    @Override
    public void a_(int n2) {
        this.d();
        this.e();
        f.e(n2, 0);
        super.a_(n2);
        ++this.h;
    }

    @Override
    public void a(int n2, int n3) {
        this.d();
        this.e();
        f.e(n2, 1);
        switch (n2) {
            case 16: {
                f.b(n3, "Invalid operand");
                break;
            }
            case 17: {
                f.c(n3, "Invalid operand");
                break;
            }
            default: {
                if (n3 >= 4 && n3 <= 11) break;
                throw new IllegalArgumentException("Invalid operand (must be an array type code T_...): " + n3);
            }
        }
        super.a(n2, n3);
        ++this.h;
    }

    @Override
    public void b(int n2, int n3) {
        this.d();
        this.e();
        f.e(n2, 2);
        f.d(n3, "Invalid variable index");
        super.b(n2, n3);
        ++this.h;
    }

    @Override
    public void a(int n2, String string) {
        this.d();
        this.e();
        f.e(n2, 3);
        f.b(string, "type");
        if (n2 == 187 && string.charAt(0) == '[') {
            throw new IllegalArgumentException("NEW cannot be used to create arrays: " + string);
        }
        super.a(n2, string);
        ++this.h;
    }

    @Override
    public void b(int n2, String string, String string2, String string3) {
        this.d();
        this.e();
        f.e(n2, 4);
        f.b(string, "owner");
        f.a(this.a, string2, "name");
        f.b(string3, false);
        super.b(n2, string, string2, string3);
        ++this.h;
    }

    @Override
    public void a(int n2, String string, String string2, String string3) {
        if (this.m_ >= 327680) {
            super.a(n2, string, string2, string3);
            return;
        }
        this.b(n2, string, string2, string3, n2 == 185);
    }

    @Override
    public void a(int n2, String string, String string2, String string3, boolean bl2) {
        if (this.m_ < 327680) {
            super.a(n2, string, string2, string3, bl2);
            return;
        }
        this.b(n2, string, string2, string3, bl2);
    }

    private void b(int n2, String string, String string2, String string3, boolean bl2) {
        this.d();
        this.e();
        f.e(n2, 5);
        if (n2 != 183 || !"<init>".equals(string2)) {
            f.b(this.a, string2, "name");
        }
        f.b(string, "owner");
        f.a(string3);
        if (n2 == 182 && bl2) {
            throw new IllegalArgumentException("INVOKEVIRTUAL can't be used with interfaces");
        }
        if (n2 == 185 && !bl2) {
            throw new IllegalArgumentException("INVOKEINTERFACE can't be used with classes");
        }
        if (this.n_ != null) {
            this.n_.a(n2, string, string2, string3, bl2);
        }
        ++this.h;
    }

    @Override
    public /* varargs */ void a(String string, String string2, m m2, Object ... arrobject) {
        this.d();
        this.e();
        f.b(this.a, string, "name");
        f.a(string2);
        if (m2.a() != 6 && m2.a() != 8) {
            throw new IllegalArgumentException("invalid handle tag " + m2.a());
        }
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            this.d(arrobject[i2]);
        }
        super.a(string, string2, m2, arrobject);
        ++this.h;
    }

    @Override
    public void a(int n2, p p2) {
        this.d();
        this.e();
        f.e(n2, 6);
        this.a(p2, false, "label");
        f.b(p2);
        super.a(n2, p2);
        this.j.add(p2);
        ++this.h;
    }

    @Override
    public void a(p p2) {
        this.d();
        this.e();
        this.a(p2, false, "label");
        if (this.i.get(p2) != null) {
            throw new IllegalArgumentException("Already visited label");
        }
        this.i.put(p2, this.h);
        super.a(p2);
    }

    @Override
    public void a(Object object) {
        this.d();
        this.e();
        this.d(object);
        super.a(object);
        ++this.h;
    }

    @Override
    public void c(int n2, int n3) {
        this.d();
        this.e();
        f.d(n2, "Invalid variable index");
        f.c(n3, "Invalid increment");
        super.c(n2, n3);
        ++this.h;
    }

    @Override
    public /* varargs */ void a(int n2, int n3, p p2, p ... arrp) {
        int n4;
        this.d();
        this.e();
        if (n3 < n2) {
            throw new IllegalArgumentException("Max = " + n3 + " must be greater than or equal to min = " + n2);
        }
        this.a(p2, false, "default label");
        f.b(p2);
        if (arrp == null || arrp.length != n3 - n2 + 1) {
            throw new IllegalArgumentException("There must be max - min + 1 labels");
        }
        for (n4 = 0; n4 < arrp.length; ++n4) {
            this.a(arrp[n4], false, "label at index " + n4);
            f.b(arrp[n4]);
        }
        super.a(n2, n3, p2, arrp);
        for (n4 = 0; n4 < arrp.length; ++n4) {
            this.j.add(arrp[n4]);
        }
        ++this.h;
    }

    @Override
    public void a(p p2, int[] arrn, p[] arrp) {
        int n2;
        this.e();
        this.d();
        this.a(p2, false, "default label");
        f.b(p2);
        if (arrn == null || arrp == null || arrn.length != arrp.length) {
            throw new IllegalArgumentException("There must be the same number of keys and labels");
        }
        for (n2 = 0; n2 < arrp.length; ++n2) {
            this.a(arrp[n2], false, "label at index " + n2);
            f.b(arrp[n2]);
        }
        super.a(p2, arrn, arrp);
        this.j.add(p2);
        for (n2 = 0; n2 < arrp.length; ++n2) {
            this.j.add(arrp[n2]);
        }
        ++this.h;
    }

    @Override
    public void b(String string, int n2) {
        this.d();
        this.e();
        f.b(string, false);
        if (string.charAt(0) != '[') {
            throw new IllegalArgumentException("Invalid descriptor (must be an array type descriptor): " + string);
        }
        if (n2 < 1) {
            throw new IllegalArgumentException("Invalid dimensions (must be greater than 0): " + n2);
        }
        if (n2 > string.lastIndexOf(91) + 1) {
            throw new IllegalArgumentException("Invalid dimensions (must not be greater than dims(desc)): " + n2);
        }
        super.b(string, n2);
        ++this.h;
    }

    @Override
    public a b(int n2, v v2, String string, boolean bl2) {
        this.d();
        this.e();
        int n3 = n2 >>> 24;
        if (n3 != 67 && n3 != 68 && n3 != 69 && n3 != 70 && n3 != 71 && n3 != 72 && n3 != 73 && n3 != 74 && n3 != 75) {
            throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(n3));
        }
        d.a(n2, v2);
        f.b(string, false);
        return new c(super.b(n2, v2, string, bl2));
    }

    @Override
    public void a(p p2, p p3, p p4, String string) {
        this.d();
        this.e();
        this.a(p2, false, "start label");
        this.a(p3, false, "end label");
        this.a(p4, false, "handler label");
        f.b(p2);
        f.b(p3);
        f.b(p4);
        if (this.i.get(p2) != null || this.i.get(p3) != null || this.i.get(p4) != null) {
            throw new IllegalStateException("Try catch blocks must be visited before their labels");
        }
        if (string != null) {
            f.b(string, "type");
        }
        super.a(p2, p3, p4, string);
        this.n.add(p2);
        this.n.add(p3);
    }

    @Override
    public a c(int n2, v v2, String string, boolean bl2) {
        this.d();
        this.e();
        int n3 = n2 >>> 24;
        if (n3 != 66) {
            throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(n3));
        }
        d.a(n2, v2);
        f.b(string, false);
        return new c(super.c(n2, v2, string, bl2));
    }

    @Override
    public void a(String string, String string2, String string3, p p2, p p3, int n2) {
        this.d();
        this.e();
        f.a(this.a, string, "name");
        f.b(string2, false);
        this.a(p2, true, "start label");
        this.a(p3, true, "end label");
        f.d(n2, "Invalid variable index");
        int n3 = this.i.get(p2);
        int n4 = this.i.get(p3);
        if (n4 < n3) {
            throw new IllegalArgumentException("Invalid start and end labels (end must be greater than start)");
        }
        super.a(string, string2, string3, p2, p3, n2);
    }

    @Override
    public a a(int n2, v v2, p[] arrp, p[] arrp2, int[] arrn, String string, boolean bl2) {
        this.d();
        this.e();
        int n3 = n2 >>> 24;
        if (n3 != 64 && n3 != 65) {
            throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(n3));
        }
        d.a(n2, v2);
        f.b(string, false);
        if (arrp == null || arrp2 == null || arrn == null || arrp2.length != arrp.length || arrn.length != arrp.length) {
            throw new IllegalArgumentException("Invalid start, end and index arrays (must be non null and of identical length");
        }
        for (int i2 = 0; i2 < arrp.length; ++i2) {
            this.a(arrp[i2], true, "start label");
            this.a(arrp2[i2], true, "end label");
            f.d(arrn[i2], "Invalid variable index");
            int n4 = this.i.get(arrp[i2]);
            int n5 = this.i.get(arrp2[i2]);
            if (n5 >= n4) continue;
            throw new IllegalArgumentException("Invalid start and end labels (end must be greater than start)");
        }
        return super.a(n2, v2, arrp, arrp2, arrn, string, bl2);
    }

    @Override
    public void b(int n2, p p2) {
        this.d();
        this.e();
        f.d(n2, "Invalid line number");
        this.a(p2, true, "start label");
        super.b(n2, p2);
    }

    @Override
    public void d(int n2, int n3) {
        this.d();
        this.e();
        this.f = true;
        for (p object2 : this.j) {
            if (this.i.get(object2) != null) continue;
            throw new IllegalStateException("Undefined label used");
        }
        int n4 = 0;
        while (n4 < this.n.size()) {
            Integer n5 = this.i.get(this.n.get(n4++));
            Integer n6 = this.i.get(this.n.get(n4++));
            if (n5 == null || n6 == null) {
                throw new IllegalStateException("Undefined try catch block labels");
            }
            if (n6 > n5) continue;
            throw new IllegalStateException("Emty try catch block handler range");
        }
        f.d(n2, "Invalid max stack");
        f.d(n3, "Invalid max locals");
        super.d(n2, n3);
    }

    @Override
    public void b() {
        this.f();
        this.g = true;
        super.b();
    }

    void d() {
        if (!this.c) {
            throw new IllegalStateException("Cannot visit instructions before visitCode has been called.");
        }
    }

    void e() {
        if (this.f) {
            throw new IllegalStateException("Cannot visit instructions after visitMaxs has been called.");
        }
    }

    void f() {
        if (this.g) {
            throw new IllegalStateException("Cannot visit elements after visitEnd has been called.");
        }
    }

    void b(Object object) {
        if (object == t.ae || object == t.af || object == t.ag || object == t.ai || object == t.ah || object == t.aj || object == t.ak) {
            return;
        }
        if (object instanceof String) {
            f.b((String)object, "Invalid stack frame value");
            return;
        }
        if (!(object instanceof p)) {
            throw new IllegalArgumentException("Invalid stack frame value: " + object);
        }
        this.j.add((p)object);
    }

    static void e(int n2, int n3) {
        if (n2 < 0 || n2 > 199 || o[n2] != n3) {
            throw new IllegalArgumentException("Invalid opcode: " + n2);
        }
    }

    static void b(int n2, String string) {
        if (n2 < -128 || n2 > 127) {
            throw new IllegalArgumentException(string + " (must be a signed byte): " + n2);
        }
    }

    static void c(int n2, String string) {
        if (n2 < -32768 || n2 > 32767) {
            throw new IllegalArgumentException(string + " (must be a signed short): " + n2);
        }
    }

    static void d(int n2, String string) {
        if (n2 < 0 || n2 > 65535) {
            throw new IllegalArgumentException(string + " (must be an unsigned short): " + n2);
        }
    }

    static void c(Object object) {
        if (!(object instanceof Integer || object instanceof Float || object instanceof Long || object instanceof Double || object instanceof String)) {
            throw new IllegalArgumentException("Invalid constant: " + object);
        }
    }

    void d(Object object) {
        if (object instanceof u) {
            int n2 = ((u)object).a();
            if (n2 != 10 && n2 != 9 && n2 != 11) {
                throw new IllegalArgumentException("Illegal LDC constant value");
            }
            if (n2 != 11 && (this.a & 65535) < 49) {
                throw new IllegalArgumentException("ldc of a constant class requires at least version 1.5");
            }
            if (n2 == 11 && (this.a & 65535) < 51) {
                throw new IllegalArgumentException("ldc of a method type requires at least version 1.7");
            }
        } else if (object instanceof m) {
            if ((this.a & 65535) < 51) {
                throw new IllegalArgumentException("ldc of a handle requires at least version 1.7");
            }
            int n3 = ((m)object).a();
            if (n3 < 1 || n3 > 9) {
                throw new IllegalArgumentException("invalid handle tag " + n3);
            }
        } else {
            f.c(object);
        }
    }

    static void a(int n2, String string, String string2) {
        if ((n2 & 65535) < 49) {
            f.a(string, string2);
        } else {
            for (int i2 = 0; i2 < string.length(); ++i2) {
                if (".;[/".indexOf(string.charAt(i2)) == -1) continue;
                throw new IllegalArgumentException("Invalid " + string2 + " (must be a valid unqualified name): " + string);
            }
        }
    }

    static void a(String string, String string2) {
        f.a(string, 0, -1, string2);
    }

    static void a(String string, int n2, int n3, String string2) {
        if (string == null || (n3 == -1 ? string.length() <= n2 : n3 <= n2)) {
            throw new IllegalArgumentException("Invalid " + string2 + " (must not be null or empty)");
        }
        if (!Character.isJavaIdentifierStart(string.charAt(n2))) {
            throw new IllegalArgumentException("Invalid " + string2 + " (must be a valid Java identifier): " + string);
        }
        int n4 = n3 == -1 ? string.length() : n3;
        for (int i2 = n2 + 1; i2 < n4; ++i2) {
            if (Character.isJavaIdentifierPart(string.charAt(i2))) continue;
            throw new IllegalArgumentException("Invalid " + string2 + " (must be a valid Java identifier): " + string);
        }
    }

    static void b(int n2, String string, String string2) {
        if (string == null || string.length() == 0) {
            throw new IllegalArgumentException("Invalid " + string2 + " (must not be null or empty)");
        }
        if ((n2 & 65535) >= 49) {
            for (int i2 = 0; i2 < string.length(); ++i2) {
                if (".;[/<>".indexOf(string.charAt(i2)) == -1) continue;
                throw new IllegalArgumentException("Invalid " + string2 + " (must be a valid unqualified name): " + string);
            }
            return;
        }
        if (!Character.isJavaIdentifierStart(string.charAt(0))) {
            throw new IllegalArgumentException("Invalid " + string2 + " (must be a '<init>', '<clinit>' or a valid Java identifier): " + string);
        }
        for (int i3 = 1; i3 < string.length(); ++i3) {
            if (Character.isJavaIdentifierPart(string.charAt(i3))) continue;
            throw new IllegalArgumentException("Invalid " + string2 + " (must be '<init>' or '<clinit>' or a valid Java identifier): " + string);
        }
    }

    static void b(String string, String string2) {
        if (string == null || string.length() == 0) {
            throw new IllegalArgumentException("Invalid " + string2 + " (must not be null or empty)");
        }
        if (string.charAt(0) == '[') {
            f.b(string, false);
        } else {
            f.b(string, 0, -1, string2);
        }
    }

    static void b(String string, int n2, int n3, String string2) {
        int n4 = n3 == -1 ? string.length() : n3;
        try {
            int n5;
            int n6 = n2;
            do {
                if ((n5 = string.indexOf(47, n6 + 1)) == -1 || n5 > n4) {
                    n5 = n4;
                }
                f.a(string, n6, n5, null);
                n6 = n5 + 1;
            } while (n5 != n4);
        }
        catch (IllegalArgumentException var5_6) {
            throw new IllegalArgumentException("Invalid " + string2 + " (must be a fully qualified class name in internal form): " + string);
        }
    }

    static void b(String string, boolean bl2) {
        int n2 = f.a(string, 0, bl2);
        if (n2 != string.length()) {
            throw new IllegalArgumentException("Invalid descriptor: " + string);
        }
    }

    static int a(String string, int n2, boolean bl2) {
        if (string == null || n2 >= string.length()) {
            throw new IllegalArgumentException("Invalid type descriptor (must not be null or empty)");
        }
        switch (string.charAt(n2)) {
            case 'V': {
                if (bl2) {
                    return n2 + 1;
                }
                throw new IllegalArgumentException("Invalid descriptor: " + string);
            }
            case 'B': 
            case 'C': 
            case 'D': 
            case 'F': 
            case 'I': 
            case 'J': 
            case 'S': 
            case 'Z': {
                return n2 + 1;
            }
            case '[': {
                int n3;
                for (n3 = n2 + 1; n3 < string.length() && string.charAt(n3) == '['; ++n3) {
                }
                if (n3 < string.length()) {
                    return f.a(string, n3, false);
                }
                throw new IllegalArgumentException("Invalid descriptor: " + string);
            }
            case 'L': {
                int n4 = string.indexOf(59, n2);
                if (n4 == -1 || n4 - n2 < 2) {
                    throw new IllegalArgumentException("Invalid descriptor: " + string);
                }
                try {
                    f.b(string, n2 + 1, n4, null);
                }
                catch (IllegalArgumentException var4_5) {
                    throw new IllegalArgumentException("Invalid descriptor: " + string);
                }
                return n4 + 1;
            }
        }
        throw new IllegalArgumentException("Invalid descriptor: " + string);
    }

    static void a(String string) {
        if (string == null || string.length() == 0) {
            throw new IllegalArgumentException("Invalid method descriptor (must not be null or empty)");
        }
        if (string.charAt(0) != '(' || string.length() < 3) {
            throw new IllegalArgumentException("Invalid descriptor: " + string);
        }
        int n2 = 1;
        if (string.charAt(n2) != ')') {
            do {
                if (string.charAt(n2) != 'V') continue;
                throw new IllegalArgumentException("Invalid descriptor: " + string);
            } while ((n2 = f.a(string, n2, false)) < string.length() && string.charAt(n2) != ')');
        }
        if ((n2 = f.a(string, n2 + 1, true)) != string.length()) {
            throw new IllegalArgumentException("Invalid descriptor: " + string);
        }
    }

    void a(p p2, boolean bl2, String string) {
        if (p2 == null) {
            throw new IllegalArgumentException("Invalid " + string + " (must not be null)");
        }
        if (bl2 && this.i.get(p2) == null) {
            throw new IllegalArgumentException("Invalid " + string + " (must be visited first)");
        }
    }

    private static void b(p p2) {
        Field field = f.g();
        int n2 = 0;
        try {
            n2 = field == null ? 0 : (Integer)field.get(p2);
        }
        catch (IllegalAccessException var3_3) {
            throw new Error("Internal error");
        }
        if ((n2 & 1) != 0) {
            throw new IllegalArgumentException("Labels used for debug info cannot be reused for control flow");
        }
    }

    private static Field g() {
        if (p == null && (f.p = f.b("a")) == null) {
            p = f.b("status");
        }
        return p;
    }

    private static Field b(String string) {
        try {
            Field field = p.class.getDeclaredField(string);
            field.setAccessible(true);
            return field;
        }
        catch (NoSuchFieldException var1_2) {
            return null;
        }
    }

    static {
        String string = "BBBBBBBBBBBBBBBBCCIAADDDDDAAAAAAAAAAAAAAAAAAAABBBBBBBBDDDDDAAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBJBBBBBBBBBBBBBBBBBBBBHHHHHHHHHHHHHHHHDKLBBBBBBFFFFGGGGAECEBBEEBBAMHHAA";
        o = new int[string.length()];
        for (int i2 = 0; i2 < o.length; ++i2) {
            f.o[i2] = string.charAt(i2) - 65 - 1;
        }
    }
}

