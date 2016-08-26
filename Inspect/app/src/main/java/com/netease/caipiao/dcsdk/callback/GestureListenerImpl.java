package com.netease.caipiao.dcsdk.callback;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.event.EventCache;
import com.netease.caipiao.dcsdk.event.utils.EventUtils;

/* compiled from: WindowCallbackImpl */
class GestureListenerImpl implements OnGestureListener {
    private Context context;
    private float distanceX;
    private float distanceY;
    private MotionEvent lastScrollEvent;
    private boolean scrolling;

    public GestureListenerImpl(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.context = context;
    }

    public void onUp(MotionEvent motionEvent) {
        if (this.scrolling) {
            EventCache.getInstance().add(Event.fromScroll(this.lastScrollEvent, motionEvent, this.distanceX, this.distanceY, EventUtils.getPageName(this.context)));
            Log.e("zyyin", "add scrolling event");
        }
    }

    public boolean onDown(MotionEvent motionEvent) {
        Log.e("zyyin", "onDown");
        this.scrolling = false;
        this.distanceY = 0.0f;
        this.distanceX = 0.0f;
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
        Log.e("zyyin", "onShowPress");
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        Log.e("zyyin", "onSingleTapUp");
        EventCache.getInstance().add(Event.fromSingleUpTap(motionEvent, EventUtils.getPageName(this.context)));
        return false;
    }

    public boolean onScroll(MotionEvent initDownEvent, MotionEvent currMoveEvent, float distanceX, float distanceY) {
        this.scrolling = true;
        this.lastScrollEvent = initDownEvent;
        this.distanceX += distanceX;
        this.distanceY += distanceY;
        Log.e("zyyin", "onScroll");
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        Log.e("zyyin", "onLongPress");
    }

    public boolean onFling(MotionEvent initDownEvent, MotionEvent lastUpEvent, float distanceX, float distanceY) {
        Log.e("zyyin", "onFling");
        return false;
    }
}
