package com.express.remindme.model;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 * Created by root on 27/9/17.
 */

public class ReminderModel {

    private int id;
    private String mTitle;
    private String mDescription;
    private Date mDate;
    private Time mTime;
    private List<String> mContactList;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public void setTime(Time time) {
        mTime = time;
    }

    public void setContactList(List<String> contactList) {
        mContactList = contactList;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public Date getDate() {
        return mDate;
    }

    public Time getTime() {
        return mTime;
    }

    public List<String> getContactList() {
        return mContactList;
    }

}
