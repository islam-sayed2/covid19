package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(MainActivity4.this, MainActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onStart() {
        Toast.makeText(getApplicationContext(),"الحالات في مصر والعالم", Toast.LENGTH_SHORT).show();

        super.onStart();
    }
private WebView webView;
private WebView webView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        this.getWindow() .setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        webView = (WebView) findViewById(R.id.web);
        webView2 = (WebView) findViewById(R.id.web2);
        webView.setWebViewClient(new WebViewClient());
        webView2.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.worldometers.info/coronavirus/country/egypt/");
        webView2.loadUrl("https://news.google.com/covid19/map?hl=ar&mid=%2Fm%2F02j71&gl=EG&ceid=EG%3Aar");
    }
}