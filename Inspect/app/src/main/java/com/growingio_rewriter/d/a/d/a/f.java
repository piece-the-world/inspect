/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d.a;

import com.growingio.d.a.d.D;
import com.growingio.d.a.d.a;
import com.growingio.d.a.d.a.b;
import com.growingio.d.a.d.a.g;
import com.growingio.d.a.d.a.m;
import com.growingio.d.a.u;
import java.util.ArrayList;
import java.util.List;

public class f<V extends m> {
    private V a;
    private V[] b;
    private int c;
    private int d;

    public f(int n2, int n3) {
        this.b = new m[n2 + n3];
        this.c = n2;
    }

    public f(f<? extends V> f2) {
        this(f2.c, f2.b.length - f2.c);
        this.a(f2);
    }

    public f<V> a(f<? extends V> f2) {
        this.a = f2.a;
        System.arraycopy(f2.b, 0, this.b, 0, this.b.length);
        this.d = f2.d;
        return this;
    }

    public void a(V v2) {
        this.a = v2;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.b.length - this.c;
    }

    public V a(int n2) throws IndexOutOfBoundsException {
        if (n2 >= this.c) {
            throw new IndexOutOfBoundsException("Trying to access an inexistant local variable");
        }
        return this.b[n2];
    }

    public void a(int n2, V v2) throws IndexOutOfBoundsException {
        if (n2 >= this.c) {
            throw new IndexOutOfBoundsException("Trying to access an inexistant local variable " + n2);
        }
        this.b[n2] = v2;
    }

    public int c() {
        return this.d;
    }

    public V b(int n2) throws IndexOutOfBoundsException {
        return this.b[n2 + this.c];
    }

    public void d() {
        this.d = 0;
    }

    public V e() throws IndexOutOfBoundsException {
        if (this.d == 0) {
            throw new IndexOutOfBoundsException("Cannot pop operand off an empty stack.");
        }
        return this.b[--this.d + this.c];
    }

