package com.example.gmail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class changepassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changepassword);
        EditText newpass= (EditText) findViewById(R.id.p);
        EditText cpass= (EditText) findViewById(R.id.cp);
        TextView v= (TextView) findViewById(R.id.tv);


        Button btn= (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String new_pass=newpass.getText().toString();
                String con_pass=cpass.getText().toString();
                if(new_pass.equals(con_pass))
                {
                    v.setText("Password is changed");

                }
            }
        });
    }
}