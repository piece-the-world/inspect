package com.netease.caipiao.datacollection.adapter;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;

public class ListAndFilterableAdapter implements Filterable, ListAdapter {
    public boolean areAllItemsEnabled() {
        return false;
    }

    public boolean isEnabled(int position) {
        return false;
    }

    public void registerDataSetObserver(DataSetObserver observer) {
    }

    public void unregisterDataSetObserver(DataSetObserver observer) {
    }

    public int getCount() {
        return 0;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public boolean hasStableIds() {
        return false;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    public int getItemViewType(int position) {
        return 0;
    }

    public int getViewTypeCount() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public Filter getFilter() {
        return null;
    }
}
