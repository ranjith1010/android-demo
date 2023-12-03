package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RequestListViewAdapter implements ListAdapter {
    Context context;
    ArrayList<User> users;
    public RequestListViewAdapter(Context context, ArrayList<User> users) {
        this.context=context;
        this.users=users;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    public View getView(int position, View view, ViewGroup parent) {
        User user=users.get(position);
        if(view==null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            view=layoutInflater.inflate(R.layout.mylist, null);
            view.setClickable(false);

            TextView name=view.findViewById(R.id.name);
            Button donate=view.findViewById(R.id.donate);
            ImageView call=view.findViewById(R.id.call);
            donate.setOnClickListener(v -> {
                Toast.makeText(context,"Donatee",Toast.LENGTH_LONG).show();
            });
            call.setOnClickListener(v -> {
                Toast.makeText(context,"Call",Toast.LENGTH_LONG).show();
            });
            name.setText(user.getName());
        }
        return view;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        return users.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    ;

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return true;
    }
}
