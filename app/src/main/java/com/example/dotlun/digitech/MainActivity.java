package com.example.dotlun.digitech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton imageA,imageD,imageF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageA = (ImageButton)findViewById(R.id.imagebtnA);
        imageD = (ImageButton)findViewById(R.id.imagebtnD);
        imageF = (ImageButton)findViewById(R.id.imagebtnF);
        //Activity A209M
        imageA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CanhoA209.class);
                startActivity(intent);
            }
        });
        //Activity D
        imageD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intentd = new Intent(MainActivity.this,CanhoD.class);
                startActivity(intentd);
            }
        });
        //Activity F
        imageF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentf = new Intent(MainActivity.this,CanhoF.class);
                startActivity(intentf);
            }
        });
    }
}
