package com.netease.caipiao.dcsdk.callback.agent;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import com.netease.caipiao.dcsdk.Sprite;
import com.netease.caipiao.dcsdk.callback.CallbackType;
import com.netease.caipiao.dcsdk.callback.OnChildClickListenerImpl;
import com.netease.caipiao.dcsdk.callback.OnChildClickListenerWrapper;
import com.netease.caipiao.dcsdk.callback.OnClickListenerImpl;
import com.netease.caipiao.dcsdk.callback.OnClickListenerWrapper;
import com.netease.caipiao.dcsdk.callback.OnGroupClickListenerImpl;
import com.netease.caipiao.dcsdk.callback.OnGroupClickListenerWrapper;
import com.netease.caipiao.dcsdk.callback.OnHierarchyChangeListenerImpl;
import com.netease.caipiao.dcsdk.callback.OnHierarchyChangeListenerWrapper;
import com.netease.caipiao.dcsdk.callback.OnItemClickListenerImpl;
import com.netease.caipiao.dcsdk.callback.OnItemClickListenerWrapper;
import com.netease.caipiao.dcsdk.callback.OnItemLongClickListenerImpl;
import com.netease.caipiao.dcsdk.callback.OnItemLongClickListenerWrapper;
import com.netease.caipiao.dcsdk.callback.OnLongClickListenerImpl;
import com.netease.caipiao.dcsdk.callback.OnLongClickListenerWrapper;
import com.netease.caipiao.dcsdk.customdata.CustomDataManager;
import com.netease.caipiao.dcsdk.event.EventType;
import com.netease.caipiao.dcsdk.log.Logger;
import com.netease.caipiao.dcsdk.log.Tags;
import com.netease.caipiao.dcsdk.proxy.WebViewClientProxy;
import com.netease.caipiao.dcsdk.utils.FieldUtils;
import com.netease.caipiao.dcsdk.utils.ReflectHelper;

public class CallbackAgent {
    private CallbackAgent() {
    }

