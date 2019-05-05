package com.u3175374.assignment2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.StreetViewPanoramaFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public class StreetViewActivity extends AppCompatActivity implements OnStreetViewPanoramaReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_street_view);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        StreetViewPanoramaFragment streetViewPanoramaFragment =
                (StreetViewPanoramaFragment) getFragmentManager()
                        .findFragmentById(R.id.streetviewpanorama);
        streetViewPanoramaFragment.getStreetViewPanoramaAsync(this);

    }
    @Override
    public void onStreetViewPanoramaReady(StreetViewPanorama panorama) {
        LatLng location = getIntent().getParcelableExtra("location");

        final float ZOOM_BY = 0.0f;
        long duration = 10000;
        float tilt = 0;
        final int PAN_BY = -179;

        StreetViewPanoramaCamera camera = new StreetViewPanoramaCamera.Builder()
                .zoom(panorama.getPanoramaCamera().zoom + ZOOM_BY)
                .bearing(panorama.getPanoramaCamera().bearing - PAN_BY)
                .tilt(tilt)
                .build();

        panorama.animateTo(camera, duration);
        panorama.setPosition(location);
    }


}
