package com.example.splarklycleanproo;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WorkerReview extends AppCompatActivity {

    TextView tvFeedback;
    RatingBar rbStars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_review);

        tvFeedback = findViewById(R.id.tvFeedback);
        rbStars = findViewById(R.id.rbStars);

        rbStars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (rating == 0) {
                    tvFeedback.setText("Very disatisfied");
                } else if (rating == 1) {
                    tvFeedback.setText("Disatisfied");
                } else if (rating == 2 || rating == 3) {
                    tvFeedback.setText("OK");
                } else if (rating == 4) {
                    tvFeedback.setText("Satisfied");
                } else if (rating == 5) {
                    tvFeedback.setText(" Very Satisfied");
                } else {
                }
            }
        });
    }
}