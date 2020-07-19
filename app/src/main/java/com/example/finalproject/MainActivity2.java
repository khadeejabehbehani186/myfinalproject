package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2<TextInputLayout> extends AppCompatActivity {
    private TextInputLayout textInputEmail;
    private TextInputLayout textInputUsername;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText username = findViewById(R.id.textView3);
        final EditText password = findViewById(R.id.textView4);

        Button SignUp = findViewById(R.id.button);

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = username.getText().toString();
        if (username.getText().toString().equals("khadeeja") && password.getText().toString().equals("333")) {
            Intent i = new Intent(MainActivity2.this, MainActivity3.class);
            i.putExtra("data", name);
            startActivity(i);
        } else {
            Toast.makeText(MainActivity2.this, "WRONG PASSWORD OR USERNAME", Toast.LENGTH_LONG).show();
        }
    }
    });
        }


    }
