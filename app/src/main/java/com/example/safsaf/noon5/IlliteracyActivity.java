package com.example.safsaf.noon5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class IlliteracyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words=new ArrayList<Word>();

        words.add(new Word("محمد مصطفى محسب", "طيار "));
        words.add(new Word("محمد مصطفى محسب", "طيار "));
        words.add(new Word("محمد مصطفى محسب", "طيار "));
        words.add(new Word("محمد مصطفى محسب", "طيار "));
        words.add(new Word("محمد مصطفى محسب", "طيار "));
        words.add(new Word("محمد مصطفى محسب", "طيار "));
        words.add(new Word("محمد مصطفى محسب", "طيار "));
        words.add(new Word("محمد مصطفى محسب", "طيار "));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);





    }
}
