package com.express.remindme.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.express.remindme.R;

import java.util.HashMap;
import java.util.logging.Logger;

/**
 * Created by root on 27/9/17.
 */

public class ContactListAdapter extends BaseAdapter {

    private HashMap<String, String> mStringHashMap;
    private Context mContext;
    private ContactObserver mContactObserver = null;
    private LayoutInflater mInflater = null;

    private class ContactObserver extends ContentObserver {

        public ContactObserver(Handler handler){
            super(handler);
        }

        @Override
        public void onChange(boolean selfChange){
            this.onChange(selfChange, null);
        }

        @Override
        public void onChange(boolean selfChange, Uri uri){
            getAllContactList();
        }
    }

    public ContactListAdapter(Context context) {
        mContext = context;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mContactObserver = new ContactObserver(new Handler());
        mContext.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, mContactObserver);

    }
    @Override
    public int getCount() {
        return (mStringHashMap == null)? 0 : mStringHashMap.size();
    }

    @Override
    public Object getItem(int position) {
        return  mStringHashMap.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
           // convertView = mInflater.inflate(R.layout.snippet_album_grid_item, parent, false);

        }

        return null;
    }

    private void getAllContactList() {
        Cursor phones = mContext.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null,null,null, null);
        while (phones.moveToNext())
        {
            String name=phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
            String phoneNumber = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));

            if(mStringHashMap.get(name) == null) {
                mStringHashMap.put(name, phoneNumber);
            }
        }

        phones.close();

    }

    private void clear() {
        mContext.getContentResolver().unregisterContentObserver(mContactObserver);
        mContactObserver = null;
    }

}
