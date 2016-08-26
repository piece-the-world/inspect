package com.netease.caipiao.dcsdk.callback;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;

public class OnItemLongClickListenerWrapper<U extends CallbackImpl<OnItemLongClickListener> & OnItemLongClickListener> implements OnItemLongClickListener {
    private U f554u;

    public OnItemLongClickListenerWrapper(U u) {
        this.f554u = u;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        if (this.f554u != null) {
            return ((OnItemLongClickListener) this.f554u).onItemLongClick(adapterView, view, i, l);
        }
        return false;
    }

    public OnItemLongClickListener getOnItemLongClickListener() {
        return this.f554u != null ? (OnItemLongClickListener) this.f554u.callback : null;
    }
}
