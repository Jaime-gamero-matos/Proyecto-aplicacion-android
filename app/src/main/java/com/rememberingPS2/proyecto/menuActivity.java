package com.rememberingPS2.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class menuActivity extends AppCompatActivity {
    ImageView botonBudokaiTenkaichi3;
    ImageView botonSanAndreas;
    ImageView botonSimpsons;
    ImageView botonFifa;
    ImageView botonTekken;
    ImageView botonNFE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        botonFifa = findViewById(R.id.btnFifaStreet);
        botonNFE = findViewById(R.id.btnNeedForSpeed);
        botonTekken = findViewById(R.id.btnTekken);
        botonSanAndreas = findViewById(R.id.btnSanAndreas);
        botonSimpsons = findViewById(R.id.btnSimpson);
        botonBudokaiTenkaichi3 = findViewById(R.id.btnBudokai);

        botonFifa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambioPantallaAFifa = new Intent(menuActivity.this, fifaStreetActivity.class);
                startActivity(cambioPantallaAFifa);
            }
        });
        botonSimpsons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast seleccionasteLosSimpson = Toast.makeText(getApplicationContext(), "Seleccionaste Los simpson", Toast.LENGTH_SHORT);
                seleccionasteLosSimpson.show();
                Intent cambioPantallaASimpsons = new Intent(menuActivity.this, simpsonsActivity.class);
                startActivity(cambioPantallaASimpsons);
            }
        });

        botonNFE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambioPantallaANFE = new Intent(menuActivity.this, needForSpeedActivity.class);
                startActivity(cambioPantallaANFE);
            }
        });
        botonTekken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambioPantallaATekken = new Intent(menuActivity.this, tekkenActivity.class);
                startActivity(cambioPantallaATekken);
            }
        });
        botonBudokaiTenkaichi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambioPantallaABudokaiTenkaichi = new Intent(menuActivity.this, budokaiTenkaichiActivity.class);
                startActivity(cambioPantallaABudokaiTenkaichi);
            }
        });
        botonSanAndreas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambioPantallaASanAndreas = new Intent(menuActivity.this, sanAndreasActivity.class);
                startActivity(cambioPantallaASanAndreas);
            }
        });
    }
}