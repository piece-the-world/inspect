/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import java.util.concurrent.TimeUnit;

class bE {
    static final /* synthetic */ int[] a;

    static {
        a = new int[TimeUnit.values().length];
        try {
            bE.a[TimeUnit.NANOSECONDS.ordinal()] = 1;
        }
        catch (NoSuchFieldError var0) {
            // empty catch block
        }
        try {
            bE.a[TimeUnit.MICROSECONDS.ordinal()] = 2;
        }
        catch (NoSuchFieldError var0_1) {
            // empty catch block
        }
        try {
            bE.a[TimeUnit.MILLISECONDS.ordinal()] = 3;
        }
        catch (NoSuchFieldError var0_2) {
            // empty catch block
        }
        try {
            bE.a[TimeUnit.SECONDS.ordinal()] = 4;
        }
        catch (NoSuchFieldError var0_3) {
            // empty catch block
        }
        try {
            bE.a[TimeUnit.MINUTES.ordinal()] = 5;
        }
        catch (NoSuchFieldError var0_4) {
            // empty catch block
        }
        try {
            bE.a[TimeUnit.HOURS.ordinal()] = 6;
        }
        catch (NoSuchFieldError var0_5) {
            // empty catch block
        }
        try {
            bE.a[TimeUnit.DAYS.ordinal()] = 7;
        }
        catch (NoSuchFieldError var0_6) {
            // empty catch block
        }
    }
}

