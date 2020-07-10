package com.example.secondview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {
    Button likeButton;
    TextView likeCountView;
    TextView unlikeCountView;
    Button unlikeButton;


    int likeCount = 1;
    boolean likeState = false;
    int unlikeCount = 1;
    boolean unlikeState = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        likeButton = (Button) findViewById(R.id.likeButton);
        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (likeState) {
                    decrLikeCount();
                } else {
                    incrLikeCount();
                }
                likeState = !likeState;
            }


        });
        likeCountView = (TextView) findViewById(R.id.likeCountView);

        unlikeButton = (Button) findViewById(R.id.unlikeButton);
        unlikeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (unlikeState) {
                    undecreLikeCount();
                } else {
                    unincrlikeCount();
                }

                unlikeState = !unlikeState;
            }
        });

        unlikeCountView = (TextView) findViewById(R.id.unlikeCountView);

    }

    public void incrLikeCount() {
        likeCount += 1;
        likeCountView.setText(String.valueOf(likeCount));

        likeButton.setBackgroundResource(R.drawable.ic_thumb_up_w_24dp);
    }

    public void decrLikeCount() {
        likeCount -= 1;
        likeCountView.setText(String.valueOf(likeCount));

        likeButton.setBackgroundResource(R.drawable.thumbs_up_selector);
    }

    public void unincrlikeCount() {
        unlikeCount += 1;
        unlikeCountView.setText(String.valueOf(unlikeCount));

        unlikeButton.setBackgroundResource(R.drawable.ic_thumb_down_w_24dp);
    }

    public void undecreLikeCount(){
        unlikeCount -= 1;
        unlikeCountView.setText(String.valueOf(unlikeCount));

        unlikeButton.setBackgroundResource(R.drawable.thumbs_down_selector);

    }

}



