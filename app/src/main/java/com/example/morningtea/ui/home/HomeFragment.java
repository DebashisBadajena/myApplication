package com.example.morningtea.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.morningtea.R;
import com.example.morningtea.webActivity;

public class HomeFragment extends Fragment {


    Activity context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        context=getActivity();

        View root = inflater.inflate(R.layout.fragment_home, container, false);


        return root;
    }

    @Override
    public void onStart() {
        super.onStart();

        ImageView sambada,dharitri,samaja,pragatibadi,samaya,premaya,vhaskar,dinalipi,anupambharat,odiapuo,odishatv;
        ImageView lokomatasamachar,prabhatkhabar,deshabandhu,jagarana,dainikabhaskar,amarujala,hindustan,nabhavharat,patrika,janasata;
        ImageView timesofindia,thehindu,hindustantime,indianexpress,pioneer,deccanherald,telegraph,dna,asianage,economictime,businessstandard,financialexpress;
        ImageView enadu,andrajyoti,andrabhoomi,sakshi,vaarat,namastetelangana,prajaashakti,surya,telugunew;
        ImageView anandbazarpatrika,aajkal,bartaman,sangabadpratidina,ganashakti,eisamaya;

        sambada = context.findViewById(R.id.sambad);
        dharitri = context.findViewById(R.id.dharitri);
        samaja = context.findViewById(R.id.samaj);
        pragatibadi = context.findViewById(R.id.pragatibadi);
        samaya = context.findViewById(R.id.samaya);
        premaya = context.findViewById(R.id.prameya);
        vhaskar = context.findViewById(R.id.bhaskar);
        dinalipi = context.findViewById(R.id.dinalipi);
        anupambharat = context.findViewById(R.id.anupambharat);
        odiapuo = context.findViewById(R.id.odiapuo);
        odishatv = context.findViewById(R.id.odishatv);

        jagarana = context.findViewById(R.id.jagaran);
        dainikabhaskar = context.findViewById(R.id.dainikaBhaskar);
        amarujala = context.findViewById(R.id.amarUjala);
        hindustan = context.findViewById(R.id.hindustan);
        nabhavharat = context.findViewById(R.id.navabharat);
        patrika = context.findViewById(R.id.patrika);
        janasata = context.findViewById(R.id.janasatta);
        lokomatasamachar = context.findViewById(R.id.lokomataSamachara);
        prabhatkhabar = context.findViewById(R.id.prabhataKhabar);
        deshabandhu = context.findViewById(R.id.desabandhu);

        timesofindia = context.findViewById(R.id.timesofindiatollywood);
        thehindu = context.findViewById(R.id.hindu);
        hindustantime = context.findViewById(R.id.hindustantime);
        indianexpress = context.findViewById(R.id.tollywoodnet);
        pioneer = context.findViewById(R.id.pioneer);
        deccanherald = context.findViewById(R.id.deccanherald);
        telegraph = context.findViewById(R.id.teligraph);
        dna = context.findViewById(R.id.dna);
        asianage = context.findViewById(R.id.asianAge);
        economictime = context.findViewById(R.id.economicTimes);
        businessstandard= context.findViewById(R.id.BusinessStandard);
        financialexpress = context.findViewById(R.id.financialExpress);

        enadu = context.findViewById(R.id.eenadu);
        andrajyoti = context.findViewById(R.id.andhraJyothi);
        sakshi = context.findViewById(R.id.sakshitollywood);
        andrabhoomi = context.findViewById(R.id.andhraBhoomi);
        vaarat = context.findViewById(R.id.vaaratha);
        namastetelangana = context.findViewById(R.id.namasteTelangana);
        prajaashakti = context.findViewById(R.id.prajashakti);
        surya = context.findViewById(R.id.surya);
        telugunew = context.findViewById(R.id.teluguNews18);

        anandbazarpatrika = context.findViewById(R.id.anandbazarPatrika);
        aajkal = context.findViewById(R.id.aajkal);
        bartaman = context.findViewById(R.id.bartaman);
        sangabadpratidina = context.findViewById(R.id.sangbadPratidin);
        ganashakti = context.findViewById(R.id.ganashakti);
        eisamaya = context.findViewById(R.id.eiSamaya);

        sambada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://sambad.in");
                startActivity(intent);
            }
        });
        dharitri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.dharitri.com");
                startActivity(intent);
            }
        });
        samaja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://thesamaja.in");
                startActivity(intent);
            }
        });
        pragatibadi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://pragativadi.com");
                startActivity(intent);
            }
        });
        samaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://odishasamaya.com");
                startActivity(intent);
            }
        });
        premaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.prameyanews.com");
                startActivity(intent);
            }
        });
        vhaskar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://odishabhaskar.com");
                startActivity(intent);
            }
        });
        dinalipi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.dinalipi.com");
                startActivity(intent);
            }
        });
        anupambharat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.anupambharatonline.com");
                startActivity(intent);
            }
        });
        odiapuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://odiapua.com");
                startActivity(intent);
            }
        });
        odishatv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://odishatv.in");
                startActivity(intent);
            }
        });

        jagarana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.jagran.com");
                startActivity(intent);
            }
        });
        dainikabhaskar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.bhaskar.com");
                startActivity(intent);
            }
        });
        amarujala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.amarujala.com");
                startActivity(intent);
            }
        });
        hindustan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.livehindustan.com");
                startActivity(intent);
            }
        });
        nabhavharat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://navbharattimes.indiatimes.com");
                startActivity(intent);
            }
        });
        patrika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.patrika.com");
                startActivity(intent);
            }
        });
        janasata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.jansatta.com");
                startActivity(intent);
            }
        });
        lokomatasamachar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://epaper.lokmat.com/lokmatsamachar");
                startActivity(intent);
            }
        });
        prabhatkhabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.prabhatkhabar.com");
                startActivity(intent);
            }
        });
        deshabandhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.deshbandhu.co.in");
                startActivity(intent);
            }
        });

        timesofindia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://timesofindia.indiatimes.com");
                startActivity(intent);
            }
        });
        thehindu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.thehindu.com");
                startActivity(intent);
            }
        });
        hindustantime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.hindustantimes.com");
                startActivity(intent);
            }
        });
        indianexpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://indianexpress.com");
                startActivity(intent);
            }
        });
        pioneer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.dailypioneer.com");
                startActivity(intent);
            }
        });
        deccanherald.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.deccanherald.com");
                startActivity(intent);
            }
        });
        telegraph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.telegraphindia.com");
                startActivity(intent);
            }
        });
        dna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.dnaindia.com");
                startActivity(intent);
            }
        });
        asianage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.asianage.com");
                startActivity(intent);
            }
        });
        economictime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.economictimes.indiatimes.com");
                startActivity(intent);
            }
        });
        businessstandard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.business-standard.com");
                startActivity(intent);
            }
        });
        financialexpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.financialexpress.com");
                startActivity(intent);
            }
        });

        enadu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.eenadu.net");
                startActivity(intent);
            }
        });
        andrajyoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.andhrajyothy.com");
                startActivity(intent);
            }
        });
        sakshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.sakshi.com");
                startActivity(intent);
            }
        });
        andrabhoomi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.andhrabhoomi.net");
                startActivity(intent);
            }
        });
        vaarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.vaartha.com");
                startActivity(intent);
            }
        });
        namastetelangana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.ntnews.com");
                startActivity(intent);
            }
        });
        prajaashakti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.prajasakti.com");
                startActivity(intent);
            }
        });
        surya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://telugu.suryaa.com/index.html");
                startActivity(intent);
            }
        });
        telugunew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://telugu.news18.com");
                startActivity(intent);
            }
        });

        anandbazarpatrika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.anandabazar.com");
                startActivity(intent);
            }
        });
        aajkal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.aajkaal.in");
                startActivity(intent);
            }
        });
        bartaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://bartamanpatrika.com/home");
                startActivity(intent);
            }
        });
        sangabadpratidina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://www.sangbadpratidin.in");
                startActivity(intent);
            }
        });
        ganashakti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://bangla.ganashakti.co.in");
                startActivity(intent);
            }
        });
        eisamaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webActivity.class);
                intent.putExtra("url", "https://eisamay.indiatimes.com");
                startActivity(intent);
            }
        });

    }

    }
