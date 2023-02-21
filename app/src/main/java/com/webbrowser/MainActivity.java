package com.webbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {


    WebView mwebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mwebView=findViewById(R.id.mwebView);
        mwebView.getSettings().setJavaScriptEnabled(true);
        mwebView.loadUrl("https://www.linkedin.com/company/ifad-multi-products-limited/?originalSubdomain=bd");



    }
}