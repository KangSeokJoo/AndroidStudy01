package com.jinasoft.study01_ksj.ActionCall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.EditText;

import com.jinasoft.study01_ksj.R;

public class ActionCall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_call);
    }

    public void dialPhone(View view){
        EditText CallNum_EDT = (EditText) findViewById(R.id.actcall_CallNumEDT);
        dialPhoneNumber(CallNum_EDT.getText().toString());
        //다이얼폰넘버라는 메소드에 입력한 전화번호를 문자열로 갖구와라
    }

    public void dialPhoneNumber(String string) {
        Intent ActcallIn = new Intent(Intent.ACTION_DIAL); // 암시적 인텐트에 다이얼을 열도록함
        ActcallIn.setData(Uri.parse("tel:" + string)); // uri 형태의 전화번호를 데이터로 설정 여기서 tel: 부분은 포맷임 다르게 수정하면 못찾음

        if(ActcallIn.resolveActivity(getPackageManager()) != null){
            startActivity(ActcallIn);
        } //이러한 인텐트를 처리할 수 있는 액티비티를 찾았다면 시작
    }


}