package com.jniu.baidutakeoutui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jniu.baidutakeoutui.R;
import com.jniu.baidutakeoutui.bean.ItemEntity;

import java.util.List;

/**
 * Created by xbp on 2016/5/31.
 */
public class ItemAdapter extends BaseAdapter {
    private Context mContext;
    private List<ItemEntity> datas;
    public ItemAdapter(Context context,List<ItemEntity> datas){
        this.mContext=context;
        this.datas=datas;
    }
    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    ViewHolder viewHolder=null;
        ItemEntity itemEntity=datas.get(position);
        if(convertView==null){
             viewHolder=new ViewHolder();
            convertView= LayoutInflater.from(mContext).inflate(R.layout.view_item,null);
            viewHolder.itemIcon= (ImageView) convertView.findViewById(R.id.item_icon);
            viewHolder.itemTitle= (TextView) convertView.findViewById(R.id.item_title);
            convertView.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView.getTag();
        }

        viewHolder.itemTitle.setText(itemEntity.getItem_title());
        viewHolder.itemIcon.setImageResource(itemEntity.getItemSourceId());
        return convertView;
    }
    class  ViewHolder{
        ImageView itemIcon;
        TextView itemTitle;
    }
}
