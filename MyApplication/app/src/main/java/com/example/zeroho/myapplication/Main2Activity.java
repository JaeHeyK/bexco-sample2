package com.example.zeroho.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView);

        int index = this.getIntent().getIntExtra("index", 0);

        textView.setText(getResources().getStringArray(R.array.arr)[index]);
        imageView.setImageResource(getResources().getIdentifier("p" + Integer.toString(index + 1), "drawable", getPackageName()));
    }


}
