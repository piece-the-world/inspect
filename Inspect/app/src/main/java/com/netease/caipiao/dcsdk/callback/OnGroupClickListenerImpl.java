package com.netease.caipiao.dcsdk.callback;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;
import com.growingio.android.sdk.agent.VdsAgent;
import com.growingio.android.sdk.instrumentation.Instrumented;
import com.netease.caipiao.dcsdk.callback.agent.ViewInfoAgent;
import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.event.EventCache;

public class OnGroupClickListenerImpl extends CallbackImpl<OnGroupClickListener> implements OnGroupClickListener {
    private int section;

    public OnGroupClickListenerImpl(OnGroupClickListener onGroupClickListener) {
        super(onGroupClickListener);
    }

    protected Event buildEvent(View view) {
        return Event.fromItemClick(view, this.section, -1);
    }

    @Instrumented
    public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        VdsAgent.onGroupClick(this, expandableListView, view, i, j);
        ViewInfoAgent.toastViewPath(view);
        if (this.callback == null) {
            return false;
        }
        this.section = i;
        Event event = amendEvent(buildEvent(view), view);
        collectCustomData(event, view);
        EventCache.getInstance().add(event);
        return ((OnGroupClickListener) this.callback).onGroupClick(expandableListView, view, i, j);
    }
}
