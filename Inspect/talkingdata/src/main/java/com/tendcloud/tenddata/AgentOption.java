/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

public final class AgentOption {
    public static final int AO_ALL = 1;
    public static final int AO_ONLY_COLLECT = 2;
    public static final int AO_None = 3;
    static int a = 1;

    static boolean a() {
        return a == 1 || a == 2;
    }

    static boolean b() {
        return a == 1;
    }
}

