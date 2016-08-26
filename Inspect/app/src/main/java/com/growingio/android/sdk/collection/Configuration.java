/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
package com.growingio.android.sdk.collection;

import android.app.Application;
import com.growingio.android.sdk.collection.ActivityLifecycleCallbacksRegistrar;

public class Configuration {
    Application a;
    String b;
    String c;
    String d;
    String e;
    double f = 1.0;
    boolean g = false;
    boolean h = false;
    boolean i = false;
    boolean j = true;
    boolean k = false;
    boolean l = false;
    boolean m = true;
    boolean n = true;
    boolean o = false;
    int p = 50;
    long q = 30000;
    long r = 60000;
    long s = 0x100000;
    ActivityLifecycleCallbacksRegistrar t;

    public Configuration setSampling(double d2) {
        this.f = d2;
        return this;
    }

    public Configuration setDisabled(boolean bl2) {
        this.g = bl2;
        return this;
    }

    public Configuration setDisableImpression(boolean bl2) {
        this.h = bl2;
        return this;
    }

    public Configuration setThrottle(boolean bl2) {
        this.i = bl2;
        return this;
    }

    public Configuration setTrackWebView(boolean bl2) {
        this.j = bl2;
        return this;
    }

    public Configuration setDebugMode(boolean bl2) {
        this.k = bl2;
        return this;
    }

    public Configuration setTestMode(boolean bl2) {
        this.l = bl2;
        return this;
    }

    public Configuration setDiagnose(boolean bl2) {
        this.m = bl2;
        return this;
    }

    public Configuration setChannel(String string) {
        this.e = string;
        return this;
    }

    public Configuration setFlushInterval(long l2) {
        this.r = l2;
        return this;
    }

    public Configuration setCellularDataLimit(long l2) {
        this.s = l2;
        return this;
    }

    public Configuration setActivityLifecycleCallbacksRegistrar(ActivityLifecycleCallbacksRegistrar activityLifecycleCallbacksRegistrar) {
        this.t = activityLifecycleCallbacksRegistrar;
        return this;
    }

    public Configuration setURLScheme(String string) {
        this.c = string;
        return this;
    }

    public Configuration setDeviceId(String string) {
        this.d = string;
        return this;
    }

    public Configuration setProjectId(String string) {
        this.b = string;
        return this;
    }

    public Configuration setBulkSize(int n2) {
        this.p = n2;
        return this;
    }

    public Configuration setSessionInterval(long l2) {
        this.q = l2;
        return this;
    }

    public Configuration useID() {
        this.n = true;
        return this;
    }

    public Configuration setApp(Application application) {
        this.a = application;
        return this;
    }

    public Configuration trackAllFragments() {
        this.o = true;
        return this;
    }

    public Configuration(String string) {
        this.b = string;
    }

    public Configuration() {
    }

    public Configuration setContext(Application application) {
        this.a = application;
        return this;
    }
}

