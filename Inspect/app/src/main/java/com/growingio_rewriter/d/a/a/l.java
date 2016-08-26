/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.a.m;
import com.growingio.d.a.d.A;
import com.growingio.d.a.d.a;
import com.growingio.d.a.d.i;
import com.growingio.d.a.d.k;
import com.growingio.d.a.d.n;
import com.growingio.d.a.d.o;
import com.growingio.d.a.d.s;
import com.growingio.d.a.d.v;
import com.growingio.d.a.d.z;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.t;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class l
extends v
implements t {
    private static final boolean dm = false;
    private final Map<o, BitSet> dn = new HashMap<o, BitSet>();
    private final BitSet do = new BitSet();
    final BitSet a = new BitSet();

    public l(r r2, int n2, String string, String string2, String string3, String[] arrstring) {
        this(327680, r2, n2, string, string2, string3, arrstring);
        if (this.getClass() != l.class) {
            throw new IllegalStateException();
        }
    }

    protected l(int n2, r r2, int n3, String string, String string2, String string3, String[] arrstring) {
        super(n2, n3, string, string2, string3, arrstring);
        this.n_ = r2;
    }

    @Override
    public void a(int n2, p p2) {
        super.a(n2, p2);
        o o2 = ((n)this.bm_.c()).w;
        if (n2 == 168 && !this.dn.containsKey(o2)) {
            this.dn.put(o2, new BitSet());
        }
    }

    @Override
    public void b() {
        if (!this.dn.isEmpty()) {
            this.d();
            this.e();
        }
        if (this.n_ != null) {
            this.a(this.n_);
        }
    }

    private void d() {
        BitSet bitSet = new BitSet();
        this.a(this.do, 0, bitSet);
        for (Map.Entry<o, BitSet> entry : this.dn.entrySet()) {
            o o2 = entry.getKey();
            BitSet bitSet2 = entry.getValue();
            int n2 = this.bm_.b(o2);
            this.a(bitSet2, n2, bitSet);
        }
    }

    private void a(BitSet bitSet, int n2, BitSet bitSet2) {
        this.b(bitSet, n2, bitSet2);
        boolean bl2 = true;
        while (bl2) {
            bl2 = false;
            for (A a2 : this.bn_) {
                int n3 = this.bm_.b(a2.c);
                if (bitSet.get(n3)) continue;
                int n4 = this.bm_.b(a2.a);
                int n5 = this.bm_.b(a2.b);
                int n6 = bitSet.nextSetBit(n4);
                if (n6 == -1 || n6 >= n5) continue;
                this.b(bitSet, n3, bitSet2);
                bl2 = true;
            }
        }
    }

    private void b(BitSet bitSet, int n2, BitSet bitSet2) {
        do {
            o o2;
            int n3;
            int n4;
            a a2 = this.bm_.a(n2);
            if (bitSet.get(n2)) {
                return;
            }
            bitSet.set(n2);
            if (bitSet2.get(n2)) {
                this.a.set(n2);
            }
            bitSet2.set(n2);
            if (a2.b() == 7 && a2.a() != 168) {
                n n5 = (n)a2;
                n4 = this.bm_.b(n5.w);
                this.b(bitSet, n4, bitSet2);
            }
            if (a2.b() == 11) {
                z z2 = (z)a2;
                n4 = this.bm_.b(z2.y);
                this.b(bitSet, n4, bitSet2);
                for (n3 = z2.z.size() - 1; n3 >= 0; --n3) {
                    o2 = z2.z.get(n3);
                    n4 = this.bm_.b(o2);
                    this.b(bitSet, n4, bitSet2);
                }
            }
            if (a2.b() == 12) {
                com.growingio.d.a.d.t t2 = (com.growingio.d.a.d.t)a2;
                n4 = this.bm_.b(t2.w);
                this.b(bitSet, n4, bitSet2);
                for (n3 = t2.y.size() - 1; n3 >= 0; --n3) {
                    o2 = t2.y.get(n3);
                    n4 = this.bm_.b(o2);
                    this.b(bitSet, n4, bitSet2);
                }
            }
            switch (this.bm_.a(n2).a()) {
                case 167: 
                case 169: 
                case 170: 
                case 171: 
                case 172: 
                case 173: 
                case 174: 
                case 175: 
                case 176: 
                case 177: 
                case 191: {
                    return;
                }
            }
        } while (++n2 < this.bm_.a());
    }

    private void e() {
        LinkedList<m> linkedList = new LinkedList<m>();
        linkedList.add(new m(this, null, this.do));
        i i2 = new i();
        ArrayList<A> arrayList = new ArrayList<A>();
        ArrayList<s> arrayList2 = new ArrayList<s>();
        while (!linkedList.isEmpty()) {
            m m2 = (m)linkedList.removeFirst();
            this.a(m2, linkedList, i2, arrayList, arrayList2);
        }
        this.bm_ = i2;
        this.bn_ = arrayList;
        this.bq_ = arrayList2;
    }

    private void a(m m2, List<m> list, i i2, List<A> list2, List<s> list3) {
        o o2;
        a a2;
        Object object;
        Object object2 = null;
        int n2 = this.bm_.a();
        for (int i3 = 0; i3 < n2; ++i3) {
            Object object3;
            a2 = this.bm_.a(i3);
            object = m2.a(i3);
            if (a2.b() == 8) {
                o2 = (o)a2;
                object3 = m2.b(o2);
                if (object3 == object2) continue;
                i2.c((a)object3);
                object2 = object3;
                continue;
            }
            if (object != m2) continue;
            if (a2.a() == 169) {
                o2 = null;
                object3 = m2;
                while (object3 != null) {
                    if (object3.b.get(i3)) {
                        o2 = object3.d;
                    }
                    object3 = object3.a;
                }
                if (o2 == null) {
                    throw new RuntimeException("Instruction #" + i3 + " is a RET not owned by any subroutine");
                }
                i2.c(new n(167, o2));
                continue;
            }
            if (a2.a() == 168) {
                o2 = ((n)a2).w;
                object3 = this.dn.get(o2);
                m m3 = new m(this, m2, (BitSet)object3);
                o o3 = m3.a(o2);
                i2.c(new k(1));
                i2.c(new n(167, o3));
                i2.c(m3.d);
                list.add(m3);
                continue;
            }
            i2.c(a2.a(m2));
        }
        for (A a3 : this.bn_) {
            a2 = m2.b(a3.a);
            if (a2 == (object = m2.b(a3.b))) continue;
            o2 = m2.a(a3.c);
            if (a2 == null || object == null || o2 == null) {
                throw new RuntimeException("Internal error!");
            }
            list2.add(new A((o)a2, (o)object, o2, a3.d));
        }
        for (s s2 : this.bq_) {
            a2 = m2.b(s2.d);
            if (a2 == (object = m2.b(s2.e))) continue;
            list3.add(new s(s2.a, s2.b, s2.c, (o)a2, (o)object, s2.f));
        }
    }

    private static void a(String string) {
        System.err.println(string);
    }
}

