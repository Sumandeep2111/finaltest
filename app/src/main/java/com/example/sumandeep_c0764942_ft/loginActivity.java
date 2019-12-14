package com.example.sumandeep_c0764942_ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {
     TextView textView;
     EditText editText1;
     EditText editText2;
     EditText editText3;
     Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textView = findViewById(R.id.Label);
        editText1 = findViewById(R.id.name);
        editText2 = findViewById(R.id.email);
        editText3 = findViewById(R.id.phone);
        button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                Intent intent = new Intent(loginActivity.this,verification.class);
                startActivity(intent);
            }
        });
    }
}
