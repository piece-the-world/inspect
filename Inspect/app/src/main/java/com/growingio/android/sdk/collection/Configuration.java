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
    boolean p = false;
    int q = 300;
    long r = 30000;
    long s = 30000;
    long t = 0x300000;
    ActivityLifecycleCallbacksRegistrar u;

    public Configuration setSampling(double sampling) {
        this.f = sampling;
        return this;
    }

    public Configuration setDisabled(boolean disabled) {
        this.g = disabled;
        return this;
    }

    public Configuration setDisableImpression(boolean disableImpression) {
        this.h = disableImpression;
        return this;
    }

    public Configuration setThrottle(boolean throttle) {
        this.i = throttle;
        return this;
    }

    public Configuration setTrackWebView(boolean trackWebView) {
        this.j = trackWebView;
        return this;
    }

    public Configuration setDebugMode(boolean debugMode) {
        this.k = debugMode;
        return this;
    }

    public Configuration setTestMode(boolean testMode) {
        this.l = testMode;
        return this;
    }

    public Configuration setDiagnose(boolean diagnose) {
        this.m = diagnose;
        return this;
    }

    public Configuration setChannel(String channel) {
        this.e = channel;
        return this;
    }

    public Configuration setFlushInterval(long flushInterval) {
        this.s = flushInterval;
        return this;
    }

    public Configuration setCellularDataLimit(long cellularDataLimit) {
        this.t = cellularDataLimit;
        return this;
    }

    public Configuration setActivityLifecycleCallbacksRegistrar(ActivityLifecycleCallbacksRegistrar registrar) {
        this.u = registrar;
        return this;
    }

    public Configuration setURLScheme(String urlScheme) {
        this.c = urlScheme;
        return this;
    }

    public Configuration setDeviceId(String deviceId) {
        this.d = deviceId;
        return this;
    }

    public Configuration setProjectId(String projectId) {
        this.b = projectId;
        return this;
    }

    public Configuration setBulkSize(int bulkSize) {
        this.q = bulkSize;
        return this;
    }

    public Configuration setSessionInterval(long sessionInterval) {
        this.r = sessionInterval;
        return this;
    }

    public Configuration useID() {
        this.n = true;
        return this;
    }

    public Configuration setApp(Application app) {
        this.a = app;
        return this;
    }

    public Configuration trackAllFragments() {
        this.o = true;
        return this;
    }

    public Configuration disableCellularImp() {
        this.p = true;
        return this;
    }

    public Configuration(String projectId) {
        this.b = projectId;
    }

    public Configuration() {
    }

    public Configuration setContext(Application context) {
        this.a = context;
        return this;
    }
}

