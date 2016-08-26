/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.aB;
import com.growingio.b.a.aC;
import com.growingio.b.a.aD;
import com.growingio.b.a.aE;
import com.growingio.b.a.aF;
import com.growingio.b.a.aG;
import com.growingio.b.a.aH;
import com.growingio.b.a.aJ;
import com.growingio.b.a.aK;
import com.growingio.b.a.aL;
import com.growingio.b.a.aM;
import com.growingio.b.a.aN;
import com.growingio.b.a.h;
import com.growingio.b.a.i;
import com.growingio.b.a.l;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class aA
extends h {
    public static final String a = "Signature";

    aA(Q q2, int n2, DataInputStream dataInputStream) throws IOException {
        super(q2, n2, dataInputStream);
    }

    public aA(Q q2, String string) {
        super(q2, "Signature");
        int n2 = q2.c(string);
        byte[] arrby = new byte[]{(byte)(n2 >>> 8), (byte)n2};
        this.a(arrby);
    }

    public String a() {
        return this.d().E(l.a(this.f(), 0));
    }

    public void a(String string) {
        int n2 = this.d().c(string);
        l.a(n2, this.e, 0);
    }

    @Override
    public h a(Q q2, Map map) {
        return new aA(q2, this.a());
    }

    @Override
    void a(String string, String string2) {
        String string3 = aA.a(this.a(), string, string2);
        this.a(string3);
    }

    @Override
    void a(Map map) {
        String string = aA.a(this.a(), map);
        this.a(string);
    }

    static String a(String string, String string2, String string3) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(string2, string3);
        return aA.a(string, hashMap);
    }

    static String a(String string, Map map) {
        int n2;
        if (map == null) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = 0;
        int n4 = 0;
        while ((n2 = string.indexOf(76, n4)) >= 0) {
            char c2;
            StringBuilder stringBuilder2 = new StringBuilder();
            int n5 = n2;
            try {
                while ((c2 = string.charAt(++n5)) != ';') {
                    stringBuilder2.append(c2);
                    if (c2 != '<') continue;
                    while ((c2 = string.charAt(++n5)) != '>') {
                        stringBuilder2.append(c2);
                    }
                    stringBuilder2.append(c2);
                }
            }
            catch (IndexOutOfBoundsException var9_10) {
                break;
            }
            n4 = n5 + 1;
            String string2 = stringBuilder2.toString();
            String string3 = (String)map.get(string2);
            if (string3 == null) continue;
            stringBuilder.append(string.substring(n3, n2));
            stringBuilder.append('L');
            stringBuilder.append(string3);
            stringBuilder.append(c2);
            n3 = n4;
        }
        if (n3 == 0) {
            return string;
        }
        n2 = string.length();
        if (n3 < n2) {
            stringBuilder.append(string.substring(n3, n2));
        }
        return stringBuilder.toString();
    }

    private static boolean a(int n2) {
        return n2 != 59 && n2 != 60;
    }

    public static aE b(String string) throws i {
        try {
            return aA.g(string);
        }
        catch (IndexOutOfBoundsException var1_1) {
            throw aA.i(string);
        }
    }

    public static aH c(String string) throws i {
        try {
            return aA.h(string);
        }
        catch (IndexOutOfBoundsException var1_1) {
            throw aA.i(string);
        }
    }

    public static aJ d(String string) throws i {
        try {
            return aA.a(string, new aG(null), false);
        }
        catch (IndexOutOfBoundsException var1_1) {
            throw aA.i(string);
        }
    }

    public static aK e(String string) throws i {
        try {
            return aA.e(string, new aG(null));
        }
        catch (IndexOutOfBoundsException var1_1) {
            throw aA.i(string);
        }
    }

    private static aE g(String string) throws i, IndexOutOfBoundsException {
        aG aG2 = new aG(null);
        aM[] arraM = aA.a(string, aG2);
        aF aF2 = aA.b(string, aG2);
        int n2 = string.length();
        ArrayList<aF> arrayList = new ArrayList<aF>();
        while (aG2.a < n2 && string.charAt(aG2.a) == 'L') {
            arrayList.add(aA.b(string, aG2));
        }
        aF[] arraF = arrayList.toArray(new aF[arrayList.size()]);
        return new aE(arraM, aF2, arraF);
    }

    private static aH h(String string) throws i {
        aK aK2;
        Object object;
        aG aG2 = new aG(null);
        aM[] arraM = aA.a(string, aG2);
        if (string.charAt(aG2.a++) != '(') {
            throw aA.i(string);
        }
        ArrayList<aK> arrayList = new ArrayList<aK>();
        while (string.charAt(aG2.a) != ')') {
            aK2 = aA.e(string, aG2);
            arrayList.add(aK2);
        }
        ++aG2.a;
        aK2 = aA.e(string, aG2);
        int n2 = string.length();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        while (aG2.a < n2 && string.charAt(aG2.a) == '^') {
            ++aG2.a;
            object = aA.a(string, aG2, false);
            if (object instanceof aC) {
                throw aA.i(string);
            }
            arrayList2.add(object);
        }
        object = arrayList.toArray(new aK[arrayList.size()]);
        aJ[] arraJ = arrayList2.toArray(new aJ[arrayList2.size()]);
        return new aH(arraM, (aK[])object, aK2, arraJ);
    }

    private static aM[] a(String string, aG aG2) throws i {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (string.charAt(aG2.a) == '<') {
            ++aG2.a;
            while (string.charAt(aG2.a) != '>') {
                Object object;
                int n2 = aG2.a;
                int n3 = aG2.a(string, 58);
                aJ aJ2 = aA.a(string, aG2, true);
                ArrayList<aJ> arrayList2 = new ArrayList<aJ>();
                while (string.charAt(aG2.a) == ':') {
                    ++aG2.a;
                    object = aA.a(string, aG2, false);
                    arrayList2.add((aJ)object);
                }
                object = new aM(string, n2, n3, aJ2, arrayList2.toArray(new aJ[arrayList2.size()]));
                arrayList.add(object);
            }
            ++aG2.a;
        }
        return arrayList.toArray(new aM[arrayList.size()]);
    }

    private static aJ a(String string, aG aG2, boolean bl2) throws i {
        int n2 = aG2.a;
        switch (string.charAt(n2)) {
            case 'L': {
                return aA.a(string, aG2, null);
            }
            case 'T': {
                int n3 = aG2.a(string, 59);
                return new aN(string, n2 + 1, n3);
            }
            case '[': {
                return aA.d(string, aG2);
            }
        }
        if (bl2) {
            return null;
        }
        throw aA.i(string);
    }

    private static aF b(String string, aG aG2) throws i {
        if (string.charAt(aG2.a) == 'L') {
            return aA.a(string, aG2, null);
        }
        throw aA.i(string);
    }

    private static aF a(String string, aG aG2, aF aF2) throws i {
        char c2;
        aL[] arraL;
        int n2 = ++aG2.a;
        while ((c2 = string.charAt(aG2.a++)) != '$' && c2 != '<' && c2 != ';') {
        }
        int n3 = aG2.a - 1;
        if (c2 == '<') {
            arraL = aA.c(string, aG2);
            c2 = string.charAt(aG2.a++);
        } else {
            arraL = null;
        }
        aF aF3 = aF.a(string, n2, n3, arraL, aF2);
        if (c2 == '$' || c2 == '.') {
            --aG2.a;
            return aA.a(string, aG2, aF3);
        }
        return aF3;
    }

    private static aL[] c(String string, aG aG2) throws i {
        char c2;
        ArrayList<aL> arrayList = new ArrayList<aL>();
        while ((c2 = string.charAt(aG2.a++)) != '>') {
            aL aL2;
            if (c2 == '*') {
                aL2 = new aL(null, '*');
            } else {
                if (c2 != '+' && c2 != '-') {
                    c2 = ' ';
                    --aG2.a;
                }
                aL2 = new aL(aA.a(string, aG2, false), c2);
            }
            arrayList.add(aL2);
        }
        return arrayList.toArray(new aL[arrayList.size()]);
    }

    private static aJ d(String string, aG aG2) throws i {
        int n2 = 1;
        while (string.charAt(++aG2.a) == '[') {
            ++n2;
        }
        return new aC(n2, aA.e(string, aG2));
    }

    private static aK e(String string, aG aG2) throws i {
        aK aK2 = aA.a(string, aG2, true);
        if (aK2 == null) {
            aK2 = new aD(string.charAt(aG2.a++));
        }
        return aK2;
    }

    private static i i(String string) {
        return new i("bad signature: " + string);
    }

    static /* synthetic */ i f(String string) {
        return aA.i(string);
    }
}

