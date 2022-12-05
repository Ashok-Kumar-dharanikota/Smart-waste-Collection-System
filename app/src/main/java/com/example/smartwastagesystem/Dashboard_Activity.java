package com.example.smartwastagesystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;
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

//        CircleImageView collection_button = (CircleImageView) findViewById(R.id.collection_profile_image);
//        CircleImageView report_button = (CircleImageView) findViewById(R.id.Report_profile_Image);
//        CircleImageView analytics_button = (CircleImageView) findViewById(R.id.record_image_profile);
//        CircleImageView alerts_button = (CircleImageView) findViewById(R.id.alert_profile_image);
//        CircleImageView contact_button = (CircleImageView) findViewById(R.id.contact_profile_picture);
//        CircleImageView profile_button = (CircleImageView) findViewById(R.id.profile_picture);
//
//        collection_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent d=new Intent(Dashboard_Activity.this,mcollection.class);
//                startActivity(d);
//            }
//        });
//
//        report_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent d=new Intent(Dashboard_Activity.this,mreport.class);
//                startActivity(d);
//            }
//        });
//
//        analytics_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent d=new Intent(Dashboard_Activity.this,mreport.class);
//                startActivity(d);
//            }
//        });
//
//        alerts_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent d=new Intent(Dashboard_Activity.this,mreport.class);
//                startActivity(d);
//            }
//        });
//
//        contact_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent d=new Intent(Dashboard_Activity.this,mreport.class);
//                startActivity(d);
//            }
//        });
//
//        profile_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent d=new Intent(Dashboard_Activity.this,mreport.class);
//                startActivity(d);
//            }
//        });
//


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

//    public void howto(View view) {
//        Intent i=new Intent(HomeScreen.this,howto.class);
//        startActivity(i);
//    }

//    public void about(View view) {
//        Intent i=new Intent(Dashboard_Activity.this,About.class);
//        startActivity(i);
//    }

}

