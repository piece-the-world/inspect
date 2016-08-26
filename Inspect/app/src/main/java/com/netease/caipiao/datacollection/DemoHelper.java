package com.netease.caipiao.datacollection;

import com.netease.caipiao.dcsdk.callback.type.ViewPath;
import com.netease.caipiao.dcsdk.customdata.CustomDataManager;
import com.netease.caipiao.dcsdk.customdata.type.DataDescription;
import com.netease.caipiao.dcsdk.customdata.type.DataPath;
import com.netease.caipiao.dcsdk.customdata.type.json.Field;
import com.netease.caipiao.dcsdk.customdata.type.json.Method;
import com.netease.caipiao.dcsdk.customdata.type.json.Node;
import com.netease.caipiao.dcsdk.event.EventType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum DemoHelper {
    INSTANCE;

    public List<Map<String, Object>> getSimpleAdapterData() {
        List<Map<String, Object>> list = new ArrayList();
        Map<String, Object> map = new HashMap();
        map.put("info", "11111111111");
        list.add(map);
        map = new HashMap();
        map.put("info", "22222222222");
        list.add(map);
        map = new HashMap();
        map.put("info", "22222222222");
        list.add(map);
        map = new HashMap();
        map.put("info", "22222222222");
        list.add(map);
        map = new HashMap();
        map.put("info", "22222222222");
        list.add(map);
        map = new HashMap();
        map.put("info", "22222222222");
        list.add(map);
        map = new HashMap();
        map.put("info", "22222222222");
        list.add(map);
        map = new HashMap();
        map.put("info", "22222222222");
        list.add(map);
        map = new HashMap();
        map.put("info", "22222222222");
        list.add(map);
        return list;
    }

    public List<String> getPackageNames() {
        List<String> list = new ArrayList();
        list.add("com.netease.caipiao");
        list.add("com.netease.caipiaolede");
        list.add("com.android.settings");
        list.add("com.android.mms");
        list.add("com.android.browser");
        list.add("com.android.mediacenter");
        list.add("com.tencent.qqgame");
        list.add("com.tencent.mqq");
        list.add("com.hiapk.marketpho");
        list.add("com.sina.weibo");
        return list;
    }

    public void testViewTree() {
        DataDescription dataDescription = new DataDescription();
        dataDescription.setPageName("DemoFragment1");
        dataDescription.setDataPath(getTestDataPath());
        ViewPath viewPath = new ViewPath();
        viewPath.setPath("R;0;1;0;0;1");
        dataDescription.setViewPath(viewPath);
        dataDescription.setEventType(EventType.VIEW_CLICK.getEventName());
        CustomDataManager.INSTANCE.addDataDescription(dataDescription);
    }

    private DataPath getTestDataPath() {
        DataPath dataPath = new DataPath();
        dataPath.setKey("testKey");
        List<Node> nodes = new ArrayList();
        Field field1 = new Field();
        field1.setName("mContext");
        nodes.add(field1);
        Method method3 = new Method();
        method3.setName("getDataPathTestI1");
        nodes.add(method3);
        dataPath.setNodes(nodes);
        return dataPath;
    }
}
