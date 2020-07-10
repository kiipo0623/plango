package com.example.secondview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.Time;
import java.util.Calendar;

public class TimeSelectActivity extends AppCompatActivity {
    String starttime;
    EditText startedit;
    String finishtime;
    EditText finishedit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_select);


        startedit = (EditText)findViewById(R.id.starttime);


        Button buttonstart = (Button)findViewById(R.id.start);
        buttonstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                starttime = startedit.getText().toString();
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("starttime");

                myRef.setValue(starttime);

                Toast.makeText(TimeSelectActivity.this, "입력 완료", Toast.LENGTH_SHORT).show();
            }
        });

        finishedit = (EditText)findViewById(R.id.endtime);


        Button buttonend = (Button)findViewById(R.id.end);
        buttonend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishtime = finishedit.getText().toString();
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("finishtime");

                myRef.setValue(finishtime);

                Toast.makeText(TimeSelectActivity.this, "입력 완료", Toast.LENGTH_SHORT).show();
            }
        });

        Button buttonback = (Button)findViewById(R.id.back);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
