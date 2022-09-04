package com.example.logintest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter=5;
    EditText name,password;
    Button login;
    TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);


        name=findViewById(R.id.email);
        password=findViewById(R.id.pass);
        login=findViewById(R.id.btn1);
        message=findViewById(R.id.failres);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(name.getText().toString(),password.getText().toString());
            }
        });

    }
    private void validate(String username,String password){
        if(username.equals("likki@gmail.com") && password.equals("u2117033") ) {
            Intent intent = new Intent(MainActivity.this, second.class);
            startActivity(intent);
        }
        else
        {
            counter--;
            if(counter==0)
            {
                message.setText("too many unsuccessfull attempts\n login disabled");
                login.setEnabled(false);
            }
            else {
                message.setText(counter + " tries left");
            }
        }
    }

}