package com.luqman.uts.katalogstarfieldbuku;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Bantuan extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);
        final WebView webView = (WebView)findViewById(R.id.webView);
        WebSettings webViewSettings = webView.getSettings();
        webViewSettings.setDefaultFontSize(12);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/bantuan.html");

    }

}