package com.example.morningtea.ui.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.morningtea.R;
import com.example.morningtea.webActivity;

public class ToolsFragment extends Fragment {


Activity activity;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
activity=getActivity();
        View root = inflater.inflate(R.layout.fragment_tools, container, false);


        return root;
    }

    @Override
    public void onStart() {
        super.onStart();

        CardView espn,ndtv,zeenews,crickbuzz;

        espn=activity.findViewById(R.id.espn);
        ndtv=activity.findViewById((R.id.ndtv));
        zeenews=activity.findViewById(R.id.zeenews);
        crickbuzz=activity.findViewById(R.id.crickbuzz);

        espn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.espn.in/cricket/scores");
                startActivity(intent);
            }
        });
        ndtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://sports.ndtv.com/");
                startActivity(intent);
            }
        });
        zeenews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://zeenews.india.com/sports");
                startActivity(intent);
            }
        });
        crickbuzz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.cricbuzz.com/");
                startActivity(intent);
            }
        });


    }
}