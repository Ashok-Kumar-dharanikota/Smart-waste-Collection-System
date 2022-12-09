package com.example.smartwastagesystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import ss.com.bannerslider.banners.Banner;
import ss.com.bannerslider.banners.DrawableBanner;
import ss.com.bannerslider.views.BannerSlider;


import java.util.ArrayList;
import java.util.List;

public class Dashboard_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);



        BannerSlider bannerSlider =  findViewById(R.id.banner_slider1);
        List<Banner> banners=new ArrayList<>();
        //add banner using image url
        /// banners.add(new RemoteBanner("Put banner image url here ..."));
        //add banner using resource drawable
        banners.add(new DrawableBanner(R.drawable.slider_1));
        banners.add(new DrawableBanner(R.drawable.slider_2));
        banners.add(new DrawableBanner(R.drawable.slider_3));
        banners.add(new DrawableBanner(R.drawable.slider_4));
        banners.add(new DrawableBanner(R.drawable.slider_8));
        banners.add(new DrawableBanner(R.drawable.slider_9));
        bannerSlider.setBanners(banners);



    }
    public void collection(View view) {
        Intent i=new Intent(Dashboard_Activity.this,mcollection.class);
        startActivity(i);
    }

    public void report(View view) {
        Intent i=new Intent(Dashboard_Activity.this,mreport.class);
        startActivity(i);
    }

    public void record(View view) {
        Intent i=new Intent(Dashboard_Activity.this,mrecord.class);
        startActivity(i);
    }

    public void alert(View view) {

        Intent i=new Intent(Dashboard_Activity.this,malert.class);
        startActivity(i);


    }

    public void contact(View view) {
        Intent i=new Intent(Dashboard_Activity.this,Contact.class);
        startActivity(i);
    }

    public void profile(View view) {
        Intent i=new Intent(Dashboard_Activity.this,Account.class);
        startActivity(i);
    }

    public void howto(View view) {
        Intent i=new Intent(Dashboard_Activity.this,howto.class);
        startActivity(i);
    }

    public void about(View view) {
        Intent i=new Intent(Dashboard_Activity.this,About.class);
        startActivity(i);
    }

}

