package com.express.remindme.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.express.remindme.R;
import com.express.remindme.model.ReminderModel;
import com.express.remindme.views.ReminderCardHolder;

import java.util.List;

/**
 * Created by Aabhas on 27/9/17.
 */

public class ReminderListAdapter extends BaseAdapter {

    Context mContext;
    private LayoutInflater mInflater = null;

    List<ReminderModel> reminderList = null;

    public ReminderListAdapter(Context context) {
        mContext = context;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return reminderList.size();
    }

    @Override
    public Object getItem(int position) {
        return reminderList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = mInflater.inflate(R.layout.snippet_reminder_card, parent, false);
            TextView titlebox = (TextView)convertView.findViewById(R.id.titlebox);
            TextView date = (TextView)convertView.findViewById(R.id.date);
            TextView time = (TextView)convertView.findViewById(R.id.time);
            TextView contact = (TextView)convertView.findViewById(R.id.contact);

            ReminderCardHolder rmHolder = new ReminderCardHolder(titlebox, date, time, contact);
            convertView.setTag(rmHolder);
        }

        final ReminderCardHolder rmHolder = (ReminderCardHolder) convertView.getTag();
        rmHolder.mTitle.setText(reminderList.get(position).getTitle());
        rmHolder.mDate.setText(reminderList.get(position).getDate().toString());
        rmHolder.mTime.setText(reminderList.get(position).getTime().toString());
        rmHolder.mMeetinglist.setText("Meeting With : " + reminderList.get(position).getContactList());

        return convertView;
    }



}
