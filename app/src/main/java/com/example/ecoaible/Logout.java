package com.example.ecoaible;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Logout extends AppCompatActivity {
TextView name;
Button logout;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logout);

        name = findViewById(R.id.name);

        String username = getIntent().getStringExtra("keyname");
         name.setText(username);

        logout=(Button)findViewById(R.id.logout );
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Logout.this,Login.class);
                startActivity(i);
            }
        });
    }
}