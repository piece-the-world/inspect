/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.m;

final class t
extends m {
    static final m o = new t();

    private t() {
    }

    @Override
    public boolean c(char c2) {
        switch (c2) {
            case '\t': 
            case '\n': 
            case '\u000b': 
            case '\f': 
            case '\r': 
            case ' ': 
            case '\u0085': 
            case '\u1680': 
            case '\u2028': 
            case '\u2029': 
            case '\u205f': 
            case '\u3000': {
                return true;
            }
            case '\u2007': {
                return false;
            }
        }
        return c2 >= '\u2000' && c2 <= '\u200a';
    }

    @Override
    public String toString() {
        return "CharMatcher.breakingWhitespace()";
    }
}

