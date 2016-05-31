package com.jniu.baidutakeoutui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.jniu.baidutakeoutui.R;
import com.jniu.baidutakeoutui.adapter.MeItemAdapter;
import com.jniu.baidutakeoutui.bean.ItemEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/9/8.
 */
public class MeFragment extends Fragment {

    private ListView meListView;
    private List<List<ItemEntity>> meDatas;
    private MeItemAdapter meItemAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_me, container, false);
        meListView= (ListView) rootView.findViewById(R.id.meListview);
        initData();
        return rootView;
    }
    private void initData() {
        meDatas=new ArrayList<>();
        List<ItemEntity> items1=new ArrayList<>();
        items1.add(new ItemEntity(R.drawable.mypage_list_icon_location,"test",null));
        items1.add(new ItemEntity(R.drawable.mypage_list_icon_location,"test",null));
        items1.add(new ItemEntity(R.drawable.mypage_list_icon_location,"test",null));

        List<ItemEntity> items2=new ArrayList<>();
        items2.add(new ItemEntity(R.drawable.mypage_list_icon_location,"test",null));
        items2.add(new ItemEntity(R.drawable.mypage_list_icon_location,"test",null));
        items2.add(new ItemEntity(R.drawable.mypage_list_icon_location,"test",null));

        List<ItemEntity> items3=new ArrayList<>();
        items3.add(new ItemEntity(R.drawable.mypage_list_icon_location,"test",null));
        items3.add(new ItemEntity(R.drawable.mypage_list_icon_location,"test",null));
        items3.add(new ItemEntity(R.drawable.mypage_list_icon_location,"test",null));


        meDatas.add(items1);
        meDatas.add(items2);
        meDatas.add(items3);

        meItemAdapter=new MeItemAdapter(getActivity(),meDatas);
        meListView.setAdapter(meItemAdapter);


    }
}
