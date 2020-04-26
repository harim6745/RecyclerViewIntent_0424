package com.example.recyclerviewintent;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
/*
    TextView resulttextview;
    ImageView healthimgview;
    Bitmap bitmap;*/

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


/*
        Intent intent = getIntent();
        String product = intent.getStringExtra("RESULT");
        resulttextview.setText(product); */


        String prod_img = "";


        Bundle extras = getIntent().getExtras();
        prod_img = extras.getString("prod_img");

        TextView textView = (TextView) findViewById(R.id.textView_result);


        String str = prod_img /*+ '\n' + english + '\n' + korean */ ;
        textView.setText(str);

    }
}