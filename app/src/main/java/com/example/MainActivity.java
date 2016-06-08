package com.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstName;
    EditText middleName;
    EditText lastName;
    Button fullName;
    TextView fullNameText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getBaseContext(),"LayoutDemo",Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);

        firstName = (EditText) findViewById(R.id.firstName);
        middleName = (EditText) findViewById(R.id.middleName);
        lastName = (EditText) findViewById(R.id.lastName);
        fullName = (Button) findViewById(R.id.display);
        fullNameText = (TextView) findViewById(R.id.fullNameText);

        fullName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fullNameText.setText(

                        firstName.getText().toString()+
                        middleName.getText().toString()+
                        lastName.getText().toString()
                );
            }
        });
    }
}
