/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.T;
import com.growingio.b.a.X;
import com.growingio.b.a.aZ;
import com.growingio.b.a.ab;
import com.growingio.b.a.ac;
import com.growingio.b.a.as;
import com.growingio.b.a.bk;
import com.growingio.b.a.o;
import com.growingio.b.a.y;
import com.growingio.b.b;
import com.growingio.b.h.a.a;
import com.growingio.b.h.a.c;
import com.growingio.b.h.a.d;
import com.growingio.b.h.a.f;
import com.growingio.b.h.a.g;
import com.growingio.b.h.a.h;
import com.growingio.b.h.a.i;
import com.growingio.b.h.a.j;
import com.growingio.b.h.a.k;
import com.growingio.b.h.a.l;
import com.growingio.b.h.a.m;
import com.growingio.b.h.a.p;
import com.growingio.b.h.a.r;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class e {
    private Class f = null;
    private Class[] g = null;
    private com.growingio.b.h.a.b h = null;
    private c i = null;
    private List j = null;
    private boolean k = false;
    private byte[] l = null;
    private String m;
    private String n;
    private String o;
    private Class p = null;
    private boolean q = b;
    private boolean r = c;
    public String a = null;
    private static final Class s = Object.class;
    private static final String t = "_methods_";
    private static final String u = "[Ljava/lang/reflect/Method;";
    private static final String v = "_filter_signature";
    private static final String w = "[B";
    private static final String x = "handler";
    private static final String y = "RuntimeSupport";
    private static final String z = "default_interceptor";
    private static final String A = "" + 'L' + c.class.getName().replace('.', '/') + ';';
    private static final String B = "setHandler";
    private static final String C = "(" + A + ")V";
    private static final String D = "getHandler";
    private static final String E = "()" + A;
    private static final String F = "serialVersionUID";
    private static final String G = "J";
    private static final long H = -1;
    public static volatile boolean b = true;
    public static volatile boolean c = true;
    private static WeakHashMap I = new WeakHashMap();
    private static char[] J = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static i d = new f();
    public static l e = new g();
    private static Comparator K = new h();
    private static final String L = "getHandler:()";

    public boolean a() {
        return this.q;
    }

    public void a(boolean bl2) {
        if (this.i != null && bl2) {
            throw new RuntimeException("caching cannot be enabled if the factory default interceptor has been set");
        }
        this.q = bl2;
    }

    public boolean b() {
        return this.r;
    }

    public void b(boolean bl2) {
        this.r = bl2;
    }

    public static boolean a(Class class_) {
        return d.class.isAssignableFrom(class_);
    }

    public void b(Class class_) {
        this.f = class_;
        this.l = null;
    }

    public Class c() {
        return this.f;
    }

    public void a(Class[] arrclass) {
        this.g = arrclass;
        this.l = null;
    }

    public Class[] d() {
        return this.g;
    }

    public void a(com.growingio.b.h.a.b b2) {
        this.h = b2;
        this.l = null;
    }

    public Class e() {
        if (this.l == null) {
            this.c(this.h);
        }
        return this.i();
    }

    public Class b(com.growingio.b.h.a.b b2) {
        this.c(b2);
        return this.i();
    }

    Class a(byte[] arrby) {
        this.b(arrby);
        return this.i();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Class i() {
        Class class_ = this.p;
        if (class_ == null) {
            ClassLoader classLoader = this.f();
            WeakHashMap weakHashMap = I;
            synchronized (weakHashMap) {
                if (this.q) {
                    this.a(classLoader);
                } else {
                    this.b(classLoader);
                }
                class_ = this.p;
                this.p = null;
            }
        }
        return class_;
    }

    public String a(Class class_, Class[] arrclass, byte[] arrby, boolean bl2) {
        int n2;
        StringBuffer stringBuffer = new StringBuffer();
        if (class_ != null) {
            stringBuffer.append(class_.getName());
        }
        stringBuffer.append(":");
        for (n2 = 0; n2 < arrclass.length; ++n2) {
            stringBuffer.append(arrclass[n2].getName());
            stringBuffer.append(":");
        }
        for (n2 = 0; n2 < arrby.length; ++n2) {
            byte by2 = arrby[n2];
            int n3 = by2 & 15;
            int n4 = by2 >> 4 & 15;
            stringBuffer.append(J[n3]);
            stringBuffer.append(J[n4]);
        }
        if (bl2) {
            stringBuffer.append(":w");
        }
        return stringBuffer.toString();
    }

    private void a(ClassLoader classLoader) {
        k k2;
        String string = this.a(this.f, this.g, this.l, this.r);
        HashMap<String, k> hashMap = (HashMap<String, k>)I.get(classLoader);
        if (hashMap == null) {
            hashMap = new HashMap<String, k>();
            I.put(classLoader, hashMap);
        }
        if ((k2 = (k)hashMap.get(string)) != null) {
            WeakReference weakReference = k2.b;
            this.p = (Class)weakReference.get();
            if (this.p != null) {
                return;
            }
        }
        this.b(classLoader);
        k2 = new k(this.l, this.p, this.r);
        hashMap.put(string, k2);
    }

    private void b(ClassLoader classLoader) {
        this.l();
        try {
            com.growingio.b.a.p p2 = this.j();
            if (this.a != null) {
                a.a(p2, this.a);
            }
            this.p = a.a(p2, classLoader, this.h());
            this.a("_filter_signature", (Object)this.l);
            if (!this.q) {
                this.a("default_interceptor", this.i);
            }
        }
        catch (b var2_3) {
            throw new RuntimeException(var2_3.getMessage(), var2_3);
        }
    }

    private void a(String string, Object object) {
        if (this.p != null && object != null) {
            try {
                Field field = this.p.getField(string);
                r.a(field, true);
                field.set(null, object);
                r.a(field, false);
            }
            catch (Exception var3_4) {
                throw new RuntimeException(var3_4);
            }
        }
    }

    static byte[] c(Class class_) {
        return (byte[])e.a(class_, "_filter_signature");
    }

    private static Object a(Class class_, String string) {
        try {
            Field field = class_.getField(string);
            field.setAccessible(true);
            Object object = field.get(null);
            field.setAccessible(false);
            return object;
        }
        catch (Exception var2_3) {
            throw new RuntimeException(var2_3);
        }
    }

    public static c a(d d2) {
        try {
            Field field = d2.getClass().getDeclaredField("handler");
            field.setAccessible(true);
            Object object = field.get(d2);
            field.setAccessible(false);
            return (c)object;
        }
        catch (Exception var1_2) {
            throw new RuntimeException(var1_2);
        }
    }

    protected ClassLoader f() {
        return d.a(this);
    }

    protected ClassLoader g() {
        ClassLoader classLoader = null;
        if (this.f != null && !this.f.getName().equals("java.lang.Object")) {
            classLoader = this.f.getClassLoader();
        } else if (this.g != null && this.g.length > 0) {
            classLoader = this.g[0].getClassLoader();
        }
        if (classLoader == null && (classLoader = this.getClass().getClassLoader()) == null && (classLoader = Thread.currentThread().getContextClassLoader()) == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return classLoader;
    }

    protected ProtectionDomain h() {
        Class class_ = this.f != null && !this.f.getName().equals("java.lang.Object") ? this.f : (this.g != null && this.g.length > 0 ? this.g[0] : this.getClass());
        return class_.getProtectionDomain();
    }

    public Object a(Class[] arrclass, Object[] arrobject, c c2) throws NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Object object = this.a(arrclass, arrobject);
        ((d)object).a(c2);
        return object;
    }

    public Object a(Class[] arrclass, Object[] arrobject) throws NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class class_ = this.e();
        Constructor constructor = class_.getConstructor(arrclass);
        return constructor.newInstance(arrobject);
    }

    public void a(c c2) {
        if (this.q && c2 != null) {
            this.q = false;
            this.p = null;
        }
        this.i = c2;
        this.a("default_interceptor", this.i);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static String a(String string) {
        l l2 = e;
        synchronized (l2) {
            return e.a(string);
        }
    }

    private com.growingio.b.a.p j() throws b {
        ac ac2;
        com.growingio.b.a.p p2 = new com.growingio.b.a.p(false, this.m, this.o);
        p2.a(1);
        e.a(p2, this.g, (Class)(this.k ? d.class : m.class));
        Q q2 = p2.c();
        if (!this.q) {
            ac2 = new ac(q2, "default_interceptor", A);
            ac2.a(9);
            p2.a(ac2);
        }
        ac2 = new ac(q2, "handler", A);
        ac2.a(2);
        p2.a(ac2);
        ac ac3 = new ac(q2, "_filter_signature", "[B");
        ac3.a(9);
        p2.a(ac3);
        ac ac4 = new ac(q2, "serialVersionUID", "J");
        ac4.a(25);
        p2.a(ac4);
        this.a(this.m, p2, q2, this.m);
        ArrayList arrayList = new ArrayList();
        int n2 = this.a(p2, q2, this.m, arrayList);
        e.a(p2, q2, this.m, n2, arrayList);
        e.a(this.m, p2, q2);
        if (!this.k) {
            e.b(this.m, p2, q2);
        }
        if (this.r) {
            try {
                p2.a(e.a(q2));
            }
            catch (X var8_8) {
                // empty catch block
            }
        }
        this.p = null;
        return p2;
    }

    private void k() {
        if (this.g == null) {
            this.g = new Class[0];
        }
        if (this.f == null) {
            this.f = s;
            this.o = this.f.getName();
            this.n = this.g.length == 0 ? this.o : this.g[0].getName();
        } else {
            this.n = this.o = this.f.getName();
        }
        if (Modifier.isFinal(this.f.getModifiers())) {
            throw new RuntimeException(this.o + " is final");
        }
        if (this.n.startsWith("java.")) {
            this.n = "org.javassist.tmp." + this.n;
        }
    }

    private void l() {
        this.m = e.a(this.n);
    }

    private void m() {
        this.k();
        this.k = false;
        HashMap hashMap = this.a(this.f, this.g);
        this.j = new ArrayList(hashMap.entrySet());
        Collections.sort(this.j, K);
    }

    private void c(com.growingio.b.h.a.b b2) {
        this.m();
        int n2 = this.j.size();
        int n3 = n2 + 7 >> 3;
        this.l = new byte[n3];
        for (int i2 = 0; i2 < n2; ++i2) {
            Map.Entry entry = (Map.Entry)this.j.get(i2);
            Method method = (Method)entry.getValue();
            int n4 = method.getModifiers();
            if (Modifier.isFinal(n4) || Modifier.isStatic(n4) || !e.a(n4, this.n, (Member)method) || b2 != null && !b2.a(method)) continue;
            this.b(this.l, i2);
        }
    }

    private void b(byte[] arrby) {
        this.m();
        int n2 = this.j.size();
        int n3 = n2 + 7 >> 3;
        if (arrby.length != n3) {
            throw new RuntimeException("invalid filter signature length for deserialized proxy class");
        }
        this.l = arrby;
    }

    private boolean a(byte[] arrby, int n2) {
        int n3 = n2 >> 3;
        if (n3 > arrby.length) {
            return false;
        }
        byte by2 = arrby[n3];
        int n4 = n2 & 7;
        int n5 = 1 << n4;
        return (by2 & n5) != 0;
    }

    private void b(byte[] arrby, int n2) {
        int n3 = n2 >> 3;
        if (n3 < arrby.length) {
            int n4 = n2 & 7;
            int n5 = 1 << n4;
            byte by2 = arrby[n3];
            arrby[n3] = (byte)(by2 | n5);
        }
    }

    private static void a(com.growingio.b.a.p p2, Class[] arrclass, Class class_) {
        String[] arrstring;
        String string = class_.getName();
        if (arrclass == null || arrclass.length == 0) {
            arrstring = new String[]{string};
        } else {
            arrstring = new String[arrclass.length + 1];
            for (int i2 = 0; i2 < arrclass.length; ++i2) {
                arrstring[i2] = arrclass[i2].getName();
            }
            arrstring[arrclass.length] = string;
        }
        p2.a(arrstring);
    }

    private static void a(com.growingio.b.a.p p2, Q q2, String string, int n2, ArrayList arrayList) throws b {
        ac ac2 = new ac(q2, "_methods_", "[Ljava/lang/reflect/Method;");
        ac2.a(10);
        p2.a(ac2);
        as as2 = new as(q2, "<clinit>", "()V");
        as2.a(8);
        e.a(as2, q2, new Class[]{ClassNotFoundException.class});
        o o2 = new o(q2, 0, 2);
        o2.p(n2 * 2);
        o2.e("java.lang.reflect.Method");
        boolean bl2 = false;
        o2.o(0);
        o2.c(string);
        o2.d("java.lang.Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;");
        boolean bl3 = true;
        o2.o(1);
        for (j j2 : arrayList) {
            e.a(o2, j2.a, j2.b, j2.d, j2.c, 1, 0);
        }
        o2.n(0);
        o2.g(string, "_methods_", "[Ljava/lang/reflect/Method;");
        o2.a(-1);
        o2.g(string, "serialVersionUID", "J");
        o2.j(177);
        as2.a(o2.e());
        p2.a(as2);
    }

    private static void a(o o2, String string, String string2, int n2, String string3, int n3, int n4) {
        String string4 = p.class.getName();
        String string5 = "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/reflect/Method;)V";
        o2.n(n3);
        o2.c(string);
        if (string2 == null) {
            o2.j(1);
        } else {
            o2.c(string2);
        }
        o2.p(n2);
        o2.c(string3);
        o2.n(n4);
        o2.d(string4, "find2Methods", string5);
    }

    private static void a(String string, com.growingio.b.a.p p2, Q q2) throws b {
        as as2 = new as(q2, "setHandler", C);
        as2.a(1);
        o o2 = new o(q2, 2, 2);
        o2.n(0);
        o2.n(1);
        o2.f(string, "handler", A);
        o2.j(177);
        as2.a(o2.e());
        p2.a(as2);
    }

    private static void b(String string, com.growingio.b.a.p p2, Q q2) throws b {
        as as2 = new as(q2, "getHandler", E);
        as2.a(1);
        o o2 = new o(q2, 1, 1);
        o2.n(0);
        o2.a(string, "handler", A);
        o2.j(176);
        as2.a(o2.e());
        p2.a(as2);
    }

    private int a(com.growingio.b.a.p p2, Q q2, String string, ArrayList arrayList) throws b {
        String string2 = e.a("_d", this.j);
        Iterator iterator = this.j.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            String string3 = (String)entry.getKey();
            Method method = (Method)entry.getValue();
            if ((com.growingio.b.a.p.v < 49 || !e.a(method)) && this.a(this.l, n2)) {
                this.a(string, method, string2, n2, e.a(string3, method), p2, q2, arrayList);
            }
            ++n2;
        }
        return n2;
    }

    private static boolean a(Method method) {
        return method.isBridge();
    }

    private void a(String string, Method method, String string2, int n2, String string3, com.growingio.b.a.p p2, Q q2, ArrayList arrayList) throws b {
        as as2;
        Class class_ = method.getDeclaringClass();
        String string4 = string2 + n2 + method.getName();
        if (Modifier.isAbstract(method.getModifiers())) {
            string4 = null;
        } else {
            as2 = e.a(method, string3, q2, class_, string4);
            as2.a(as2.f() & -65);
            p2.a(as2);
        }
        as2 = e.a(string, method, string3, q2, class_, string4, n2, arrayList);
        p2.a(as2);
    }

    private void a(String string, com.growingio.b.a.p p2, Q q2, String string2) throws b {
        Constructor[] arrconstructor = r.b(this.f);
        boolean bl2 = !this.q;
        for (int i2 = 0; i2 < arrconstructor.length; ++i2) {
            Constructor constructor = arrconstructor[i2];
            int n2 = constructor.getModifiers();
            if (Modifier.isFinal(n2) || Modifier.isPrivate(n2) || !e.a(n2, this.n, constructor)) continue;
            as as2 = e.a(string, constructor, q2, this.f, bl2);
            p2.a(as2);
        }
    }

    private static String a(String string, List list) {
        if (e.a(string, list.iterator())) {
            return string;
        }
        for (int i2 = 100; i2 < 999; ++i2) {
            String string2 = string + i2;
            if (!e.a(string2, list.iterator())) continue;
            return string2;
        }
        throw new RuntimeException("cannot make a unique method name");
    }

    private static boolean a(String string, Iterator iterator) {
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            String string2 = (String)entry.getKey();
            if (!string2.startsWith(string)) continue;
            return false;
        }
        return true;
    }

    private static boolean a(int n2, String string, Member member) {
        if ((n2 & 2) != 0) {
            return false;
        }
        if ((n2 & 5) != 0) {
            return true;
        }
        String string2 = e.b(string);
        String string3 = e.b(member.getDeclaringClass().getName());
        if (string2 == null) {
            return string3 == null;
        }
        return string2.equals(string3);
    }

    private static String b(String string) {
        int n2 = string.lastIndexOf(46);
        if (n2 < 0) {
            return null;
        }
        return string.substring(0, n2);
    }

    private HashMap a(Class class_, Class[] arrclass) {
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            this.a(hashMap, arrclass[i2], hashSet);
        }
        this.a(hashMap, class_, hashSet);
        return hashMap;
    }

    private void a(HashMap hashMap, Class class_, Set set) {
        if (!set.add(class_)) {
            return;
        }
        Class<?>[] arrclass = class_.getInterfaces();
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            this.a(hashMap, arrclass[i2], set);
        }
        Class class_2 = class_.getSuperclass();
        if (class_2 != null) {
            this.a(hashMap, class_2, set);
        }
        Method[] arrmethod = r.a(class_);
        for (int i3 = 0; i3 < arrmethod.length; ++i3) {
            Method method;
            if (Modifier.isPrivate(arrmethod[i3].getModifiers())) continue;
            Method method2 = arrmethod[i3];
            String string = method2.getName() + ':' + p.a(method2);
            if (string.startsWith("getHandler:()")) {
                this.k = true;
            }
            if (null != (method = hashMap.put(string, method2)) && e.a(method2) && !Modifier.isPublic(method.getDeclaringClass().getModifiers()) && !Modifier.isAbstract(method.getModifiers()) && !e.a(i3, arrmethod)) {
                hashMap.put(string, method);
            }
            if (null == method || !Modifier.isPublic(method.getModifiers()) || Modifier.isPublic(method2.getModifiers())) continue;
            hashMap.put(string, method);
        }
    }

    private static boolean a(int n2, Method[] arrmethod) {
        String string = arrmethod[n2].getName();
        for (int i2 = 0; i2 < arrmethod.length; ++i2) {
            if (i2 == n2 || !string.equals(arrmethod[i2].getName())) continue;
            return true;
        }
        return false;
    }

    private static String a(String string, Method method) {
        return string.substring(string.indexOf(58) + 1);
    }

    private static as a(String string, Constructor constructor, Q q2, Class class_, boolean bl2) {
        String string2 = p.a(constructor.getParameterTypes(), Void.TYPE);
        as as2 = new as(q2, "<init>", string2);
        as2.a(1);
        e.a(as2, q2, constructor.getExceptionTypes());
        o o2 = new o(q2, 0, 0);
        if (bl2) {
            o2.n(0);
            o2.b(string, "default_interceptor", A);
            o2.f(string, "handler", A);
            o2.b(string, "default_interceptor", A);
            o2.j(199);
            o2.m(10);
        }
        o2.n(0);
        o2.b("RuntimeSupport", "default_interceptor", A);
        o2.f(string, "handler", A);
        int n2 = o2.j();
        o2.n(0);
        int n3 = e.a(o2, (Class[])constructor.getParameterTypes(), 1);
        o2.c(class_.getName(), "<init>", string2);
        o2.j(177);
        o2.e(n3 + 1);
        y y2 = o2.e();
        as2.a(y2);
        bk bk2 = new bk(32);
        bk2.a(n2);
        y2.a(bk2.a(q2));
        return as2;
    }

    private static as a(Method method, String string, Q q2, Class class_, String string2) {
        as as2 = new as(q2, string2, string);
        as2.a(17 | method.getModifiers() & -1319);
        e.a(as2, q2, method);
        o o2 = new o(q2, 0, 0);
        o2.n(0);
        int n2 = e.a(o2, (Class[])method.getParameterTypes(), 1);
        o2.a(class_.isInterface(), q2.a(class_.getName()), method.getName(), string);
        e.a(o2, method.getReturnType());
        o2.e(++n2);
        as2.a(o2.e());
        return as2;
    }

    private static as a(String string, Method method, String string2, Q q2, Class class_, String string3, int n2, ArrayList arrayList) {
        as as2 = new as(q2, method.getName(), string2);
        as2.a(16 | method.getModifiers() & -1313);
        e.a(as2, q2, method);
        int n3 = T.i(string2);
        o o2 = new o(q2, 0, n3 + 2);
        int n4 = n2 * 2;
        int n5 = n2 * 2 + 1;
        int n6 = n3 + 1;
        o2.b(string, "_methods_", "[Ljava/lang/reflect/Method;");
        o2.o(n6);
        arrayList.add(new j(method.getName(), string3, string2, n4));
        o2.n(0);
        o2.a(string, "handler", A);
        o2.n(0);
        o2.n(n6);
        o2.p(n4);
        o2.j(50);
        o2.n(n6);
        o2.p(n5);
        o2.j(50);
        e.a(o2, method.getParameterTypes());
        o2.a(c.class.getName(), "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", 5);
        Class class_2 = method.getReturnType();
        e.b(o2, class_2);
        e.a(o2, class_2);
        y y2 = o2.e();
        as2.a(y2);
        return as2;
    }

    private static void a(as as2, Q q2, Method method) {
        Class[] arrclass = method.getExceptionTypes();
        e.a(as2, q2, arrclass);
    }

    private static void a(as as2, Q q2, Class[] arrclass) {
        if (arrclass.length == 0) {
            return;
        }
        String[] arrstring = new String[arrclass.length];
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            arrstring[i2] = arrclass[i2].getName();
        }
        ab ab2 = new ab(q2);
        ab2.a(arrstring);
        as2.a(ab2);
    }

    private static int a(o o2, Class[] arrclass, int n2) {
        int n3 = 0;
        int n4 = arrclass.length;
        for (int i2 = 0; i2 < n4; ++i2) {
            n3 += e.a(o2, n3 + n2, arrclass[i2]);
        }
        return n3;
    }

    private static int a(o o2, int n2, Class class_) {
        if (class_.isPrimitive()) {
            if (class_ == Long.TYPE) {
                o2.s(n2);
                return 2;
            }
            if (class_ == Float.TYPE) {
                o2.w(n2);
            } else {
                if (class_ == Double.TYPE) {
                    o2.u(n2);
                    return 2;
                }
                o2.q(n2);
            }
        } else {
            o2.n(n2);
        }
        return 1;
    }

    private static int a(o o2, Class class_) {
        if (class_.isPrimitive()) {
            if (class_ == Long.TYPE) {
                o2.j(173);
                return 2;
            }
            if (class_ == Float.TYPE) {
                o2.j(174);
            } else {
                if (class_ == Double.TYPE) {
                    o2.j(175);
                    return 2;
                }
                if (class_ == Void.TYPE) {
                    o2.j(177);
                    return 0;
                }
                o2.j(172);
            }
        } else {
            o2.j(176);
        }
        return 1;
    }

    private static void a(o o2, Class[] arrclass) {
        int n2 = 1;
        int n3 = arrclass.length;
        o2.p(n3);
        o2.e("java/lang/Object");
        for (int i2 = 0; i2 < n3; ++i2) {
            o2.j(89);
            o2.p(i2);
            Class class_ = arrclass[i2];
            if (class_.isPrimitive()) {
                n2 = e.a(o2, class_, n2);
            } else {
                o2.n(n2);
                ++n2;
            }
            o2.j(83);
        }
    }

    private static int a(o o2, Class class_, int n2) {
        int n3 = a.a(class_);
        String string = a.b[n3];
        o2.d(string);
        o2.j(89);
        e.a(o2, n2, class_);
        o2.c(string, "<init>", a.c[n3]);
        return n2 + a.f[n3];
    }

    private static void b(o o2, Class class_) {
        if (class_.isPrimitive()) {
            if (class_ == Void.TYPE) {
                o2.j(87);
            } else {
                int n2 = a.a(class_);
                String string = a.b[n2];
                o2.a(string);
                o2.e(string, a.d[n2], a.e[n2]);
            }
        } else {
            o2.a(class_.getName());
        }
    }

    private static as a(Q q2) {
        as as2 = new as(q2, "writeReplace", "()Ljava/lang/Object;");
        String[] arrstring = new String[]{"java.io.ObjectStreamException"};
        ab ab2 = new ab(q2);
        ab2.a(arrstring);
        as2.a(ab2);
        o o2 = new o(q2, 0, 1);
        o2.n(0);
        o2.d("RuntimeSupport", "makeSerializedProxy", "(Ljava/lang/Object;)Ljavassist/util/proxy/SerializedProxy;");
        o2.j(176);
        as2.a(o2.e());
        return as2;
    }
}

