package com.example.safsaf.noon5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class KidsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids);
        // IlliteracyActivity
        Button button7= (Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent illiteracyIntent = new Intent(KidsActivity.this, IlliteracyActivity.class);
                startActivity(illiteracyIntent);


            }
        });

        // PrimaryActivity
        Button button5= (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent primaryIntent = new Intent(KidsActivity.this, PrimaryActivity.class);
                startActivity(primaryIntent);


            }
        });

// PrimaryActivity
        Button button6= (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent preIntent = new Intent(KidsActivity.this, PreActivity.class);
                startActivity(preIntent);


            }
        });

    }//  @Override protected void onCreate(Bundle savedInstanceState) {
}// public class KidsActivity extends AppCompatActivity {
