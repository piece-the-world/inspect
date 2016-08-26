package com.netease.caipiao.dcsdk.callback;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.growingio.android.sdk.agent.VdsAgent;
import com.growingio.android.sdk.instrumentation.Instrumented;
import com.netease.caipiao.dcsdk.callback.agent.ViewInfoAgent;
import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.event.EventCache;

public class OnItemClickListenerImpl extends CallbackImpl<OnItemClickListener> implements OnItemClickListener {
    private int positon;

    public OnItemClickListenerImpl(OnItemClickListener onItemClickListener) {
        super(onItemClickListener);
    }

    @Instrumented
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        VdsAgent.onItemClick(this, adapterView, view, i, j);
        ViewInfoAgent.toastViewPath(view);
        if (this.callback != null) {
            this.positon = i;
            Event event = amendEvent(buildEvent(view), view);
            collectCustomData(event, view);
            EventCache.getInstance().add(event);
            ((OnItemClickListener) this.callback).onItemClick(adapterView, view, i, j);
        }
    }

    protected Event buildEvent(View view) {
        return Event.fromItemClick(view, -1, (long) this.positon);
    }
}
