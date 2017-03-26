package com.example.safsaf.noon5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PrimaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary);
        // one
        Button button1= (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent oneIntent = new Intent(PrimaryActivity.this, OneActivity.class);
                startActivity(oneIntent);

            }
        });
// two
        Button button2= (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent twoIntent = new Intent(PrimaryActivity.this, TwoActivity.class);
                startActivity(twoIntent);

            }
        });

        // three
        Button button3= (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent threeIntent = new Intent(PrimaryActivity.this, ThreeActivity.class);
                startActivity(threeIntent);

            }
        });

        // four
        Button button4= (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent fourIntent = new Intent(PrimaryActivity.this, FourActivity.class);
                startActivity(fourIntent);

            }
        });
        // five
        Button button5= (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent fiveIntent = new Intent(PrimaryActivity.this, FiveActivity.class);
                startActivity(fiveIntent);

            }
        });

        // six
        Button button6= (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sixIntent = new Intent(PrimaryActivity.this, SixActivity.class);
                startActivity(sixIntent);

            }
        });






    }//@Override protected void onCreate(Bundle savedInstanceState) {
}//public class PrimaryActivity extends AppCompatActivity {
