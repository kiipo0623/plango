package com.example.secondview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class WorkSelectActivity extends AppCompatActivity {
    String todo;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_select);

        TextView textView = (TextView)findViewById(R.id.textView);


        Button button0 = (Button)findViewById(R.id.shopping);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("work");

                myRef.setValue("shopping");

                Toast.makeText(WorkSelectActivity.this, "선택 완료", Toast.LENGTH_SHORT).show();
            }
        });
        Button button1 = (Button)findViewById(R.id.study);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("date/work");
                myRef.setValue("study");

                Toast.makeText(WorkSelectActivity.this, "선택 완료", Toast.LENGTH_SHORT).show();
            }
        });
        Button button2 = (Button)findViewById(R.id.exercise);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("work");

                myRef.setValue("exercise");

                Toast.makeText(WorkSelectActivity.this, "선택 완료", Toast.LENGTH_SHORT).show();
            }
        });
        Button button3 = (Button)findViewById(R.id.date);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("work");

                myRef.setValue("date");

                Toast.makeText(WorkSelectActivity.this, "선택 완료", Toast.LENGTH_SHORT).show();
            }
        });
        Button button4 = (Button)findViewById(R.id.game);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("work");

                myRef.setValue("game");

                Toast.makeText(WorkSelectActivity.this, "선택 완료", Toast.LENGTH_SHORT).show();
            }
        });
        Button button5 = (Button)findViewById(R.id.walk);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("work");

                myRef.setValue("walk");

                Toast.makeText(WorkSelectActivity.this, "선택 완료", Toast.LENGTH_SHORT).show();
            }
        });

        Button button6 = (Button)findViewById(R.id.travel);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("work");

                myRef.setValue("travel");

                Toast.makeText(WorkSelectActivity.this, "선택 완료", Toast.LENGTH_SHORT).show();
            }
        });


        editText = (EditText)findViewById(R.id.ex);


        Button button7 = (Button)findViewById(R.id.add);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                todo = editText.getText().toString();
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("message");

                myRef.setValue(todo);

                Toast.makeText(WorkSelectActivity.this, "입력 완료", Toast.LENGTH_SHORT).show();
            }
        });

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
