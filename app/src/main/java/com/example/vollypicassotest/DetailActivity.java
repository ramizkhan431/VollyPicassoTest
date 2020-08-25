package com.example.vollypicassotest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static com.example.vollypicassotest.MainActivity.EXTRA_CREATOR;
import static com.example.vollypicassotest.MainActivity.EXTRA_FIRSTNAME;
import static com.example.vollypicassotest.MainActivity.EXTRA_LASTNAME;
import static com.example.vollypicassotest.MainActivity.EXTRA_LIKES;
import static com.example.vollypicassotest.MainActivity.EXTRA_URL;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_URL);
        String creatorName = intent.getStringExtra(EXTRA_CREATOR);
        String firstName = intent.getStringExtra(EXTRA_FIRSTNAME);
        String lastName = intent.getStringExtra(EXTRA_LASTNAME);
        int likeCount = intent.getIntExtra(EXTRA_LIKES, 0);
        ImageView imageView = findViewById(R.id.image_view_detail);
        TextView textViewCreator = findViewById(R.id.text_view_email_detail);
        TextView textViewFirstName = findViewById(R.id.text_view_first_name_detail);
        TextView textViewLastName = findViewById(R.id.text_view_last_name_detail);
        TextView textViewLikes = findViewById(R.id.text_view_id_detail);
        Picasso.with(this).load(imageUrl).fit().centerInside().into(imageView);
        textViewCreator.setText("email: " + creatorName);
        textViewLikes.setText("id: " + likeCount);
        textViewFirstName.setText("First Name: " + firstName);
        textViewLastName.setText("Last Name: " + lastName);

    }
}
