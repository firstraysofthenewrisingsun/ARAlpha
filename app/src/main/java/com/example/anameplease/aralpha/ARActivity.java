package com.example.anameplease.aralpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ARTesting.ARTest.UnityPlayerActivity;

public class ARActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar);

        Intent intent = new Intent(this, UnityPlayerActivity.class);
        startActivity(intent);
    }
}
