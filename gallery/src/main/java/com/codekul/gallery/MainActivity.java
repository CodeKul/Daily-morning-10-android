package com.codekul.gallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCar(View view) {
        ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.ic_buses);
    }

    public void onPlane(View view) {

        ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.ic_airplanemode_active_black_24dp);
    }

    public void onBike(View view) {
        ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.ic_cycle);
    }
}
