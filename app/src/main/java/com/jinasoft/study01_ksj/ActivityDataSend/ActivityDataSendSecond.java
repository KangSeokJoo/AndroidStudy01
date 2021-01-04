package com.jinasoft.study01_ksj.ActivityDataSend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jinasoft.study01_ksj.R;

public class ActivityDataSendSecond extends AppCompatActivity implements View.OnClickListener{

    private TextView secondTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitydatasendsecond);

        Intent secondIn = getIntent();
        String name = secondIn.getStringExtra("name");
        String age = secondIn.getStringExtra("age");

        secondTV = (TextView) findViewById(R.id.secound_resultTV);
        secondTV.setText(age + "살\t" + name);

        findViewById(R.id.secound_sendBTN).setOnClickListener(this); // 버튼 이벤트를 가리킴
    }

    @Override
    public void onClick(View view) {
        Intent secondIn2 = new Intent();
        secondIn2.putExtra("result", secondTV.getText().toString());

        setResult(RESULT_OK, secondIn2);
        // 리졸트값에 결과를 전달한다.
        finish();
        //액티비티 종료
    }
}