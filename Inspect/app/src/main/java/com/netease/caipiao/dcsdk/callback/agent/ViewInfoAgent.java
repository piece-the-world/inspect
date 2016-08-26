package com.netease.caipiao.dcsdk.callback.agent;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.growingio.android.sdk.agent.VdsAgent;
import com.netease.caipiao.dcsdk.callback.type.ViewInfo;
import com.netease.caipiao.dcsdk.constants.Constants;
import com.netease.caipiao.dcsdk.log.Logger;

public class ViewInfoAgent {
    private ViewInfoAgent() {
    }

    public static void signChildren(View view) {
        if (view instanceof ViewGroup) {
            for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
                View child = ((ViewGroup) view).getChildAt(i);
                if (child != null) {
                    Object object = child.getTag(Constants.TAG_ID_VIEWINFO);
                    if (object == null) {
                        ViewInfo viewInfo = new ViewInfo();
                        viewInfo.setIndex(i);
                        child.setTag(Constants.TAG_ID_VIEWINFO, viewInfo);
                    } else if ((object instanceof ViewInfo) && (child.getParent() instanceof ViewGroup)) {
                        ((ViewInfo) object).setIndex(i);
                    }
                }
            }
        }
    }

    public static void toastViewPath(View view) {
        if (Logger.isDebugSwitchOn() && view != null && view.getContext() != null) {
            StringBuilder rst = new StringBuilder();
            while (view != null && (view.getTag(Constants.TAG_ID_VIEWINFO) instanceof ViewInfo)) {
                rst.append(((ViewInfo) view.getTag(Constants.TAG_ID_VIEWINFO)).getIndex()).append(";");
                if (view.getParent() instanceof View) {
                    view = (View) view.getParent();
                } else {
                    view = null;
                }
            }
            rst.append("R");
            Toast makeText = Toast.makeText(view.getContext(), rst.reverse().toString(), 1);
            if (makeText instanceof Toast) {
                VdsAgent.showToast(makeText);
            } else {
                makeText.show();
            }
        }
    }
}
