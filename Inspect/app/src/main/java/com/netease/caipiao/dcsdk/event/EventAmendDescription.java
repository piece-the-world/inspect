package com.netease.caipiao.dcsdk.event;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.netease.caipiao.dcsdk.event.utils.EventUtils;

public class EventAmendDescription {
    private EventType eventType;
    private String pageName;
    private Class<?> viewClass;
    private String viewId;
    private String viewText;

    public static class Builder {
        private EventType eventType;
        private String pageName;
        private Class<?> viewClass;
        private String viewId;
        private String viewText;

        public Builder pageName(String pageName) {
            this.pageName = pageName;
            return this;
        }

        public Builder eventType(EventType eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder viewClass(Class<?> viewClass) {
            this.viewClass = viewClass;
            return this;
        }

        public Builder viewId(String viewId) {
            this.viewId = viewId;
            return this;
        }

        public Builder viewText(String viewText) {
            this.viewText = viewText;
            return this;
        }

        public EventAmendDescription build() {
            return new EventAmendDescription();
        }
    }

    private EventAmendDescription(Builder builder) {
        this.pageName = builder.pageName;
        this.eventType = builder.eventType;
        this.viewClass = builder.viewClass;
        this.viewId = builder.viewId;
        this.viewText = builder.viewText;
    }

    public boolean fit(View view, EventType type) {
        if (view == null || type == null) {
            return false;
        }
        if (!TextUtils.isEmpty(this.pageName)) {
            if (!this.pageName.equals(EventUtils.getPageName(view))) {
                return false;
            }
        }
        if (this.eventType != null && this.eventType != type) {
            return false;
        }
        if (this.viewClass != null && this.viewClass != view.getClass()) {
            return false;
        }
        if (!TextUtils.isEmpty(this.viewId)) {
            try {
                if (!this.viewId.equals(view.getContext().getResources().getResourceEntryName(view.getId()))) {
                    return false;
                }
            } catch (Exception e) {
                return false;
            }
        }
        if (!TextUtils.isEmpty(this.viewText) && (view instanceof TextView)) {
            if (!this.viewText.equals(((TextView) view).getText().toString())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object o) {
        boolean z = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof EventAmendDescription)) {
            return false;
        }
        EventAmendDescription that = (EventAmendDescription) o;
        if (this.pageName != null) {
            if (!this.pageName.equals(that.pageName)) {
                return false;
            }
        } else if (that.pageName != null) {
            return false;
        }
        if (this.eventType != that.eventType) {
            return false;
        }
        if (this.viewClass != null) {
            if (!this.viewClass.equals(that.viewClass)) {
                return false;
            }
        } else if (that.viewClass != null) {
            return false;
        }
        if (this.viewId != null) {
            if (!this.viewId.equals(that.viewId)) {
                return false;
            }
        } else if (that.viewId != null) {
            return false;
        }
        if (this.viewText != null) {
            z = this.viewText.equals(that.viewText);
        } else if (that.viewText != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int result;
        int hashCode;
        int i = 0;
        if (this.pageName != null) {
            result = this.pageName.hashCode();
        } else {
            result = 0;
        }
        int i2 = result * 31;
        if (this.eventType != null) {
            hashCode = this.eventType.hashCode();
        } else {
            hashCode = 0;
        }
        i2 = (i2 + hashCode) * 31;
        if (this.viewClass != null) {
            hashCode = this.viewClass.hashCode();
        } else {
            hashCode = 0;
        }
        i2 = (i2 + hashCode) * 31;
        if (this.viewId != null) {
            hashCode = this.viewId.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (i2 + hashCode) * 31;
        if (this.viewText != null) {
            i = this.viewText.hashCode();
        }
        return hashCode + i;
    }
}
