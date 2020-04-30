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

        LatLng spbuumm = new LatLng(-7.9207847, 112.5950897);
        mapAPI.addMarker(new MarkerOptions().position(spbuumm).title("SPBU Universitas Muhammadiyah Malang")
                .snippet("Jln. Raya Tlogomas No.245, Tlogomas, Kec.Lowokwaru, Kota Malang, Jawa Timur 65144"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(spbuumm));

        LatLng spbutlogomas = new LatLng(-7.9315333, 112.602911);
        mapAPI.addMarker(new MarkerOptions().position(spbutlogomas).title("SPBU Pertamina Tlogomas")
                .snippet("Jln. Raya Tlogomas, Tlogomas, Kec. Lowokwaru, Kota Malang, Jawa Timur 65144"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(spbutlogomas));

        LatLng spbusuhat = new LatLng(-7.9377336, 112.6273781);
        mapAPI.addMarker(new MarkerOptions().position(spbusuhat).title("SPBU Pertamina Soekarno Hatta")
                .snippet("Jln. Soekarno Hatta, Mojolangu, Kec. Lowokwaru, Kota Malang, Jawa Timur 65141"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(spbusuhat));

        LatLng spbusutami = new LatLng(-7.9571735, 112.6133609);
        mapAPI.addMarker(new MarkerOptions().position(spbusutami).title("Pertamina Gas Station Bendungan Sutami")
                .snippet("Jln. Bendungan Sutami No.5, Sumbersari, Kec. Lowokwaru, Kota Malang, Jawa Timur 65145"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(spbusutami));

        LatLng spbubandung = new LatLng(-7.9619443, 112.6240522);
        mapAPI.addMarker(new MarkerOptions().position(spbubandung).title("SPBU Pertamina Jln Bandung")
                .snippet("Jln. Bandung, Penanggungan, Kec. Klojen, Kota Malang, Jawa Timur 65113"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(spbubandung));

        LatLng spbuciliwung = new LatLng(-7.952121, 112.6394159);
        mapAPI.addMarker(new MarkerOptions().position(spbuciliwung).title("SPBU Pertamina Ciliwung")
                .snippet("Jln. Ciliwung, Purwantoro, Blimbing, Purwantoro, Malang, Kota Malang, jawa Timur 65126"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(spbuciliwung));

        LatLng spbulangsep = new LatLng(-7.9831787, 112.6146054);
        mapAPI.addMarker(new MarkerOptions().position(spbulangsep).title("SPBU Pertamina Langsep")
                .snippet("Jln. Raya Langsep, Sukun, Kec. Klojen, Kota Malang, Jawa Timur 65146"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(spbulangsep));

        LatLng kasin = new LatLng(-7.952121, 112.6394159);
        mapAPI.addMarker(new MarkerOptions().position(kasin).title("SPBU Pertamina Kasin")
                .snippet("Jln. Sulawesi, Kasin, Klojen, Kasin, Kec. Klojen, Kota Malang, Jawa Timur 65117"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(kasin));

        LatLng spbutrunojoyo = new LatLng(-7.952121, 112.6394159);
        mapAPI.addMarker(new MarkerOptions().position(spbutrunojoyo).title("SPBU PER")
                .snippet("Jln. Ciliwung, Purwantoro, Blimbing, Purwantoro, Malang, Kota Malang, jawa Timur 65126"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(spbutrunojoyo));

    }
}

