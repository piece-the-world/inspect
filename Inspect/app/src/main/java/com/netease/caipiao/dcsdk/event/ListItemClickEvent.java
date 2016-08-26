package com.netease.caipiao.dcsdk.event;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.protobuf.MessageLite;
import com.netease.caipiao.dcsdk.BuildConfig;
import com.netease.caipiao.dcsdk.Sprite;
import com.netease.caipiao.dcsdk.event.ProtoEvent.ListItemClickMsg;
import com.netease.caipiao.dcsdk.event.ProtoEvent.ListItemClickMsg.Builder;
import com.netease.caipiao.dcsdk.event.ProtoEvent.ViewItem;
import com.netease.caipiao.dcsdk.event.utils.EventUtils;

public class ListItemClickEvent extends Event {
    private int height;
    private String indexPath;
    private String viewClassName;
    private String viewId;
    private String viewText;
    private int width;
    private int f706x;
    private int f707y;

    public ListItemClickEvent() {
        this.viewText = BuildConfig.FLAVOR;
        this.viewClassName = BuildConfig.FLAVOR;
        this.viewId = BuildConfig.FLAVOR;
        this.indexPath = BuildConfig.FLAVOR;
    }

    public short getType() {
        return (short) 4;
    }

    public MessageLite toMessage() {
        Builder builder = ListItemClickMsg.newBuilder().setEventName(getEventName()).setView(ViewItem.newBuilder().setViewClass(this.viewClassName).setFrame("{" + this.f706x + "," + this.f707y + "," + this.width + "," + this.height + "}").setTitle(this.viewText).build()).setAppKey(Sprite.getInstance().getAppKey()).setDeviceId(Sprite.getInstance().getDeviceId()).setSessionId(Sprite.getInstance().getSessionId()).setPage(getPageName()).setIndexPath(getIndexPath()).setEventTime(getTime() + BuildConfig.FLAVOR);
        if (getInfo() != null && getInfo().size() > 0) {
            builder.addAllItem(getInfo());
        }
        return builder.build();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("  ViewText:");
        sb.append(this.viewText);
        sb.append("  ViewClassName:");
        sb.append(this.viewClassName);
        sb.append("  ViewId:");
        sb.append(this.viewId);
        sb.append("  x:");
        sb.append(this.f706x);
        sb.append("  y:");
        sb.append(this.f707y);
        sb.append("  Width:");
        sb.append(this.width);
        sb.append("  Height:");
        sb.append(this.height);
        sb.append("  indexPath:");
        sb.append(this.indexPath);
        return sb.toString();
    }

    public static Event fromItemClick(View view, int section, long position) {
        ListItemClickEvent event = fromView(view, section, position);
        event.setEventName(EventType.LIST_ITEM_CLICK.getEventName());
        return event;
    }

    public static Event fromItemLongClick(View view, int position, long id) {
        ListItemClickEvent event = fromView(view, position, id);
        event.setEventName(EventType.LIST_ITEM_LONG_CLICK.getEventName());
        return event;
    }

    private static ListItemClickEvent fromView(View view, int section, long position) {
        ListItemClickEvent event = new ListItemClickEvent();
        event.setTime(System.currentTimeMillis());
        event.setPageName(EventUtils.getPageName(view));
        if (view instanceof TextView) {
            String text = ((TextView) view).getText().toString();
            if (!TextUtils.isEmpty(Event.trim(text))) {
                event.setViewText(text);
            }
        }
        event.setViewClassName(view.getClass().getSimpleName());
        int[] location = new int[2];
        view.getLocationOnScreen(location);
        event.setX(location[0]);
        event.setY(location[1]);
        event.setWidth(view.getWidth());
        event.setHeight(view.getHeight());
        event.setIndexPath(String.format("[%d,%d]", new Object[]{Integer.valueOf(section), Long.valueOf(position)}));
        try {
            event.setViewId(view.getContext().getResources().getResourceEntryName(view.getId()));
        } catch (Exception e) {
        }
        return event;
    }

    public String getViewText() {
        return this.viewText;
    }

    public void setViewText(String viewText) {
        this.viewText = viewText;
    }

    public String getViewClassName() {
        return this.viewClassName;
    }

    public void setViewClassName(String viewClassName) {
        this.viewClassName = viewClassName;
    }

    public int getX() {
        return this.f706x;
    }

    public void setX(int x) {
        this.f706x = x;
    }

    public int getY() {
        return this.f707y;
    }

    public void setY(int y) {
        this.f707y = y;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getViewId() {
        return this.viewId;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    public String getIndexPath() {
        return this.indexPath;
    }

    public void setIndexPath(String indexPath) {
        this.indexPath = indexPath;
    }
}
