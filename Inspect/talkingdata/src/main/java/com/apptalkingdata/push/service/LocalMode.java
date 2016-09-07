/*
 * Decompiled with CFR 0_115.
 */
package com.apptalkingdata.push.service;

public class LocalMode {
    public boolean isBell = false;
    public boolean isVibration = false;
    public boolean isWakeUp = false;
    public boolean isNoDelete = false;

    public LocalMode() {
    }

    public LocalMode(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.isBell = bl2;
        this.isVibration = bl3;
        this.isWakeUp = bl4;
        this.isNoDelete = bl5;
    }
}

