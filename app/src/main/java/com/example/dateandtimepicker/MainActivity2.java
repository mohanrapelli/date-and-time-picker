package com.example.dateandtimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TimePicker timePicker;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button1=findViewById(R.id.button1);
        timePicker=findViewById(R.id.tp);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a= String.valueOf(timePicker.getHour());
                String b=String.valueOf(timePicker.getMinute());
                Toast.makeText(MainActivity2.this, "the time is"+ a +":"+ b, Toast.LENGTH_SHORT).show();



            }
        });
    }
}