package com.example.teatime;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class HomeFragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
    }


    // Create and return the view for the fragment
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home,container, false);

        // Find the button or view that triggers the next activity
        View nextActivityButton = view.findViewById(R.id.btnOpen);
        View nextActivityButton1= view.findViewById(R.id.btnOpen1);
        // Set click listener for the button or view
        nextActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the first next activity
                Intent intent = new Intent(getActivity(), ProductActivity.class);

                // Add any extra data to the intent if needed
                // intent.putExtra("key", "value");

                // Start the first next activity
                startActivity(intent);
            }
        });

        nextActivityButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the second next activity
                Intent intent = new Intent(getActivity(), ProductActivity1.class);

                // Add any extra data to the intent if needed
                // intent.putExtra("key", "value");

                // Start the second next activity
                startActivity(intent);
            }
        });

        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        // Access views in the fragment's layout
        TextView textView = view.findViewById(R.id.textview4);

    }

}