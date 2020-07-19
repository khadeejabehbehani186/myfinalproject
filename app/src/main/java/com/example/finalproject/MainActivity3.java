package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ArrayList<deafdumb> hg = new ArrayList<>();
        deafdumb d1 = new deafdumb("Arabic",R.drawable.arabic10m,R.drawable.arabic09,"5");
        deafdumb d2 = new deafdumb("English",R.drawable.englishletters,R.drawable.english123,"5");
        deafdumb d3 = new deafdumb("Numbers",R.drawable.engnumber,R.drawable.numbers98,"5");
        deafdumb d4 = new deafdumb("Most used words",R.drawable.logo67,R.drawable.most98,"5");

        hg.add(d1);
        hg.add(d2);
        hg.add(d3);
        hg.add(d4);

        RecyclerView vf = findViewById(R.id.R1);

        vf.setHasFixedSize(true);
        RecyclerView.LayoutManager na = new LinearLayoutManager(this);
        vf.setLayoutManager(na);





        MyAdapter adapter = new MyAdapter(hg,this);
        vf.setAdapter(adapter);
    }
}