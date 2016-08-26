/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d.a;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.a.b;
import com.growingio.d.a.d.a.c;
import com.growingio.d.a.d.a.m;
import com.growingio.d.a.d.d;
import com.growingio.d.a.u;
import java.util.List;

public class e
extends c {
    public e() {
        super(327680);
    }

    protected e(int n2) {
        super(n2);
    }

    @Override
    public com.growingio.d.a.d.a.d a(a a2, com.growingio.d.a.d.a.d d2) throws b {
        com.growingio.d.a.d.a.d d3;
        switch (a2.a()) {
            case 21: 
            case 54: {
                d3 = com.growingio.d.a.d.a.d.b;
                break;
            }
            case 23: 
            case 56: {
                d3 = com.growingio.d.a.d.a.d.c;
                break;
            }
            case 22: 
            case 55: {
                d3 = com.growingio.d.a.d.a.d.d;
                break;
            }
            case 24: 
            case 57: {
                d3 = com.growingio.d.a.d.a.d.e;
                break;
            }
            case 25: {
                if (!d2.c()) {
                    throw new b(a2, null, "an object reference", d2);
                }
                return d2;
            }
            case 58: {
                if (!d2.c() && !com.growingio.d.a.d.a.d.g.equals(d2)) {
                    throw new b(a2, null, "an object reference or a return address", d2);
                }
                return d2;
            }
            default: {
                return d2;
            }
        }
        if (!d3.equals(d2)) {
            throw new b(a2, null, d3, d2);
        }
        return d2;
    }

    @Override
    public com.growingio.d.a.d.a.d b(a a2, com.growingio.d.a.d.a.d d2) throws b {
        com.growingio.d.a.d.a.d d3;
        switch (a2.a()) {
            case 116: 
            case 132: 
            case 133: 
            case 134: 
            case 135: 
            case 145: 
            case 146: 
            case 147: 
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: 
            case 170: 
            case 171: 
            case 172: 
            case 188: 
            case 189: {
                d3 = com.growingio.d.a.d.a.d.b;
                break;
            }
            case 118: 
            case 139: 
            case 140: 
            case 141: 
            case 174: {
                d3 = com.growingio.d.a.d.a.d.c;
                break;
            }
            case 117: 
            case 136: 
            case 137: 
            case 138: 
            case 173: {
                d3 = com.growingio.d.a.d.a.d.d;
                break;
            }
            case 119: 
            case 142: 
            case 143: 
            case 144: 
            case 175: {
                d3 = com.growingio.d.a.d.a.d.e;
                break;
            }
            case 180: {
                d3 = this.a(u.b(((d)a2).w));
                break;
            }
            case 192: {
                if (!d2.c()) {
                    throw new b(a2, null, "an object reference", d2);
                }
                return super.b(a2, d2);
            }
            case 190: {
                if (!this.a(d2)) {
                    throw new b(a2, null, "an array reference", d2);
                }
                return super.b(a2, d2);
            }
            case 176: 
            case 191: 
            case 193: 
            case 194: 
            case 195: 
            case 198: 
            case 199: {
                if (!d2.c()) {
                    throw new b(a2, null, "an object reference", d2);
                }
                return super.b(a2, d2);
            }
            case 179: {
                d3 = this.a(u.a(((d)a2).y));
                break;
            }
            default: {
                throw new Error("Internal error.");
            }
        }
        if (!this.b(d2, d3)) {
            throw new b(a2, null, d3, d2);
        }
        return super.b(a2, d2);
    }

    @Override
    public com.growingio.d.a.d.a.d a(a a2, com.growingio.d.a.d.a.d d2, com.growingio.d.a.d.a.d d3) throws b {
        com.growingio.d.a.d.a.d d4;
        com.growingio.d.a.d.a.d d5;
        switch (a2.a()) {
            case 46: {
                d5 = this.a(u.a("[I"));
                d4 = com.growingio.d.a.d.a.d.b;
                break;
            }
            case 51: {
                d5 = this.b(d2, this.a(u.a("[Z"))) ? this.a(u.a("[Z")) : this.a(u.a("[B"));
                d4 = com.growingio.d.a.d.a.d.b;
                break;
            }
            case 52: {
                d5 = this.a(u.a("[C"));
                d4 = com.growingio.d.a.d.a.d.b;
                break;
            }
            case 53: {
                d5 = this.a(u.a("[S"));
                d4 = com.growingio.d.a.d.a.d.b;
                break;
            }
            case 47: {
                d5 = this.a(u.a("[J"));
                d4 = com.growingio.d.a.d.a.d.b;
                break;
            }
            case 48: {
                d5 = this.a(u.a("[F"));
                d4 = com.growingio.d.a.d.a.d.b;
                break;
            }
            case 49: {
                d5 = this.a(u.a("[D"));
                d4 = com.growingio.d.a.d.a.d.b;
                break;
            }
            case 50: {
                d5 = this.a(u.a("[Ljava/lang/Object;"));
                d4 = com.growingio.d.a.d.a.d.b;
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
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: {
                d5 = com.growingio.d.a.d.a.d.b;
                d4 = com.growingio.d.a.d.a.d.b;
                break;
            }
            case 98: 
            case 102: 
            case 106: 
            case 110: 
            case 114: 
            case 149: 
            case 150: {
                d5 = com.growingio.d.a.d.a.d.c;
                d4 = com.growingio.d.a.d.a.d.c;
                break;
            }
            case 97: 
            case 101: 
            case 105: 
            case 109: 
            case 113: 
            case 127: 
            case 129: 
            case 131: 
            case 148: {
                d5 = com.growingio.d.a.d.a.d.d;
                d4 = com.growingio.d.a.d.a.d.d;
                break;
            }
            case 121: 
            case 123: 
            case 125: {
                d5 = com.growingio.d.a.d.a.d.d;
                d4 = com.growingio.d.a.d.a.d.b;
                break;
            }
            case 99: 
            case 103: 
            case 107: 
            case 111: 
            case 115: 
            case 151: 
            case 152: {
                d5 = com.growingio.d.a.d.a.d.e;
                d4 = com.growingio.d.a.d.a.d.e;
                break;
            }
            case 165: 
            case 166: {
                d5 = com.growingio.d.a.d.a.d.f;
                d4 = com.growingio.d.a.d.a.d.f;
                break;
            }
            case 181: {
                d d6 = (d)a2;
                d5 = this.a(u.b(d6.w));
                d4 = this.a(u.a(d6.y));
                break;
            }
            default: {
                throw new Error("Internal error.");
            }
        }
        if (!this.b(d2, d5)) {
            throw new b(a2, "First argument", d5, d2);
        }
        if (!this.b(d3, d4)) {
            throw new b(a2, "Second argument", d4, d3);
        }
        if (a2.a() == 50) {
            return this.b(d2);
        }
        return super.a(a2, d2, d3);
    }

    @Override
    public com.growingio.d.a.d.a.d a(a a2, com.growingio.d.a.d.a.d d2, com.growingio.d.a.d.a.d d3, com.growingio.d.a.d.a.d d4) throws b {
        com.growingio.d.a.d.a.d d5;
        com.growingio.d.a.d.a.d d6;
        switch (a2.a()) {
            case 79: {
                d5 = this.a(u.a("[I"));
                d6 = com.growingio.d.a.d.a.d.b;
                break;
            }
            case 84: {
                d5 = this.b(d2, this.a(u.a("[Z"))) ? this.a(u.a("[Z")) : this.a(u.a("[B"));
                d6 = com.growingio.d.a.d.a.d.b;
                break;
            }
            case 85: {
                d5 = this.a(u.a("[C"));
                d6 = com.growingio.d.a.d.a.d.b;
                break;
            }
            case 86: {
                d5 = this.a(u.a("[S"));
                d6 = com.growingio.d.a.d.a.d.b;
                break;
            }
            case 80: {
                d5 = this.a(u.a("[J"));
                d6 = com.growingio.d.a.d.a.d.d;
                break;
            }
            case 81: {
                d5 = this.a(u.a("[F"));
                d6 = com.growingio.d.a.d.a.d.c;
                break;
            }
            case 82: {
                d5 = this.a(u.a("[D"));
                d6 = com.growingio.d.a.d.a.d.e;
                break;
            }
            case 83: {
                d5 = d2;
                d6 = com.growingio.d.a.d.a.d.f;
                break;
            }
            default: {
                throw new Error("Internal error.");
            }
        }
        if (!this.b(d2, d5)) {
            throw new b(a2, "First argument", "a " + d5 + " array reference", d2);
        }
        if (!com.growingio.d.a.d.a.d.b.equals(d3)) {
            throw new b(a2, "Second argument", com.growingio.d.a.d.a.d.b, d3);
        }
        if (!this.b(d4, d6)) {
            throw new b(a2, "Third argument", d6, d4);
        }
        return null;
    }

    @Override
    public com.growingio.d.a.d.a.d a(a a2, List<? extends com.growingio.d.a.d.a.d> list) throws b {
        int n2 = a2.a();
        if (n2 == 197) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                if (com.growingio.d.a.d.a.d.b.equals(list.get(i2))) continue;
                throw new b(a2, null, com.growingio.d.a.d.a.d.b, list.get(i2));
            }
        } else {
            Object object;
            int n3 = 0;
            int n4 = 0;
            if (n2 != 184 && n2 != 186) {
                object = u.b(((com.growingio.d.a.d.u)a2).w);
                if (!this.b(list.get(n3++), this.a((u)object))) {
                    throw new b(a2, "Method owner", this.a((u)object), list.get(0));
                }
            }
            object = n2 == 186 ? ((com.growingio.d.a.d.m)a2).x : ((com.growingio.d.a.d.u)a2).y;
            u[] arru = u.d((String)object);
            while (n3 < list.size()) {
                com.growingio.d.a.d.a.d d2;
                com.growingio.d.a.d.a.d d3 = this.a(arru[n4++]);
                if (this.b(d2 = list.get(n3++), d3)) continue;
                throw new b(a2, "Argument " + n4, d3, d2);
            }
        }
        return super.a(a2, list);
    }

    @Override
    public void b(a a2, com.growingio.d.a.d.a.d d2, com.growingio.d.a.d.a.d d3) throws b {
        if (!this.b(d2, d3)) {
            throw new b(a2, "Incompatible return type", d3, d2);
        }
    }

    protected boolean a(com.growingio.d.a.d.a.d d2) {
        return d2.c();
    }

    protected com.growingio.d.a.d.a.d b(com.growingio.d.a.d.a.d d2) throws b {
        return com.growingio.d.a.d.a.d.f;
    }

    protected boolean b(com.growingio.d.a.d.a.d d2, com.growingio.d.a.d.a.d d3) {
        return d2.equals(d3);
    }

    @Override
    public /* synthetic */ void a(a a2, m m2, m m3) throws b {
        this.b(a2, (com.growingio.d.a.d.a.d)m2, (com.growingio.d.a.d.a.d)m3);
    }

    @Override
    public /* synthetic */ m b(a a2, List list) throws b {
        return this.a(a2, list);
    }

    @Override
    public /* synthetic */ m b(a a2, m m2, m m3) throws b {
        return this.a(a2, (com.growingio.d.a.d.a.d)m2, (com.growingio.d.a.d.a.d)m3);
    }

    @Override
    public /* synthetic */ m a(a a2, m m2) throws b {
        return this.b(a2, (com.growingio.d.a.d.a.d)m2);
    }

    @Override
    public /* synthetic */ m b(a a2, m m2) throws b {
        return this.a(a2, (com.growingio.d.a.d.a.d)m2);
    }
}

