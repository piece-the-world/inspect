/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.b;

import com.growingio.d.a.g;
import com.growingio.d.a.m;
import java.util.Arrays;

class e {
    char a;
    int b;
    long c;
    float d;
    double e;
    String f;
    String g;
    Object h;
    Object[] i;
    int j;

    e() {
    }

    e(e e2) {
        this.a = e2.a;
        this.b = e2.b;
        this.c = e2.c;
        this.d = e2.d;
        this.e = e2.e;
        this.f = e2.f;
        this.g = e2.g;
        this.h = e2.h;
        this.i = e2.i;
        this.j = e2.j;
    }

    void a(int n2) {
        this.a = 73;
        this.b = n2;
        this.j = Integer.MAX_VALUE & this.a + n2;
    }

    void a(long l2) {
        this.a = 74;
        this.c = l2;
        this.j = Integer.MAX_VALUE & this.a + (int)l2;
    }

    void a(float f2) {
        this.a = 70;
        this.d = f2;
        this.j = Integer.MAX_VALUE & this.a + (int)f2;
    }

    void a(double d2) {
        this.a = 68;
        this.e = d2;
        this.j = Integer.MAX_VALUE & this.a + (int)d2;
    }

    void a(char c2, String string, String string2, String string3) {
        this.a = c2;
        this.f = string;
        this.g = string2;
        this.h = string3;
        switch (c2) {
            case 'C': 
            case 'S': 
            case 's': 
            case 't': {
                this.j = Integer.MAX_VALUE & c2 + string.hashCode();
                return;
            }
            case 'T': {
                this.j = Integer.MAX_VALUE & c2 + string.hashCode() * string2.hashCode();
                return;
            }
        }
        this.j = Integer.MAX_VALUE & c2 + string.hashCode() * string2.hashCode() * string3.hashCode();
    }

    void a(String string, String string2, m m2, Object[] arrobject) {
        this.a = 121;
        this.f = string;
        this.g = string2;
        this.h = m2;
        this.i = arrobject;
        int n2 = 121 + string.hashCode() * string2.hashCode() * m2.hashCode();
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            n2 *= arrobject[i2].hashCode();
        }
        this.j = Integer.MAX_VALUE & n2;
    }

    void a(g g2) {
        switch (this.a) {
            case 'I': {
                g2.b(this.b);
                break;
            }
            case 'J': {
                g2.b(this.c);
                break;
            }
            case 'F': {
                g2.b(Float.valueOf(this.d));
                break;
            }
            case 'D': {
                g2.b(this.e);
                break;
            }
            case 'S': {
                g2.b((Object)this.f);
                break;
            }
            case 's': {
                g2.a(this.f);
                break;
            }
            case 'C': {
                g2.c(this.f);
                break;
            }
            case 'T': {
                g2.b(this.f, this.g);
                break;
            }
            case 'G': {
                g2.c(this.f, this.g, (String)this.h);
                break;
            }
            case 'M': {
                g2.b(this.f, this.g, (String)this.h, false);
                break;
            }
            case 'N': {
                g2.b(this.f, this.g, (String)this.h, true);
                break;
            }
            case 'y': {
                g2.b(this.f, this.g, (m)this.h, this.i);
                break;
            }
            case 't': {
                g2.e(this.f);
                break;
            }
            default: {
                g2.b(this.a - 104 + 1 - (this.a >= 'q' ? 4 : 0), this.f, this.g, (String)this.h, this.a >= 'p');
            }
        }
    }

    public boolean equals(Object object) {
        if (!(object instanceof e)) {
            return false;
        }
        e e2 = (e)object;
        if (e2.a == this.a) {
            switch (this.a) {
                case 'I': {
                    return e2.b == this.b;
                }
                case 'J': {
                    return e2.c == this.c;
                }
                case 'F': {
                    return Float.compare(e2.d, this.d) == 0;
                }
                case 'D': {
                    return Double.compare(e2.e, this.e) == 0;
                }
                case 'C': 
                case 'S': 
                case 's': 
                case 't': {
                    return e2.f.equals(this.f);
                }
                case 'T': {
                    return e2.f.equals(this.f) && e2.g.equals(this.g);
                }
                case 'y': {
                    return e2.f.equals(this.f) && e2.g.equals(this.g) && e2.h.equals(this.h) && Arrays.equals(e2.i, this.i);
                }
            }
            return e2.f.equals(this.f) && e2.g.equals(this.g) && e2.h.equals(this.h);
        }
        return false;
    }

    public int hashCode() {
        return this.j;
    }
}

