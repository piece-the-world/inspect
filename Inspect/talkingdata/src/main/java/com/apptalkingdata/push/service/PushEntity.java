/*
 * Decompiled with CFR 0_115.
 */
package com.apptalkingdata.push.service;

public interface PushEntity {
    public static final String ACTION_PUSH_BOOT_COMPLETED = "android.intent.action.BOOT_COMPLETED";
    public static final String ACTION_PUSH_CONNECTIVITY_CHANGE = "android.net.conn.CONNECTIVITY_CHANGE";
    public static final String ACTION_PUSH_USER_PRESENT = "android.intent.action.USER_PRESENT";
    public static final String ACTION_PUSH_PACKAGE_REMOVED = "android.intent.action.PACKAGE_REMOVED";
    public static final String ACTION_PUSH_DONT_KILL_APP = "android.intent.extra.DONT_KILL_APP";
    public static final String ACTION_PUSH_SERVICE_CMD = "android.intent.action.CMD";
    public static final String ACTION_PUSH_SHOW = "android.talkingdata.action.notification.SHOW";
    public static final String ACTION_PUSH_MESSAGE = "android.talkingdata.action.media.MESSAGE";
    public static final String ACTION_PUSH_SILENT = "android.talkingdata.action.media.SILENT";
    public static final String ACTION_PUSH_CLICK = "android.talkingdata.action.media.CLICK";
    public static final String ACTION_PUSH_TOKEN = "android.talkingdata.action.media.TD.TOKEN";
    @Deprecated
    public static final String EXTRA_PUSH_MESSAGE_STRING = "message_string";
    public static final String EXTRA_PUSH_TOKEN = "mpush_token";
    public static final String EXTRA_PUSH_APP = "app";
    public static final String EXTRA_PUSH_ID = "id";
    public static final String EXTRA_PUSH_TITLE = "title";
    public static final String EXTRA_PUSH_CONTENT = "content";
    public static final String EXTRA_PUSH_ACTION = "action";
    public static final String EXTRA_PUSH_TP = "tp";
    public static final String EXTRA_PUSH_EXTENTION = "ex";
}

