package com.jinasoft.study01_ksj.KakaoMessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.jinasoft.study01_ksj.R;

public class KakaoMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kakao_message);
    }
    // 가상 디바이스라 카카오톡 호환 x

    public void sendMessage(View view){
        EditText Kakao_EDT = (EditText)findViewById(R.id.Kakao_EDT);

        Intent kakaoIn = new Intent(Intent.ACTION_SEND);
        kakaoIn.setType("text/plain"); // 그래픽 표현이나 그 밖의 오브젝트가 아닌 읽을 수 있는 자료 텍스트 플레인
        kakaoIn.putExtra(Intent.EXTRA_TEXT, Kakao_EDT.getText().toString());

        //처리할 수 있는 액티비티가 있으면 그 액티비티를 실행
        if (kakaoIn.resolveActivity(getPackageManager()) != null){
            startActivity(kakaoIn);
        }
   }
}