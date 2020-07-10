package com.example.secondview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PlaceSelectActivity extends AppCompatActivity {
    EditText editText;
    String place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_select);

        //계획 : DB에서 지하철 역을 가져와서 어떻게 할 생각입니다 !

        editText = (EditText)findViewById(R.id.editText);


        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                place = editText.getText().toString();
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("place");

                myRef.setValue(place);

                Toast.makeText(PlaceSelectActivity.this, "입력 완료", Toast.LENGTH_SHORT).show();
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
