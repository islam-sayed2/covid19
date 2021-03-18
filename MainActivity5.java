package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity5 extends AppCompatActivity {
    private WebView webView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        webView4 = (WebView) findViewById(R.id.web4);
        webView4.setWebViewClient(new WebViewClient());
        webView4.loadUrl("https://www.bing.com/covid/local/egypt");



    }
}