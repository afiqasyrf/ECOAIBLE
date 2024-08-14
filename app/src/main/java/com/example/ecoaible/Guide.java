package com.example.ecoaible;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Guide extends AppCompatActivity {
LinearLayout sweetpotato,sweetcorn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide);

        sweetpotato= (LinearLayout) findViewById(R.id.sweetpotato);
        sweetpotato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(Guide.this,Sweetpotato.class);
                startActivity(i);
            }
        });

        sweetcorn= (LinearLayout) findViewById(R.id.sweetcorn);
        sweetcorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(Guide.this,Sweetcorn.class);
                startActivity(i);
            }
        });
    }


}