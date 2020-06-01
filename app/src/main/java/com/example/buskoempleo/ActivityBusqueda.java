package com.example.buskoempleo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityBusqueda extends AppCompatActivity {

    private ImageButton botonEmpleos, botonBusqueda, botonBusquedaMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);

        botonEmpleos = findViewById(R.id.btnEmpleos);
        botonEmpleos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirActivityEmpleos();
            }
        });

        botonBusqueda = findViewById(R.id.btnBusqueda);
        botonBusqueda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirActivityBusqueda();
            }
        });

        botonBusquedaMaps = findViewById(R.id.btnBusquedaMaps);
        botonBusquedaMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirActivityBusquedaMaps();
            }
        });
    }

    public void AbrirActivityEmpleos(){
        Intent intent = new Intent(this, ActivityListadoEmpleos.class);
        startActivity(intent);
    }

    public void AbrirActivityBusqueda(){
        Intent intent = new Intent(this, ActivityBusqueda.class);
        startActivity(intent);
    }

    public void AbrirActivityBusquedaMaps(){
        Intent intent = new Intent(this, ActivityBusquedaMaps.class);
        startActivity(intent);
    }
}