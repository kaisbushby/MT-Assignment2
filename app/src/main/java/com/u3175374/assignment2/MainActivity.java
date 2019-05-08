package com.u3175374.assignment2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{
    GoogleMap googleMap;
    String url;
    float xAxis, yAxis;

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

        final LatLng UC = new LatLng(-35.2384551,149.0844455);
        final LatLng CentralLocation = new LatLng(-35.238887, 149.084593);
        final LatLng Library = new LatLng(-35.23803, 149.083405);
        final LatLng UCCooperLodge = new LatLng(-35.238849, 149.082214);
        final LatLng StudentResourceCenter = new LatLng(-35.236428, 149.084288);
        final LatLng TheHub = new LatLng(-35.23844,149.08452);
        final LatLng UCGYM = new LatLng(-35.238318, 149.088285);
        final LatLng UCHealthHub = new LatLng(-35.234695, 149.087681);
        final LatLng MizzunaCafe = new LatLng(-35.238095, 149.084082);
        final LatLng StreetViewTop = new LatLng(-35.233653, 149.087192);
        final LatLng StreetViewBottom = new LatLng(-35.238516, 149.089560);

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(UC, 13));

        // Flat markers will rotate when the map is rotated,
        // and change perspective when the map is tilted.
        //------------------------------------------------------------------------------------------

        final Marker CentralLocationMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromBitmap(resizeBitmap(R.mipmap.ic_uc)))
                .position(CentralLocation)
                .flat(true)
                .title("Central Location")
                .snippet("University of Canberra")
        );

        final Marker LibraryMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromBitmap(resizeBitmap(R.mipmap.ico_library)))
                .position(Library)
                .flat(true)
                .title("Library")
                .snippet("University of Canberra")
        );

        final Marker UCCooperLodgeMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromBitmap(resizeBitmap(R.mipmap.ico_lodge)))
                .position(UCCooperLodge)
                .flat(true)
                .title("Student Resource Center")
                .snippet("University of Canberra")
        );

        final Marker StudentResourceCenterMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromBitmap(resizeBitmap(R.mipmap.ico_src)))
                .position(StudentResourceCenter)
                .flat(true)
                .title("Student Resource Center")
                .snippet("University of Canberra")
        );

        final Marker TheHubMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromBitmap(resizeBitmap(R.mipmap.ico_hub)))
                .position(TheHub)
                .flat(true)
                .title("The Hub")
                .snippet("University of Canberra")
        );

        final Marker UCGymMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromBitmap(resizeBitmap(R.mipmap.ico_gym)))
                .position(UCGYM)
                .flat(true)
                .title("UC GYM")
                .snippet("University of Canberra")
        );

        final Marker UCHealthHubMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromBitmap(resizeBitmap(R.mipmap.ico_health)))
                .position(UCHealthHub)
                .flat(true)
                .title("Health Hub")
                .snippet("University of Canberra")
        );

        final Marker MizzunaCafeMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromBitmap(resizeBitmap(R.mipmap.ico_cafe)))
                .position(MizzunaCafe)
                .flat(true)
                .title("Mizzuna Cafe")
                .snippet("University of Canberra")
        );

        final Marker StreetViewTopMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromBitmap(resizeBitmap(R.mipmap.ico_street)))
                .position(StreetViewTop)
                .flat(true)
                .title("Street View Top")
                .snippet("University of Canberra")
        );

        final Marker StreetViewBottomMarker = googleMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromBitmap(resizeBitmap(R.mipmap.ico_street)))
                .position(StreetViewBottom)
                .flat(true)
                .title("Street View Bottom")
                .snippet("University of Canberra")
        );




        //------------------------------------------------------------------------------------------
        CameraPosition cameraPosition = CameraPosition.builder()
                .target(UC)
                .zoom(15)
                //.bearing(90)
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

        googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .fillColor(0x303434F8)      // Hex code for blue
                .add(
                        new LatLng(-35.230926, 149.080354),
                        new LatLng(-35.231548, 149.083648),
                        new LatLng(-35.233546, 149.087446),
                        new LatLng(-35.234633, 149.091984),
                        new LatLng(-35.239133, 149.090353),
                        new LatLng(-35.240877, 149.090171),
                        new LatLng(-35.242009, 149.090324),
                        new LatLng(-35.242403, 149.088200),
                        new LatLng(-35.242398, 149.077731),
                        new LatLng(-35.242007, 149.076155),
                        new LatLng(-35.240833, 149.074887),
                        new LatLng(-35.237919, 149.076921),
                        new LatLng(-35.233934, 149.078564),
                        new LatLng(-35.232576, 149.079583),
                        new LatLng(-35.230926, 149.080354)
                ));
        //------------------------------------------------------------------------------------------

        googleMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
            @Override
            public View getInfoWindow(Marker marker) {
                return null;
            }

            @Override
            public View getInfoContents(Marker marker) {
                View infoWindow = getLayoutInflater().inflate(R.layout.infowindow_with_image, null);
                TextView title = infoWindow.findViewById(R.id.textViewTitle);
                TextView snippet = infoWindow.findViewById(R.id.textViewSnippet);
                ImageView image = infoWindow.findViewById(R.id.imageView);

                // Sets Info Window information and the URL for Window Viewer
                title.setText(marker.getTitle());
                snippet.setText(marker.getSnippet());
                if (marker.getId().equals(CentralLocationMarker.getId())) {
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.ic_uc, getTheme()));
                    url = "http://www.canberra.edu.au/";
                } else if(marker.getId().equals(LibraryMarker.getId())){
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.ico_library, getTheme()));
                    url = "http://www.canberra.edu.au/library";
                } else if(marker.getId().equals(UCCooperLodgeMarker.getId())){
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.ico_lodge, getTheme()));
                    url = "http://www.unilodge.com.au/unilodge-uc-lodge-cooper-lodge/";
                } else if(marker.getId().equals(StudentResourceCenterMarker.getId())){
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.ico_src, getTheme()));
                    url = "http://www.canberra.edu.au/current-students/canberra-students/student-centre/";
                } else if(marker.getId().equals(TheHubMarker.getId())){
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.ico_hub, getTheme()));
                    url = "http://www.canberra.edu.au/maps/buildings-directory/the-hub/";
                } else if(marker.getId().equals(UCGymMarker.getId())) {
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.ico_gym, getTheme()));
                    url = "http://www.ucunion.com.au/gym/";
                }else if(marker.getId().equals(UCHealthHubMarker.getId())) {
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.ico_health, getTheme()));
                    url = "https://www.canberra.edu.au/on-campus/campus-development/precincts-and-projects/health-precinct/health-hub";
                } else if(marker.getId().equals(MizzunaCafeMarker.getId())) {
                image.setImageDrawable(getResources().getDrawable(R.mipmap.ico_cafe, getTheme()));
                url = "http://www.ucunion.com.au/gym/";
                } else
                    image.setImageDrawable(getResources().getDrawable(R.mipmap.ico_street, getTheme()));

                return infoWindow;
            }
        });

        googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                // Makes Toast of corresponding title if tapped
                Toast.makeText(getApplicationContext(), marker.getTitle(), Toast.LENGTH_LONG).show();

                // If street View maker is tapped show street view
                if(marker.getId().equals(StreetViewTopMarker.getId()) || marker.getId().equals(StreetViewBottomMarker.getId()) ){
                    Intent intent = new Intent(MainActivity.this, StreetViewActivity.class);
                    intent.putExtra("location", marker.getPosition());
                    startActivity(intent);

                }else {
                    Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                    intent.putExtra("url", url);
                    startActivity(intent);
                }
            }
        });

    }
    public Bitmap resizeBitmap(int drawableName){
        Bitmap imageBitmap = BitmapFactory.decodeResource(getResources(),drawableName);
        return Bitmap.createScaledBitmap(imageBitmap, 96, 96, false);
    }

}
