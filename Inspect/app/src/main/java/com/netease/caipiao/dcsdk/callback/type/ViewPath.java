package com.netease.caipiao.dcsdk.callback.type;

import android.view.View;
import com.netease.caipiao.dcsdk.constants.Constants;

public class ViewPath {
    private String path;

    public static ViewPath getPath(View view) {
        if (view == null) {
            return null;
        }
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
        ViewPath viewPath = new ViewPath();
        viewPath.setPath(rst.reverse().toString());
        return viewPath;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return this.path.equals(((ViewPath) o).path);
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
