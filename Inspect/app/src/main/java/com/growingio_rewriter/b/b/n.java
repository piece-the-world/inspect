/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b;

import com.growingio.b.b.m;
import com.growingio.b.b.y;
import com.growingio.b.b.z;

public class n
implements z {
    private int a = -1;
    private StringBuffer b = new StringBuffer();
    private y c = new y();
    private y d = null;
    private String e;
    private int aR;
    private int aS;
    private int aT;
    private static final int[] aU = new int[]{350, 0, 0, 0, 351, 352, 0, 0, 0, 353, 354, 0, 355, 0, 356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 357, 358, 359, 0};
    private static final m aV = new m();

    public n(String string) {
        this.e = string;
        this.aR = 0;
        this.aS = string.length();
        this.aT = 0;
    }

    public int a() {
        y y2;
        if (this.d == null) {
            return this.a(this.c);
        }
        this.c = y2 = this.d;
        this.d = this.d.a;
        return y2.b;
    }

    public int b() {
        return this.a(0);
    }

    public int a(int n2) {
        y y2 = this.d;
        if (y2 == null) {
            this.d = y2 = this.c;
            y2.a = null;
            this.a(y2);
        }
        while (n2-- > 0) {
            if (y2.a == null) {
                y y3;
                y2.a = y3 = new y();
                this.a(y3);
            }
            y2 = y2.a;
        }
        this.c = y2;
        return y2.b;
    }

    public String c() {
        return this.c.e;
    }

    public long d() {
        return this.c.c;
    }

    public double e() {
        return this.c.d;
    }

    private int a(y y2) {
        int n2;
        while ((n2 = this.b(y2)) == 10) {
        }
        y2.b = n2;
        return n2;
    }

    private int b(y y2) {
        int n2 = this.g();
        if (n2 < 0) {
            return n2;
        }
        if (n2 == 10) {
            ++this.aT;
            return 10;
        }
        if (n2 == 39) {
            return this.c(y2);
        }
        if (n2 == 34) {
            return this.d(y2);
        }
        if (48 <= n2 && n2 <= 57) {
            return this.a(n2, y2);
        }
        if (n2 == 46) {
            n2 = this.i();
            if (48 <= n2 && n2 <= 57) {
                StringBuffer stringBuffer = this.b;
                stringBuffer.setLength(0);
                stringBuffer.append('.');
                return this.a(stringBuffer, n2, y2);
            }
            this.e(n2);
            return this.b(46);
        }
        if (Character.isJavaIdentifierStart((char)n2)) {
            return this.b(n2, y2);
        }
        return this.b(n2);
    }

    private int g() {
        int n2;
        block0 : do {
            if ((n2 = this.i()) != 47) continue;
            n2 = this.i();
            if (n2 == 47) {
                while ((n2 = this.i()) != 10 && n2 != 13 && n2 != -1) {
                }
                continue;
            }
            if (n2 == 42) {
                while ((n2 = this.i()) != -1) {
                    if (n2 != 42) continue;
                    n2 = this.i();
                    if (n2 == 47) {
                        n2 = 32;
                        continue block0;
                    }
                    this.e(n2);
                }
            } else {
                this.e(n2);
                n2 = 47;
            }
        } while (n.c(n2));
        return n2;
    }

    private int c(y y2) {
        int n2;
        int n3 = 0;
        while ((n2 = this.i()) != 39) {
            if (n2 == 92) {
                n3 = this.h();
                continue;
            }
            if (n2 < 32) {
                if (n2 == 10) {
                    ++this.aT;
                }
                return 500;
            }
            n3 = n2;
        }
        y2.c = n3;
        return 401;
    }

    private int h() {
        int n2 = this.i();
        if (n2 == 110) {
            n2 = 10;
        } else if (n2 == 116) {
            n2 = 9;
        } else if (n2 == 114) {
            n2 = 13;
        } else if (n2 == 102) {
            n2 = 12;
        } else if (n2 == 10) {
            ++this.aT;
        }
        return n2;
    }

    private int d(y y2) {
        int n2;
        StringBuffer stringBuffer = this.b;
        stringBuffer.setLength(0);
        do {
            if ((n2 = this.i()) != 34) {
                if (n2 == 92) {
                    n2 = this.h();
                } else if (n2 == 10 || n2 < 0) {
                    ++this.aT;
                    return 500;
                }
                stringBuffer.append((char)n2);
                continue;
            }
            do {
                if ((n2 = this.i()) == 10) {
                    ++this.aT;
                    continue;
                }
                if (!n.c(n2)) break;
            } while (true);
            if (n2 != 34) break;
        } while (true);
        this.e(n2);
        y2.e = stringBuffer.toString();
        return 406;
    }

    private int a(int n2, y y2) {
        long l2 = 0;
        int n3 = this.i();
        if (n2 == 48) {
            if (n3 == 88 || n3 == 120) {
                do {
                    if (48 <= (n2 = this.i()) && n2 <= 57) {
                        l2 = l2 * 16 + (long)(n2 - 48);
                        continue;
                    }
                    if (65 <= n2 && n2 <= 70) {
                        l2 = l2 * 16 + (long)(n2 - 65 + 10);
                        continue;
                    }
                    if (97 > n2 || n2 > 102) break;
                    l2 = l2 * 16 + (long)(n2 - 97 + 10);
                } while (true);
                y2.c = l2;
                if (n2 == 76 || n2 == 108) {
                    return 403;
                }
                this.e(n2);
                return 402;
            }
            if (48 <= n3 && n3 <= 55) {
                l2 = n3 - 48;
                while (48 <= (n2 = this.i()) && n2 <= 55) {
                    l2 = l2 * 8 + (long)(n2 - 48);
                }
                y2.c = l2;
                if (n2 == 76 || n2 == 108) {
                    return 403;
                }
                this.e(n2);
                return 402;
            }
        }
        l2 = n2 - 48;
        while (48 <= n3 && n3 <= 57) {
            l2 = l2 * 10 + (long)n3 - 48;
            n3 = this.i();
        }
        y2.c = l2;
        if (n3 == 70 || n3 == 102) {
            y2.d = l2;
            return 404;
        }
        if (n3 == 69 || n3 == 101 || n3 == 68 || n3 == 100 || n3 == 46) {
            StringBuffer stringBuffer = this.b;
            stringBuffer.setLength(0);
            stringBuffer.append(l2);
            return this.a(stringBuffer, n3, y2);
        }
        if (n3 == 76 || n3 == 108) {
            return 403;
        }
        this.e(n3);
        return 402;
    }

    private int a(StringBuffer stringBuffer, int n2, y y2) {
        if (n2 != 69 && n2 != 101 && n2 != 68 && n2 != 100) {
            stringBuffer.append((char)n2);
            while (48 <= (n2 = this.i()) && n2 <= 57) {
                stringBuffer.append((char)n2);
            }
        }
        if (n2 == 69 || n2 == 101) {
            stringBuffer.append((char)n2);
            n2 = this.i();
            if (n2 == 43 || n2 == 45) {
                stringBuffer.append((char)n2);
                n2 = this.i();
            }
            while (48 <= n2 && n2 <= 57) {
                stringBuffer.append((char)n2);
                n2 = this.i();
            }
        }
        try {
            y2.d = Double.parseDouble(stringBuffer.toString());
        }
        catch (NumberFormatException var4_4) {
            return 500;
        }
        if (n2 == 70 || n2 == 102) {
            return 404;
        }
        if (n2 != 68 && n2 != 100) {
            this.e(n2);
        }
        return 405;
    }

    private int b(int n2) {
        int n3;
        if (33 <= n2 && n2 <= 63) {
            int n4 = aU[n2 - 33];
            if (n4 == 0) {
                return n2;
            }
            n3 = this.i();
            if (n2 == n3) {
                switch (n2) {
                    case 61: {
                        return 358;
                    }
                    case 43: {
                        return 362;
                    }
                    case 45: {
                        return 363;
                    }
                    case 38: {
                        return 369;
                    }
                    case 60: {
                        int n5 = this.i();
                        if (n5 == 61) {
                            return 365;
                        }
                        this.e(n5);
                        return 364;
                    }
                    case 62: {
                        int n6 = this.i();
                        if (n6 == 61) {
                            return 367;
                        }
                        if (n6 == 62) {
                            n6 = this.i();
                            if (n6 == 61) {
                                return 371;
                            }
                            this.e(n6);
                            return 370;
                        }
                        this.e(n6);
                        return 366;
                    }
                }
            } else if (n3 == 61) {
                return n4;
            }
        } else if (n2 == 94) {
            n3 = this.i();
            if (n3 == 61) {
                return 360;
            }
        } else if (n2 == 124) {
            n3 = this.i();
            if (n3 == 61) {
                return 361;
            }
            if (n3 == 124) {
                return 368;
            }
        } else {
            return n2;
        }
        this.e(n3);
        return n2;
    }

    private int b(int n2, y y2) {
        StringBuffer stringBuffer = this.b;
        stringBuffer.setLength(0);
        do {
            stringBuffer.append((char)n2);
        } while (Character.isJavaIdentifierPart((char)(n2 = this.i())));
        this.e(n2);
        String string = stringBuffer.toString();
        int n3 = aV.a(string);
        if (n3 >= 0) {
            return n3;
        }
        y2.e = string;
        return 400;
    }

    private static boolean c(int n2) {
        return n2 == 32 || n2 == 9 || n2 == 12 || n2 == 13 || n2 == 10;
    }

    private static boolean d(int n2) {
        return 48 <= n2 && n2 <= 57;
    }

    private void e(int n2) {
        this.a = n2;
    }

    public String f() {
        int n2;
        int n3 = this.aR - 10;
        if (n3 < 0) {
            n3 = 0;
        }
        if ((n2 = this.aR + 10) > this.aS) {
            n2 = this.aS;
        }
        return this.e.substring(n3, n2);
    }

    private int i() {
        if (this.a < 0) {
            if (this.aR < this.aS) {
                return this.e.charAt(this.aR++);
            }
            return -1;
        }
        int n2 = this.a;
        this.a = -1;
        return n2;
    }

    static {
        aV.a("abstract", 300);
        aV.a("boolean", 301);
        aV.a("break", 302);
        aV.a("byte", 303);
        aV.a("case", 304);
        aV.a("catch", 305);
        aV.a("char", 306);
        aV.a("class", 307);
        aV.a("const", 308);
        aV.a("continue", 309);
        aV.a("default", 310);
        aV.a("do", 311);
        aV.a("double", 312);
        aV.a("else", 313);
        aV.a("extends", 314);
        aV.a("false", 411);
        aV.a("final", 315);
        aV.a("finally", 316);
        aV.a("float", 317);
        aV.a("for", 318);
        aV.a("goto", 319);
        aV.a("if", 320);
        aV.a("implements", 321);
        aV.a("import", 322);
        aV.a("instanceof", 323);
        aV.a("int", 324);
        aV.a("interface", 325);
        aV.a("long", 326);
        aV.a("native", 327);
        aV.a("new", 328);
        aV.a("null", 412);
        aV.a("package", 329);
        aV.a("private", 330);
        aV.a("protected", 331);
        aV.a("public", 332);
        aV.a("return", 333);
        aV.a("short", 334);
        aV.a("static", 335);
        aV.a("strictfp", 347);
        aV.a("super", 336);
        aV.a("switch", 337);
        aV.a("synchronized", 338);
        aV.a("this", 339);
        aV.a("throw", 340);
        aV.a("throws", 341);
        aV.a("transient", 342);
        aV.a("true", 410);
        aV.a("try", 343);
        aV.a("void", 344);
        aV.a("volatile", 345);
        aV.a("while", 346);
    }
}

