package com.express.remindme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.express.remindme.R;
import com.express.remindme.widget.ReminderListAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by root on 27/9/17.
 */

public class ReminderCardList extends RelativeLayout{

    Context mContext;
    ReminderListAdapter mReminderListAdapter;

    @Bind(R.id.reminder_list)
    ListView reminderList;

    public ReminderCardList(Context context) {
        this(context, null);
    }

    public ReminderCardList(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        // Initialise the View
        initView();
    }

    private void initView() {
        inflate(mContext, R.layout.snippet_reminder_card_list, this);
        ButterKnife.bind(this);

        mReminderListAdapter = new ReminderListAdapter(mContext);
        reminderList.setAdapter(mReminderListAdapter);
    }

}
