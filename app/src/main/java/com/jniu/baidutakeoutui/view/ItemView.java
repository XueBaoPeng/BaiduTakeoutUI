package com.jniu.baidutakeoutui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.jniu.baidutakeoutui.R;
import com.jniu.baidutakeoutui.adapter.ItemAdapter;
import com.jniu.baidutakeoutui.bean.ItemEntity;

import java.util.List;

/**
 * Created by xbp on 2016/5/31.
 */
public class ItemView extends LinearLayout {

    private Context mContext;
    private List<ItemEntity> datas;
    private NoScrollListView itemListView;
    private ItemAdapter itemAdapter;


    public ItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initLayout();
    }
    public ItemView(Context context,List<ItemEntity> datas) {
        super(context);
        this.mContext=context;
        this.datas=datas;
        initLayout();
    }


    private void initLayout() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_parent_item, this);
        itemListView= (NoScrollListView) findViewById(R.id.list_item);
        itemAdapter=new ItemAdapter(mContext,datas);
        itemListView.setAdapter(itemAdapter);
    }
}
