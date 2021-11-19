package com.example.lecture12_13_listviews;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> friendList=new ArrayList<>();
        friendList.add("Abbas");
        friendList.add("ALi");
        friendList.add("Haidar");
        friendList.add("Fatima");
        friendList.add("Sami");
        ListView lv= findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,friendList);
        lv.setAdapter(arrayAdapter);

        Button btn = findViewById(R.id.addBtn);
        EditText et= findViewById(R.id.simpleEditText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                friendList.add(et.getText().toString());
                arrayAdapter.notifyDataSetChanged();
            }
        });

    }
}