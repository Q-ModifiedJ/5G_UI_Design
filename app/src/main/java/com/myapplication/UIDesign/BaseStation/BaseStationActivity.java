package com.myapplication.UIDesign.BaseStation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.myapplication.UIDesign.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 基站主界面
 */
public class BaseStationActivity extends AppCompatActivity {
    private List<BaseStationItem> baseStationItems=new ArrayList<>();//主界面信息

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_station);
        this.setTitle(getClass().getSimpleName());//设置标题

        InitBaseStationItems();//信息初始化，可以拓展成接口
        //对信息的展示
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.base_station_recycler_view);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        BaseStationItemAdapter baseStationItemAdapter=new BaseStationItemAdapter(baseStationItems);
        recyclerView.setAdapter(baseStationItemAdapter);
    }

    /**
     * 简单地初始化信息
     */
    public void InitBaseStationItems(){
        BaseStationItem baseStationItem1=new BaseStationItem("CentralPark-Ring1-gNodeB1",
                "上线状态   Failure","运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem1);
        BaseStationItem baseStationItem2=new BaseStationItem("CentralPark-Ring1-gNodeB2",
                "上线状态   Online","运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem2);
        BaseStationItem baseStationItem3=new BaseStationItem("CentralPark-Ring1-gNodeB3",
                "上线状态   Planning","运行状态   Unknown",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem3);
        BaseStationItem baseStationItem4=new BaseStationItem("CentralPark-Ring1-gNodeB4",
                "上线状态   Planning","运行状态   Unknown",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem4);
        BaseStationItem baseStationItem5=new BaseStationItem("CentralPark-Ring1-gNodeB5",
                "上线状态   Planning","运行状态   Unknown",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem5);
        BaseStationItem baseStationItem6=new BaseStationItem("CentralPark-Ring1-gNodeB6",
                "上线状态   Planning","运行状态   Unknown",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem6);
    }
}