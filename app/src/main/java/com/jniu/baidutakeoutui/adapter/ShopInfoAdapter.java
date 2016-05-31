package com.jniu.baidutakeoutui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.jniu.baidutakeoutui.R;
import com.jniu.baidutakeoutui.bean.ShopInfo;

import java.util.List;

/**
 * Created by Administrator on 2015/9/10.
 */
public class ShopInfoAdapter extends ArrayAdapter<ShopInfo> {

    public static final int VISIBILITY = 0;
    public static final int INVISIBILITY = 4;

    private Context context;
    private LayoutInflater layoutInflater;
    private List<ShopInfo> shopInfoList;

    public ShopInfoAdapter(Context context, int resource, List<ShopInfo> shopInfos) {
        super(context,resource,shopInfos);
        this.context = context;
        layoutInflater = layoutInflater.from(context);
        shopInfoList = shopInfos;
    }

    @Override
    public int getCount() {
        return shopInfoList.size();
    }

    @Override
    public ShopInfo getItem(int position) {
        return shopInfoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder=null;
        ShopInfo shopInfo = shopInfoList.get(position);
        if(convertView==null){
            convertView=layoutInflater.inflate(R.layout.shop_cell, null);
            viewHolder=new ViewHolder();
            viewHolder.ivShopImg = (ImageView) convertView.findViewById(R.id.iv_shop_img);
            viewHolder. tvShopName = (TextView) convertView.findViewById(R.id.tv_shop_name);
            viewHolder. tvShopMarkCard = (TextView) convertView.findViewById(R.id.tv_shop_mark_card);
            viewHolder. tvShopMarkPay = (TextView) convertView.findViewById(R.id.tv_shop_mark_pay);
            viewHolder. tvShopMarkCoupons = (TextView) convertView.findViewById(R.id.tv_shop_mark_coupons);
            viewHolder. tvShopMarkTicket = (TextView) convertView.findViewById(R.id.tv_shop_mark_ticket);
            viewHolder. ratingBar = (RatingBar) convertView.findViewById(R.id.tv_rating);
            viewHolder. tvSaleVolume = (TextView) convertView.findViewById(R.id.tv_shop_sales_volume);
            viewHolder. tvTakeOutInfo = (TextView) convertView.findViewById(R.id.tv_takeout_info);
            convertView.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        if(shopInfo.isCard()){
            viewHolder.tvShopMarkCard.setVisibility(convertView.VISIBLE);
        }
        if(shopInfo.isCoupons()){
            viewHolder.tvShopMarkCoupons.setVisibility(View.VISIBLE);
        }
        if(shopInfo.isPay()){
            viewHolder.tvShopMarkPay.setVisibility(View.VISIBLE);
        }
        if(shopInfo.isTicket()){
            viewHolder. tvShopMarkTicket.setVisibility(View.VISIBLE);
        }
        viewHolder.ivShopImg.setImageResource(shopInfo.getShopImgResourceId());
        viewHolder.tvShopName.setText(shopInfo.getShopName());
        viewHolder.ratingBar.setRating(shopInfo.getShopRating());
        viewHolder.tvSaleVolume.setText("月销量"+shopInfo.getSalesVolume()+"份");
        viewHolder.tvTakeOutInfo.setText("起送¥"+shopInfo.getPlayPrice()+"| 配送 ¥ "+shopInfo.getDistribution()+" | 平均"+shopInfo.getDistributionTime()+"分钟");
        return convertView;
    }

    class ViewHolder {
        ImageView ivShopImg;
        TextView tvShopName;
        TextView tvShopMarkCard;
        TextView tvShopMarkPay;
        TextView tvShopMarkCoupons;
        TextView tvShopMarkTicket;
        TextView tvSaleVolume;
        TextView tvTakeOutInfo;
        RatingBar ratingBar;

    }
}
