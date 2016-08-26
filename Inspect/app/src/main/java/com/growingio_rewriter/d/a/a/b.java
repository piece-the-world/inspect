/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.a;

import com.growingio.d.a.m;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.t;
import com.growingio.d.a.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b
extends r {
    public List<Object> a;
    public List<Object> b;
    private List<p> f;
    public Map<Object, Object> c;
    private int g;
    private int h;
    private String i;

    public b(String string, int n2, String string2, String string3, r r2) {
        this(327680, string, n2, string2, string3, r2);
        if (this.getClass() != b.class) {
            throw new IllegalStateException();
        }
    }

    protected b(int n2, String string, int n3, String string2, String string3, r r2) {
        super(n2, r2);
        this.i = string;
        this.a = new ArrayList<Object>();
        this.b = new ArrayList<Object>();
        this.c = new HashMap<Object, Object>();
        if ((n3 & 8) == 0) {
            if ("<init>".equals(string2)) {
                this.a.add(t.ak);
            } else {
                this.a.add(string);
            }
        }
        u[] arru = u.d(string3);
        block7 : for (int i2 = 0; i2 < arru.length; ++i2) {
            u u2 = arru[i2];
            switch (u2.a()) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: {
                    this.a.add(t.af);
                    continue block7;
                }
                case 6: {
                    this.a.add(t.ag);
                    continue block7;
                }
                case 7: {
                    this.a.add(t.ai);
                    this.a.add(t.ae);
                    continue block7;
                }
                case 8: {
                    this.a.add(t.ah);
                    this.a.add(t.ae);
                    continue block7;
                }
                case 9: {
                    this.a.add(arru[i2].i());
                    continue block7;
                }
                default: {
                    this.a.add(arru[i2].e());
                }
            }
        }
        this.h = this.a.size();
    }

    @Override
    public void a(int n2, int n3, Object[] arrobject, int n4, Object[] arrobject2) {
        if (n2 != -1) {
            throw new IllegalStateException("ClassReader.accept() should be called with EXPAND_FRAMES flag");
        }
        if (this.n_ != null) {
            this.n_.a(n2, n3, arrobject, n4, arrobject2);
        }
        if (this.a != null) {
            this.a.clear();
            this.b.clear();
        } else {
            this.a = new ArrayList<Object>();
            this.b = new ArrayList<Object>();
        }
        b.a(n3, arrobject, this.a);
        b.a(n4, arrobject2, this.b);
        this.g = Math.max(this.g, this.b.size());
    }

    private static void a(int n2, Object[] arrobject, List<Object> list) {
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = arrobject[i2];
            list.add(object);
            if (object != t.ai && object != t.ah) continue;
            list.add(t.ae);
        }
    }

    @Override
    public void a_(int n2) {
        if (this.n_ != null) {
            this.n_.a_(n2);
        }
        this.a(n2, 0, null);
        if (n2 >= 172 && n2 <= 177 || n2 == 191) {
            this.a = null;
            this.b = null;
        }
    }

    @Override
    public void a(int n2, int n3) {
        if (this.n_ != null) {
            this.n_.a(n2, n3);
        }
        this.a(n2, n3, null);
    }

    @Override
    public void b(int n2, int n3) {
        if (this.n_ != null) {
            this.n_.b(n2, n3);
        }
        this.a(n2, n3, null);
    }

    @Override
    public void a(int n2, String string) {
        if (n2 == 187) {
            if (this.f == null) {
                p p2 = new p();
                this.f = new ArrayList<p>(3);
                this.f.add(p2);
                if (this.n_ != null) {
                    this.n_.a(p2);
                }
            }
            for (int i2 = 0; i2 < this.f.size(); ++i2) {
                this.c.put(this.f.get(i2), string);
            }
        }
        if (this.n_ != null) {
            this.n_.a(n2, string);
        }
        this.a(n2, 0, string);
    }

    @Override
    public void b(int n2, String string, String string2, String string3) {
        if (this.n_ != null) {
            this.n_.b(n2, string, string2, string3);
        }
        this.a(n2, 0, string3);
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
        if (this.n_ != null) {
            this.n_.a(n2, string, string2, string3, bl2);
        }
        if (this.a == null) {
            this.f = null;
            return;
        }
        this.b(string3);
        if (n2 != 184) {
            Object object = this.d();
            if (n2 == 183 && string2.charAt(0) == '<') {
                int n3;
                String string4 = object == t.ak ? this.i : this.c.get(object);
                for (n3 = 0; n3 < this.a.size(); ++n3) {
                    if (this.a.get(n3) != object) continue;
                    this.a.set(n3, string4);
                }
                for (n3 = 0; n3 < this.b.size(); ++n3) {
                    if (this.b.get(n3) != object) continue;
                    this.b.set(n3, string4);
                }
            }
        }
        this.a(string3);
        this.f = null;
    }

    @Override
    public /* varargs */ void a(String string, String string2, m m2, Object ... arrobject) {
        if (this.n_ != null) {
            this.n_.a(string, string2, m2, arrobject);
        }
        if (this.a == null) {
            this.f = null;
            return;
        }
        this.b(string2);
        this.a(string2);
        this.f = null;
    }

    @Override
    public void a(int n2, p p2) {
        if (this.n_ != null) {
            this.n_.a(n2, p2);
        }
        this.a(n2, 0, null);
        if (n2 == 167) {
            this.a = null;
            this.b = null;
        }
    }

    @Override
    public void a(p p2) {
        if (this.n_ != null) {
            this.n_.a(p2);
        }
        if (this.f == null) {
            this.f = new ArrayList<p>(3);
        }
        this.f.add(p2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(Object object) {
        if (this.n_ != null) {
            this.n_.a(object);
        }
        if (this.a == null) {
            this.f = null;
            return;
        }
        if (object instanceof Integer) {
            this.b(t.af);
        } else if (object instanceof Long) {
            this.b(t.ai);
            this.b(t.ae);
        } else if (object instanceof Float) {
            this.b(t.ag);
        } else if (object instanceof Double) {
            this.b(t.ah);
            this.b(t.ae);
        } else if (object instanceof String) {
            this.b((Object)"java/lang/String");
        } else if (object instanceof u) {
            int n2 = ((u)object).a();
            if (n2 == 10 || n2 == 9) {
                this.b((Object)"java/lang/Class");
            } else {
                if (n2 != 11) throw new IllegalArgumentException();
                this.b((Object)"java/lang/invoke/MethodType");
            }
        } else {
            if (!(object instanceof m)) throw new IllegalArgumentException();
            this.b((Object)"java/lang/invoke/MethodHandle");
        }
        this.f = null;
    }

    @Override
    public void c(int n2, int n3) {
        if (this.n_ != null) {
            this.n_.c(n2, n3);
        }
        this.a(132, n2, null);
    }

    @Override
    public /* varargs */ void a(int n2, int n3, p p2, p ... arrp) {
        if (this.n_ != null) {
            this.n_.a(n2, n3, p2, arrp);
        }
        this.a(170, 0, null);
        this.a = null;
        this.b = null;
    }

    @Override
    public void a(p p2, int[] arrn, p[] arrp) {
        if (this.n_ != null) {
            this.n_.a(p2, arrn, arrp);
        }
        this.a(171, 0, null);
        this.a = null;
        this.b = null;
    }

    @Override
    public void b(String string, int n2) {
        if (this.n_ != null) {
            this.n_.b(string, n2);
        }
        this.a(197, n2, string);
    }

    @Override
    public void d(int n2, int n3) {
        if (this.n_ != null) {
            this.g = Math.max(this.g, n2);
            this.h = Math.max(this.h, n3);
            this.n_.d(this.g, this.h);
        }
    }

    private Object b(int n2) {
        this.h = Math.max(this.h, n2 + 1);
        return n2 < this.a.size() ? this.a.get(n2) : t.ae;
    }

    private void a(int n2, Object object) {
        this.h = Math.max(this.h, n2 + 1);
        while (n2 >= this.a.size()) {
            this.a.add(t.ae);
        }
        this.a.set(n2, object);
    }

    private void b(Object object) {
        this.b.add(object);
        this.g = Math.max(this.g, this.b.size());
    }

    private void a(String string) {
        int n2 = string.charAt(0) == '(' ? string.indexOf(41) + 1 : 0;
        switch (string.charAt(n2)) {
            case 'V': {
                return;
            }
            case 'B': 
            case 'C': 
            case 'I': 
            case 'S': 
            case 'Z': {
                this.b(t.af);
                return;
            }
            case 'F': {
                this.b(t.ag);
                return;
            }
            case 'J': {
                this.b(t.ai);
                this.b(t.ae);
                return;
            }
            case 'D': {
                this.b(t.ah);
                this.b(t.ae);
                return;
            }
            case '[': {
                if (n2 == 0) {
                    this.b((Object)string);
                    break;
                }
                this.b((Object)string.substring(n2, string.length()));
                break;
            }
            default: {
                if (n2 == 0) {
                    this.b((Object)string.substring(1, string.length() - 1));
                    break;
                }
                this.b((Object)string.substring(n2 + 1, string.length() - 1));
            }
        }
    }

    private Object d() {
        return this.b.remove(this.b.size() - 1);
    }

    private void c(int n2) {
        int n3 = this.b.size();
        int n4 = n3 - n2;
        for (int i2 = n3 - 1; i2 >= n4; --i2) {
            this.b.remove(i2);
        }
    }

    private void b(String string) {
        char c2 = string.charAt(0);
        if (c2 == '(') {
            int n2 = 0;
            u[] arru = u.d(string);
            for (int i2 = 0; i2 < arru.length; ++i2) {
                n2 += arru[i2].j();
            }
            this.c(n2);
        } else if (c2 == 'J' || c2 == 'D') {
            this.c(2);
        } else {
            this.c(1);
        }
    }

    private void a(int n2, int n3, String string) {
        if (this.a == null) {
            this.f = null;
            return;
        }
        block0 : switch (n2) {
            case 0: 
            case 116: 
            case 117: 
            case 118: 
            case 119: 
            case 145: 
            case 146: 
            case 147: 
            case 167: 
            case 177: {
                break;
            }
            case 1: {
                this.b(t.aj);
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 16: 
            case 17: {
                this.b(t.af);
                break;
            }
            case 9: 
            case 10: {
                this.b(t.ai);
                this.b(t.ae);
                break;
            }
            case 11: 
            case 12: 
            case 13: {
                this.b(t.ag);
                break;
            }
            case 14: 
            case 15: {
                this.b(t.ah);
                this.b(t.ae);
                break;
            }
            case 21: 
            case 23: 
            case 25: {
                this.b(this.b(n3));
                break;
            }
            case 22: 
            case 24: {
                this.b(this.b(n3));
                this.b(t.ae);
                break;
            }
            case 46: 
            case 51: 
            case 52: 
            case 53: {
                this.c(2);
                this.b(t.af);
                break;
            }
            case 47: 
            case 143: {
                this.c(2);
                this.b(t.ai);
                this.b(t.ae);
                break;
            }
            case 48: {
                this.c(2);
                this.b(t.ag);
                break;
            }
            case 49: 
            case 138: {
                this.c(2);
                this.b(t.ah);
                this.b(t.ae);
                break;
            }
            case 50: {
                this.c(1);
                Object object = this.d();
                if (object instanceof String) {
                    this.a(((String)object).substring(1));
                    break;
                }
                this.b((Object)"java/lang/Object");
                break;
            }
            case 54: 
            case 56: 
            case 58: {
                Object object;
                Object object2 = this.d();
                this.a(n3, object2);
                if (n3 <= 0 || (object = this.b(n3 - 1)) != t.ai && object != t.ah) break;
                this.a(n3 - 1, t.ae);
                break;
            }
            case 55: 
            case 57: {
                Object object;
                this.c(1);
                Object object3 = this.d();
                this.a(n3, object3);
                this.a(n3 + 1, t.ae);
                if (n3 <= 0 || (object = this.b(n3 - 1)) != t.ai && object != t.ah) break;
                this.a(n3 - 1, t.ae);
                break;
            }
            case 79: 
            case 81: 
            case 83: 
            case 84: 
            case 85: 
            case 86: {
                this.c(3);
                break;
            }
            case 80: 
            case 82: {
                this.c(4);
                break;
            }
            case 87: 
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: 
            case 170: 
            case 171: 
            case 172: 
            case 174: 
            case 176: 
            case 191: 
            case 194: 
            case 195: 
            case 198: 
            case 199: {
                this.c(1);
                break;
            }
            case 88: 
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: 
            case 173: 
            case 175: {
                this.c(2);
                break;
            }
            case 89: {
                Object object = this.d();
                this.b(object);
                this.b(object);
                break;
            }
            case 90: {
                Object object = this.d();
                Object object4 = this.d();
                this.b(object);
                this.b(object4);
                this.b(object);
                break;
            }
            case 91: {
                Object object = this.d();
                Object object5 = this.d();
                Object object6 = this.d();
                this.b(object);
                this.b(object6);
                this.b(object5);
                this.b(object);
                break;
            }
            case 92: {
                Object object = this.d();
                Object object7 = this.d();
                this.b(object7);
                this.b(object);
                this.b(object7);
                this.b(object);
                break;
            }
            case 93: {
                Object object = this.d();
                Object object8 = this.d();
                Object object9 = this.d();
                this.b(object8);
                this.b(object);
                this.b(object9);
                this.b(object8);
                this.b(object);
                break;
            }
            case 94: {
                Object object = this.d();
                Object object10 = this.d();
                Object object11 = this.d();
                Object object12 = this.d();
                this.b(object10);
                this.b(object);
                this.b(object12);
                this.b(object11);
                this.b(object10);
                this.b(object);
                break;
            }
            case 95: {
                Object object = this.d();
                Object object13 = this.d();
                this.b(object);
                this.b(object13);
                break;
            }
            case 96: 
            case 100: 
            case 104: 
            case 108: 
            case 112: 
            case 120: 
            case 122: 
            case 124: 
            case 126: 
            case 128: 
            case 130: 
            case 136: 
            case 142: 
            case 149: 
            case 150: {
                this.c(2);
                this.b(t.af);
                break;
            }
            case 97: 
            case 101: 
            case 105: 
            case 109: 
            case 113: 
            case 127: 
            case 129: 
            case 131: {
                this.c(4);
                this.b(t.ai);
                this.b(t.ae);
                break;
            }
            case 98: 
            case 102: 
            case 106: 
            case 110: 
            case 114: 
            case 137: 
            case 144: {
                this.c(2);
                this.b(t.ag);
                break;
            }
            case 99: 
            case 103: 
            case 107: 
            case 111: 
            case 115: {
                this.c(4);
                this.b(t.ah);
                this.b(t.ae);
                break;
            }
            case 121: 
            case 123: 
            case 125: {
                this.c(3);
                this.b(t.ai);
                this.b(t.ae);
                break;
            }
            case 132: {
                this.a(n3, t.af);
                break;
            }
            case 133: 
            case 140: {
                this.c(1);
                this.b(t.ai);
                this.b(t.ae);
                break;
            }
            case 134: {
                this.c(1);
                this.b(t.ag);
                break;
            }
            case 135: 
            case 141: {
                this.c(1);
                this.b(t.ah);
                this.b(t.ae);
                break;
            }
            case 139: 
            case 190: 
            case 193: {
                this.c(1);
                this.b(t.af);
                break;
            }
            case 148: 
            case 151: 
            case 152: {
                this.c(4);
                this.b(t.af);
                break;
            }
            case 168: 
            case 169: {
                throw new RuntimeException("JSR/RET are not supported");
            }
            case 178: {
                this.a(string);
                break;
            }
            case 179: {
                this.b(string);
                break;
            }
            case 180: {
                this.c(1);
                this.a(string);
                break;
            }
            case 181: {
                this.b(string);
                this.d();
                break;
            }
            case 187: {
                this.b(this.f.get(0));
                break;
            }
            case 188: {
                this.d();
                switch (n3) {
                    case 4: {
                        this.a("[Z");
                        break block0;
                    }
                    case 5: {
                        this.a("[C");
                        break block0;
                    }
                    case 8: {
                        this.a("[B");
                        break block0;
                    }
                    case 9: {
                        this.a("[S");
                        break block0;
                    }
                    case 10: {
                        this.a("[I");
                        break block0;
                    }
                    case 6: {
                        this.a("[F");
                        break block0;
                    }
                    case 7: {
                        this.a("[D");
                        break block0;
                    }
                }
                this.a("[J");
                break;
            }
            case 189: {
                this.d();
                this.a("[" + u.b(string));
                break;
            }
            case 192: {
                this.d();
                this.a(u.b(string).i());
                break;
            }
            default: {
                this.c(n3);
                this.a(string);
            }
        }
        this.f = null;
    }
}

