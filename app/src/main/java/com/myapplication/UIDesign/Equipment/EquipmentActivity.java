package com.myapplication.UIDesign.Equipment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.myapplication.UIDesign.R;

public class EquipmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment);
        this.setTitle(getClass().getSimpleName());
    }
}
