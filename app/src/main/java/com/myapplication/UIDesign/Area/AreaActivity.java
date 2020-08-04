package com.myapplication.UIDesign.Area;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.myapplication.UIDesign.R;

public class AreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        this.setTitle(getClass().getSimpleName());

        Button button1=(Button) findViewById(R.id.AreaButton_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent_showAreaDetails = new Intent(AreaActivity.this, Area_Details.class);
                startActivity(intent_showAreaDetails);
            }
        });
    }
}