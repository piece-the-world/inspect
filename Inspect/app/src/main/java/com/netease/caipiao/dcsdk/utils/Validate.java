package com.netease.caipiao.dcsdk.utils;

class Validate {
    Validate() {
    }

    static void isTrue(boolean expression, String message, Object... values) {
        if (!expression) {
            throw new IllegalArgumentException(String.format(message, values));
        }
    }
}
