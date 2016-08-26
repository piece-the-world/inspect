/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.a.j;
import com.growingio.d.a.m;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.t;
import com.growingio.d.a.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class a
extends j
implements t {
    private static final Object a = new Object();
    private static final Object b = new Object();
    protected int dm;
    protected String dn;
    private boolean c;
    private boolean do;
    private List<Object> dp;
    private Map<p, List<Object>> dq;

    protected a(int n2, r r2, int n3, String string, String string2) {
        super(n2, r2, n3, string, string2);
        this.dm = n3;
        this.dn = string2;
        this.c = "<init>".equals(string);
    }

    @Override
    public void a_() {
        this.n_.a_();
        if (this.c) {
            this.dp = new ArrayList<Object>();
            this.dq = new HashMap<p, List<Object>>();
        } else {
            this.do = true;
            this.a();
        }
    }

    @Override
    public void a(p p2) {
        List<Object> list;
        this.n_.a(p2);
        if (this.c && this.dq != null && (list = this.dq.get(p2)) != null) {
            this.dp = list;
            this.dq.remove(p2);
        }
    }

    @Override
    public void a_(int n2) {
        if (this.c) {
            switch (n2) {
                case 177: {
                    this.a(n2);
                    break;
                }
                case 172: 
                case 174: 
                case 176: 
                case 191: {
                    this.y();
                    this.a(n2);
                    break;
                }
                case 173: 
                case 175: {
                    this.y();
                    this.y();
                    this.a(n2);
                    break;
                }
                case 0: 
                case 47: 
                case 49: 
                case 116: 
                case 117: 
                case 118: 
                case 119: 
                case 134: 
                case 138: 
                case 139: 
                case 143: 
                case 145: 
                case 146: 
                case 147: 
                case 190: {
                    break;
                }
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 11: 
                case 12: 
                case 13: 
                case 133: 
                case 135: 
                case 140: 
                case 141: {
                    this.b(b);
                    break;
                }
                case 9: 
                case 10: 
                case 14: 
                case 15: {
                    this.b(b);
                    this.b(b);
                    break;
                }
                case 46: 
                case 48: 
                case 50: 
                case 51: 
                case 52: 
                case 53: 
                case 87: 
                case 96: 
                case 98: 
                case 100: 
                case 102: 
                case 104: 
                case 106: 
                case 108: 
                case 110: 
                case 112: 
                case 114: 
                case 120: 
                case 121: 
                case 122: 
                case 123: 
                case 124: 
                case 125: 
                case 126: 
                case 128: 
                case 130: 
                case 136: 
                case 137: 
                case 142: 
                case 144: 
                case 149: 
                case 150: 
                case 194: 
                case 195: {
                    this.y();
                    break;
                }
                case 88: 
                case 97: 
                case 99: 
                case 101: 
                case 103: 
                case 105: 
                case 107: 
                case 109: 
                case 111: 
                case 113: 
                case 115: 
                case 127: 
                case 129: 
                case 131: {
                    this.y();
                    this.y();
                    break;
                }
                case 79: 
                case 81: 
                case 83: 
                case 84: 
                case 85: 
                case 86: 
                case 148: 
                case 151: 
                case 152: {
                    this.y();
                    this.y();
                    this.y();
                    break;
                }
                case 80: 
                case 82: {
                    this.y();
                    this.y();
                    this.y();
                    this.y();
                    break;
                }
                case 89: {
                    this.b(this.z());
                    break;
                }
                case 90: {
                    int n3 = this.dp.size();
                    this.dp.add(n3 - 2, this.dp.get(n3 - 1));
                    break;
                }
                case 91: {
                    int n4 = this.dp.size();
                    this.dp.add(n4 - 3, this.dp.get(n4 - 1));
                    break;
                }
                case 92: {
                    int n5 = this.dp.size();
                    this.dp.add(n5 - 2, this.dp.get(n5 - 1));
                    this.dp.add(n5 - 2, this.dp.get(n5 - 1));
                    break;
                }
                case 93: {
                    int n6 = this.dp.size();
                    this.dp.add(n6 - 3, this.dp.get(n6 - 1));
                    this.dp.add(n6 - 3, this.dp.get(n6 - 1));
                    break;
                }
                case 94: {
                    int n7 = this.dp.size();
                    this.dp.add(n7 - 4, this.dp.get(n7 - 1));
                    this.dp.add(n7 - 4, this.dp.get(n7 - 1));
                    break;
                }
                case 95: {
                    int n8 = this.dp.size();
                    this.dp.add(n8 - 2, this.dp.get(n8 - 1));
                    this.dp.remove(n8);
                }
            }
        } else {
            switch (n2) {
                case 172: 
                case 173: 
                case 174: 
                case 175: 
                case 176: 
                case 177: 
                case 191: {
                    this.a(n2);
                }
            }
        }
        this.n_.a_(n2);
    }

    @Override
    public void b(int n2, int n3) {
        super.b(n2, n3);
        if (this.c) {
            switch (n2) {
                case 21: 
                case 23: {
                    this.b(b);
                    break;
                }
                case 22: 
                case 24: {
                    this.b(b);
                    this.b(b);
                    break;
                }
                case 25: {
                    this.b(n3 == 0 ? a : b);
                    break;
                }
                case 54: 
                case 56: 
                case 58: {
                    this.y();
                    break;
                }
                case 55: 
                case 57: {
                    this.y();
                    this.y();
                }
            }
        }
    }

    @Override
    public void b(int n2, String string, String string2, String string3) {
        this.n_.b(n2, string, string2, string3);
        if (this.c) {
            char c2 = string3.charAt(0);
            boolean bl2 = c2 == 'J' || c2 == 'D';
            switch (n2) {
                case 178: {
                    this.b(b);
                    if (!bl2) break;
                    this.b(b);
                    break;
                }
                case 179: {
                    this.y();
                    if (!bl2) break;
                    this.y();
                    break;
                }
                case 181: {
                    this.y();
                    this.y();
                    if (!bl2) break;
                    this.y();
                    break;
                }
                default: {
                    if (!bl2) break;
                    this.b(b);
                }
            }
        }
    }

    @Override
    public void a(int n2, int n3) {
        this.n_.a(n2, n3);
        if (this.c && n2 != 188) {
            this.b(b);
        }
    }

    @Override
    public void a(Object object) {
        this.n_.a(object);
        if (this.c) {
            this.b(b);
            if (object instanceof Double || object instanceof Long) {
                this.b(b);
            }
        }
    }

    @Override
    public void b(String string, int n2) {
        this.n_.b(string, n2);
        if (this.c) {
            for (int i2 = 0; i2 < n2; ++i2) {
                this.y();
            }
            this.b(b);
        }
    }

    @Override
    public void a(int n2, String string) {
        this.n_.a(n2, string);
        if (this.c && n2 == 187) {
            this.b(b);
        }
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
        this.n_.a(n2, string, string2, string3, bl2);
        if (this.c) {
            u[] arru = u.d(string3);
            for (int i2 = 0; i2 < arru.length; ++i2) {
                this.y();
                if (arru[i2].j() != 2) continue;
                this.y();
            }
            switch (n2) {
                case 182: 
                case 185: {
                    this.y();
                    break;
                }
                case 183: {
                    Object object = this.y();
                    if (object != a || this.do) break;
                    this.a();
                    this.do = true;
                    this.c = false;
                }
            }
            u u2 = u.e(string3);
            if (u2 != u.m) {
                this.b(b);
                if (u2.j() == 2) {
                    this.b(b);
                }
            }
        }
    }

    @Override
    public /* varargs */ void a(String string, String string2, m m2, Object ... arrobject) {
        this.n_.a(string, string2, m2, arrobject);
        if (this.c) {
            u[] arru = u.d(string2);
            for (int i2 = 0; i2 < arru.length; ++i2) {
                this.y();
                if (arru[i2].j() != 2) continue;
                this.y();
            }
            u u2 = u.e(string2);
            if (u2 != u.m) {
                this.b(b);
                if (u2.j() == 2) {
                    this.b(b);
                }
            }
        }
    }

    @Override
    public void a(int n2, p p2) {
        this.n_.a(n2, p2);
        if (this.c) {
            switch (n2) {
                case 153: 
                case 154: 
                case 155: 
                case 156: 
                case 157: 
                case 158: 
                case 198: 
                case 199: {
                    this.y();
                    break;
                }
                case 159: 
                case 160: 
                case 161: 
                case 162: 
                case 163: 
                case 164: 
                case 165: 
                case 166: {
                    this.y();
                    this.y();
                    break;
                }
                case 168: {
                    this.b(b);
                }
            }
            this.f(p2);
        }
    }

    @Override
    public void a(p p2, int[] arrn, p[] arrp) {
        this.n_.a(p2, arrn, arrp);
        if (this.c) {
            this.y();
            this.a(p2, arrp);
        }
    }

    @Override
    public /* varargs */ void a(int n2, int n3, p p2, p ... arrp) {
        this.n_.a(n2, n3, p2, arrp);
        if (this.c) {
            this.y();
            this.a(p2, arrp);
        }
    }

    @Override
    public void a(p p2, p p3, p p4, String string) {
        super.a(p2, p3, p4, string);
        if (this.c && !this.dq.containsKey(p4)) {
            ArrayList<Object> arrayList = new ArrayList<Object>();
            arrayList.add(b);
            this.dq.put(p4, arrayList);
        }
    }

    private void a(p p2, p[] arrp) {
        this.f(p2);
        for (int i2 = 0; i2 < arrp.length; ++i2) {
            this.f(arrp[i2]);
        }
    }

    private void f(p p2) {
        if (this.dq.containsKey(p2)) {
            return;
        }
        this.dq.put(p2, new ArrayList<Object>(this.dp));
    }

    private Object y() {
        return this.dp.remove(this.dp.size() - 1);
    }

    private Object z() {
        return this.dp.get(this.dp.size() - 1);
    }

    private void b(Object object) {
        this.dp.add(object);
    }

    protected void a() {
    }

    protected void a(int n2) {
    }
}

