/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.ec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

final class eb {
    private static int a = 2;
    private static int b = 6;
    private static int c = 6;
    private static int d = -40;
    private static int e = 4;
    private b f;

    eb() {
        this(new b());
    }

    eb(b b2) {
        this.f = b2;
    }

    double a(c c2, c c3) {
        Map map = c2.a(false);
        Map map2 = c3.a(false);
        HashSet<a> hashSet = new HashSet<a>();
        int n2 = 0;
        double d2 = 0.0;
        double d3 = 0.0;
        int n3 = 0;
        int n4 = 0;
        for (Map.Entry entry2 : map.entrySet()) {
            a a2 = (a)entry2.getValue();
            a a3 = (a)map2.get(entry2.getKey());
            n3 += a2.c();
            if (null == a3) {
                hashSet.add(a2);
                continue;
            }
            ++n2;
            double d4 = this.b(a2.c(), a3.c());
            d3 += d4;
            d2 += d4 * this.a(a2.c(), a3.c());
        }
        if (n2 == 0) {
            return 0.0;
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            n3 += ((a)entry2.getValue()).c();
            if (map.containsKey(entry2.getKey())) continue;
            hashSet.add((a)entry2.getValue());
        }
        int n5 = c2.c().size() + c3.c().size() - n4;
        double d5 = 0.0;
        int n6 = Math.max(this.f.d(), (int)((double)(n3 /= n5) + 1.2));
        for (a a4 : hashSet) {
            if (a4.c() <= n6) continue;
            d5 += 1.0;
        }
        double d6 = d5 / (d5 + (double)(n2 * 2));
        return d2 / d3 * (1.0 - Math.pow(d6, e));
    }

    double a(c c2, List list) {
        double d2 = 0.0;
        for (c c3 : list) {
            double d3 = this.a(c3, c2);
            d2 = Math.max(d3, d2);
        }
        return d2;
    }

    double a(List list, List list2) {
        if (list.isEmpty() || list2.isEmpty()) {
            return 0.0;
        }
        LinkedList linkedList = new LinkedList();
        this.b(list, list2, linkedList);
        double d2 = 0.0;
        int n2 = 0;
        for (d d3 : linkedList) {
            if (d3.a == null || d3.b == null) continue;
            d2 += d3.c;
            ++n2;
        }
        return d2 / (double)n2;
    }

    c b(c c2, c c3) {
        Map map = c2.a(false);
        Map map2 = c3.a(false);
        TreeMap<Double, a> treeMap = new TreeMap<Double, a>();
        c c4 = new c();
        c4.a(c3.b());
        c4.a(c3.a());
        LinkedList<a> linkedList = new LinkedList<a>();
        c4.a(linkedList);
        for (Map.Entry entry22 : map.entrySet()) {
            a a2 = (a)entry22.getValue();
            a a3 = (a)map2.get(entry22.getKey());
            if (null == a3) {
                double d2 = - a2.c();
                while (treeMap.containsKey(d2)) {
                    d2 += 1.0E-4;
                }
                treeMap.put(d2, a2);
                continue;
            }
            a a4 = new a(this, a3.a(), a3.b(), (byte)((a3.c() + a2.c()) / 2), a3.d(), a3.e());
            linkedList.add(a4);
        }
        for (Map.Entry entry22 : map2.entrySet()) {
            if (map.containsKey(entry22.getKey())) continue;
            double d3 = - ((a)entry22.getValue()).c();
            while (treeMap.containsKey(d3)) {
                d3 += 1.0E-4;
            }
            treeMap.put(d3, (a)entry22.getValue());
        }
        for (Map.Entry entry22 : treeMap.entrySet()) {
            byte by2 = (byte)(- ((Double)entry22.getKey()).doubleValue());
            if (linkedList.size() >= this.f.c() || by2 < this.f.d()) break;
            linkedList.add((a)entry22.getValue());
        }
        return c4;
    }

    double a(List list, List list2, List list3) {
        if (list.isEmpty() || list2.isEmpty()) {
            list3.addAll(list);
            list3.addAll(list2);
            return 0.0;
        }
        LinkedList linkedList = new LinkedList();
        this.b(list, list2, linkedList);
        double d2 = 0.0;
        int n2 = 0;
        for (d d3 : linkedList) {
            if (d3.a != null && d3.b != null) {
                d2 += d3.c;
                ++n2;
                list3.add(this.b(d3.a, d3.b));
                continue;
            }
            if (list3.size() >= this.f.b()) continue;
            list3.add(d3.a == null ? d3.b.d() : d3.a.d());
        }
        return d2 / (double)n2;
    }

