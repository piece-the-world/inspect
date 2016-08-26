/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d.a;

import com.growingio.d.a.d.C;
import com.growingio.d.a.d.a;
import com.growingio.d.a.d.a.b;
import com.growingio.d.a.d.a.g;
import com.growingio.d.a.d.a.m;
import com.growingio.d.a.d.d;
import com.growingio.d.a.d.l;
import com.growingio.d.a.d.p;
import com.growingio.d.a.d.x;
import com.growingio.d.a.t;
import com.growingio.d.a.u;
import java.util.List;

public class c
extends g<com.growingio.d.a.d.a.d>
implements t {
    public c() {
        super(327680);
    }

    protected c(int n2) {
        super(n2);
    }

    public com.growingio.d.a.d.a.d a(u u2) {
        if (u2 == null) {
            return com.growingio.d.a.d.a.d.a;
        }
        switch (u2.a()) {
            case 0: {
                return null;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return com.growingio.d.a.d.a.d.b;
            }
            case 6: {
                return com.growingio.d.a.d.a.d.c;
            }
            case 7: {
                return com.growingio.d.a.d.a.d.d;
            }
            case 8: {
                return com.growingio.d.a.d.a.d.e;
            }
            case 9: 
            case 10: {
                return com.growingio.d.a.d.a.d.f;
            }
        }
        throw new Error("Internal error");
    }

    public com.growingio.d.a.d.a.d a(a a2) throws b {
        switch (a2.a()) {
            case 1: {
                return this.a(u.b("null"));
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                return com.growingio.d.a.d.a.d.b;
            }
            case 9: 
            case 10: {
                return com.growingio.d.a.d.a.d.d;
            }
            case 11: 
            case 12: 
            case 13: {
                return com.growingio.d.a.d.a.d.c;
            }
            case 14: 
            case 15: {
                return com.growingio.d.a.d.a.d.e;
            }
            case 16: 
            case 17: {
                return com.growingio.d.a.d.a.d.b;
            }
            case 18: {
                Object object = ((p)a2).w;
                if (object instanceof Integer) {
                    return com.growingio.d.a.d.a.d.b;
                }
                if (object instanceof Float) {
                    return com.growingio.d.a.d.a.d.c;
                }
                if (object instanceof Long) {
                    return com.growingio.d.a.d.a.d.d;
                }
                if (object instanceof Double) {
                    return com.growingio.d.a.d.a.d.e;
                }
                if (object instanceof String) {
                    return this.a(u.b("java/lang/String"));
                }
                if (object instanceof u) {
                    int n2 = ((u)object).a();
                    if (n2 == 10 || n2 == 9) {
                        return this.a(u.b("java/lang/Class"));
                    }
                    if (n2 == 11) {
                        return this.a(u.b("java/lang/invoke/MethodType"));
                    }
                    throw new IllegalArgumentException("Illegal LDC constant " + object);
                }
                if (object instanceof com.growingio.d.a.m) {
                    return this.a(u.b("java/lang/invoke/MethodHandle"));
                }
                throw new IllegalArgumentException("Illegal LDC constant " + object);
            }
            case 168: {
                return com.growingio.d.a.d.a.d.g;
            }
            case 178: {
                return this.a(u.a(((d)a2).y));
            }
            case 187: {
                return this.a(u.b(((C)a2).w));
            }
        }
        throw new Error("Internal error.");
    }

    @Override
    public com.growingio.d.a.d.a.d a(a a2, com.growingio.d.a.d.a.d d2) throws b {
        return d2;
    }

    @Override
    public com.growingio.d.a.d.a.d b(a a2, com.growingio.d.a.d.a.d d2) throws b {
        switch (a2.a()) {
            case 116: 
            case 132: 
            case 136: 
            case 139: 
            case 142: 
            case 145: 
            case 146: 
            case 147: {
                return com.growingio.d.a.d.a.d.b;
            }
            case 118: 
            case 134: 
            case 137: 
            case 144: {
                return com.growingio.d.a.d.a.d.c;
            }
            case 117: 
            case 133: 
            case 140: 
            case 143: {
                return com.growingio.d.a.d.a.d.d;
            }
            case 119: 
            case 135: 
            case 138: 
            case 141: {
                return com.growingio.d.a.d.a.d.e;
            }
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: 
            case 170: 
            case 171: 
            case 172: 
            case 173: 
            case 174: 
            case 175: 
            case 176: 
            case 179: {
                return null;
            }
            case 180: {
                return this.a(u.a(((d)a2).y));
            }
            case 188: {
                switch (((l)a2).w) {
                    case 4: {
                        return this.a(u.a("[Z"));
                    }
                    case 5: {
                        return this.a(u.a("[C"));
                    }
                    case 8: {
                        return this.a(u.a("[B"));
                    }
                    case 9: {
                        return this.a(u.a("[S"));
                    }
                    case 10: {
                        return this.a(u.a("[I"));
                    }
                    case 6: {
                        return this.a(u.a("[F"));
                    }
                    case 7: {
                        return this.a(u.a("[D"));
                    }
                    case 11: {
                        return this.a(u.a("[J"));
                    }
                }
                throw new b(a2, "Invalid array type");
            }
            case 189: {
                String string = ((C)a2).w;
                return this.a(u.a("[" + u.b(string)));
            }
            case 190: {
                return com.growingio.d.a.d.a.d.b;
            }
            case 191: {
                return null;
            }
            case 192: {
                String string = ((C)a2).w;
                return this.a(u.b(string));
            }
            case 193: {
                return com.growingio.d.a.d.a.d.b;
            }
            case 194: 
            case 195: 
            case 198: 
            case 199: {
                return null;
            }
        }
        throw new Error("Internal error.");
    }

    public com.growingio.d.a.d.a.d a(a a2, com.growingio.d.a.d.a.d d2, com.growingio.d.a.d.a.d d3) throws b {
        switch (a2.a()) {
            case 46: 
            case 51: 
            case 52: 
            case 53: 
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
            case 130: {
                return com.growingio.d.a.d.a.d.b;
            }
            case 48: 
            case 98: 
            case 102: 
            case 106: 
            case 110: 
            case 114: {
                return com.growingio.d.a.d.a.d.c;
            }
            case 47: 
            case 97: 
            case 101: 
            case 105: 
            case 109: 
            case 113: 
            case 121: 
            case 123: 
            case 125: 
            case 127: 
            case 129: 
            case 131: {
                return com.growingio.d.a.d.a.d.d;
            }
            case 49: 
            case 99: 
            case 103: 
            case 107: 
            case 111: 
            case 115: {
                return com.growingio.d.a.d.a.d.e;
            }
            case 50: {
                return com.growingio.d.a.d.a.d.f;
            }
            case 148: 
            case 149: 
            case 150: 
            case 151: 
            case 152: {
                return com.growingio.d.a.d.a.d.b;
            }
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: 
            case 181: {
                return null;
            }
        }
        throw new Error("Internal error.");
    }

    @Override
    public com.growingio.d.a.d.a.d a(a a2, com.growingio.d.a.d.a.d d2, com.growingio.d.a.d.a.d d3, com.growingio.d.a.d.a.d d4) throws b {
        return null;
    }

    @Override
    public com.growingio.d.a.d.a.d a(a a2, List<? extends com.growingio.d.a.d.a.d> list) throws b {
        int n2 = a2.a();
        if (n2 == 197) {
            return this.a(u.a(((x)a2).w));
        }
        if (n2 == 186) {
            return this.a(u.e(((com.growingio.d.a.d.m)a2).x));
        }
        return this.a(u.e(((com.growingio.d.a.d.u)a2).y));
    }

    @Override
    public void b(a a2, com.growingio.d.a.d.a.d d2, com.growingio.d.a.d.a.d d3) throws b {
    }

    @Override
    public com.growingio.d.a.d.a.d a(com.growingio.d.a.d.a.d d2, com.growingio.d.a.d.a.d d3) {
        if (!d2.equals(d3)) {
            return com.growingio.d.a.d.a.d.a;
        }
        return d2;
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

    @Override
    public /* synthetic */ m b(a a2) throws b {
        return this.a(a2);
    }

    @Override
    public /* synthetic */ m b(u u2) {
        return this.a(u2);
    }
}

