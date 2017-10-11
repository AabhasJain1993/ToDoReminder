package com.express.remindme.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;

import com.express.remindme.R;
import com.express.remindme.views.ReminderCardList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by root on 27/9/17.
 */

public class ReminderActivity extends AppCompatActivity {

    @Bind(R.id.floatingBtn)
    FloatingActionButton floatingActionButton;

    @Bind(R.id.reminderlist)
    ReminderCardList reminderCardList;

    @OnClick(R.id.floatingBtn)
    void addReminder(){
        //reminderCardList.addreminder()

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        ButterKnife.bind(this);
    }



}