    double a(int n2, int n3) {
        if (n2 >= 0 || n3 >= 0) {
            return 0.0;
        }
        double d2 = (n2 + n3) / 2;
        double d3 = Math.abs((double)n2 - d2);
        d3 = d3 > (double)a ? d3 - (double)a : 0.0;
        return Math.pow((d2 + d3) / d2, b);
    }

    void b(List list, List list2, List list3) {
        ArrayList<d> arrayList = new ArrayList<d>();
        HashSet<c> hashSet = new HashSet<c>();
        HashSet<c> hashSet2 = new HashSet<c>();
        for (Iterator iterator : list) {
            for (c c2 : list2) {
                hashSet2.add(c2);
                double d2 = this.a((c)((Object)iterator), c2);
                arrayList.add(new d((c)((Object)iterator), c2, d2));
            }
            hashSet.add((c)((Object)iterator));
        }
        ec ec2 = new ec(this);
        Collections.sort(arrayList, ec2);
        list3.clear();
        for (d d3 : arrayList) {
            if (!hashSet.contains(d3.a) || !hashSet2.contains(d3.b)) continue;
            hashSet.remove(d3.a);
            hashSet2.remove(d3.b);
            list3.add(d3);
        }
        for (c c3 : hashSet) {
            list3.add(new d(c3, null, 0.0));
        }
        for (c c4 : hashSet2) {
            list3.add(new d(null, c4, 0.0));
        }
    }

    double b(int n2, int n3) {
        if (n2 >= 0 || n3 >= 0) {
            return 0.0;
        }
        double d2 = Math.max(n2, n3);
        return d2 >= (double)d ? 1.0 : Math.pow((d2 + 128.0) / (double)(d + 128), c);
    }

    class c {
        private int b;
        private long c;
        private List d;
        private Map e;

        c() {
        }

        int a() {
            return this.b;
        }

        void a(int n2) {
            this.b = n2;
        }

        long b() {
            return this.c;
        }

        void a(long l2) {
            this.c = l2;
        }

        List c() {
            return this.d;
        }

        void a(List list) {
            this.d = list;
        }

        Map a(boolean bl2) {
            if (null == this.e || bl2) {
                this.e = new HashMap();
                for (a a2 : this.d) {
                    this.e.put(a2.b(), a2);
                }
            }
            return this.e;
        }

        c d() {
            c c2 = new c();
            c2.a(this.b);
            c2.a(this.c);
            LinkedList<a> linkedList = new LinkedList<a>();
            for (a a2 : this.d) {
                linkedList.add(a2.f());
            }
            c2.a(linkedList);
            return c2;
        }
    }

    static class b {
        static final int a = 10;
        static final int b = 3;
        static final int c = 50;
        static final int d = -85;
        private int e = 10;
        private int f = 3;
        private int g = 50;
        private int h = -85;

        b() {
        }

        int a() {
            return this.e;
        }

        void a(int n2) {
            this.e = n2;
        }

        int b() {
            return this.f;
        }

        void b(int n2) {
            this.f = n2;
        }

        int c() {
            return this.g;
        }

        void c(int n2) {
            this.g = n2;
        }

        int d() {
            return this.h;
        }

        void d(int n2) {
            this.h = n2;
        }
    }

    class a {
        private String b;
        private String c;
        private byte d;
        private byte e;
        private byte f;
        final /* synthetic */ eb a;

        a(eb eb2) {
            this.a = eb2;
            this.b = "";
            this.c = "00:00:00:00:00:00";
            this.d = -127;
            this.e = 1;
            this.f = 1;
        }

        a(eb eb2, String string, String string2, byte by2, byte by3, byte by4) {
            this.a = eb2;
            this.b = string;
            this.c = string2;
            this.d = by2;
            this.e = by3;
            this.f = by4;
        }

        String a() {
            return this.b;
        }

        void a(String string) {
            this.b = string;
        }

        String b() {
            return this.c;
        }

        void b(String string) {
            this.c = string;
        }

        byte c() {
            return this.d;
        }

        void a(byte by2) {
            this.d = by2;
        }

        byte d() {
            return this.e;
        }

        void b(byte by2) {
            this.e = by2;
        }

        byte e() {
            return this.f;
        }

        void c(byte by2) {
            this.f = by2;
        }

        a f() {
            return new a(this.a, this.b, this.c, this.d, this.e, this.f);
        }
    }

    class e {
        Object a;
        Object b;

        e(Object object, Object object2) {
            this.a = object;
            this.b = object2;
        }
    }

    class d {
        c a;
        c b;
        double c;

        d(c c2, c c3, double d2) {
            this.a = c2;
            this.b = c3;
            this.c = d2;
        }
    }

}

