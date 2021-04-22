package com.example.andriod_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class frst_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frst_page);
    }

    public void btnsuppliers(View view) {
        Intent intent=new Intent(this,Login_page.class);
        startActivity(intent);
    }

    public void btncustomers(View view) {
        Intent intent=new Intent(this,customer_login.class);
        startActivity(intent);
    }
}