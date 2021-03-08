package com.example.ahmed_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button b4 = (Button)findViewById(R.id.button6);
        Button b5 = (Button)findViewById(R.id.button7);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity3.this,MainActivity.class));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity3.this,MainActivity2.class));
            }
        });

        String [] restaurants = {"Alfaisal","Lion","whatsap","facebook"};

        GridView grid = (GridView) findViewById(R.id.grid);
        ArrayAdapter adapter = new ArrayAdapter
                (getApplicationContext(),android.R.layout.simple_list_item_1,
                        restaurants);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int
                    position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alfaisal.edu")));

                        break;
                    case 1:
                        startActivity(new Intent(MainActivity3.this, MainActivity4.class));
                        break;
                }
            }
        });
    }
}