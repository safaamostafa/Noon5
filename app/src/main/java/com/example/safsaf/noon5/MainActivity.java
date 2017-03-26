package com.example.safsaf.noon5;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Locale locale = new Locale("ar");//fr is the code for french language
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
        setContentView(R.layout.activity_main);


        // kids
        ImageView imageView= (ImageView)findViewById(R.id.imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent kidsIntent = new Intent(MainActivity.this, KidsActivity.class);
                startActivity(kidsIntent);
            }
        });



        // support
        ImageView imageView2= (ImageView)findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent supportIntent = new Intent(MainActivity.this, SupportActivity.class);
                startActivity(supportIntent);

            }
        });


        // we
        ImageView imageView3= (ImageView)findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent weIntent = new Intent(MainActivity.this, WeActivity.class);
                startActivity(weIntent);

            }
        });


        // story
        ImageView imageView4= (ImageView)findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent storyIntent = new Intent(MainActivity.this, StoryActivity.class);
                startActivity(storyIntent);


            }
        });






    }// protected void onCreate(Bundle savedInstanceState)


}// public class
