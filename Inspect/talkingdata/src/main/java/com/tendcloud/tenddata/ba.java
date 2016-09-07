/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.tendcloud.tenddata;

import android.content.Context;
import com.tendcloud.tenddata.bg;
import com.tendcloud.tenddata.bk;
import com.tendcloud.tenddata.bw;

public class ba {
    public static void commonInit(Context context) {
        bg.init(context);
        bk.init(context);
        bw.isPushAutoStart(context);
    }
}

