package com.example.u1ronaldordonezejercicio1tema5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnInfoWindowClickListener,GoogleMap.OnMapClickListener {

    GoogleMap mapa;
    Polygon polygon= null;
    List<LatLng> latLngList= new ArrayList<>();
    List<Marker> markerList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.mapa);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onInfoWindowClick(Marker marker) {

    }

    @Override
    public void onMapClick(LatLng latLng) {

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mapa = googleMap;
        mapa.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-18.007633, -70.239271), 14));

        mapa.addMarker(new MarkerOptions().position(new LatLng(-18.009603, -70.242777)).title("RECTORADO")
                .snippet("Rectorado de la UPT").icon(BitmapDescriptorFactory.fromResource(R.mipmap.marker)));
        PolygonOptions Rectorado = new PolygonOptions()
                .add(new LatLng(-18.009404, -70.243060),
                        new LatLng(-18.009683, -70.242783),
                        new LatLng(-18.009494, -70.242739),
                        new LatLng(-18.009288, -70.242929)
                );
        polygon = mapa.addPolygon(Rectorado);
        polygon.setFillColor(Color.BLUE);

        mapa.addMarker(new MarkerOptions().position(new LatLng(-18.004905, -70.235160)).title("POSGRADO UPT")
                .snippet("Postgrado de la UPT").icon(BitmapDescriptorFactory.fromResource(R.mipmap.marker)));
        PolygonOptions Postgrado = new PolygonOptions()
                .add(new LatLng(-18.005299, -70.235301),
                        new LatLng(-18.004978, -70.234833),
                        new LatLng(-18.004568, -70.235135),
                        new LatLng(-18.004808, -70.235541)
                    );
        polygon = mapa.addPolygon(Postgrado);
        polygon.setFillColor(Color.MAGENTA);

        mapa.addMarker(new MarkerOptions().position(new LatLng(-18.005680, -70.225905)).title("CAMPUS")
                .snippet("Campus Capanique").icon(BitmapDescriptorFactory.fromResource(R.mipmap.marker)));
        PolygonOptions Campus = new PolygonOptions()
                .add(new LatLng(-18.006130, -70.226645),
                        new LatLng(-18.006780, -70.227592),
                        new LatLng(-18.007327, -70.227198),
                        new LatLng(-18.006679, -70.226245),
                        new LatLng(-18.006917, -70.225914),
                        new LatLng(-18.006159, -70.224499),
                        new LatLng(-18.005202, -70.225275),
                        new LatLng(-18.006779, -70.227607)

                );
        polygon = mapa.addPolygon(Campus);
        polygon.setFillColor(Color.GREEN);

        mapa.addMarker(new MarkerOptions().position(new LatLng(-18.013489, -70.250145)).title("ADMISION")
                .snippet("Admision UPT").icon(BitmapDescriptorFactory.fromResource(R.mipmap.marker)));
        PolygonOptions Admision = new PolygonOptions()
                .add(new LatLng(-18.013376, -70.250052),
                        new LatLng(-18.013410, -70.250096),
                        new LatLng(-18.013464, -70.250051),
                        new LatLng(-18.013429, -70.250008)

                );
        polygon = mapa.addPolygon(Admision);
        polygon.setFillColor(Color.GREEN);


    }

    public void ir_rectorado(View view) {
    }

    public void ir_postgrado(View view) {
    }

    public void ir_campus(View view) {
    }

    public void ir_admision(View view) {
    }

    public void ver_todo(View view) {
    }
}
