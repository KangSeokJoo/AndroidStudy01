package com.jinasoft.study01_ksj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jinasoft.study01_ksj.ActionCall.ActionCall;
import com.jinasoft.study01_ksj.ActivityDataSend.ActivityDataSend;
import com.jinasoft.study01_ksj.AppInQuest.AppInQuest;
import com.jinasoft.study01_ksj.Browser.Browser;
import com.jinasoft.study01_ksj.KakaoMessage.KakaoMessage;
import com.jinasoft.study01_ksj.OptionMenu.OptionMenu;
import com.jinasoft.study01_ksj.ScrollView.ScrollView;


public class SelectStudyList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_study_list);

    }

    public void Go_Act7(View view){
        Intent intent = new Intent(this, ScrollView.class);
        startActivity(intent);
    }
    public void Go_Act6(View view){
        Intent intent = new Intent(this, Browser.class);
        startActivity(intent);
    }
    public void Go_Act5(View view){
        Intent intent = new Intent(this, OptionMenu.class);
        startActivity(intent);
    }
    public void Go_Act4(View view){
        Intent intent = new Intent(this, AppInQuest.class);
        startActivity(intent);
    }
    public void Go_Act3(View view){
        Intent intent = new Intent(this, KakaoMessage.class);
        startActivity(intent);
    }
    public void Go_Act2(View view){
        Intent intent = new Intent(this, ActionCall.class);
        startActivity(intent);
    }
    public void Go_Act1(View view){
        Intent intent = new Intent(this, ActivityDataSend.class);
        startActivity(intent);
    }

}