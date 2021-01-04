package com.jinasoft.study01_ksj.ActivityDataSend;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.jinasoft.study01_ksj.R;

public class ActivityDataSend extends AppCompatActivity  implements View.OnClickListener{

    public static final int REQUEST_CODE = 1000;
    private EditText nameEDT;
    private EditText ageEDT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitydatasend); // 메인 액티비티를 컨텐츠 화면에 설정

        nameEDT = (EditText) findViewById(R.id.main_NameEDT);
        ageEDT = (EditText) findViewById(R.id.main_AgeEDT); // id로 할당된 에디트 텍스트를 변수에 대입

        findViewById(R.id.main_SendBTN).setOnClickListener(this); // 버튼 클릭시 이곳을 가리킨다.
    }

    @Override
    public void onClick(View view) {
        Intent mainIn = new Intent(this, ActivityDataSendSecond.class); // 인텐트를 생성해 클릭시 정보들을 액티비티에 넘겨준다.
        mainIn.putExtra("name", nameEDT.getText().toString()); // name이라는 값으로 에디트텍스트에 입력한 스트링값을 저장 + 다른 액티비티랑 값이 틀리면 받아오질 null값을 받음
        mainIn.putExtra("age", ageEDT.getText().toString()); // 위와 원리가 동일

        startActivityForResult(mainIn, REQUEST_CODE); //https://ksb0511.tistory.com/entry/Android-Studio-Request-Code 를 참조
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // 다른 액티비티에서 받는 코드값이랑 데이터 값이 비어있지 않으면
        if(requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null){
            String result = data.getStringExtra("result");
            // 데이터에 있는 스트링값을 리졸트에 집어넣겠다
            Toast.makeText(ActivityDataSend.this, result, Toast.LENGTH_SHORT).show();
            // 여기에 리졸트 값을 토스트 메세지로 표시
        }
    }
}