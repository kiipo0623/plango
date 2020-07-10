package com.example.secondview;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class StoreActivity extends AppCompatActivity {
    Button likeButton;
    TextView likeCountView;
    Button dislikeButton;
    TextView dislikeCountView;

    int likeCount = 1;
    Boolean likeState = false;
    int dislikeCount = 1;
    Boolean dislikeState = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        likeButton = (Button) findViewById(R.id.likeButton);

        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (likeState){
                    decrLikeCount();
                }else{
                    incrLikeCount();
                }

                likeState = !likeState;
            }
        });
        likeCountView = (TextView) findViewById(R.id.likeCountView);


        dislikeButton = (Button) findViewById(R.id.dislikeButton);

        dislikeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dislikeState){
                    decrDislikeCount();
                }else{
                    incrDislikeCount();
                }

                dislikeState = !dislikeState;
            }
        });
        dislikeCountView = (TextView) findViewById(R.id.dislikeCountView);

    }
    public void incrLikeCount(){
        likeCount+=1;
        likeCountView.setText(String.valueOf(likeCount));
        likeButton.setBackgroundResource(R.drawable.ic_thumb_up_w_24dp);
    }
    public void decrLikeCount(){
        likeCount-=1;
        likeCountView.setText(String.valueOf(likeCount));

        likeButton.setBackgroundResource(R.drawable.thumbs_up_selector);
    }

    public void incrDislikeCount(){
        dislikeCount+=1;
        dislikeCountView.setText(String.valueOf(dislikeCount));
        dislikeButton.setBackgroundResource(R.drawable.ic_thumb_down_w_24dp);
    }
    public void decrDislikeCount(){
        dislikeCount-=1;
        dislikeCountView.setText(String.valueOf(dislikeCount));

        dislikeButton.setBackgroundResource(R.drawable.thumbs_down_selector);
    }

}