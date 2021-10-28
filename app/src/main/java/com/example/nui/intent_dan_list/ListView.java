package com.example.nui.intent_dan_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class ListView extends AppCompatActivity {

    private android.widget.ListView lvItem;
    private String[] namanegara = new String[]{
            "Indonesia","Malaysia","Singapore" ,
            "Italia", "Inggris", "Belanda",
            "Argentina","Chile",
            "Mesir", "Uganda"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        getSupportActionBar().setTitle("ListView Sederhana"); //tampil judul

        lvItem = (android.widget.ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (ListView.this, android.R.layout.simple_list_item_1, android.R.id.text1, namanegara);

        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListView.this, "Memilih : "+namanegara[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}