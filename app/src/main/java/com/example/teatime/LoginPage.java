package com.example.teatime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        EditText editTextUsername = findViewById(R.id.editTextUsername);
        EditText editTextPassword = findViewById(R.id.editTextPassword);
        Button btnLogin = findViewById(R.id.btnLogin);

        // Add login button click listener
        btnLogin.setOnClickListener(v -> {
            // Add your login logic here
            // For simplicity, let's just transition to another activity (MainActivity) on successful login
            startActivity(new Intent(LoginPage.this, MainActivity.class));
            finish();
        });
    }
    }
