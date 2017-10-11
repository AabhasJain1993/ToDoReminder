package com.express.remindme.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.express.remindme.R;

import butterknife.ButterKnife;

/**
 * Created by root on 25/9/17.
 */

public class LogInActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logIn);
        ButterKnife.bind(this);
    }


}
