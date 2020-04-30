package com.example.Modul5;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.SearchView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mapAPI;
    SupportMapFragment mapFragment;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapAPI);

        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mapAPI = googleMap;

        LatLng bjbr = new LatLng(-7.733791, 113.222244);
        mapAPI.addMarker(new MarkerOptions().position(bjbr).title("BEE JAY BAKAU RESORT PROBOLINGGO")
                .snippet("Pelabuhan PPP Mayangan, Wisata Primadona, Mangunharjo, Mayangan, Mangunharjo, Kec. Mayangan, Kota Probolinggo, Jawa Timur 67217"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(bjbr));



    }
}

