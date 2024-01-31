package com.example.teatime;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter extends ArrayAdapter<String> {
    public Adapter(Context context, List<String> data) {
        super(context, R.layout.activity_product1, data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_product1, parent, false);
        }

        // Get the data item for this position
        String item = getItem(position);

        // Lookup view for data population
        TextView textView = convertView.findViewById(R.id.textview7);

        // Populate the data into the template view using the data object
        textView.setText(item);

        // Return the completed view to render on screen
        return convertView;
    }
}

