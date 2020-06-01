package com.example.buskoempleo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botonIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonIngresar = findViewById(R.id.btnIngresar);
        botonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirActiviyListadoEmpleos();
            }
        });
    }

    public void AbrirActiviyListadoEmpleos(){
        Intent intent = new Intent(this, ActivityListadoEmpleos.class);
        startActivity(intent);
    }
}
