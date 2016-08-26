package com.netease.caipiao.dcsdk.callback;

import android.view.View;
import com.netease.caipiao.dcsdk.customdata.CustomDataManager;
import com.netease.caipiao.dcsdk.customdata.type.DataPath;
import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.event.EventAmendDescription;
import com.netease.caipiao.dcsdk.event.OnEventAmendListener;
import com.netease.caipiao.dcsdk.event.ProtoEvent.MapItem;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public abstract class CallbackImpl<T> {
    protected T callback;
    protected List<DataPath> customDataPathes;
    protected Map<EventAmendDescription, OnEventAmendListener> eventAmendListeners;

    protected abstract Event buildEvent(View view);

    public CallbackImpl(T t) {
        this.callback = t;
    }

    protected List<MapItem> buildInfo(EventAmendDescription description, View view) {
        return null;
    }

    protected Event amendEvent(Event event, View view) {
        if (this.eventAmendListeners != null && this.eventAmendListeners.size() > 0) {
            for (Entry<EventAmendDescription, OnEventAmendListener> entry : this.eventAmendListeners.entrySet()) {
                event = ((OnEventAmendListener) entry.getValue()).onEventAmend(view, event, (EventAmendDescription) entry.getKey(), buildInfo((EventAmendDescription) entry.getKey(), view));
            }
        }
        return event;
    }

    protected void collectCustomData(Event event, View view) {
        CustomDataManager.INSTANCE.collectCustomData(event, view, this.customDataPathes);
    }

    public T getCallback() {
        return this.callback;
    }

    public void setCallback(T callback) {
        this.callback = callback;
    }

    public Map<EventAmendDescription, OnEventAmendListener> getEventAmendListeners() {
        return this.eventAmendListeners;
    }

    public void setEventAmendListeners(Map<EventAmendDescription, OnEventAmendListener> eventAmendListeners) {
        this.eventAmendListeners = eventAmendListeners;
    }

    public List<DataPath> getCustomDataPathes() {
        return this.customDataPathes;
    }

    public void setCustomDataPathes(List<DataPath> customDataPathes) {
        this.customDataPathes = customDataPathes;
    }
}
