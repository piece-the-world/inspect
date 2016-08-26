package com.netease.caipiao.dcsdk.event;

import android.view.View;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EventAmendListenerManager {
    private Map<EventAmendDescription, OnEventAmendListener> eventAmendListeners;

    public EventAmendListenerManager() {
        this.eventAmendListeners = new HashMap();
    }

    public void addEventAmendListener(EventAmendDescription description, OnEventAmendListener listener) {
        if (!this.eventAmendListeners.containsKey(description) && listener != null) {
            this.eventAmendListeners.put(description, listener);
        }
    }

    public void removeEventAmendListener(EventAmendDescription description) {
        this.eventAmendListeners.remove(description);
    }

    public Map<EventAmendDescription, OnEventAmendListener> matchedListeners(View view, EventType type) {
        if (this.eventAmendListeners == null || this.eventAmendListeners.size() <= 0) {
            return null;
        }
        Map<EventAmendDescription, OnEventAmendListener> hashMap = new HashMap();
        for (Entry<EventAmendDescription, OnEventAmendListener> entry : this.eventAmendListeners.entrySet()) {
            if (((EventAmendDescription) entry.getKey()).fit(view, type)) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }
}
