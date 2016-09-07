/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.gh;
import com.tendcloud.tenddata.gi;
import com.tendcloud.tenddata.gj;
import com.tendcloud.tenddata.gk;
import com.tendcloud.tenddata.gl;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

final class gg {
    private static volatile gg a = null;
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final ThreadLocal c;
    private final ThreadLocal d;
    private final Map e;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static gg a() {
        if (a != null) return a;
        reference var0 = gg.class;
        synchronized (gg.class) {
            if (a != null) return a;
            {
                a = new gg();
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return a;
        }
    }

    private gg() {
        this.c = new gh(this);
        this.d = new gi(this);
        this.e = new HashMap();
    }

    public void register(Object object) {
        if (object == null) {
            return;
        }
        Map map = gj.a(object);
        for (Class class_ : map.keySet()) {
            CopyOnWriteArraySet copyOnWriteArraySet;
            CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet)this.b.get(class_);
            if (copyOnWriteArraySet2 == null && (copyOnWriteArraySet2 = (Set)this.b.putIfAbsent(class_, copyOnWriteArraySet = new CopyOnWriteArraySet())) == null) {
                copyOnWriteArraySet2 = copyOnWriteArraySet;
            }
            if (copyOnWriteArraySet2.addAll(copyOnWriteArraySet = (Set)map.get(class_))) continue;
            throw new IllegalArgumentException("Object already registered.");
        }
    }

    public void unregister(Object object) {
        if (object == null) {
            throw new NullPointerException("Object to unregister must not be null.");
        }
        Map map = gj.a(object);
        for (Map.Entry entry : map.entrySet()) {
            Set set = this.a((Class)entry.getKey());
            Collection collection = (Collection)entry.getValue();
            if (set == null || !set.containsAll(collection)) {
                throw new IllegalArgumentException("Missing event handler for a method. Is " + object.getClass() + " registered?");
            }
            for (gk gk2 : set) {
                if (!collection.contains(gk2)) continue;
                gk2.b();
            }
            set.removeAll(collection);
        }
    }

    public void post(Object object) {
        if (object == null) {
            throw new NullPointerException("Event to post must not be null.");
        }
        Set set = this.b(object.getClass());
        boolean bl2 = false;
        for (Class class_ : set) {
            Set set2 = this.a(class_);
            if (set2 == null || set2.isEmpty()) continue;
            bl2 = true;
            for (gk gk2 : set2) {
                this.a(object, gk2);
            }
        }
        if (!bl2 && !(object instanceof gl)) {
            this.post(new gl(this, object));
        }
        this.b();
    }

    protected void a(Object object, gk gk2) {
        ((ConcurrentLinkedQueue)this.c.get()).offer(new a(object, gk2));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void b() {
        if (((Boolean)this.d.get()).booleanValue()) {
            return;
        }
        this.d.set(true);
        try {
            a a2;
            while ((a2 = (a)((ConcurrentLinkedQueue)this.c.get()).poll()) != null) {
                if (!a2.b.a()) continue;
                this.b(a2.a, a2.b);
            }
        }
        finally {
            this.d.set(false);
        }
    }

    protected void b(Object object, gk gk2) {
        try {
            gk2.handleEvent(object);
        }
        catch (InvocationTargetException var3_3) {
            gg.a("Could not dispatch event: " + object.getClass() + " to handler " + gk2, var3_3);
        }
    }

    Set a(Class class_) {
        return (Set)this.b.get(class_);
    }

    Set b(Class class_) {
        Set set = (Set)this.e.get(class_);
        if (set == null) {
            set = this.c(class_);
            this.e.put(class_, set);
        }
        return set;
    }

    private Set c(Class class_) {
        LinkedList linkedList = new LinkedList();
        HashSet<Class> hashSet = new HashSet<Class>();
        linkedList.add(class_);
        while (!linkedList.isEmpty()) {
            Class class_2 = (Class)linkedList.remove(0);
            hashSet.add(class_2);
            Class class_3 = class_2.getSuperclass();
            if (class_3 == null) continue;
            linkedList.add(class_3);
        }
        return hashSet;
    }

    private static void a(String string, InvocationTargetException invocationTargetException) {
        Throwable throwable = invocationTargetException.getCause();
        if (throwable != null) {
            throw new RuntimeException(string + ": " + throwable.getMessage(), throwable);
        }
        throw new RuntimeException(string + ": " + invocationTargetException.getMessage(), invocationTargetException);
    }

    static class a {
        final Object a;
        final gk b;

        public a(Object object, gk gk2) {
            this.a = object;
            this.b = gk2;
        }
    }

}

