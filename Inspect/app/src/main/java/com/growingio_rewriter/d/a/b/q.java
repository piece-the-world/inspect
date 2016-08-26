/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.b;

import com.growingio.d.a.b.e;
import com.growingio.d.a.m;
import com.growingio.d.a.u;
import java.util.Comparator;

class q
implements Comparator<e> {
    q() {
    }

    public int a(e e2, e e3) {
        int n2 = q.a(e2) - q.a(e3);
        if (n2 == 0) {
            switch (e2.a) {
                case 'I': {
                    return Integer.valueOf(e2.b).compareTo(e3.b);
                }
                case 'J': {
                    return Long.valueOf(e2.c).compareTo(e3.c);
                }
                case 'F': {
                    return Float.valueOf(e2.d).compareTo(Float.valueOf(e3.d));
                }
                case 'D': {
                    return Double.valueOf(e2.e).compareTo(e3.e);
                }
                case 'C': 
                case 'S': 
                case 's': 
                case 't': {
                    return e2.f.compareTo(e3.f);
                }
                case 'T': {
                    n2 = e2.f.compareTo(e3.f);
                    if (n2 != 0) break;
                    n2 = e2.g.compareTo(e3.g);
                    break;
                }
                case 'y': {
                    m m2;
                    m m3;
                    n2 = e2.f.compareTo(e3.f);
                    if (n2 != 0 || (n2 = e2.g.compareTo(e3.g)) != 0 || (n2 = q.a(m3 = (m)e2.h, m2 = (m)e3.h)) != 0) break;
                    n2 = q.a(e2.i, e3.i);
                    break;
                }
                default: {
                    n2 = e2.f.compareTo(e3.f);
                    if (n2 != 0 || (n2 = e2.g.compareTo(e3.g)) != 0) break;
                    n2 = ((String)e2.h).compareTo((String)e3.h);
                }
            }
        }
        return n2;
    }

    private static int a(m m2, m m3) {
        int n2 = m2.a() - m3.a();
        if (n2 == 0 && (n2 = m2.b().compareTo(m3.b())) == 0 && (n2 = m2.c().compareTo(m3.c())) == 0) {
            n2 = m2.d().compareTo(m3.d());
        }
        return n2;
    }

    private static int a(u u2, u u3) {
        return u2.i().compareTo(u3.i());
    }

    private static int a(Object[] arrobject, Object[] arrobject2) {
        int n2 = arrobject.length;
        int n3 = n2 - arrobject2.length;
        if (n3 == 0) {
            for (int i2 = 0; i2 < n2; ++i2) {
                Object object = arrobject[i2];
                Object object2 = arrobject2[i2];
                n3 = object.getClass().getName().compareTo(object2.getClass().getName());
                if (n3 == 0) {
                    n3 = object instanceof u ? q.a((u)object, (u)object2) : (object instanceof m ? q.a((m)object, (m)object2) : ((Comparable)object).compareTo(object2));
                }
                if (n3 == 0) continue;
                return n3;
            }
        }
        return 0;
    }

    private static int a(e e2) {
        switch (e2.a) {
            case 'I': {
                return 0;
            }
            case 'J': {
                return 1;
            }
            case 'F': {
                return 2;
            }
            case 'D': {
                return 3;
            }
            case 's': {
                return 4;
            }
            case 'S': {
                return 5;
            }
            case 'C': {
                return 6;
            }
            case 'T': {
                return 7;
            }
            case 'G': {
                return 8;
            }
            case 'M': {
                return 9;
            }
            case 'N': {
                return 10;
            }
            case 'y': {
                return 11;
            }
            case 't': {
                return 12;
            }
        }
        return 100 + e2.a - 104;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((e)object, (e)object2);
    }
}

