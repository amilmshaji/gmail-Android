package com.example.gmail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e1= (EditText) findViewById(R.id.ed1);
        EditText e2= (EditText) findViewById(R.id.ed2);
        EditText pass= (EditText) findViewById(R.id.ed3);


        Button btn= (Button) findViewById(R.id.b1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gmail=e1.getText().toString();
                String phone=e2.getText().toString();
                String password=pass.getText().toString();
                Intent intent=new Intent(getApplicationContext(),changepassword.class);
                startActivity(intent);


            }
        });


    }
}