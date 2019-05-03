package com.u3175374.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{
    GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.normal_render) {
            googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            return true;
        }
        if (id == R.id.satellite_render) {
            googleMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;

        LatLng UC = new LatLng(-35.2384551,149.0844455);
        LatLng CentralLocation = new LatLng(-35.238887, 149.084593);
        LatLng Library = new LatLng(-35.23803, 149.083405);
        LatLng UCCooperLodge = new LatLng(-35.238849, 149.082214);
        LatLng StudentResourceCenter = new LatLng(-35.236428, 149.084288);
        LatLng TheHub = new LatLng(-35.23844,149.08452);
        LatLng UCGYM = new LatLng(-35.238318, 149.088285);
        LatLng StreetViewTop = new LatLng(-35.233653, 149.087192);
        LatLng StreetViewBottom = new LatLng(-35.238516, 149.089560);

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(UC, 13));

        // Flat markers will rotate when the map is rotated,
        // and change perspective when the map is tilted.
        //------------------------------------------------------------------------------------------
        final Marker ucMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_uc))
                .position(UC)
                .flat(true)
                .rotation(245)
                .title("University of Canberra")
                .snippet("Bruce Campus")
        );

        final Marker CentralLocationMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_uc))
                .position(CentralLocation)
                .flat(true)
                .rotation(245)
                .title("Central Location")
                .snippet("University of Canberra")
        );

        final Marker LibraryMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_uc))
                .position(Library)
                .flat(true)
                .rotation(245)
                .title("Library")
                .snippet("University of Canberra")
        );

        final Marker UCCooperLodgeMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_uc))
                .position(UCCooperLodge)
                .flat(true)
                .rotation(245)
                .title("Student Resource Center")
                .snippet("University of Canberra")
        );

        final Marker StudentResourceCenterMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_uc))
                .position(StudentResourceCenter)
                .flat(true)
                .rotation(245)
                .title("Student Resource Center")
                .snippet("University of Canberra")
        );

        final Marker TheHubMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_uc))
                .position(TheHub)
                .flat(true)
                .rotation(245)
                .title("The Hub")
                .snippet("University of Canberra")
        );

        final Marker UCGymMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_uc))
                .position(UCGYM)
                .flat(true)
                .rotation(245)
                .title("UC GYM")
                .snippet("University of Canberra")
        );

        final Marker StreetViewTopMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_uc))
                .position(StreetViewTop)
                .flat(true)
                .rotation(245)
                .title("Street View Top")
                .snippet("University of Canberra")
        );

        final Marker StreetViewBottomMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_uc))
                .position(StreetViewBottom)
                .flat(true)
                .rotation(245)
                .title("Street View Bottom")
                .snippet("University of Canberra")
        );

        //------------------------------------------------------------------------------------------
        CameraPosition cameraPosition = CameraPosition.builder()
                .target(UC)
                .zoom(15)
                .bearing(90)
                .build();

        // Animate the change in camera view over 2 seconds
        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition),
                2000, null);

        googleMap.addPolyline(new PolylineOptions().geodesic(true)
                .add(new LatLng(-35.230926, 149.080354))
                .add(new LatLng(-35.234634, 149.091888))
                .add(new LatLng(-35.242096, 149.090257))
                .add(new LatLng(-35.2429721, 149.0736905))
                .add(new LatLng(-35.230926, 149.080354))
        );

        Polygon polygon1 = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .fillColor(0x303434F8)      // Hex code for blue
                .add(
                        new LatLng(-35.230926, 149.080354),
                        new LatLng(-35.234634, 149.091888),
                        new LatLng(-35.242096, 149.090257),
                        new LatLng(-35.2429721, 149.0736905),
                        new LatLng(-35.230926, 149.080354)));
        //------------------------------------------------------------------------------------------

        googleMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
            @Override
            public View getInfoWindow(Marker marker) {
                return null;
            }

            @Override
            public View getInfoContents(Marker marker) {
                View infoWindow = getLayoutInflater().inflate(R.layout.infowindow_with_image, null);
                TextView title = (TextView) infoWindow.findViewById(R.id.textViewTitle);
                TextView snippet = (TextView) infoWindow.findViewById(R.id.textViewSnippet);
                ImageView image = (ImageView) infoWindow.findViewById(R.id.imageView);


                if (marker.getId().equals(ucMarker.getId())) {
                    title.setText(marker.getTitle());
                    snippet.setText(marker.getSnippet());
                    image.setImageDrawable(getResources()
                            .getDrawable(R.mipmap.ic_uc, getTheme()));
                }


                return infoWindow;
            }
        });

        googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });

    }

}
