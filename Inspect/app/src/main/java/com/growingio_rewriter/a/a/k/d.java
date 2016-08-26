/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import java.math.RoundingMode;

class d {
    static final /* synthetic */ int[] a;

    static {
        a = new int[RoundingMode.values().length];
        try {
            d.a[RoundingMode.UNNECESSARY.ordinal()] = 1;
        }
        catch (NoSuchFieldError var0) {
            // empty catch block
        }
        try {
            d.a[RoundingMode.FLOOR.ordinal()] = 2;
        }
        catch (NoSuchFieldError var0_1) {
            // empty catch block
        }
        try {
            d.a[RoundingMode.CEILING.ordinal()] = 3;
        }
        catch (NoSuchFieldError var0_2) {
            // empty catch block
        }
        try {
            d.a[RoundingMode.DOWN.ordinal()] = 4;
        }
        catch (NoSuchFieldError var0_3) {
            // empty catch block
        }
        try {
            d.a[RoundingMode.UP.ordinal()] = 5;
        }
        catch (NoSuchFieldError var0_4) {
            // empty catch block
        }
        try {
            d.a[RoundingMode.HALF_EVEN.ordinal()] = 6;
        }
        catch (NoSuchFieldError var0_5) {
            // empty catch block
        }
        try {
            d.a[RoundingMode.HALF_UP.ordinal()] = 7;
        }
        catch (NoSuchFieldError var0_6) {
            // empty catch block
        }
        try {
            d.a[RoundingMode.HALF_DOWN.ordinal()] = 8;
        }
        catch (NoSuchFieldError var0_7) {
            // empty catch block
        }
    }
}

