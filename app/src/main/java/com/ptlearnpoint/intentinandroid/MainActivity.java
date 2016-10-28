package com.ptlearnpoint.intentinandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSecondOnClick(View view) {

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        intent.putExtra(Intent.EXTRA_TEXT, "This was from Main Activity");

        startActivity(intent);
    }

    public void btnDialOnClick(View view) {
        String number = "01683193505";
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+number));
        MainActivity.this.startActivity(intent);

    }
}
