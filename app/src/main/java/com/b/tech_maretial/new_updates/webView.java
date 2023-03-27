package com.b.tech_maretial.new_updates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class webView extends AppCompatActivity {
WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        wv=findViewById(R.id.webview);
        Bundle intent=getIntent().getExtras();
        String url=intent.getString("url");
        wv.loadUrl(url);
        wv.getSettings().setJavaScriptEnabled(true);
    }
}