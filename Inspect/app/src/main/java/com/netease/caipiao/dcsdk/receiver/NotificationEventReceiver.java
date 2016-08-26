package com.netease.caipiao.dcsdk.receiver;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.netease.caipiao.dcsdk.constants.Constants;
import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.event.EventCache;
import com.netease.caipiao.dcsdk.log.Logger;
import com.netease.caipiao.dcsdk.log.Tags;

public class NotificationEventReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Logger.debug(Tags.NOTIFICATION, "NotificationEventReceiver:onReceive", new Object[0]);
        Parcelable pendingIntent = intent.getParcelableExtra(Constants.KEY_PENDING_INTENT);
        if (pendingIntent instanceof PendingIntent) {
            try {
                ((PendingIntent) pendingIntent).send();
                Logger.debug(Tags.NOTIFICATION, "NotificationEventReceiver:transpond pendingintent", new Object[0]);
            } catch (CanceledException e) {
                e.printStackTrace();
            }
        }
        String msg = intent.getStringExtra(Constants.KEY_NOTIFICATION_CONTENT);
        if (msg == null) {
            msg = "obtain notification content message failed !";
        }
        EventCache.getInstance().add(Event.fromPush(msg));
    }
}
