package com.example.googlemap;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.googlemap.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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

        // Add a marker in Silkwood and move the camera
        LatLng silkWood = new LatLng(
                -6.2249255314607925, 106.65083042571605);
        mMap.addMarker(new MarkerOptions().position(silkWood).title("Marker in Silkwood Residence"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(silkWood));

        // Add a marker in Paddington and move the camera
        LatLng paddington = new LatLng(
                -6.225357779583398, 106.64979970156404);
        mMap.addMarker(new MarkerOptions().position(paddington).title("Marker in Paddington"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(paddington));

        // Add a marker in Pacific Garden and move the camera
        LatLng pacificGarden = new LatLng(
                -6.22472317786628, 106.65197765527469);
        mMap.addMarker(new MarkerOptions().position(pacificGarden).title("Marker in Pacific Garden"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pacificGarden));
    }
}