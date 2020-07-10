package com.example.secondview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TableLayout tableLayout;

    Button timeselector;
    Button workselector;
    Button placeselector;
    Button recommendation;

    DatabaseReference mDBReference;
    String time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.title);

        tableLayout = (TableLayout)findViewById(R.id.myTableLayout);
        TableRow tableRow = (TableRow)findViewById(R.id.head);

        Intent incomingIntent = getIntent(); // intent 생성
        String date = incomingIntent.getStringExtra("date");
        textView.setText(date);

        final Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                addNewRow();

                timeselector.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, TimeSelectActivity.class) ;

                        startActivity(intent) ;
                    }
                });

                workselector.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, WorkSelectActivity.class) ;

                        startActivity(intent) ;
                    }
                });

                placeselector.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, PlaceSelectActivity.class) ;

                        startActivity(intent) ;
                    }
                });

                recommendation.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, RecommendActivity.class);

                        startActivity(intent) ;
                    }
                });
            }
        });



        Button gobackbutton = (Button)findViewById(R.id.backcalendar);
        gobackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void addNewRow(){
        TableRow tr = new TableRow(this);
        tr.setLayoutParams(new TableRow.LayoutParams(

                TableLayout.LayoutParams.WRAP_CONTENT
        ));
        timeselector = new Button(this);
        timeselector.setText("time");
        timeselector.setBackgroundColor(getResources().getColor(R.color.colorBack));

        timeselector.setLayoutParams(new TableRow.LayoutParams(

                TableLayout.LayoutParams.WRAP_CONTENT
        ));




        tr.addView(timeselector);

        workselector = new Button(this);
        workselector.setText("work");
        workselector.setBackgroundColor(getResources().getColor(R.color.colorBack));
        workselector.setLayoutParams(new TableRow.LayoutParams(

                TableLayout.LayoutParams.WRAP_CONTENT
        ));

        tr.addView(workselector);

        placeselector = new Button(this);
        placeselector.setText("place");
        placeselector.setBackgroundColor(getResources().getColor(R.color.colorBack));
        placeselector.setLayoutParams(new TableRow.LayoutParams(

                TableLayout.LayoutParams.WRAP_CONTENT
        ));

        tr.addView(placeselector);

        tableLayout.addView(tr, new TableLayout.LayoutParams(
                TableLayout.LayoutParams.FILL_PARENT,
                TableLayout.LayoutParams.WRAP_CONTENT
        ));

        recommendation = new Button(this);
        recommendation.setText("show");
        recommendation.setBackgroundColor(getResources().getColor(R.color.colorBack));
        recommendation.setLayoutParams(new TableRow.LayoutParams(

                TableLayout.LayoutParams.WRAP_CONTENT
        ));

        recommendation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecommendActivity.class);
                startActivity(intent) ;
            }
        });


        tr.addView(recommendation);

    }


    }
