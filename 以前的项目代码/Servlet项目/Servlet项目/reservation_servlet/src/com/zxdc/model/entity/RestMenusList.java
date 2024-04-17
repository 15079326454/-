package com.zxdc.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * user@Bright Rain .
 * 2019/5/9.
 */
public class RestMenusList {
    List<RestMenus> list = new ArrayList<>();
    private int goodNumber=1;

    public int getGoodNumber() {
        return goodNumber;
    }

    public void setGoodNumber(int goodNumber) {
        this.goodNumber = goodNumber;
    }

    public List<RestMenus> getList() {
        return list;
    }

    public void setList(List<RestMenus> list) {
        this.list = list;
    }
}