    public static void replaceCallbacks(View view) {
        if (view != null) {
            ViewInfoAgent.signChildren(view);
            replaceCallbacksInternal(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    replaceCallbacks(viewGroup.getChildAt(i));
                }
            }
        }
    }

    public static void restoreCallbacks(View view) {
        if (view != null) {
            restoreCallbacksInternal(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    restoreCallbacks(viewGroup.getChildAt(i));
                }
            }
        }
    }

    private static void replaceCallbacksInternal(View view) {
        if (view instanceof WebView) {
            replaceWebViewClient((WebView) view);
            return;
        }
        replaceExpandableListViewListeners(view);
        replaceAdapterViewListeners(view);
        replaceViewGroupListeners(view);
        replaceViewListeners(view);
    }

    private static void restoreCallbacksInternal(View view) {
        if (view instanceof WebView) {
            restoreWebViewClient((WebView) view);
            return;
        }
        restoreExpandableListViewListeners(view);
        restoreAdapterViewListeners(view);
        restoreViewGroupListeners(view);
        restoreViewListeners(view);
    }

    private static void replaceExpandableListViewListeners(View view) {
        if (view instanceof ExpandableListView) {
            OnChildClickListener onChildClickListener = null;
            try {
                onChildClickListener = (OnChildClickListener) FieldUtils.readField((Object) view, CallbackType.ON_CHILD_CLICK.getCallbackName());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (!(onChildClickListener == null || (onChildClickListener instanceof OnChildClickListenerWrapper))) {
                OnChildClickListenerImpl onChildClickListenerImpl = new OnChildClickListenerImpl(onChildClickListener);
                onChildClickListenerImpl.setEventAmendListeners(Sprite.getInstance().getEventAmendListenerManager().matchedListeners(view, EventType.valueOf(CallbackType.ON_CHILD_CLICK)));
                CustomDataManager.INSTANCE.matchAndSet(view, EventType.valueOf(CallbackType.ON_CHILD_CLICK), onChildClickListenerImpl);
                ((ExpandableListView) view).setOnChildClickListener(new OnChildClickListenerWrapper(onChildClickListenerImpl));
            }
            OnGroupClickListener onGroupClickListener = null;
            try {
                onGroupClickListener = (OnGroupClickListener) FieldUtils.readField((Object) view, CallbackType.ON_GROUP_CLICK.getCallbackName());
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
            if (onGroupClickListener != null && !(onGroupClickListener instanceof OnGroupClickListenerWrapper)) {
                OnGroupClickListenerImpl onGroupClickListenerImpl = new OnGroupClickListenerImpl(onGroupClickListener);
                onGroupClickListenerImpl.setEventAmendListeners(Sprite.getInstance().getEventAmendListenerManager().matchedListeners(view, EventType.valueOf(CallbackType.ON_GROUP_CLICK)));
                CustomDataManager.INSTANCE.matchAndSet(view, EventType.valueOf(CallbackType.ON_GROUP_CLICK), onGroupClickListenerImpl);
                ((ExpandableListView) view).setOnGroupClickListener(new OnGroupClickListenerWrapper(onGroupClickListenerImpl));
            }
        }
    }

    private static void restoreExpandableListViewListeners(View view) {
        if (view instanceof ExpandableListView) {
            OnChildClickListener onChildClickListener = null;
            try {
                onChildClickListener = (OnChildClickListener) FieldUtils.readField((Object) view, CallbackType.ON_CHILD_CLICK.getCallbackName());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (onChildClickListener != null && (onChildClickListener instanceof OnChildClickListenerWrapper)) {
                OnChildClickListener actualListener = ((OnChildClickListenerWrapper) onChildClickListener).getOnChildClickListener();
                if (actualListener != null) {
                    ((ExpandableListView) view).setOnChildClickListener(actualListener);
                }
            }
            OnGroupClickListener onGroupClickListener = null;
            try {
                onGroupClickListener = (OnGroupClickListener) FieldUtils.readField((Object) view, CallbackType.ON_GROUP_CLICK.getCallbackName());
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
            if (onGroupClickListener != null && (onGroupClickListener instanceof OnGroupClickListenerWrapper)) {
                OnGroupClickListener actualListener2 = ((OnGroupClickListenerWrapper) onGroupClickListener).getOnGroupClickListener();
                if (actualListener2 != null) {
                    ((ExpandableListView) view).setOnGroupClickListener(actualListener2);
                }
            }
        }
    }

    private static void replaceAdapterViewListeners(View view) {
        if (view instanceof AdapterView) {
            OnItemClickListener onItemClickListener = null;
            try {
                onItemClickListener = (OnItemClickListener) FieldUtils.readField((Object) view, CallbackType.ON_ITEM_CLICK.getCallbackName());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (!(onItemClickListener == null || (onItemClickListener instanceof OnItemClickListenerWrapper))) {
                OnItemClickListenerImpl itemClickListenerImpl = new OnItemClickListenerImpl(onItemClickListener);
                itemClickListenerImpl.setEventAmendListeners(Sprite.getInstance().getEventAmendListenerManager().matchedListeners(view, EventType.valueOf(CallbackType.ON_ITEM_CLICK)));
                CustomDataManager.INSTANCE.matchAndSet(view, EventType.valueOf(CallbackType.ON_ITEM_CLICK), itemClickListenerImpl);
                ((AdapterView) view).setOnItemClickListener(new OnItemClickListenerWrapper(itemClickListenerImpl));
            }
            OnItemLongClickListener onItemLongClickListener = null;
            try {
                onItemLongClickListener = (OnItemLongClickListener) FieldUtils.readField((Object) view, CallbackType.ON_ITEM_LONG_CLICK.getCallbackName());
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
            if (onItemLongClickListener != null && !(onItemLongClickListener instanceof OnItemLongClickListenerWrapper)) {
                OnItemLongClickListenerImpl itemLongClickListenerImpl = new OnItemLongClickListenerImpl(onItemLongClickListener);
                itemLongClickListenerImpl.setEventAmendListeners(Sprite.getInstance().getEventAmendListenerManager().matchedListeners(view, EventType.valueOf(CallbackType.ON_ITEM_LONG_CLICK)));
                ((AdapterView) view).setOnItemLongClickListener(new OnItemLongClickListenerWrapper(itemLongClickListenerImpl));
            }
        }
    }

    private static void restoreAdapterViewListeners(View view) {
        if (view instanceof AdapterView) {
            OnItemClickListener onItemClickListener = null;
            try {
                onItemClickListener = (OnItemClickListener) FieldUtils.readField((Object) view, CallbackType.ON_ITEM_CLICK.getCallbackName());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (onItemClickListener != null && (onItemClickListener instanceof OnItemClickListenerWrapper)) {
                OnItemClickListener actualListener = ((OnItemClickListenerWrapper) onItemClickListener).getOnItemClickListener();
                if (actualListener != null && (view instanceof AdapterView)) {
                    ((AdapterView) view).setOnItemClickListener(actualListener);
                }
            }
            OnItemLongClickListener onItemLongClickListener = null;
            try {
                onItemLongClickListener = (OnItemLongClickListener) FieldUtils.readField((Object) view, CallbackType.ON_ITEM_LONG_CLICK.getCallbackName());
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
            if (onItemLongClickListener != null && (onItemLongClickListener instanceof OnItemLongClickListenerWrapper)) {
                OnItemLongClickListener actualListener2 = ((OnItemLongClickListenerWrapper) onItemLongClickListener).getOnItemLongClickListener();
                if (actualListener2 != null && (view instanceof AdapterView)) {
                    ((AdapterView) view).setOnItemLongClickListener(actualListener2);
                }
            }
        }
    }

    private static void replaceViewGroupListeners(View view) {
        if (view instanceof ViewGroup) {
            OnHierarchyChangeListener onHierarchyChangeListener = null;
            try {
                onHierarchyChangeListener = (OnHierarchyChangeListener) FieldUtils.readField((Object) view, CallbackType.ON_HIERARCHY_CHANGE.getCallbackName());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (onHierarchyChangeListener == null) {
                ((ViewGroup) view).setOnHierarchyChangeListener(new OnHierarchyChangeListenerWrapper(new OnHierarchyChangeListenerImpl(null)));
            } else if (!(onHierarchyChangeListener instanceof OnHierarchyChangeListenerWrapper)) {
                ((ViewGroup) view).setOnHierarchyChangeListener(new OnHierarchyChangeListenerWrapper(new OnHierarchyChangeListenerImpl(onHierarchyChangeListener)));
            }
        }
    }

    private static void restoreViewGroupListeners(View view) {
        if (view instanceof ViewGroup) {
            OnHierarchyChangeListener onHierarchyChangeListener = null;
            try {
                onHierarchyChangeListener = (OnHierarchyChangeListener) FieldUtils.readField((Object) view, CallbackType.ON_HIERARCHY_CHANGE.getCallbackName());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (onHierarchyChangeListener != null && (onHierarchyChangeListener instanceof OnHierarchyChangeListenerWrapper)) {
                ((ViewGroup) view).setOnHierarchyChangeListener(((OnHierarchyChangeListenerWrapper) onHierarchyChangeListener).getOnHierarchyChangeListener());
            }
        }
    }

    private static void replaceViewListeners(View view) {
        if (view != null && !(view instanceof AdapterView) && !inClickBlackList(view)) {
            Object mListenerInfo = null;
            try {
                mListenerInfo = FieldUtils.readField((Object) view, "mListenerInfo");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (mListenerInfo != null) {
                OnClickListener onClickListener = null;
                try {
                    onClickListener = (OnClickListener) FieldUtils.readField(mListenerInfo, CallbackType.ON_CLICK.getCallbackName());
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
                if (!(onClickListener == null || (onClickListener instanceof OnClickListenerWrapper))) {
                    OnClickListenerImpl clickListenerImpl = new OnClickListenerImpl(onClickListener);
                    clickListenerImpl.setEventAmendListeners(Sprite.getInstance().getEventAmendListenerManager().matchedListeners(view, EventType.valueOf(CallbackType.ON_CLICK)));
                    CustomDataManager.INSTANCE.matchAndSet(view, EventType.valueOf(CallbackType.ON_CLICK), clickListenerImpl);
                    view.setOnClickListener(new OnClickListenerWrapper(clickListenerImpl));
                }
                OnLongClickListener onLongClickListener = null;
                try {
                    onLongClickListener = (OnLongClickListener) FieldUtils.readField(mListenerInfo, CallbackType.ON_LONG_CLICK.getCallbackName());
                } catch (IllegalAccessException e22) {
                    e22.printStackTrace();
                }
                if (onLongClickListener != null && !(onLongClickListener instanceof OnLongClickListenerWrapper)) {
                    OnLongClickListenerImpl longClickListenerImpl = new OnLongClickListenerImpl(onLongClickListener);
                    longClickListenerImpl.setEventAmendListeners(Sprite.getInstance().getEventAmendListenerManager().matchedListeners(view, EventType.valueOf(CallbackType.ON_LONG_CLICK)));
                    view.setOnLongClickListener(new OnLongClickListenerWrapper(longClickListenerImpl));
                }
            }
        }
    }

    private static void restoreViewListeners(View view) {
        if (view != null && !(view instanceof AdapterView) && !inClickBlackList(view)) {
            Object mListenerInfo = null;
            try {
                mListenerInfo = FieldUtils.readField((Object) view, "mListenerInfo");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (mListenerInfo != null) {
                OnClickListener onClickListener = null;
                try {
                    onClickListener = (OnClickListener) FieldUtils.readField(mListenerInfo, CallbackType.ON_CLICK.getCallbackName());
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
                if (onClickListener != null && (onClickListener instanceof OnClickListenerWrapper)) {
                    OnClickListener actualListener = ((OnClickListenerWrapper) onClickListener).getOnClickListener();
                    if (actualListener != null) {
                        view.setOnClickListener(actualListener);
                    }
                }
                OnLongClickListener onLongClickListener = null;
                try {
                    onLongClickListener = (OnLongClickListener) FieldUtils.readField(mListenerInfo, CallbackType.ON_LONG_CLICK.getCallbackName());
                } catch (IllegalAccessException e22) {
                    e22.printStackTrace();
                }
                if (onLongClickListener != null && (onLongClickListener instanceof OnLongClickListenerWrapper)) {
                    OnLongClickListener actualListener2 = ((OnLongClickListenerWrapper) onLongClickListener).getOnLongClickListener();
                    if (actualListener2 != null) {
                        view.setOnLongClickListener(actualListener2);
                    }
                }
            }
        }
    }

    private static void replaceWebViewClient(WebView webView) {
        Logger.debug(Tags.WEBVIEW_PROXY, "replaceWebViewClient", new Object[0]);
        try {
            Object webViewClientOwner;
            Object webViewClient;
            Object mProvider = ReflectHelper.getField(webView, null, "mProvider");
            if (VERSION.SDK_INT >= 19) {
                webViewClientOwner = ReflectHelper.getField(mProvider, null, "mContentsClientAdapter");
                webViewClient = ReflectHelper.getField(webViewClientOwner, null, "mWebViewClient");
            } else {
                webViewClientOwner = ReflectHelper.getField(mProvider, null, "mCallbackProxy");
                webViewClient = ReflectHelper.getField(webViewClientOwner, null, "mWebViewClient");
            }
            if (!(webViewClient instanceof WebViewClientProxy)) {
                ReflectHelper.setField(webViewClientOwner, null, "mWebViewClient", new WebViewClientProxy((WebViewClient) webViewClient, webView));
            }
        } catch (NoSuchFieldException e) {
            Logger.debug(Tags.WEBVIEW_PROXY, "NoSuchFieldException", new Object[0]);
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            Logger.debug(Tags.WEBVIEW_PROXY, "IllegalAccessException", new Object[0]);
            e2.printStackTrace();
        }
    }

    private static void restoreWebViewClient(WebView webView) {
        Logger.debug(Tags.WEBVIEW_PROXY, "restoreWebViewClient", new Object[0]);
        try {
            Object webViewClientOwner;
            Object webViewClient;
            Object mProvider = ReflectHelper.getField(webView, null, "mProvider");
            if (VERSION.SDK_INT >= 19) {
                webViewClientOwner = ReflectHelper.getField(mProvider, null, "mContentsClientAdapter");
                webViewClient = ReflectHelper.getField(webViewClientOwner, null, "mWebViewClient");
            } else {
                webViewClientOwner = ReflectHelper.getField(mProvider, null, "mCallbackProxy");
                webViewClient = ReflectHelper.getField(webViewClientOwner, null, "mWebViewClient");
            }
            if (webViewClient instanceof WebViewClientProxy) {
                ReflectHelper.setField(webViewClientOwner, null, "mWebViewClient", ((WebViewClientProxy) webViewClient).getWebViewClient());
            }
        } catch (NoSuchFieldException e) {
            Logger.debug(Tags.WEBVIEW_PROXY, "NoSuchFieldException", new Object[0]);
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            Logger.debug(Tags.WEBVIEW_PROXY, "IllegalAccessException", new Object[0]);
            e2.printStackTrace();
        }
    }

    private static boolean inClickBlackList(View view) {
        if (view instanceof AutoCompleteTextView) {
            return true;
        }
        return false;
    }
}
