package com.example.arjun.aisusc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileDisplay extends AppCompatActivity {

    TextView studentName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String n = getIntent().getStringExtra(OcrCaptureActivity.STUDENT_NAME);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_display);

        studentName = (TextView) findViewById(R.id.text_Name);
        studentName.setText("Name : " + n);
    }

}
