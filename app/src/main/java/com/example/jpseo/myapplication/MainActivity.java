package com.example.jpseo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button01;
    ImageView imageView01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        button01 = (Button) findViewById(R.id.button_01);
        imageView01 = (ImageView) findViewById(R.id.imageView);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView01.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, R.string.button_answer, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
