package com.example.morningtea.ui.slideshow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.morningtea.R;
import com.example.morningtea.webActivity;

public class SlideshowFragment extends Fragment {

Activity activity;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
activity=getActivity();


        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);



        return root;

    }

    @Override
    public void onStart() {
        super.onStart();

        CardView toi,bbc,indianexp,hollywoodlife,hollywoodreporter;

        toi=activity.findViewById(R.id.timesofindiahollywood);
        bbc=activity.findViewById(R.id.bbc);
        indianexp=activity.findViewById(R.id.indianexpresshollywood);
        hollywoodlife=activity.findViewById(R.id.hollywoodlife);
        hollywoodreporter=activity.findViewById(R.id.hollywoodreporter);


        toi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://timesofindia.indiatimes.com/entertainment/english/hollywood/news");
                startActivity(intent);
            }
        });
        bbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.bbc.com/news/topics/cx3xv05k4ydt/hollywood");
                startActivity(intent);
            }
        });
        indianexp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://indianexpress.com/section/entertainment/hollywood/");
                startActivity(intent);
            }
        });
        hollywoodlife.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://hollywoodlife.com/");
                startActivity(intent);
            }
        });
        hollywoodreporter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.hollywoodreporter.com/");
                startActivity(intent);
            }
        });


    }
}