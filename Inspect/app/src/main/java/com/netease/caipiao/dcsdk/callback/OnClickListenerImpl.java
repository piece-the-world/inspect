package com.netease.caipiao.dcsdk.callback;

import android.view.View;
import android.view.View.OnClickListener;
import com.growingio.android.sdk.agent.VdsAgent;
import com.growingio.android.sdk.instrumentation.Instrumented;
import com.netease.caipiao.dcsdk.callback.agent.ViewInfoAgent;
import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.event.EventCache;

public class OnClickListenerImpl extends CallbackImpl<OnClickListener> implements OnClickListener {
    public OnClickListenerImpl(OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Instrumented
    public void onClick(View view) {
        VdsAgent.onClick(this, view);
        ViewInfoAgent.toastViewPath(view);
        if (this.callback != null) {
            Event event = amendEvent(buildEvent(view), view);
            collectCustomData(event, view);
            EventCache.getInstance().add(event);
            ((OnClickListener) this.callback).onClick(view);
        }
    }

    protected Event buildEvent(View view) {
        return Event.fromClick(view);
    }
}
