package com.example.morningtea.ui.gallery;

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


public class GalleryFragment extends Fragment {   //Bollywood

    Activity context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        context = getActivity();
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        return root;
    }


    @Override
    public void onStart() {
        super.onStart();

        CardView bollywoodlife, bollywoodhungama, filmfare;
        CardView sakshi, tollywoodnet, toitollywood;


        bollywoodlife = context.findViewById(R.id.bollywoodlife);
        bollywoodhungama = context.findViewById(R.id.hungama);
        filmfare = context.findViewById(R.id.filmfare);

        sakshi = context.findViewById(R.id.sakshitollywood);
        tollywoodnet = context.findViewById(R.id.tollywoodnet);
        toitollywood = context.findViewById(R.id.timesofindiatollywood);


        bollywoodlife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.bollywoodlife.com/");
                startActivity(intent);
            }
        });
        bollywoodhungama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.bollywoodhungama.com/bollywood/");
                startActivity(intent);
            }
        });
        filmfare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.filmfare.com/news/bollywood");
                startActivity(intent);
            }
        });

        sakshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.sakshi.com/tollywood");
                startActivity(intent);
            }
        });
        tollywoodnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.tollywood.net/news/");
                startActivity(intent);
            }
        });
        toitollywood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://timesofindia.indiatimes.com/entertainment/telugu/movies/news");
                startActivity(intent);
            }
        });

    }
}