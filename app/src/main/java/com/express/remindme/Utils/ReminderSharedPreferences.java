package com.express.remindme.Utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by root on 28/9/17.
 */

public class ReminderSharedPreferences {

    private static final String SHARED_PREF = "ReminderSharedPreferences";
    private static ReminderSharedPreferences reminderSharedPreferences = new ReminderSharedPreferences();
    private final Object object = new Object();
    private SharedPreferences sharedPreferences;

    private ReminderSharedPreferences(){
    }

    public static void init(Context context){
        reminderSharedPreferences.sharedPreferences = context.getSharedPreferences(SHARED_PREF, context.MODE_PRIVATE);
    }
}
