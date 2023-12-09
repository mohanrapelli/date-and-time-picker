package com.example.dateandtimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatePicker datePicker;
    Button button,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker=findViewById(R.id.dd);
        button=findViewById(R.id.button);
        button3=findViewById(R.id.buttonn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
String day=String.valueOf(datePicker.getDayOfMonth());
                String month=String.valueOf(datePicker.getMonth()+1);
                String year=String.valueOf(datePicker.getYear());
                Toast.makeText(MainActivity.this, "you selected"  +day  +"/"+month+"/" +year, Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i) ;
            }
        });
    }
}