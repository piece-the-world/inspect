package com.netease.caipiao.dcsdk.event;

import android.support.v4.media.TransportMediator;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.netease.caipiao.datacollection.C0268R;
import com.netease.caipiao.dcsdk.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ProtoEvent {

    public interface AppColdStartMsgOrBuilder extends MessageLiteOrBuilder {
        String getAppBuildVersion();

        ByteString getAppBuildVersionBytes();

        String getAppBundle();

        ByteString getAppBundleBytes();

        String getAppKey();

        ByteString getAppKeyBytes();

        String getAppMemory();

        ByteString getAppMemoryBytes();

        String getAppVersion();

        ByteString getAppVersionBytes();

        String getAvalibleDisk();

        ByteString getAvalibleDiskBytes();

        String getAvalibleMemory();

        ByteString getAvalibleMemoryBytes();

        String getBatteryLevel();

        ByteString getBatteryLevelBytes();

        String getCarrier();

        ByteString getCarrierBytes();

        String getChannel();

        ByteString getChannelBytes();

        String getDeviceId();

        ByteString getDeviceIdBytes();

        String getDeviceModel();

        ByteString getDeviceModelBytes();

        String getEventName();

        ByteString getEventNameBytes();

        String getEventTime();

        ByteString getEventTimeBytes();

        String getIdfa();

        ByteString getIdfaBytes();

        String getScreenResolution();

        ByteString getScreenResolutionBytes();

        String getSessionId();

        ByteString getSessionIdBytes();

        String getSystemName();

        ByteString getSystemNameBytes();

        String getSystemVersion();

        ByteString getSystemVersionBytes();

        String getTotalDisk();

        ByteString getTotalDiskBytes();

        String getTotalMemory();

        ByteString getTotalMemoryBytes();

        boolean hasAppBuildVersion();

        boolean hasAppBundle();

        boolean hasAppKey();

        boolean hasAppMemory();

        boolean hasAppVersion();

        boolean hasAvalibleDisk();

        boolean hasAvalibleMemory();

        boolean hasBatteryLevel();

        boolean hasCarrier();

        boolean hasChannel();

        boolean hasDeviceId();

        boolean hasDeviceModel();

        boolean hasEventName();

        boolean hasEventTime();

        boolean hasIdfa();

        boolean hasScreenResolution();

        boolean hasSessionId();

        boolean hasSystemName();

        boolean hasSystemVersion();

        boolean hasTotalDisk();

        boolean hasTotalMemory();
    }

    public interface AppEnterForeBackgroundMsgOrBuilder extends MessageLiteOrBuilder {
        String getAppKey();

        ByteString getAppKeyBytes();

        String getAppMemory();

        ByteString getAppMemoryBytes();

        String getAvalibleDisk();

        ByteString getAvalibleDiskBytes();

        String getAvalibleMemory();

        ByteString getAvalibleMemoryBytes();

        String getChannel();

        ByteString getChannelBytes();

        String getDeviceId();

        ByteString getDeviceIdBytes();

        String getEventName();

        ByteString getEventNameBytes();

        String getEventTime();

        ByteString getEventTimeBytes();

        String getSessionId();

        ByteString getSessionIdBytes();

        boolean hasAppKey();

        boolean hasAppMemory();

        boolean hasAvalibleDisk();

        boolean hasAvalibleMemory();

        boolean hasChannel();

        boolean hasDeviceId();

        boolean hasEventName();

        boolean hasEventTime();

        boolean hasSessionId();
    }

    public interface AppInstallationMsgOrBuilder extends MessageLiteOrBuilder {
        String getAppKey();

        ByteString getAppKeyBytes();

        String getDeviceId();

        ByteString getDeviceIdBytes();

        String getEventName();

        ByteString getEventNameBytes();

        String getEventTime();

        ByteString getEventTimeBytes();

        MapItem getItem(int i);

        int getItemCount();

        List<MapItem> getItemList();

        String getSessionId();

        ByteString getSessionIdBytes();

        boolean hasAppKey();

        boolean hasDeviceId();

        boolean hasEventName();

        boolean hasEventTime();

        boolean hasSessionId();
    }

    public interface AppUrlMsgOrBuilder extends MessageLiteOrBuilder {
        String getAppKey();

        ByteString getAppKeyBytes();

        String getDeviceId();

        ByteString getDeviceIdBytes();

        String getEventName();

        ByteString getEventNameBytes();

        String getEventTime();

        ByteString getEventTimeBytes();

        String getSessionId();

        ByteString getSessionIdBytes();

        String getSucceed();

        ByteString getSucceedBytes();

        String getUrl();

        ByteString getUrlBytes();

        boolean hasAppKey();

        boolean hasDeviceId();

        boolean hasEventName();

        boolean hasEventTime();

        boolean hasSessionId();

        boolean hasSucceed();

        boolean hasUrl();
    }

    public interface ButtonViewMsgOrBuilder extends MessageLiteOrBuilder {
        String getAppKey();

        ByteString getAppKeyBytes();

        String getDeviceId();

        ByteString getDeviceIdBytes();

        String getEventName();

        ByteString getEventNameBytes();

        String getEventTime();

        ByteString getEventTimeBytes();

        MapItem getItem(int i);

        int getItemCount();

        List<MapItem> getItemList();

        String getPage();

        ByteString getPageBytes();

        String getSessionId();

        ByteString getSessionIdBytes();

        ViewItem getView();

        boolean hasAppKey();

        boolean hasDeviceId();

        boolean hasEventName();

        boolean hasEventTime();

        boolean hasPage();

        boolean hasSessionId();

        boolean hasView();
    }

    public interface ListItemClickMsgOrBuilder extends MessageLiteOrBuilder {
        String getAppKey();

        ByteString getAppKeyBytes();

        String getDeviceId();

        ByteString getDeviceIdBytes();

        String getEventName();

        ByteString getEventNameBytes();

        String getEventTime();

        ByteString getEventTimeBytes();

        String getIndexPath();

        ByteString getIndexPathBytes();

        MapItem getItem(int i);

        int getItemCount();

        List<MapItem> getItemList();

        String getPage();

        ByteString getPageBytes();

        String getSessionId();

        ByteString getSessionIdBytes();

        ViewItem getView();

        boolean hasAppKey();

        boolean hasDeviceId();

        boolean hasEventName();

        boolean hasEventTime();

        boolean hasIndexPath();

        boolean hasPage();

        boolean hasSessionId();

        boolean hasView();
    }

    public interface MapItemOrBuilder extends MessageLiteOrBuilder {
        String getKey();

        ByteString getKeyBytes();

        String getValue();

        ByteString getValueBytes();

        boolean hasKey();

        boolean hasValue();
    }

    public interface PageMsgOrBuilder extends MessageLiteOrBuilder {
        String getAppKey();

        ByteString getAppKeyBytes();

        String getDeviceId();

        ByteString getDeviceIdBytes();

        String getEventName();

        ByteString getEventNameBytes();

        String getEventTime();

        ByteString getEventTimeBytes();

        MapItem getItem(int i);

        int getItemCount();

        List<MapItem> getItemList();

        String getPage();

        ByteString getPageBytes();

        String getSessionId();

        ByteString getSessionIdBytes();

        boolean hasAppKey();

        boolean hasDeviceId();

        boolean hasEventName();

        boolean hasEventTime();

        boolean hasPage();

        boolean hasSessionId();
    }

    public interface PushMsgOrBuilder extends MessageLiteOrBuilder {
        String getAppKey();

        ByteString getAppKeyBytes();

        String getContent();

        ByteString getContentBytes();

        String getDeviceId();

        ByteString getDeviceIdBytes();

        String getEventName();

        ByteString getEventNameBytes();

        String getEventTime();

        ByteString getEventTimeBytes();

        String getSessionId();

        ByteString getSessionIdBytes();

        boolean hasAppKey();

        boolean hasContent();

        boolean hasDeviceId();

        boolean hasEventName();

        boolean hasEventTime();

        boolean hasSessionId();
    }

    public interface ScrollViewMsgOrBuilder extends MessageLiteOrBuilder {
        String getAppKey();

        ByteString getAppKeyBytes();

        String getDeviceId();

        ByteString getDeviceIdBytes();

        String getDirection();

        ByteString getDirectionBytes();

        String getEventName();

        ByteString getEventNameBytes();

        String getEventTime();

        ByteString getEventTimeBytes();

        String getPage();

        ByteString getPageBytes();

        String getScale();

        ByteString getScaleBytes();

        String getSessionId();

        ByteString getSessionIdBytes();

        ViewItem getView();

        boolean hasAppKey();

        boolean hasDeviceId();

        boolean hasDirection();

        boolean hasEventName();

        boolean hasEventTime();

        boolean hasPage();

        boolean hasScale();

        boolean hasSessionId();

        boolean hasView();
    }

    public interface UserOptionalMsgOrBuilder extends MessageLiteOrBuilder {
        String getAppKey();

        ByteString getAppKeyBytes();

        String getDeviceId();

        ByteString getDeviceIdBytes();

        String getEventName();

        ByteString getEventNameBytes();

        String getEventTime();

        ByteString getEventTimeBytes();

        MapItem getItem(int i);

        int getItemCount();

        List<MapItem> getItemList();

        String getSessionId();

        ByteString getSessionIdBytes();

        boolean hasAppKey();

        boolean hasDeviceId();

        boolean hasEventName();

        boolean hasEventTime();

        boolean hasSessionId();
    }

    public interface ViewItemOrBuilder extends MessageLiteOrBuilder {
        String getFrame();

        ByteString getFrameBytes();

        String getPath();

        ByteString getPathBytes();

        String getTitle();

        ByteString getTitleBytes();

        String getViewClass();

        ByteString getViewClassBytes();

        boolean hasFrame();

        boolean hasPath();

        boolean hasTitle();

        boolean hasViewClass();
    }

    public interface ViewScrollMsgOrBuilder extends MessageLiteOrBuilder {
        String getAppKey();

        ByteString getAppKeyBytes();

        String getDeviceId();

        ByteString getDeviceIdBytes();

        String getDirection();

        ByteString getDirectionBytes();

        String getEventName();

        ByteString getEventNameBytes();

        String getEventTime();

        ByteString getEventTimeBytes();

        String getPage();

        ByteString getPageBytes();

        String getSessionId();

        ByteString getSessionIdBytes();

        boolean hasAppKey();

        boolean hasDeviceId();

        boolean hasDirection();

        boolean hasEventName();

        boolean hasEventTime();

        boolean hasPage();

        boolean hasSessionId();
    }

    public interface WebViewMsgOrBuilder extends MessageLiteOrBuilder {
        String getAppKey();

        ByteString getAppKeyBytes();

        String getDeviceId();

        ByteString getDeviceIdBytes();

        String getError();

        ByteString getErrorBytes();

        String getEventName();

        ByteString getEventNameBytes();

        String getEventTime();

        ByteString getEventTimeBytes();

        String getPage();

        ByteString getPageBytes();

        String getSessionId();

        ByteString getSessionIdBytes();

        String getUrl();

        ByteString getUrlBytes();

        ViewItem getView();

        boolean hasAppKey();

        boolean hasDeviceId();

        boolean hasError();

        boolean hasEventName();

        boolean hasEventTime();

        boolean hasPage();

        boolean hasSessionId();

        boolean hasUrl();

        boolean hasView();
    }

    public static final class AppColdStartMsg extends GeneratedMessageLite implements AppColdStartMsgOrBuilder {
        public static final int APPBUILDVERSION_FIELD_NUMBER = 10;
        public static final int APPBUNDLE_FIELD_NUMBER = 8;
        public static final int APPKEY_FIELD_NUMBER = 4;
        public static final int APPMEMORY_FIELD_NUMBER = 15;
        public static final int APPVERSION_FIELD_NUMBER = 9;
        public static final int AVALIBLEDISK_FIELD_NUMBER = 13;
        public static final int AVALIBLEMEMORY_FIELD_NUMBER = 16;
        public static final int BATTERYLEVEL_FIELD_NUMBER = 18;
        public static final int CARRIER_FIELD_NUMBER = 19;
        public static final int CHANNEL_FIELD_NUMBER = 7;
        public static final int DEVICEID_FIELD_NUMBER = 5;
        public static final int DEVICEMODEL_FIELD_NUMBER = 20;
        public static final int EVENTNAME_FIELD_NUMBER = 1;
        public static final int EVENTTIME_FIELD_NUMBER = 2;
        public static final int IDFA_FIELD_NUMBER = 6;
        public static Parser<AppColdStartMsg> PARSER = null;
        public static final int SCREENRESOLUTION_FIELD_NUMBER = 21;
        public static final int SESSIONID_FIELD_NUMBER = 3;
        public static final int SYSTEMNAME_FIELD_NUMBER = 11;
        public static final int SYSTEMVERSION_FIELD_NUMBER = 12;
        public static final int TOTALDISK_FIELD_NUMBER = 14;
        public static final int TOTALMEMORY_FIELD_NUMBER = 17;
        private static final AppColdStartMsg defaultInstance;
        private static final long serialVersionUID = 0;
        private Object appBuildVersion_;
        private Object appBundle_;
        private Object appKey_;
        private Object appMemory_;
        private Object appVersion_;
        private Object avalibleDisk_;
        private Object avalibleMemory_;
        private Object batteryLevel_;
        private int bitField0_;
        private Object carrier_;
        private Object channel_;
        private Object deviceId_;
        private Object deviceModel_;
        private Object eventName_;
        private Object eventTime_;
        private Object idfa_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object screenResolution_;
        private Object sessionId_;
        private Object systemName_;
        private Object systemVersion_;
        private Object totalDisk_;
        private Object totalMemory_;
        private final ByteString unknownFields;

        /* renamed from: com.netease.caipiao.dcsdk.event.ProtoEvent.AppColdStartMsg.1 */
        static class C04151 extends AbstractParser<AppColdStartMsg> {
            C04151() {
            }

            public AppColdStartMsg parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new AppColdStartMsg(extensionRegistry, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<AppColdStartMsg, Builder> implements AppColdStartMsgOrBuilder {
            private Object appBuildVersion_;
            private Object appBundle_;
            private Object appKey_;
            private Object appMemory_;
            private Object appVersion_;
            private Object avalibleDisk_;
            private Object avalibleMemory_;
            private Object batteryLevel_;
            private int bitField0_;
            private Object carrier_;
            private Object channel_;
            private Object deviceId_;
            private Object deviceModel_;
            private Object eventName_;
            private Object eventTime_;
            private Object idfa_;
            private Object screenResolution_;
            private Object sessionId_;
            private Object systemName_;
            private Object systemVersion_;
            private Object totalDisk_;
            private Object totalMemory_;

            private Builder() {
                this.eventName_ = BuildConfig.FLAVOR;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.appKey_ = BuildConfig.FLAVOR;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.idfa_ = BuildConfig.FLAVOR;
                this.channel_ = BuildConfig.FLAVOR;
                this.appBundle_ = BuildConfig.FLAVOR;
                this.appVersion_ = BuildConfig.FLAVOR;
                this.appBuildVersion_ = BuildConfig.FLAVOR;
                this.systemName_ = BuildConfig.FLAVOR;
                this.systemVersion_ = BuildConfig.FLAVOR;
                this.avalibleDisk_ = BuildConfig.FLAVOR;
                this.totalDisk_ = BuildConfig.FLAVOR;
                this.appMemory_ = BuildConfig.FLAVOR;
                this.avalibleMemory_ = BuildConfig.FLAVOR;
                this.totalMemory_ = BuildConfig.FLAVOR;
                this.batteryLevel_ = BuildConfig.FLAVOR;
                this.carrier_ = BuildConfig.FLAVOR;
                this.deviceModel_ = BuildConfig.FLAVOR;
                this.screenResolution_ = BuildConfig.FLAVOR;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.eventName_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -2;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -3;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -5;
                this.appKey_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -9;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -17;
                this.idfa_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -33;
                this.channel_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -65;
                this.appBundle_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -129;
                this.appVersion_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -257;
                this.appBuildVersion_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -513;
                this.systemName_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -1025;
                this.systemVersion_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -2049;
                this.avalibleDisk_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -4097;
                this.totalDisk_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -8193;
                this.appMemory_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -16385;
                this.avalibleMemory_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -32769;
                this.totalMemory_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -65537;
                this.batteryLevel_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -131073;
                this.carrier_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -262145;
                this.deviceModel_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -524289;
                this.screenResolution_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -1048577;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public AppColdStartMsg getDefaultInstanceForType() {
                return AppColdStartMsg.getDefaultInstance();
            }

            public AppColdStartMsg build() {
                AppColdStartMsg result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw com.google.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(result);
            }

            public AppColdStartMsg buildPartial() {
                AppColdStartMsg result = new AppColdStartMsg(null);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & AppColdStartMsg.EVENTNAME_FIELD_NUMBER) == AppColdStartMsg.EVENTNAME_FIELD_NUMBER) {
                    to_bitField0_ = 0 | AppColdStartMsg.EVENTNAME_FIELD_NUMBER;
                }
                result.eventName_ = this.eventName_;
                if ((from_bitField0_ & AppColdStartMsg.EVENTTIME_FIELD_NUMBER) == AppColdStartMsg.EVENTTIME_FIELD_NUMBER) {
                    to_bitField0_ |= AppColdStartMsg.EVENTTIME_FIELD_NUMBER;
                }
                result.eventTime_ = this.eventTime_;
                if ((from_bitField0_ & AppColdStartMsg.APPKEY_FIELD_NUMBER) == AppColdStartMsg.APPKEY_FIELD_NUMBER) {
                    to_bitField0_ |= AppColdStartMsg.APPKEY_FIELD_NUMBER;
                }
                result.sessionId_ = this.sessionId_;
                if ((from_bitField0_ & AppColdStartMsg.APPBUNDLE_FIELD_NUMBER) == AppColdStartMsg.APPBUNDLE_FIELD_NUMBER) {
                    to_bitField0_ |= AppColdStartMsg.APPBUNDLE_FIELD_NUMBER;
                }
                result.appKey_ = this.appKey_;
                if ((from_bitField0_ & AppColdStartMsg.AVALIBLEMEMORY_FIELD_NUMBER) == AppColdStartMsg.AVALIBLEMEMORY_FIELD_NUMBER) {
                    to_bitField0_ |= AppColdStartMsg.AVALIBLEMEMORY_FIELD_NUMBER;
                }
                result.deviceId_ = this.deviceId_;
                if ((from_bitField0_ & 32) == 32) {
                    to_bitField0_ |= 32;
                }
                result.idfa_ = this.idfa_;
                if ((from_bitField0_ & 64) == 64) {
                    to_bitField0_ |= 64;
                }
                result.channel_ = this.channel_;
                if ((from_bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                    to_bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                }
                result.appBundle_ = this.appBundle_;
                if ((from_bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                    to_bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                }
                result.appVersion_ = this.appVersion_;
                if ((from_bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) {
                    to_bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
                }
                result.appBuildVersion_ = this.appBuildVersion_;
                if ((from_bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) {
                    to_bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
                }
                result.systemName_ = this.systemName_;
                if ((from_bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT) {
                    to_bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT;
                }
                result.systemVersion_ = this.systemVersion_;
                if ((from_bitField0_ & CodedOutputStream.DEFAULT_BUFFER_SIZE) == CodedOutputStream.DEFAULT_BUFFER_SIZE) {
                    to_bitField0_ |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                }
                result.avalibleDisk_ = this.avalibleDisk_;
                if ((from_bitField0_ & AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD) == AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD) {
                    to_bitField0_ |= AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD;
                }
                result.totalDisk_ = this.totalDisk_;
                if ((from_bitField0_ & AccessibilityNodeInfoCompat.ACTION_COPY) == AccessibilityNodeInfoCompat.ACTION_COPY) {
                    to_bitField0_ |= AccessibilityNodeInfoCompat.ACTION_COPY;
                }
                result.appMemory_ = this.appMemory_;
                if ((from_bitField0_ & AccessibilityNodeInfoCompat.ACTION_PASTE) == AccessibilityNodeInfoCompat.ACTION_PASTE) {
                    to_bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PASTE;
                }
                result.avalibleMemory_ = this.avalibleMemory_;
                if ((from_bitField0_ & AccessibilityNodeInfoCompat.ACTION_CUT) == AccessibilityNodeInfoCompat.ACTION_CUT) {
                    to_bitField0_ |= AccessibilityNodeInfoCompat.ACTION_CUT;
                }
                result.totalMemory_ = this.totalMemory_;
                if ((from_bitField0_ & AccessibilityNodeInfoCompat.ACTION_SET_SELECTION) == AccessibilityNodeInfoCompat.ACTION_SET_SELECTION) {
                    to_bitField0_ |= AccessibilityNodeInfoCompat.ACTION_SET_SELECTION;
                }
                result.batteryLevel_ = this.batteryLevel_;
                if ((from_bitField0_ & AccessibilityNodeInfoCompat.ACTION_EXPAND) == AccessibilityNodeInfoCompat.ACTION_EXPAND) {
                    to_bitField0_ |= AccessibilityNodeInfoCompat.ACTION_EXPAND;
                }
                result.carrier_ = this.carrier_;
                if ((from_bitField0_ & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) == AccessibilityNodeInfoCompat.ACTION_COLLAPSE) {
                    to_bitField0_ |= AccessibilityNodeInfoCompat.ACTION_COLLAPSE;
                }
                result.deviceModel_ = this.deviceModel_;
                if ((AccessibilityNodeInfoCompat.ACTION_DISMISS & from_bitField0_) == AccessibilityNodeInfoCompat.ACTION_DISMISS) {
                    to_bitField0_ |= AccessibilityNodeInfoCompat.ACTION_DISMISS;
                }
                result.screenResolution_ = this.screenResolution_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(AppColdStartMsg other) {
                if (other != AppColdStartMsg.getDefaultInstance()) {
                    if (other.hasEventName()) {
                        this.bitField0_ |= AppColdStartMsg.EVENTNAME_FIELD_NUMBER;
                        this.eventName_ = other.eventName_;
                    }
                    if (other.hasEventTime()) {
                        this.bitField0_ |= AppColdStartMsg.EVENTTIME_FIELD_NUMBER;
                        this.eventTime_ = other.eventTime_;
                    }
                    if (other.hasSessionId()) {
                        this.bitField0_ |= AppColdStartMsg.APPKEY_FIELD_NUMBER;
                        this.sessionId_ = other.sessionId_;
                    }
                    if (other.hasAppKey()) {
                        this.bitField0_ |= AppColdStartMsg.APPBUNDLE_FIELD_NUMBER;
                        this.appKey_ = other.appKey_;
                    }
                    if (other.hasDeviceId()) {
                        this.bitField0_ |= AppColdStartMsg.AVALIBLEMEMORY_FIELD_NUMBER;
                        this.deviceId_ = other.deviceId_;
                    }
                    if (other.hasIdfa()) {
                        this.bitField0_ |= 32;
                        this.idfa_ = other.idfa_;
                    }
                    if (other.hasChannel()) {
                        this.bitField0_ |= 64;
                        this.channel_ = other.channel_;
                    }
                    if (other.hasAppBundle()) {
                        this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                        this.appBundle_ = other.appBundle_;
                    }
                    if (other.hasAppVersion()) {
                        this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                        this.appVersion_ = other.appVersion_;
                    }
                    if (other.hasAppBuildVersion()) {
                        this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
                        this.appBuildVersion_ = other.appBuildVersion_;
                    }
                    if (other.hasSystemName()) {
                        this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
                        this.systemName_ = other.systemName_;
                    }
                    if (other.hasSystemVersion()) {
                        this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT;
                        this.systemVersion_ = other.systemVersion_;
                    }
                    if (other.hasAvalibleDisk()) {
                        this.bitField0_ |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                        this.avalibleDisk_ = other.avalibleDisk_;
                    }
                    if (other.hasTotalDisk()) {
                        this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD;
                        this.totalDisk_ = other.totalDisk_;
                    }
                    if (other.hasAppMemory()) {
                        this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_COPY;
                        this.appMemory_ = other.appMemory_;
                    }
                    if (other.hasAvalibleMemory()) {
                        this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PASTE;
                        this.avalibleMemory_ = other.avalibleMemory_;
                    }
                    if (other.hasTotalMemory()) {
                        this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_CUT;
                        this.totalMemory_ = other.totalMemory_;
                    }
                    if (other.hasBatteryLevel()) {
                        this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_SET_SELECTION;
                        this.batteryLevel_ = other.batteryLevel_;
                    }
                    if (other.hasCarrier()) {
                        this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_EXPAND;
                        this.carrier_ = other.carrier_;
                    }
                    if (other.hasDeviceModel()) {
                        this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_COLLAPSE;
                        this.deviceModel_ = other.deviceModel_;
                    }
                    if (other.hasScreenResolution()) {
                        this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_DISMISS;
                        this.screenResolution_ = other.screenResolution_;
                    }
                    setUnknownFields(getUnknownFields().concat(other.unknownFields));
                }
                return this;
            }

            public final boolean isInitialized() {
                if (hasEventName() && hasEventTime() && hasSessionId() && hasAppKey() && hasDeviceId()) {
                    return true;
                }
                return false;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                AppColdStartMsg parsedMessage = null;
                try {
                    parsedMessage = (AppColdStartMsg) AppColdStartMsg.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AppColdStartMsg) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
            }

            public boolean hasEventName() {
                return (this.bitField0_ & AppColdStartMsg.EVENTNAME_FIELD_NUMBER) == AppColdStartMsg.EVENTNAME_FIELD_NUMBER;
            }

            public String getEventName() {
                ByteString ref = this.eventName_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventName_ = s;
                return s;
            }

            public ByteString getEventNameBytes() {
                Object ref = this.eventName_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventName_ = b;
                return b;
            }

            public Builder setEventName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppColdStartMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public Builder clearEventName() {
                this.bitField0_ &= -2;
                this.eventName_ = AppColdStartMsg.getDefaultInstance().getEventName();
                return this;
            }

            public Builder setEventNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppColdStartMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public boolean hasEventTime() {
                return (this.bitField0_ & AppColdStartMsg.EVENTTIME_FIELD_NUMBER) == AppColdStartMsg.EVENTTIME_FIELD_NUMBER;
            }

            public String getEventTime() {
                ByteString ref = this.eventTime_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventTime_ = s;
                return s;
            }

            public ByteString getEventTimeBytes() {
                Object ref = this.eventTime_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventTime_ = b;
                return b;
            }

            public Builder setEventTime(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppColdStartMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public Builder clearEventTime() {
                this.bitField0_ &= -3;
                this.eventTime_ = AppColdStartMsg.getDefaultInstance().getEventTime();
                return this;
            }

            public Builder setEventTimeBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppColdStartMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public boolean hasSessionId() {
                return (this.bitField0_ & AppColdStartMsg.APPKEY_FIELD_NUMBER) == AppColdStartMsg.APPKEY_FIELD_NUMBER;
            }

            public String getSessionId() {
                ByteString ref = this.sessionId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.sessionId_ = s;
                return s;
            }

            public ByteString getSessionIdBytes() {
                Object ref = this.sessionId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.sessionId_ = b;
                return b;
            }

            public Builder setSessionId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppColdStartMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -5;
                this.sessionId_ = AppColdStartMsg.getDefaultInstance().getSessionId();
                return this;
            }

            public Builder setSessionIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppColdStartMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public boolean hasAppKey() {
                return (this.bitField0_ & AppColdStartMsg.APPBUNDLE_FIELD_NUMBER) == AppColdStartMsg.APPBUNDLE_FIELD_NUMBER;
            }

            public String getAppKey() {
                ByteString ref = this.appKey_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.appKey_ = s;
                return s;
            }

            public ByteString getAppKeyBytes() {
                Object ref = this.appKey_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.appKey_ = b;
                return b;
            }

            public Builder setAppKey(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppColdStartMsg.APPBUNDLE_FIELD_NUMBER;
                this.appKey_ = value;
                return this;
            }

            public Builder clearAppKey() {
                this.bitField0_ &= -9;
                this.appKey_ = AppColdStartMsg.getDefaultInstance().getAppKey();
                return this;
            }

            public Builder setAppKeyBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppColdStartMsg.APPBUNDLE_FIELD_NUMBER;
                this.appKey_ = value;
                return this;
            }

            public boolean hasDeviceId() {
                return (this.bitField0_ & AppColdStartMsg.AVALIBLEMEMORY_FIELD_NUMBER) == AppColdStartMsg.AVALIBLEMEMORY_FIELD_NUMBER;
            }

            public String getDeviceId() {
                ByteString ref = this.deviceId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.deviceId_ = s;
                return s;
            }

            public ByteString getDeviceIdBytes() {
                Object ref = this.deviceId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.deviceId_ = b;
                return b;
            }

            public Builder setDeviceId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppColdStartMsg.AVALIBLEMEMORY_FIELD_NUMBER;
                this.deviceId_ = value;
                return this;
            }

            public Builder clearDeviceId() {
                this.bitField0_ &= -17;
                this.deviceId_ = AppColdStartMsg.getDefaultInstance().getDeviceId();
                return this;
            }

            public Builder setDeviceIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppColdStartMsg.AVALIBLEMEMORY_FIELD_NUMBER;
                this.deviceId_ = value;
                return this;
            }

            public boolean hasIdfa() {
                return (this.bitField0_ & 32) == 32;
            }

            public String getIdfa() {
                ByteString ref = this.idfa_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.idfa_ = s;
                return s;
            }

            public ByteString getIdfaBytes() {
                Object ref = this.idfa_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.idfa_ = b;
                return b;
            }

            public Builder setIdfa(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.idfa_ = value;
                return this;
            }

            public Builder clearIdfa() {
                this.bitField0_ &= -33;
                this.idfa_ = AppColdStartMsg.getDefaultInstance().getIdfa();
                return this;
            }

            public Builder setIdfaBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.idfa_ = value;
                return this;
            }

            public boolean hasChannel() {
                return (this.bitField0_ & 64) == 64;
            }

            public String getChannel() {
                ByteString ref = this.channel_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.channel_ = s;
                return s;
            }

            public ByteString getChannelBytes() {
                Object ref = this.channel_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.channel_ = b;
                return b;
            }

            public Builder setChannel(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.channel_ = value;
                return this;
            }

            public Builder clearChannel() {
                this.bitField0_ &= -65;
                this.channel_ = AppColdStartMsg.getDefaultInstance().getChannel();
                return this;
            }

            public Builder setChannelBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.channel_ = value;
                return this;
            }

            public boolean hasAppBundle() {
                return (this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT;
            }

            public String getAppBundle() {
                ByteString ref = this.appBundle_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.appBundle_ = s;
                return s;
            }

            public ByteString getAppBundleBytes() {
                Object ref = this.appBundle_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.appBundle_ = b;
                return b;
            }

            public Builder setAppBundle(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                this.appBundle_ = value;
                return this;
            }

            public Builder clearAppBundle() {
                this.bitField0_ &= -129;
                this.appBundle_ = AppColdStartMsg.getDefaultInstance().getAppBundle();
                return this;
            }

            public Builder setAppBundleBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                this.appBundle_ = value;
                return this;
            }

            public boolean hasAppVersion() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
            }

            public String getAppVersion() {
                ByteString ref = this.appVersion_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.appVersion_ = s;
                return s;
            }

            public ByteString getAppVersionBytes() {
                Object ref = this.appVersion_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.appVersion_ = b;
                return b;
            }

            public Builder setAppVersion(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                this.appVersion_ = value;
                return this;
            }

            public Builder clearAppVersion() {
                this.bitField0_ &= -257;
                this.appVersion_ = AppColdStartMsg.getDefaultInstance().getAppVersion();
                return this;
            }

            public Builder setAppVersionBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                this.appVersion_ = value;
                return this;
            }

            public boolean hasAppBuildVersion() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
            }

            public String getAppBuildVersion() {
                ByteString ref = this.appBuildVersion_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.appBuildVersion_ = s;
                return s;
            }

            public ByteString getAppBuildVersionBytes() {
                Object ref = this.appBuildVersion_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.appBuildVersion_ = b;
                return b;
            }

            public Builder setAppBuildVersion(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
                this.appBuildVersion_ = value;
                return this;
            }

            public Builder clearAppBuildVersion() {
                this.bitField0_ &= -513;
                this.appBuildVersion_ = AppColdStartMsg.getDefaultInstance().getAppBuildVersion();
                return this;
            }

            public Builder setAppBuildVersionBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
                this.appBuildVersion_ = value;
                return this;
            }

            public boolean hasSystemName() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
            }

            public String getSystemName() {
                ByteString ref = this.systemName_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.systemName_ = s;
                return s;
            }

            public ByteString getSystemNameBytes() {
                Object ref = this.systemName_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.systemName_ = b;
                return b;
            }

            public Builder setSystemName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
                this.systemName_ = value;
                return this;
            }

            public Builder clearSystemName() {
                this.bitField0_ &= -1025;
                this.systemName_ = AppColdStartMsg.getDefaultInstance().getSystemName();
                return this;
            }

            public Builder setSystemNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
                this.systemName_ = value;
                return this;
            }

            public boolean hasSystemVersion() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT;
            }

            public String getSystemVersion() {
                ByteString ref = this.systemVersion_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.systemVersion_ = s;
                return s;
            }

            public ByteString getSystemVersionBytes() {
                Object ref = this.systemVersion_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.systemVersion_ = b;
                return b;
            }

            public Builder setSystemVersion(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT;
                this.systemVersion_ = value;
                return this;
            }

            public Builder clearSystemVersion() {
                this.bitField0_ &= -2049;
                this.systemVersion_ = AppColdStartMsg.getDefaultInstance().getSystemVersion();
                return this;
            }

            public Builder setSystemVersionBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT;
                this.systemVersion_ = value;
                return this;
            }

            public boolean hasAvalibleDisk() {
                return (this.bitField0_ & CodedOutputStream.DEFAULT_BUFFER_SIZE) == CodedOutputStream.DEFAULT_BUFFER_SIZE;
            }

            public String getAvalibleDisk() {
                ByteString ref = this.avalibleDisk_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.avalibleDisk_ = s;
                return s;
            }

            public ByteString getAvalibleDiskBytes() {
                Object ref = this.avalibleDisk_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.avalibleDisk_ = b;
                return b;
            }

            public Builder setAvalibleDisk(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                this.avalibleDisk_ = value;
                return this;
            }

            public Builder clearAvalibleDisk() {
                this.bitField0_ &= -4097;
                this.avalibleDisk_ = AppColdStartMsg.getDefaultInstance().getAvalibleDisk();
                return this;
            }

            public Builder setAvalibleDiskBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                this.avalibleDisk_ = value;
                return this;
            }

            public boolean hasTotalDisk() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD) == AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD;
            }

            public String getTotalDisk() {
                ByteString ref = this.totalDisk_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.totalDisk_ = s;
                return s;
            }

            public ByteString getTotalDiskBytes() {
                Object ref = this.totalDisk_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.totalDisk_ = b;
                return b;
            }

            public Builder setTotalDisk(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD;
                this.totalDisk_ = value;
                return this;
            }

            public Builder clearTotalDisk() {
                this.bitField0_ &= -8193;
                this.totalDisk_ = AppColdStartMsg.getDefaultInstance().getTotalDisk();
                return this;
            }

            public Builder setTotalDiskBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD;
                this.totalDisk_ = value;
                return this;
            }

            public boolean hasAppMemory() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_COPY) == AccessibilityNodeInfoCompat.ACTION_COPY;
            }

            public String getAppMemory() {
                ByteString ref = this.appMemory_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.appMemory_ = s;
                return s;
            }

            public ByteString getAppMemoryBytes() {
                Object ref = this.appMemory_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.appMemory_ = b;
                return b;
            }

            public Builder setAppMemory(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_COPY;
                this.appMemory_ = value;
                return this;
            }

            public Builder clearAppMemory() {
                this.bitField0_ &= -16385;
                this.appMemory_ = AppColdStartMsg.getDefaultInstance().getAppMemory();
                return this;
            }

            public Builder setAppMemoryBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_COPY;
                this.appMemory_ = value;
                return this;
            }

            public boolean hasAvalibleMemory() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PASTE) == AccessibilityNodeInfoCompat.ACTION_PASTE;
            }

            public String getAvalibleMemory() {
                ByteString ref = this.avalibleMemory_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.avalibleMemory_ = s;
                return s;
            }

            public ByteString getAvalibleMemoryBytes() {
                Object ref = this.avalibleMemory_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.avalibleMemory_ = b;
                return b;
            }

            public Builder setAvalibleMemory(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PASTE;
                this.avalibleMemory_ = value;
                return this;
            }

            public Builder clearAvalibleMemory() {
                this.bitField0_ &= -32769;
                this.avalibleMemory_ = AppColdStartMsg.getDefaultInstance().getAvalibleMemory();
                return this;
            }

            public Builder setAvalibleMemoryBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PASTE;
                this.avalibleMemory_ = value;
                return this;
            }

            public boolean hasTotalMemory() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_CUT) == AccessibilityNodeInfoCompat.ACTION_CUT;
            }

            public String getTotalMemory() {
                ByteString ref = this.totalMemory_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.totalMemory_ = s;
                return s;
            }

            public ByteString getTotalMemoryBytes() {
                Object ref = this.totalMemory_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.totalMemory_ = b;
                return b;
            }

            public Builder setTotalMemory(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_CUT;
                this.totalMemory_ = value;
                return this;
            }

            public Builder clearTotalMemory() {
                this.bitField0_ &= -65537;
                this.totalMemory_ = AppColdStartMsg.getDefaultInstance().getTotalMemory();
                return this;
            }

            public Builder setTotalMemoryBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_CUT;
                this.totalMemory_ = value;
                return this;
            }

            public boolean hasBatteryLevel() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_SET_SELECTION) == AccessibilityNodeInfoCompat.ACTION_SET_SELECTION;
            }

            public String getBatteryLevel() {
                ByteString ref = this.batteryLevel_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.batteryLevel_ = s;
                return s;
            }

            public ByteString getBatteryLevelBytes() {
                Object ref = this.batteryLevel_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.batteryLevel_ = b;
                return b;
            }

            public Builder setBatteryLevel(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_SET_SELECTION;
                this.batteryLevel_ = value;
                return this;
            }

            public Builder clearBatteryLevel() {
                this.bitField0_ &= -131073;
                this.batteryLevel_ = AppColdStartMsg.getDefaultInstance().getBatteryLevel();
                return this;
            }

            public Builder setBatteryLevelBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_SET_SELECTION;
                this.batteryLevel_ = value;
                return this;
            }

            public boolean hasCarrier() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_EXPAND) == AccessibilityNodeInfoCompat.ACTION_EXPAND;
            }

            public String getCarrier() {
                ByteString ref = this.carrier_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.carrier_ = s;
                return s;
            }

            public ByteString getCarrierBytes() {
                Object ref = this.carrier_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.carrier_ = b;
                return b;
            }

            public Builder setCarrier(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_EXPAND;
                this.carrier_ = value;
                return this;
            }

            public Builder clearCarrier() {
                this.bitField0_ &= -262145;
                this.carrier_ = AppColdStartMsg.getDefaultInstance().getCarrier();
                return this;
            }

            public Builder setCarrierBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_EXPAND;
                this.carrier_ = value;
                return this;
            }

            public boolean hasDeviceModel() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) == AccessibilityNodeInfoCompat.ACTION_COLLAPSE;
            }

            public String getDeviceModel() {
                ByteString ref = this.deviceModel_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.deviceModel_ = s;
                return s;
            }

            public ByteString getDeviceModelBytes() {
                Object ref = this.deviceModel_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.deviceModel_ = b;
                return b;
            }

            public Builder setDeviceModel(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_COLLAPSE;
                this.deviceModel_ = value;
                return this;
            }

            public Builder clearDeviceModel() {
                this.bitField0_ &= -524289;
                this.deviceModel_ = AppColdStartMsg.getDefaultInstance().getDeviceModel();
                return this;
            }

            public Builder setDeviceModelBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_COLLAPSE;
                this.deviceModel_ = value;
                return this;
            }

            public boolean hasScreenResolution() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_DISMISS) == AccessibilityNodeInfoCompat.ACTION_DISMISS;
            }

            public String getScreenResolution() {
                ByteString ref = this.screenResolution_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.screenResolution_ = s;
                return s;
            }

            public ByteString getScreenResolutionBytes() {
                Object ref = this.screenResolution_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.screenResolution_ = b;
                return b;
            }

            public Builder setScreenResolution(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_DISMISS;
                this.screenResolution_ = value;
                return this;
            }

            public Builder clearScreenResolution() {
                this.bitField0_ &= -1048577;
                this.screenResolution_ = AppColdStartMsg.getDefaultInstance().getScreenResolution();
                return this;
            }

            public Builder setScreenResolutionBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_DISMISS;
                this.screenResolution_ = value;
                return this;
            }
        }

        private AppColdStartMsg(com.google.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private AppColdStartMsg(boolean noInit) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static AppColdStartMsg getDefaultInstance() {
            return defaultInstance;
        }

        public AppColdStartMsg getDefaultInstanceForType() {
            return defaultInstance;
        }

        private AppColdStartMsg(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            OutputStream unknownFieldsOutput = ByteString.newOutput();
            CodedOutputStream unknownFieldsCodedOutput = CodedOutputStream.newInstance(unknownFieldsOutput);
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    ByteString bs;
                    switch (tag) {
                        case SwipeRefreshLayout.LARGE /*0*/:
                            done = true;
                            break;
                        case APPBUILDVERSION_FIELD_NUMBER /*10*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTNAME_FIELD_NUMBER;
                            this.eventName_ = bs;
                            break;
                        case BATTERYLEVEL_FIELD_NUMBER /*18*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTTIME_FIELD_NUMBER;
                            this.eventTime_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionMenuTextColor /*26*/:
                            bs = input.readBytes();
                            this.bitField0_ |= APPKEY_FIELD_NUMBER;
                            this.sessionId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionModePasteDrawable /*34*/:
                            bs = input.readBytes();
                            this.bitField0_ |= APPBUNDLE_FIELD_NUMBER;
                            this.appKey_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_dialogTheme /*42*/:
                            bs = input.readBytes();
                            this.bitField0_ |= AVALIBLEMEMORY_FIELD_NUMBER;
                            this.deviceId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_buttonBarStyle /*50*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 32;
                            this.idfa_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_toolbarStyle /*58*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 64;
                            this.channel_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /*66*/:
                            bs = input.readBytes();
                            this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                            this.appBundle_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_dropDownListViewStyle /*74*/:
                            bs = input.readBytes();
                            this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                            this.appVersion_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_colorPrimary /*82*/:
                            bs = input.readBytes();
                            this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
                            this.appBuildVersion_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_controlBackground /*90*/:
                            bs = input.readBytes();
                            this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
                            this.systemName_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /*98*/:
                            bs = input.readBytes();
                            this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT;
                            this.systemVersion_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_ratingBarStyle /*106*/:
                            bs = input.readBytes();
                            this.bitField0_ |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                            this.avalibleDisk_ = bs;
                            break;
                        case 114:
                            bs = input.readBytes();
                            this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD;
                            this.totalDisk_ = bs;
                            break;
                        case 122:
                            bs = input.readBytes();
                            this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_COPY;
                            this.appMemory_ = bs;
                            break;
                        case TransportMediator.KEYCODE_MEDIA_RECORD /*130*/:
                            bs = input.readBytes();
                            this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_PASTE;
                            this.avalibleMemory_ = bs;
                            break;
                        case 138:
                            bs = input.readBytes();
                            this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_CUT;
                            this.totalMemory_ = bs;
                            break;
                        case 146:
                            bs = input.readBytes();
                            this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_SET_SELECTION;
                            this.batteryLevel_ = bs;
                            break;
                        case 154:
                            bs = input.readBytes();
                            this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_EXPAND;
                            this.carrier_ = bs;
                            break;
                        case 162:
                            bs = input.readBytes();
                            this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_COLLAPSE;
                            this.deviceModel_ = bs;
                            break;
                        case 170:
                            bs = input.readBytes();
                            this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_DISMISS;
                            this.screenResolution_ = bs;
                            break;
                        default:
                            if (!parseUnknownField(input, unknownFieldsCodedOutput, extensionRegistry, tag)) {
                                done = true;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    try {
                        unknownFieldsCodedOutput.flush();
                    } catch (IOException e3) {
                        makeExtensionsImmutable();
                    } finally {
                        this.unknownFields = unknownFieldsOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }
            }
            try {
                unknownFieldsCodedOutput.flush();
            } catch (IOException e4) {
            } finally {
                this.unknownFields = unknownFieldsOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            PARSER = new C04151();
            defaultInstance = new AppColdStartMsg(true);
            defaultInstance.initFields();
        }

        public Parser<AppColdStartMsg> getParserForType() {
            return PARSER;
        }

        public boolean hasEventName() {
            return (this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER;
        }

        public String getEventName() {
            ByteString ref = this.eventName_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventName_ = s;
            }
            return s;
        }

        public ByteString getEventNameBytes() {
            Object ref = this.eventName_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventName_ = b;
            return b;
        }

        public boolean hasEventTime() {
            return (this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER;
        }

        public String getEventTime() {
            ByteString ref = this.eventTime_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventTime_ = s;
            }
            return s;
        }

        public ByteString getEventTimeBytes() {
            Object ref = this.eventTime_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventTime_ = b;
            return b;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER;
        }

        public String getSessionId() {
            ByteString ref = this.sessionId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.sessionId_ = s;
            }
            return s;
        }

        public ByteString getSessionIdBytes() {
            Object ref = this.sessionId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.sessionId_ = b;
            return b;
        }

        public boolean hasAppKey() {
            return (this.bitField0_ & APPBUNDLE_FIELD_NUMBER) == APPBUNDLE_FIELD_NUMBER;
        }

        public String getAppKey() {
            ByteString ref = this.appKey_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.appKey_ = s;
            }
            return s;
        }

        public ByteString getAppKeyBytes() {
            Object ref = this.appKey_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.appKey_ = b;
            return b;
        }

        public boolean hasDeviceId() {
            return (this.bitField0_ & AVALIBLEMEMORY_FIELD_NUMBER) == AVALIBLEMEMORY_FIELD_NUMBER;
        }

        public String getDeviceId() {
            ByteString ref = this.deviceId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.deviceId_ = s;
            }
            return s;
        }

        public ByteString getDeviceIdBytes() {
            Object ref = this.deviceId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.deviceId_ = b;
            return b;
        }

        public boolean hasIdfa() {
            return (this.bitField0_ & 32) == 32;
        }

        public String getIdfa() {
            ByteString ref = this.idfa_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.idfa_ = s;
            }
            return s;
        }

        public ByteString getIdfaBytes() {
            Object ref = this.idfa_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.idfa_ = b;
            return b;
        }

        public boolean hasChannel() {
            return (this.bitField0_ & 64) == 64;
        }

        public String getChannel() {
            ByteString ref = this.channel_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.channel_ = s;
            }
            return s;
        }

        public ByteString getChannelBytes() {
            Object ref = this.channel_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.channel_ = b;
            return b;
        }

        public boolean hasAppBundle() {
            return (this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT;
        }

        public String getAppBundle() {
            ByteString ref = this.appBundle_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.appBundle_ = s;
            }
            return s;
        }

        public ByteString getAppBundleBytes() {
            Object ref = this.appBundle_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.appBundle_ = b;
            return b;
        }

        public boolean hasAppVersion() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
        }

        public String getAppVersion() {
            ByteString ref = this.appVersion_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.appVersion_ = s;
            }
            return s;
        }

        public ByteString getAppVersionBytes() {
            Object ref = this.appVersion_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.appVersion_ = b;
            return b;
        }

        public boolean hasAppBuildVersion() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
        }

        public String getAppBuildVersion() {
            ByteString ref = this.appBuildVersion_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.appBuildVersion_ = s;
            }
            return s;
        }

        public ByteString getAppBuildVersionBytes() {
            Object ref = this.appBuildVersion_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.appBuildVersion_ = b;
            return b;
        }

        public boolean hasSystemName() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
        }

        public String getSystemName() {
            ByteString ref = this.systemName_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.systemName_ = s;
            }
            return s;
        }

        public ByteString getSystemNameBytes() {
            Object ref = this.systemName_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.systemName_ = b;
            return b;
        }

        public boolean hasSystemVersion() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT;
        }

        public String getSystemVersion() {
            ByteString ref = this.systemVersion_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.systemVersion_ = s;
            }
            return s;
        }

        public ByteString getSystemVersionBytes() {
            Object ref = this.systemVersion_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.systemVersion_ = b;
            return b;
        }

        public boolean hasAvalibleDisk() {
            return (this.bitField0_ & CodedOutputStream.DEFAULT_BUFFER_SIZE) == CodedOutputStream.DEFAULT_BUFFER_SIZE;
        }

        public String getAvalibleDisk() {
            ByteString ref = this.avalibleDisk_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.avalibleDisk_ = s;
            }
            return s;
        }

        public ByteString getAvalibleDiskBytes() {
            Object ref = this.avalibleDisk_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.avalibleDisk_ = b;
            return b;
        }

        public boolean hasTotalDisk() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD) == AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD;
        }

        public String getTotalDisk() {
            ByteString ref = this.totalDisk_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.totalDisk_ = s;
            }
            return s;
        }

        public ByteString getTotalDiskBytes() {
            Object ref = this.totalDisk_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.totalDisk_ = b;
            return b;
        }

        public boolean hasAppMemory() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_COPY) == AccessibilityNodeInfoCompat.ACTION_COPY;
        }

        public String getAppMemory() {
            ByteString ref = this.appMemory_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.appMemory_ = s;
            }
            return s;
        }

        public ByteString getAppMemoryBytes() {
            Object ref = this.appMemory_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.appMemory_ = b;
            return b;
        }

        public boolean hasAvalibleMemory() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PASTE) == AccessibilityNodeInfoCompat.ACTION_PASTE;
        }

        public String getAvalibleMemory() {
            ByteString ref = this.avalibleMemory_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.avalibleMemory_ = s;
            }
            return s;
        }

        public ByteString getAvalibleMemoryBytes() {
            Object ref = this.avalibleMemory_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.avalibleMemory_ = b;
            return b;
        }

        public boolean hasTotalMemory() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_CUT) == AccessibilityNodeInfoCompat.ACTION_CUT;
        }

        public String getTotalMemory() {
            ByteString ref = this.totalMemory_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.totalMemory_ = s;
            }
            return s;
        }

        public ByteString getTotalMemoryBytes() {
            Object ref = this.totalMemory_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.totalMemory_ = b;
            return b;
        }

        public boolean hasBatteryLevel() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_SET_SELECTION) == AccessibilityNodeInfoCompat.ACTION_SET_SELECTION;
        }

        public String getBatteryLevel() {
            ByteString ref = this.batteryLevel_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.batteryLevel_ = s;
            }
            return s;
        }

        public ByteString getBatteryLevelBytes() {
            Object ref = this.batteryLevel_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.batteryLevel_ = b;
            return b;
        }

        public boolean hasCarrier() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_EXPAND) == AccessibilityNodeInfoCompat.ACTION_EXPAND;
        }

        public String getCarrier() {
            ByteString ref = this.carrier_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.carrier_ = s;
            }
            return s;
        }

        public ByteString getCarrierBytes() {
            Object ref = this.carrier_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.carrier_ = b;
            return b;
        }

        public boolean hasDeviceModel() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) == AccessibilityNodeInfoCompat.ACTION_COLLAPSE;
        }

        public String getDeviceModel() {
            ByteString ref = this.deviceModel_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.deviceModel_ = s;
            }
            return s;
        }

        public ByteString getDeviceModelBytes() {
            Object ref = this.deviceModel_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.deviceModel_ = b;
            return b;
        }

        public boolean hasScreenResolution() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_DISMISS) == AccessibilityNodeInfoCompat.ACTION_DISMISS;
        }

        public String getScreenResolution() {
            ByteString ref = this.screenResolution_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.screenResolution_ = s;
            }
            return s;
        }

        public ByteString getScreenResolutionBytes() {
            Object ref = this.screenResolution_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.screenResolution_ = b;
            return b;
        }

        private void initFields() {
            this.eventName_ = BuildConfig.FLAVOR;
            this.eventTime_ = BuildConfig.FLAVOR;
            this.sessionId_ = BuildConfig.FLAVOR;
            this.appKey_ = BuildConfig.FLAVOR;
            this.deviceId_ = BuildConfig.FLAVOR;
            this.idfa_ = BuildConfig.FLAVOR;
            this.channel_ = BuildConfig.FLAVOR;
            this.appBundle_ = BuildConfig.FLAVOR;
            this.appVersion_ = BuildConfig.FLAVOR;
            this.appBuildVersion_ = BuildConfig.FLAVOR;
            this.systemName_ = BuildConfig.FLAVOR;
            this.systemVersion_ = BuildConfig.FLAVOR;
            this.avalibleDisk_ = BuildConfig.FLAVOR;
            this.totalDisk_ = BuildConfig.FLAVOR;
            this.appMemory_ = BuildConfig.FLAVOR;
            this.avalibleMemory_ = BuildConfig.FLAVOR;
            this.totalMemory_ = BuildConfig.FLAVOR;
            this.batteryLevel_ = BuildConfig.FLAVOR;
            this.carrier_ = BuildConfig.FLAVOR;
            this.deviceModel_ = BuildConfig.FLAVOR;
            this.screenResolution_ = BuildConfig.FLAVOR;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == (byte) 1) {
                return true;
            }
            if (isInitialized == null) {
                return false;
            }
            if (!hasEventName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasEventTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasSessionId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasAppKey()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (hasDeviceId()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                output.writeBytes(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                output.writeBytes(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                output.writeBytes(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & APPBUNDLE_FIELD_NUMBER) == APPBUNDLE_FIELD_NUMBER) {
                output.writeBytes(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & AVALIBLEMEMORY_FIELD_NUMBER) == AVALIBLEMEMORY_FIELD_NUMBER) {
                output.writeBytes(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                output.writeBytes(IDFA_FIELD_NUMBER, getIdfaBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                output.writeBytes(CHANNEL_FIELD_NUMBER, getChannelBytes());
            }
            if ((this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                output.writeBytes(APPBUNDLE_FIELD_NUMBER, getAppBundleBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                output.writeBytes(APPVERSION_FIELD_NUMBER, getAppVersionBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) {
                output.writeBytes(APPBUILDVERSION_FIELD_NUMBER, getAppBuildVersionBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) {
                output.writeBytes(SYSTEMNAME_FIELD_NUMBER, getSystemNameBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT) {
                output.writeBytes(SYSTEMVERSION_FIELD_NUMBER, getSystemVersionBytes());
            }
            if ((this.bitField0_ & CodedOutputStream.DEFAULT_BUFFER_SIZE) == CodedOutputStream.DEFAULT_BUFFER_SIZE) {
                output.writeBytes(AVALIBLEDISK_FIELD_NUMBER, getAvalibleDiskBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD) == AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD) {
                output.writeBytes(TOTALDISK_FIELD_NUMBER, getTotalDiskBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_COPY) == AccessibilityNodeInfoCompat.ACTION_COPY) {
                output.writeBytes(APPMEMORY_FIELD_NUMBER, getAppMemoryBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PASTE) == AccessibilityNodeInfoCompat.ACTION_PASTE) {
                output.writeBytes(AVALIBLEMEMORY_FIELD_NUMBER, getAvalibleMemoryBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_CUT) == AccessibilityNodeInfoCompat.ACTION_CUT) {
                output.writeBytes(TOTALMEMORY_FIELD_NUMBER, getTotalMemoryBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_SET_SELECTION) == AccessibilityNodeInfoCompat.ACTION_SET_SELECTION) {
                output.writeBytes(BATTERYLEVEL_FIELD_NUMBER, getBatteryLevelBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_EXPAND) == AccessibilityNodeInfoCompat.ACTION_EXPAND) {
                output.writeBytes(CARRIER_FIELD_NUMBER, getCarrierBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) == AccessibilityNodeInfoCompat.ACTION_COLLAPSE) {
                output.writeBytes(DEVICEMODEL_FIELD_NUMBER, getDeviceModelBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_DISMISS) == AccessibilityNodeInfoCompat.ACTION_DISMISS) {
                output.writeBytes(SCREENRESOLUTION_FIELD_NUMBER, getScreenResolutionBytes());
            }
            output.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                size = 0 + CodedOutputStream.computeBytesSize(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & APPBUNDLE_FIELD_NUMBER) == APPBUNDLE_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & AVALIBLEMEMORY_FIELD_NUMBER) == AVALIBLEMEMORY_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                size += CodedOutputStream.computeBytesSize(IDFA_FIELD_NUMBER, getIdfaBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                size += CodedOutputStream.computeBytesSize(CHANNEL_FIELD_NUMBER, getChannelBytes());
            }
            if ((this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                size += CodedOutputStream.computeBytesSize(APPBUNDLE_FIELD_NUMBER, getAppBundleBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                size += CodedOutputStream.computeBytesSize(APPVERSION_FIELD_NUMBER, getAppVersionBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) {
                size += CodedOutputStream.computeBytesSize(APPBUILDVERSION_FIELD_NUMBER, getAppBuildVersionBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) {
                size += CodedOutputStream.computeBytesSize(SYSTEMNAME_FIELD_NUMBER, getSystemNameBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT) == AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT) {
                size += CodedOutputStream.computeBytesSize(SYSTEMVERSION_FIELD_NUMBER, getSystemVersionBytes());
            }
            if ((this.bitField0_ & CodedOutputStream.DEFAULT_BUFFER_SIZE) == CodedOutputStream.DEFAULT_BUFFER_SIZE) {
                size += CodedOutputStream.computeBytesSize(AVALIBLEDISK_FIELD_NUMBER, getAvalibleDiskBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD) == AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD) {
                size += CodedOutputStream.computeBytesSize(TOTALDISK_FIELD_NUMBER, getTotalDiskBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_COPY) == AccessibilityNodeInfoCompat.ACTION_COPY) {
                size += CodedOutputStream.computeBytesSize(APPMEMORY_FIELD_NUMBER, getAppMemoryBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_PASTE) == AccessibilityNodeInfoCompat.ACTION_PASTE) {
                size += CodedOutputStream.computeBytesSize(AVALIBLEMEMORY_FIELD_NUMBER, getAvalibleMemoryBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_CUT) == AccessibilityNodeInfoCompat.ACTION_CUT) {
                size += CodedOutputStream.computeBytesSize(TOTALMEMORY_FIELD_NUMBER, getTotalMemoryBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_SET_SELECTION) == AccessibilityNodeInfoCompat.ACTION_SET_SELECTION) {
                size += CodedOutputStream.computeBytesSize(BATTERYLEVEL_FIELD_NUMBER, getBatteryLevelBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_EXPAND) == AccessibilityNodeInfoCompat.ACTION_EXPAND) {
                size += CodedOutputStream.computeBytesSize(CARRIER_FIELD_NUMBER, getCarrierBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) == AccessibilityNodeInfoCompat.ACTION_COLLAPSE) {
                size += CodedOutputStream.computeBytesSize(DEVICEMODEL_FIELD_NUMBER, getDeviceModelBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_DISMISS) == AccessibilityNodeInfoCompat.ACTION_DISMISS) {
                size += CodedOutputStream.computeBytesSize(SCREENRESOLUTION_FIELD_NUMBER, getScreenResolutionBytes());
            }
            size += this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static AppColdStartMsg parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (AppColdStartMsg) PARSER.parseFrom(data);
        }

        public static AppColdStartMsg parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AppColdStartMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static AppColdStartMsg parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (AppColdStartMsg) PARSER.parseFrom(data);
        }

        public static AppColdStartMsg parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AppColdStartMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static AppColdStartMsg parseFrom(InputStream input) throws IOException {
            return (AppColdStartMsg) PARSER.parseFrom(input);
        }

        public static AppColdStartMsg parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AppColdStartMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static AppColdStartMsg parseDelimitedFrom(InputStream input) throws IOException {
            return (AppColdStartMsg) PARSER.parseDelimitedFrom(input);
        }

        public static AppColdStartMsg parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AppColdStartMsg) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static AppColdStartMsg parseFrom(CodedInputStream input) throws IOException {
            return (AppColdStartMsg) PARSER.parseFrom(input);
        }

        public static AppColdStartMsg parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AppColdStartMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(AppColdStartMsg prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static final class AppEnterForeBackgroundMsg extends GeneratedMessageLite implements AppEnterForeBackgroundMsgOrBuilder {
        public static final int APPKEY_FIELD_NUMBER = 4;
        public static final int APPMEMORY_FIELD_NUMBER = 6;
        public static final int AVALIBLEDISK_FIELD_NUMBER = 8;
        public static final int AVALIBLEMEMORY_FIELD_NUMBER = 7;
        public static final int CHANNEL_FIELD_NUMBER = 9;
        public static final int DEVICEID_FIELD_NUMBER = 5;
        public static final int EVENTNAME_FIELD_NUMBER = 1;
        public static final int EVENTTIME_FIELD_NUMBER = 2;
        public static Parser<AppEnterForeBackgroundMsg> PARSER = null;
        public static final int SESSIONID_FIELD_NUMBER = 3;
        private static final AppEnterForeBackgroundMsg defaultInstance;
        private static final long serialVersionUID = 0;
        private Object appKey_;
        private Object appMemory_;
        private Object avalibleDisk_;
        private Object avalibleMemory_;
        private int bitField0_;
        private Object channel_;
        private Object deviceId_;
        private Object eventName_;
        private Object eventTime_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sessionId_;
        private final ByteString unknownFields;

        /* renamed from: com.netease.caipiao.dcsdk.event.ProtoEvent.AppEnterForeBackgroundMsg.1 */
        static class C04161 extends AbstractParser<AppEnterForeBackgroundMsg> {
            C04161() {
            }

            public AppEnterForeBackgroundMsg parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new AppEnterForeBackgroundMsg(extensionRegistry, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<AppEnterForeBackgroundMsg, Builder> implements AppEnterForeBackgroundMsgOrBuilder {
            private Object appKey_;
            private Object appMemory_;
            private Object avalibleDisk_;
            private Object avalibleMemory_;
            private int bitField0_;
            private Object channel_;
            private Object deviceId_;
            private Object eventName_;
            private Object eventTime_;
            private Object sessionId_;

            private Builder() {
                this.eventName_ = BuildConfig.FLAVOR;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.appKey_ = BuildConfig.FLAVOR;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.appMemory_ = BuildConfig.FLAVOR;
                this.avalibleMemory_ = BuildConfig.FLAVOR;
                this.avalibleDisk_ = BuildConfig.FLAVOR;
                this.channel_ = BuildConfig.FLAVOR;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.eventName_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -2;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -3;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -5;
                this.appKey_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -9;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -17;
                this.appMemory_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -33;
                this.avalibleMemory_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -65;
                this.avalibleDisk_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -129;
                this.channel_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -257;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public AppEnterForeBackgroundMsg getDefaultInstanceForType() {
                return AppEnterForeBackgroundMsg.getDefaultInstance();
            }

            public AppEnterForeBackgroundMsg build() {
                AppEnterForeBackgroundMsg result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw com.google.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(result);
            }

            public AppEnterForeBackgroundMsg buildPartial() {
                AppEnterForeBackgroundMsg result = new AppEnterForeBackgroundMsg(null);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & AppEnterForeBackgroundMsg.EVENTNAME_FIELD_NUMBER) == AppEnterForeBackgroundMsg.EVENTNAME_FIELD_NUMBER) {
                    to_bitField0_ = 0 | AppEnterForeBackgroundMsg.EVENTNAME_FIELD_NUMBER;
                }
                result.eventName_ = this.eventName_;
                if ((from_bitField0_ & AppEnterForeBackgroundMsg.EVENTTIME_FIELD_NUMBER) == AppEnterForeBackgroundMsg.EVENTTIME_FIELD_NUMBER) {
                    to_bitField0_ |= AppEnterForeBackgroundMsg.EVENTTIME_FIELD_NUMBER;
                }
                result.eventTime_ = this.eventTime_;
                if ((from_bitField0_ & AppEnterForeBackgroundMsg.APPKEY_FIELD_NUMBER) == AppEnterForeBackgroundMsg.APPKEY_FIELD_NUMBER) {
                    to_bitField0_ |= AppEnterForeBackgroundMsg.APPKEY_FIELD_NUMBER;
                }
                result.sessionId_ = this.sessionId_;
                if ((from_bitField0_ & AppEnterForeBackgroundMsg.AVALIBLEDISK_FIELD_NUMBER) == AppEnterForeBackgroundMsg.AVALIBLEDISK_FIELD_NUMBER) {
                    to_bitField0_ |= AppEnterForeBackgroundMsg.AVALIBLEDISK_FIELD_NUMBER;
                }
                result.appKey_ = this.appKey_;
                if ((from_bitField0_ & 16) == 16) {
                    to_bitField0_ |= 16;
                }
                result.deviceId_ = this.deviceId_;
                if ((from_bitField0_ & 32) == 32) {
                    to_bitField0_ |= 32;
                }
                result.appMemory_ = this.appMemory_;
                if ((from_bitField0_ & 64) == 64) {
                    to_bitField0_ |= 64;
                }
                result.avalibleMemory_ = this.avalibleMemory_;
                if ((from_bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                    to_bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                }
                result.avalibleDisk_ = this.avalibleDisk_;
                if ((from_bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                    to_bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                }
                result.channel_ = this.channel_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(AppEnterForeBackgroundMsg other) {
                if (other != AppEnterForeBackgroundMsg.getDefaultInstance()) {
                    if (other.hasEventName()) {
                        this.bitField0_ |= AppEnterForeBackgroundMsg.EVENTNAME_FIELD_NUMBER;
                        this.eventName_ = other.eventName_;
                    }
                    if (other.hasEventTime()) {
                        this.bitField0_ |= AppEnterForeBackgroundMsg.EVENTTIME_FIELD_NUMBER;
                        this.eventTime_ = other.eventTime_;
                    }
                    if (other.hasSessionId()) {
                        this.bitField0_ |= AppEnterForeBackgroundMsg.APPKEY_FIELD_NUMBER;
                        this.sessionId_ = other.sessionId_;
                    }
                    if (other.hasAppKey()) {
                        this.bitField0_ |= AppEnterForeBackgroundMsg.AVALIBLEDISK_FIELD_NUMBER;
                        this.appKey_ = other.appKey_;
                    }
                    if (other.hasDeviceId()) {
                        this.bitField0_ |= 16;
                        this.deviceId_ = other.deviceId_;
                    }
                    if (other.hasAppMemory()) {
                        this.bitField0_ |= 32;
                        this.appMemory_ = other.appMemory_;
                    }
                    if (other.hasAvalibleMemory()) {
                        this.bitField0_ |= 64;
                        this.avalibleMemory_ = other.avalibleMemory_;
                    }
                    if (other.hasAvalibleDisk()) {
                        this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                        this.avalibleDisk_ = other.avalibleDisk_;
                    }
                    if (other.hasChannel()) {
                        this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                        this.channel_ = other.channel_;
                    }
                    setUnknownFields(getUnknownFields().concat(other.unknownFields));
                }
                return this;
            }

            public final boolean isInitialized() {
                if (hasEventName() && hasEventTime() && hasSessionId() && hasAppKey() && hasDeviceId()) {
                    return true;
                }
                return false;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                AppEnterForeBackgroundMsg parsedMessage = null;
                try {
                    parsedMessage = (AppEnterForeBackgroundMsg) AppEnterForeBackgroundMsg.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AppEnterForeBackgroundMsg) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
            }

            public boolean hasEventName() {
                return (this.bitField0_ & AppEnterForeBackgroundMsg.EVENTNAME_FIELD_NUMBER) == AppEnterForeBackgroundMsg.EVENTNAME_FIELD_NUMBER;
            }

            public String getEventName() {
                ByteString ref = this.eventName_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventName_ = s;
                return s;
            }

            public ByteString getEventNameBytes() {
                Object ref = this.eventName_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventName_ = b;
                return b;
            }

            public Builder setEventName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppEnterForeBackgroundMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public Builder clearEventName() {
                this.bitField0_ &= -2;
                this.eventName_ = AppEnterForeBackgroundMsg.getDefaultInstance().getEventName();
                return this;
            }

            public Builder setEventNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppEnterForeBackgroundMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public boolean hasEventTime() {
                return (this.bitField0_ & AppEnterForeBackgroundMsg.EVENTTIME_FIELD_NUMBER) == AppEnterForeBackgroundMsg.EVENTTIME_FIELD_NUMBER;
            }

            public String getEventTime() {
                ByteString ref = this.eventTime_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventTime_ = s;
                return s;
            }

            public ByteString getEventTimeBytes() {
                Object ref = this.eventTime_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventTime_ = b;
                return b;
            }

            public Builder setEventTime(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppEnterForeBackgroundMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public Builder clearEventTime() {
                this.bitField0_ &= -3;
                this.eventTime_ = AppEnterForeBackgroundMsg.getDefaultInstance().getEventTime();
                return this;
            }

            public Builder setEventTimeBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppEnterForeBackgroundMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public boolean hasSessionId() {
                return (this.bitField0_ & AppEnterForeBackgroundMsg.APPKEY_FIELD_NUMBER) == AppEnterForeBackgroundMsg.APPKEY_FIELD_NUMBER;
            }

            public String getSessionId() {
                ByteString ref = this.sessionId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.sessionId_ = s;
                return s;
            }

            public ByteString getSessionIdBytes() {
                Object ref = this.sessionId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.sessionId_ = b;
                return b;
            }

            public Builder setSessionId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppEnterForeBackgroundMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -5;
                this.sessionId_ = AppEnterForeBackgroundMsg.getDefaultInstance().getSessionId();
                return this;
            }

            public Builder setSessionIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppEnterForeBackgroundMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public boolean hasAppKey() {
                return (this.bitField0_ & AppEnterForeBackgroundMsg.AVALIBLEDISK_FIELD_NUMBER) == AppEnterForeBackgroundMsg.AVALIBLEDISK_FIELD_NUMBER;
            }

            public String getAppKey() {
                ByteString ref = this.appKey_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.appKey_ = s;
                return s;
            }

            public ByteString getAppKeyBytes() {
                Object ref = this.appKey_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.appKey_ = b;
                return b;
            }

            public Builder setAppKey(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppEnterForeBackgroundMsg.AVALIBLEDISK_FIELD_NUMBER;
                this.appKey_ = value;
                return this;
            }

            public Builder clearAppKey() {
                this.bitField0_ &= -9;
                this.appKey_ = AppEnterForeBackgroundMsg.getDefaultInstance().getAppKey();
                return this;
            }

            public Builder setAppKeyBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppEnterForeBackgroundMsg.AVALIBLEDISK_FIELD_NUMBER;
                this.appKey_ = value;
                return this;
            }

            public boolean hasDeviceId() {
                return (this.bitField0_ & 16) == 16;
            }

            public String getDeviceId() {
                ByteString ref = this.deviceId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.deviceId_ = s;
                return s;
            }

            public ByteString getDeviceIdBytes() {
                Object ref = this.deviceId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.deviceId_ = b;
                return b;
            }

            public Builder setDeviceId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public Builder clearDeviceId() {
                this.bitField0_ &= -17;
                this.deviceId_ = AppEnterForeBackgroundMsg.getDefaultInstance().getDeviceId();
                return this;
            }

            public Builder setDeviceIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public boolean hasAppMemory() {
                return (this.bitField0_ & 32) == 32;
            }

            public String getAppMemory() {
                ByteString ref = this.appMemory_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.appMemory_ = s;
                return s;
            }

            public ByteString getAppMemoryBytes() {
                Object ref = this.appMemory_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.appMemory_ = b;
                return b;
            }

            public Builder setAppMemory(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.appMemory_ = value;
                return this;
            }

            public Builder clearAppMemory() {
                this.bitField0_ &= -33;
                this.appMemory_ = AppEnterForeBackgroundMsg.getDefaultInstance().getAppMemory();
                return this;
            }

            public Builder setAppMemoryBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.appMemory_ = value;
                return this;
            }

            public boolean hasAvalibleMemory() {
                return (this.bitField0_ & 64) == 64;
            }

            public String getAvalibleMemory() {
                ByteString ref = this.avalibleMemory_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.avalibleMemory_ = s;
                return s;
            }

            public ByteString getAvalibleMemoryBytes() {
                Object ref = this.avalibleMemory_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.avalibleMemory_ = b;
                return b;
            }

            public Builder setAvalibleMemory(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.avalibleMemory_ = value;
                return this;
            }

            public Builder clearAvalibleMemory() {
                this.bitField0_ &= -65;
                this.avalibleMemory_ = AppEnterForeBackgroundMsg.getDefaultInstance().getAvalibleMemory();
                return this;
            }

            public Builder setAvalibleMemoryBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.avalibleMemory_ = value;
                return this;
            }

            public boolean hasAvalibleDisk() {
                return (this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT;
            }

            public String getAvalibleDisk() {
                ByteString ref = this.avalibleDisk_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.avalibleDisk_ = s;
                return s;
            }

            public ByteString getAvalibleDiskBytes() {
                Object ref = this.avalibleDisk_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.avalibleDisk_ = b;
                return b;
            }

            public Builder setAvalibleDisk(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                this.avalibleDisk_ = value;
                return this;
            }

            public Builder clearAvalibleDisk() {
                this.bitField0_ &= -129;
                this.avalibleDisk_ = AppEnterForeBackgroundMsg.getDefaultInstance().getAvalibleDisk();
                return this;
            }

            public Builder setAvalibleDiskBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                this.avalibleDisk_ = value;
                return this;
            }

            public boolean hasChannel() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
            }

            public String getChannel() {
                ByteString ref = this.channel_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.channel_ = s;
                return s;
            }

            public ByteString getChannelBytes() {
                Object ref = this.channel_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.channel_ = b;
                return b;
            }

            public Builder setChannel(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                this.channel_ = value;
                return this;
            }

            public Builder clearChannel() {
                this.bitField0_ &= -257;
                this.channel_ = AppEnterForeBackgroundMsg.getDefaultInstance().getChannel();
                return this;
            }

            public Builder setChannelBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                this.channel_ = value;
                return this;
            }
        }

        private AppEnterForeBackgroundMsg(com.google.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private AppEnterForeBackgroundMsg(boolean noInit) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static AppEnterForeBackgroundMsg getDefaultInstance() {
            return defaultInstance;
        }

        public AppEnterForeBackgroundMsg getDefaultInstanceForType() {
            return defaultInstance;
        }

        private AppEnterForeBackgroundMsg(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            OutputStream unknownFieldsOutput = ByteString.newOutput();
            CodedOutputStream unknownFieldsCodedOutput = CodedOutputStream.newInstance(unknownFieldsOutput);
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    ByteString bs;
                    switch (tag) {
                        case SwipeRefreshLayout.LARGE /*0*/:
                            done = true;
                            break;
                        case AppColdStartMsg.APPBUILDVERSION_FIELD_NUMBER /*10*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTNAME_FIELD_NUMBER;
                            this.eventName_ = bs;
                            break;
                        case AppColdStartMsg.BATTERYLEVEL_FIELD_NUMBER /*18*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTTIME_FIELD_NUMBER;
                            this.eventTime_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionMenuTextColor /*26*/:
                            bs = input.readBytes();
                            this.bitField0_ |= APPKEY_FIELD_NUMBER;
                            this.sessionId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionModePasteDrawable /*34*/:
                            bs = input.readBytes();
                            this.bitField0_ |= AVALIBLEDISK_FIELD_NUMBER;
                            this.appKey_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_dialogTheme /*42*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 16;
                            this.deviceId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_buttonBarStyle /*50*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 32;
                            this.appMemory_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_toolbarStyle /*58*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 64;
                            this.avalibleMemory_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /*66*/:
                            bs = input.readBytes();
                            this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                            this.avalibleDisk_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_dropDownListViewStyle /*74*/:
                            bs = input.readBytes();
                            this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                            this.channel_ = bs;
                            break;
                        default:
                            if (!parseUnknownField(input, unknownFieldsCodedOutput, extensionRegistry, tag)) {
                                done = true;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    try {
                        unknownFieldsCodedOutput.flush();
                    } catch (IOException e3) {
                        makeExtensionsImmutable();
                    } finally {
                        this.unknownFields = unknownFieldsOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }
            }
            try {
                unknownFieldsCodedOutput.flush();
            } catch (IOException e4) {
            } finally {
                this.unknownFields = unknownFieldsOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            PARSER = new C04161();
            defaultInstance = new AppEnterForeBackgroundMsg(true);
            defaultInstance.initFields();
        }

        public Parser<AppEnterForeBackgroundMsg> getParserForType() {
            return PARSER;
        }

        public boolean hasEventName() {
            return (this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER;
        }

        public String getEventName() {
            ByteString ref = this.eventName_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventName_ = s;
            }
            return s;
        }

        public ByteString getEventNameBytes() {
            Object ref = this.eventName_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventName_ = b;
            return b;
        }

        public boolean hasEventTime() {
            return (this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER;
        }

        public String getEventTime() {
            ByteString ref = this.eventTime_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventTime_ = s;
            }
            return s;
        }

        public ByteString getEventTimeBytes() {
            Object ref = this.eventTime_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventTime_ = b;
            return b;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER;
        }

        public String getSessionId() {
            ByteString ref = this.sessionId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.sessionId_ = s;
            }
            return s;
        }

        public ByteString getSessionIdBytes() {
            Object ref = this.sessionId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.sessionId_ = b;
            return b;
        }

        public boolean hasAppKey() {
            return (this.bitField0_ & AVALIBLEDISK_FIELD_NUMBER) == AVALIBLEDISK_FIELD_NUMBER;
        }

        public String getAppKey() {
            ByteString ref = this.appKey_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.appKey_ = s;
            }
            return s;
        }

        public ByteString getAppKeyBytes() {
            Object ref = this.appKey_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.appKey_ = b;
            return b;
        }

        public boolean hasDeviceId() {
            return (this.bitField0_ & 16) == 16;
        }

        public String getDeviceId() {
            ByteString ref = this.deviceId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.deviceId_ = s;
            }
            return s;
        }

        public ByteString getDeviceIdBytes() {
            Object ref = this.deviceId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.deviceId_ = b;
            return b;
        }

        public boolean hasAppMemory() {
            return (this.bitField0_ & 32) == 32;
        }

        public String getAppMemory() {
            ByteString ref = this.appMemory_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.appMemory_ = s;
            }
            return s;
        }

        public ByteString getAppMemoryBytes() {
            Object ref = this.appMemory_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.appMemory_ = b;
            return b;
        }

        public boolean hasAvalibleMemory() {
            return (this.bitField0_ & 64) == 64;
        }

        public String getAvalibleMemory() {
            ByteString ref = this.avalibleMemory_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.avalibleMemory_ = s;
            }
            return s;
        }

        public ByteString getAvalibleMemoryBytes() {
            Object ref = this.avalibleMemory_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.avalibleMemory_ = b;
            return b;
        }

        public boolean hasAvalibleDisk() {
            return (this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT;
        }

        public String getAvalibleDisk() {
            ByteString ref = this.avalibleDisk_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.avalibleDisk_ = s;
            }
            return s;
        }

        public ByteString getAvalibleDiskBytes() {
            Object ref = this.avalibleDisk_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.avalibleDisk_ = b;
            return b;
        }

        public boolean hasChannel() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
        }

        public String getChannel() {
            ByteString ref = this.channel_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.channel_ = s;
            }
            return s;
        }

        public ByteString getChannelBytes() {
            Object ref = this.channel_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.channel_ = b;
            return b;
        }

        private void initFields() {
            this.eventName_ = BuildConfig.FLAVOR;
            this.eventTime_ = BuildConfig.FLAVOR;
            this.sessionId_ = BuildConfig.FLAVOR;
            this.appKey_ = BuildConfig.FLAVOR;
            this.deviceId_ = BuildConfig.FLAVOR;
            this.appMemory_ = BuildConfig.FLAVOR;
            this.avalibleMemory_ = BuildConfig.FLAVOR;
            this.avalibleDisk_ = BuildConfig.FLAVOR;
            this.channel_ = BuildConfig.FLAVOR;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == (byte) 1) {
                return true;
            }
            if (isInitialized == null) {
                return false;
            }
            if (!hasEventName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasEventTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasSessionId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasAppKey()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (hasDeviceId()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                output.writeBytes(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                output.writeBytes(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                output.writeBytes(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & AVALIBLEDISK_FIELD_NUMBER) == AVALIBLEDISK_FIELD_NUMBER) {
                output.writeBytes(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                output.writeBytes(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                output.writeBytes(APPMEMORY_FIELD_NUMBER, getAppMemoryBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                output.writeBytes(AVALIBLEMEMORY_FIELD_NUMBER, getAvalibleMemoryBytes());
            }
            if ((this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                output.writeBytes(AVALIBLEDISK_FIELD_NUMBER, getAvalibleDiskBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                output.writeBytes(CHANNEL_FIELD_NUMBER, getChannelBytes());
            }
            output.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                size = 0 + CodedOutputStream.computeBytesSize(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & AVALIBLEDISK_FIELD_NUMBER) == AVALIBLEDISK_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                size += CodedOutputStream.computeBytesSize(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                size += CodedOutputStream.computeBytesSize(APPMEMORY_FIELD_NUMBER, getAppMemoryBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                size += CodedOutputStream.computeBytesSize(AVALIBLEMEMORY_FIELD_NUMBER, getAvalibleMemoryBytes());
            }
            if ((this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                size += CodedOutputStream.computeBytesSize(AVALIBLEDISK_FIELD_NUMBER, getAvalibleDiskBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                size += CodedOutputStream.computeBytesSize(CHANNEL_FIELD_NUMBER, getChannelBytes());
            }
            size += this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static AppEnterForeBackgroundMsg parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (AppEnterForeBackgroundMsg) PARSER.parseFrom(data);
        }

        public static AppEnterForeBackgroundMsg parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AppEnterForeBackgroundMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static AppEnterForeBackgroundMsg parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (AppEnterForeBackgroundMsg) PARSER.parseFrom(data);
        }

        public static AppEnterForeBackgroundMsg parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AppEnterForeBackgroundMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static AppEnterForeBackgroundMsg parseFrom(InputStream input) throws IOException {
            return (AppEnterForeBackgroundMsg) PARSER.parseFrom(input);
        }

        public static AppEnterForeBackgroundMsg parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AppEnterForeBackgroundMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static AppEnterForeBackgroundMsg parseDelimitedFrom(InputStream input) throws IOException {
            return (AppEnterForeBackgroundMsg) PARSER.parseDelimitedFrom(input);
        }

        public static AppEnterForeBackgroundMsg parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AppEnterForeBackgroundMsg) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static AppEnterForeBackgroundMsg parseFrom(CodedInputStream input) throws IOException {
            return (AppEnterForeBackgroundMsg) PARSER.parseFrom(input);
        }

        public static AppEnterForeBackgroundMsg parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AppEnterForeBackgroundMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(AppEnterForeBackgroundMsg prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static final class AppInstallationMsg extends GeneratedMessageLite implements AppInstallationMsgOrBuilder {
        public static final int APPKEY_FIELD_NUMBER = 4;
        public static final int DEVICEID_FIELD_NUMBER = 5;
        public static final int EVENTNAME_FIELD_NUMBER = 1;
        public static final int EVENTTIME_FIELD_NUMBER = 2;
        public static final int ITEM_FIELD_NUMBER = 6;
        public static Parser<AppInstallationMsg> PARSER = null;
        public static final int SESSIONID_FIELD_NUMBER = 3;
        private static final AppInstallationMsg defaultInstance;
        private static final long serialVersionUID = 0;
        private Object appKey_;
        private int bitField0_;
        private Object deviceId_;
        private Object eventName_;
        private Object eventTime_;
        private List<MapItem> item_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sessionId_;
        private final ByteString unknownFields;

        /* renamed from: com.netease.caipiao.dcsdk.event.ProtoEvent.AppInstallationMsg.1 */
        static class C04171 extends AbstractParser<AppInstallationMsg> {
            C04171() {
            }

            public AppInstallationMsg parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new AppInstallationMsg(extensionRegistry, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<AppInstallationMsg, Builder> implements AppInstallationMsgOrBuilder {
            private Object appKey_;
            private int bitField0_;
            private Object deviceId_;
            private Object eventName_;
            private Object eventTime_;
            private List<MapItem> item_;
            private Object sessionId_;

            private Builder() {
                this.eventName_ = BuildConfig.FLAVOR;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.appKey_ = BuildConfig.FLAVOR;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.item_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.eventName_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -2;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -3;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -5;
                this.appKey_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -9;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -17;
                this.item_ = Collections.emptyList();
                this.bitField0_ &= -33;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public AppInstallationMsg getDefaultInstanceForType() {
                return AppInstallationMsg.getDefaultInstance();
            }

            public AppInstallationMsg build() {
                AppInstallationMsg result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw com.google.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(result);
            }

            public AppInstallationMsg buildPartial() {
                AppInstallationMsg result = new AppInstallationMsg(null);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & AppInstallationMsg.EVENTNAME_FIELD_NUMBER) == AppInstallationMsg.EVENTNAME_FIELD_NUMBER) {
                    to_bitField0_ = 0 | AppInstallationMsg.EVENTNAME_FIELD_NUMBER;
                }
                result.eventName_ = this.eventName_;
                if ((from_bitField0_ & AppInstallationMsg.EVENTTIME_FIELD_NUMBER) == AppInstallationMsg.EVENTTIME_FIELD_NUMBER) {
                    to_bitField0_ |= AppInstallationMsg.EVENTTIME_FIELD_NUMBER;
                }
                result.eventTime_ = this.eventTime_;
                if ((from_bitField0_ & AppInstallationMsg.APPKEY_FIELD_NUMBER) == AppInstallationMsg.APPKEY_FIELD_NUMBER) {
                    to_bitField0_ |= AppInstallationMsg.APPKEY_FIELD_NUMBER;
                }
                result.sessionId_ = this.sessionId_;
                if ((from_bitField0_ & 8) == 8) {
                    to_bitField0_ |= 8;
                }
                result.appKey_ = this.appKey_;
                if ((from_bitField0_ & 16) == 16) {
                    to_bitField0_ |= 16;
                }
                result.deviceId_ = this.deviceId_;
                if ((this.bitField0_ & 32) == 32) {
                    this.item_ = Collections.unmodifiableList(this.item_);
                    this.bitField0_ &= -33;
                }
                result.item_ = this.item_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(AppInstallationMsg other) {
                if (other != AppInstallationMsg.getDefaultInstance()) {
                    if (other.hasEventName()) {
                        this.bitField0_ |= AppInstallationMsg.EVENTNAME_FIELD_NUMBER;
                        this.eventName_ = other.eventName_;
                    }
                    if (other.hasEventTime()) {
                        this.bitField0_ |= AppInstallationMsg.EVENTTIME_FIELD_NUMBER;
                        this.eventTime_ = other.eventTime_;
                    }
                    if (other.hasSessionId()) {
                        this.bitField0_ |= AppInstallationMsg.APPKEY_FIELD_NUMBER;
                        this.sessionId_ = other.sessionId_;
                    }
                    if (other.hasAppKey()) {
                        this.bitField0_ |= 8;
                        this.appKey_ = other.appKey_;
                    }
                    if (other.hasDeviceId()) {
                        this.bitField0_ |= 16;
                        this.deviceId_ = other.deviceId_;
                    }
                    if (!other.item_.isEmpty()) {
                        if (this.item_.isEmpty()) {
                            this.item_ = other.item_;
                            this.bitField0_ &= -33;
                        } else {
                            ensureItemIsMutable();
                            this.item_.addAll(other.item_);
                        }
                    }
                    setUnknownFields(getUnknownFields().concat(other.unknownFields));
                }
                return this;
            }

            public final boolean isInitialized() {
                if (!hasEventName() || !hasEventTime() || !hasSessionId() || !hasAppKey() || !hasDeviceId()) {
                    return false;
                }
                for (int i = 0; i < getItemCount(); i += AppInstallationMsg.EVENTNAME_FIELD_NUMBER) {
                    if (!getItem(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                AppInstallationMsg parsedMessage = null;
                try {
                    parsedMessage = (AppInstallationMsg) AppInstallationMsg.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AppInstallationMsg) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
            }

            public boolean hasEventName() {
                return (this.bitField0_ & AppInstallationMsg.EVENTNAME_FIELD_NUMBER) == AppInstallationMsg.EVENTNAME_FIELD_NUMBER;
            }

            public String getEventName() {
                ByteString ref = this.eventName_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventName_ = s;
                return s;
            }

            public ByteString getEventNameBytes() {
                Object ref = this.eventName_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventName_ = b;
                return b;
            }

            public Builder setEventName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppInstallationMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public Builder clearEventName() {
                this.bitField0_ &= -2;
                this.eventName_ = AppInstallationMsg.getDefaultInstance().getEventName();
                return this;
            }

            public Builder setEventNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppInstallationMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public boolean hasEventTime() {
                return (this.bitField0_ & AppInstallationMsg.EVENTTIME_FIELD_NUMBER) == AppInstallationMsg.EVENTTIME_FIELD_NUMBER;
            }

            public String getEventTime() {
                ByteString ref = this.eventTime_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventTime_ = s;
                return s;
            }

            public ByteString getEventTimeBytes() {
                Object ref = this.eventTime_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventTime_ = b;
                return b;
            }

            public Builder setEventTime(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppInstallationMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public Builder clearEventTime() {
                this.bitField0_ &= -3;
                this.eventTime_ = AppInstallationMsg.getDefaultInstance().getEventTime();
                return this;
            }

            public Builder setEventTimeBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppInstallationMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public boolean hasSessionId() {
                return (this.bitField0_ & AppInstallationMsg.APPKEY_FIELD_NUMBER) == AppInstallationMsg.APPKEY_FIELD_NUMBER;
            }

            public String getSessionId() {
                ByteString ref = this.sessionId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.sessionId_ = s;
                return s;
            }

            public ByteString getSessionIdBytes() {
                Object ref = this.sessionId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.sessionId_ = b;
                return b;
            }

            public Builder setSessionId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppInstallationMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -5;
                this.sessionId_ = AppInstallationMsg.getDefaultInstance().getSessionId();
                return this;
            }

            public Builder setSessionIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppInstallationMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public boolean hasAppKey() {
                return (this.bitField0_ & 8) == 8;
            }

            public String getAppKey() {
                ByteString ref = this.appKey_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.appKey_ = s;
                return s;
            }

            public ByteString getAppKeyBytes() {
                Object ref = this.appKey_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.appKey_ = b;
                return b;
            }

            public Builder setAppKey(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.appKey_ = value;
                return this;
            }

            public Builder clearAppKey() {
                this.bitField0_ &= -9;
                this.appKey_ = AppInstallationMsg.getDefaultInstance().getAppKey();
                return this;
            }

            public Builder setAppKeyBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.appKey_ = value;
                return this;
            }

            public boolean hasDeviceId() {
                return (this.bitField0_ & 16) == 16;
            }

            public String getDeviceId() {
                ByteString ref = this.deviceId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.deviceId_ = s;
                return s;
            }

            public ByteString getDeviceIdBytes() {
                Object ref = this.deviceId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.deviceId_ = b;
                return b;
            }

            public Builder setDeviceId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public Builder clearDeviceId() {
                this.bitField0_ &= -17;
                this.deviceId_ = AppInstallationMsg.getDefaultInstance().getDeviceId();
                return this;
            }

            public Builder setDeviceIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            private void ensureItemIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.item_ = new ArrayList(this.item_);
                    this.bitField0_ |= 32;
                }
            }

            public List<MapItem> getItemList() {
                return Collections.unmodifiableList(this.item_);
            }

            public int getItemCount() {
                return this.item_.size();
            }

            public MapItem getItem(int index) {
                return (MapItem) this.item_.get(index);
            }

            public Builder setItem(int index, MapItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemIsMutable();
                this.item_.set(index, value);
                return this;
            }

            public Builder setItem(int index, Builder builderForValue) {
                ensureItemIsMutable();
                this.item_.set(index, builderForValue.build());
                return this;
            }

            public Builder addItem(MapItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemIsMutable();
                this.item_.add(value);
                return this;
            }

            public Builder addItem(int index, MapItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemIsMutable();
                this.item_.add(index, value);
                return this;
            }

            public Builder addItem(Builder builderForValue) {
                ensureItemIsMutable();
                this.item_.add(builderForValue.build());
                return this;
            }

            public Builder addItem(int index, Builder builderForValue) {
                ensureItemIsMutable();
                this.item_.add(index, builderForValue.build());
                return this;
            }

            public Builder addAllItem(Iterable<? extends MapItem> values) {
                ensureItemIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.item_);
                return this;
            }

            public Builder clearItem() {
                this.item_ = Collections.emptyList();
                this.bitField0_ &= -33;
                return this;
            }

            public Builder removeItem(int index) {
                ensureItemIsMutable();
                this.item_.remove(index);
                return this;
            }
        }

        private AppInstallationMsg(com.google.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private AppInstallationMsg(boolean noInit) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static AppInstallationMsg getDefaultInstance() {
            return defaultInstance;
        }

        public AppInstallationMsg getDefaultInstanceForType() {
            return defaultInstance;
        }

        private AppInstallationMsg(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            OutputStream unknownFieldsOutput = ByteString.newOutput();
            CodedOutputStream unknownFieldsCodedOutput = CodedOutputStream.newInstance(unknownFieldsOutput);
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    ByteString bs;
                    switch (tag) {
                        case SwipeRefreshLayout.LARGE /*0*/:
                            done = true;
                            break;
                        case AppColdStartMsg.APPBUILDVERSION_FIELD_NUMBER /*10*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTNAME_FIELD_NUMBER;
                            this.eventName_ = bs;
                            break;
                        case AppColdStartMsg.BATTERYLEVEL_FIELD_NUMBER /*18*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTTIME_FIELD_NUMBER;
                            this.eventTime_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionMenuTextColor /*26*/:
                            bs = input.readBytes();
                            this.bitField0_ |= APPKEY_FIELD_NUMBER;
                            this.sessionId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionModePasteDrawable /*34*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 8;
                            this.appKey_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_dialogTheme /*42*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 16;
                            this.deviceId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_buttonBarStyle /*50*/:
                            if ((mutable_bitField0_ & 32) != 32) {
                                this.item_ = new ArrayList();
                                mutable_bitField0_ |= 32;
                            }
                            this.item_.add(input.readMessage(MapItem.PARSER, extensionRegistry));
                            break;
                        default:
                            if (!parseUnknownField(input, unknownFieldsCodedOutput, extensionRegistry, tag)) {
                                done = true;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if ((mutable_bitField0_ & 32) == 32) {
                        this.item_ = Collections.unmodifiableList(this.item_);
                    }
                    try {
                        unknownFieldsCodedOutput.flush();
                    } catch (IOException e3) {
                        makeExtensionsImmutable();
                    } finally {
                        this.unknownFields = unknownFieldsOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }
            }
            if ((mutable_bitField0_ & 32) == 32) {
                this.item_ = Collections.unmodifiableList(this.item_);
            }
            try {
                unknownFieldsCodedOutput.flush();
            } catch (IOException e4) {
            } finally {
                this.unknownFields = unknownFieldsOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            PARSER = new C04171();
            defaultInstance = new AppInstallationMsg(true);
            defaultInstance.initFields();
        }

        public Parser<AppInstallationMsg> getParserForType() {
            return PARSER;
        }

        public boolean hasEventName() {
            return (this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER;
        }

        public String getEventName() {
            ByteString ref = this.eventName_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventName_ = s;
            }
            return s;
        }

        public ByteString getEventNameBytes() {
            Object ref = this.eventName_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventName_ = b;
            return b;
        }

        public boolean hasEventTime() {
            return (this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER;
        }

        public String getEventTime() {
            ByteString ref = this.eventTime_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventTime_ = s;
            }
            return s;
        }

        public ByteString getEventTimeBytes() {
            Object ref = this.eventTime_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventTime_ = b;
            return b;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER;
        }

        public String getSessionId() {
            ByteString ref = this.sessionId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.sessionId_ = s;
            }
            return s;
        }

        public ByteString getSessionIdBytes() {
            Object ref = this.sessionId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.sessionId_ = b;
            return b;
        }

        public boolean hasAppKey() {
            return (this.bitField0_ & 8) == 8;
        }

        public String getAppKey() {
            ByteString ref = this.appKey_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.appKey_ = s;
            }
            return s;
        }

        public ByteString getAppKeyBytes() {
            Object ref = this.appKey_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.appKey_ = b;
            return b;
        }

        public boolean hasDeviceId() {
            return (this.bitField0_ & 16) == 16;
        }

        public String getDeviceId() {
            ByteString ref = this.deviceId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.deviceId_ = s;
            }
            return s;
        }

        public ByteString getDeviceIdBytes() {
            Object ref = this.deviceId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.deviceId_ = b;
            return b;
        }

        public List<MapItem> getItemList() {
            return this.item_;
        }

        public List<? extends MapItemOrBuilder> getItemOrBuilderList() {
            return this.item_;
        }

        public int getItemCount() {
            return this.item_.size();
        }

        public MapItem getItem(int index) {
            return (MapItem) this.item_.get(index);
        }

        public MapItemOrBuilder getItemOrBuilder(int index) {
            return (MapItemOrBuilder) this.item_.get(index);
        }

        private void initFields() {
            this.eventName_ = BuildConfig.FLAVOR;
            this.eventTime_ = BuildConfig.FLAVOR;
            this.sessionId_ = BuildConfig.FLAVOR;
            this.appKey_ = BuildConfig.FLAVOR;
            this.deviceId_ = BuildConfig.FLAVOR;
            this.item_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == (byte) 1) {
                return true;
            }
            if (isInitialized == null) {
                return false;
            }
            if (!hasEventName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasEventTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasSessionId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasAppKey()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (hasDeviceId()) {
                int i = 0;
                while (i < getItemCount()) {
                    if (getItem(i).isInitialized()) {
                        i += EVENTNAME_FIELD_NUMBER;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                output.writeBytes(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                output.writeBytes(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                output.writeBytes(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                output.writeBytes(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                output.writeBytes(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            for (int i = 0; i < this.item_.size(); i += EVENTNAME_FIELD_NUMBER) {
                output.writeMessage(ITEM_FIELD_NUMBER, (MessageLite) this.item_.get(i));
            }
            output.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                size = 0 + CodedOutputStream.computeBytesSize(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                size += CodedOutputStream.computeBytesSize(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                size += CodedOutputStream.computeBytesSize(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            for (int i = 0; i < this.item_.size(); i += EVENTNAME_FIELD_NUMBER) {
                size += CodedOutputStream.computeMessageSize(ITEM_FIELD_NUMBER, (MessageLite) this.item_.get(i));
            }
            size += this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static AppInstallationMsg parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (AppInstallationMsg) PARSER.parseFrom(data);
        }

        public static AppInstallationMsg parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AppInstallationMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static AppInstallationMsg parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (AppInstallationMsg) PARSER.parseFrom(data);
        }

        public static AppInstallationMsg parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AppInstallationMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static AppInstallationMsg parseFrom(InputStream input) throws IOException {
            return (AppInstallationMsg) PARSER.parseFrom(input);
        }

        public static AppInstallationMsg parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AppInstallationMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static AppInstallationMsg parseDelimitedFrom(InputStream input) throws IOException {
            return (AppInstallationMsg) PARSER.parseDelimitedFrom(input);
        }

        public static AppInstallationMsg parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AppInstallationMsg) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static AppInstallationMsg parseFrom(CodedInputStream input) throws IOException {
            return (AppInstallationMsg) PARSER.parseFrom(input);
        }

        public static AppInstallationMsg parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AppInstallationMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(AppInstallationMsg prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static final class AppUrlMsg extends GeneratedMessageLite implements AppUrlMsgOrBuilder {
        public static final int APPKEY_FIELD_NUMBER = 4;
        public static final int DEVICEID_FIELD_NUMBER = 5;
        public static final int EVENTNAME_FIELD_NUMBER = 1;
        public static final int EVENTTIME_FIELD_NUMBER = 2;
        public static Parser<AppUrlMsg> PARSER = null;
        public static final int SESSIONID_FIELD_NUMBER = 3;
        public static final int SUCCEED_FIELD_NUMBER = 7;
        public static final int URL_FIELD_NUMBER = 6;
        private static final AppUrlMsg defaultInstance;
        private static final long serialVersionUID = 0;
        private Object appKey_;
        private int bitField0_;
        private Object deviceId_;
        private Object eventName_;
        private Object eventTime_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sessionId_;
        private Object succeed_;
        private final ByteString unknownFields;
        private Object url_;

        /* renamed from: com.netease.caipiao.dcsdk.event.ProtoEvent.AppUrlMsg.1 */
        static class C04181 extends AbstractParser<AppUrlMsg> {
            C04181() {
            }

            public AppUrlMsg parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new AppUrlMsg(extensionRegistry, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<AppUrlMsg, Builder> implements AppUrlMsgOrBuilder {
            private Object appKey_;
            private int bitField0_;
            private Object deviceId_;
            private Object eventName_;
            private Object eventTime_;
            private Object sessionId_;
            private Object succeed_;
            private Object url_;

            private Builder() {
                this.eventName_ = BuildConfig.FLAVOR;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.appKey_ = BuildConfig.FLAVOR;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.url_ = BuildConfig.FLAVOR;
                this.succeed_ = BuildConfig.FLAVOR;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.eventName_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -2;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -3;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -5;
                this.appKey_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -9;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -17;
                this.url_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -33;
                this.succeed_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -65;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public AppUrlMsg getDefaultInstanceForType() {
                return AppUrlMsg.getDefaultInstance();
            }

            public AppUrlMsg build() {
                AppUrlMsg result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw com.google.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(result);
            }

            public AppUrlMsg buildPartial() {
                AppUrlMsg result = new AppUrlMsg(null);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & AppUrlMsg.EVENTNAME_FIELD_NUMBER) == AppUrlMsg.EVENTNAME_FIELD_NUMBER) {
                    to_bitField0_ = 0 | AppUrlMsg.EVENTNAME_FIELD_NUMBER;
                }
                result.eventName_ = this.eventName_;
                if ((from_bitField0_ & AppUrlMsg.EVENTTIME_FIELD_NUMBER) == AppUrlMsg.EVENTTIME_FIELD_NUMBER) {
                    to_bitField0_ |= AppUrlMsg.EVENTTIME_FIELD_NUMBER;
                }
                result.eventTime_ = this.eventTime_;
                if ((from_bitField0_ & AppUrlMsg.APPKEY_FIELD_NUMBER) == AppUrlMsg.APPKEY_FIELD_NUMBER) {
                    to_bitField0_ |= AppUrlMsg.APPKEY_FIELD_NUMBER;
                }
                result.sessionId_ = this.sessionId_;
                if ((from_bitField0_ & 8) == 8) {
                    to_bitField0_ |= 8;
                }
                result.appKey_ = this.appKey_;
                if ((from_bitField0_ & 16) == 16) {
                    to_bitField0_ |= 16;
                }
                result.deviceId_ = this.deviceId_;
                if ((from_bitField0_ & 32) == 32) {
                    to_bitField0_ |= 32;
                }
                result.url_ = this.url_;
                if ((from_bitField0_ & 64) == 64) {
                    to_bitField0_ |= 64;
                }
                result.succeed_ = this.succeed_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(AppUrlMsg other) {
                if (other != AppUrlMsg.getDefaultInstance()) {
                    if (other.hasEventName()) {
                        this.bitField0_ |= AppUrlMsg.EVENTNAME_FIELD_NUMBER;
                        this.eventName_ = other.eventName_;
                    }
                    if (other.hasEventTime()) {
                        this.bitField0_ |= AppUrlMsg.EVENTTIME_FIELD_NUMBER;
                        this.eventTime_ = other.eventTime_;
                    }
                    if (other.hasSessionId()) {
                        this.bitField0_ |= AppUrlMsg.APPKEY_FIELD_NUMBER;
                        this.sessionId_ = other.sessionId_;
                    }
                    if (other.hasAppKey()) {
                        this.bitField0_ |= 8;
                        this.appKey_ = other.appKey_;
                    }
                    if (other.hasDeviceId()) {
                        this.bitField0_ |= 16;
                        this.deviceId_ = other.deviceId_;
                    }
                    if (other.hasUrl()) {
                        this.bitField0_ |= 32;
                        this.url_ = other.url_;
                    }
                    if (other.hasSucceed()) {
                        this.bitField0_ |= 64;
                        this.succeed_ = other.succeed_;
                    }
                    setUnknownFields(getUnknownFields().concat(other.unknownFields));
                }
                return this;
            }

            public final boolean isInitialized() {
                if (hasEventName() && hasEventTime() && hasSessionId() && hasAppKey() && hasDeviceId()) {
                    return true;
                }
                return false;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                AppUrlMsg parsedMessage = null;
                try {
                    parsedMessage = (AppUrlMsg) AppUrlMsg.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AppUrlMsg) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
            }

            public boolean hasEventName() {
                return (this.bitField0_ & AppUrlMsg.EVENTNAME_FIELD_NUMBER) == AppUrlMsg.EVENTNAME_FIELD_NUMBER;
            }

            public String getEventName() {
                ByteString ref = this.eventName_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventName_ = s;
                return s;
            }

            public ByteString getEventNameBytes() {
                Object ref = this.eventName_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventName_ = b;
                return b;
            }

            public Builder setEventName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppUrlMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public Builder clearEventName() {
                this.bitField0_ &= -2;
                this.eventName_ = AppUrlMsg.getDefaultInstance().getEventName();
                return this;
            }

            public Builder setEventNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppUrlMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public boolean hasEventTime() {
                return (this.bitField0_ & AppUrlMsg.EVENTTIME_FIELD_NUMBER) == AppUrlMsg.EVENTTIME_FIELD_NUMBER;
            }

            public String getEventTime() {
                ByteString ref = this.eventTime_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventTime_ = s;
                return s;
            }

            public ByteString getEventTimeBytes() {
                Object ref = this.eventTime_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventTime_ = b;
                return b;
            }

            public Builder setEventTime(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppUrlMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public Builder clearEventTime() {
                this.bitField0_ &= -3;
                this.eventTime_ = AppUrlMsg.getDefaultInstance().getEventTime();
                return this;
            }

            public Builder setEventTimeBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppUrlMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public boolean hasSessionId() {
                return (this.bitField0_ & AppUrlMsg.APPKEY_FIELD_NUMBER) == AppUrlMsg.APPKEY_FIELD_NUMBER;
            }

            public String getSessionId() {
                ByteString ref = this.sessionId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.sessionId_ = s;
                return s;
            }

            public ByteString getSessionIdBytes() {
                Object ref = this.sessionId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.sessionId_ = b;
                return b;
            }

            public Builder setSessionId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppUrlMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -5;
                this.sessionId_ = AppUrlMsg.getDefaultInstance().getSessionId();
                return this;
            }

            public Builder setSessionIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= AppUrlMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public boolean hasAppKey() {
                return (this.bitField0_ & 8) == 8;
            }

            public String getAppKey() {
                ByteString ref = this.appKey_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.appKey_ = s;
                return s;
            }

            public ByteString getAppKeyBytes() {
                Object ref = this.appKey_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.appKey_ = b;
                return b;
            }

            public Builder setAppKey(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.appKey_ = value;
                return this;
            }

            public Builder clearAppKey() {
                this.bitField0_ &= -9;
                this.appKey_ = AppUrlMsg.getDefaultInstance().getAppKey();
                return this;
            }

            public Builder setAppKeyBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.appKey_ = value;
                return this;
            }

            public boolean hasDeviceId() {
                return (this.bitField0_ & 16) == 16;
            }

            public String getDeviceId() {
                ByteString ref = this.deviceId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.deviceId_ = s;
                return s;
            }

            public ByteString getDeviceIdBytes() {
                Object ref = this.deviceId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.deviceId_ = b;
                return b;
            }

            public Builder setDeviceId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public Builder clearDeviceId() {
                this.bitField0_ &= -17;
                this.deviceId_ = AppUrlMsg.getDefaultInstance().getDeviceId();
                return this;
            }

            public Builder setDeviceIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public boolean hasUrl() {
                return (this.bitField0_ & 32) == 32;
            }

            public String getUrl() {
                ByteString ref = this.url_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.url_ = s;
                return s;
            }

            public ByteString getUrlBytes() {
                Object ref = this.url_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.url_ = b;
                return b;
            }

            public Builder setUrl(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.url_ = value;
                return this;
            }

            public Builder clearUrl() {
                this.bitField0_ &= -33;
                this.url_ = AppUrlMsg.getDefaultInstance().getUrl();
                return this;
            }

            public Builder setUrlBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.url_ = value;
                return this;
            }

            public boolean hasSucceed() {
                return (this.bitField0_ & 64) == 64;
            }

            public String getSucceed() {
                ByteString ref = this.succeed_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.succeed_ = s;
                return s;
            }

            public ByteString getSucceedBytes() {
                Object ref = this.succeed_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.succeed_ = b;
                return b;
            }

            public Builder setSucceed(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.succeed_ = value;
                return this;
            }

            public Builder clearSucceed() {
                this.bitField0_ &= -65;
                this.succeed_ = AppUrlMsg.getDefaultInstance().getSucceed();
                return this;
            }

            public Builder setSucceedBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.succeed_ = value;
                return this;
            }
        }

        private AppUrlMsg(com.google.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private AppUrlMsg(boolean noInit) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static AppUrlMsg getDefaultInstance() {
            return defaultInstance;
        }

        public AppUrlMsg getDefaultInstanceForType() {
            return defaultInstance;
        }

        private AppUrlMsg(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            OutputStream unknownFieldsOutput = ByteString.newOutput();
            CodedOutputStream unknownFieldsCodedOutput = CodedOutputStream.newInstance(unknownFieldsOutput);
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    ByteString bs;
                    switch (tag) {
                        case SwipeRefreshLayout.LARGE /*0*/:
                            done = true;
                            break;
                        case AppColdStartMsg.APPBUILDVERSION_FIELD_NUMBER /*10*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTNAME_FIELD_NUMBER;
                            this.eventName_ = bs;
                            break;
                        case AppColdStartMsg.BATTERYLEVEL_FIELD_NUMBER /*18*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTTIME_FIELD_NUMBER;
                            this.eventTime_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionMenuTextColor /*26*/:
                            bs = input.readBytes();
                            this.bitField0_ |= APPKEY_FIELD_NUMBER;
                            this.sessionId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionModePasteDrawable /*34*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 8;
                            this.appKey_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_dialogTheme /*42*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 16;
                            this.deviceId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_buttonBarStyle /*50*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 32;
                            this.url_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_toolbarStyle /*58*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 64;
                            this.succeed_ = bs;
                            break;
                        default:
                            if (!parseUnknownField(input, unknownFieldsCodedOutput, extensionRegistry, tag)) {
                                done = true;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    try {
                        unknownFieldsCodedOutput.flush();
                    } catch (IOException e3) {
                        makeExtensionsImmutable();
                    } finally {
                        this.unknownFields = unknownFieldsOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }
            }
            try {
                unknownFieldsCodedOutput.flush();
            } catch (IOException e4) {
            } finally {
                this.unknownFields = unknownFieldsOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            PARSER = new C04181();
            defaultInstance = new AppUrlMsg(true);
            defaultInstance.initFields();
        }

        public Parser<AppUrlMsg> getParserForType() {
            return PARSER;
        }

        public boolean hasEventName() {
            return (this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER;
        }

        public String getEventName() {
            ByteString ref = this.eventName_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventName_ = s;
            }
            return s;
        }

        public ByteString getEventNameBytes() {
            Object ref = this.eventName_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventName_ = b;
            return b;
        }

        public boolean hasEventTime() {
            return (this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER;
        }

        public String getEventTime() {
            ByteString ref = this.eventTime_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventTime_ = s;
            }
            return s;
        }

        public ByteString getEventTimeBytes() {
            Object ref = this.eventTime_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventTime_ = b;
            return b;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER;
        }

        public String getSessionId() {
            ByteString ref = this.sessionId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.sessionId_ = s;
            }
            return s;
        }

        public ByteString getSessionIdBytes() {
            Object ref = this.sessionId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.sessionId_ = b;
            return b;
        }

        public boolean hasAppKey() {
            return (this.bitField0_ & 8) == 8;
        }

        public String getAppKey() {
            ByteString ref = this.appKey_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.appKey_ = s;
            }
            return s;
        }

        public ByteString getAppKeyBytes() {
            Object ref = this.appKey_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.appKey_ = b;
            return b;
        }

        public boolean hasDeviceId() {
            return (this.bitField0_ & 16) == 16;
        }

        public String getDeviceId() {
            ByteString ref = this.deviceId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.deviceId_ = s;
            }
            return s;
        }

        public ByteString getDeviceIdBytes() {
            Object ref = this.deviceId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.deviceId_ = b;
            return b;
        }

        public boolean hasUrl() {
            return (this.bitField0_ & 32) == 32;
        }

        public String getUrl() {
            ByteString ref = this.url_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.url_ = s;
            }
            return s;
        }

        public ByteString getUrlBytes() {
            Object ref = this.url_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.url_ = b;
            return b;
        }

        public boolean hasSucceed() {
            return (this.bitField0_ & 64) == 64;
        }

        public String getSucceed() {
            ByteString ref = this.succeed_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.succeed_ = s;
            }
            return s;
        }

        public ByteString getSucceedBytes() {
            Object ref = this.succeed_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.succeed_ = b;
            return b;
        }

        private void initFields() {
            this.eventName_ = BuildConfig.FLAVOR;
            this.eventTime_ = BuildConfig.FLAVOR;
            this.sessionId_ = BuildConfig.FLAVOR;
            this.appKey_ = BuildConfig.FLAVOR;
            this.deviceId_ = BuildConfig.FLAVOR;
            this.url_ = BuildConfig.FLAVOR;
            this.succeed_ = BuildConfig.FLAVOR;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == (byte) 1) {
                return true;
            }
            if (isInitialized == null) {
                return false;
            }
            if (!hasEventName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasEventTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasSessionId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasAppKey()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (hasDeviceId()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                output.writeBytes(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                output.writeBytes(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                output.writeBytes(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                output.writeBytes(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                output.writeBytes(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                output.writeBytes(URL_FIELD_NUMBER, getUrlBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                output.writeBytes(SUCCEED_FIELD_NUMBER, getSucceedBytes());
            }
            output.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                size = 0 + CodedOutputStream.computeBytesSize(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                size += CodedOutputStream.computeBytesSize(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                size += CodedOutputStream.computeBytesSize(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                size += CodedOutputStream.computeBytesSize(URL_FIELD_NUMBER, getUrlBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                size += CodedOutputStream.computeBytesSize(SUCCEED_FIELD_NUMBER, getSucceedBytes());
            }
            size += this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static AppUrlMsg parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (AppUrlMsg) PARSER.parseFrom(data);
        }

        public static AppUrlMsg parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AppUrlMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static AppUrlMsg parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (AppUrlMsg) PARSER.parseFrom(data);
        }

        public static AppUrlMsg parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AppUrlMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static AppUrlMsg parseFrom(InputStream input) throws IOException {
            return (AppUrlMsg) PARSER.parseFrom(input);
        }

        public static AppUrlMsg parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AppUrlMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static AppUrlMsg parseDelimitedFrom(InputStream input) throws IOException {
            return (AppUrlMsg) PARSER.parseDelimitedFrom(input);
        }

        public static AppUrlMsg parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AppUrlMsg) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static AppUrlMsg parseFrom(CodedInputStream input) throws IOException {
            return (AppUrlMsg) PARSER.parseFrom(input);
        }

        public static AppUrlMsg parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AppUrlMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(AppUrlMsg prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static final class ButtonViewMsg extends GeneratedMessageLite implements ButtonViewMsgOrBuilder {
        public static final int APPKEY_FIELD_NUMBER = 4;
        public static final int DEVICEID_FIELD_NUMBER = 5;
        public static final int EVENTNAME_FIELD_NUMBER = 1;
        public static final int EVENTTIME_FIELD_NUMBER = 2;
        public static final int ITEM_FIELD_NUMBER = 8;
        public static final int PAGE_FIELD_NUMBER = 6;
        public static Parser<ButtonViewMsg> PARSER = null;
        public static final int SESSIONID_FIELD_NUMBER = 3;
        public static final int VIEW_FIELD_NUMBER = 7;
        private static final ButtonViewMsg defaultInstance;
        private static final long serialVersionUID = 0;
        private Object appKey_;
        private int bitField0_;
        private Object deviceId_;
        private Object eventName_;
        private Object eventTime_;
        private List<MapItem> item_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object page_;
        private Object sessionId_;
        private final ByteString unknownFields;
        private ViewItem view_;

        /* renamed from: com.netease.caipiao.dcsdk.event.ProtoEvent.ButtonViewMsg.1 */
        static class C04191 extends AbstractParser<ButtonViewMsg> {
            C04191() {
            }

            public ButtonViewMsg parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ButtonViewMsg(extensionRegistry, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<ButtonViewMsg, Builder> implements ButtonViewMsgOrBuilder {
            private Object appKey_;
            private int bitField0_;
            private Object deviceId_;
            private Object eventName_;
            private Object eventTime_;
            private List<MapItem> item_;
            private Object page_;
            private Object sessionId_;
            private ViewItem view_;

            private Builder() {
                this.eventName_ = BuildConfig.FLAVOR;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.appKey_ = BuildConfig.FLAVOR;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.page_ = BuildConfig.FLAVOR;
                this.view_ = ViewItem.getDefaultInstance();
                this.item_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.eventName_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -2;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -3;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -5;
                this.appKey_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -9;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -17;
                this.page_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -33;
                this.view_ = ViewItem.getDefaultInstance();
                this.bitField0_ &= -65;
                this.item_ = Collections.emptyList();
                this.bitField0_ &= -129;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public ButtonViewMsg getDefaultInstanceForType() {
                return ButtonViewMsg.getDefaultInstance();
            }

            public ButtonViewMsg build() {
                ButtonViewMsg result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw com.google.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(result);
            }

            public ButtonViewMsg buildPartial() {
                ButtonViewMsg result = new ButtonViewMsg(null);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & ButtonViewMsg.EVENTNAME_FIELD_NUMBER) == ButtonViewMsg.EVENTNAME_FIELD_NUMBER) {
                    to_bitField0_ = 0 | ButtonViewMsg.EVENTNAME_FIELD_NUMBER;
                }
                result.eventName_ = this.eventName_;
                if ((from_bitField0_ & ButtonViewMsg.EVENTTIME_FIELD_NUMBER) == ButtonViewMsg.EVENTTIME_FIELD_NUMBER) {
                    to_bitField0_ |= ButtonViewMsg.EVENTTIME_FIELD_NUMBER;
                }
                result.eventTime_ = this.eventTime_;
                if ((from_bitField0_ & ButtonViewMsg.APPKEY_FIELD_NUMBER) == ButtonViewMsg.APPKEY_FIELD_NUMBER) {
                    to_bitField0_ |= ButtonViewMsg.APPKEY_FIELD_NUMBER;
                }
                result.sessionId_ = this.sessionId_;
                if ((from_bitField0_ & ButtonViewMsg.ITEM_FIELD_NUMBER) == ButtonViewMsg.ITEM_FIELD_NUMBER) {
                    to_bitField0_ |= ButtonViewMsg.ITEM_FIELD_NUMBER;
                }
                result.appKey_ = this.appKey_;
                if ((from_bitField0_ & 16) == 16) {
                    to_bitField0_ |= 16;
                }
                result.deviceId_ = this.deviceId_;
                if ((from_bitField0_ & 32) == 32) {
                    to_bitField0_ |= 32;
                }
                result.page_ = this.page_;
                if ((from_bitField0_ & 64) == 64) {
                    to_bitField0_ |= 64;
                }
                result.view_ = this.view_;
                if ((this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                    this.item_ = Collections.unmodifiableList(this.item_);
                    this.bitField0_ &= -129;
                }
                result.item_ = this.item_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(ButtonViewMsg other) {
                if (other != ButtonViewMsg.getDefaultInstance()) {
                    if (other.hasEventName()) {
                        this.bitField0_ |= ButtonViewMsg.EVENTNAME_FIELD_NUMBER;
                        this.eventName_ = other.eventName_;
                    }
                    if (other.hasEventTime()) {
                        this.bitField0_ |= ButtonViewMsg.EVENTTIME_FIELD_NUMBER;
                        this.eventTime_ = other.eventTime_;
                    }
                    if (other.hasSessionId()) {
                        this.bitField0_ |= ButtonViewMsg.APPKEY_FIELD_NUMBER;
                        this.sessionId_ = other.sessionId_;
                    }
                    if (other.hasAppKey()) {
                        this.bitField0_ |= ButtonViewMsg.ITEM_FIELD_NUMBER;
                        this.appKey_ = other.appKey_;
                    }
                    if (other.hasDeviceId()) {
                        this.bitField0_ |= 16;
                        this.deviceId_ = other.deviceId_;
                    }
                    if (other.hasPage()) {
                        this.bitField0_ |= 32;
                        this.page_ = other.page_;
                    }
                    if (other.hasView()) {
                        mergeView(other.getView());
                    }
                    if (!other.item_.isEmpty()) {
                        if (this.item_.isEmpty()) {
                            this.item_ = other.item_;
                            this.bitField0_ &= -129;
                        } else {
                            ensureItemIsMutable();
                            this.item_.addAll(other.item_);
                        }
                    }
                    setUnknownFields(getUnknownFields().concat(other.unknownFields));
                }
                return this;
            }

            public final boolean isInitialized() {
                if (!hasEventName() || !hasEventTime() || !hasSessionId() || !hasAppKey() || !hasDeviceId() || !hasPage()) {
                    return false;
                }
                for (int i = 0; i < getItemCount(); i += ButtonViewMsg.EVENTNAME_FIELD_NUMBER) {
                    if (!getItem(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ButtonViewMsg parsedMessage = null;
                try {
                    parsedMessage = (ButtonViewMsg) ButtonViewMsg.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ButtonViewMsg) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
            }

            public boolean hasEventName() {
                return (this.bitField0_ & ButtonViewMsg.EVENTNAME_FIELD_NUMBER) == ButtonViewMsg.EVENTNAME_FIELD_NUMBER;
            }

            public String getEventName() {
                ByteString ref = this.eventName_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventName_ = s;
                return s;
            }

            public ByteString getEventNameBytes() {
                Object ref = this.eventName_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventName_ = b;
                return b;
            }

            public Builder setEventName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ButtonViewMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public Builder clearEventName() {
                this.bitField0_ &= -2;
                this.eventName_ = ButtonViewMsg.getDefaultInstance().getEventName();
                return this;
            }

            public Builder setEventNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ButtonViewMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public boolean hasEventTime() {
                return (this.bitField0_ & ButtonViewMsg.EVENTTIME_FIELD_NUMBER) == ButtonViewMsg.EVENTTIME_FIELD_NUMBER;
            }

            public String getEventTime() {
                ByteString ref = this.eventTime_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventTime_ = s;
                return s;
            }

            public ByteString getEventTimeBytes() {
                Object ref = this.eventTime_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventTime_ = b;
                return b;
            }

            public Builder setEventTime(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ButtonViewMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public Builder clearEventTime() {
                this.bitField0_ &= -3;
                this.eventTime_ = ButtonViewMsg.getDefaultInstance().getEventTime();
                return this;
            }

            public Builder setEventTimeBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ButtonViewMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public boolean hasSessionId() {
                return (this.bitField0_ & ButtonViewMsg.APPKEY_FIELD_NUMBER) == ButtonViewMsg.APPKEY_FIELD_NUMBER;
            }

            public String getSessionId() {
                ByteString ref = this.sessionId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.sessionId_ = s;
                return s;
            }

            public ByteString getSessionIdBytes() {
                Object ref = this.sessionId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.sessionId_ = b;
                return b;
            }

            public Builder setSessionId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ButtonViewMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -5;
                this.sessionId_ = ButtonViewMsg.getDefaultInstance().getSessionId();
                return this;
            }

            public Builder setSessionIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ButtonViewMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public boolean hasAppKey() {
                return (this.bitField0_ & ButtonViewMsg.ITEM_FIELD_NUMBER) == ButtonViewMsg.ITEM_FIELD_NUMBER;
            }

            public String getAppKey() {
                ByteString ref = this.appKey_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.appKey_ = s;
                return s;
            }

            public ByteString getAppKeyBytes() {
                Object ref = this.appKey_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.appKey_ = b;
                return b;
            }

            public Builder setAppKey(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ButtonViewMsg.ITEM_FIELD_NUMBER;
                this.appKey_ = value;
                return this;
            }

            public Builder clearAppKey() {
                this.bitField0_ &= -9;
                this.appKey_ = ButtonViewMsg.getDefaultInstance().getAppKey();
                return this;
            }

            public Builder setAppKeyBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ButtonViewMsg.ITEM_FIELD_NUMBER;
                this.appKey_ = value;
                return this;
            }

            public boolean hasDeviceId() {
                return (this.bitField0_ & 16) == 16;
            }

            public String getDeviceId() {
                ByteString ref = this.deviceId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.deviceId_ = s;
                return s;
            }

            public ByteString getDeviceIdBytes() {
                Object ref = this.deviceId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.deviceId_ = b;
                return b;
            }

            public Builder setDeviceId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public Builder clearDeviceId() {
                this.bitField0_ &= -17;
                this.deviceId_ = ButtonViewMsg.getDefaultInstance().getDeviceId();
                return this;
            }

            public Builder setDeviceIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public boolean hasPage() {
                return (this.bitField0_ & 32) == 32;
            }

            public String getPage() {
                ByteString ref = this.page_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.page_ = s;
                return s;
            }

            public ByteString getPageBytes() {
                Object ref = this.page_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.page_ = b;
                return b;
            }

            public Builder setPage(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.page_ = value;
                return this;
            }

            public Builder clearPage() {
                this.bitField0_ &= -33;
                this.page_ = ButtonViewMsg.getDefaultInstance().getPage();
                return this;
            }

            public Builder setPageBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.page_ = value;
                return this;
            }

            public boolean hasView() {
                return (this.bitField0_ & 64) == 64;
            }

            public ViewItem getView() {
                return this.view_;
            }

            public Builder setView(ViewItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.view_ = value;
                this.bitField0_ |= 64;
                return this;
            }

            public Builder setView(Builder builderForValue) {
                this.view_ = builderForValue.build();
                this.bitField0_ |= 64;
                return this;
            }

            public Builder mergeView(ViewItem value) {
                if ((this.bitField0_ & 64) != 64 || this.view_ == ViewItem.getDefaultInstance()) {
                    this.view_ = value;
                } else {
                    this.view_ = ViewItem.newBuilder(this.view_).mergeFrom(value).buildPartial();
                }
                this.bitField0_ |= 64;
                return this;
            }

            public Builder clearView() {
                this.view_ = ViewItem.getDefaultInstance();
                this.bitField0_ &= -65;
                return this;
            }

            private void ensureItemIsMutable() {
                if ((this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) != TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                    this.item_ = new ArrayList(this.item_);
                    this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                }
            }

            public List<MapItem> getItemList() {
                return Collections.unmodifiableList(this.item_);
            }

            public int getItemCount() {
                return this.item_.size();
            }

            public MapItem getItem(int index) {
                return (MapItem) this.item_.get(index);
            }

            public Builder setItem(int index, MapItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemIsMutable();
                this.item_.set(index, value);
                return this;
            }

            public Builder setItem(int index, Builder builderForValue) {
                ensureItemIsMutable();
                this.item_.set(index, builderForValue.build());
                return this;
            }

            public Builder addItem(MapItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemIsMutable();
                this.item_.add(value);
                return this;
            }

            public Builder addItem(int index, MapItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemIsMutable();
                this.item_.add(index, value);
                return this;
            }

            public Builder addItem(Builder builderForValue) {
                ensureItemIsMutable();
                this.item_.add(builderForValue.build());
                return this;
            }

            public Builder addItem(int index, Builder builderForValue) {
                ensureItemIsMutable();
                this.item_.add(index, builderForValue.build());
                return this;
            }

            public Builder addAllItem(Iterable<? extends MapItem> values) {
                ensureItemIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.item_);
                return this;
            }

            public Builder clearItem() {
                this.item_ = Collections.emptyList();
                this.bitField0_ &= -129;
                return this;
            }

            public Builder removeItem(int index) {
                ensureItemIsMutable();
                this.item_.remove(index);
                return this;
            }
        }

        private ButtonViewMsg(com.google.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ButtonViewMsg(boolean noInit) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static ButtonViewMsg getDefaultInstance() {
            return defaultInstance;
        }

        public ButtonViewMsg getDefaultInstanceForType() {
            return defaultInstance;
        }

        private ButtonViewMsg(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            OutputStream unknownFieldsOutput = ByteString.newOutput();
            CodedOutputStream unknownFieldsCodedOutput = CodedOutputStream.newInstance(unknownFieldsOutput);
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    ByteString bs;
                    switch (tag) {
                        case SwipeRefreshLayout.LARGE /*0*/:
                            done = true;
                            break;
                        case AppColdStartMsg.APPBUILDVERSION_FIELD_NUMBER /*10*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTNAME_FIELD_NUMBER;
                            this.eventName_ = bs;
                            break;
                        case AppColdStartMsg.BATTERYLEVEL_FIELD_NUMBER /*18*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTTIME_FIELD_NUMBER;
                            this.eventTime_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionMenuTextColor /*26*/:
                            bs = input.readBytes();
                            this.bitField0_ |= APPKEY_FIELD_NUMBER;
                            this.sessionId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionModePasteDrawable /*34*/:
                            bs = input.readBytes();
                            this.bitField0_ |= ITEM_FIELD_NUMBER;
                            this.appKey_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_dialogTheme /*42*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 16;
                            this.deviceId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_buttonBarStyle /*50*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 32;
                            this.page_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_toolbarStyle /*58*/:
                            Builder subBuilder = null;
                            if ((this.bitField0_ & 64) == 64) {
                                subBuilder = this.view_.toBuilder();
                            }
                            this.view_ = (ViewItem) input.readMessage(ViewItem.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.view_);
                                this.view_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 64;
                            break;
                        case C0268R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /*66*/:
                            if ((mutable_bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) != TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                                this.item_ = new ArrayList();
                                mutable_bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                            }
                            this.item_.add(input.readMessage(MapItem.PARSER, extensionRegistry));
                            break;
                        default:
                            if (!parseUnknownField(input, unknownFieldsCodedOutput, extensionRegistry, tag)) {
                                done = true;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if ((mutable_bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                        this.item_ = Collections.unmodifiableList(this.item_);
                    }
                    try {
                        unknownFieldsCodedOutput.flush();
                    } catch (IOException e3) {
                        makeExtensionsImmutable();
                    } finally {
                        this.unknownFields = unknownFieldsOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }
            }
            if ((mutable_bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                this.item_ = Collections.unmodifiableList(this.item_);
            }
            try {
                unknownFieldsCodedOutput.flush();
            } catch (IOException e4) {
            } finally {
                this.unknownFields = unknownFieldsOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            PARSER = new C04191();
            defaultInstance = new ButtonViewMsg(true);
            defaultInstance.initFields();
        }

        public Parser<ButtonViewMsg> getParserForType() {
            return PARSER;
        }

        public boolean hasEventName() {
            return (this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER;
        }

        public String getEventName() {
            ByteString ref = this.eventName_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventName_ = s;
            }
            return s;
        }

        public ByteString getEventNameBytes() {
            Object ref = this.eventName_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventName_ = b;
            return b;
        }

        public boolean hasEventTime() {
            return (this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER;
        }

        public String getEventTime() {
            ByteString ref = this.eventTime_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventTime_ = s;
            }
            return s;
        }

        public ByteString getEventTimeBytes() {
            Object ref = this.eventTime_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventTime_ = b;
            return b;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER;
        }

        public String getSessionId() {
            ByteString ref = this.sessionId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.sessionId_ = s;
            }
            return s;
        }

        public ByteString getSessionIdBytes() {
            Object ref = this.sessionId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.sessionId_ = b;
            return b;
        }

        public boolean hasAppKey() {
            return (this.bitField0_ & ITEM_FIELD_NUMBER) == ITEM_FIELD_NUMBER;
        }

        public String getAppKey() {
            ByteString ref = this.appKey_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.appKey_ = s;
            }
            return s;
        }

        public ByteString getAppKeyBytes() {
            Object ref = this.appKey_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.appKey_ = b;
            return b;
        }

        public boolean hasDeviceId() {
            return (this.bitField0_ & 16) == 16;
        }

        public String getDeviceId() {
            ByteString ref = this.deviceId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.deviceId_ = s;
            }
            return s;
        }

        public ByteString getDeviceIdBytes() {
            Object ref = this.deviceId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.deviceId_ = b;
            return b;
        }

        public boolean hasPage() {
            return (this.bitField0_ & 32) == 32;
        }

        public String getPage() {
            ByteString ref = this.page_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.page_ = s;
            }
            return s;
        }

        public ByteString getPageBytes() {
            Object ref = this.page_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.page_ = b;
            return b;
        }

        public boolean hasView() {
            return (this.bitField0_ & 64) == 64;
        }

        public ViewItem getView() {
            return this.view_;
        }

        public List<MapItem> getItemList() {
            return this.item_;
        }

        public List<? extends MapItemOrBuilder> getItemOrBuilderList() {
            return this.item_;
        }

        public int getItemCount() {
            return this.item_.size();
        }

        public MapItem getItem(int index) {
            return (MapItem) this.item_.get(index);
        }

        public MapItemOrBuilder getItemOrBuilder(int index) {
            return (MapItemOrBuilder) this.item_.get(index);
        }

        private void initFields() {
            this.eventName_ = BuildConfig.FLAVOR;
            this.eventTime_ = BuildConfig.FLAVOR;
            this.sessionId_ = BuildConfig.FLAVOR;
            this.appKey_ = BuildConfig.FLAVOR;
            this.deviceId_ = BuildConfig.FLAVOR;
            this.page_ = BuildConfig.FLAVOR;
            this.view_ = ViewItem.getDefaultInstance();
            this.item_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == (byte) 1) {
                return true;
            }
            if (isInitialized == null) {
                return false;
            }
            if (!hasEventName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasEventTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasSessionId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasAppKey()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasDeviceId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (hasPage()) {
                int i = 0;
                while (i < getItemCount()) {
                    if (getItem(i).isInitialized()) {
                        i += EVENTNAME_FIELD_NUMBER;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                output.writeBytes(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                output.writeBytes(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                output.writeBytes(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & ITEM_FIELD_NUMBER) == ITEM_FIELD_NUMBER) {
                output.writeBytes(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                output.writeBytes(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                output.writeBytes(PAGE_FIELD_NUMBER, getPageBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                output.writeMessage(VIEW_FIELD_NUMBER, this.view_);
            }
            for (int i = 0; i < this.item_.size(); i += EVENTNAME_FIELD_NUMBER) {
                output.writeMessage(ITEM_FIELD_NUMBER, (MessageLite) this.item_.get(i));
            }
            output.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                size = 0 + CodedOutputStream.computeBytesSize(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & ITEM_FIELD_NUMBER) == ITEM_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                size += CodedOutputStream.computeBytesSize(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                size += CodedOutputStream.computeBytesSize(PAGE_FIELD_NUMBER, getPageBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                size += CodedOutputStream.computeMessageSize(VIEW_FIELD_NUMBER, this.view_);
            }
            for (int i = 0; i < this.item_.size(); i += EVENTNAME_FIELD_NUMBER) {
                size += CodedOutputStream.computeMessageSize(ITEM_FIELD_NUMBER, (MessageLite) this.item_.get(i));
            }
            size += this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ButtonViewMsg parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ButtonViewMsg) PARSER.parseFrom(data);
        }

        public static ButtonViewMsg parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ButtonViewMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ButtonViewMsg parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ButtonViewMsg) PARSER.parseFrom(data);
        }

        public static ButtonViewMsg parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ButtonViewMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ButtonViewMsg parseFrom(InputStream input) throws IOException {
            return (ButtonViewMsg) PARSER.parseFrom(input);
        }

        public static ButtonViewMsg parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ButtonViewMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ButtonViewMsg parseDelimitedFrom(InputStream input) throws IOException {
            return (ButtonViewMsg) PARSER.parseDelimitedFrom(input);
        }

        public static ButtonViewMsg parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ButtonViewMsg) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ButtonViewMsg parseFrom(CodedInputStream input) throws IOException {
            return (ButtonViewMsg) PARSER.parseFrom(input);
        }

        public static ButtonViewMsg parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ButtonViewMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ButtonViewMsg prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static final class ListItemClickMsg extends GeneratedMessageLite implements ListItemClickMsgOrBuilder {
        public static final int APPKEY_FIELD_NUMBER = 4;
        public static final int DEVICEID_FIELD_NUMBER = 5;
        public static final int EVENTNAME_FIELD_NUMBER = 1;
        public static final int EVENTTIME_FIELD_NUMBER = 2;
        public static final int INDEXPATH_FIELD_NUMBER = 7;
        public static final int ITEM_FIELD_NUMBER = 9;
        public static final int PAGE_FIELD_NUMBER = 6;
        public static Parser<ListItemClickMsg> PARSER = null;
        public static final int SESSIONID_FIELD_NUMBER = 3;
        public static final int VIEW_FIELD_NUMBER = 8;
        private static final ListItemClickMsg defaultInstance;
        private static final long serialVersionUID = 0;
        private Object appKey_;
        private int bitField0_;
        private Object deviceId_;
        private Object eventName_;
        private Object eventTime_;
        private Object indexPath_;
        private List<MapItem> item_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object page_;
        private Object sessionId_;
        private final ByteString unknownFields;
        private ViewItem view_;

        /* renamed from: com.netease.caipiao.dcsdk.event.ProtoEvent.ListItemClickMsg.1 */
        static class C04201 extends AbstractParser<ListItemClickMsg> {
            C04201() {
            }

            public ListItemClickMsg parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ListItemClickMsg(extensionRegistry, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<ListItemClickMsg, Builder> implements ListItemClickMsgOrBuilder {
            private Object appKey_;
            private int bitField0_;
            private Object deviceId_;
            private Object eventName_;
            private Object eventTime_;
            private Object indexPath_;
            private List<MapItem> item_;
            private Object page_;
            private Object sessionId_;
            private ViewItem view_;

            private Builder() {
                this.eventName_ = BuildConfig.FLAVOR;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.appKey_ = BuildConfig.FLAVOR;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.page_ = BuildConfig.FLAVOR;
                this.indexPath_ = BuildConfig.FLAVOR;
                this.view_ = ViewItem.getDefaultInstance();
                this.item_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.eventName_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -2;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -3;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -5;
                this.appKey_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -9;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -17;
                this.page_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -33;
                this.indexPath_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -65;
                this.view_ = ViewItem.getDefaultInstance();
                this.bitField0_ &= -129;
                this.item_ = Collections.emptyList();
                this.bitField0_ &= -257;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public ListItemClickMsg getDefaultInstanceForType() {
                return ListItemClickMsg.getDefaultInstance();
            }

            public ListItemClickMsg build() {
                ListItemClickMsg result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw com.google.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(result);
            }

            public ListItemClickMsg buildPartial() {
                ListItemClickMsg result = new ListItemClickMsg(null);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & ListItemClickMsg.EVENTNAME_FIELD_NUMBER) == ListItemClickMsg.EVENTNAME_FIELD_NUMBER) {
                    to_bitField0_ = 0 | ListItemClickMsg.EVENTNAME_FIELD_NUMBER;
                }
                result.eventName_ = this.eventName_;
                if ((from_bitField0_ & ListItemClickMsg.EVENTTIME_FIELD_NUMBER) == ListItemClickMsg.EVENTTIME_FIELD_NUMBER) {
                    to_bitField0_ |= ListItemClickMsg.EVENTTIME_FIELD_NUMBER;
                }
                result.eventTime_ = this.eventTime_;
                if ((from_bitField0_ & ListItemClickMsg.APPKEY_FIELD_NUMBER) == ListItemClickMsg.APPKEY_FIELD_NUMBER) {
                    to_bitField0_ |= ListItemClickMsg.APPKEY_FIELD_NUMBER;
                }
                result.sessionId_ = this.sessionId_;
                if ((from_bitField0_ & ListItemClickMsg.VIEW_FIELD_NUMBER) == ListItemClickMsg.VIEW_FIELD_NUMBER) {
                    to_bitField0_ |= ListItemClickMsg.VIEW_FIELD_NUMBER;
                }
                result.appKey_ = this.appKey_;
                if ((from_bitField0_ & 16) == 16) {
                    to_bitField0_ |= 16;
                }
                result.deviceId_ = this.deviceId_;
                if ((from_bitField0_ & 32) == 32) {
                    to_bitField0_ |= 32;
                }
                result.page_ = this.page_;
                if ((from_bitField0_ & 64) == 64) {
                    to_bitField0_ |= 64;
                }
                result.indexPath_ = this.indexPath_;
                if ((from_bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                    to_bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                }
                result.view_ = this.view_;
                if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                    this.item_ = Collections.unmodifiableList(this.item_);
                    this.bitField0_ &= -257;
                }
                result.item_ = this.item_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(ListItemClickMsg other) {
                if (other != ListItemClickMsg.getDefaultInstance()) {
                    if (other.hasEventName()) {
                        this.bitField0_ |= ListItemClickMsg.EVENTNAME_FIELD_NUMBER;
                        this.eventName_ = other.eventName_;
                    }
                    if (other.hasEventTime()) {
                        this.bitField0_ |= ListItemClickMsg.EVENTTIME_FIELD_NUMBER;
                        this.eventTime_ = other.eventTime_;
                    }
                    if (other.hasSessionId()) {
                        this.bitField0_ |= ListItemClickMsg.APPKEY_FIELD_NUMBER;
                        this.sessionId_ = other.sessionId_;
                    }
                    if (other.hasAppKey()) {
                        this.bitField0_ |= ListItemClickMsg.VIEW_FIELD_NUMBER;
                        this.appKey_ = other.appKey_;
                    }
                    if (other.hasDeviceId()) {
                        this.bitField0_ |= 16;
                        this.deviceId_ = other.deviceId_;
                    }
                    if (other.hasPage()) {
                        this.bitField0_ |= 32;
                        this.page_ = other.page_;
                    }
                    if (other.hasIndexPath()) {
                        this.bitField0_ |= 64;
                        this.indexPath_ = other.indexPath_;
                    }
                    if (other.hasView()) {
                        mergeView(other.getView());
                    }
                    if (!other.item_.isEmpty()) {
                        if (this.item_.isEmpty()) {
                            this.item_ = other.item_;
                            this.bitField0_ &= -257;
                        } else {
                            ensureItemIsMutable();
                            this.item_.addAll(other.item_);
                        }
                    }
                    setUnknownFields(getUnknownFields().concat(other.unknownFields));
                }
                return this;
            }

            public final boolean isInitialized() {
                if (!hasEventName() || !hasEventTime() || !hasSessionId() || !hasAppKey() || !hasDeviceId() || !hasPage()) {
                    return false;
                }
                for (int i = 0; i < getItemCount(); i += ListItemClickMsg.EVENTNAME_FIELD_NUMBER) {
                    if (!getItem(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ListItemClickMsg parsedMessage = null;
                try {
                    parsedMessage = (ListItemClickMsg) ListItemClickMsg.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ListItemClickMsg) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
            }

            public boolean hasEventName() {
                return (this.bitField0_ & ListItemClickMsg.EVENTNAME_FIELD_NUMBER) == ListItemClickMsg.EVENTNAME_FIELD_NUMBER;
            }

            public String getEventName() {
                ByteString ref = this.eventName_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventName_ = s;
                return s;
            }

            public ByteString getEventNameBytes() {
                Object ref = this.eventName_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventName_ = b;
                return b;
            }

            public Builder setEventName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ListItemClickMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public Builder clearEventName() {
                this.bitField0_ &= -2;
                this.eventName_ = ListItemClickMsg.getDefaultInstance().getEventName();
                return this;
            }

            public Builder setEventNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ListItemClickMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public boolean hasEventTime() {
                return (this.bitField0_ & ListItemClickMsg.EVENTTIME_FIELD_NUMBER) == ListItemClickMsg.EVENTTIME_FIELD_NUMBER;
            }

            public String getEventTime() {
                ByteString ref = this.eventTime_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventTime_ = s;
                return s;
            }

            public ByteString getEventTimeBytes() {
                Object ref = this.eventTime_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventTime_ = b;
                return b;
            }

            public Builder setEventTime(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ListItemClickMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public Builder clearEventTime() {
                this.bitField0_ &= -3;
                this.eventTime_ = ListItemClickMsg.getDefaultInstance().getEventTime();
                return this;
            }

            public Builder setEventTimeBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ListItemClickMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public boolean hasSessionId() {
                return (this.bitField0_ & ListItemClickMsg.APPKEY_FIELD_NUMBER) == ListItemClickMsg.APPKEY_FIELD_NUMBER;
            }

            public String getSessionId() {
                ByteString ref = this.sessionId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.sessionId_ = s;
                return s;
            }

            public ByteString getSessionIdBytes() {
                Object ref = this.sessionId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.sessionId_ = b;
                return b;
            }

            public Builder setSessionId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ListItemClickMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -5;
                this.sessionId_ = ListItemClickMsg.getDefaultInstance().getSessionId();
                return this;
            }

            public Builder setSessionIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ListItemClickMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public boolean hasAppKey() {
                return (this.bitField0_ & ListItemClickMsg.VIEW_FIELD_NUMBER) == ListItemClickMsg.VIEW_FIELD_NUMBER;
            }

            public String getAppKey() {
                ByteString ref = this.appKey_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.appKey_ = s;
                return s;
            }

            public ByteString getAppKeyBytes() {
                Object ref = this.appKey_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.appKey_ = b;
                return b;
            }

            public Builder setAppKey(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ListItemClickMsg.VIEW_FIELD_NUMBER;
                this.appKey_ = value;
                return this;
            }

            public Builder clearAppKey() {
                this.bitField0_ &= -9;
                this.appKey_ = ListItemClickMsg.getDefaultInstance().getAppKey();
                return this;
            }

            public Builder setAppKeyBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ListItemClickMsg.VIEW_FIELD_NUMBER;
                this.appKey_ = value;
                return this;
            }

            public boolean hasDeviceId() {
                return (this.bitField0_ & 16) == 16;
            }

            public String getDeviceId() {
                ByteString ref = this.deviceId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.deviceId_ = s;
                return s;
            }

            public ByteString getDeviceIdBytes() {
                Object ref = this.deviceId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.deviceId_ = b;
                return b;
            }

            public Builder setDeviceId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public Builder clearDeviceId() {
                this.bitField0_ &= -17;
                this.deviceId_ = ListItemClickMsg.getDefaultInstance().getDeviceId();
                return this;
            }

            public Builder setDeviceIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public boolean hasPage() {
                return (this.bitField0_ & 32) == 32;
            }

            public String getPage() {
                ByteString ref = this.page_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.page_ = s;
                return s;
            }

            public ByteString getPageBytes() {
                Object ref = this.page_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.page_ = b;
                return b;
            }

            public Builder setPage(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.page_ = value;
                return this;
            }

            public Builder clearPage() {
                this.bitField0_ &= -33;
                this.page_ = ListItemClickMsg.getDefaultInstance().getPage();
                return this;
            }

            public Builder setPageBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.page_ = value;
                return this;
            }

            public boolean hasIndexPath() {
                return (this.bitField0_ & 64) == 64;
            }

            public String getIndexPath() {
                ByteString ref = this.indexPath_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.indexPath_ = s;
                return s;
            }

            public ByteString getIndexPathBytes() {
                Object ref = this.indexPath_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.indexPath_ = b;
                return b;
            }

            public Builder setIndexPath(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.indexPath_ = value;
                return this;
            }

            public Builder clearIndexPath() {
                this.bitField0_ &= -65;
                this.indexPath_ = ListItemClickMsg.getDefaultInstance().getIndexPath();
                return this;
            }

            public Builder setIndexPathBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.indexPath_ = value;
                return this;
            }

            public boolean hasView() {
                return (this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT;
            }

            public ViewItem getView() {
                return this.view_;
            }

            public Builder setView(ViewItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.view_ = value;
                this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                return this;
            }

            public Builder setView(Builder builderForValue) {
                this.view_ = builderForValue.build();
                this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                return this;
            }

            public Builder mergeView(ViewItem value) {
                if ((this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) != TransportMediator.FLAG_KEY_MEDIA_NEXT || this.view_ == ViewItem.getDefaultInstance()) {
                    this.view_ = value;
                } else {
                    this.view_ = ViewItem.newBuilder(this.view_).mergeFrom(value).buildPartial();
                }
                this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                return this;
            }

            public Builder clearView() {
                this.view_ = ViewItem.getDefaultInstance();
                this.bitField0_ &= -129;
                return this;
            }

            private void ensureItemIsMutable() {
                if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) != AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                    this.item_ = new ArrayList(this.item_);
                    this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                }
            }

            public List<MapItem> getItemList() {
                return Collections.unmodifiableList(this.item_);
            }

            public int getItemCount() {
                return this.item_.size();
            }

            public MapItem getItem(int index) {
                return (MapItem) this.item_.get(index);
            }

            public Builder setItem(int index, MapItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemIsMutable();
                this.item_.set(index, value);
                return this;
            }

            public Builder setItem(int index, Builder builderForValue) {
                ensureItemIsMutable();
                this.item_.set(index, builderForValue.build());
                return this;
            }

            public Builder addItem(MapItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemIsMutable();
                this.item_.add(value);
                return this;
            }

            public Builder addItem(int index, MapItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemIsMutable();
                this.item_.add(index, value);
                return this;
            }

            public Builder addItem(Builder builderForValue) {
                ensureItemIsMutable();
                this.item_.add(builderForValue.build());
                return this;
            }

            public Builder addItem(int index, Builder builderForValue) {
                ensureItemIsMutable();
                this.item_.add(index, builderForValue.build());
                return this;
            }

            public Builder addAllItem(Iterable<? extends MapItem> values) {
                ensureItemIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.item_);
                return this;
            }

            public Builder clearItem() {
                this.item_ = Collections.emptyList();
                this.bitField0_ &= -257;
                return this;
            }

            public Builder removeItem(int index) {
                ensureItemIsMutable();
                this.item_.remove(index);
                return this;
            }
        }

        private ListItemClickMsg(com.google.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ListItemClickMsg(boolean noInit) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static ListItemClickMsg getDefaultInstance() {
            return defaultInstance;
        }

        public ListItemClickMsg getDefaultInstanceForType() {
            return defaultInstance;
        }

        private ListItemClickMsg(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            OutputStream unknownFieldsOutput = ByteString.newOutput();
            CodedOutputStream unknownFieldsCodedOutput = CodedOutputStream.newInstance(unknownFieldsOutput);
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    ByteString bs;
                    switch (tag) {
                        case SwipeRefreshLayout.LARGE /*0*/:
                            done = true;
                            break;
                        case AppColdStartMsg.APPBUILDVERSION_FIELD_NUMBER /*10*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTNAME_FIELD_NUMBER;
                            this.eventName_ = bs;
                            break;
                        case AppColdStartMsg.BATTERYLEVEL_FIELD_NUMBER /*18*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTTIME_FIELD_NUMBER;
                            this.eventTime_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionMenuTextColor /*26*/:
                            bs = input.readBytes();
                            this.bitField0_ |= APPKEY_FIELD_NUMBER;
                            this.sessionId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionModePasteDrawable /*34*/:
                            bs = input.readBytes();
                            this.bitField0_ |= VIEW_FIELD_NUMBER;
                            this.appKey_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_dialogTheme /*42*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 16;
                            this.deviceId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_buttonBarStyle /*50*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 32;
                            this.page_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_toolbarStyle /*58*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 64;
                            this.indexPath_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /*66*/:
                            Builder subBuilder = null;
                            if ((this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                                subBuilder = this.view_.toBuilder();
                            }
                            this.view_ = (ViewItem) input.readMessage(ViewItem.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.view_);
                                this.view_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                            break;
                        case C0268R.styleable.AppCompatTheme_dropDownListViewStyle /*74*/:
                            if ((mutable_bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) != AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                                this.item_ = new ArrayList();
                                mutable_bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                            }
                            this.item_.add(input.readMessage(MapItem.PARSER, extensionRegistry));
                            break;
                        default:
                            if (!parseUnknownField(input, unknownFieldsCodedOutput, extensionRegistry, tag)) {
                                done = true;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if ((mutable_bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                        this.item_ = Collections.unmodifiableList(this.item_);
                    }
                    try {
                        unknownFieldsCodedOutput.flush();
                    } catch (IOException e3) {
                        makeExtensionsImmutable();
                    } finally {
                        this.unknownFields = unknownFieldsOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }
            }
            if ((mutable_bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                this.item_ = Collections.unmodifiableList(this.item_);
            }
            try {
                unknownFieldsCodedOutput.flush();
            } catch (IOException e4) {
            } finally {
                this.unknownFields = unknownFieldsOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            PARSER = new C04201();
            defaultInstance = new ListItemClickMsg(true);
            defaultInstance.initFields();
        }

        public Parser<ListItemClickMsg> getParserForType() {
            return PARSER;
        }

        public boolean hasEventName() {
            return (this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER;
        }

        public String getEventName() {
            ByteString ref = this.eventName_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventName_ = s;
            }
            return s;
        }

        public ByteString getEventNameBytes() {
            Object ref = this.eventName_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventName_ = b;
            return b;
        }

        public boolean hasEventTime() {
            return (this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER;
        }

        public String getEventTime() {
            ByteString ref = this.eventTime_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventTime_ = s;
            }
            return s;
        }

        public ByteString getEventTimeBytes() {
            Object ref = this.eventTime_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventTime_ = b;
            return b;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER;
        }

        public String getSessionId() {
            ByteString ref = this.sessionId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.sessionId_ = s;
            }
            return s;
        }

        public ByteString getSessionIdBytes() {
            Object ref = this.sessionId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.sessionId_ = b;
            return b;
        }

        public boolean hasAppKey() {
            return (this.bitField0_ & VIEW_FIELD_NUMBER) == VIEW_FIELD_NUMBER;
        }

        public String getAppKey() {
            ByteString ref = this.appKey_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.appKey_ = s;
            }
            return s;
        }

        public ByteString getAppKeyBytes() {
            Object ref = this.appKey_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.appKey_ = b;
            return b;
        }

        public boolean hasDeviceId() {
            return (this.bitField0_ & 16) == 16;
        }

        public String getDeviceId() {
            ByteString ref = this.deviceId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.deviceId_ = s;
            }
            return s;
        }

        public ByteString getDeviceIdBytes() {
            Object ref = this.deviceId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.deviceId_ = b;
            return b;
        }

        public boolean hasPage() {
            return (this.bitField0_ & 32) == 32;
        }

        public String getPage() {
            ByteString ref = this.page_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.page_ = s;
            }
            return s;
        }

        public ByteString getPageBytes() {
            Object ref = this.page_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.page_ = b;
            return b;
        }

        public boolean hasIndexPath() {
            return (this.bitField0_ & 64) == 64;
        }

        public String getIndexPath() {
            ByteString ref = this.indexPath_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.indexPath_ = s;
            }
            return s;
        }

        public ByteString getIndexPathBytes() {
            Object ref = this.indexPath_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.indexPath_ = b;
            return b;
        }

        public boolean hasView() {
            return (this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT;
        }

        public ViewItem getView() {
            return this.view_;
        }

        public List<MapItem> getItemList() {
            return this.item_;
        }

        public List<? extends MapItemOrBuilder> getItemOrBuilderList() {
            return this.item_;
        }

        public int getItemCount() {
            return this.item_.size();
        }

        public MapItem getItem(int index) {
            return (MapItem) this.item_.get(index);
        }

        public MapItemOrBuilder getItemOrBuilder(int index) {
            return (MapItemOrBuilder) this.item_.get(index);
        }

        private void initFields() {
            this.eventName_ = BuildConfig.FLAVOR;
            this.eventTime_ = BuildConfig.FLAVOR;
            this.sessionId_ = BuildConfig.FLAVOR;
            this.appKey_ = BuildConfig.FLAVOR;
            this.deviceId_ = BuildConfig.FLAVOR;
            this.page_ = BuildConfig.FLAVOR;
            this.indexPath_ = BuildConfig.FLAVOR;
            this.view_ = ViewItem.getDefaultInstance();
            this.item_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == (byte) 1) {
                return true;
            }
            if (isInitialized == null) {
                return false;
            }
            if (!hasEventName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasEventTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasSessionId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasAppKey()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasDeviceId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (hasPage()) {
                int i = 0;
                while (i < getItemCount()) {
                    if (getItem(i).isInitialized()) {
                        i += EVENTNAME_FIELD_NUMBER;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                output.writeBytes(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                output.writeBytes(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                output.writeBytes(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & VIEW_FIELD_NUMBER) == VIEW_FIELD_NUMBER) {
                output.writeBytes(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                output.writeBytes(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                output.writeBytes(PAGE_FIELD_NUMBER, getPageBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                output.writeBytes(INDEXPATH_FIELD_NUMBER, getIndexPathBytes());
            }
            if ((this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                output.writeMessage(VIEW_FIELD_NUMBER, this.view_);
            }
            for (int i = 0; i < this.item_.size(); i += EVENTNAME_FIELD_NUMBER) {
                output.writeMessage(ITEM_FIELD_NUMBER, (MessageLite) this.item_.get(i));
            }
            output.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                size = 0 + CodedOutputStream.computeBytesSize(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & VIEW_FIELD_NUMBER) == VIEW_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                size += CodedOutputStream.computeBytesSize(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                size += CodedOutputStream.computeBytesSize(PAGE_FIELD_NUMBER, getPageBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                size += CodedOutputStream.computeBytesSize(INDEXPATH_FIELD_NUMBER, getIndexPathBytes());
            }
            if ((this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                size += CodedOutputStream.computeMessageSize(VIEW_FIELD_NUMBER, this.view_);
            }
            for (int i = 0; i < this.item_.size(); i += EVENTNAME_FIELD_NUMBER) {
                size += CodedOutputStream.computeMessageSize(ITEM_FIELD_NUMBER, (MessageLite) this.item_.get(i));
            }
            size += this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ListItemClickMsg parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ListItemClickMsg) PARSER.parseFrom(data);
        }

        public static ListItemClickMsg parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ListItemClickMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ListItemClickMsg parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ListItemClickMsg) PARSER.parseFrom(data);
        }

        public static ListItemClickMsg parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ListItemClickMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ListItemClickMsg parseFrom(InputStream input) throws IOException {
            return (ListItemClickMsg) PARSER.parseFrom(input);
        }

        public static ListItemClickMsg parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ListItemClickMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ListItemClickMsg parseDelimitedFrom(InputStream input) throws IOException {
            return (ListItemClickMsg) PARSER.parseDelimitedFrom(input);
        }

        public static ListItemClickMsg parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ListItemClickMsg) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ListItemClickMsg parseFrom(CodedInputStream input) throws IOException {
            return (ListItemClickMsg) PARSER.parseFrom(input);
        }

        public static ListItemClickMsg parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ListItemClickMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ListItemClickMsg prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static final class MapItem extends GeneratedMessageLite implements MapItemOrBuilder {
        public static final int KEY_FIELD_NUMBER = 1;
        public static Parser<MapItem> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final MapItem defaultInstance;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Object key_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final ByteString unknownFields;
        private Object value_;

        /* renamed from: com.netease.caipiao.dcsdk.event.ProtoEvent.MapItem.1 */
        static class C04211 extends AbstractParser<MapItem> {
            C04211() {
            }

            public MapItem parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new MapItem(extensionRegistry, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<MapItem, Builder> implements MapItemOrBuilder {
            private int bitField0_;
            private Object key_;
            private Object value_;

            private Builder() {
                this.key_ = BuildConfig.FLAVOR;
                this.value_ = BuildConfig.FLAVOR;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.key_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -2;
                this.value_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -3;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public MapItem getDefaultInstanceForType() {
                return MapItem.getDefaultInstance();
            }

            public MapItem build() {
                MapItem result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw com.google.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(result);
            }

            public MapItem buildPartial() {
                MapItem result = new MapItem(null);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & MapItem.KEY_FIELD_NUMBER) == MapItem.KEY_FIELD_NUMBER) {
                    to_bitField0_ = 0 | MapItem.KEY_FIELD_NUMBER;
                }
                result.key_ = this.key_;
                if ((from_bitField0_ & MapItem.VALUE_FIELD_NUMBER) == MapItem.VALUE_FIELD_NUMBER) {
                    to_bitField0_ |= MapItem.VALUE_FIELD_NUMBER;
                }
                result.value_ = this.value_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(MapItem other) {
                if (other != MapItem.getDefaultInstance()) {
                    if (other.hasKey()) {
                        this.bitField0_ |= MapItem.KEY_FIELD_NUMBER;
                        this.key_ = other.key_;
                    }
                    if (other.hasValue()) {
                        this.bitField0_ |= MapItem.VALUE_FIELD_NUMBER;
                        this.value_ = other.value_;
                    }
                    setUnknownFields(getUnknownFields().concat(other.unknownFields));
                }
                return this;
            }

            public final boolean isInitialized() {
                if (hasKey() && hasValue()) {
                    return true;
                }
                return false;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                MapItem parsedMessage = null;
                try {
                    parsedMessage = (MapItem) MapItem.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MapItem) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
            }

            public boolean hasKey() {
                return (this.bitField0_ & MapItem.KEY_FIELD_NUMBER) == MapItem.KEY_FIELD_NUMBER;
            }

            public String getKey() {
                ByteString ref = this.key_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.key_ = s;
                return s;
            }

            public ByteString getKeyBytes() {
                Object ref = this.key_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.key_ = b;
                return b;
            }

            public Builder setKey(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= MapItem.KEY_FIELD_NUMBER;
                this.key_ = value;
                return this;
            }

            public Builder clearKey() {
                this.bitField0_ &= -2;
                this.key_ = MapItem.getDefaultInstance().getKey();
                return this;
            }

            public Builder setKeyBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= MapItem.KEY_FIELD_NUMBER;
                this.key_ = value;
                return this;
            }

            public boolean hasValue() {
                return (this.bitField0_ & MapItem.VALUE_FIELD_NUMBER) == MapItem.VALUE_FIELD_NUMBER;
            }

            public String getValue() {
                ByteString ref = this.value_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.value_ = s;
                return s;
            }

            public ByteString getValueBytes() {
                Object ref = this.value_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.value_ = b;
                return b;
            }

            public Builder setValue(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= MapItem.VALUE_FIELD_NUMBER;
                this.value_ = value;
                return this;
            }

            public Builder clearValue() {
                this.bitField0_ &= -3;
                this.value_ = MapItem.getDefaultInstance().getValue();
                return this;
            }

            public Builder setValueBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= MapItem.VALUE_FIELD_NUMBER;
                this.value_ = value;
                return this;
            }
        }

        private MapItem(com.google.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private MapItem(boolean noInit) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static MapItem getDefaultInstance() {
            return defaultInstance;
        }

        public MapItem getDefaultInstanceForType() {
            return defaultInstance;
        }

        private MapItem(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            OutputStream unknownFieldsOutput = ByteString.newOutput();
            CodedOutputStream unknownFieldsCodedOutput = CodedOutputStream.newInstance(unknownFieldsOutput);
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    ByteString bs;
                    switch (tag) {
                        case SwipeRefreshLayout.LARGE /*0*/:
                            done = true;
                            break;
                        case AppColdStartMsg.APPBUILDVERSION_FIELD_NUMBER /*10*/:
                            bs = input.readBytes();
                            this.bitField0_ |= KEY_FIELD_NUMBER;
                            this.key_ = bs;
                            break;
                        case AppColdStartMsg.BATTERYLEVEL_FIELD_NUMBER /*18*/:
                            bs = input.readBytes();
                            this.bitField0_ |= VALUE_FIELD_NUMBER;
                            this.value_ = bs;
                            break;
                        default:
                            if (!parseUnknownField(input, unknownFieldsCodedOutput, extensionRegistry, tag)) {
                                done = true;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    try {
                        unknownFieldsCodedOutput.flush();
                    } catch (IOException e3) {
                        makeExtensionsImmutable();
                    } finally {
                        this.unknownFields = unknownFieldsOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }
            }
            try {
                unknownFieldsCodedOutput.flush();
            } catch (IOException e4) {
            } finally {
                this.unknownFields = unknownFieldsOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            PARSER = new C04211();
            defaultInstance = new MapItem(true);
            defaultInstance.initFields();
        }

        public Parser<MapItem> getParserForType() {
            return PARSER;
        }

        public boolean hasKey() {
            return (this.bitField0_ & KEY_FIELD_NUMBER) == KEY_FIELD_NUMBER;
        }

        public String getKey() {
            ByteString ref = this.key_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.key_ = s;
            }
            return s;
        }

        public ByteString getKeyBytes() {
            Object ref = this.key_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.key_ = b;
            return b;
        }

        public boolean hasValue() {
            return (this.bitField0_ & VALUE_FIELD_NUMBER) == VALUE_FIELD_NUMBER;
        }

        public String getValue() {
            ByteString ref = this.value_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.value_ = s;
            }
            return s;
        }

        public ByteString getValueBytes() {
            Object ref = this.value_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.value_ = b;
            return b;
        }

        private void initFields() {
            this.key_ = BuildConfig.FLAVOR;
            this.value_ = BuildConfig.FLAVOR;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == (byte) 1) {
                return true;
            }
            if (isInitialized == null) {
                return false;
            }
            if (!hasKey()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (hasValue()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & KEY_FIELD_NUMBER) == KEY_FIELD_NUMBER) {
                output.writeBytes(KEY_FIELD_NUMBER, getKeyBytes());
            }
            if ((this.bitField0_ & VALUE_FIELD_NUMBER) == VALUE_FIELD_NUMBER) {
                output.writeBytes(VALUE_FIELD_NUMBER, getValueBytes());
            }
            output.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & KEY_FIELD_NUMBER) == KEY_FIELD_NUMBER) {
                size = 0 + CodedOutputStream.computeBytesSize(KEY_FIELD_NUMBER, getKeyBytes());
            }
            if ((this.bitField0_ & VALUE_FIELD_NUMBER) == VALUE_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(VALUE_FIELD_NUMBER, getValueBytes());
            }
            size += this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static MapItem parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (MapItem) PARSER.parseFrom(data);
        }

        public static MapItem parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MapItem) PARSER.parseFrom(data, extensionRegistry);
        }

        public static MapItem parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (MapItem) PARSER.parseFrom(data);
        }

        public static MapItem parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MapItem) PARSER.parseFrom(data, extensionRegistry);
        }

        public static MapItem parseFrom(InputStream input) throws IOException {
            return (MapItem) PARSER.parseFrom(input);
        }

        public static MapItem parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MapItem) PARSER.parseFrom(input, extensionRegistry);
        }

        public static MapItem parseDelimitedFrom(InputStream input) throws IOException {
            return (MapItem) PARSER.parseDelimitedFrom(input);
        }

        public static MapItem parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MapItem) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static MapItem parseFrom(CodedInputStream input) throws IOException {
            return (MapItem) PARSER.parseFrom(input);
        }

        public static MapItem parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MapItem) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(MapItem prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static final class PageMsg extends GeneratedMessageLite implements PageMsgOrBuilder {
        public static final int APPKEY_FIELD_NUMBER = 4;
        public static final int DEVICEID_FIELD_NUMBER = 5;
        public static final int EVENTNAME_FIELD_NUMBER = 1;
        public static final int EVENTTIME_FIELD_NUMBER = 2;
        public static final int ITEM_FIELD_NUMBER = 7;
        public static final int PAGE_FIELD_NUMBER = 6;
        public static Parser<PageMsg> PARSER = null;
        public static final int SESSIONID_FIELD_NUMBER = 3;
        private static final PageMsg defaultInstance;
        private static final long serialVersionUID = 0;
        private Object appKey_;
        private int bitField0_;
        private Object deviceId_;
        private Object eventName_;
        private Object eventTime_;
        private List<MapItem> item_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object page_;
        private Object sessionId_;
        private final ByteString unknownFields;

        /* renamed from: com.netease.caipiao.dcsdk.event.ProtoEvent.PageMsg.1 */
        static class C04221 extends AbstractParser<PageMsg> {
            C04221() {
            }

            public PageMsg parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new PageMsg(extensionRegistry, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<PageMsg, Builder> implements PageMsgOrBuilder {
            private Object appKey_;
            private int bitField0_;
            private Object deviceId_;
            private Object eventName_;
            private Object eventTime_;
            private List<MapItem> item_;
            private Object page_;
            private Object sessionId_;

            private Builder() {
                this.eventName_ = BuildConfig.FLAVOR;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.appKey_ = BuildConfig.FLAVOR;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.page_ = BuildConfig.FLAVOR;
                this.item_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.eventName_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -2;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -3;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -5;
                this.appKey_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -9;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -17;
                this.page_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -33;
                this.item_ = Collections.emptyList();
                this.bitField0_ &= -65;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public PageMsg getDefaultInstanceForType() {
                return PageMsg.getDefaultInstance();
            }

            public PageMsg build() {
                PageMsg result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw com.google.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(result);
            }

            public PageMsg buildPartial() {
                PageMsg result = new PageMsg(null);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & PageMsg.EVENTNAME_FIELD_NUMBER) == PageMsg.EVENTNAME_FIELD_NUMBER) {
                    to_bitField0_ = 0 | PageMsg.EVENTNAME_FIELD_NUMBER;
                }
                result.eventName_ = this.eventName_;
                if ((from_bitField0_ & PageMsg.EVENTTIME_FIELD_NUMBER) == PageMsg.EVENTTIME_FIELD_NUMBER) {
                    to_bitField0_ |= PageMsg.EVENTTIME_FIELD_NUMBER;
                }
                result.eventTime_ = this.eventTime_;
                if ((from_bitField0_ & PageMsg.APPKEY_FIELD_NUMBER) == PageMsg.APPKEY_FIELD_NUMBER) {
                    to_bitField0_ |= PageMsg.APPKEY_FIELD_NUMBER;
                }
                result.sessionId_ = this.sessionId_;
                if ((from_bitField0_ & 8) == 8) {
                    to_bitField0_ |= 8;
                }
                result.appKey_ = this.appKey_;
                if ((from_bitField0_ & 16) == 16) {
                    to_bitField0_ |= 16;
                }
                result.deviceId_ = this.deviceId_;
                if ((from_bitField0_ & 32) == 32) {
                    to_bitField0_ |= 32;
                }
                result.page_ = this.page_;
                if ((this.bitField0_ & 64) == 64) {
                    this.item_ = Collections.unmodifiableList(this.item_);
                    this.bitField0_ &= -65;
                }
                result.item_ = this.item_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(PageMsg other) {
                if (other != PageMsg.getDefaultInstance()) {
                    if (other.hasEventName()) {
                        this.bitField0_ |= PageMsg.EVENTNAME_FIELD_NUMBER;
                        this.eventName_ = other.eventName_;
                    }
                    if (other.hasEventTime()) {
                        this.bitField0_ |= PageMsg.EVENTTIME_FIELD_NUMBER;
                        this.eventTime_ = other.eventTime_;
                    }
                    if (other.hasSessionId()) {
                        this.bitField0_ |= PageMsg.APPKEY_FIELD_NUMBER;
                        this.sessionId_ = other.sessionId_;
                    }
                    if (other.hasAppKey()) {
                        this.bitField0_ |= 8;
                        this.appKey_ = other.appKey_;
                    }
                    if (other.hasDeviceId()) {
                        this.bitField0_ |= 16;
                        this.deviceId_ = other.deviceId_;
                    }
                    if (other.hasPage()) {
                        this.bitField0_ |= 32;
                        this.page_ = other.page_;
                    }
                    if (!other.item_.isEmpty()) {
                        if (this.item_.isEmpty()) {
                            this.item_ = other.item_;
                            this.bitField0_ &= -65;
                        } else {
                            ensureItemIsMutable();
                            this.item_.addAll(other.item_);
                        }
                    }
                    setUnknownFields(getUnknownFields().concat(other.unknownFields));
                }
                return this;
            }

            public final boolean isInitialized() {
                if (!hasEventName() || !hasEventTime() || !hasSessionId() || !hasAppKey() || !hasDeviceId() || !hasPage()) {
                    return false;
                }
                for (int i = 0; i < getItemCount(); i += PageMsg.EVENTNAME_FIELD_NUMBER) {
                    if (!getItem(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                PageMsg parsedMessage = null;
                try {
                    parsedMessage = (PageMsg) PageMsg.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PageMsg) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
            }

            public boolean hasEventName() {
                return (this.bitField0_ & PageMsg.EVENTNAME_FIELD_NUMBER) == PageMsg.EVENTNAME_FIELD_NUMBER;
            }

            public String getEventName() {
                ByteString ref = this.eventName_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventName_ = s;
                return s;
            }

            public ByteString getEventNameBytes() {
                Object ref = this.eventName_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventName_ = b;
                return b;
            }

            public Builder setEventName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= PageMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public Builder clearEventName() {
                this.bitField0_ &= -2;
                this.eventName_ = PageMsg.getDefaultInstance().getEventName();
                return this;
            }

            public Builder setEventNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= PageMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public boolean hasEventTime() {
                return (this.bitField0_ & PageMsg.EVENTTIME_FIELD_NUMBER) == PageMsg.EVENTTIME_FIELD_NUMBER;
            }

            public String getEventTime() {
                ByteString ref = this.eventTime_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventTime_ = s;
                return s;
            }

            public ByteString getEventTimeBytes() {
                Object ref = this.eventTime_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventTime_ = b;
                return b;
            }

            public Builder setEventTime(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= PageMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public Builder clearEventTime() {
                this.bitField0_ &= -3;
                this.eventTime_ = PageMsg.getDefaultInstance().getEventTime();
                return this;
            }

            public Builder setEventTimeBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= PageMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public boolean hasSessionId() {
                return (this.bitField0_ & PageMsg.APPKEY_FIELD_NUMBER) == PageMsg.APPKEY_FIELD_NUMBER;
            }

            public String getSessionId() {
                ByteString ref = this.sessionId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.sessionId_ = s;
                return s;
            }

            public ByteString getSessionIdBytes() {
                Object ref = this.sessionId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.sessionId_ = b;
                return b;
            }

            public Builder setSessionId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= PageMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -5;
                this.sessionId_ = PageMsg.getDefaultInstance().getSessionId();
                return this;
            }

            public Builder setSessionIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= PageMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public boolean hasAppKey() {
                return (this.bitField0_ & 8) == 8;
            }

            public String getAppKey() {
                ByteString ref = this.appKey_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.appKey_ = s;
                return s;
            }

            public ByteString getAppKeyBytes() {
                Object ref = this.appKey_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.appKey_ = b;
                return b;
            }

            public Builder setAppKey(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.appKey_ = value;
                return this;
            }

            public Builder clearAppKey() {
                this.bitField0_ &= -9;
                this.appKey_ = PageMsg.getDefaultInstance().getAppKey();
                return this;
            }

            public Builder setAppKeyBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.appKey_ = value;
                return this;
            }

            public boolean hasDeviceId() {
                return (this.bitField0_ & 16) == 16;
            }

            public String getDeviceId() {
                ByteString ref = this.deviceId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.deviceId_ = s;
                return s;
            }

            public ByteString getDeviceIdBytes() {
                Object ref = this.deviceId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.deviceId_ = b;
                return b;
            }

            public Builder setDeviceId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public Builder clearDeviceId() {
                this.bitField0_ &= -17;
                this.deviceId_ = PageMsg.getDefaultInstance().getDeviceId();
                return this;
            }

            public Builder setDeviceIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public boolean hasPage() {
                return (this.bitField0_ & 32) == 32;
            }

            public String getPage() {
                ByteString ref = this.page_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.page_ = s;
                return s;
            }

            public ByteString getPageBytes() {
                Object ref = this.page_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.page_ = b;
                return b;
            }

            public Builder setPage(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.page_ = value;
                return this;
            }

            public Builder clearPage() {
                this.bitField0_ &= -33;
                this.page_ = PageMsg.getDefaultInstance().getPage();
                return this;
            }

            public Builder setPageBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.page_ = value;
                return this;
            }

            private void ensureItemIsMutable() {
                if ((this.bitField0_ & 64) != 64) {
                    this.item_ = new ArrayList(this.item_);
                    this.bitField0_ |= 64;
                }
            }

            public List<MapItem> getItemList() {
                return Collections.unmodifiableList(this.item_);
            }

            public int getItemCount() {
                return this.item_.size();
            }

            public MapItem getItem(int index) {
                return (MapItem) this.item_.get(index);
            }

            public Builder setItem(int index, MapItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemIsMutable();
                this.item_.set(index, value);
                return this;
            }

            public Builder setItem(int index, Builder builderForValue) {
                ensureItemIsMutable();
                this.item_.set(index, builderForValue.build());
                return this;
            }

            public Builder addItem(MapItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemIsMutable();
                this.item_.add(value);
                return this;
            }

            public Builder addItem(int index, MapItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemIsMutable();
                this.item_.add(index, value);
                return this;
            }

            public Builder addItem(Builder builderForValue) {
                ensureItemIsMutable();
                this.item_.add(builderForValue.build());
                return this;
            }

            public Builder addItem(int index, Builder builderForValue) {
                ensureItemIsMutable();
                this.item_.add(index, builderForValue.build());
                return this;
            }

            public Builder addAllItem(Iterable<? extends MapItem> values) {
                ensureItemIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.item_);
                return this;
            }

            public Builder clearItem() {
                this.item_ = Collections.emptyList();
                this.bitField0_ &= -65;
                return this;
            }

            public Builder removeItem(int index) {
                ensureItemIsMutable();
                this.item_.remove(index);
                return this;
            }
        }

        private PageMsg(com.google.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private PageMsg(boolean noInit) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static PageMsg getDefaultInstance() {
            return defaultInstance;
        }

        public PageMsg getDefaultInstanceForType() {
            return defaultInstance;
        }

        private PageMsg(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            OutputStream unknownFieldsOutput = ByteString.newOutput();
            CodedOutputStream unknownFieldsCodedOutput = CodedOutputStream.newInstance(unknownFieldsOutput);
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    ByteString bs;
                    switch (tag) {
                        case SwipeRefreshLayout.LARGE /*0*/:
                            done = true;
                            break;
                        case AppColdStartMsg.APPBUILDVERSION_FIELD_NUMBER /*10*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTNAME_FIELD_NUMBER;
                            this.eventName_ = bs;
                            break;
                        case AppColdStartMsg.BATTERYLEVEL_FIELD_NUMBER /*18*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTTIME_FIELD_NUMBER;
                            this.eventTime_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionMenuTextColor /*26*/:
                            bs = input.readBytes();
                            this.bitField0_ |= APPKEY_FIELD_NUMBER;
                            this.sessionId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionModePasteDrawable /*34*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 8;
                            this.appKey_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_dialogTheme /*42*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 16;
                            this.deviceId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_buttonBarStyle /*50*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 32;
                            this.page_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_toolbarStyle /*58*/:
                            if ((mutable_bitField0_ & 64) != 64) {
                                this.item_ = new ArrayList();
                                mutable_bitField0_ |= 64;
                            }
                            this.item_.add(input.readMessage(MapItem.PARSER, extensionRegistry));
                            break;
                        default:
                            if (!parseUnknownField(input, unknownFieldsCodedOutput, extensionRegistry, tag)) {
                                done = true;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if ((mutable_bitField0_ & 64) == 64) {
                        this.item_ = Collections.unmodifiableList(this.item_);
                    }
                    try {
                        unknownFieldsCodedOutput.flush();
                    } catch (IOException e3) {
                        makeExtensionsImmutable();
                    } finally {
                        this.unknownFields = unknownFieldsOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }
            }
            if ((mutable_bitField0_ & 64) == 64) {
                this.item_ = Collections.unmodifiableList(this.item_);
            }
            try {
                unknownFieldsCodedOutput.flush();
            } catch (IOException e4) {
            } finally {
                this.unknownFields = unknownFieldsOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            PARSER = new C04221();
            defaultInstance = new PageMsg(true);
            defaultInstance.initFields();
        }

        public Parser<PageMsg> getParserForType() {
            return PARSER;
        }

        public boolean hasEventName() {
            return (this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER;
        }

        public String getEventName() {
            ByteString ref = this.eventName_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventName_ = s;
            }
            return s;
        }

        public ByteString getEventNameBytes() {
            Object ref = this.eventName_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventName_ = b;
            return b;
        }

        public boolean hasEventTime() {
            return (this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER;
        }

        public String getEventTime() {
            ByteString ref = this.eventTime_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventTime_ = s;
            }
            return s;
        }

        public ByteString getEventTimeBytes() {
            Object ref = this.eventTime_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventTime_ = b;
            return b;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER;
        }

        public String getSessionId() {
            ByteString ref = this.sessionId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.sessionId_ = s;
            }
            return s;
        }

        public ByteString getSessionIdBytes() {
            Object ref = this.sessionId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.sessionId_ = b;
            return b;
        }

        public boolean hasAppKey() {
            return (this.bitField0_ & 8) == 8;
        }

        public String getAppKey() {
            ByteString ref = this.appKey_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.appKey_ = s;
            }
            return s;
        }

        public ByteString getAppKeyBytes() {
            Object ref = this.appKey_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.appKey_ = b;
            return b;
        }

        public boolean hasDeviceId() {
            return (this.bitField0_ & 16) == 16;
        }

        public String getDeviceId() {
            ByteString ref = this.deviceId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.deviceId_ = s;
            }
            return s;
        }

        public ByteString getDeviceIdBytes() {
            Object ref = this.deviceId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.deviceId_ = b;
            return b;
        }

        public boolean hasPage() {
            return (this.bitField0_ & 32) == 32;
        }

        public String getPage() {
            ByteString ref = this.page_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.page_ = s;
            }
            return s;
        }

        public ByteString getPageBytes() {
            Object ref = this.page_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.page_ = b;
            return b;
        }

        public List<MapItem> getItemList() {
            return this.item_;
        }

        public List<? extends MapItemOrBuilder> getItemOrBuilderList() {
            return this.item_;
        }

        public int getItemCount() {
            return this.item_.size();
        }

        public MapItem getItem(int index) {
            return (MapItem) this.item_.get(index);
        }

        public MapItemOrBuilder getItemOrBuilder(int index) {
            return (MapItemOrBuilder) this.item_.get(index);
        }

        private void initFields() {
            this.eventName_ = BuildConfig.FLAVOR;
            this.eventTime_ = BuildConfig.FLAVOR;
            this.sessionId_ = BuildConfig.FLAVOR;
            this.appKey_ = BuildConfig.FLAVOR;
            this.deviceId_ = BuildConfig.FLAVOR;
            this.page_ = BuildConfig.FLAVOR;
            this.item_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == (byte) 1) {
                return true;
            }
            if (isInitialized == null) {
                return false;
            }
            if (!hasEventName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasEventTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasSessionId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasAppKey()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasDeviceId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (hasPage()) {
                int i = 0;
                while (i < getItemCount()) {
                    if (getItem(i).isInitialized()) {
                        i += EVENTNAME_FIELD_NUMBER;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                output.writeBytes(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                output.writeBytes(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                output.writeBytes(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                output.writeBytes(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                output.writeBytes(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                output.writeBytes(PAGE_FIELD_NUMBER, getPageBytes());
            }
            for (int i = 0; i < this.item_.size(); i += EVENTNAME_FIELD_NUMBER) {
                output.writeMessage(ITEM_FIELD_NUMBER, (MessageLite) this.item_.get(i));
            }
            output.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                size = 0 + CodedOutputStream.computeBytesSize(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                size += CodedOutputStream.computeBytesSize(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                size += CodedOutputStream.computeBytesSize(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                size += CodedOutputStream.computeBytesSize(PAGE_FIELD_NUMBER, getPageBytes());
            }
            for (int i = 0; i < this.item_.size(); i += EVENTNAME_FIELD_NUMBER) {
                size += CodedOutputStream.computeMessageSize(ITEM_FIELD_NUMBER, (MessageLite) this.item_.get(i));
            }
            size += this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static PageMsg parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PageMsg) PARSER.parseFrom(data);
        }

        public static PageMsg parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PageMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static PageMsg parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PageMsg) PARSER.parseFrom(data);
        }

        public static PageMsg parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PageMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static PageMsg parseFrom(InputStream input) throws IOException {
            return (PageMsg) PARSER.parseFrom(input);
        }

        public static PageMsg parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PageMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static PageMsg parseDelimitedFrom(InputStream input) throws IOException {
            return (PageMsg) PARSER.parseDelimitedFrom(input);
        }

        public static PageMsg parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PageMsg) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static PageMsg parseFrom(CodedInputStream input) throws IOException {
            return (PageMsg) PARSER.parseFrom(input);
        }

        public static PageMsg parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PageMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(PageMsg prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static final class PushMsg extends GeneratedMessageLite implements PushMsgOrBuilder {
        public static final int APPKEY_FIELD_NUMBER = 4;
        public static final int CONTENT_FIELD_NUMBER = 6;
        public static final int DEVICEID_FIELD_NUMBER = 5;
        public static final int EVENTNAME_FIELD_NUMBER = 1;
        public static final int EVENTTIME_FIELD_NUMBER = 2;
        public static Parser<PushMsg> PARSER = null;
        public static final int SESSIONID_FIELD_NUMBER = 3;
        private static final PushMsg defaultInstance;
        private static final long serialVersionUID = 0;
        private Object appKey_;
        private int bitField0_;
        private Object content_;
        private Object deviceId_;
        private Object eventName_;
        private Object eventTime_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sessionId_;
        private final ByteString unknownFields;

        /* renamed from: com.netease.caipiao.dcsdk.event.ProtoEvent.PushMsg.1 */
        static class C04231 extends AbstractParser<PushMsg> {
            C04231() {
            }

            public PushMsg parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new PushMsg(extensionRegistry, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<PushMsg, Builder> implements PushMsgOrBuilder {
            private Object appKey_;
            private int bitField0_;
            private Object content_;
            private Object deviceId_;
            private Object eventName_;
            private Object eventTime_;
            private Object sessionId_;

            private Builder() {
                this.eventName_ = BuildConfig.FLAVOR;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.appKey_ = BuildConfig.FLAVOR;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.content_ = BuildConfig.FLAVOR;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.eventName_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -2;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -3;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -5;
                this.appKey_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -9;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -17;
                this.content_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -33;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public PushMsg getDefaultInstanceForType() {
                return PushMsg.getDefaultInstance();
            }

            public PushMsg build() {
                PushMsg result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw com.google.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(result);
            }

            public PushMsg buildPartial() {
                PushMsg result = new PushMsg(null);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & PushMsg.EVENTNAME_FIELD_NUMBER) == PushMsg.EVENTNAME_FIELD_NUMBER) {
                    to_bitField0_ = 0 | PushMsg.EVENTNAME_FIELD_NUMBER;
                }
                result.eventName_ = this.eventName_;
                if ((from_bitField0_ & PushMsg.EVENTTIME_FIELD_NUMBER) == PushMsg.EVENTTIME_FIELD_NUMBER) {
                    to_bitField0_ |= PushMsg.EVENTTIME_FIELD_NUMBER;
                }
                result.eventTime_ = this.eventTime_;
                if ((from_bitField0_ & PushMsg.APPKEY_FIELD_NUMBER) == PushMsg.APPKEY_FIELD_NUMBER) {
                    to_bitField0_ |= PushMsg.APPKEY_FIELD_NUMBER;
                }
                result.sessionId_ = this.sessionId_;
                if ((from_bitField0_ & 8) == 8) {
                    to_bitField0_ |= 8;
                }
                result.appKey_ = this.appKey_;
                if ((from_bitField0_ & 16) == 16) {
                    to_bitField0_ |= 16;
                }
                result.deviceId_ = this.deviceId_;
                if ((from_bitField0_ & 32) == 32) {
                    to_bitField0_ |= 32;
                }
                result.content_ = this.content_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(PushMsg other) {
                if (other != PushMsg.getDefaultInstance()) {
                    if (other.hasEventName()) {
                        this.bitField0_ |= PushMsg.EVENTNAME_FIELD_NUMBER;
                        this.eventName_ = other.eventName_;
                    }
                    if (other.hasEventTime()) {
                        this.bitField0_ |= PushMsg.EVENTTIME_FIELD_NUMBER;
                        this.eventTime_ = other.eventTime_;
                    }
                    if (other.hasSessionId()) {
                        this.bitField0_ |= PushMsg.APPKEY_FIELD_NUMBER;
                        this.sessionId_ = other.sessionId_;
                    }
                    if (other.hasAppKey()) {
                        this.bitField0_ |= 8;
                        this.appKey_ = other.appKey_;
                    }
                    if (other.hasDeviceId()) {
                        this.bitField0_ |= 16;
                        this.deviceId_ = other.deviceId_;
                    }
                    if (other.hasContent()) {
                        this.bitField0_ |= 32;
                        this.content_ = other.content_;
                    }
                    setUnknownFields(getUnknownFields().concat(other.unknownFields));
                }
                return this;
            }

            public final boolean isInitialized() {
                if (hasEventName() && hasEventTime() && hasSessionId() && hasAppKey() && hasDeviceId() && hasContent()) {
                    return true;
                }
                return false;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                PushMsg parsedMessage = null;
                try {
                    parsedMessage = (PushMsg) PushMsg.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PushMsg) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
            }

            public boolean hasEventName() {
                return (this.bitField0_ & PushMsg.EVENTNAME_FIELD_NUMBER) == PushMsg.EVENTNAME_FIELD_NUMBER;
            }

            public String getEventName() {
                ByteString ref = this.eventName_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventName_ = s;
                return s;
            }

            public ByteString getEventNameBytes() {
                Object ref = this.eventName_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventName_ = b;
                return b;
            }

            public Builder setEventName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= PushMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public Builder clearEventName() {
                this.bitField0_ &= -2;
                this.eventName_ = PushMsg.getDefaultInstance().getEventName();
                return this;
            }

            public Builder setEventNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= PushMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public boolean hasEventTime() {
                return (this.bitField0_ & PushMsg.EVENTTIME_FIELD_NUMBER) == PushMsg.EVENTTIME_FIELD_NUMBER;
            }

            public String getEventTime() {
                ByteString ref = this.eventTime_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventTime_ = s;
                return s;
            }

            public ByteString getEventTimeBytes() {
                Object ref = this.eventTime_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventTime_ = b;
                return b;
            }

            public Builder setEventTime(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= PushMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public Builder clearEventTime() {
                this.bitField0_ &= -3;
                this.eventTime_ = PushMsg.getDefaultInstance().getEventTime();
                return this;
            }

            public Builder setEventTimeBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= PushMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public boolean hasSessionId() {
                return (this.bitField0_ & PushMsg.APPKEY_FIELD_NUMBER) == PushMsg.APPKEY_FIELD_NUMBER;
            }

            public String getSessionId() {
                ByteString ref = this.sessionId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.sessionId_ = s;
                return s;
            }

            public ByteString getSessionIdBytes() {
                Object ref = this.sessionId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.sessionId_ = b;
                return b;
            }

            public Builder setSessionId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= PushMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -5;
                this.sessionId_ = PushMsg.getDefaultInstance().getSessionId();
                return this;
            }

            public Builder setSessionIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= PushMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public boolean hasAppKey() {
                return (this.bitField0_ & 8) == 8;
            }

            public String getAppKey() {
                ByteString ref = this.appKey_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.appKey_ = s;
                return s;
            }

            public ByteString getAppKeyBytes() {
                Object ref = this.appKey_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.appKey_ = b;
                return b;
            }

            public Builder setAppKey(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.appKey_ = value;
                return this;
            }

            public Builder clearAppKey() {
                this.bitField0_ &= -9;
                this.appKey_ = PushMsg.getDefaultInstance().getAppKey();
                return this;
            }

            public Builder setAppKeyBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.appKey_ = value;
                return this;
            }

            public boolean hasDeviceId() {
                return (this.bitField0_ & 16) == 16;
            }

            public String getDeviceId() {
                ByteString ref = this.deviceId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.deviceId_ = s;
                return s;
            }

            public ByteString getDeviceIdBytes() {
                Object ref = this.deviceId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.deviceId_ = b;
                return b;
            }

            public Builder setDeviceId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public Builder clearDeviceId() {
                this.bitField0_ &= -17;
                this.deviceId_ = PushMsg.getDefaultInstance().getDeviceId();
                return this;
            }

            public Builder setDeviceIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public boolean hasContent() {
                return (this.bitField0_ & 32) == 32;
            }

            public String getContent() {
                ByteString ref = this.content_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.content_ = s;
                return s;
            }

            public ByteString getContentBytes() {
                Object ref = this.content_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.content_ = b;
                return b;
            }

            public Builder setContent(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.content_ = value;
                return this;
            }

            public Builder clearContent() {
                this.bitField0_ &= -33;
                this.content_ = PushMsg.getDefaultInstance().getContent();
                return this;
            }

            public Builder setContentBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.content_ = value;
                return this;
            }
        }

        private PushMsg(com.google.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private PushMsg(boolean noInit) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static PushMsg getDefaultInstance() {
            return defaultInstance;
        }

        public PushMsg getDefaultInstanceForType() {
            return defaultInstance;
        }

        private PushMsg(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            OutputStream unknownFieldsOutput = ByteString.newOutput();
            CodedOutputStream unknownFieldsCodedOutput = CodedOutputStream.newInstance(unknownFieldsOutput);
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    ByteString bs;
                    switch (tag) {
                        case SwipeRefreshLayout.LARGE /*0*/:
                            done = true;
                            break;
                        case AppColdStartMsg.APPBUILDVERSION_FIELD_NUMBER /*10*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTNAME_FIELD_NUMBER;
                            this.eventName_ = bs;
                            break;
                        case AppColdStartMsg.BATTERYLEVEL_FIELD_NUMBER /*18*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTTIME_FIELD_NUMBER;
                            this.eventTime_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionMenuTextColor /*26*/:
                            bs = input.readBytes();
                            this.bitField0_ |= APPKEY_FIELD_NUMBER;
                            this.sessionId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionModePasteDrawable /*34*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 8;
                            this.appKey_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_dialogTheme /*42*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 16;
                            this.deviceId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_buttonBarStyle /*50*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 32;
                            this.content_ = bs;
                            break;
                        default:
                            if (!parseUnknownField(input, unknownFieldsCodedOutput, extensionRegistry, tag)) {
                                done = true;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    try {
                        unknownFieldsCodedOutput.flush();
                    } catch (IOException e3) {
                        makeExtensionsImmutable();
                    } finally {
                        this.unknownFields = unknownFieldsOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }
            }
            try {
                unknownFieldsCodedOutput.flush();
            } catch (IOException e4) {
            } finally {
                this.unknownFields = unknownFieldsOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            PARSER = new C04231();
            defaultInstance = new PushMsg(true);
            defaultInstance.initFields();
        }

        public Parser<PushMsg> getParserForType() {
            return PARSER;
        }

        public boolean hasEventName() {
            return (this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER;
        }

        public String getEventName() {
            ByteString ref = this.eventName_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventName_ = s;
            }
            return s;
        }

        public ByteString getEventNameBytes() {
            Object ref = this.eventName_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventName_ = b;
            return b;
        }

        public boolean hasEventTime() {
            return (this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER;
        }

        public String getEventTime() {
            ByteString ref = this.eventTime_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventTime_ = s;
            }
            return s;
        }

        public ByteString getEventTimeBytes() {
            Object ref = this.eventTime_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventTime_ = b;
            return b;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER;
        }

        public String getSessionId() {
            ByteString ref = this.sessionId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.sessionId_ = s;
            }
            return s;
        }

        public ByteString getSessionIdBytes() {
            Object ref = this.sessionId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.sessionId_ = b;
            return b;
        }

        public boolean hasAppKey() {
            return (this.bitField0_ & 8) == 8;
        }

        public String getAppKey() {
            ByteString ref = this.appKey_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.appKey_ = s;
            }
            return s;
        }

        public ByteString getAppKeyBytes() {
            Object ref = this.appKey_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.appKey_ = b;
            return b;
        }

        public boolean hasDeviceId() {
            return (this.bitField0_ & 16) == 16;
        }

        public String getDeviceId() {
            ByteString ref = this.deviceId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.deviceId_ = s;
            }
            return s;
        }

        public ByteString getDeviceIdBytes() {
            Object ref = this.deviceId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.deviceId_ = b;
            return b;
        }

        public boolean hasContent() {
            return (this.bitField0_ & 32) == 32;
        }

        public String getContent() {
            ByteString ref = this.content_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.content_ = s;
            }
            return s;
        }

        public ByteString getContentBytes() {
            Object ref = this.content_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.content_ = b;
            return b;
        }

        private void initFields() {
            this.eventName_ = BuildConfig.FLAVOR;
            this.eventTime_ = BuildConfig.FLAVOR;
            this.sessionId_ = BuildConfig.FLAVOR;
            this.appKey_ = BuildConfig.FLAVOR;
            this.deviceId_ = BuildConfig.FLAVOR;
            this.content_ = BuildConfig.FLAVOR;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == (byte) 1) {
                return true;
            }
            if (isInitialized == null) {
                return false;
            }
            if (!hasEventName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasEventTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasSessionId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasAppKey()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasDeviceId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (hasContent()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                output.writeBytes(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                output.writeBytes(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                output.writeBytes(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                output.writeBytes(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                output.writeBytes(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                output.writeBytes(CONTENT_FIELD_NUMBER, getContentBytes());
            }
            output.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                size = 0 + CodedOutputStream.computeBytesSize(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                size += CodedOutputStream.computeBytesSize(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                size += CodedOutputStream.computeBytesSize(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                size += CodedOutputStream.computeBytesSize(CONTENT_FIELD_NUMBER, getContentBytes());
            }
            size += this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static PushMsg parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PushMsg) PARSER.parseFrom(data);
        }

        public static PushMsg parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PushMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static PushMsg parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PushMsg) PARSER.parseFrom(data);
        }

        public static PushMsg parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PushMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static PushMsg parseFrom(InputStream input) throws IOException {
            return (PushMsg) PARSER.parseFrom(input);
        }

        public static PushMsg parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PushMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static PushMsg parseDelimitedFrom(InputStream input) throws IOException {
            return (PushMsg) PARSER.parseDelimitedFrom(input);
        }

        public static PushMsg parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PushMsg) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static PushMsg parseFrom(CodedInputStream input) throws IOException {
            return (PushMsg) PARSER.parseFrom(input);
        }

        public static PushMsg parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PushMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(PushMsg prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static final class ScrollViewMsg extends GeneratedMessageLite implements ScrollViewMsgOrBuilder {
        public static final int APPKEY_FIELD_NUMBER = 4;
        public static final int DEVICEID_FIELD_NUMBER = 5;
        public static final int DIRECTION_FIELD_NUMBER = 7;
        public static final int EVENTNAME_FIELD_NUMBER = 1;
        public static final int EVENTTIME_FIELD_NUMBER = 2;
        public static final int PAGE_FIELD_NUMBER = 6;
        public static Parser<ScrollViewMsg> PARSER = null;
        public static final int SCALE_FIELD_NUMBER = 8;
        public static final int SESSIONID_FIELD_NUMBER = 3;
        public static final int VIEW_FIELD_NUMBER = 9;
        private static final ScrollViewMsg defaultInstance;
        private static final long serialVersionUID = 0;
        private Object appKey_;
        private int bitField0_;
        private Object deviceId_;
        private Object direction_;
        private Object eventName_;
        private Object eventTime_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object page_;
        private Object scale_;
        private Object sessionId_;
        private final ByteString unknownFields;
        private ViewItem view_;

        /* renamed from: com.netease.caipiao.dcsdk.event.ProtoEvent.ScrollViewMsg.1 */
        static class C04241 extends AbstractParser<ScrollViewMsg> {
            C04241() {
            }

            public ScrollViewMsg parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ScrollViewMsg(extensionRegistry, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<ScrollViewMsg, Builder> implements ScrollViewMsgOrBuilder {
            private Object appKey_;
            private int bitField0_;
            private Object deviceId_;
            private Object direction_;
            private Object eventName_;
            private Object eventTime_;
            private Object page_;
            private Object scale_;
            private Object sessionId_;
            private ViewItem view_;

            private Builder() {
                this.eventName_ = BuildConfig.FLAVOR;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.appKey_ = BuildConfig.FLAVOR;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.page_ = BuildConfig.FLAVOR;
                this.direction_ = BuildConfig.FLAVOR;
                this.scale_ = BuildConfig.FLAVOR;
                this.view_ = ViewItem.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.eventName_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -2;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -3;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -5;
                this.appKey_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -9;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -17;
                this.page_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -33;
                this.direction_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -65;
                this.scale_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -129;
                this.view_ = ViewItem.getDefaultInstance();
                this.bitField0_ &= -257;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public ScrollViewMsg getDefaultInstanceForType() {
                return ScrollViewMsg.getDefaultInstance();
            }

            public ScrollViewMsg build() {
                ScrollViewMsg result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw com.google.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(result);
            }

            public ScrollViewMsg buildPartial() {
                ScrollViewMsg result = new ScrollViewMsg(null);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & ScrollViewMsg.EVENTNAME_FIELD_NUMBER) == ScrollViewMsg.EVENTNAME_FIELD_NUMBER) {
                    to_bitField0_ = 0 | ScrollViewMsg.EVENTNAME_FIELD_NUMBER;
                }
                result.eventName_ = this.eventName_;
                if ((from_bitField0_ & ScrollViewMsg.EVENTTIME_FIELD_NUMBER) == ScrollViewMsg.EVENTTIME_FIELD_NUMBER) {
                    to_bitField0_ |= ScrollViewMsg.EVENTTIME_FIELD_NUMBER;
                }
                result.eventTime_ = this.eventTime_;
                if ((from_bitField0_ & ScrollViewMsg.APPKEY_FIELD_NUMBER) == ScrollViewMsg.APPKEY_FIELD_NUMBER) {
                    to_bitField0_ |= ScrollViewMsg.APPKEY_FIELD_NUMBER;
                }
                result.sessionId_ = this.sessionId_;
                if ((from_bitField0_ & ScrollViewMsg.SCALE_FIELD_NUMBER) == ScrollViewMsg.SCALE_FIELD_NUMBER) {
                    to_bitField0_ |= ScrollViewMsg.SCALE_FIELD_NUMBER;
                }
                result.appKey_ = this.appKey_;
                if ((from_bitField0_ & 16) == 16) {
                    to_bitField0_ |= 16;
                }
                result.deviceId_ = this.deviceId_;
                if ((from_bitField0_ & 32) == 32) {
                    to_bitField0_ |= 32;
                }
                result.page_ = this.page_;
                if ((from_bitField0_ & 64) == 64) {
                    to_bitField0_ |= 64;
                }
                result.direction_ = this.direction_;
                if ((from_bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                    to_bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                }
                result.scale_ = this.scale_;
                if ((from_bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                    to_bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                }
                result.view_ = this.view_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(ScrollViewMsg other) {
                if (other != ScrollViewMsg.getDefaultInstance()) {
                    if (other.hasEventName()) {
                        this.bitField0_ |= ScrollViewMsg.EVENTNAME_FIELD_NUMBER;
                        this.eventName_ = other.eventName_;
                    }
                    if (other.hasEventTime()) {
                        this.bitField0_ |= ScrollViewMsg.EVENTTIME_FIELD_NUMBER;
                        this.eventTime_ = other.eventTime_;
                    }
                    if (other.hasSessionId()) {
                        this.bitField0_ |= ScrollViewMsg.APPKEY_FIELD_NUMBER;
                        this.sessionId_ = other.sessionId_;
                    }
                    if (other.hasAppKey()) {
                        this.bitField0_ |= ScrollViewMsg.SCALE_FIELD_NUMBER;
                        this.appKey_ = other.appKey_;
                    }
                    if (other.hasDeviceId()) {
                        this.bitField0_ |= 16;
                        this.deviceId_ = other.deviceId_;
                    }
                    if (other.hasPage()) {
                        this.bitField0_ |= 32;
                        this.page_ = other.page_;
                    }
                    if (other.hasDirection()) {
                        this.bitField0_ |= 64;
                        this.direction_ = other.direction_;
                    }
                    if (other.hasScale()) {
                        this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                        this.scale_ = other.scale_;
                    }
                    if (other.hasView()) {
                        mergeView(other.getView());
                    }
                    setUnknownFields(getUnknownFields().concat(other.unknownFields));
                }
                return this;
            }

            public final boolean isInitialized() {
                if (hasEventName() && hasEventTime() && hasSessionId() && hasAppKey() && hasDeviceId() && hasPage()) {
                    return true;
                }
                return false;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ScrollViewMsg parsedMessage = null;
                try {
                    parsedMessage = (ScrollViewMsg) ScrollViewMsg.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ScrollViewMsg) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
            }

            public boolean hasEventName() {
                return (this.bitField0_ & ScrollViewMsg.EVENTNAME_FIELD_NUMBER) == ScrollViewMsg.EVENTNAME_FIELD_NUMBER;
            }

            public String getEventName() {
                ByteString ref = this.eventName_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventName_ = s;
                return s;
            }

            public ByteString getEventNameBytes() {
                Object ref = this.eventName_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventName_ = b;
                return b;
            }

            public Builder setEventName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ScrollViewMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public Builder clearEventName() {
                this.bitField0_ &= -2;
                this.eventName_ = ScrollViewMsg.getDefaultInstance().getEventName();
                return this;
            }

            public Builder setEventNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ScrollViewMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public boolean hasEventTime() {
                return (this.bitField0_ & ScrollViewMsg.EVENTTIME_FIELD_NUMBER) == ScrollViewMsg.EVENTTIME_FIELD_NUMBER;
            }

            public String getEventTime() {
                ByteString ref = this.eventTime_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventTime_ = s;
                return s;
            }

            public ByteString getEventTimeBytes() {
                Object ref = this.eventTime_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventTime_ = b;
                return b;
            }

            public Builder setEventTime(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ScrollViewMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public Builder clearEventTime() {
                this.bitField0_ &= -3;
                this.eventTime_ = ScrollViewMsg.getDefaultInstance().getEventTime();
                return this;
            }

            public Builder setEventTimeBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ScrollViewMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public boolean hasSessionId() {
                return (this.bitField0_ & ScrollViewMsg.APPKEY_FIELD_NUMBER) == ScrollViewMsg.APPKEY_FIELD_NUMBER;
            }

            public String getSessionId() {
                ByteString ref = this.sessionId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.sessionId_ = s;
                return s;
            }

            public ByteString getSessionIdBytes() {
                Object ref = this.sessionId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.sessionId_ = b;
                return b;
            }

            public Builder setSessionId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ScrollViewMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -5;
                this.sessionId_ = ScrollViewMsg.getDefaultInstance().getSessionId();
                return this;
            }

            public Builder setSessionIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ScrollViewMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public boolean hasAppKey() {
                return (this.bitField0_ & ScrollViewMsg.SCALE_FIELD_NUMBER) == ScrollViewMsg.SCALE_FIELD_NUMBER;
            }

            public String getAppKey() {
                ByteString ref = this.appKey_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.appKey_ = s;
                return s;
            }

            public ByteString getAppKeyBytes() {
                Object ref = this.appKey_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.appKey_ = b;
                return b;
            }

            public Builder setAppKey(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ScrollViewMsg.SCALE_FIELD_NUMBER;
                this.appKey_ = value;
                return this;
            }

            public Builder clearAppKey() {
                this.bitField0_ &= -9;
                this.appKey_ = ScrollViewMsg.getDefaultInstance().getAppKey();
                return this;
            }

            public Builder setAppKeyBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ScrollViewMsg.SCALE_FIELD_NUMBER;
                this.appKey_ = value;
                return this;
            }

            public boolean hasDeviceId() {
                return (this.bitField0_ & 16) == 16;
            }

            public String getDeviceId() {
                ByteString ref = this.deviceId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.deviceId_ = s;
                return s;
            }

            public ByteString getDeviceIdBytes() {
                Object ref = this.deviceId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.deviceId_ = b;
                return b;
            }

            public Builder setDeviceId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public Builder clearDeviceId() {
                this.bitField0_ &= -17;
                this.deviceId_ = ScrollViewMsg.getDefaultInstance().getDeviceId();
                return this;
            }

            public Builder setDeviceIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public boolean hasPage() {
                return (this.bitField0_ & 32) == 32;
            }

            public String getPage() {
                ByteString ref = this.page_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.page_ = s;
                return s;
            }

            public ByteString getPageBytes() {
                Object ref = this.page_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.page_ = b;
                return b;
            }

            public Builder setPage(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.page_ = value;
                return this;
            }

            public Builder clearPage() {
                this.bitField0_ &= -33;
                this.page_ = ScrollViewMsg.getDefaultInstance().getPage();
                return this;
            }

            public Builder setPageBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.page_ = value;
                return this;
            }

            public boolean hasDirection() {
                return (this.bitField0_ & 64) == 64;
            }

            public String getDirection() {
                ByteString ref = this.direction_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.direction_ = s;
                return s;
            }

            public ByteString getDirectionBytes() {
                Object ref = this.direction_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.direction_ = b;
                return b;
            }

            public Builder setDirection(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.direction_ = value;
                return this;
            }

            public Builder clearDirection() {
                this.bitField0_ &= -65;
                this.direction_ = ScrollViewMsg.getDefaultInstance().getDirection();
                return this;
            }

            public Builder setDirectionBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.direction_ = value;
                return this;
            }

            public boolean hasScale() {
                return (this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT;
            }

            public String getScale() {
                ByteString ref = this.scale_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.scale_ = s;
                return s;
            }

            public ByteString getScaleBytes() {
                Object ref = this.scale_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.scale_ = b;
                return b;
            }

            public Builder setScale(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                this.scale_ = value;
                return this;
            }

            public Builder clearScale() {
                this.bitField0_ &= -129;
                this.scale_ = ScrollViewMsg.getDefaultInstance().getScale();
                return this;
            }

            public Builder setScaleBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                this.scale_ = value;
                return this;
            }

            public boolean hasView() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
            }

            public ViewItem getView() {
                return this.view_;
            }

            public Builder setView(ViewItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.view_ = value;
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                return this;
            }

            public Builder setView(Builder builderForValue) {
                this.view_ = builderForValue.build();
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                return this;
            }

            public Builder mergeView(ViewItem value) {
                if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) != AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY || this.view_ == ViewItem.getDefaultInstance()) {
                    this.view_ = value;
                } else {
                    this.view_ = ViewItem.newBuilder(this.view_).mergeFrom(value).buildPartial();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                return this;
            }

            public Builder clearView() {
                this.view_ = ViewItem.getDefaultInstance();
                this.bitField0_ &= -257;
                return this;
            }
        }

        private ScrollViewMsg(com.google.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ScrollViewMsg(boolean noInit) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static ScrollViewMsg getDefaultInstance() {
            return defaultInstance;
        }

        public ScrollViewMsg getDefaultInstanceForType() {
            return defaultInstance;
        }

        private ScrollViewMsg(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            OutputStream unknownFieldsOutput = ByteString.newOutput();
            CodedOutputStream unknownFieldsCodedOutput = CodedOutputStream.newInstance(unknownFieldsOutput);
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    ByteString bs;
                    switch (tag) {
                        case SwipeRefreshLayout.LARGE /*0*/:
                            done = true;
                            break;
                        case AppColdStartMsg.APPBUILDVERSION_FIELD_NUMBER /*10*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTNAME_FIELD_NUMBER;
                            this.eventName_ = bs;
                            break;
                        case AppColdStartMsg.BATTERYLEVEL_FIELD_NUMBER /*18*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTTIME_FIELD_NUMBER;
                            this.eventTime_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionMenuTextColor /*26*/:
                            bs = input.readBytes();
                            this.bitField0_ |= APPKEY_FIELD_NUMBER;
                            this.sessionId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionModePasteDrawable /*34*/:
                            bs = input.readBytes();
                            this.bitField0_ |= SCALE_FIELD_NUMBER;
                            this.appKey_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_dialogTheme /*42*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 16;
                            this.deviceId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_buttonBarStyle /*50*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 32;
                            this.page_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_toolbarStyle /*58*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 64;
                            this.direction_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /*66*/:
                            bs = input.readBytes();
                            this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                            this.scale_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_dropDownListViewStyle /*74*/:
                            Builder subBuilder = null;
                            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                                subBuilder = this.view_.toBuilder();
                            }
                            this.view_ = (ViewItem) input.readMessage(ViewItem.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.view_);
                                this.view_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                            break;
                        default:
                            if (!parseUnknownField(input, unknownFieldsCodedOutput, extensionRegistry, tag)) {
                                done = true;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    try {
                        unknownFieldsCodedOutput.flush();
                    } catch (IOException e3) {
                        makeExtensionsImmutable();
                    } finally {
                        this.unknownFields = unknownFieldsOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }
            }
            try {
                unknownFieldsCodedOutput.flush();
            } catch (IOException e4) {
            } finally {
                this.unknownFields = unknownFieldsOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            PARSER = new C04241();
            defaultInstance = new ScrollViewMsg(true);
            defaultInstance.initFields();
        }

        public Parser<ScrollViewMsg> getParserForType() {
            return PARSER;
        }

        public boolean hasEventName() {
            return (this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER;
        }

        public String getEventName() {
            ByteString ref = this.eventName_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventName_ = s;
            }
            return s;
        }

        public ByteString getEventNameBytes() {
            Object ref = this.eventName_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventName_ = b;
            return b;
        }

        public boolean hasEventTime() {
            return (this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER;
        }

        public String getEventTime() {
            ByteString ref = this.eventTime_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventTime_ = s;
            }
            return s;
        }

        public ByteString getEventTimeBytes() {
            Object ref = this.eventTime_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventTime_ = b;
            return b;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER;
        }

        public String getSessionId() {
            ByteString ref = this.sessionId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.sessionId_ = s;
            }
            return s;
        }

        public ByteString getSessionIdBytes() {
            Object ref = this.sessionId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.sessionId_ = b;
            return b;
        }

        public boolean hasAppKey() {
            return (this.bitField0_ & SCALE_FIELD_NUMBER) == SCALE_FIELD_NUMBER;
        }

        public String getAppKey() {
            ByteString ref = this.appKey_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.appKey_ = s;
            }
            return s;
        }

        public ByteString getAppKeyBytes() {
            Object ref = this.appKey_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.appKey_ = b;
            return b;
        }

        public boolean hasDeviceId() {
            return (this.bitField0_ & 16) == 16;
        }

        public String getDeviceId() {
            ByteString ref = this.deviceId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.deviceId_ = s;
            }
            return s;
        }

        public ByteString getDeviceIdBytes() {
            Object ref = this.deviceId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.deviceId_ = b;
            return b;
        }

        public boolean hasPage() {
            return (this.bitField0_ & 32) == 32;
        }

        public String getPage() {
            ByteString ref = this.page_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.page_ = s;
            }
            return s;
        }

        public ByteString getPageBytes() {
            Object ref = this.page_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.page_ = b;
            return b;
        }

        public boolean hasDirection() {
            return (this.bitField0_ & 64) == 64;
        }

        public String getDirection() {
            ByteString ref = this.direction_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.direction_ = s;
            }
            return s;
        }

        public ByteString getDirectionBytes() {
            Object ref = this.direction_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.direction_ = b;
            return b;
        }

        public boolean hasScale() {
            return (this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT;
        }

        public String getScale() {
            ByteString ref = this.scale_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.scale_ = s;
            }
            return s;
        }

        public ByteString getScaleBytes() {
            Object ref = this.scale_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.scale_ = b;
            return b;
        }

        public boolean hasView() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
        }

        public ViewItem getView() {
            return this.view_;
        }

        private void initFields() {
            this.eventName_ = BuildConfig.FLAVOR;
            this.eventTime_ = BuildConfig.FLAVOR;
            this.sessionId_ = BuildConfig.FLAVOR;
            this.appKey_ = BuildConfig.FLAVOR;
            this.deviceId_ = BuildConfig.FLAVOR;
            this.page_ = BuildConfig.FLAVOR;
            this.direction_ = BuildConfig.FLAVOR;
            this.scale_ = BuildConfig.FLAVOR;
            this.view_ = ViewItem.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == (byte) 1) {
                return true;
            }
            if (isInitialized == null) {
                return false;
            }
            if (!hasEventName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasEventTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasSessionId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasAppKey()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasDeviceId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (hasPage()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                output.writeBytes(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                output.writeBytes(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                output.writeBytes(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & SCALE_FIELD_NUMBER) == SCALE_FIELD_NUMBER) {
                output.writeBytes(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                output.writeBytes(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                output.writeBytes(PAGE_FIELD_NUMBER, getPageBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                output.writeBytes(DIRECTION_FIELD_NUMBER, getDirectionBytes());
            }
            if ((this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                output.writeBytes(SCALE_FIELD_NUMBER, getScaleBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                output.writeMessage(VIEW_FIELD_NUMBER, this.view_);
            }
            output.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                size = 0 + CodedOutputStream.computeBytesSize(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & SCALE_FIELD_NUMBER) == SCALE_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                size += CodedOutputStream.computeBytesSize(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                size += CodedOutputStream.computeBytesSize(PAGE_FIELD_NUMBER, getPageBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                size += CodedOutputStream.computeBytesSize(DIRECTION_FIELD_NUMBER, getDirectionBytes());
            }
            if ((this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                size += CodedOutputStream.computeBytesSize(SCALE_FIELD_NUMBER, getScaleBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                size += CodedOutputStream.computeMessageSize(VIEW_FIELD_NUMBER, this.view_);
            }
            size += this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ScrollViewMsg parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ScrollViewMsg) PARSER.parseFrom(data);
        }

        public static ScrollViewMsg parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ScrollViewMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ScrollViewMsg parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ScrollViewMsg) PARSER.parseFrom(data);
        }

        public static ScrollViewMsg parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ScrollViewMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ScrollViewMsg parseFrom(InputStream input) throws IOException {
            return (ScrollViewMsg) PARSER.parseFrom(input);
        }

        public static ScrollViewMsg parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ScrollViewMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ScrollViewMsg parseDelimitedFrom(InputStream input) throws IOException {
            return (ScrollViewMsg) PARSER.parseDelimitedFrom(input);
        }

        public static ScrollViewMsg parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ScrollViewMsg) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ScrollViewMsg parseFrom(CodedInputStream input) throws IOException {
            return (ScrollViewMsg) PARSER.parseFrom(input);
        }

        public static ScrollViewMsg parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ScrollViewMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ScrollViewMsg prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static final class UserOptionalMsg extends GeneratedMessageLite implements UserOptionalMsgOrBuilder {
        public static final int APPKEY_FIELD_NUMBER = 4;
        public static final int DEVICEID_FIELD_NUMBER = 5;
        public static final int EVENTNAME_FIELD_NUMBER = 1;
        public static final int EVENTTIME_FIELD_NUMBER = 2;
        public static final int ITEM_FIELD_NUMBER = 6;
        public static Parser<UserOptionalMsg> PARSER = null;
        public static final int SESSIONID_FIELD_NUMBER = 3;
        private static final UserOptionalMsg defaultInstance;
        private static final long serialVersionUID = 0;
        private Object appKey_;
        private int bitField0_;
        private Object deviceId_;
        private Object eventName_;
        private Object eventTime_;
        private List<MapItem> item_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sessionId_;
        private final ByteString unknownFields;

        /* renamed from: com.netease.caipiao.dcsdk.event.ProtoEvent.UserOptionalMsg.1 */
        static class C04251 extends AbstractParser<UserOptionalMsg> {
            C04251() {
            }

            public UserOptionalMsg parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new UserOptionalMsg(extensionRegistry, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<UserOptionalMsg, Builder> implements UserOptionalMsgOrBuilder {
            private Object appKey_;
            private int bitField0_;
            private Object deviceId_;
            private Object eventName_;
            private Object eventTime_;
            private List<MapItem> item_;
            private Object sessionId_;

            private Builder() {
                this.eventName_ = BuildConfig.FLAVOR;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.appKey_ = BuildConfig.FLAVOR;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.item_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.eventName_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -2;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -3;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -5;
                this.appKey_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -9;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -17;
                this.item_ = Collections.emptyList();
                this.bitField0_ &= -33;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public UserOptionalMsg getDefaultInstanceForType() {
                return UserOptionalMsg.getDefaultInstance();
            }

            public UserOptionalMsg build() {
                UserOptionalMsg result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw com.google.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(result);
            }

            public UserOptionalMsg buildPartial() {
                UserOptionalMsg result = new UserOptionalMsg(null);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & UserOptionalMsg.EVENTNAME_FIELD_NUMBER) == UserOptionalMsg.EVENTNAME_FIELD_NUMBER) {
                    to_bitField0_ = 0 | UserOptionalMsg.EVENTNAME_FIELD_NUMBER;
                }
                result.eventName_ = this.eventName_;
                if ((from_bitField0_ & UserOptionalMsg.EVENTTIME_FIELD_NUMBER) == UserOptionalMsg.EVENTTIME_FIELD_NUMBER) {
                    to_bitField0_ |= UserOptionalMsg.EVENTTIME_FIELD_NUMBER;
                }
                result.eventTime_ = this.eventTime_;
                if ((from_bitField0_ & UserOptionalMsg.APPKEY_FIELD_NUMBER) == UserOptionalMsg.APPKEY_FIELD_NUMBER) {
                    to_bitField0_ |= UserOptionalMsg.APPKEY_FIELD_NUMBER;
                }
                result.sessionId_ = this.sessionId_;
                if ((from_bitField0_ & 8) == 8) {
                    to_bitField0_ |= 8;
                }
                result.appKey_ = this.appKey_;
                if ((from_bitField0_ & 16) == 16) {
                    to_bitField0_ |= 16;
                }
                result.deviceId_ = this.deviceId_;
                if ((this.bitField0_ & 32) == 32) {
                    this.item_ = Collections.unmodifiableList(this.item_);
                    this.bitField0_ &= -33;
                }
                result.item_ = this.item_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(UserOptionalMsg other) {
                if (other != UserOptionalMsg.getDefaultInstance()) {
                    if (other.hasEventName()) {
                        this.bitField0_ |= UserOptionalMsg.EVENTNAME_FIELD_NUMBER;
                        this.eventName_ = other.eventName_;
                    }
                    if (other.hasEventTime()) {
                        this.bitField0_ |= UserOptionalMsg.EVENTTIME_FIELD_NUMBER;
                        this.eventTime_ = other.eventTime_;
                    }
                    if (other.hasSessionId()) {
                        this.bitField0_ |= UserOptionalMsg.APPKEY_FIELD_NUMBER;
                        this.sessionId_ = other.sessionId_;
                    }
                    if (other.hasAppKey()) {
                        this.bitField0_ |= 8;
                        this.appKey_ = other.appKey_;
                    }
                    if (other.hasDeviceId()) {
                        this.bitField0_ |= 16;
                        this.deviceId_ = other.deviceId_;
                    }
                    if (!other.item_.isEmpty()) {
                        if (this.item_.isEmpty()) {
                            this.item_ = other.item_;
                            this.bitField0_ &= -33;
                        } else {
                            ensureItemIsMutable();
                            this.item_.addAll(other.item_);
                        }
                    }
                    setUnknownFields(getUnknownFields().concat(other.unknownFields));
                }
                return this;
            }

            public final boolean isInitialized() {
                if (!hasEventName() || !hasEventTime() || !hasSessionId() || !hasAppKey() || !hasDeviceId()) {
                    return false;
                }
                for (int i = 0; i < getItemCount(); i += UserOptionalMsg.EVENTNAME_FIELD_NUMBER) {
                    if (!getItem(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                UserOptionalMsg parsedMessage = null;
                try {
                    parsedMessage = (UserOptionalMsg) UserOptionalMsg.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (UserOptionalMsg) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
            }

            public boolean hasEventName() {
                return (this.bitField0_ & UserOptionalMsg.EVENTNAME_FIELD_NUMBER) == UserOptionalMsg.EVENTNAME_FIELD_NUMBER;
            }

            public String getEventName() {
                ByteString ref = this.eventName_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventName_ = s;
                return s;
            }

            public ByteString getEventNameBytes() {
                Object ref = this.eventName_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventName_ = b;
                return b;
            }

            public Builder setEventName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= UserOptionalMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public Builder clearEventName() {
                this.bitField0_ &= -2;
                this.eventName_ = UserOptionalMsg.getDefaultInstance().getEventName();
                return this;
            }

            public Builder setEventNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= UserOptionalMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public boolean hasEventTime() {
                return (this.bitField0_ & UserOptionalMsg.EVENTTIME_FIELD_NUMBER) == UserOptionalMsg.EVENTTIME_FIELD_NUMBER;
            }

            public String getEventTime() {
                ByteString ref = this.eventTime_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventTime_ = s;
                return s;
            }

            public ByteString getEventTimeBytes() {
                Object ref = this.eventTime_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventTime_ = b;
                return b;
            }

            public Builder setEventTime(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= UserOptionalMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public Builder clearEventTime() {
                this.bitField0_ &= -3;
                this.eventTime_ = UserOptionalMsg.getDefaultInstance().getEventTime();
                return this;
            }

            public Builder setEventTimeBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= UserOptionalMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public boolean hasSessionId() {
                return (this.bitField0_ & UserOptionalMsg.APPKEY_FIELD_NUMBER) == UserOptionalMsg.APPKEY_FIELD_NUMBER;
            }

            public String getSessionId() {
                ByteString ref = this.sessionId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.sessionId_ = s;
                return s;
            }

            public ByteString getSessionIdBytes() {
                Object ref = this.sessionId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.sessionId_ = b;
                return b;
            }

            public Builder setSessionId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= UserOptionalMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -5;
                this.sessionId_ = UserOptionalMsg.getDefaultInstance().getSessionId();
                return this;
            }

            public Builder setSessionIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= UserOptionalMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public boolean hasAppKey() {
                return (this.bitField0_ & 8) == 8;
            }

            public String getAppKey() {
                ByteString ref = this.appKey_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.appKey_ = s;
                return s;
            }

            public ByteString getAppKeyBytes() {
                Object ref = this.appKey_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.appKey_ = b;
                return b;
            }

            public Builder setAppKey(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.appKey_ = value;
                return this;
            }

            public Builder clearAppKey() {
                this.bitField0_ &= -9;
                this.appKey_ = UserOptionalMsg.getDefaultInstance().getAppKey();
                return this;
            }

            public Builder setAppKeyBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.appKey_ = value;
                return this;
            }

            public boolean hasDeviceId() {
                return (this.bitField0_ & 16) == 16;
            }

            public String getDeviceId() {
                ByteString ref = this.deviceId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.deviceId_ = s;
                return s;
            }

            public ByteString getDeviceIdBytes() {
                Object ref = this.deviceId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.deviceId_ = b;
                return b;
            }

            public Builder setDeviceId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public Builder clearDeviceId() {
                this.bitField0_ &= -17;
                this.deviceId_ = UserOptionalMsg.getDefaultInstance().getDeviceId();
                return this;
            }

            public Builder setDeviceIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            private void ensureItemIsMutable() {
                if ((this.bitField0_ & 32) != 32) {
                    this.item_ = new ArrayList(this.item_);
                    this.bitField0_ |= 32;
                }
            }

            public List<MapItem> getItemList() {
                return Collections.unmodifiableList(this.item_);
            }

            public int getItemCount() {
                return this.item_.size();
            }

            public MapItem getItem(int index) {
                return (MapItem) this.item_.get(index);
            }

            public Builder setItem(int index, MapItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemIsMutable();
                this.item_.set(index, value);
                return this;
            }

            public Builder setItem(int index, Builder builderForValue) {
                ensureItemIsMutable();
                this.item_.set(index, builderForValue.build());
                return this;
            }

            public Builder addItem(MapItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemIsMutable();
                this.item_.add(value);
                return this;
            }

            public Builder addItem(int index, MapItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemIsMutable();
                this.item_.add(index, value);
                return this;
            }

            public Builder addItem(Builder builderForValue) {
                ensureItemIsMutable();
                this.item_.add(builderForValue.build());
                return this;
            }

            public Builder addItem(int index, Builder builderForValue) {
                ensureItemIsMutable();
                this.item_.add(index, builderForValue.build());
                return this;
            }

            public Builder addAllItem(Iterable<? extends MapItem> values) {
                ensureItemIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.item_);
                return this;
            }

            public Builder clearItem() {
                this.item_ = Collections.emptyList();
                this.bitField0_ &= -33;
                return this;
            }

            public Builder removeItem(int index) {
                ensureItemIsMutable();
                this.item_.remove(index);
                return this;
            }
        }

        private UserOptionalMsg(com.google.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private UserOptionalMsg(boolean noInit) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static UserOptionalMsg getDefaultInstance() {
            return defaultInstance;
        }

        public UserOptionalMsg getDefaultInstanceForType() {
            return defaultInstance;
        }

        private UserOptionalMsg(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            OutputStream unknownFieldsOutput = ByteString.newOutput();
            CodedOutputStream unknownFieldsCodedOutput = CodedOutputStream.newInstance(unknownFieldsOutput);
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    ByteString bs;
                    switch (tag) {
                        case SwipeRefreshLayout.LARGE /*0*/:
                            done = true;
                            break;
                        case AppColdStartMsg.APPBUILDVERSION_FIELD_NUMBER /*10*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTNAME_FIELD_NUMBER;
                            this.eventName_ = bs;
                            break;
                        case AppColdStartMsg.BATTERYLEVEL_FIELD_NUMBER /*18*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTTIME_FIELD_NUMBER;
                            this.eventTime_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionMenuTextColor /*26*/:
                            bs = input.readBytes();
                            this.bitField0_ |= APPKEY_FIELD_NUMBER;
                            this.sessionId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionModePasteDrawable /*34*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 8;
                            this.appKey_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_dialogTheme /*42*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 16;
                            this.deviceId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_buttonBarStyle /*50*/:
                            if ((mutable_bitField0_ & 32) != 32) {
                                this.item_ = new ArrayList();
                                mutable_bitField0_ |= 32;
                            }
                            this.item_.add(input.readMessage(MapItem.PARSER, extensionRegistry));
                            break;
                        default:
                            if (!parseUnknownField(input, unknownFieldsCodedOutput, extensionRegistry, tag)) {
                                done = true;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if ((mutable_bitField0_ & 32) == 32) {
                        this.item_ = Collections.unmodifiableList(this.item_);
                    }
                    try {
                        unknownFieldsCodedOutput.flush();
                    } catch (IOException e3) {
                        makeExtensionsImmutable();
                    } finally {
                        this.unknownFields = unknownFieldsOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }
            }
            if ((mutable_bitField0_ & 32) == 32) {
                this.item_ = Collections.unmodifiableList(this.item_);
            }
            try {
                unknownFieldsCodedOutput.flush();
            } catch (IOException e4) {
            } finally {
                this.unknownFields = unknownFieldsOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            PARSER = new C04251();
            defaultInstance = new UserOptionalMsg(true);
            defaultInstance.initFields();
        }

        public Parser<UserOptionalMsg> getParserForType() {
            return PARSER;
        }

        public boolean hasEventName() {
            return (this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER;
        }

        public String getEventName() {
            ByteString ref = this.eventName_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventName_ = s;
            }
            return s;
        }

        public ByteString getEventNameBytes() {
            Object ref = this.eventName_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventName_ = b;
            return b;
        }

        public boolean hasEventTime() {
            return (this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER;
        }

        public String getEventTime() {
            ByteString ref = this.eventTime_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventTime_ = s;
            }
            return s;
        }

        public ByteString getEventTimeBytes() {
            Object ref = this.eventTime_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventTime_ = b;
            return b;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER;
        }

        public String getSessionId() {
            ByteString ref = this.sessionId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.sessionId_ = s;
            }
            return s;
        }

        public ByteString getSessionIdBytes() {
            Object ref = this.sessionId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.sessionId_ = b;
            return b;
        }

        public boolean hasAppKey() {
            return (this.bitField0_ & 8) == 8;
        }

        public String getAppKey() {
            ByteString ref = this.appKey_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.appKey_ = s;
            }
            return s;
        }

        public ByteString getAppKeyBytes() {
            Object ref = this.appKey_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.appKey_ = b;
            return b;
        }

        public boolean hasDeviceId() {
            return (this.bitField0_ & 16) == 16;
        }

        public String getDeviceId() {
            ByteString ref = this.deviceId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.deviceId_ = s;
            }
            return s;
        }

        public ByteString getDeviceIdBytes() {
            Object ref = this.deviceId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.deviceId_ = b;
            return b;
        }

        public List<MapItem> getItemList() {
            return this.item_;
        }

        public List<? extends MapItemOrBuilder> getItemOrBuilderList() {
            return this.item_;
        }

        public int getItemCount() {
            return this.item_.size();
        }

        public MapItem getItem(int index) {
            return (MapItem) this.item_.get(index);
        }

        public MapItemOrBuilder getItemOrBuilder(int index) {
            return (MapItemOrBuilder) this.item_.get(index);
        }

        private void initFields() {
            this.eventName_ = BuildConfig.FLAVOR;
            this.eventTime_ = BuildConfig.FLAVOR;
            this.sessionId_ = BuildConfig.FLAVOR;
            this.appKey_ = BuildConfig.FLAVOR;
            this.deviceId_ = BuildConfig.FLAVOR;
            this.item_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == (byte) 1) {
                return true;
            }
            if (isInitialized == null) {
                return false;
            }
            if (!hasEventName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasEventTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasSessionId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasAppKey()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (hasDeviceId()) {
                int i = 0;
                while (i < getItemCount()) {
                    if (getItem(i).isInitialized()) {
                        i += EVENTNAME_FIELD_NUMBER;
                    } else {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                output.writeBytes(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                output.writeBytes(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                output.writeBytes(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                output.writeBytes(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                output.writeBytes(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            for (int i = 0; i < this.item_.size(); i += EVENTNAME_FIELD_NUMBER) {
                output.writeMessage(ITEM_FIELD_NUMBER, (MessageLite) this.item_.get(i));
            }
            output.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                size = 0 + CodedOutputStream.computeBytesSize(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                size += CodedOutputStream.computeBytesSize(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                size += CodedOutputStream.computeBytesSize(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            for (int i = 0; i < this.item_.size(); i += EVENTNAME_FIELD_NUMBER) {
                size += CodedOutputStream.computeMessageSize(ITEM_FIELD_NUMBER, (MessageLite) this.item_.get(i));
            }
            size += this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static UserOptionalMsg parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (UserOptionalMsg) PARSER.parseFrom(data);
        }

        public static UserOptionalMsg parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UserOptionalMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static UserOptionalMsg parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (UserOptionalMsg) PARSER.parseFrom(data);
        }

        public static UserOptionalMsg parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UserOptionalMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static UserOptionalMsg parseFrom(InputStream input) throws IOException {
            return (UserOptionalMsg) PARSER.parseFrom(input);
        }

        public static UserOptionalMsg parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UserOptionalMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static UserOptionalMsg parseDelimitedFrom(InputStream input) throws IOException {
            return (UserOptionalMsg) PARSER.parseDelimitedFrom(input);
        }

        public static UserOptionalMsg parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UserOptionalMsg) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static UserOptionalMsg parseFrom(CodedInputStream input) throws IOException {
            return (UserOptionalMsg) PARSER.parseFrom(input);
        }

        public static UserOptionalMsg parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UserOptionalMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(UserOptionalMsg prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static final class ViewItem extends GeneratedMessageLite implements ViewItemOrBuilder {
        public static final int FRAME_FIELD_NUMBER = 3;
        public static Parser<ViewItem> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 4;
        public static final int VIEWCLASS_FIELD_NUMBER = 1;
        private static final ViewItem defaultInstance;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Object frame_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object path_;
        private Object title_;
        private final ByteString unknownFields;
        private Object viewClass_;

        /* renamed from: com.netease.caipiao.dcsdk.event.ProtoEvent.ViewItem.1 */
        static class C04261 extends AbstractParser<ViewItem> {
            C04261() {
            }

            public ViewItem parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ViewItem(extensionRegistry, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<ViewItem, Builder> implements ViewItemOrBuilder {
            private int bitField0_;
            private Object frame_;
            private Object path_;
            private Object title_;
            private Object viewClass_;

            private Builder() {
                this.viewClass_ = BuildConfig.FLAVOR;
                this.path_ = BuildConfig.FLAVOR;
                this.frame_ = BuildConfig.FLAVOR;
                this.title_ = BuildConfig.FLAVOR;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.viewClass_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -2;
                this.path_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -3;
                this.frame_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -5;
                this.title_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -9;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public ViewItem getDefaultInstanceForType() {
                return ViewItem.getDefaultInstance();
            }

            public ViewItem build() {
                ViewItem result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw com.google.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(result);
            }

            public ViewItem buildPartial() {
                ViewItem result = new ViewItem(null);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & ViewItem.VIEWCLASS_FIELD_NUMBER) == ViewItem.VIEWCLASS_FIELD_NUMBER) {
                    to_bitField0_ = 0 | ViewItem.VIEWCLASS_FIELD_NUMBER;
                }
                result.viewClass_ = this.viewClass_;
                if ((from_bitField0_ & ViewItem.PATH_FIELD_NUMBER) == ViewItem.PATH_FIELD_NUMBER) {
                    to_bitField0_ |= ViewItem.PATH_FIELD_NUMBER;
                }
                result.path_ = this.path_;
                if ((from_bitField0_ & ViewItem.TITLE_FIELD_NUMBER) == ViewItem.TITLE_FIELD_NUMBER) {
                    to_bitField0_ |= ViewItem.TITLE_FIELD_NUMBER;
                }
                result.frame_ = this.frame_;
                if ((from_bitField0_ & 8) == 8) {
                    to_bitField0_ |= 8;
                }
                result.title_ = this.title_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(ViewItem other) {
                if (other != ViewItem.getDefaultInstance()) {
                    if (other.hasViewClass()) {
                        this.bitField0_ |= ViewItem.VIEWCLASS_FIELD_NUMBER;
                        this.viewClass_ = other.viewClass_;
                    }
                    if (other.hasPath()) {
                        this.bitField0_ |= ViewItem.PATH_FIELD_NUMBER;
                        this.path_ = other.path_;
                    }
                    if (other.hasFrame()) {
                        this.bitField0_ |= ViewItem.TITLE_FIELD_NUMBER;
                        this.frame_ = other.frame_;
                    }
                    if (other.hasTitle()) {
                        this.bitField0_ |= 8;
                        this.title_ = other.title_;
                    }
                    setUnknownFields(getUnknownFields().concat(other.unknownFields));
                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ViewItem parsedMessage = null;
                try {
                    parsedMessage = (ViewItem) ViewItem.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ViewItem) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
            }

            public boolean hasViewClass() {
                return (this.bitField0_ & ViewItem.VIEWCLASS_FIELD_NUMBER) == ViewItem.VIEWCLASS_FIELD_NUMBER;
            }

            public String getViewClass() {
                ByteString ref = this.viewClass_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.viewClass_ = s;
                return s;
            }

            public ByteString getViewClassBytes() {
                Object ref = this.viewClass_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.viewClass_ = b;
                return b;
            }

            public Builder setViewClass(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ViewItem.VIEWCLASS_FIELD_NUMBER;
                this.viewClass_ = value;
                return this;
            }

            public Builder clearViewClass() {
                this.bitField0_ &= -2;
                this.viewClass_ = ViewItem.getDefaultInstance().getViewClass();
                return this;
            }

            public Builder setViewClassBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ViewItem.VIEWCLASS_FIELD_NUMBER;
                this.viewClass_ = value;
                return this;
            }

            public boolean hasPath() {
                return (this.bitField0_ & ViewItem.PATH_FIELD_NUMBER) == ViewItem.PATH_FIELD_NUMBER;
            }

            public String getPath() {
                ByteString ref = this.path_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.path_ = s;
                return s;
            }

            public ByteString getPathBytes() {
                Object ref = this.path_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.path_ = b;
                return b;
            }

            public Builder setPath(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ViewItem.PATH_FIELD_NUMBER;
                this.path_ = value;
                return this;
            }

            public Builder clearPath() {
                this.bitField0_ &= -3;
                this.path_ = ViewItem.getDefaultInstance().getPath();
                return this;
            }

            public Builder setPathBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ViewItem.PATH_FIELD_NUMBER;
                this.path_ = value;
                return this;
            }

            public boolean hasFrame() {
                return (this.bitField0_ & ViewItem.TITLE_FIELD_NUMBER) == ViewItem.TITLE_FIELD_NUMBER;
            }

            public String getFrame() {
                ByteString ref = this.frame_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.frame_ = s;
                return s;
            }

            public ByteString getFrameBytes() {
                Object ref = this.frame_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.frame_ = b;
                return b;
            }

            public Builder setFrame(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ViewItem.TITLE_FIELD_NUMBER;
                this.frame_ = value;
                return this;
            }

            public Builder clearFrame() {
                this.bitField0_ &= -5;
                this.frame_ = ViewItem.getDefaultInstance().getFrame();
                return this;
            }

            public Builder setFrameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ViewItem.TITLE_FIELD_NUMBER;
                this.frame_ = value;
                return this;
            }

            public boolean hasTitle() {
                return (this.bitField0_ & 8) == 8;
            }

            public String getTitle() {
                ByteString ref = this.title_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.title_ = s;
                return s;
            }

            public ByteString getTitleBytes() {
                Object ref = this.title_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.title_ = b;
                return b;
            }

            public Builder setTitle(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.title_ = value;
                return this;
            }

            public Builder clearTitle() {
                this.bitField0_ &= -9;
                this.title_ = ViewItem.getDefaultInstance().getTitle();
                return this;
            }

            public Builder setTitleBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.title_ = value;
                return this;
            }
        }

        private ViewItem(com.google.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ViewItem(boolean noInit) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static ViewItem getDefaultInstance() {
            return defaultInstance;
        }

        public ViewItem getDefaultInstanceForType() {
            return defaultInstance;
        }

        private ViewItem(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            OutputStream unknownFieldsOutput = ByteString.newOutput();
            CodedOutputStream unknownFieldsCodedOutput = CodedOutputStream.newInstance(unknownFieldsOutput);
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    ByteString bs;
                    switch (tag) {
                        case SwipeRefreshLayout.LARGE /*0*/:
                            done = true;
                            break;
                        case AppColdStartMsg.APPBUILDVERSION_FIELD_NUMBER /*10*/:
                            bs = input.readBytes();
                            this.bitField0_ |= VIEWCLASS_FIELD_NUMBER;
                            this.viewClass_ = bs;
                            break;
                        case AppColdStartMsg.BATTERYLEVEL_FIELD_NUMBER /*18*/:
                            bs = input.readBytes();
                            this.bitField0_ |= PATH_FIELD_NUMBER;
                            this.path_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionMenuTextColor /*26*/:
                            bs = input.readBytes();
                            this.bitField0_ |= TITLE_FIELD_NUMBER;
                            this.frame_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionModePasteDrawable /*34*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 8;
                            this.title_ = bs;
                            break;
                        default:
                            if (!parseUnknownField(input, unknownFieldsCodedOutput, extensionRegistry, tag)) {
                                done = true;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    try {
                        unknownFieldsCodedOutput.flush();
                    } catch (IOException e3) {
                        makeExtensionsImmutable();
                    } finally {
                        this.unknownFields = unknownFieldsOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }
            }
            try {
                unknownFieldsCodedOutput.flush();
            } catch (IOException e4) {
            } finally {
                this.unknownFields = unknownFieldsOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            PARSER = new C04261();
            defaultInstance = new ViewItem(true);
            defaultInstance.initFields();
        }

        public Parser<ViewItem> getParserForType() {
            return PARSER;
        }

        public boolean hasViewClass() {
            return (this.bitField0_ & VIEWCLASS_FIELD_NUMBER) == VIEWCLASS_FIELD_NUMBER;
        }

        public String getViewClass() {
            ByteString ref = this.viewClass_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.viewClass_ = s;
            }
            return s;
        }

        public ByteString getViewClassBytes() {
            Object ref = this.viewClass_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.viewClass_ = b;
            return b;
        }

        public boolean hasPath() {
            return (this.bitField0_ & PATH_FIELD_NUMBER) == PATH_FIELD_NUMBER;
        }

        public String getPath() {
            ByteString ref = this.path_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.path_ = s;
            }
            return s;
        }

        public ByteString getPathBytes() {
            Object ref = this.path_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.path_ = b;
            return b;
        }

        public boolean hasFrame() {
            return (this.bitField0_ & TITLE_FIELD_NUMBER) == TITLE_FIELD_NUMBER;
        }

        public String getFrame() {
            ByteString ref = this.frame_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.frame_ = s;
            }
            return s;
        }

        public ByteString getFrameBytes() {
            Object ref = this.frame_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.frame_ = b;
            return b;
        }

        public boolean hasTitle() {
            return (this.bitField0_ & 8) == 8;
        }

        public String getTitle() {
            ByteString ref = this.title_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.title_ = s;
            }
            return s;
        }

        public ByteString getTitleBytes() {
            Object ref = this.title_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.title_ = b;
            return b;
        }

        private void initFields() {
            this.viewClass_ = BuildConfig.FLAVOR;
            this.path_ = BuildConfig.FLAVOR;
            this.frame_ = BuildConfig.FLAVOR;
            this.title_ = BuildConfig.FLAVOR;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == (byte) 1) {
                return true;
            }
            if (isInitialized == null) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & VIEWCLASS_FIELD_NUMBER) == VIEWCLASS_FIELD_NUMBER) {
                output.writeBytes(VIEWCLASS_FIELD_NUMBER, getViewClassBytes());
            }
            if ((this.bitField0_ & PATH_FIELD_NUMBER) == PATH_FIELD_NUMBER) {
                output.writeBytes(PATH_FIELD_NUMBER, getPathBytes());
            }
            if ((this.bitField0_ & TITLE_FIELD_NUMBER) == TITLE_FIELD_NUMBER) {
                output.writeBytes(FRAME_FIELD_NUMBER, getFrameBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                output.writeBytes(TITLE_FIELD_NUMBER, getTitleBytes());
            }
            output.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & VIEWCLASS_FIELD_NUMBER) == VIEWCLASS_FIELD_NUMBER) {
                size = 0 + CodedOutputStream.computeBytesSize(VIEWCLASS_FIELD_NUMBER, getViewClassBytes());
            }
            if ((this.bitField0_ & PATH_FIELD_NUMBER) == PATH_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(PATH_FIELD_NUMBER, getPathBytes());
            }
            if ((this.bitField0_ & TITLE_FIELD_NUMBER) == TITLE_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(FRAME_FIELD_NUMBER, getFrameBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                size += CodedOutputStream.computeBytesSize(TITLE_FIELD_NUMBER, getTitleBytes());
            }
            size += this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ViewItem parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ViewItem) PARSER.parseFrom(data);
        }

        public static ViewItem parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ViewItem) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ViewItem parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ViewItem) PARSER.parseFrom(data);
        }

        public static ViewItem parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ViewItem) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ViewItem parseFrom(InputStream input) throws IOException {
            return (ViewItem) PARSER.parseFrom(input);
        }

        public static ViewItem parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ViewItem) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ViewItem parseDelimitedFrom(InputStream input) throws IOException {
            return (ViewItem) PARSER.parseDelimitedFrom(input);
        }

        public static ViewItem parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ViewItem) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ViewItem parseFrom(CodedInputStream input) throws IOException {
            return (ViewItem) PARSER.parseFrom(input);
        }

        public static ViewItem parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ViewItem) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ViewItem prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static final class ViewScrollMsg extends GeneratedMessageLite implements ViewScrollMsgOrBuilder {
        public static final int APPKEY_FIELD_NUMBER = 4;
        public static final int DEVICEID_FIELD_NUMBER = 5;
        public static final int DIRECTION_FIELD_NUMBER = 7;
        public static final int EVENTNAME_FIELD_NUMBER = 1;
        public static final int EVENTTIME_FIELD_NUMBER = 2;
        public static final int PAGE_FIELD_NUMBER = 6;
        public static Parser<ViewScrollMsg> PARSER = null;
        public static final int SESSIONID_FIELD_NUMBER = 3;
        private static final ViewScrollMsg defaultInstance;
        private static final long serialVersionUID = 0;
        private Object appKey_;
        private int bitField0_;
        private Object deviceId_;
        private Object direction_;
        private Object eventName_;
        private Object eventTime_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object page_;
        private Object sessionId_;
        private final ByteString unknownFields;

        /* renamed from: com.netease.caipiao.dcsdk.event.ProtoEvent.ViewScrollMsg.1 */
        static class C04271 extends AbstractParser<ViewScrollMsg> {
            C04271() {
            }

            public ViewScrollMsg parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ViewScrollMsg(extensionRegistry, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<ViewScrollMsg, Builder> implements ViewScrollMsgOrBuilder {
            private Object appKey_;
            private int bitField0_;
            private Object deviceId_;
            private Object direction_;
            private Object eventName_;
            private Object eventTime_;
            private Object page_;
            private Object sessionId_;

            private Builder() {
                this.eventName_ = BuildConfig.FLAVOR;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.appKey_ = BuildConfig.FLAVOR;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.page_ = BuildConfig.FLAVOR;
                this.direction_ = BuildConfig.FLAVOR;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.eventName_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -2;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -3;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -5;
                this.appKey_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -9;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -17;
                this.page_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -33;
                this.direction_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -65;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public ViewScrollMsg getDefaultInstanceForType() {
                return ViewScrollMsg.getDefaultInstance();
            }

            public ViewScrollMsg build() {
                ViewScrollMsg result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw com.google.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(result);
            }

            public ViewScrollMsg buildPartial() {
                ViewScrollMsg result = new ViewScrollMsg(null);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & ViewScrollMsg.EVENTNAME_FIELD_NUMBER) == ViewScrollMsg.EVENTNAME_FIELD_NUMBER) {
                    to_bitField0_ = 0 | ViewScrollMsg.EVENTNAME_FIELD_NUMBER;
                }
                result.eventName_ = this.eventName_;
                if ((from_bitField0_ & ViewScrollMsg.EVENTTIME_FIELD_NUMBER) == ViewScrollMsg.EVENTTIME_FIELD_NUMBER) {
                    to_bitField0_ |= ViewScrollMsg.EVENTTIME_FIELD_NUMBER;
                }
                result.eventTime_ = this.eventTime_;
                if ((from_bitField0_ & ViewScrollMsg.APPKEY_FIELD_NUMBER) == ViewScrollMsg.APPKEY_FIELD_NUMBER) {
                    to_bitField0_ |= ViewScrollMsg.APPKEY_FIELD_NUMBER;
                }
                result.sessionId_ = this.sessionId_;
                if ((from_bitField0_ & 8) == 8) {
                    to_bitField0_ |= 8;
                }
                result.appKey_ = this.appKey_;
                if ((from_bitField0_ & 16) == 16) {
                    to_bitField0_ |= 16;
                }
                result.deviceId_ = this.deviceId_;
                if ((from_bitField0_ & 32) == 32) {
                    to_bitField0_ |= 32;
                }
                result.page_ = this.page_;
                if ((from_bitField0_ & 64) == 64) {
                    to_bitField0_ |= 64;
                }
                result.direction_ = this.direction_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(ViewScrollMsg other) {
                if (other != ViewScrollMsg.getDefaultInstance()) {
                    if (other.hasEventName()) {
                        this.bitField0_ |= ViewScrollMsg.EVENTNAME_FIELD_NUMBER;
                        this.eventName_ = other.eventName_;
                    }
                    if (other.hasEventTime()) {
                        this.bitField0_ |= ViewScrollMsg.EVENTTIME_FIELD_NUMBER;
                        this.eventTime_ = other.eventTime_;
                    }
                    if (other.hasSessionId()) {
                        this.bitField0_ |= ViewScrollMsg.APPKEY_FIELD_NUMBER;
                        this.sessionId_ = other.sessionId_;
                    }
                    if (other.hasAppKey()) {
                        this.bitField0_ |= 8;
                        this.appKey_ = other.appKey_;
                    }
                    if (other.hasDeviceId()) {
                        this.bitField0_ |= 16;
                        this.deviceId_ = other.deviceId_;
                    }
                    if (other.hasPage()) {
                        this.bitField0_ |= 32;
                        this.page_ = other.page_;
                    }
                    if (other.hasDirection()) {
                        this.bitField0_ |= 64;
                        this.direction_ = other.direction_;
                    }
                    setUnknownFields(getUnknownFields().concat(other.unknownFields));
                }
                return this;
            }

            public final boolean isInitialized() {
                if (hasEventName() && hasEventTime() && hasSessionId() && hasAppKey() && hasDeviceId() && hasPage()) {
                    return true;
                }
                return false;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ViewScrollMsg parsedMessage = null;
                try {
                    parsedMessage = (ViewScrollMsg) ViewScrollMsg.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ViewScrollMsg) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
            }

            public boolean hasEventName() {
                return (this.bitField0_ & ViewScrollMsg.EVENTNAME_FIELD_NUMBER) == ViewScrollMsg.EVENTNAME_FIELD_NUMBER;
            }

            public String getEventName() {
                ByteString ref = this.eventName_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventName_ = s;
                return s;
            }

            public ByteString getEventNameBytes() {
                Object ref = this.eventName_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventName_ = b;
                return b;
            }

            public Builder setEventName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ViewScrollMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public Builder clearEventName() {
                this.bitField0_ &= -2;
                this.eventName_ = ViewScrollMsg.getDefaultInstance().getEventName();
                return this;
            }

            public Builder setEventNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ViewScrollMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public boolean hasEventTime() {
                return (this.bitField0_ & ViewScrollMsg.EVENTTIME_FIELD_NUMBER) == ViewScrollMsg.EVENTTIME_FIELD_NUMBER;
            }

            public String getEventTime() {
                ByteString ref = this.eventTime_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventTime_ = s;
                return s;
            }

            public ByteString getEventTimeBytes() {
                Object ref = this.eventTime_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventTime_ = b;
                return b;
            }

            public Builder setEventTime(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ViewScrollMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public Builder clearEventTime() {
                this.bitField0_ &= -3;
                this.eventTime_ = ViewScrollMsg.getDefaultInstance().getEventTime();
                return this;
            }

            public Builder setEventTimeBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ViewScrollMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public boolean hasSessionId() {
                return (this.bitField0_ & ViewScrollMsg.APPKEY_FIELD_NUMBER) == ViewScrollMsg.APPKEY_FIELD_NUMBER;
            }

            public String getSessionId() {
                ByteString ref = this.sessionId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.sessionId_ = s;
                return s;
            }

            public ByteString getSessionIdBytes() {
                Object ref = this.sessionId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.sessionId_ = b;
                return b;
            }

            public Builder setSessionId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ViewScrollMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -5;
                this.sessionId_ = ViewScrollMsg.getDefaultInstance().getSessionId();
                return this;
            }

            public Builder setSessionIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= ViewScrollMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public boolean hasAppKey() {
                return (this.bitField0_ & 8) == 8;
            }

            public String getAppKey() {
                ByteString ref = this.appKey_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.appKey_ = s;
                return s;
            }

            public ByteString getAppKeyBytes() {
                Object ref = this.appKey_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.appKey_ = b;
                return b;
            }

            public Builder setAppKey(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.appKey_ = value;
                return this;
            }

            public Builder clearAppKey() {
                this.bitField0_ &= -9;
                this.appKey_ = ViewScrollMsg.getDefaultInstance().getAppKey();
                return this;
            }

            public Builder setAppKeyBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.appKey_ = value;
                return this;
            }

            public boolean hasDeviceId() {
                return (this.bitField0_ & 16) == 16;
            }

            public String getDeviceId() {
                ByteString ref = this.deviceId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.deviceId_ = s;
                return s;
            }

            public ByteString getDeviceIdBytes() {
                Object ref = this.deviceId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.deviceId_ = b;
                return b;
            }

            public Builder setDeviceId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public Builder clearDeviceId() {
                this.bitField0_ &= -17;
                this.deviceId_ = ViewScrollMsg.getDefaultInstance().getDeviceId();
                return this;
            }

            public Builder setDeviceIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public boolean hasPage() {
                return (this.bitField0_ & 32) == 32;
            }

            public String getPage() {
                ByteString ref = this.page_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.page_ = s;
                return s;
            }

            public ByteString getPageBytes() {
                Object ref = this.page_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.page_ = b;
                return b;
            }

            public Builder setPage(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.page_ = value;
                return this;
            }

            public Builder clearPage() {
                this.bitField0_ &= -33;
                this.page_ = ViewScrollMsg.getDefaultInstance().getPage();
                return this;
            }

            public Builder setPageBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.page_ = value;
                return this;
            }

            public boolean hasDirection() {
                return (this.bitField0_ & 64) == 64;
            }

            public String getDirection() {
                ByteString ref = this.direction_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.direction_ = s;
                return s;
            }

            public ByteString getDirectionBytes() {
                Object ref = this.direction_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.direction_ = b;
                return b;
            }

            public Builder setDirection(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.direction_ = value;
                return this;
            }

            public Builder clearDirection() {
                this.bitField0_ &= -65;
                this.direction_ = ViewScrollMsg.getDefaultInstance().getDirection();
                return this;
            }

            public Builder setDirectionBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.direction_ = value;
                return this;
            }
        }

        private ViewScrollMsg(com.google.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ViewScrollMsg(boolean noInit) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static ViewScrollMsg getDefaultInstance() {
            return defaultInstance;
        }

        public ViewScrollMsg getDefaultInstanceForType() {
            return defaultInstance;
        }

        private ViewScrollMsg(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            OutputStream unknownFieldsOutput = ByteString.newOutput();
            CodedOutputStream unknownFieldsCodedOutput = CodedOutputStream.newInstance(unknownFieldsOutput);
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    ByteString bs;
                    switch (tag) {
                        case SwipeRefreshLayout.LARGE /*0*/:
                            done = true;
                            break;
                        case AppColdStartMsg.APPBUILDVERSION_FIELD_NUMBER /*10*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTNAME_FIELD_NUMBER;
                            this.eventName_ = bs;
                            break;
                        case AppColdStartMsg.BATTERYLEVEL_FIELD_NUMBER /*18*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTTIME_FIELD_NUMBER;
                            this.eventTime_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionMenuTextColor /*26*/:
                            bs = input.readBytes();
                            this.bitField0_ |= APPKEY_FIELD_NUMBER;
                            this.sessionId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionModePasteDrawable /*34*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 8;
                            this.appKey_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_dialogTheme /*42*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 16;
                            this.deviceId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_buttonBarStyle /*50*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 32;
                            this.page_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_toolbarStyle /*58*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 64;
                            this.direction_ = bs;
                            break;
                        default:
                            if (!parseUnknownField(input, unknownFieldsCodedOutput, extensionRegistry, tag)) {
                                done = true;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    try {
                        unknownFieldsCodedOutput.flush();
                    } catch (IOException e3) {
                        makeExtensionsImmutable();
                    } finally {
                        this.unknownFields = unknownFieldsOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }
            }
            try {
                unknownFieldsCodedOutput.flush();
            } catch (IOException e4) {
            } finally {
                this.unknownFields = unknownFieldsOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            PARSER = new C04271();
            defaultInstance = new ViewScrollMsg(true);
            defaultInstance.initFields();
        }

        public Parser<ViewScrollMsg> getParserForType() {
            return PARSER;
        }

        public boolean hasEventName() {
            return (this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER;
        }

        public String getEventName() {
            ByteString ref = this.eventName_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventName_ = s;
            }
            return s;
        }

        public ByteString getEventNameBytes() {
            Object ref = this.eventName_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventName_ = b;
            return b;
        }

        public boolean hasEventTime() {
            return (this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER;
        }

        public String getEventTime() {
            ByteString ref = this.eventTime_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventTime_ = s;
            }
            return s;
        }

        public ByteString getEventTimeBytes() {
            Object ref = this.eventTime_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventTime_ = b;
            return b;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER;
        }

        public String getSessionId() {
            ByteString ref = this.sessionId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.sessionId_ = s;
            }
            return s;
        }

        public ByteString getSessionIdBytes() {
            Object ref = this.sessionId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.sessionId_ = b;
            return b;
        }

        public boolean hasAppKey() {
            return (this.bitField0_ & 8) == 8;
        }

        public String getAppKey() {
            ByteString ref = this.appKey_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.appKey_ = s;
            }
            return s;
        }

        public ByteString getAppKeyBytes() {
            Object ref = this.appKey_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.appKey_ = b;
            return b;
        }

        public boolean hasDeviceId() {
            return (this.bitField0_ & 16) == 16;
        }

        public String getDeviceId() {
            ByteString ref = this.deviceId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.deviceId_ = s;
            }
            return s;
        }

        public ByteString getDeviceIdBytes() {
            Object ref = this.deviceId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.deviceId_ = b;
            return b;
        }

        public boolean hasPage() {
            return (this.bitField0_ & 32) == 32;
        }

        public String getPage() {
            ByteString ref = this.page_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.page_ = s;
            }
            return s;
        }

        public ByteString getPageBytes() {
            Object ref = this.page_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.page_ = b;
            return b;
        }

        public boolean hasDirection() {
            return (this.bitField0_ & 64) == 64;
        }

        public String getDirection() {
            ByteString ref = this.direction_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.direction_ = s;
            }
            return s;
        }

        public ByteString getDirectionBytes() {
            Object ref = this.direction_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.direction_ = b;
            return b;
        }

        private void initFields() {
            this.eventName_ = BuildConfig.FLAVOR;
            this.eventTime_ = BuildConfig.FLAVOR;
            this.sessionId_ = BuildConfig.FLAVOR;
            this.appKey_ = BuildConfig.FLAVOR;
            this.deviceId_ = BuildConfig.FLAVOR;
            this.page_ = BuildConfig.FLAVOR;
            this.direction_ = BuildConfig.FLAVOR;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == (byte) 1) {
                return true;
            }
            if (isInitialized == null) {
                return false;
            }
            if (!hasEventName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasEventTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasSessionId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasAppKey()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasDeviceId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (hasPage()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                output.writeBytes(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                output.writeBytes(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                output.writeBytes(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                output.writeBytes(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                output.writeBytes(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                output.writeBytes(PAGE_FIELD_NUMBER, getPageBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                output.writeBytes(DIRECTION_FIELD_NUMBER, getDirectionBytes());
            }
            output.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                size = 0 + CodedOutputStream.computeBytesSize(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                size += CodedOutputStream.computeBytesSize(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                size += CodedOutputStream.computeBytesSize(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                size += CodedOutputStream.computeBytesSize(PAGE_FIELD_NUMBER, getPageBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                size += CodedOutputStream.computeBytesSize(DIRECTION_FIELD_NUMBER, getDirectionBytes());
            }
            size += this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ViewScrollMsg parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ViewScrollMsg) PARSER.parseFrom(data);
        }

        public static ViewScrollMsg parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ViewScrollMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ViewScrollMsg parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ViewScrollMsg) PARSER.parseFrom(data);
        }

        public static ViewScrollMsg parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ViewScrollMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ViewScrollMsg parseFrom(InputStream input) throws IOException {
            return (ViewScrollMsg) PARSER.parseFrom(input);
        }

        public static ViewScrollMsg parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ViewScrollMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ViewScrollMsg parseDelimitedFrom(InputStream input) throws IOException {
            return (ViewScrollMsg) PARSER.parseDelimitedFrom(input);
        }

        public static ViewScrollMsg parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ViewScrollMsg) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ViewScrollMsg parseFrom(CodedInputStream input) throws IOException {
            return (ViewScrollMsg) PARSER.parseFrom(input);
        }

        public static ViewScrollMsg parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ViewScrollMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ViewScrollMsg prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    public static final class WebViewMsg extends GeneratedMessageLite implements WebViewMsgOrBuilder {
        public static final int APPKEY_FIELD_NUMBER = 4;
        public static final int DEVICEID_FIELD_NUMBER = 5;
        public static final int ERROR_FIELD_NUMBER = 8;
        public static final int EVENTNAME_FIELD_NUMBER = 1;
        public static final int EVENTTIME_FIELD_NUMBER = 2;
        public static final int PAGE_FIELD_NUMBER = 6;
        public static Parser<WebViewMsg> PARSER = null;
        public static final int SESSIONID_FIELD_NUMBER = 3;
        public static final int URL_FIELD_NUMBER = 7;
        public static final int VIEW_FIELD_NUMBER = 9;
        private static final WebViewMsg defaultInstance;
        private static final long serialVersionUID = 0;
        private Object appKey_;
        private int bitField0_;
        private Object deviceId_;
        private Object error_;
        private Object eventName_;
        private Object eventTime_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object page_;
        private Object sessionId_;
        private final ByteString unknownFields;
        private Object url_;
        private ViewItem view_;

        /* renamed from: com.netease.caipiao.dcsdk.event.ProtoEvent.WebViewMsg.1 */
        static class C04281 extends AbstractParser<WebViewMsg> {
            C04281() {
            }

            public WebViewMsg parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new WebViewMsg(extensionRegistry, null);
            }
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<WebViewMsg, Builder> implements WebViewMsgOrBuilder {
            private Object appKey_;
            private int bitField0_;
            private Object deviceId_;
            private Object error_;
            private Object eventName_;
            private Object eventTime_;
            private Object page_;
            private Object sessionId_;
            private Object url_;
            private ViewItem view_;

            private Builder() {
                this.eventName_ = BuildConfig.FLAVOR;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.appKey_ = BuildConfig.FLAVOR;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.page_ = BuildConfig.FLAVOR;
                this.url_ = BuildConfig.FLAVOR;
                this.error_ = BuildConfig.FLAVOR;
                this.view_ = ViewItem.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.eventName_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -2;
                this.eventTime_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -3;
                this.sessionId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -5;
                this.appKey_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -9;
                this.deviceId_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -17;
                this.page_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -33;
                this.url_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -65;
                this.error_ = BuildConfig.FLAVOR;
                this.bitField0_ &= -129;
                this.view_ = ViewItem.getDefaultInstance();
                this.bitField0_ &= -257;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public WebViewMsg getDefaultInstanceForType() {
                return WebViewMsg.getDefaultInstance();
            }

            public WebViewMsg build() {
                WebViewMsg result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw com.google.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(result);
            }

            public WebViewMsg buildPartial() {
                WebViewMsg result = new WebViewMsg(null);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & WebViewMsg.EVENTNAME_FIELD_NUMBER) == WebViewMsg.EVENTNAME_FIELD_NUMBER) {
                    to_bitField0_ = 0 | WebViewMsg.EVENTNAME_FIELD_NUMBER;
                }
                result.eventName_ = this.eventName_;
                if ((from_bitField0_ & WebViewMsg.EVENTTIME_FIELD_NUMBER) == WebViewMsg.EVENTTIME_FIELD_NUMBER) {
                    to_bitField0_ |= WebViewMsg.EVENTTIME_FIELD_NUMBER;
                }
                result.eventTime_ = this.eventTime_;
                if ((from_bitField0_ & WebViewMsg.APPKEY_FIELD_NUMBER) == WebViewMsg.APPKEY_FIELD_NUMBER) {
                    to_bitField0_ |= WebViewMsg.APPKEY_FIELD_NUMBER;
                }
                result.sessionId_ = this.sessionId_;
                if ((from_bitField0_ & WebViewMsg.ERROR_FIELD_NUMBER) == WebViewMsg.ERROR_FIELD_NUMBER) {
                    to_bitField0_ |= WebViewMsg.ERROR_FIELD_NUMBER;
                }
                result.appKey_ = this.appKey_;
                if ((from_bitField0_ & 16) == 16) {
                    to_bitField0_ |= 16;
                }
                result.deviceId_ = this.deviceId_;
                if ((from_bitField0_ & 32) == 32) {
                    to_bitField0_ |= 32;
                }
                result.page_ = this.page_;
                if ((from_bitField0_ & 64) == 64) {
                    to_bitField0_ |= 64;
                }
                result.url_ = this.url_;
                if ((from_bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                    to_bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                }
                result.error_ = this.error_;
                if ((from_bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                    to_bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                }
                result.view_ = this.view_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(WebViewMsg other) {
                if (other != WebViewMsg.getDefaultInstance()) {
                    if (other.hasEventName()) {
                        this.bitField0_ |= WebViewMsg.EVENTNAME_FIELD_NUMBER;
                        this.eventName_ = other.eventName_;
                    }
                    if (other.hasEventTime()) {
                        this.bitField0_ |= WebViewMsg.EVENTTIME_FIELD_NUMBER;
                        this.eventTime_ = other.eventTime_;
                    }
                    if (other.hasSessionId()) {
                        this.bitField0_ |= WebViewMsg.APPKEY_FIELD_NUMBER;
                        this.sessionId_ = other.sessionId_;
                    }
                    if (other.hasAppKey()) {
                        this.bitField0_ |= WebViewMsg.ERROR_FIELD_NUMBER;
                        this.appKey_ = other.appKey_;
                    }
                    if (other.hasDeviceId()) {
                        this.bitField0_ |= 16;
                        this.deviceId_ = other.deviceId_;
                    }
                    if (other.hasPage()) {
                        this.bitField0_ |= 32;
                        this.page_ = other.page_;
                    }
                    if (other.hasUrl()) {
                        this.bitField0_ |= 64;
                        this.url_ = other.url_;
                    }
                    if (other.hasError()) {
                        this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                        this.error_ = other.error_;
                    }
                    if (other.hasView()) {
                        mergeView(other.getView());
                    }
                    setUnknownFields(getUnknownFields().concat(other.unknownFields));
                }
                return this;
            }

            public final boolean isInitialized() {
                if (hasEventName() && hasEventTime() && hasSessionId() && hasAppKey() && hasDeviceId() && hasPage()) {
                    return true;
                }
                return false;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                WebViewMsg parsedMessage = null;
                try {
                    parsedMessage = (WebViewMsg) WebViewMsg.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WebViewMsg) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
            }

            public boolean hasEventName() {
                return (this.bitField0_ & WebViewMsg.EVENTNAME_FIELD_NUMBER) == WebViewMsg.EVENTNAME_FIELD_NUMBER;
            }

            public String getEventName() {
                ByteString ref = this.eventName_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventName_ = s;
                return s;
            }

            public ByteString getEventNameBytes() {
                Object ref = this.eventName_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventName_ = b;
                return b;
            }

            public Builder setEventName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= WebViewMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public Builder clearEventName() {
                this.bitField0_ &= -2;
                this.eventName_ = WebViewMsg.getDefaultInstance().getEventName();
                return this;
            }

            public Builder setEventNameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= WebViewMsg.EVENTNAME_FIELD_NUMBER;
                this.eventName_ = value;
                return this;
            }

            public boolean hasEventTime() {
                return (this.bitField0_ & WebViewMsg.EVENTTIME_FIELD_NUMBER) == WebViewMsg.EVENTTIME_FIELD_NUMBER;
            }

            public String getEventTime() {
                ByteString ref = this.eventTime_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.eventTime_ = s;
                return s;
            }

            public ByteString getEventTimeBytes() {
                Object ref = this.eventTime_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.eventTime_ = b;
                return b;
            }

            public Builder setEventTime(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= WebViewMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public Builder clearEventTime() {
                this.bitField0_ &= -3;
                this.eventTime_ = WebViewMsg.getDefaultInstance().getEventTime();
                return this;
            }

            public Builder setEventTimeBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= WebViewMsg.EVENTTIME_FIELD_NUMBER;
                this.eventTime_ = value;
                return this;
            }

            public boolean hasSessionId() {
                return (this.bitField0_ & WebViewMsg.APPKEY_FIELD_NUMBER) == WebViewMsg.APPKEY_FIELD_NUMBER;
            }

            public String getSessionId() {
                ByteString ref = this.sessionId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.sessionId_ = s;
                return s;
            }

            public ByteString getSessionIdBytes() {
                Object ref = this.sessionId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.sessionId_ = b;
                return b;
            }

            public Builder setSessionId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= WebViewMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -5;
                this.sessionId_ = WebViewMsg.getDefaultInstance().getSessionId();
                return this;
            }

            public Builder setSessionIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= WebViewMsg.APPKEY_FIELD_NUMBER;
                this.sessionId_ = value;
                return this;
            }

            public boolean hasAppKey() {
                return (this.bitField0_ & WebViewMsg.ERROR_FIELD_NUMBER) == WebViewMsg.ERROR_FIELD_NUMBER;
            }

            public String getAppKey() {
                ByteString ref = this.appKey_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.appKey_ = s;
                return s;
            }

            public ByteString getAppKeyBytes() {
                Object ref = this.appKey_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.appKey_ = b;
                return b;
            }

            public Builder setAppKey(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= WebViewMsg.ERROR_FIELD_NUMBER;
                this.appKey_ = value;
                return this;
            }

            public Builder clearAppKey() {
                this.bitField0_ &= -9;
                this.appKey_ = WebViewMsg.getDefaultInstance().getAppKey();
                return this;
            }

            public Builder setAppKeyBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= WebViewMsg.ERROR_FIELD_NUMBER;
                this.appKey_ = value;
                return this;
            }

            public boolean hasDeviceId() {
                return (this.bitField0_ & 16) == 16;
            }

            public String getDeviceId() {
                ByteString ref = this.deviceId_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.deviceId_ = s;
                return s;
            }

            public ByteString getDeviceIdBytes() {
                Object ref = this.deviceId_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.deviceId_ = b;
                return b;
            }

            public Builder setDeviceId(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public Builder clearDeviceId() {
                this.bitField0_ &= -17;
                this.deviceId_ = WebViewMsg.getDefaultInstance().getDeviceId();
                return this;
            }

            public Builder setDeviceIdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.deviceId_ = value;
                return this;
            }

            public boolean hasPage() {
                return (this.bitField0_ & 32) == 32;
            }

            public String getPage() {
                ByteString ref = this.page_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.page_ = s;
                return s;
            }

            public ByteString getPageBytes() {
                Object ref = this.page_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.page_ = b;
                return b;
            }

            public Builder setPage(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.page_ = value;
                return this;
            }

            public Builder clearPage() {
                this.bitField0_ &= -33;
                this.page_ = WebViewMsg.getDefaultInstance().getPage();
                return this;
            }

            public Builder setPageBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.page_ = value;
                return this;
            }

            public boolean hasUrl() {
                return (this.bitField0_ & 64) == 64;
            }

            public String getUrl() {
                ByteString ref = this.url_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.url_ = s;
                return s;
            }

            public ByteString getUrlBytes() {
                Object ref = this.url_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.url_ = b;
                return b;
            }

            public Builder setUrl(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.url_ = value;
                return this;
            }

            public Builder clearUrl() {
                this.bitField0_ &= -65;
                this.url_ = WebViewMsg.getDefaultInstance().getUrl();
                return this;
            }

            public Builder setUrlBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.url_ = value;
                return this;
            }

            public boolean hasError() {
                return (this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT;
            }

            public String getError() {
                ByteString ref = this.error_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.error_ = s;
                return s;
            }

            public ByteString getErrorBytes() {
                Object ref = this.error_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.error_ = b;
                return b;
            }

            public Builder setError(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                this.error_ = value;
                return this;
            }

            public Builder clearError() {
                this.bitField0_ &= -129;
                this.error_ = WebViewMsg.getDefaultInstance().getError();
                return this;
            }

            public Builder setErrorBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                this.error_ = value;
                return this;
            }

            public boolean hasView() {
                return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
            }

            public ViewItem getView() {
                return this.view_;
            }

            public Builder setView(ViewItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.view_ = value;
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                return this;
            }

            public Builder setView(Builder builderForValue) {
                this.view_ = builderForValue.build();
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                return this;
            }

            public Builder mergeView(ViewItem value) {
                if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) != AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY || this.view_ == ViewItem.getDefaultInstance()) {
                    this.view_ = value;
                } else {
                    this.view_ = ViewItem.newBuilder(this.view_).mergeFrom(value).buildPartial();
                }
                this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                return this;
            }

            public Builder clearView() {
                this.view_ = ViewItem.getDefaultInstance();
                this.bitField0_ &= -257;
                return this;
            }
        }

        private WebViewMsg(com.google.protobuf.GeneratedMessageLite.Builder builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private WebViewMsg(boolean noInit) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ByteString.EMPTY;
        }

        public static WebViewMsg getDefaultInstance() {
            return defaultInstance;
        }

        public WebViewMsg getDefaultInstanceForType() {
            return defaultInstance;
        }

        private WebViewMsg(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            OutputStream unknownFieldsOutput = ByteString.newOutput();
            CodedOutputStream unknownFieldsCodedOutput = CodedOutputStream.newInstance(unknownFieldsOutput);
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    ByteString bs;
                    switch (tag) {
                        case SwipeRefreshLayout.LARGE /*0*/:
                            done = true;
                            break;
                        case AppColdStartMsg.APPBUILDVERSION_FIELD_NUMBER /*10*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTNAME_FIELD_NUMBER;
                            this.eventName_ = bs;
                            break;
                        case AppColdStartMsg.BATTERYLEVEL_FIELD_NUMBER /*18*/:
                            bs = input.readBytes();
                            this.bitField0_ |= EVENTTIME_FIELD_NUMBER;
                            this.eventTime_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionMenuTextColor /*26*/:
                            bs = input.readBytes();
                            this.bitField0_ |= APPKEY_FIELD_NUMBER;
                            this.sessionId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_actionModePasteDrawable /*34*/:
                            bs = input.readBytes();
                            this.bitField0_ |= ERROR_FIELD_NUMBER;
                            this.appKey_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_dialogTheme /*42*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 16;
                            this.deviceId_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_buttonBarStyle /*50*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 32;
                            this.page_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_toolbarStyle /*58*/:
                            bs = input.readBytes();
                            this.bitField0_ |= 64;
                            this.url_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /*66*/:
                            bs = input.readBytes();
                            this.bitField0_ |= TransportMediator.FLAG_KEY_MEDIA_NEXT;
                            this.error_ = bs;
                            break;
                        case C0268R.styleable.AppCompatTheme_dropDownListViewStyle /*74*/:
                            Builder subBuilder = null;
                            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                                subBuilder = this.view_.toBuilder();
                            }
                            this.view_ = (ViewItem) input.readMessage(ViewItem.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.view_);
                                this.view_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                            break;
                        default:
                            if (!parseUnknownField(input, unknownFieldsCodedOutput, extensionRegistry, tag)) {
                                done = true;
                                break;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    try {
                        unknownFieldsCodedOutput.flush();
                    } catch (IOException e3) {
                        makeExtensionsImmutable();
                    } finally {
                        this.unknownFields = unknownFieldsOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }
            }
            try {
                unknownFieldsCodedOutput.flush();
            } catch (IOException e4) {
            } finally {
                this.unknownFields = unknownFieldsOutput.toByteString();
            }
            makeExtensionsImmutable();
        }

        static {
            PARSER = new C04281();
            defaultInstance = new WebViewMsg(true);
            defaultInstance.initFields();
        }

        public Parser<WebViewMsg> getParserForType() {
            return PARSER;
        }

        public boolean hasEventName() {
            return (this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER;
        }

        public String getEventName() {
            ByteString ref = this.eventName_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventName_ = s;
            }
            return s;
        }

        public ByteString getEventNameBytes() {
            Object ref = this.eventName_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventName_ = b;
            return b;
        }

        public boolean hasEventTime() {
            return (this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER;
        }

        public String getEventTime() {
            ByteString ref = this.eventTime_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.eventTime_ = s;
            }
            return s;
        }

        public ByteString getEventTimeBytes() {
            Object ref = this.eventTime_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.eventTime_ = b;
            return b;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER;
        }

        public String getSessionId() {
            ByteString ref = this.sessionId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.sessionId_ = s;
            }
            return s;
        }

        public ByteString getSessionIdBytes() {
            Object ref = this.sessionId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.sessionId_ = b;
            return b;
        }

        public boolean hasAppKey() {
            return (this.bitField0_ & ERROR_FIELD_NUMBER) == ERROR_FIELD_NUMBER;
        }

        public String getAppKey() {
            ByteString ref = this.appKey_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.appKey_ = s;
            }
            return s;
        }

        public ByteString getAppKeyBytes() {
            Object ref = this.appKey_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.appKey_ = b;
            return b;
        }

        public boolean hasDeviceId() {
            return (this.bitField0_ & 16) == 16;
        }

        public String getDeviceId() {
            ByteString ref = this.deviceId_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.deviceId_ = s;
            }
            return s;
        }

        public ByteString getDeviceIdBytes() {
            Object ref = this.deviceId_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.deviceId_ = b;
            return b;
        }

        public boolean hasPage() {
            return (this.bitField0_ & 32) == 32;
        }

        public String getPage() {
            ByteString ref = this.page_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.page_ = s;
            }
            return s;
        }

        public ByteString getPageBytes() {
            Object ref = this.page_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.page_ = b;
            return b;
        }

        public boolean hasUrl() {
            return (this.bitField0_ & 64) == 64;
        }

        public String getUrl() {
            ByteString ref = this.url_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.url_ = s;
            }
            return s;
        }

        public ByteString getUrlBytes() {
            Object ref = this.url_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.url_ = b;
            return b;
        }

        public boolean hasError() {
            return (this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT;
        }

        public String getError() {
            ByteString ref = this.error_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.error_ = s;
            }
            return s;
        }

        public ByteString getErrorBytes() {
            Object ref = this.error_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.error_ = b;
            return b;
        }

        public boolean hasView() {
            return (this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
        }

        public ViewItem getView() {
            return this.view_;
        }

        private void initFields() {
            this.eventName_ = BuildConfig.FLAVOR;
            this.eventTime_ = BuildConfig.FLAVOR;
            this.sessionId_ = BuildConfig.FLAVOR;
            this.appKey_ = BuildConfig.FLAVOR;
            this.deviceId_ = BuildConfig.FLAVOR;
            this.page_ = BuildConfig.FLAVOR;
            this.url_ = BuildConfig.FLAVOR;
            this.error_ = BuildConfig.FLAVOR;
            this.view_ = ViewItem.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == (byte) 1) {
                return true;
            }
            if (isInitialized == null) {
                return false;
            }
            if (!hasEventName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasEventTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasSessionId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasAppKey()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (!hasDeviceId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            } else if (hasPage()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            } else {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                output.writeBytes(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                output.writeBytes(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                output.writeBytes(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & ERROR_FIELD_NUMBER) == ERROR_FIELD_NUMBER) {
                output.writeBytes(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                output.writeBytes(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                output.writeBytes(PAGE_FIELD_NUMBER, getPageBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                output.writeBytes(URL_FIELD_NUMBER, getUrlBytes());
            }
            if ((this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                output.writeBytes(ERROR_FIELD_NUMBER, getErrorBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                output.writeMessage(VIEW_FIELD_NUMBER, this.view_);
            }
            output.writeRawBytes(this.unknownFields);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if ((this.bitField0_ & EVENTNAME_FIELD_NUMBER) == EVENTNAME_FIELD_NUMBER) {
                size = 0 + CodedOutputStream.computeBytesSize(EVENTNAME_FIELD_NUMBER, getEventNameBytes());
            }
            if ((this.bitField0_ & EVENTTIME_FIELD_NUMBER) == EVENTTIME_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(EVENTTIME_FIELD_NUMBER, getEventTimeBytes());
            }
            if ((this.bitField0_ & APPKEY_FIELD_NUMBER) == APPKEY_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(SESSIONID_FIELD_NUMBER, getSessionIdBytes());
            }
            if ((this.bitField0_ & ERROR_FIELD_NUMBER) == ERROR_FIELD_NUMBER) {
                size += CodedOutputStream.computeBytesSize(APPKEY_FIELD_NUMBER, getAppKeyBytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                size += CodedOutputStream.computeBytesSize(DEVICEID_FIELD_NUMBER, getDeviceIdBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                size += CodedOutputStream.computeBytesSize(PAGE_FIELD_NUMBER, getPageBytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                size += CodedOutputStream.computeBytesSize(URL_FIELD_NUMBER, getUrlBytes());
            }
            if ((this.bitField0_ & TransportMediator.FLAG_KEY_MEDIA_NEXT) == TransportMediator.FLAG_KEY_MEDIA_NEXT) {
                size += CodedOutputStream.computeBytesSize(ERROR_FIELD_NUMBER, getErrorBytes());
            }
            if ((this.bitField0_ & AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) == AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
                size += CodedOutputStream.computeMessageSize(VIEW_FIELD_NUMBER, this.view_);
            }
            size += this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static WebViewMsg parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (WebViewMsg) PARSER.parseFrom(data);
        }

        public static WebViewMsg parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (WebViewMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static WebViewMsg parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (WebViewMsg) PARSER.parseFrom(data);
        }

        public static WebViewMsg parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (WebViewMsg) PARSER.parseFrom(data, extensionRegistry);
        }

        public static WebViewMsg parseFrom(InputStream input) throws IOException {
            return (WebViewMsg) PARSER.parseFrom(input);
        }

        public static WebViewMsg parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (WebViewMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static WebViewMsg parseDelimitedFrom(InputStream input) throws IOException {
            return (WebViewMsg) PARSER.parseDelimitedFrom(input);
        }

        public static WebViewMsg parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (WebViewMsg) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static WebViewMsg parseFrom(CodedInputStream input) throws IOException {
            return (WebViewMsg) PARSER.parseFrom(input);
        }

        public static WebViewMsg parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (WebViewMsg) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(WebViewMsg prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }
    }

    private ProtoEvent() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    static {
    }
}
