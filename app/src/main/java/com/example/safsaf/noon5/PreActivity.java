package com.example.safsaf.noon5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre);
        // one
        Button button1= (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent oneIntent = new Intent(PreActivity.this, PreOneActivity.class);
                startActivity(oneIntent);

            }
        });

        // two
        Button button2= (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent twoIntent = new Intent(PreActivity.this, PreTwoActivity.class);
                startActivity(twoIntent);

            }
        });

        // one
        Button button3= (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent threeIntent = new Intent(PreActivity.this, PreThreeActivity.class);
                startActivity(threeIntent);

            }
        });



    }
}
