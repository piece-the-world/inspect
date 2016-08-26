/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.a.T;
import com.growingio.b.a.as;
import com.growingio.b.a.p;
import com.growingio.b.ad;
import com.growingio.b.ae;
import com.growingio.b.b.a.a;
import com.growingio.b.b.a.b;
import com.growingio.b.b.a.i;
import com.growingio.b.b.a.v;
import com.growingio.b.b.e;
import com.growingio.b.b.s;
import com.growingio.b.b.t;
import com.growingio.b.b.z;
import com.growingio.b.g;
import com.growingio.b.o;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

public class r
implements z {
    private g a;
    private static final int b = 0;
    private static final int c = -1;
    private static final String d = "<invalid>";
    private static WeakHashMap e = new WeakHashMap();
    private Hashtable aR = null;

    public r(g g2) {
        this.a = g2;
    }

    public g a() {
        return this.a;
    }

    private static void c() throws e {
        throw new e("fatal");
    }

    public s a(o o2, o o3, as as2, String string, int[] arrn, int[] arrn2, String[] arrstring) throws e {
        int n2;
        s s2;
        s s3 = null;
        if (as2 != null && o2 == o3 && as2.a().equals(string) && (n2 = this.a(as2.g(), arrn, arrn2, arrstring)) != -1) {
            s s4 = new s(o2, as2, n2);
            if (n2 == 0) {
                return s4;
            }
            s3 = s4;
        }
        if ((s2 = this.a(o2, string, arrn, arrn2, arrstring, s3 != null)) != null) {
            return s2;
        }
        return s3;
    }

    private s a(o o2, String string, int[] arrn, int[] arrn2, String[] arrstring, boolean bl2) throws e {
        int o4;
        s s2;
        int n2;
        Object n5;
        s s3 = null;
        p p2 = o2.j();
        if (p2 != null) {
            List list = p2.n();
            n2 = list.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                n5 = (as)list.get(i2);
                if (!n5.a().equals(string) || (n5.f() & 64) != 0 || (o4 = this.a(n5.g(), arrn, arrn2, arrstring)) == -1) continue;
                s2 = new s(o2, (as)n5, o4);
                if (o4 == 0) {
                    return s2;
                }
                if (s3 != null && s3.c <= o4) continue;
                s3 = s2;
            }
        }
        if (bl2) {
            s3 = null;
        } else if (s3 != null) {
            return s3;
        }
        int n4 = o2.c();
        n2 = (int)ad.k(n4) ? 1 : 0;
        try {
            o o3;
            if (n2 == 0 && (o3 = o2.f()) != null && (n5 = this.a(o3, string, arrn, arrn2, arrstring, bl2)) != null) {
                return n5;
            }
        }
        catch (ae var11_14) {
            // empty catch block
        }
        try {
            o o3;
            o[] arro = o2.d();
            int n3 = arro.length;
            for (o4 = 0; o4 < n3; ++o4) {
                s2 = this.a(arro[o4], string, arrn, arrn2, arrstring, bl2);
                if (s2 == null) continue;
                return s2;
            }
            if (n2 != 0 && (o3 = o2.f()) != null && (s2 = this.a(o3, string, arrn, arrn2, arrstring, bl2)) != null) {
                return s2;
            }
        }
        catch (ae var11_16) {
            // empty catch block
        }
        return s3;
    }

    private int a(String string, int[] arrn, int[] arrn2, String[] arrstring) throws e {
        int n2 = 0;
        int n3 = 1;
        int n4 = arrn.length;
        if (n4 != T.f(string)) {
            return -1;
        }
        int n5 = string.length();
        int n6 = 0;
        while (n3 < n5) {
            char c2;
            int n7;
            if ((c2 = string.charAt(n3++)) == ')') {
                return n6 == n4 ? n2 : -1;
            }
            if (n6 >= n4) {
                return -1;
            }
            int n8 = 0;
            while (c2 == '[') {
                ++n8;
                c2 = string.charAt(n3++);
            }
            if (arrn[n6] == 412) {
                if (n8 == 0 && c2 != 'L') {
                    return -1;
                }
                if (c2 == 'L') {
                    n3 = string.indexOf(59, n3) + 1;
                }
            } else if (arrn2[n6] != n8) {
                if (n8 != 0 || c2 != 'L' || !string.startsWith("java/lang/Object;", n3)) {
                    return -1;
                }
                n3 = string.indexOf(59, n3) + 1;
                ++n2;
                if (n3 <= 0) {
                    return -1;
                }
            } else if (c2 == 'L') {
                block23 : {
                    n7 = string.indexOf(59, n3);
                    if (n7 < 0 || arrn[n6] != 307) {
                        return -1;
                    }
                    String string2 = string.substring(n3, n7);
                    if (!string2.equals(arrstring[n6])) {
                        o o2 = this.a(arrstring[n6]);
                        try {
                            if (o2.a(this.a(string2))) {
                                ++n2;
                                break block23;
                            }
                            return -1;
                        }
                        catch (ae var15_16) {
                            ++n2;
                        }
                    }
                }
                n3 = n7 + 1;
            } else {
                int n9;
                n7 = r.a(c2);
                if (n7 != (n9 = arrn[n6])) {
                    if (n7 == 324 && (n9 == 334 || n9 == 303 || n9 == 306)) {
                        ++n2;
                    } else {
                        return -1;
                    }
                }
            }
            ++n6;
        }
        return -1;
    }

    public com.growingio.b.t a(String string, v v2, b b2) throws t {
        String string2 = v2.d();
        o o2 = null;
        try {
            o2 = this.a(r.d(string), true);
        }
        catch (e var6_6) {
            throw new t(string + "/" + string2, b2);
        }
        try {
            return o2.d(string2);
        }
        catch (ae var6_7) {
            string = r.c(o2.s());
            throw new t(string + "$" + string2, b2);
        }
    }

    public com.growingio.b.t a(String string, v v2) throws e {
        return this.b(r.d(string), v2);
    }

    public com.growingio.b.t b(String string, v v2) throws e {
        o o2 = this.a(string, false);
        try {
            return o2.d(v2.d());
        }
        catch (ae var4_4) {
            throw new e("no such field: " + v2.d());
        }
    }

    public o a(a a2) throws e {
        return this.a(i.a(a2, '.'), false);
    }

    public o a(String string) throws e {
        return this.a(r.d(string), false);
    }

    public o a(i i2) throws e {
        return this.a(i2.g(), i2.h(), i2.i());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public o a(int n2, int n3, String string) throws e {
        String string2 = "";
        if (n2 == 307) {
            o o2 = this.a(string);
            if (n3 <= 0) return o2;
            string2 = o2.s();
        } else {
            string2 = r.a(n2);
        }
        while (n3-- > 0) {
            string2 = string2 + "[]";
        }
        return this.a(string2, false);
    }

    static String a(int n2) throws e {
        String string = "";
        switch (n2) {
            case 301: {
                string = "boolean";
                break;
            }
            case 306: {
                string = "char";
                break;
            }
            case 303: {
                string = "byte";
                break;
            }
            case 334: {
                string = "short";
                break;
            }
            case 324: {
                string = "int";
                break;
            }
            case 326: {
                string = "long";
                break;
            }
            case 317: {
                string = "float";
                break;
            }
            case 312: {
                string = "double";
                break;
            }
            case 344: {
                string = "void";
                break;
            }
            default: {
                r.c();
            }
        }
        return string;
    }

    public o a(String string, boolean bl2) throws e {
        Hashtable hashtable = this.d();
        Object v2 = hashtable.get(string);
        if (v2 == "<invalid>") {
            throw new e("no such class: " + string);
        }
        if (v2 != null) {
            try {
                return this.a.f((String)v2);
            }
            catch (ae var5_5) {
                // empty catch block
            }
        }
        o o2 = null;
        try {
            o2 = this.b(string, bl2);
        }
        catch (ae var6_7) {
            o2 = this.e(string);
        }
        hashtable.put(string, o2.s());
        return o2;
    }

    public static int b() {
        return e.size();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Hashtable d() {
        Hashtable hashtable = this.aR;
        if (hashtable != null) return hashtable;
        reference var2_2 = r.class;
        synchronized (r.class) {
            WeakReference weakReference = (WeakReference)e.get(this.a);
            if (weakReference != null) {
                hashtable = (Hashtable)weakReference.get();
            }
            if (hashtable == null) {
                hashtable = new Hashtable();
                e.put(this.a, new WeakReference(hashtable));
            }
            // ** MonitorExit[var2_2] (shouldn't be in output)
            this.aR = hashtable;
            return hashtable;
        }
    }

    private o e(String string) throws e {
        if (string.indexOf(46) < 0) {
            Iterator iterator = this.a.d();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                String string3 = string2 + '.' + string;
                try {
                    return this.a.f(string3);
                }
                catch (ae var5_5) {
                    try {
                        if (!string2.endsWith("." + string)) continue;
                        return this.a.f(string2);
                    }
                    catch (ae var6_6) {
                        continue;
                    }
                }
            }
        }
        this.d().put(string, "<invalid>");
        throw new e("no such class: " + string);
    }

    private o b(String string, boolean bl2) throws ae {
        o o2 = null;
        do {
            try {
                o2 = this.a.f(string);
                continue;
            }
            catch (ae var4_4) {
                int n2 = string.lastIndexOf(46);
                if (bl2 || n2 < 0) {
                    throw var4_4;
                }
                StringBuffer stringBuffer = new StringBuffer(string);
                stringBuffer.setCharAt(n2, '$');
                string = stringBuffer.toString();
            }
        } while (o2 == null);
        return o2;
    }

    public String b(a a2) throws e {
        if (a2 == null) {
            return null;
        }
        return r.c(this.a(a2).s());
    }

    public String b(String string) throws e {
        if (string == null) {
            return null;
        }
        return r.c(this.a(string).s());
    }

    public static o a(o o2) throws e {
        try {
            o o3 = o2.f();
            if (o3 != null) {
                return o3;
            }
        }
        catch (ae var1_2) {
            // empty catch block
        }
        throw new e("cannot find the super class of " + o2.s());
    }

    public static o a(o o2, String string) throws e {
        try {
            o[] arro = o2.d();
            for (int i2 = 0; i2 < arro.length; ++i2) {
                if (!arro[i2].s().equals(string)) continue;
                return arro[i2];
            }
        }
        catch (ae var2_3) {
            // empty catch block
        }
        throw new e("cannot find the super inetrface " + string + " of " + o2.s());
    }

    public static String c(String string) {
        return string.replace('.', '/');
    }

    public static String d(String string) {
        return string.replace('/', '.');
    }

    public static int a(char c2) throws e {
        switch (c2) {
            case 'Z': {
                return 301;
            }
            case 'C': {
                return 306;
            }
            case 'B': {
                return 303;
            }
            case 'S': {
                return 334;
            }
            case 'I': {
                return 324;
            }
            case 'J': {
                return 326;
            }
            case 'F': {
                return 317;
            }
            case 'D': {
                return 312;
            }
            case 'V': {
                return 344;
            }
            case 'L': 
            case '[': {
                return 307;
            }
        }
        r.c();
        return 344;
    }

    public static int c(a a2) {
        int n2 = 0;
        while (a2 != null) {
            com.growingio.b.b.a.o o2 = (com.growingio.b.b.a.o)a2.c();
            a2 = a2.d();
            switch (o2.c()) {
                case 335: {
                    n2 |= 8;
                    break;
                }
                case 315: {
                    n2 |= 16;
                    break;
                }
                case 338: {
                    n2 |= 32;
                    break;
                }
                case 300: {
                    n2 |= 1024;
                    break;
                }
                case 332: {
                    n2 |= 1;
                    break;
                }
                case 331: {
                    n2 |= 4;
                    break;
                }
                case 330: {
                    n2 |= 2;
                    break;
                }
                case 345: {
                    n2 |= 64;
                    break;
                }
                case 342: {
                    n2 |= 128;
                    break;
                }
                case 347: {
                    n2 |= 2048;
                }
            }
        }
        return n2;
    }
}

