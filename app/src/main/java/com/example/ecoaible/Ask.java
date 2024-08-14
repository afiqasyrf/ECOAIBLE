package com.example.ecoaible;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Ask extends AppCompatActivity {


    String[] item = {"1","2","3","4","5","6","7","8"};

  Button next;
  TextView guide;
    AutoCompleteTextView autoCompleteTextView;

    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ask);

        autoCompleteTextView = findViewById(R.id.auto_complete_textview);

        adapterItems= new ArrayAdapter<String>(this,R.layout.list_item,item);

        autoCompleteTextView.setAdapter(adapterItems);


        guide= (TextView) findViewById(R.id.guide );
        guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(Ask.this,Guide.class);
                startActivity(i);
            }
        });
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            String username = getIntent().getStringExtra("keyname");
            @Override
            public void onItemClick(AdapterView<?> adapterView,View view,int position,long l) {
                String item = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(Ask.this,"item " + item,Toast.LENGTH_SHORT).show();
                next=(Button)findViewById(R.id.next );
                next.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View v) {


                         if(item == "1" || item == "2")
                         {
                             Intent i = new Intent(Ask.this, Notready.class);
                             startActivity(i);

                         }
                         else if(item == "7" || item == "8")
                         {
                             Intent i = new Intent(Ask.this, Late.class);
                             startActivity(i);

                         }

                         else {

                             Intent i = new Intent(Ask.this, CropHarvestActivity.class);
                             i.putExtra("keyname",username);
                             startActivity(i);
                         }


                    }
                });


            }
        });




    }
}