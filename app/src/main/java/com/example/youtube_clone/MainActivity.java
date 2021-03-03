package com.example.youtube_clone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    private FragmentTransaction ft;

    public static  BottomNavigationView bottomNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        this.fragmentManager = this.getSupportFragmentManager();
        this.ft = this.fragmentManager.beginTransaction();
        ft.add(R.id.fragment_container, this.fragment7);
        this.bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        // mSensorManager =(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        // this.mSensorAccelerometer=this.mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        //this.mSensorMagnetometer=this.mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);

        /*songlist = new ArrayList<>();
        musicbrainzService mbs = new musicbrainzService();
        mbs.jsonParse();
        webServiceDataSong wsd = new webServiceDataSong();
        wsd.jsonParse();
        webServiceLagu wsa = new webServiceLagu();
        wsa.jsonParse();
        webServiceArtis wartis = new webServiceArtis();
        wartis.jsonParse();
        fetchData process = new fetchData();
        process.execute();*/

        ft.commit();
    }
}


    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {


                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            changePage(1);
                            break;
                        case R.id.nav_profile:
                            changePage(9);
                            break;
                        case R.id.nav_search:
                            changePage(10);
                            break;
                    }
                    return true;
                }
            };


    @Override
    public void changePage(int page) {
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        if (page == 1) {
            ft.replace(R.id.fragment_container, this.fragment1)
                    .addToBackStack(null);
        }
        if (page == 2) {
            ft.replace(R.id.fragment_container, this.fragment2)
                    .addToBackStack(null);
        }
        if (page == 3) {
            ft.replace(R.id.fragment_container, this.fragment22)
                    .addToBackStack(null);
        }
        if (page == 4) {
            ft.replace(R.id.fragment_container, this.fragment3)
                    .addToBackStack(null);
        }
        if (page == 5) {
            ft.replace(R.id.fragment_container, this.fragment4)
                    .addToBackStack(null);
        }
        if (page == 6) {
            ft.replace(R.id.fragment_container, this.fragment5)
                    .addToBackStack(null);
        }
        if (page == 7) {
            ft.replace(R.id.fragment_container, this.fragment6)
                    .addToBackStack(null);
        }
        if (page == 8) {

            ft.replace(R.id.fragment_container, this.fragment7)
                    .addToBackStack(null);
        }
        if (page == 9) {
            ft.replace(R.id.fragment_container, this.fragment8)
                    .addToBackStack(null);
        }
        if (page == 10) {
            ft.replace(R.id.fragment_container, this.fragment9)
                    .addToBackStack(null);
        }
        if (page == 11) {
            ft.replace(R.id.fragment_container, this.fragment10)
                    .addToBackStack(null);
        }
        if (page == 12) {
            ft.replace(R.id.fragment_container, this.fragment11)
                    .addToBackStack(null);
        }
        if (page == 13) {
            ft.replace(R.id.fragment_container, this.fragment12)
                    .addToBackStack(null);
        }
        if (page == 14) {
            ft.replace(R.id.fragment_container, this.fragment13)
                    .addToBackStack(null);
        }
        if (page == 15) {
            ft.replace(R.id.fragment_container, this.fragment14)
                    .addToBackStack(null);
        }
        if (page == 16) {
            ft.replace(R.id.fragment_container, this.fragment15)
                    .addToBackStack(null);
        }

        ft.commit();

    }