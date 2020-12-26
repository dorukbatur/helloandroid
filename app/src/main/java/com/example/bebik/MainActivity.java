package com.example.bebik;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtEmail,edtPassword;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEmail = findViewById(R.id.textViewEmail);
        edtPassword  = findViewById(R.id.textViewPassword);
        btnLogin = findViewById(R.id.buttonLogin);

        final String strEmail = "asdfg@asdfg.com";
        final String strpassword = "bebik123";

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (strEmail.equals(edtEmail.getText().toString().trim()) && strpassword.equals(edtPassword.getText().toString().trim())){
                    Intent intent = new Intent(MainActivity.this,HomePageActivity.class);
                    startActivity(intent);
                }
            }
        });


    }
}