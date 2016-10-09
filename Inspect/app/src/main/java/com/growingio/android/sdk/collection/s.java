/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Fragment
 *  android.support.v4.app.Fragment
 *  android.widget.EditText
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.collection;

import android.app.Activity;
import android.app.Fragment;
import android.widget.EditText;
import com.growingio.android.sdk.collection.GrowingIO;
import com.growingio.android.sdk.collection.q;
import org.json.JSONObject;

public class s
extends GrowingIO {
    private s() {
        super((q)null);
    }

    @Override
    public GrowingIO setGeoLocation(double latitude, double longitude) {
        return this;
    }

    @Override
    public GrowingIO clearGeoLocation() {
        return this;
    }

    @Override
    public GrowingIO setCS1(String key, String value) {
        return this;
    }

    @Override
    public GrowingIO setCS2(String key, String value) {
        return this;
    }

    @Override
    public GrowingIO setCS3(String key, String value) {
        return this;
    }

    @Override
    public GrowingIO setCS4(String key, String value) {
        return this;
    }

    @Override
    public GrowingIO setCS5(String key, String value) {
        return this;
    }

    @Override
    public GrowingIO setCS6(String key, String value) {
        return this;
    }

    @Override
    public GrowingIO setCS7(String key, String value) {
        return this;
    }

    @Override
    public GrowingIO setCS8(String key, String value) {
        return this;
    }

    @Override
    public GrowingIO setCS9(String key, String value) {
        return this;
    }

    @Override
    public GrowingIO setCS10(String key, String value) {
        return this;
    }

    @Override
    public GrowingIO setChannel(String channel) {
        return this;
    }

    @Override
    public GrowingIO trackFragment(Activity activity, android.support.v4.app.Fragment fragment) {
        return this;
    }

    @Override
    public GrowingIO ignoreFragment(Activity activity, Fragment fragment) {
        return this;
    }

    @Override
    public GrowingIO trackFragment(Activity activity, Fragment fragment) {
        return this;
    }

    @Override
    public GrowingIO ignoreFragment(Activity activity, android.support.v4.app.Fragment fragment) {
        return this;
    }

    @Override
    protected GrowingIO a(Object object, int n2, String string) {
        return this;
    }

    @Override
    public GrowingIO track(String eventName, JSONObject properties) {
        return this;
    }

    @Override
    public GrowingIO setPageName(Activity activity, String name) {
        return this;
    }

    @Override
    public GrowingIO setPageName(Fragment fragment, String name) {
        return this;
    }

    @Override
    public GrowingIO setPageName(android.support.v4.app.Fragment fragment, String name) {
        return this;
    }

    @Override
    public GrowingIO setPageGroup(Activity activity, String name) {
        return this;
    }

    @Override
    public GrowingIO trackEditText(EditText editText) {
        return this;
    }

    /* synthetic */ s(q q2) {
        this();
    }
}

