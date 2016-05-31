package com.jniu.baidutakeoutui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.jniu.baidutakeoutui.bean.ItemEntity;
import com.jniu.baidutakeoutui.view.ItemView;

import java.util.List;

/**
 * Created by xbp on 2016/5/31.
 */
public class MeItemAdapter extends BaseAdapter {
    private Context mContext;
    private List<List<ItemEntity>> meDatas;

    public  MeItemAdapter(Context context,List<List<ItemEntity>> datas){
        this.mContext=context;
        this.meDatas=datas;
    }
    @Override
    public int getCount() {
        return meDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return meDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView=new ItemView(mContext,meDatas.get(position));
        return convertView;
    }
}
