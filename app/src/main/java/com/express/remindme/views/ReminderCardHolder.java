package com.express.remindme.views;


import android.widget.TextView;

/**
 * Created by root on 27/9/17.
 */

public class ReminderCardHolder {
    public TextView mTitle;
    public TextView mTime;
    public TextView mDate;
    public TextView mMeetinglist;

    public ReminderCardHolder(TextView title, TextView time, TextView date, TextView meetinglist) {
        mTitle = title;
        mTime = time;
        mDate = date;
        mMeetinglist = meetinglist;
    }
}
