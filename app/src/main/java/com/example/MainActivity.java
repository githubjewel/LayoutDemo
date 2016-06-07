package com.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getBaseContext(),"LayoutDemo",Toast.LENGTH_LONG).show();
        setContentView(R.layout.linear_demo);
    }
}
