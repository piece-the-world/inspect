package com.netease.caipiao.datacollection.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class DemoExpandableListAdapter extends BaseExpandableListAdapter {
    private List<List<String>> childrenData;
    private final Context context;
    private List<String> groupData;

    public DemoExpandableListAdapter(Context context) {
        this.groupData = new ArrayList();
        this.childrenData = new ArrayList();
        this.context = context;
        mockData();
    }

    private void mockData() {
        this.groupData.add("gourp 1");
        this.groupData.add("gourp 2");
        this.groupData.add("gourp 3");
        List<String> children1 = new ArrayList();
        children1.add("child 1");
        children1.add("child 2");
        children1.add("child 3");
        this.childrenData.add(children1);
        List<String> children2 = new ArrayList();
        children2.add("child 1");
        children2.add("child 2");
        children2.add("child 3");
        this.childrenData.add(children2);
        List<String> children3 = new ArrayList();
        children3.add("child 1");
        children3.add("child 2");
        children3.add("child 3");
        this.childrenData.add(children3);
    }

    public int getGroupCount() {
        return this.groupData.size();
    }

    public int getChildrenCount(int groupPosition) {
        return ((List) this.childrenData.get(groupPosition)).size();
    }

    public Object getGroup(int groupPosition) {
        return this.groupData.get(groupPosition);
    }

    public Object getChild(int groupPosition, int childPosition) {
        return ((List) this.childrenData.get(groupPosition)).get(childPosition);
    }

    public long getGroupId(int groupPosition) {
        return (long) groupPosition;
    }

    public long getChildId(int groupPosition, int childPosition) {
        return (long) ((groupPosition << 32) + childPosition);
    }

    public boolean hasStableIds() {
        return false;
    }

    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if (convertView == null) {
            return createView((String) this.groupData.get(groupPosition));
        }
        TextView textView = (TextView) convertView;
        textView.setText((CharSequence) this.groupData.get(groupPosition));
        return textView;
    }

    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        if (convertView == null) {
            return createView((String) ((List) this.childrenData.get(groupPosition)).get(childPosition));
        }
        TextView textView = (TextView) convertView;
        textView.setText((CharSequence) ((List) this.childrenData.get(groupPosition)).get(childPosition));
        return textView;
    }

    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    private TextView createView(String content) {
        LayoutParams layoutParams = new LayoutParams(-1, 38);
        TextView text = new TextView(this.context);
        text.setLayoutParams(layoutParams);
        text.setGravity(19);
        text.setPadding(40, 0, 0, 0);
        text.setText(content);
        return text;
    }
}
