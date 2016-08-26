package com.netease.caipiao.dcsdk.callback;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.netease.caipiao.dcsdk.callback.agent.ViewInfoAgent;
import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.event.EventCache;

public class OnItemLongClickListenerImpl extends CallbackImpl<OnItemLongClickListener> implements OnItemLongClickListener {
    private long id;
    private int positon;

    public OnItemLongClickListenerImpl(OnItemLongClickListener onItemLongClickListener) {
        super(onItemLongClickListener);
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        ViewInfoAgent.toastViewPath(view);
        if (this.callback == null) {
            return false;
        }
        this.positon = i;
        this.id = l;
        EventCache.getInstance().add(amendEvent(buildEvent(view), view));
        return ((OnItemLongClickListener) this.callback).onItemLongClick(adapterView, view, i, l);
    }

    protected Event buildEvent(View view) {
        return Event.fromItemLongClick(view, this.positon, this.id);
    }
}
