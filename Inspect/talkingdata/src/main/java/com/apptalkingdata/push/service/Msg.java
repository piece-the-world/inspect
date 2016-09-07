/*
 * Decompiled with CFR 0_115.
 */
package com.apptalkingdata.push.service;

import java.io.Serializable;

public class Msg
implements Serializable {
    private static final long serialVersionUID = 1;
    public String id;
    public long ct;
    public int tp;
    public String d;

    public String toString() {
        return "{'id'=" + this.id + ", 'ct'=" + this.ct + ". 'tp'=" + this.tp + ", 'd'=" + this.d + "}";
    }
}

