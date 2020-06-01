package com.example.buskoempleo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityBusquedaMaps extends AppCompatActivity {

    private ImageButton botonEmpleos, botonBusqueda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda_maps);

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
    }

    public void AbrirActivityEmpleos(){
        Intent intent = new Intent(this, ActivityListadoEmpleos.class);
        startActivity(intent);
    }

    public void AbrirActivityBusqueda(){
        Intent intent = new Intent(this, ActivityBusqueda.class);
        startActivity(intent);
    }
}