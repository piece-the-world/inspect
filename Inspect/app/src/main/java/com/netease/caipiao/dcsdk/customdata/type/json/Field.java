package com.netease.caipiao.dcsdk.customdata.type.json;

public class Field extends Node {
    private int index;

    public Field() {
        this.index = -1;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
