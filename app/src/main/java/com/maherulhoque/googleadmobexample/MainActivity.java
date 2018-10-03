package com.maherulhoque.googleadmobexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    private AdView adView;
    Button btnFullAds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this,"ca-app-pub-3940256099942544/6300978111");

        adView=(AdView)findViewById(R.id.publisherAdView);
        AdRequest adRequest=new AdRequest.Builder().build();

        adView.loadAd(adRequest);

        btnFullAds=findViewById(R.id.btn_fullAds);
        btnFullAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FullAdsActivity.class);
                startActivity(intent);
            }
        });
    }
}
