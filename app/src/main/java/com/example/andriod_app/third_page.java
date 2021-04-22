package com.example.andriod_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class third_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
    }
    public void btnadd(View view) {
        Intent intent=new Intent(this,add_page.class);
        startActivity(intent);
    }

    public void btndelete(View view) {
        Intent intent=new Intent(this,delete_page.class);
        startActivity(intent);


    }

    public void btnview(View view) {
        Intent intent=new Intent(this,view_page.class);
        startActivity(intent);


    }

    public void btnupdate(View view) {
        Intent intent=new Intent(this,update.class);
        startActivity(intent);
    }

    public void btninput(View view) {
        Intent intent=new Intent(this,Input_page.class);
        startActivity(intent);

    }
}
