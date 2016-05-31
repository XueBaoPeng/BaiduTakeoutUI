package com.jniu.baidutakeoutui.bean;

import android.widget.TextView;

import java.util.List;

/**
 * Created by xbp on 2016/5/31.
 */
public class ItemEntity {

    private int ItemSourceId;
    private String Item_title;

    private List<ItemEntity> list;

    public ItemEntity(int itemSourceId, String item_title, List<ItemEntity> list) {
        ItemSourceId = itemSourceId;
        Item_title = item_title;
        this.list = list;
    }

    public int getItemSourceId() {
        return ItemSourceId;
    }

    public void setItemSourceId(int itemSourceId) {
        ItemSourceId = itemSourceId;
    }

    public String getItem_title() {
        return Item_title;
    }

    public void setItem_title(String item_title) {
        Item_title = item_title;
    }

    public List<ItemEntity> getList() {
        return list;
    }

    public void setList(List<ItemEntity> list) {
        this.list = list;
    }
}
