package com.example.arjun.aisusc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button textReader;
    Button barCodeReader;
    Button savePicture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textReader = (Button) findViewById(R.id.btn_TextReader);
        barCodeReader = (Button) findViewById(R.id.btn_BarCodeReader);
        savePicture = (Button) findViewById(R.id.btn_SavePic);

        textReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        OcrCaptureActivity.class);
                startActivity(myIntent);
            }
        });

        barCodeReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Picture Saved in Gallery", Toast.LENGTH_SHORT).show();
            }
        });

        savePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Picture Saved in Gallery", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
