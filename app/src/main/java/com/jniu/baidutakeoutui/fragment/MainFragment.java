package com.jniu.baidutakeoutui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.jniu.baidutakeoutui.R;
import com.jniu.baidutakeoutui.adapter.ShopInfoAdapter;
import com.jniu.baidutakeoutui.bean.ShopInfo;
import com.jniu.baidutakeoutui.view.NoScrollListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/9/11.
 */
public class MainFragment extends Fragment {
    List<ShopInfo> shopInfoList;
    NoScrollListView lvShopInfo;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main,null);
        ShopInfo shopInfo = new ShopInfo();
        shopInfo.setShopName("必胜客");
        shopInfo.setShopImgResourceId(R.drawable.shop1);
        shopInfo.setShopRating(4);
        shopInfoList = new ArrayList<ShopInfo>();
        shopInfoList.add(shopInfo);
        shopInfoList.add(shopInfo);
        shopInfoList.add(shopInfo);
        shopInfoList.add(shopInfo);
        shopInfoList.add(shopInfo);
        lvShopInfo = (NoScrollListView) rootView.findViewById(R.id.lv_business_info);
        lvShopInfo.setAdapter(new ShopInfoAdapter(getActivity(), R.layout.shop_cell, shopInfoList));
        return rootView;
    }
}
