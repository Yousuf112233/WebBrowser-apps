package com.webbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button clickbutton;
    TextView mytexview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mytexview =findViewById(R.id.mytexview);
        clickbutton =findViewById(R.id.clickbutton);
        clickbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mytexview.setText("allah Rohom koro onack kosto holo");
            }
        });

        mytexview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickbutton.setText("allah khoma koro");
            }
        });








    }
}