package com.example.googlecodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {


    private TextView mOrderTextView=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        mOrderTextView=(TextView)findViewById(R.id.show_order);
        mOrderTextView.setText(getIntent().getStringExtra(MainActivity.ORDER_KEY));
    }
}
