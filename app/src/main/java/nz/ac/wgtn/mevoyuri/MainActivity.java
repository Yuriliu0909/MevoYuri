package nz.ac.wgtn.mevoyuri;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.mapbox.maps.MapView;
import com.mapbox.maps.Style;


public class MainActivity extends AppCompatActivity {
    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapView = findViewById(R.id.mapView);
        mapView.getMapboxMap().loadStyleUri(Style.MAPBOX_STREETS);
    }


    protected void onStart() {
        super.onStart();
        mapView.onStart();
    }

    public void onStop() {
        super.onStop();
        mapView.onStop();
    }

    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    public void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

}