/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  com.sun.jdi.Bootstrap
 *  com.sun.jdi.ReferenceType
 *  com.sun.jdi.VirtualMachine
 *  com.sun.jdi.connect.AttachingConnector
 *  com.sun.jdi.connect.Connector
 *  com.sun.jdi.connect.Connector$Argument
 *  com.sun.jdi.connect.IllegalConnectorArgumentsException
 *  com.sun.jdi.event.EventQueue
 *  com.sun.jdi.event.EventSet
 *  com.sun.jdi.request.EventRequest
 *  com.sun.jdi.request.EventRequestManager
 *  com.sun.jdi.request.MethodEntryRequest
 */
package com.growingio.b.h;

import com.growingio.b.h.b;
import com.growingio.b.h.c;
import com.sun.jdi.Bootstrap;
import com.sun.jdi.ReferenceType;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.connect.AttachingConnector;
import com.sun.jdi.connect.Connector;
import com.sun.jdi.connect.IllegalConnectorArgumentsException;
import com.sun.jdi.event.EventQueue;
import com.sun.jdi.event.EventSet;
import com.sun.jdi.request.EventRequest;
import com.sun.jdi.request.EventRequestManager;
import com.sun.jdi.request.MethodEntryRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class a {
    private VirtualMachine a = null;
    private MethodEntryRequest b = null;
    private Map c = null;
    private c d = new c();
    private static final String e = "localhost";
    private static final String f = c.class.getName();

    public a(int n2) throws IOException, IllegalConnectorArgumentsException {
        this(Integer.toString(n2));
    }

    public a(String string) throws IOException, IllegalConnectorArgumentsException {
        AttachingConnector attachingConnector = (AttachingConnector)this.a("com.sun.jdi.SocketAttach");
        Map map = attachingConnector.defaultArguments();
        ((Connector.Argument)map.get("hostname")).setValue("localhost");
        ((Connector.Argument)map.get("port")).setValue(string);
        this.a = attachingConnector.attach(map);
        EventRequestManager eventRequestManager = this.a.eventRequestManager();
        this.b = a.a(eventRequestManager, f);
    }

    private Connector a(String string) throws IOException {
        List list = Bootstrap.virtualMachineManager().allConnectors();
        for (Connector connector : list) {
            if (!connector.name().equals(string)) continue;
            return connector;
        }
        throw new IOException("Not found: " + string);
    }

    private static MethodEntryRequest a(EventRequestManager eventRequestManager, String string) {
        MethodEntryRequest methodEntryRequest = eventRequestManager.createMethodEntryRequest();
        methodEntryRequest.addClassFilter(string);
        methodEntryRequest.setSuspendPolicy(1);
        return methodEntryRequest;
    }

    private void a(EventRequestManager eventRequestManager, MethodEntryRequest methodEntryRequest) {
        eventRequestManager.deleteEventRequest((EventRequest)methodEntryRequest);
    }

    public void a(String string, byte[] arrby) {
        ReferenceType referenceType = this.b(string);
        HashMap<ReferenceType, byte[]> hashMap = new HashMap<ReferenceType, byte[]>();
        hashMap.put(referenceType, arrby);
        this.a(hashMap, string);
    }

    public void a(Map map) {
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        HashMap hashMap = new HashMap();
        String string = null;
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            string = (String)entry.getKey();
            hashMap.put(this.b(string), entry.getValue());
        }
        if (string != null) {
            this.a(hashMap, string + " etc.");
        }
    }

    private ReferenceType b(String string) {
        List list = this.a.classesByName(string);
        if (list == null || list.isEmpty()) {
            throw new RuntimeException("no such class: " + string);
        }
        return (ReferenceType)list.get(0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(Map map, String string) {
        c c2 = this.d;
        synchronized (c2) {
            this.c();
            this.c = map;
            this.b.enable();
            this.d.a();
            this.b.disable();
            Map map2 = this.c;
            if (map2 != null) {
                this.c = null;
                throw new RuntimeException("failed to reload: " + string);
            }
        }
    }

    private void c() {
        new b(this).start();
    }

    EventSet a() throws InterruptedException {
        EventQueue eventQueue = this.a.eventQueue();
        return eventQueue.remove();
    }

    void b() {
        Map map = this.c;
        this.a.redefineClasses(map);
        this.c = null;
    }
}

