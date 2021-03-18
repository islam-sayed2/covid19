package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onStart() {
        Toast.makeText(getApplicationContext(),"تعرف علي فيروس كورونا", Toast.LENGTH_SHORT).show();

        super.onStart();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        this.getWindow() .setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);



    }
}