package com.example.ecoaible;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Menu extends AppCompatActivity {
    LinearLayout crop;
    LinearLayout chatbot,chat,disease;
    ImageView profile;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        disease=(LinearLayout) findViewById(R.id.disease );
        disease.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i=new Intent(Menu.this,Disease.class);

                startActivity(i);
            }
        });
        chat=(LinearLayout) findViewById(R.id.chat );
        chat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               Intent i=new Intent(Menu.this,Chat.class);

                startActivity(i);
            }
        });

        profile=(ImageView) findViewById(R.id.profile );
        profile.setOnClickListener(new View.OnClickListener() {
            String username = getIntent().getStringExtra("keyname");
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Menu.this,Logout.class);
                i.putExtra("keyname",username);
                startActivity(i);
            }
        });
        crop=(LinearLayout)findViewById(R.id.crop );
        crop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Menu.this,Ask.class);
                startActivity(i);
            }
        });
        chatbot= (LinearLayout) findViewById(R.id.chatbot );
        chatbot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(Menu.this,Chatbot.class);
                startActivity(i);
            }
        });
    }
}