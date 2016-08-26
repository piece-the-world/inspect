package com.netease.caipiao.dcsdk.callback;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import com.growingio.android.sdk.agent.VdsAgent;
import com.growingio.android.sdk.instrumentation.Instrumented;
import com.netease.caipiao.dcsdk.callback.agent.ViewInfoAgent;
import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.event.EventCache;

public class OnChildClickListenerImpl extends CallbackImpl<OnChildClickListener> implements OnChildClickListener {
    private long position;
    private int section;

    public OnChildClickListenerImpl(OnChildClickListener onChildClickListener) {
        super(onChildClickListener);
    }

    protected Event buildEvent(View view) {
        return Event.fromItemClick(view, this.section, this.position);
    }

    @Instrumented
    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        VdsAgent.onChildClick(this, expandableListView, view, i, i2, j);
        ViewInfoAgent.toastViewPath(view);
        if (this.callback == null) {
            return false;
        }
        this.section = i;
        this.position = (long) i2;
        Event event = amendEvent(buildEvent(view), view);
        collectCustomData(event, view);
        EventCache.getInstance().add(event);
        return ((OnChildClickListener) this.callback).onChildClick(expandableListView, view, i, i2, j);
    }
}
