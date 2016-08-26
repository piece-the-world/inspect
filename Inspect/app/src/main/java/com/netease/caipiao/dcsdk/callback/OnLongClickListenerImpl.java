package com.netease.caipiao.dcsdk.callback;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.netease.caipiao.dcsdk.callback.agent.ViewInfoAgent;
import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.event.EventCache;

public class OnLongClickListenerImpl extends CallbackImpl<OnLongClickListener> implements OnLongClickListener {
    public OnLongClickListenerImpl(OnLongClickListener onLongClickListener) {
        super(onLongClickListener);
    }

    public boolean onLongClick(View view) {
        ViewInfoAgent.toastViewPath(view);
        if (this.callback == null) {
            return false;
        }
        EventCache.getInstance().add(amendEvent(buildEvent(view), view));
        return ((OnLongClickListener) this.callback).onLongClick(view);
    }

    protected Event buildEvent(View view) {
        return Event.fromLongClick(view);
    }
}
