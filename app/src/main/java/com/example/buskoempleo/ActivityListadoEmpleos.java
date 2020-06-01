package com.example.buskoempleo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityListadoEmpleos extends AppCompatActivity {

    private ImageButton botonBusqueda, botonBusquedaMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_empleos);

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

    public void AbrirActivityBusqueda(){
        Intent intent = new Intent(this, ActivityBusqueda.class);
        startActivity(intent);
    }

    public void AbrirActivityBusquedaMaps(){
        Intent intent = new Intent(this, ActivityBusquedaMaps.class);
        startActivity(intent);
    }
}