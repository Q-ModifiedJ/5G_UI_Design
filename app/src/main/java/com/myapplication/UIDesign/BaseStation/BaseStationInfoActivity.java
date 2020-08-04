package com.myapplication.UIDesign.BaseStation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.myapplication.UIDesign.R;

public class BaseStationInfoActivity extends AppCompatActivity {
    private BaseStationInfoItem baseStationInfoItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_station_info);

        Intent intent=getIntent();
        String address=intent.getStringExtra("address");
        getBaseStationInfoItem(address);
        this.setTitle(address);
        showInfo();
    }

    private void getBaseStationInfoItem(String address){
        baseStationInfoItem=new BaseStationInfoItem(address);
        baseStationInfoItem.setCity("南京EMBB");
        baseStationInfoItem.setCommunity("雨花台区");
        baseStationInfoItem.setDeploymentStatus("Failure");
        baseStationInfoItem.setOperatingStatus("Normal");
        baseStationInfoItem.setRemarks("xxxxxxxxxxxxxxxx");
        baseStationInfoItem.setTime("2020-04-12 20:55:21");
        baseStationInfoItem.setUNIInterface("ETH 2/3/4");
        baseStationInfoItem.setVpnName("eMBB");
        baseStationInfoItem.setType("gNodeB");
    }

    private void showInfo(){
        TextView textView=(TextView)findViewById(R.id.base_station_info_city);
        textView.setText("地市                     "+baseStationInfoItem.getCity());
        textView=(TextView)findViewById(R.id.base_station_info_community);
        textView.setText("区                          "+baseStationInfoItem.getCommunity());
        textView=(TextView)findViewById(R.id.base_station_info_deploymentStatus);
        textView.setText("上线状态             "+baseStationInfoItem.getDeploymentStatus());
        textView=(TextView)findViewById(R.id.base_station_info_operatingStatus);
        textView.setText("运行状态             "+baseStationInfoItem.getOperatingStatus());
        textView=(TextView)findViewById(R.id.base_station_info_Remarks);
        textView.setText("备注                     "+baseStationInfoItem.getRemarks());
        textView=(TextView)findViewById(R.id.base_station_info_time);
        textView.setText("上线时间             "+baseStationInfoItem.getTime());
        textView=(TextView)findViewById(R.id.base_station_info_type);
        textView.setText("类型                      "+baseStationInfoItem.getType());
        textView=(TextView)findViewById(R.id.base_station_info_UNIInterface);
        textView.setText("UNIInterface       "+baseStationInfoItem.getUNIInterface());
        textView=(TextView)findViewById(R.id.base_station_info_vpnName);
        textView.setText("VpnName            "+baseStationInfoItem.getVpnName());
    }
}