package com.maherulhoque.googleadmobexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class FullAdsActivity extends AppCompatActivity {

    private InterstitialAd fullAds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_ads);

        MobileAds.initialize(this,"ca-app-pub-3940256099942544/1033173712");

        fullAds=new InterstitialAd(this);
        fullAds.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        AdRequest adRequest=new AdRequest.Builder().build();

        fullAds.loadAd(adRequest);

        fullAds.setAdListener(new AdListener()
          {
              public void onAdLoaded()
              {
                  if (fullAds.isLoaded())
                  {
                      fullAds.show();
                  }
              }
          }
        );


    }
}
