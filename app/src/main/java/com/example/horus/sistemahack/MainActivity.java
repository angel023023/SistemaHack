package com.example.horus.sistemahack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    String url = "https://www.horus-innovations.com/apk";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView web = (WebView) findViewById (R.id.Visor);
           web.setWebViewClient(new MyWebViewClient());

        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.loadUrl (url);
    }

    private class  MyWebViewClient extends WebViewClient

    {

        public  boolean shouldOverrideUrlLoading(WebView View, String url) {
            View.loadUrl (url);
            return true;
        }

    }

}
