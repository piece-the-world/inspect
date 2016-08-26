package com.netease.caipiao.dcsdk.callback;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

public class WindowCallbackWrapper implements Callback {
    private Callback callback;

    public WindowCallbackWrapper(Callback callback, Context context) {
        this.callback = new WindowCallbackImpl(callback, context);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.callback.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.callback.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.callback.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.callback.dispatchTrackballEvent(motionEvent);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.callback.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Nullable
    public View onCreatePanelView(int i) {
        return this.callback.onCreatePanelView(i);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.callback.onCreatePanelMenu(i, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.callback.onPreparePanel(i, view, menu);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.callback.onMenuOpened(i, menu);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.callback.onMenuItemSelected(i, menuItem);
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        this.callback.onWindowAttributesChanged(layoutParams);
    }

    public void onContentChanged() {
        this.callback.onContentChanged();
    }

    public void onWindowFocusChanged(boolean b) {
        this.callback.onWindowFocusChanged(b);
    }

    public void onAttachedToWindow() {
        this.callback.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.callback.onDetachedFromWindow();
    }

    public void onPanelClosed(int i, Menu menu) {
        this.callback.onPanelClosed(i, menu);
    }

    public boolean onSearchRequested() {
        return this.callback.onSearchRequested();
    }

    @TargetApi(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.callback.onSearchRequested(searchEvent);
    }

    @Nullable
    public ActionMode onWindowStartingActionMode(ActionMode.Callback cb) {
        return this.callback.onWindowStartingActionMode(cb);
    }

    @Nullable
    @TargetApi(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback cb, int i) {
        return this.callback.onWindowStartingActionMode(cb, i);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.callback.onActionModeStarted(actionMode);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.callback.onActionModeFinished(actionMode);
    }
}
