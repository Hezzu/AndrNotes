package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText textfield = findViewById(R.id.textField);
        ListView listView = findViewById(R.id.List);
        Button button = findViewById(R.id.button);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.content_main, list);
        list.add("Zakupy: chleb, masło, ser");
        list.add("Do zrobienia: obiad, umyć podłogi");
        list.add("weekend: kino, spacer z psem");

        listView.setAdapter(adapter);
        button.setOnClickListener(v -> {
            String item = textfield.getText().toString();
            if (!item.isEmpty()){
                list.add(item);
                adapter.notifyDataSetChanged();
            }
        });
    }


}