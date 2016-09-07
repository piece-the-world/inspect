/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.tendcloud.tenddata;

import android.util.Log;
import com.tendcloud.tenddata.TCAgent;

class ed {
    ed() {
    }

    static /* varargs */ void a(String ... arrstring) {
    }

    static /* varargs */ void b(String ... arrstring) {
    }

    static /* varargs */ void c(String ... arrstring) {
    }

    static void a(Throwable throwable) {
    }

    static void a(String string) {
        if (TCAgent.LOG_ON) {
            Log.i((String)"TDLog", (String)string);
        }
    }

    static void b(String string) {
        if (TCAgent.LOG_ON) {
            Log.d((String)"TDLog", (String)string);
        }
    }

    static void c(String string) {
        if (TCAgent.LOG_ON) {
            Log.e((String)"TDLog", (String)string);
        }
    }

    static void a(String string, Throwable throwable) {
        if (TCAgent.LOG_ON) {
            Log.e((String)"TDLog", (String)string, (Throwable)throwable);
        }
    }
}

