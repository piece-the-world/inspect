/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.c;

import com.growingio.d.a.c.b;

public class a {
    private final String a;

    public a(String string) {
        this.a = string;
    }

    public void a(b b2) {
        int n2;
        String string = this.a;
        int n3 = string.length();
        if (string.charAt(0) == '<') {
            char c2;
            n2 = 2;
            do {
                int n4 = string.indexOf(58, n2);
                b2.c(string.substring(n2 - 1, n4));
                n2 = n4 + 1;
                c2 = string.charAt(n2);
                if (c2 == 'L' || c2 == '[' || c2 == 'T') {
                    n2 = a.a(string, n2, b2.b());
                }
                while ((c2 = string.charAt(n2++)) == ':') {
                    n2 = a.a(string, n2, b2.e());
                }
            } while (c2 != '>');
        } else {
            n2 = 0;
        }
        if (string.charAt(n2) == '(') {
            ++n2;
            while (string.charAt(n2) != ')') {
                n2 = a.a(string, n2, b2.f());
            }
            n2 = a.a(string, n2 + 1, b2.g());
            while (n2 < n3) {
                n2 = a.a(string, n2 + 1, b2.c());
            }
        } else {
            n2 = a.a(string, n2, b2.h());
            while (n2 < n3) {
                n2 = a.a(string, n2, b2.d());
            }
        }
    }

    public void b(b b2) {
        a.a(this.a, 0, b2);
    }

    private static int a(String string, int n2, b b2) {
        char c2 = string.charAt(n2++);
        switch (c2) {
            case 'B': 
            case 'C': 
            case 'D': 
            case 'F': 
            case 'I': 
            case 'J': 
            case 'S': 
            case 'V': 
            case 'Z': {
                b2.a(c2);
                return n2;
            }
            case '[': {
                return a.a(string, n2, b2.a());
            }
            case 'T': {
                int n3 = string.indexOf(59, n2);
                b2.d(string.substring(n2, n3));
                return n3 + 1;
            }
        }
        int n4 = n2;
        boolean bl2 = false;
        boolean bl3 = false;
        do {
            c2 = string.charAt(n2++);
            block5 : switch (c2) {
                String string2;
                case '.': 
                case ';': {
                    if (!bl2) {
                        string2 = string.substring(n4, n2 - 1);
                        if (bl3) {
                            b2.b(string2);
                        } else {
                            b2.a(string2);
                        }
                    }
                    if (c2 == ';') {
                        b2.j();
                        return n2;
                    }
                    n4 = n2;
                    bl2 = false;
                    bl3 = true;
                    break;
                }
                case '<': {
                    string2 = string.substring(n4, n2 - 1);
                    if (bl3) {
                        b2.b(string2);
                    } else {
                        b2.a(string2);
                    }
                    bl2 = true;
                    block15 : do {
                        c2 = string.charAt(n2);
                        switch (c2) {
                            case '>': {
                                break block5;
                            }
                            case '*': {
                                ++n2;
                                b2.i();
                                continue block15;
                            }
                            case '+': 
                            case '-': {
                                n2 = a.a(string, n2 + 1, b2.b(c2));
                                continue block15;
                            }
                        }
                        n2 = a.a(string, n2, b2.b('='));
                    } while (true);
                }
            }
        } while (true);
    }
}

