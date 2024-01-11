package com.example.teatime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.SaveInfo;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        EditText editTextUsername = findViewById(R.id.editTextUsername1);
        EditText editTextEmail = findViewById(R.id.editTextEmail1);
        EditText editTextPassword = findViewById(R.id.editTextPassword1);
        Button btnLogin = findViewById(R.id.btnLogin1);

        // Add login button click listener
        btnLogin.setOnClickListener(v -> {
            // Add your login logic here
            // For simplicity, let's just transition to another activity (MainActivity) on successful login
            startActivity(new Intent(SignUp.this, MainActivity.class));
            finish();
        });
    }
    }
