package com.netease.caipiao.dcsdk.customdata;

import android.text.TextUtils;
import android.view.View;
import com.netease.caipiao.dcsdk.callback.CallbackImpl;
import com.netease.caipiao.dcsdk.customdata.type.DataDescription;
import com.netease.caipiao.dcsdk.customdata.type.DataPath;
import com.netease.caipiao.dcsdk.customdata.type.json.Field;
import com.netease.caipiao.dcsdk.customdata.type.json.Method;
import com.netease.caipiao.dcsdk.customdata.type.json.Node;
import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.event.EventType;
import com.netease.caipiao.dcsdk.event.ProtoEvent.MapItem;
import com.netease.caipiao.dcsdk.event.utils.EventUtils;
import com.netease.caipiao.dcsdk.log.Logger;
import com.netease.caipiao.dcsdk.log.Tags;
import com.netease.caipiao.dcsdk.utils.FieldUtils;
import com.netease.caipiao.dcsdk.utils.MethodUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public enum CustomDataManager {
    INSTANCE;
    
    private Map<String, List<DataDescription>> map;

    public void addDataDescription(DataDescription dataDescription) {
        if (dataDescription != null && !TextUtils.isEmpty(dataDescription.getPageName())) {
            List<DataDescription> descriptions = (List) this.map.get(dataDescription.getPageName());
            if (descriptions == null) {
                List<DataDescription> des = new ArrayList();
                des.add(dataDescription);
                this.map.put(dataDescription.getPageName(), des);
                return;
            }
            descriptions.add(dataDescription);
        }
    }

    public List<DataPath> match(View view, EventType eventType) {
        List<DataDescription> des = (List) this.map.get(EventUtils.getPageName(view));
        List<DataPath> dataPathes = new ArrayList();
        if (des != null && des.size() > 0) {
            for (DataDescription d : des) {
                if (d != null && d.fit(view, eventType)) {
                    Logger.debug(Tags.VIEW_TREE, "view path matched", new Object[0]);
                    if (d.getDataPath() != null) {
                        dataPathes.add(d.getDataPath());
                    }
                }
            }
        }
        return dataPathes;
    }

    public void matchAndSet(View view, EventType eventType, CallbackImpl callback) {
        if (callback != null) {
            List<DataDescription> des = (List) this.map.get(EventUtils.getPageName(view));
            List<DataPath> dataPathes = null;
            if (des != null && des.size() > 0) {
                dataPathes = new ArrayList();
                for (DataDescription d : des) {
                    if (d != null && d.fit(view, eventType)) {
                        Logger.debug(Tags.VIEW_TREE, "view path matched", new Object[0]);
                        if (d.getDataPath() != null) {
                            dataPathes.add(d.getDataPath());
                        }
                    }
                }
            }
            if (dataPathes != null && dataPathes.size() > 0) {
                callback.setCustomDataPathes(dataPathes);
            }
        }
    }

    public void collectCustomData(Event event, View view, List<DataPath> customDataPathes) {
        if (customDataPathes != null && customDataPathes.size() > 0 && event != null && view != null) {
            List<MapItem> infos;
            if (event.getInfo() == null) {
                infos = new ArrayList();
                event.setInfo(infos);
            } else {
                infos = event.getInfo();
            }
            for (DataPath path : customDataPathes) {
                if (!(path == null || TextUtils.isEmpty(path.getKey()) || path.getNodes() == null || path.getNodes().size() <= 0)) {
                    infos.add(MapItem.newBuilder().setKey(path.getKey()).setValue(String.valueOf(parseDataPath(view, path))).build());
                }
            }
        }
    }

    private Object parseDataPath(View view, DataPath path) {
        Object rst = view;
        try {
            for (Node node : path.getNodes()) {
                if (node instanceof Field) {
                    rst = FieldUtils.readField(rst, node.getName());
                    if (((Field) node).getIndex() != -1) {
                        if (rst instanceof List) {
                            rst = ((List) rst).get(((Field) node).getIndex());
                        } else if (rst.getClass().isArray()) {
                            rst = ((Object[]) rst)[((Field) node).getIndex()];
                        }
                    }
                } else if (node instanceof Method) {
                    Object[] objArr;
                    List<Object> args = ((Method) node).getArgs();
                    String name = node.getName();
                    if (args == null) {
                        objArr = null;
                    } else {
                        objArr = args.toArray();
                    }
                    rst = MethodUtils.invokeMethod(rst, name, objArr);
                }
            }
            return rst;
        } catch (Exception e) {
            Logger.debug(Tags.VIEW_TREE, "Exception when parse datapath !", new Object[0]);
            return null;
        }
    }
}
