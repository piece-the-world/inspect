package com.netease.caipiao.dcsdk.binderhook.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.netease.caipiao.dcsdk.Sprite;
import com.netease.caipiao.dcsdk.binderhook.BaseIInterfaceProxy;
import com.netease.caipiao.dcsdk.constants.Constants;
import com.netease.caipiao.dcsdk.log.Logger;
import com.netease.caipiao.dcsdk.log.Tags;
import com.netease.caipiao.dcsdk.utils.FieldUtils;
import java.lang.reflect.Method;
import java.util.List;

public class IInterfaceProxy extends BaseIInterfaceProxy {
    private int requestCode;

    public IInterfaceProxy(IBinder originBinder) {
        super(originBinder);
        this.requestCode = 0;
    }

    protected String getStubClassName() {
        return "android.app.INotificationManager$Stub";
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Logger.debug(Tags.HOOK, "method=%s,IInterfaceProxy:OnInvoke", method.getName());
        if ("enqueueNotificationWithTag".equals(method.getName()) && args != null && args.length > 0) {
            Object notification = null;
            for (Notification o : args) {
                if (o instanceof Notification) {
                    notification = o;
                }
            }
            if (notification != null) {
                PendingIntent pendingIntent = (PendingIntent) FieldUtils.readField(notification, "contentIntent");
                Intent intent = new Intent(Constants.ACTION_NOTIFICATION);
                intent.putExtra(Constants.KEY_NOTIFICATION_CONTENT, getNotificationContent(notification));
                intent.putExtra(Constants.KEY_PENDING_INTENT, pendingIntent);
                if (this.requestCode == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
                    this.requestCode = 0;
                }
                this.requestCode++;
                FieldUtils.writeField(notification, "contentIntent", PendingIntent.getBroadcast(Sprite.getInstance().getApplicationContext(), this.requestCode, intent, 134217728));
            }
        }
        return method.invoke(this.originInterface, args);
    }

    private String getNotificationContent(Notification notification) {
        String rst = null;
        if (notification != null) {
            if (VERSION.SDK_INT >= 19) {
                if (notification.extras != null) {
                    rst = notification.extras.getString(NotificationCompat.EXTRA_TEXT);
                }
            } else if (VERSION.SDK_INT >= 16) {
                try {
                    Object extras = FieldUtils.readField((Object) notification, "extras");
                    if (extras != null && (extras instanceof Bundle)) {
                        rst = (String) ((Bundle) extras).get(NotificationCompat.EXTRA_TEXT);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            if (TextUtils.isEmpty(rst) && notification.contentView != null) {
                try {
                    Object mActions = FieldUtils.readField(notification.contentView, "mActions");
                    if (mActions != null && (mActions instanceof List)) {
                        for (Object action : (List) mActions) {
                            if (action != null && action.getClass().getSimpleName().equals("ReflectionAction")) {
                                if ("setText".equals(FieldUtils.readField(action, "methodName"))) {
                                    Object value = FieldUtils.readField(action, "value");
                                    if (value != null) {
                                        rst = value.toString();
                                    }
                                }
                            }
                        }
                    }
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return rst;
    }
}
