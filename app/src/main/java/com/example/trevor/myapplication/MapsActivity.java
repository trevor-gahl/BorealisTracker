package com.example.trevor.myapplication;

import android.graphics.Color;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import java.sql.*;
import java.util.ArrayList;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.*;
import com.google.android.gms.maps.model.*;
public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        ArrayList<LatLng> route = new ArrayList<LatLng>();
        route.add(new LatLng(45.66984, -111.04866));
        route.add(new LatLng(45.66981, -111.04881));
        route.add(new LatLng(45.66975, -111.04894));
        route.add(new LatLng(45.66966, -111.04903));
        route.add(new LatLng(45.66955, -111.04906));
        route.add(new LatLng(45.66935, -111.04906));
        route.add(new LatLng(45.66851, -111.04906));
        route.add(new LatLng(45.66849, -111.04922));
        route.add(new LatLng(45.66843, -111.04932));
        route.add(new LatLng(45.66835, -111.04936));
        route.add(new LatLng(45.66827, -111.04934));
        route.add(new LatLng(45.66817, -111.04924));
        route.add(new LatLng(45.66815, -111.04906));
        route.add(new LatLng(45.66815, -111.04889));
        route.add(new LatLng(45.66822, -111.04875));
        route.add(new LatLng(45.66833, -111.04872));
        route.add(new LatLng(45.66845, -111.04866));
        route.add(new LatLng(45.66832, -111.04857));
        route.add(new LatLng(45.66822, -111.04856));
        route.add(new LatLng(45.66815, -111.04847));
        route.add(new LatLng(45.66812, -111.04829));
        route.add(new LatLng(45.66814, -111.04811));
        route.add(new LatLng(45.66819, -111.04795));
        route.add(new LatLng(45.66832, -111.04789));
        route.add(new LatLng(45.66843, -111.04795));
        route.add(new LatLng(45.66853, -111.0481));
        route.add(new LatLng(45.66854, -111.04826));
        route.add(new LatLng(45.66936, -111.04829));
        route.add(new LatLng(45.66954, -111.04829));
        route.add(new LatLng(45.66964, -111.04834));
        route.add(new LatLng(45.66974, -111.04842));
        route.add(new LatLng(45.6698, -111.04854));
        route.add(new LatLng(45.66984, -111.04866));

        Polyline line = mMap.addPolyline(new PolylineOptions()
                .addAll(route)
                .width(10)
                .color(Color.BLACK));

        // Add a marker in Sydney and move the camera
        LatLng jabs = new LatLng(45.66905, -111.04871);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jabs, 18));
    }
    public void transitionMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
