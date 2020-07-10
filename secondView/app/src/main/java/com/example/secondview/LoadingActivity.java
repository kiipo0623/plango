package com.example.secondview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoadingActivity extends AppCompatActivity {
    //첫 화면
    //버튼 안눌러도 자동으로 캘린더뷰로 넘어가도록 수정 예정
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        Button button = (Button)findViewById(R.id.startbutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoadingActivity.this, LoginActivity.class) ;

                startActivity(intent) ;
            }
        });
    }
}
