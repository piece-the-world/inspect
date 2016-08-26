package com.netease.caipiao.dcsdk.event;

import java.util.List;

public class EventCache {
    private static EventCache ourInstance;
    private EventRamCache<Event> events;

    static {
        ourInstance = new EventCache();
    }

    public static EventCache getInstance() {
        return ourInstance;
    }

    private EventCache() {
        this.events = new EventRamCache();
    }

    public void add(Event event) {
        this.events.add(event);
    }

    public List<Event> getEvents() {
        return this.events.getEvents();
    }
}
