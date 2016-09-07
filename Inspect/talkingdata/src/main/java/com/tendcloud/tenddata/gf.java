/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.tendcloud.tenddata;

import android.content.Context;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.cm;

static final class gf
implements Runnable {
    gf() {
    }

    @Override
    public void run() {
        ab.setAppAnalyticsAppId(ab.n);
        cm.a(ab.mContext, "TD_app_pefercen_profile", "TD_appId", ab.n);
        cm.a(ab.mContext, "TD_app_pefercen_profile", "TD_channelId", ab.w);
    }
}

