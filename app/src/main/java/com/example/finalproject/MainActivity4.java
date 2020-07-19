package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        Bundle b = getIntent().getExtras();
        deafdumb c =(deafdumb) b.getSerializable("oo");

        Button z = findViewById(R.id.button5);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(MainActivity4.this,Ratings.class);
                startActivity(z);
            }
        });

        ImageView imsge1 = findViewById(R.id.IV);
        TextView g = findViewById(R.id.TV);
//        TextView h = findViewById(R.id.textView2);

        imsge1.setImageResource(c.getImsge1());
        g.setText(c.getName()+"");
//        h.setText(c.getRatings()+"");

    }
}