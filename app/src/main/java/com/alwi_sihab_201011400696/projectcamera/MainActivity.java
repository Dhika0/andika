package com.alwi_sihab_201011400696.projectcamera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {
    Button btnCamera;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(OpenCVLoader.initDebug()){
            Toast.makeText(MainActivity.this, "library OpenCV berhasil", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(MainActivity.this, "library OpenCV Gaggal", Toast.LENGTH_LONG).show();

        }

        btnCamera = findViewById(R.id.buttonCamera);
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CameraActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
            }
        });
    }
}