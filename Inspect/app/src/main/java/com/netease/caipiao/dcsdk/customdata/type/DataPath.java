package com.netease.caipiao.dcsdk.customdata.type;

import android.view.View;
import com.netease.caipiao.dcsdk.customdata.type.json.Node;
import java.util.List;

public class DataPath {
    private String key;
    private List<Node> nodes;

    public Object locateData(View view) {
        return null;
    }

    public boolean equals(Object o) {
        return super.equals(o);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public List<Node> getNodes() {
        return this.nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
