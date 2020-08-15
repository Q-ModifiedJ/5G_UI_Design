package com.myapplication.UIDesign;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class tabMenu extends AppCompatActivity implements View.OnClickListener{
    private TextView overview,area,equipment,baseStation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void initTabMenu(){
        overview=(TextView)findViewById(R.id.tab_menu_overview);
        Drawable drawable=getResources().getDrawable(R.drawable.tab_menu_overview);
        drawable.setBounds(0,0,65,65);
        overview.setCompoundDrawables(null,drawable,null,null);
        area=(TextView)findViewById(R.id.tab_menu_area);
        drawable=getResources().getDrawable(R.drawable.tab_menu_area);
        drawable.setBounds(0,0,65,65);
        area.setCompoundDrawables(null,drawable,null,null);
        equipment=(TextView)findViewById(R.id.tab_menu_equipment);
        drawable=getResources().getDrawable(R.drawable.tab_menu_equipment);
        drawable.setBounds(0,0,65,65);
        equipment.setCompoundDrawables(null,drawable,null,null);
        baseStation=(TextView)findViewById(R.id.tab_menu_base_station);
        drawable=getResources().getDrawable(R.drawable.tab_menu_base_station);
        drawable.setBounds(0,0,65,65);
        baseStation.setCompoundDrawables(null,drawable,null,null);

        overview.setSelected(false);
        area.setSelected(false);
        equipment.setSelected(false);
        baseStation.setSelected(false);

        overview.setOnClickListener(this);
        area.setOnClickListener(this);
        equipment.setOnClickListener(this);
        baseStation.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.tab_menu_overview:
                overview.setSelected(true);
                //overview.setVisibility(View.INVISIBLE);
                intent=new Intent("android.intent.action.MAIN");
                startActivity(intent);
                break;
            case R.id.tab_menu_area:
                area.setSelected(true);
                //overview.setVisibility(View.INVISIBLE);
                intent=new Intent("com.myapplication.UIDesign.Area.AreaActivity");
                startActivity(intent);
                break;
            case R.id.tab_menu_equipment:
                equipment.setSelected(true);
                //overview.setVisibility(View.INVISIBLE);
                intent=new Intent("com.myapplication.UIDesign.Equipment.EquipmentActivity");
                startActivity(intent);
                break;
            case R.id.tab_menu_base_station:
                baseStation.setSelected(true);
                //overview.setVisibility(View.INVISIBLE);
                intent=new Intent("com.myapplication.UIDesign.BaseStation.BaseStationActivity");
                startActivity(intent);
                break;
        }


    }
}