    public void b(V v2) throws IndexOutOfBoundsException {
        if (this.d + this.c >= this.b.length) {
            throw new IndexOutOfBoundsException("Insufficient maximum stack size.");
        }
        this.b[this.d++ + this.c] = v2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(a a2, g<V> g2) throws b {
        switch (a2.a()) {
            case 0: {
                return;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: {
                this.b(g2.b(a2));
                return;
            }
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: {
                this.b(g2.b(a2, (a)this.a(((D)a2).w)));
                return;
            }
            case 46: 
            case 47: 
            case 48: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: {
                V v2 = this.e();
                V v3 = this.e();
                this.b(g2.b(a2, (a)v3, (a)v2));
                return;
            }
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: {
                V v4;
                a a3 = g2.b(a2, (a)this.e());
                int n2 = ((D)a2).w;
                this.a(n2, a3);
                if (a3.b() == 2) {
                    this.a(n2 + 1, g2.b((u)null));
                }
                if (n2 <= 0 || (v4 = this.a(n2 - 1)) == null || v4.b() != 2) return;
                this.a(n2 - 1, g2.b((u)null));
                return;
            }
            case 79: 
            case 80: 
            case 81: 
            case 82: 
            case 83: 
            case 84: 
            case 85: 
            case 86: {
                V v5 = this.e();
                V v6 = this.e();
                V v7 = this.e();
                g2.a(a2, (a)v7, (a)v6, (a)v5);
                return;
            }
            case 87: {
                if (this.e().b() != 2) return;
                throw new b(a2, "Illegal use of POP");
            }
            case 88: {
                if (this.e().b() != 1 || this.e().b() == 1) return;
                throw new b(a2, "Illegal use of POP2");
            }
            case 89: {
                V v8 = this.e();
                if (v8.b() != 1) {
                    throw new b(a2, "Illegal use of DUP");
                }
                this.b(v8);
                this.b(g2.b(a2, (a)v8));
                return;
            }
            case 90: {
                V v9 = this.e();
                V v10 = this.e();
                if (v9.b() != 1 || v10.b() != 1) {
                    throw new b(a2, "Illegal use of DUP_X1");
                }
                this.b(g2.b(a2, (a)v9));
                this.b(v10);
                this.b(v9);
                return;
            }
            case 91: {
                V v11 = this.e();
                if (v11.b() != 1) throw new b(a2, "Illegal use of DUP_X2");
                V v12 = this.e();
                if (v12.b() == 1) {
                    V v13 = this.e();
                    if (v13.b() != 1) throw new b(a2, "Illegal use of DUP_X2");
                    this.b(g2.b(a2, (a)v11));
                    this.b(v13);
                    this.b(v12);
                    this.b(v11);
                    return;
                }
                this.b(g2.b(a2, (a)v11));
                this.b(v12);
                this.b(v11);
                return;
            }
            case 92: {
                V v14 = this.e();
                if (v14.b() == 1) {
                    V v15 = this.e();
                    if (v15.b() != 1) throw new b(a2, "Illegal use of DUP2");
                    this.b(v15);
                    this.b(v14);
                    this.b(g2.b(a2, (a)v15));
                    this.b(g2.b(a2, (a)v14));
                    return;
                }
                this.b(v14);
                this.b(g2.b(a2, (a)v14));
                return;
            }
            case 93: {
                V v16 = this.e();
                if (v16.b() == 1) {
                    V v17;
                    V v18 = this.e();
                    if (v18.b() != 1 || (v17 = this.e()).b() != 1) throw new b(a2, "Illegal use of DUP2_X1");
                    this.b(g2.b(a2, (a)v18));
                    this.b(g2.b(a2, (a)v16));
                    this.b(v17);
                    this.b(v18);
                    this.b(v16);
                    return;
                }
                V v19 = this.e();
                if (v19.b() != 1) throw new b(a2, "Illegal use of DUP2_X1");
                this.b(g2.b(a2, (a)v16));
                this.b(v19);
                this.b(v16);
                return;
            }
            case 94: {
                V v20 = this.e();
                if (v20.b() == 1) {
                    V v21 = this.e();
                    if (v21.b() != 1) throw new b(a2, "Illegal use of DUP2_X2");
                    V v22 = this.e();
                    if (v22.b() == 1) {
                        V v23 = this.e();
                        if (v23.b() != 1) throw new b(a2, "Illegal use of DUP2_X2");
                        this.b(g2.b(a2, (a)v21));
                        this.b(g2.b(a2, (a)v20));
                        this.b(v23);
                        this.b(v22);
                        this.b(v21);
                        this.b(v20);
                        return;
                    }
                    this.b(g2.b(a2, (a)v21));
                    this.b(g2.b(a2, (a)v20));
                    this.b(v22);
                    this.b(v21);
                    this.b(v20);
                    return;
                }
                V v24 = this.e();
                if (v24.b() == 1) {
                    V v25 = this.e();
                    if (v25.b() != 1) throw new b(a2, "Illegal use of DUP2_X2");
                    this.b(g2.b(a2, (a)v20));
                    this.b(v25);
                    this.b(v24);
                    this.b(v20);
                    return;
                }
                this.b(g2.b(a2, (a)v20));
                this.b(v24);
                this.b(v20);
                return;
            }
            case 95: {
                V v26 = this.e();
                V v27 = this.e();
                if (v27.b() != 1 || v26.b() != 1) {
                    throw new b(a2, "Illegal use of SWAP");
                }
                this.b(g2.b(a2, (a)v26));
                this.b(g2.b(a2, (a)v27));
                return;
            }
            case 96: 
            case 97: 
            case 98: 
            case 99: 
            case 100: 
            case 101: 
            case 102: 
            case 103: 
            case 104: 
            case 105: 
            case 106: 
            case 107: 
            case 108: 
            case 109: 
            case 110: 
            case 111: 
            case 112: 
            case 113: 
            case 114: 
            case 115: {
                V v28 = this.e();
                V v29 = this.e();
                this.b(g2.b(a2, (a)v29, (a)v28));
                return;
            }
            case 116: 
            case 117: 
            case 118: 
            case 119: {
                this.b(g2.a(a2, (a)this.e()));
                return;
            }
            case 120: 
            case 121: 
            case 122: 
            case 123: 
            case 124: 
            case 125: 
            case 126: 
            case 127: 
            case 128: 
            case 129: 
            case 130: 
            case 131: {
                V v30 = this.e();
                V v31 = this.e();
                this.b(g2.b(a2, (a)v31, (a)v30));
                return;
            }
            case 132: {
                int n3 = ((com.growingio.d.a.d.g)a2).w;
                this.a(n3, g2.a(a2, (a)this.a(n3)));
                return;
            }
            case 133: 
            case 134: 
            case 135: 
            case 136: 
            case 137: 
            case 138: 
            case 139: 
            case 140: 
            case 141: 
            case 142: 
            case 143: 
            case 144: 
            case 145: 
            case 146: 
            case 147: {
                this.b(g2.a(a2, (a)this.e()));
                return;
            }
            case 148: 
            case 149: 
            case 150: 
            case 151: 
            case 152: {
                V v32 = this.e();
                V v33 = this.e();
                this.b(g2.b(a2, (a)v33, (a)v32));
                return;
            }
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: {
                g2.a(a2, (a)this.e());
                return;
            }
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: {
                V v34 = this.e();
                V v35 = this.e();
                g2.b(a2, (a)v35, (a)v34);
                return;
            }
            case 167: {
                return;
            }
            case 168: {
                this.b(g2.b(a2));
                return;
            }
            case 169: {
                return;
            }
            case 170: 
            case 171: {
                g2.a(a2, (a)this.e());
                return;
            }
            case 172: 
            case 173: 
            case 174: 
            case 175: 
            case 176: {
                V v36 = this.e();
                g2.a(a2, (a)v36);
                g2.a(a2, (a)v36, (a)this.a);
                return;
            }
            case 177: {
                if (this.a == null) return;
                throw new b(a2, "Incompatible return type");
            }
            case 178: {
                this.b(g2.b(a2));
                return;
            }
            case 179: {
                g2.a(a2, (a)this.e());
                return;
            }
            case 180: {
                this.b(g2.a(a2, (a)this.e()));
                return;
            }
            case 181: {
                V v37 = this.e();
                V v38 = this.e();
                g2.b(a2, (a)v38, (a)v37);
                return;
            }
            case 182: 
            case 183: 
            case 184: 
            case 185: {
                ArrayList<V> arrayList = new ArrayList<V>();
                String string = ((com.growingio.d.a.d.u)a2).y;
                for (int i2 = u.d((String)string).length; i2 > 0; --i2) {
                    arrayList.add(0, this.e());
                }
                if (a2.a() != 184) {
                    arrayList.add(0, this.e());
                }
                if (u.e(string) == u.m) {
                    g2.b(a2, arrayList);
                    return;
                }
                this.b(g2.b(a2, arrayList));
                return;
            }
            case 186: {
                ArrayList<V> arrayList = new ArrayList<V>();
                String string = ((com.growingio.d.a.d.m)a2).x;
                for (int i3 = u.d((String)string).length; i3 > 0; --i3) {
                    arrayList.add(0, this.e());
                }
                if (u.e(string) == u.m) {
                    g2.b(a2, arrayList);
                    return;
                }
                this.b(g2.b(a2, arrayList));
                return;
            }
            case 187: {
                this.b(g2.b(a2));
                return;
            }
            case 188: 
            case 189: 
            case 190: {
                this.b(g2.a(a2, (a)this.e()));
                return;
            }
            case 191: {
                g2.a(a2, (a)this.e());
                return;
            }
            case 192: 
            case 193: {
                this.b(g2.a(a2, (a)this.e()));
                return;
            }
            case 194: 
            case 195: {
                g2.a(a2, (a)this.e());
                return;
            }
            case 197: {
                ArrayList<V> arrayList = new ArrayList<V>();
                for (int i4 = ((com.growingio.d.a.d.x)a2).x; i4 > 0; --i4) {
                    arrayList.add(0, this.e());
                }
                this.b(g2.b(a2, arrayList));
                return;
            }
            case 198: 
            case 199: {
                g2.a(a2, (a)this.e());
                return;
            }
            default: {
                throw new RuntimeException("Illegal opcode " + a2.a());
            }
        }
    }

    public boolean a(f<? extends V> f2, g<V> g2) throws b {
        if (this.d != f2.d) {
            throw new b(null, "Incompatible stack heights");
        }
        boolean bl2 = false;
        for (int i2 = 0; i2 < this.c + this.d; ++i2) {
            V v2 = g2.a(this.b[i2], f2.b[i2]);
            if (v2.equals(this.b[i2])) continue;
            this.b[i2] = v2;
            bl2 = true;
        }
        return bl2;
    }

    public boolean a(f<? extends V> f2, boolean[] arrbl) {
        boolean bl2 = false;
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (arrbl[i2] || this.b[i2].equals(f2.b[i2])) continue;
            this.b[i2] = f2.b[i2];
            bl2 = true;
        }
        return bl2;
    }

    public String toString() {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        for (n2 = 0; n2 < this.a(); ++n2) {
            stringBuilder.append(this.a(n2));
        }
        stringBuilder.append(' ');
        for (n2 = 0; n2 < this.c(); ++n2) {
            stringBuilder.append(this.b(n2).toString());
        }
        return stringBuilder.toString();
    }
}

