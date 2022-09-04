package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            ls=findViewById(R.id._listview1);

            ArrayList<String> fruits=new ArrayList<String>();
            fruits.add("Apple");
            fruits.add("Mango");
            fruits.add("Pineapple");
            fruits.add("watermelon");
            fruits.add("grapes");
            fruits.add("banana");
            fruits.add("blueberry");
            fruits.add("blackberry");
            fruits.add("strawberry");
            fruits.add("pomegranate");
            fruits.add("muskmelon");
            fruits.add("dragon fruit");
            fruits.add("orange");
            fruits.add("tangerine");
            fruits.add("guava");
            fruits.add("cashew nut");

            ArrayAdapter<String> Ap=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,fruits);
            ls.setAdapter(Ap);

            ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(MainActivity.this, ((TextView)view).getText(), Toast.LENGTH_SHORT).show();
                }
            });
    }
}