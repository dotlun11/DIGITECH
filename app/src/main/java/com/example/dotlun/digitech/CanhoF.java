package com.example.dotlun.digitech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class CanhoF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canho_f);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        WebView webViewf = (WebView)this.findViewById(R.id.webViewF);
        webViewf.setWebChromeClient(new WebChromeClient());
        webViewf.getSettings().setJavaScriptEnabled(true);
        webViewf.loadUrl("http://vr360vn.com/du-an-360/ihome-pham-van-chieu-can-ho-F/");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
