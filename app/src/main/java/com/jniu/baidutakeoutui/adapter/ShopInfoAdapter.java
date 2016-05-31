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
        View view = layoutInflater.inflate(R.layout.shop_cell, null);
        ShopInfo shopInfo = shopInfoList.get(position);
        ImageView ivShopImg = (ImageView) view.findViewById(R.id.iv_shop_img);
        TextView tvShopName = (TextView) view.findViewById(R.id.tv_shop_name);
        TextView tvShopMarkCard = (TextView) view.findViewById(R.id.tv_shop_mark_card);
        TextView tvShopMarkPay = (TextView) view.findViewById(R.id.tv_shop_mark_pay);
        TextView tvShopMarkCoupons = (TextView) view.findViewById(R.id.tv_shop_mark_coupons);
        TextView tvShopMarkTicket = (TextView) view.findViewById(R.id.tv_shop_mark_ticket);
        RatingBar ratingBar = (RatingBar) view.findViewById(R.id.tv_rating);
        TextView tvSaleVolume = (TextView) view.findViewById(R.id.tv_shop_sales_volume);
        TextView tvTakeOutInfo = (TextView) view.findViewById(R.id.tv_takeout_info);
        if(shopInfo.isCard()){
            tvShopMarkCard.setVisibility(view.VISIBLE);
        }
        if(shopInfo.isCoupons()){
            tvShopMarkCoupons.setVisibility(View.VISIBLE);
        }
        if(shopInfo.isPay()){
            tvShopMarkPay.setVisibility(View.VISIBLE);
        }
        if(shopInfo.isTicket()){
            tvShopMarkTicket.setVisibility(View.VISIBLE);
        }
        ivShopImg.setImageResource(shopInfo.getShopImgResourceId());
        tvShopName.setText(shopInfo.getShopName());
        ratingBar.setRating(shopInfo.getShopRating());
        tvSaleVolume.setText("月销量"+shopInfo.getSalesVolume()+"份");
        tvTakeOutInfo.setText("起送¥"+shopInfo.getPlayPrice()+"| 配送 ¥ "+shopInfo.getDistribution()+" | 平均"+shopInfo.getDistributionTime()+"分钟");
        return view;
    }
}
