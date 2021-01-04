package com.jinasoft.study01_ksj.AppInQuest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jinasoft.study01_ksj.R;

public class AppInQuest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appin_quest);
    }

    public void moveParentActivity(View view) {
        startActivity(new Intent(this, ParentActivity.class)); // 액티비티 넘어가는건 생략하겠음
    }
}