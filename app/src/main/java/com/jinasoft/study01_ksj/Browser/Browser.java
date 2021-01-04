package com.jinasoft.study01_ksj.Browser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import com.jinasoft.study01_ksj.R;

public class Browser extends AppCompatActivity {

    private WebView webview;
    private EditText Browser_EDT;
    private Button Browser_MoveBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        webview = (WebView) findViewById(R.id.WebBrowser_WV);
        Browser_EDT = (EditText) findViewById(R.id.WebBrowser_URLEDT);
        Browser_MoveBTN = (Button)findViewById(R.id.WebBrowser_MoveBTN);

        WebSettings webSettings = webview.getSettings(); // 웹뷰는 셋팅으로 여러 가지를 설정 가능 그 중 자바스크립트를 사용 하려함
        webSettings.setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());


    }

    public void onClick(View view) {
        String add = Browser_EDT.getText().toString();
        if (add.startsWith("https://") == false){
            add = "https://" + add;
        }
        webview.loadUrl(add);
    }
    //사용자가 https://를 적지않으면 자동으로 https://를 추가해줌 그 로직을 URL로 전달하는 메소드 코드
    // 퍼미션으로 인터넷을 허용해야 에러 안나옴
}