package com.netease.caipiao.dcsdk.customdata.type.json;

import java.util.List;

public class Method extends Node {
    private List<Object> args;

    public List<Object> getArgs() {
        return this.args;
    }

    public void setArgs(List<Object> args) {
        this.args = args;
    }
}
