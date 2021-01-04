package com.jinasoft.study01_ksj.OptionMenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.jinasoft.study01_ksj.R;

public class OptionMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater(); //메뉴를 코드와 연결 하는 부분 메뉴인플레이터를 사용해서 겟메뉴인플레이터 메서드를 얻을수 있음
        inflater.inflate(R.menu.menu_main, menu); // 인플레이터는 메뉴 아이디와 액티비티 메뉴를 연결시켜줌
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){ // 메뉴 아이디별로 행하는 행동들
            case R.id.menu_MN :
                Toast.makeText(this, "첫번째 메뉴", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_MN2 :
                Toast.makeText(this, "두번째 메뉴", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}