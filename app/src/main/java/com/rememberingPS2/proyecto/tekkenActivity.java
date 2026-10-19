package com.rememberingPS2.proyecto;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class tekkenActivity extends AppCompatActivity {
    ConstraintLayout vistaTekken;
    Spinner spinnerSeleccionPersonaje;
    ArrayList<String> listaPersonajes = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tekken);
        vistaTekken = findViewById(R.id.tekkenLayout);
        crearListaPersojajes(listaPersonajes);
        spinnerSeleccionPersonaje = findViewById(R.id.spinnerSeleccion);
        adaptadorSpinnerSeleccionPersonaje adaptador = new adaptadorSpinnerSeleccionPersonaje(this, android.R.layout.simple_spinner_item,listaPersonajes);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSeleccionPersonaje.setAdapter(adaptador);
        spinnerSeleccionPersonaje.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //el parametro position nos da la posicion del spinner seleccionada, y la podemos usar para coger un elemento de la lista
                //ya que coincidirán en posición
                String seleccion = listaPersonajes.get(position);
                if (seleccion.equals("Hwoarang")){
                    vistaTekken.setBackgroundResource(R.drawable.hwoarang);
                }else if (seleccion.equals("Jin Kazama")){
                    vistaTekken.setBackgroundResource(R.drawable.jin_kazama);
                } else {
                    vistaTekken.setBackgroundResource(R.drawable.fondo_pantalla_tekken);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void crearListaPersojajes(ArrayList<String> lista){
        lista.addAll(List.of("Selecciona tu personaje","Jin Kazama", "Hwoarang"));
    }

}