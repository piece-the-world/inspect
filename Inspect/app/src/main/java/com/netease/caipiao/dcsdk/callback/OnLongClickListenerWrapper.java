package com.netease.caipiao.dcsdk.callback;

import android.view.View;
import android.view.View.OnLongClickListener;

public class OnLongClickListenerWrapper<U extends CallbackImpl<OnLongClickListener> & OnLongClickListener> implements OnLongClickListener {
    private U f555u;

    public OnLongClickListenerWrapper(U u) {
        this.f555u = u;
    }

    public boolean onLongClick(View view) {
        if (this.f555u != null) {
            return ((OnLongClickListener) this.f555u).onLongClick(view);
        }
        return false;
    }

    public OnLongClickListener getOnLongClickListener() {
        return this.f555u != null ? (OnLongClickListener) this.f555u.callback : null;
    }
}
