package com.example.ahmed_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {
    String Name, gender, instructor;
    String reservation;
    Button sub =(Button)findViewById(R.id.button3);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final EditText name =(EditText)findViewById(R.id.editTextTextPersonName);
        final EditText date =(EditText)findViewById(R.id.editTextNumber);
        RadioButton r1 =(RadioButton)findViewById(R.id.radioButton);
        RadioButton r2=(RadioButton)findViewById(R.id.radioButton2);
        RadioButton r3 =(RadioButton)findViewById(R.id.radioButton3);
        RadioButton r4=(RadioButton)findViewById(R.id.radioButton4);

        Button b1=(Button)findViewById(R.id.button4);
        Button b2=(Button)findViewById(R.id.button5);

        TextView result =(TextView)findViewById(R.id.textView4);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(MainActivity2.this, d, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Name=name.getText().toString();

                if(r1.isChecked()){
                    gender="Mr";
                }
                if(r2.isChecked()){
                    gender="Miss";
                }
                if(r3.isChecked()){
                    instructor="Instructor";
                }
                if(r4.isChecked()){
                    gender="Student";
                }
                result.setText("Hi "+gender+" "+Name+", You are "+reservation+" years old");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity3.class));
            }
        });


    }

    Calendar c= Calendar.getInstance();
    DateFormat fmtDate=DateFormat.getDateInstance();
    DatePickerDialog.OnDateSetListener d =new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            c.set(Calendar.YEAR,year);
            c.set(Calendar.MONTH,month);
            c.set(Calendar.DAY_OF_MONTH,dayOfMonth);
            reservation= ("Your reservation is: "+fmtDate.format(c.getTime().toString()));
        }
    };

    }
