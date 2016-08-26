/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  com.sun.jdi.event.Event
 *  com.sun.jdi.event.EventIterator
 *  com.sun.jdi.event.EventSet
 *  com.sun.jdi.event.MethodEntryEvent
 */
package com.growingio.b.h;

import com.growingio.b.h.a;
import com.sun.jdi.event.Event;
import com.sun.jdi.event.EventIterator;
import com.sun.jdi.event.EventSet;
import com.sun.jdi.event.MethodEntryEvent;
import java.io.PrintStream;

class b
extends Thread {
    final /* synthetic */ a a;

    b(a a2) {
        this.a = a2;
    }

    private void a(Throwable throwable) {
        System.err.print("Exception in thread \"HotSwap\" ");
        throwable.printStackTrace(System.err);
    }

    @Override
    public void run() {
        EventSet eventSet;
        eventSet = null;
        try {
            eventSet = this.a.a();
            EventIterator eventIterator = eventSet.eventIterator();
            while (eventIterator.hasNext()) {
                Event event = eventIterator.nextEvent();
                if (!(event instanceof MethodEntryEvent)) continue;
                this.a.b();
                break;
            }
        }
        catch (Throwable var2_3) {
            this.a(var2_3);
        }
        try {
            if (eventSet != null) {
                eventSet.resume();
            }
        }
        catch (Throwable var2_4) {
            this.a(var2_4);
        }
    }
}

