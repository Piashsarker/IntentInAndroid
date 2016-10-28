package com.ptlearnpoint.intentinandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String text = getIntent().getExtras().getString(Intent.EXTRA_TEXT);

        Toast.makeText(SecondActivity.this, text, Toast.LENGTH_SHORT).show();

    }
}
